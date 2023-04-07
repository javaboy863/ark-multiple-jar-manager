package com.ark.jar.manager.sdk.util;

import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import com.ark.jar.manager.sdk.config.SdkClassMappingEnum;
import com.ark.jar.manager.sdk.config.SdkConstant;
import com.ark.jar.manager.sdk.exception.SdkException;
import com.ark.jar.manager.sdk.proxy.SdkInvoke;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 *
 */
@Component
@Slf4j
public class BeanConvertUtil {

	/**
	 * @Description:
	 *
	 */
	@Resource
	private SdkInvoke sdkInvoke;

	/**
	 * @Description:bean 2 map
	 *
	 */
	public  Map<String,Object> objectToMap(Object thisObj) {
		Map<String,Object> map = new HashMap<>(16);
		Method[] m = thisObj.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			String method = m[i].getName();
			if (method.startsWith("get") && !method.contains("getClass")) {
				try {
					Object value = m[i].invoke(thisObj);
					if (value != null) {
						String key = method.substring(3);
						key = key.substring(0, 1).toLowerCase() + key.substring(1);
						map.put(key, value);
					}
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					continue;
				}
			}
		}
		return map;
	}

	/**
	 * @Description:map 2 bean
	 *
	 */
	public Object mapToObject(ClassLoaderEnum classLoaderEnum, Object object,boolean isLocalClass) {
		String className = object.getClass().getSimpleName();
		SdkClassMappingEnum sdkClassMappingEnum = SdkClassMappingEnum.findBySdkClassOrLocalClass(className);
		if (sdkClassMappingEnum ==null){
			throw new SdkException("can not find sdk class name:"+className);
		}
		Map<String, Object> map = this.objectToMap(object);
		Class<?> clazz = null;
		Object instance =null;
		try {
			if (isLocalClass){
				clazz = Class.forName(sdkClassMappingEnum.getLocalClassFullName());
			}else {
				clazz = sdkInvoke.loadAndNewInstance(classLoaderEnum, sdkClassMappingEnum.getSdkClass());
			}
			instance = clazz.newInstance();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new SdkException("can not find  class name...");
		}
		if (map != null && map.size() > 0) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				String propertyName = entry.getKey();
				Object value = entry.getValue();
				String setMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
				Field field = getClassField(clazz, propertyName);
				if (field == null) {
					continue;
				}
				Object convertedVal = convertValType(value, field, classLoaderEnum,isLocalClass);
				Method method =null;
				try {
					method = clazz.getMethod(setMethodName, field.getType());
					method.invoke(instance, convertedVal);
				} catch (Exception e) {
					log.error("method:{}",method, e);
					continue;
				}
			}
		}
		return instance;
	}

	/**
	 * @Description:
	 *
	 */
	private Object convertValType(Object value, Field field, ClassLoaderEnum classLoaderEnum,boolean isLocalClass) {
		Object retVal = null;
		Class<?> fieldTypeClass = field.getType();
		String fieldTypeClassName = fieldTypeClass.getName();
		if (List.class.getName().equals(fieldTypeClassName)) {
			List objList = (List) value;
			List resultList = new ArrayList();
			for (Object o : objList) {
				resultList.add(mapToObject(classLoaderEnum, o,isLocalClass));
			}
			return resultList;
		} if (fieldTypeClassName.indexOf(SdkConstant.SDK_MEI_TUAN_PACKAGE_PREFIX) != -1
				|| fieldTypeClassName.indexOf(SdkConstant.LOCAL_MEI_TUAN_PACKAGE_PREFIX) != -1) {
			//普通的sdk对象
			retVal = mapToObject(classLoaderEnum, value,isLocalClass);
		} else if (Long.class.getName().equals(fieldTypeClassName) || long.class.getName().equals(fieldTypeClassName)) {
			retVal = Long.parseLong(value.toString());
		} else if (Integer.class.getName().equals(fieldTypeClassName) || int.class.getName().equals(fieldTypeClassName)) {
			retVal = Integer.parseInt(value.toString());
		} else if (Float.class.getName().equals(fieldTypeClassName) || float.class.getName().equals(fieldTypeClassName)) {
			retVal = Float.parseFloat(value.toString());
		} else if (Double.class.getName().equals(fieldTypeClassName) || double.class.getName().equals(fieldTypeClassName)) {
			retVal = Double.parseDouble(value.toString());
		} else if (Boolean.class.getName().equals(fieldTypeClassName) || boolean.class.getName().equals(fieldTypeClassName)) {
			retVal = Boolean.parseBoolean(value.toString());
		}else if (Short.class.getName().equals(fieldTypeClassName) || short.class.getName().equals(fieldTypeClassName)) {
			retVal = Short.parseShort(value.toString());
		} else if (Byte.class.getName().equals(fieldTypeClassName) || byte.class.getName().equals(fieldTypeClassName)) {
			retVal = Byte.parseByte(value.toString());
		} else {
			retVal = value;
		}
		return retVal;
	}

	/**
	 * @Description:
	 *
	 */
	private Field getClassField(Class<?> clazz, String fieldName) {
		if (Object.class.getName().equals(clazz.getName())) {
			return null;
		}
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			if (field.getName().equals(fieldName)) {
				return field;
			}
		}
		Class<?> superClass = clazz.getSuperclass();
		if (superClass != null) {
			return getClassField(superClass, fieldName);
		}
		return null;
	}
}
