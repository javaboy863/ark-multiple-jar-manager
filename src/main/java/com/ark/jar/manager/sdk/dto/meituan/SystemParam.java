package com.ark.jar.manager.sdk.dto.meituan;

/**
 * @Description:
 * 
 */
public class SystemParam {

	/**
	 * @Description:
	 * 
	 */
	private String appId;

	/**
	 * @Description:
	 * 
	 */
	private String appSecret;


	/**
	 * @Description:构造函数
	 * 
	 */
	public SystemParam(String appId, String appSecret) {
		this.appId = appId;
		this.appSecret = appSecret;
	}

	public String getAppId() {
		return this.appId;
	}

	public SystemParam setAppId(String appId) {
		this.appId = appId;
		return this;
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public SystemParam setAppSecret(String appSecret) {
		this.appSecret = appSecret;
		return this;
	}
	@Override
	public String toString() {
		return "SystemParam [appId='" + this.appId + '\'' + ", appSecret='" + this.appSecret + '\'' + ']';
	}

}