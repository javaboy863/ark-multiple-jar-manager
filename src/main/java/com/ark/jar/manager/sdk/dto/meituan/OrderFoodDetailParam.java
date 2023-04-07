package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

/**
 * @Description:订单行参数
 *
 */
@ToString
public class OrderFoodDetailParam {

	/**
	 * @Description:
	 *
	 */
	private String app_spu_code;
	private String app_food_code;


	/**
	 * @Description:食物名称
	 *
	 */
	private String food_name;

	/**
	 * @Description:质量
	 *
	 */
	private Integer quantity;

	/**
	 * @Description:价格
	 *
	 */
	private Float price;

	/**
	 * @Description:箱子数量
	 *
	 */
	private Float box_num;

	/**
	 * @Description:箱子价格
	 *
	 */
	private Float box_price;

	/**
	 * @Description:单位
	 *
	 */
	private String unit;

	/**
	 * @Description:
	 *
	 */
	private Float food_discount;

	/**
	 * @Description:skuId
	 *
	 */
	private String sku_id;

	/**
	 * @Description:食物属性
	 *
	 */
	private String food_property;

	/**
	 * @Description:
	 *
	 */
	private String spec;

	public OrderFoodDetailParam() {
	}

	public String getApp_spu_code() {
		return this.app_spu_code;
	}

	public void setApp_spu_code(String app_spu_code) {
		this.app_spu_code = app_spu_code;
	}

	public String getApp_food_code() {
		return this.app_food_code;
	}

	public void setApp_food_code(String app_food_code) {
		this.app_food_code = app_food_code;
	}

	public String getFood_name() {
		return this.food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getBox_num() {
		return this.box_num;
	}

	public void setBox_num(Float box_num) {
		this.box_num = box_num;
	}

	public Float getBox_price() {
		return this.box_price;
	}

	public void setBox_price(Float box_price) {
		this.box_price = box_price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getFood_discount() {
		return this.food_discount;
	}

	public void setFood_discount(Float food_discount) {
		this.food_discount = food_discount;
	}

	public String getSku_id() {
		return this.sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public String getFood_property() {
		return this.food_property;
	}

	public void setFood_property(String food_property) {
		this.food_property = food_property;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

}
