package com.ark.jar.manager.sdk.dto.meituan;


import lombok.ToString;

import java.util.List;

/**
 * @Description:
 * 
 */
@ToString
public class RetailCatParam {
	/**
	 * @Description:
	 * 
	 */
	private String code;

	/**
	 * @Description:
	 * 
	 */
	private String name;

	/**
	 * @Description:
	 * 
	 */
	private String sequence;

	/**
	 * @Description:
	 * 
	 */
	private List<RetailCatParam> children;


	/**
	 * @Description:构造函数
	 * 
	 */
	public RetailCatParam() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public RetailCatParam setName(String name) {
		this.name = name;
		return this;
	}

	public String getSequence() {
		return this.sequence;
	}

	public RetailCatParam setSequence(String sequence) {
		this.sequence = sequence;
		return this;
	}

	public List<RetailCatParam> getChildren() {
		return this.children;
	}

	public RetailCatParam setChildren(List<RetailCatParam> children) {
		this.children = children;
		return this;
	}

}