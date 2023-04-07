package com.ark.jar.manager.sdk.util;

import com.ark.jar.manager.meituan.constant.MeituanStoreConfig;
import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import com.ark.jar.manager.sdk.config.SdkConstant;
import com.ark.jar.manager.sdk.dto.meituan.SystemParam;
import com.ark.jar.manager.sdk.exception.SdkException;
import com.ark.jar.manager.sdk.exception.meituan.ApiOpException;
import com.ark.jar.manager.sdk.exception.meituan.ApiSysException;
import com.ark.jar.manager.sdk.proxy.SdkInvoke;
import com.ark.jar.manager.sdk.proxy.SdkInvokeProxy;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description:
 * 
 */
@Component
@Slf4j
public class MeiTuanSdkUtils<T> {

	/**
	 * @Description:
	 * 
	 */
	private  ClassLoaderEnum meiTuanClassloaderEnum = ClassLoaderEnum.MEI_TUAN;

	/**
	 * @Description:
	 * 
	 */
	@Resource
	private SdkInvokeProxy<SdkInvoke> cglibProxy;

	/**
	 * @Description:
	 * 
	 */
	@Resource
	private SdkInvoke sdkInvoke;

	/**
	 * @Description:
	 * 
	 */
	@Resource
	private BeanConvertUtil beanConvertUtil;


	/**
	 * @Description:查找api factory里的方法并调用
	 * 
	 * @param appCode
	 * @param runTimeParms
	 * @param methodName
	 * @param className
	 * @return
	 * @throws ApiOpException
	 * @throws ApiSysException
	 */
	public  Object findApiFactoryMethodAndInvoce(String appCode,Object[] runTimeParms, String methodName, String className) throws ApiOpException, ApiSysException {
		Object systemParamInstance = getSystemParamInstance(appCode);
		return this.findApiFactoryMethodAndInvoce(null,runTimeParms,methodName,className,systemParamInstance );
	}

	/**
	 * @Description:
	 * 
	 * @param appCode
	 * @param methodParmsTypes
	 * @param runTimeParms
	 * @param methodName
	 * @param className
	 * @return
	 * @throws ApiOpException
	 * @throws ApiSysException
	 */
	public  Object findApiFactoryMethodAndInvoce(String appCode,Class[] methodParmsTypes,Object[] runTimeParms, String methodName, String className) throws ApiOpException, ApiSysException {
		Object systemParamInstance = getSystemParamInstance(appCode);
		return this.findApiFactoryMethodAndInvoce(methodParmsTypes,runTimeParms,methodName,className,systemParamInstance );
	}


	/**
	 * @Description:查找api factory里的方法并调用
	 * 
	 * @param methodParmsTypes
	 * @param runTimeParmsArr
	 * @param methodName
	 * @param className
	 * @param instanceObj
	 * @return
	 * @throws ApiOpException
	 * @throws ApiSysException
	 */
	public  Object findApiFactoryMethodAndInvoce( Class[] methodParmsTypes,Object[] runTimeParmsArr, String methodName, String className,Object instanceObj)throws ApiOpException, ApiSysException {
		Class[] findMethodArgsTypeArr = buildMethodArgsTypeArr(methodParmsTypes, runTimeParmsArr, instanceObj);
		SdkInvoke sdkInvokeProxy = getSdkInvokeProxy();
		runTimeParmsArr = ArrayUtils.insert(0, runTimeParmsArr, instanceObj);
		Object apiObject = getApiFactoryObject(sdkInvokeProxy,className);
		return findMethodAndInvoke(sdkInvokeProxy, findMethodArgsTypeArr, apiObject, methodName, runTimeParmsArr);
	}


	/**
	 * @Description:构建方法参数类型数组
	 * 
	 * @param methodParmsTypes
	 * @param runTimeParmsArr
	 * @param instanceObj
	 * @return
	 */
	private Class[] buildMethodArgsTypeArr(Class[] methodParmsTypes, Object[] runTimeParmsArr, Object instanceObj) {
		if (methodParmsTypes != null){
			return ArrayUtils.insert(0, methodParmsTypes, instanceObj.getClass());
		}
		Class[]	findMethodArgsTypeArr = new Class[runTimeParmsArr.length+1];
		for (int i = 0; i < runTimeParmsArr.length; i++) {
			findMethodArgsTypeArr[i+1]=runTimeParmsArr[i]==null?null:runTimeParmsArr[i].getClass();
		}
		findMethodArgsTypeArr[0]=instanceObj.getClass();
		return findMethodArgsTypeArr;
	}


	/**
	 * @Description:
	 * 
	 * @return
	 */
	private SdkInvoke getSdkInvokeProxy(){
		return cglibProxy.getInstall(sdkInvoke);
	}

	/**
	 * @Description:
	 * 
	 * @param sdkInvokeProxy
	 * @param method
	 * @return
	 * @throws ApiOpException
	 * @throws ApiSysException
	 */
	public  Object getApiFactoryObject(SdkInvoke sdkInvokeProxy, String method) throws ApiOpException, ApiSysException {
		return sdkInvokeProxy.loadAndInvokeMethod(meiTuanClassloaderEnum, SdkConstant.MEI_TUAN_CLASS_APIFACTORY, method);
	}


	/**
	 * @Description:获取sdk里的对象实例
	 * 
	 * @param object
	 * @return
	 */
	public Object getObjectInstanceInSdk(Object object){
		return  findObjectInstance(object,false);
	}

	/**
	 * @Description:
	 * 
	 * @param object
	 * @return
	 */
	public Object getObjectInstanceFromSdk(Object object){
		return  findObjectInstance(object,true);
	}

	/**
	 * @Description:
	 * 
	 * @param object
	 * @param isLocalClass
	 * @return
	 */
	private Object findObjectInstance(Object object,boolean isLocalClass){
		Object result = handleListObj(object,true);
		if (result != null){
			return result;
		}
		return  getObjectInstance(object,true);
	}

	/**
	 * @Description:
	 * 
	 * @param object
	 * @param isLocalClass
	 * @return
	 */
	private Object handleListObj(Object object,boolean isLocalClass ) {
		if (object instanceof List){
			List result = new ArrayList();
			List list = (List) object;
			for (Object obj : list) {
				Object objectInstance = getObjectInstance(obj,isLocalClass);
				result.add(objectInstance);
			}
			return result;
		}
		return null;
	}

	/**
	 * @Description:
	 * 
	 * @param object
	 * @param isLocalClass
	 * @return
	 */
	private Object getObjectInstance(Object object,boolean isLocalClass ){
		Object result = beanConvertUtil.mapToObject(meiTuanClassloaderEnum, object,isLocalClass);
		return result;
	}


	/**
	 * @Description:获取SystemParam实例,这个实例没有无参构造函数，特殊处理
	 * 
	 * @param appcode
	 * @return
	 */
	private Object getSystemParamInstance(String appcode){
		SystemParam systemParam = MeituanStoreConfig.systemParam.get(appcode);
		if (systemParam == null){
			throw new SdkException("can't find appcode...");
		}
		Class[] sysParmParameterTypes = {String.class,String.class};
		Object[] sysParmArgs = {systemParam.getAppId(),systemParam.getAppSecret()};
		Object sysParmInstanceObj = getSdkInvokeProxy().newInstance(meiTuanClassloaderEnum, SdkConstant.MEI_TUAN_CLASS_SYSTEM_PARAM,sysParmParameterTypes,sysParmArgs);
		return sysParmInstanceObj;
	}


	/**
	 * @Description:查找方法并调用
	 * 
	 * @param sdkInvokeProxy
	 * @param findMethodArgs
	 * @param targetObject
	 * @param findMethodName
	 * @param runTimeParms
	 * @return
	 * @throws ApiSysException
	 * @throws ApiOpException
	 */
	public  Object findMethodAndInvoke(SdkInvoke sdkInvokeProxy, Class[] findMethodArgs, Object targetObject, String findMethodName, Object[] runTimeParms) throws ApiSysException, ApiOpException {
		Method method = sdkInvokeProxy.findMethod(meiTuanClassloaderEnum,targetObject.getClass(), findMethodName,findMethodArgs);
		if (method == null){
			throw new SdkException("can not find method..."+findMethodName);
		}
		Object resultObj = sdkInvokeProxy.invokeMethod(meiTuanClassloaderEnum,method,targetObject,runTimeParms);
		return resultObj;
	}


}
