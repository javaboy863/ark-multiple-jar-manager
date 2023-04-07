package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

/**
 * @Description:
 * 
 */
@ToString
public class skuStockParam {

	/**
	 * @Description:
	 * 
	 */
	private String sku_id;

	/**
	 * @Description:
	 * 
	 */
	private String stock;

	public skuStockParam() {
	}

	public String getSku_id() {
		return this.sku_id;
	}

	public skuStockParam setSku_id(String sku_id) {
		this.sku_id = sku_id;
		return this;
	}

	public String getStock() {
		return this.stock;
	}

	public skuStockParam setStock(String stock) {
		this.stock = stock;
		return this;
	}
}
