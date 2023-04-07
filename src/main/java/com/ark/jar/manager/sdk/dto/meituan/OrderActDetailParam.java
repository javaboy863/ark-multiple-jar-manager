package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

/**
 * @Description:
 *
 */
@ToString
public class OrderActDetailParam {
	/**
	 * @Description:
	 *
	 */
	private Long actId;

	/**
	 * @Description:
	 *
	 */
	private Integer type;

	/**
	 * @Description:
	 *
	 */
	private String remark;

	/**
	 * @Description:
	 *
	 */
	private Double mtCharge;

	/**
	 * @Description:
	 *
	 */
	private Double poiCharge;

	/**
	 * @Description:
	 *
	 */
	private Integer count;

	/**
	 * @Description:构造函数
	 *
	 */
	public OrderActDetailParam() {
	}

	public Long getActId() {
		return this.actId;
	}

	public void setActId(Long actId) {
		this.actId = actId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getMtCharge() {
		return this.mtCharge;
	}

	public void setMtCharge(Double mtCharge) {
		this.mtCharge = mtCharge;
	}

	public Double getPoiCharge() {
		return this.poiCharge;
	}

	public void setPoiCharge(Double poiCharge) {
		this.poiCharge = poiCharge;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
