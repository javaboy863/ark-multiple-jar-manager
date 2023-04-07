package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

import java.util.List;

/**
 * @Description:
 *
 */
@ToString
public class RetailSkuStockParam {
	/**
	 * @Description:
	 *
	 */
	private String app_food_code;
	private String app_spu_code;
	/**
	 * @Description:
	 *
	 */
	private List<skuStockParam> skus;

	/**
	 * @Description:构造函数
	 *
	 */
	public RetailSkuStockParam() {
	}


	public String getApp_food_code() {
		return this.app_food_code;
	}

	public RetailSkuStockParam setApp_food_code(String app_food_code) {
		this.app_food_code = app_food_code;
		return this;
	}
	public String getApp_spu_code() {
		return app_spu_code;
	}

	public void setApp_spu_code(String app_spu_code) {
		this.app_spu_code = app_spu_code;
	}

	public List<skuStockParam> getSkus() {
		return this.skus;
	}

	public RetailSkuStockParam setSkus(List<skuStockParam> skus) {
		this.skus = skus;
		return this;
	}
}
