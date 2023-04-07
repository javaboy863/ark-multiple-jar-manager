package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

import java.util.List;

/**
 * @Description:
 * 
 */
@ToString
public class OrderSkuBenefitDetailParam {
	/**
	 * @Description:
	 * 
	 */
	private String app_spu_code;
	private String app_food_code;

	/**
	 * @Description:
	 * 
	 */
	private String name;

	/**
	 * @Description:
	 * 
	 */
	private String sku_id;

	/**
	 * @Description:
	 * 
	 */
	private Integer count;

	/**
	 * @Description:
	 * 
	 */
	private Double totalOriginPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double originPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double totalReducePrice;

	/**
	 * @Description:
	 * 
	 */
	private Double totalActivityPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double activityPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double totalMtCharge;

	/**
	 * @Description:
	 * 
	 */
	private Double totalPoiCharge;
	/**
	 * @Description:
	 * 
	 */
	private Double totalBoxPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double boxPrice;

	/**
	 * @Description:
	 * 
	 */
	private Double boxNumber;

	/**
	 * @Description:
	 * 
	 */
	private List<OrderActDetailParam> wmAppOrderActDetails;

	/**
	 * @Description:构造函数
	 * 
	 */
	public OrderSkuBenefitDetailParam() {
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku_id() {
		return this.sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getTotalOriginPrice() {
		return this.totalOriginPrice;
	}

	public void setTotalOriginPrice(Double totalOriginPrice) {
		this.totalOriginPrice = totalOriginPrice;
	}

	public Double getOriginPrice() {
		return this.originPrice;
	}

	public void setOriginPrice(Double originPrice) {
		this.originPrice = originPrice;
	}

	public Double getTotalReducePrice() {
		return this.totalReducePrice;
	}

	public void setTotalReducePrice(Double totalReducePrice) {
		this.totalReducePrice = totalReducePrice;
	}

	public Double getTotalActivityPrice() {
		return this.totalActivityPrice;
	}

	public void setTotalActivityPrice(Double totalActivityPrice) {
		this.totalActivityPrice = totalActivityPrice;
	}

	public Double getActivityPrice() {
		return this.activityPrice;
	}

	public void setActivityPrice(Double activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Double getTotalMtCharge() {
		return this.totalMtCharge;
	}

	public void setTotalMtCharge(Double totalMtCharge) {
		this.totalMtCharge = totalMtCharge;
	}

	public Double getTotalPoiCharge() {
		return this.totalPoiCharge;
	}

	public void setTotalPoiCharge(Double totalPoiCharge) {
		this.totalPoiCharge = totalPoiCharge;
	}

	public Double getTotalBoxPrice() {
		return this.totalBoxPrice;
	}

	public void setTotalBoxPrice(Double totalBoxPrice) {
		this.totalBoxPrice = totalBoxPrice;
	}

	public Double getBoxPrice() {
		return this.boxPrice;
	}

	public void setBoxPrice(Double boxPrice) {
		this.boxPrice = boxPrice;
	}

	public Double getBoxNumber() {
		return this.boxNumber;
	}

	public void setBoxNumber(Double boxNumber) {
		this.boxNumber = boxNumber;
	}

	public List<OrderActDetailParam> getWmAppOrderActDetails() {
		return this.wmAppOrderActDetails;
	}

	public void setWmAppOrderActDetails(List<OrderActDetailParam> wmAppOrderActDetails) {
		this.wmAppOrderActDetails = wmAppOrderActDetails;
	}

}
