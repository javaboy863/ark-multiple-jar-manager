package com.ark.jar.manager.sdk.exception.meituan;

/**
 * @Description:美团sdk内置class
 * 
 */
public class ApiOpException extends Exception {

	/**
	 * @Description:
	 * 
	 */
	private int code;

	/**
	 * @Description:
	 * 
	 */
	private String msg;

	/**
	 * @Description:
	 * 
	 */
	public ApiOpException(Throwable cause) {
		super(cause);
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public ApiOpException(String msg) {
		this.msg = msg;
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public ApiOpException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * @Description:构造函数
	 * 
	 */
	public ApiOpException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "ApiOpException{code=" + this.code + ", msg='" + this.msg + '\'' + '}';
	}
}
