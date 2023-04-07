package com.ark.jar.manager.sdk.proxy;

import com.ark.jar.manager.sdk.classloader.ClassLoaderManager;
import com.ark.jar.manager.sdk.classloader.SdkClassLoader;
import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import com.ark.jar.manager.sdk.exception.SdkException;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @Description:
 *
 */
@Service
@Slf4j
public class SdkInvokeProxy<T> implements MethodInterceptor {

	/**
	 * @Description:
	 *
	 */
	private Map<T,T> objMap = new ConcurrentHashMap<>();


	/**
	 * @Description:拿到代理类实例
	 *
	 */
	public T getInstall(T object) {
		T result = null;
		try {
			result = objMap.computeIfAbsent(object, o -> (T) Enhancer.create(object.getClass(), this));
		}catch (Throwable e){
			log.error(e.getMessage(),e);
			throw new SdkException("get proxy instance error...");
		}
		return result;
	}


	/**
	 * @Description:对第三方sdk操作的时候，要切换classloader，操作完毕在还原classloader。
	 * 约定从第一个参数里取对应的sdk classloader
	 *
	 */
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		ClassLoader sourceClassLoader = Thread.currentThread().getContextClassLoader();
		Object sdkEnum = args[0];
		if (sdkEnum == null){
			throw new SdkException("no sdk info parm...");
		}
		ClassLoaderEnum classLoaderEnum = (ClassLoaderEnum) sdkEnum;
		SdkClassLoader sdkClassLoader = ClassLoaderManager.getSdkClassLoaderMap().get(classLoaderEnum);
		if (sdkClassLoader == null){
				throw new SdkException("can't find SdkClassLoader...");
		}
		Thread.currentThread().setContextClassLoader(sdkClassLoader.getClass().getClassLoader());
		Object result = methodProxy.invokeSuper(object, args);
		Thread.currentThread().setContextClassLoader(sourceClassLoader);
		return result;
	}

}
