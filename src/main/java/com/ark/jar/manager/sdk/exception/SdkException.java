package com.ark.jar.manager.sdk.exception;


/**
 * @Description:Sdk相关操作异常类
 * 
 */
public class SdkException extends RuntimeException {
	private static final long serialVersionUID = -2451603465766424671L;

	/**
	 * @Description:构造函数
	 * 
	 */
	public SdkException() {
		super();
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public SdkException(String message) {
		super(message);
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public SdkException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public SdkException(Throwable cause) {
		super(cause);
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	protected SdkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


}
