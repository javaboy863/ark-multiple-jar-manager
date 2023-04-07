package com.ark.jar.manager.sdk.proxy;

import com.ark.jar.manager.sdk.classloader.ClassLoaderManager;
import com.ark.jar.manager.sdk.classloader.SdkClassLoader;
import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import com.ark.jar.manager.sdk.config.SdkClassMappingEnum;
import com.ark.jar.manager.sdk.exception.meituan.ApiOpException;
import com.ark.jar.manager.sdk.exception.meituan.ApiSysException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;


/**
 * @Description:约定所有方法的第一个入参是ClassLoaderEnum，便于拦截时识别是哪个sdk
 *
 */
@Slf4j
@Service
public class SdkInvoke {

	/**
	 * @Description:从classloader加载class并调用方法
	 *
	 */
	public Object loadAndInvokeMethod(ClassLoaderEnum classLoaderEnum, String className, String methodName) throws ApiSysException, ApiOpException {
		SdkClassLoader sdkClassLoader = ClassLoaderManager.getSdkClassLoaderMap().get(classLoaderEnum);
		if (sdkClassLoader == null) {
			return null;
		}
		try {
			Class<?> clazz = sdkClassLoader.loadClass(className);
			Method method = ReflectionUtils.findMethod(clazz, methodName);
			Object result = ReflectionUtils.invokeMethod(method, clazz);
			return result;
		} catch (UndeclaredThrowableException e) {
			throwBizException(e);
		}catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return null;
	}


	/**
	 * @Description:从classloader加载class并new instance
	 *
	 */
	public Class<?> loadAndNewInstance(ClassLoaderEnum classLoaderEnum, String className)  {
		SdkClassLoader sdkClassLoader = ClassLoaderManager.getSdkClassLoaderMap().get(classLoaderEnum);
		if (sdkClassLoader == null) {
			return null;
		}
		try {
			return sdkClassLoader.loadClass(className);
		}catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return null;
	}


	/**
	 * @Description:new一个对象实例
	 *
	 */
	public  Object newInstance(ClassLoaderEnum classLoaderEnum,String className,Class[] parameterTypes,Object[] args) {
		SdkClassLoader sdkClassLoader = ClassLoaderManager.getSdkClassLoaderMap().get(classLoaderEnum);
		if (sdkClassLoader == null) {
			return null;
		}
		try {
			Class<?> clazz = sdkClassLoader.loadClass(className);
			Object object = ReflectUtils.newInstance(clazz, parameterTypes, args);
			return object;
		}  catch (ClassNotFoundException e) {
			log.error(e.getMessage(),e);
		}
		return null;
	}


	/**
	 * @Description:查找方法
	 *
	 */
	public  Method findMethod(ClassLoaderEnum classLoaderEnum,Class clazz,String methodName,Class<?>... paramTypes) {
		return ReflectionUtils.findMethod(clazz, methodName,paramTypes);
	}


	/**
	 * @Description:调用方法
	 *
	 */
	public  Object invokeMethod(ClassLoaderEnum classLoaderEnum, Method method, Object target, Object... args) throws ApiOpException, ApiSysException {
		Object result = null;
		try {
			result = ReflectionUtils.invokeMethod(method, target, args);
		} catch (UndeclaredThrowableException e) {
			throwBizException(e);
		}
		return result;
	}

	/**
	 * @Description:
	 *
	 */
	private void throwBizException(UndeclaredThrowableException e)throws ApiOpException, ApiSysException{
		String className = e.getUndeclaredThrowable().getClass().getName();
		SdkClassMappingEnum sdkClassMappingEnum = SdkClassMappingEnum.findBySdkClassOrLocalClass(className);
		if (sdkClassMappingEnum != null) {
			switch (sdkClassMappingEnum) {
				case API_OP_EXCEPTION:
					ApiOpException apiOpException = new ApiOpException(e.getCause());
					BeanUtils.copyProperties(e.getUndeclaredThrowable(), apiOpException);
					throw apiOpException;
				case API_SYS_EXCEPTION:
					ApiSysException apiSysException = new ApiSysException(e.getCause());
					BeanUtils.copyProperties(e.getUndeclaredThrowable(), apiSysException);
					throw apiSysException;
			}
		}
	}
}
