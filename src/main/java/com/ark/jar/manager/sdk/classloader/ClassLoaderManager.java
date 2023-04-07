package com.ark.jar.manager.sdk.classloader;

import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:类加载Manager
 * 
 */
@Component
public class ClassLoaderManager {

	/**
	 * @Description:
	 * 
	 */
	public static  Map<ClassLoaderEnum, SdkClassLoader> SDK_CLASS_LOADER_MAP = new ConcurrentHashMap<>(5);


	/**
	 * @Description:启动时把第三方sdk加载到对应的classloader
	 * 
	 */
	@PostConstruct
	public void init(){
		for (ClassLoaderEnum classLoaderEnum : ClassLoaderEnum.values()) {
			SdkClassLoader sdkClassLoader = new SdkClassLoader(classLoaderEnum,new URL[0]);
			if (sdkClassLoader.isLoadJar){
				SDK_CLASS_LOADER_MAP.put(classLoaderEnum,sdkClassLoader);
			}
		}
	}

	/**
	 * @Description:
	 * 
	 * @return
	 */
	public static Map<ClassLoaderEnum, SdkClassLoader> getSdkClassLoaderMap(){
		return SDK_CLASS_LOADER_MAP;
	}






}
