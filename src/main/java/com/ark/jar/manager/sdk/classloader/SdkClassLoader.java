package com.ark.jar.manager.sdk.classloader;

import com.ark.jar.manager.sdk.config.ClassLoaderEnum;
import com.ark.jar.manager.sdk.exception.SdkException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;


/**
 * @Description:自定义classloader加载第三方sdk的jar
 * jar在resource下的lib下
 *
 */
@Slf4j
public class SdkClassLoader extends URLClassLoader {

	/**
	 * @Description:以.jar结尾
	 *
	 */
	public static final String JAR_SUFFIX = ".jar";

	/**
	 * @Description:
	 *
	 */
	public static final String URL_PROTOCOL = "file";

	/**
	 * @Description:
	 *
	 */
	public static final String BASE_SDK_LIB_PATH = "lib";

	/**
	 * @Description:
	 *
	 */
	public static final String BASE_JAR_IN_LOCAL_PATH = System.getProperty("user.home")+File.separator+"lib"+File.separator;

	/**
	 * @Description:
	 *
	 */
	public boolean isLoadJar = false;

	/**
	 * @Description:构造函数
	 *
	 * @param classLoaderEnum
	 * @param urls
	 */
	public SdkClassLoader(ClassLoaderEnum classLoaderEnum,URL[] urls) {
		super(new URL[] {}, null);
		loadResource(classLoaderEnum);
	}

	/**
	 * @Description:加载class
	 *
	 * @param name
	 * @return
	 * @throws ClassNotFoundException
	 */
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return super.loadClass(name);
	}

	/**
	 * @Description: 查找class
	 *
	 * @param name
	 * @return
	 * @throws ClassNotFoundException
	 */
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			return super.findClass(name);
		} catch(ClassNotFoundException e) {
			return SdkClassLoader.class.getClassLoader().loadClass(name);
		}
	}

	/**
	 * @Description:加载资源
	 *
	 * @param classLoaderEnum
	 */
	private void loadResource(ClassLoaderEnum classLoaderEnum) {
		try {

			for (String jarName : classLoaderEnum.getJarNames()) {
				String path = BASE_SDK_LIB_PATH+ File.separator+classLoaderEnum.getDirName()+File.separator+jarName;
				ClassPathResource classPathResource = new ClassPathResource(path);
				InputStream inputStream = classPathResource.getInputStream();
				File destFileDir = new File(BASE_JAR_IN_LOCAL_PATH+classLoaderEnum.getDirName());
				if (!destFileDir.exists()){
					destFileDir.mkdirs();
				}
				String destPath = destFileDir.getPath()+File.separator+jarName;
				File destFile = new File(destPath);
				FileUtils.copyInputStreamToFile(inputStream,destFile);
				log.info("load jar {}",destFile.getPath());
				if (!destFile.exists()){
					throw new SdkException("can't find jar file.");
				}
				this.addURL(destFile);
			}
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new SdkException("load jar file error.");
		}
	}

	/**
	 * @Description:添加url
	 *
	 * @param file
	 */
	private void addURL(File file) {
		try {
			super.addURL(new URL(URL_PROTOCOL, null, file.getCanonicalPath()));
			if (!isLoadJar){
				isLoadJar = true;
			}
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new SdkException("load jar error...");
		}
	}
}
