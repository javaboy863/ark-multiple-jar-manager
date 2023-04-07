package com.ark.jar.manager.sdk.config;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:classloader枚举，定义不同sdk依赖的jar
 * 
 */
public enum ClassLoaderEnum {

	/**
	 * @Description:美团需要加载的特殊包
	 * 
	 */
	MEI_TUAN("meiTuan","meituan", Arrays.asList("meituan-sdk-1.0.19.jar","fastjson-1.2.72.jar","httpclient-4.5.6.jar","httpcore-4.4.10.jar","httpmime-4.5.6.jar"));

	/**
	 * @Description:名称
	 * 
	 */
	private String name;

	/**
	 * @Description:文件夹名称
	 * 
	 */
	private String dirName;

	/**
	 * @Description:jar包名称
	 * 
	 */
	private List<String> jarNames;

	/**
	 * @Description:构造函数
	 * 
	 * @param name
	 * @param dirName
	 * @param jarNames
	 */
	ClassLoaderEnum(String name,String dirName, List<String> jarNames) {
		this.name=name;
		this.jarNames = jarNames;
		this.dirName=dirName;
	}

	public String getName() {
		return name;
	}
	public String getDirName() {
		return dirName;
	}

	public List<String> getJarNames() {
		return jarNames;
	}
}
