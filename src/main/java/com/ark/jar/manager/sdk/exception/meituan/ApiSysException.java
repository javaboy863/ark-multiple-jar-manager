package com.ark.jar.manager.sdk.exception.meituan;



/**
 * @Description:美团sdk内置class
 *
 */
public class ApiSysException extends Exception {

	/**
	 * @Description:
	 *
	 */
	private ExceptionEnum exceptionEnum;


	/**
	 * @Description:构造函数
	 *
	 */
	public ApiSysException(ExceptionEnum exceptionEnum) {
		this.exceptionEnum = exceptionEnum;
	}


	public ExceptionEnum getExceptionEnum() {
		return this.exceptionEnum;
	}

	public void setExceptionEnum(ExceptionEnum exceptionEnum) {
		this.exceptionEnum = exceptionEnum;
	}

	public ApiSysException(String msg, Throwable t) {
		super(msg, t);
	}

	public ApiSysException(Throwable t) {
		super(t);
	}

	public ApiSysException(String msg) {
		super(msg);
	}

	public String toString() {
		return "ApiSysException [exceptionEnum=" + this.exceptionEnum + "] " + super.toString();
	}
}