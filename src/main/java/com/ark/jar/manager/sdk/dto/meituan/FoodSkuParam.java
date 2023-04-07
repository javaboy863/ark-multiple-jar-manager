package com.ark.jar.manager.sdk.dto.meituan;


/**
 * @Description:
 * 
 */
public class FoodSkuParam {
	/**
	 * @Description: skuId
	 * 
	 */
	private String sku_id;

	/**
	 * @Description:
	 * 
	 */
	private String spec;

	/**
	 * @Description:
	 * 
	 */
	private String upc;

	/**
	 * @Description:库存
	 * 
	 */
	private String stock;

	/**
	 * @Description:价格
	 * 
	 */
	private String price;

	/**
	 * @Description:
	 * 
	 */
	private String location_code;
	/**
	 * @Description:可用时间
	 * 
	 */
	private AvailableTimeParam available_times;

	/**
	 * @Description:箱子数量
	 * 
	 */
	private String box_num;

	/**
	 * @Description:箱子价格
	 * 
	 */
	private String box_price;

	/**
	 * @Description:重量
	 * 
	 */
	private Long weight;

	/**
	 * @Description:构造函数
	 * 
	 */
	public FoodSkuParam() {
	}

	public String getSku_id() {
		return this.sku_id;
	}

	public FoodSkuParam setSku_id(String sku_id) {
		this.sku_id = sku_id;
		return this;
	}

	public String getSpec() {
		return this.spec;
	}

	public FoodSkuParam setSpec(String spec) {
		this.spec = spec;
		return this;
	}

	public String getUpc() {
		return this.upc;
	}

	public FoodSkuParam setUpc(String upc) {
		this.upc = upc;
		return this;
	}

	public String getStock() {
		return this.stock;
	}

	public FoodSkuParam setStock(String stock) {
		this.stock = stock;
		return this;
	}

	public String getPrice() {
		return this.price;
	}

	public FoodSkuParam setPrice(String price) {
		this.price = price;
		return this;
	}

	public String getLocation_code() {
		return this.location_code;
	}

	public FoodSkuParam setLocation_code(String location_code) {
		this.location_code = location_code;
		return this;
	}

	public AvailableTimeParam getAvailable_times() {
		return this.available_times;
	}

	public FoodSkuParam setAvailable_times(AvailableTimeParam available_times) {
		this.available_times = available_times;
		return this;
	}

	public String getBox_num() {
		return this.box_num;
	}

	public FoodSkuParam setBox_num(String box_num) {
		this.box_num = box_num;
		return this;
	}

	public String getBox_price() {
		return this.box_price;
	}

	public FoodSkuParam setBox_price(String box_price) {
		this.box_price = box_price;
		return this;
	}

	public Long getWeight() {
		return this.weight;
	}

	public FoodSkuParam setWeight(Long weight) {
		this.weight = weight;
		return this;
	}

}
