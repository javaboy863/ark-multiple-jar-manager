package com.ark.jar.manager.sdk.dto.meituan;

import java.util.List;

/**
 * @Description:食物参数
 *
 */
public class FoodParam {
	/**
	 * @Description:
	 *
	 */
	private Integer food_id;

	/**
	 * @Description:
	 *
	 */
	private String app_poi_code;

	/**
	 * @Description:
	 *
	 */
	private String app_spu_code;

	private String app_food_code;

	/**
	 * @Description:操作
	 *
	 */
	private Integer operation;

	/**
	 * @Description:名称
	 *
	 */
	private String name;

	/**
	 * @Description:描述
	 *
	 */
	private String description;

	/**
	 * @Description:价格
	 *
	 */
	private Float price;

	/**
	 * @Description:最小订单数量
	 *
	 */
	private Integer min_order_count;

	/**
	 * @Description:单位
	 *
	 */
	private String unit;

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
	 * @Description:品类名称
	 *
	 */
	private String category_name;

	/**
	 * @Description:二级品类名称
	 *
	 */
	private String secondary_category_name;

	/**
	 * @Description:
	 *
	 */
	private Integer is_sold_out;

	/**
	 * @Description:图片
	 *
	 */
	private String picture;

	/**
	 * @Description:序列
	 *
	 */
	private Integer sequence;

	/**
	 * @Description:sku列表
	 *
	 */
	private List<FoodSkuParam> skus;

	/**
	 * @Description:创建时间
	 *
	 */
	private Long ctime;

	/**
	 * @Description:修改时间
	 *
	 */
	private Long utime;

	/**
	 * @Description:特殊价格
	 *
	 */
	private Float special_price;

	/**
	 * @Description:最大订单数
	 *
	 */
	private Integer max_order_count;

	/***
	 * @Description:构造函数
	 * v
	 */
	public FoodParam() {
	}

	public Integer getFood_id() {
		return this.food_id;
	}

	public FoodParam setFood_id(Integer food_id) {
		this.food_id = food_id;
		return this;
	}

	public String getApp_poi_code() {
		return this.app_poi_code;
	}

	public FoodParam setApp_poi_code(String app_poi_code) {
		this.app_poi_code = app_poi_code;
		return this;
	}

	public String getApp_spu_code() {
		return this.app_spu_code;
	}

	public FoodParam setApp_spu_code(String app_spu_code) {
		this.app_spu_code = app_spu_code;
		return this;
	}

	public String getApp_food_code() {
		return this.app_food_code;
	}

	public FoodParam setApp_food_code(String app_food_code) {
		this.app_food_code = app_food_code;
		return this;
	}

	public Integer getOperation() {
		return this.operation;
	}

	public FoodParam setOperation(Integer operation) {
		this.operation = operation;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public FoodParam setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public FoodParam setDescription(String description) {
		this.description = description;
		return this;
	}

	public Float getPrice() {
		return this.price;
	}

	public FoodParam setPrice(Float price) {
		this.price = price;
		return this;
	}

	public Integer getMin_order_count() {
		return this.min_order_count;
	}

	public FoodParam setMin_order_count(Integer min_order_count) {
		this.min_order_count = min_order_count;
		return this;
	}

	public String getUnit() {
		return this.unit;
	}

	public FoodParam setUnit(String unit) {
		this.unit = unit;
		return this;
	}

	public Float getBox_num() {
		return this.box_num;
	}

	public FoodParam setBox_num(Float box_num) {
		this.box_num = box_num;
		return this;
	}

	public Float getBox_price() {
		return this.box_price;
	}

	public FoodParam setBox_price(Float box_price) {
		this.box_price = box_price;
		return this;
	}

	public String getCategory_name() {
		return this.category_name;
	}

	public FoodParam setCategory_name(String category_name) {
		this.category_name = category_name;
		return this;
	}

	public String getSecondary_category_name() {
		return this.secondary_category_name;
	}

	public FoodParam setSecondary_category_name(String secondary_category_name) {
		this.secondary_category_name = secondary_category_name;
		return this;
	}

	public Integer getIs_sold_out() {
		return this.is_sold_out;
	}

	public FoodParam setIs_sold_out(Integer is_sold_out) {
		this.is_sold_out = is_sold_out;
		return this;
	}

	public String getPicture() {
		return this.picture;
	}

	public FoodParam setPicture(String picture) {
		this.picture = picture;
		return this;
	}

	public Integer getSequence() {
		return this.sequence;
	}

	public FoodParam setSequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	public List<FoodSkuParam> getSkus() {
		return this.skus;
	}

	public FoodParam setSkus(List<FoodSkuParam> skus) {
		this.skus = skus;
		return this;
	}

	public Long getCtime() {
		return this.ctime;
	}

	public FoodParam setCtime(Long ctime) {
		this.ctime = ctime;
		return this;
	}

	public Long getUtime() {
		return this.utime;
	}

	public FoodParam setUtime(Long utime) {
		this.utime = utime;
		return this;
	}

	public Float getSpecial_price() {
		return this.special_price;
	}

	public FoodParam setSpecial_price(Float special_price) {
		this.special_price = special_price;
		return this;
	}

	public Integer getMax_order_count() {
		return this.max_order_count;
	}

	public FoodParam setMax_order_count(Integer max_order_count) {
		this.max_order_count = max_order_count;
		return this;
	}
	@Override
	public String toString() {
		return "FoodParam [food_id=" + this.food_id + ", app_poi_code='" + this.app_poi_code + '\'' + ", app_spu_code='" + this.app_spu_code + '\'' + ", operation=" + this.operation + ", name='" + this.name + '\'' + ", description='" + this.description + '\'' + ", price=" + this.price + ", min_order_count=" + this.min_order_count + ", unit='" + this.unit + '\'' + ", box_num=" + this.box_num + ", box_price=" + this.box_price + ", category_name='" + this.category_name + '\'' + ", secondary_category_name='" + this.secondary_category_name + '\'' + ", is_sold_out=" + this.is_sold_out + ", picture='" + this.picture + '\'' + ", sequence=" + this.sequence + ", skus=" + this.skus + ", ctime=" + this.ctime + ", utime=" + this.utime + ", special_price=" + this.special_price + ", max_order_count=" + this.max_order_count + ']';
	}

}
