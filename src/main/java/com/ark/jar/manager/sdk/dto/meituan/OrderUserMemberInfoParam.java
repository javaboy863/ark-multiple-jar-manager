package com.ark.jar.manager.sdk.dto.meituan;

import lombok.ToString;

/**
 * @Description:
 *
 */
@ToString
public class OrderUserMemberInfoParam {
	/**
	 * @Description:
	 *
	 */
	private Boolean is_poi_member;

	/**
	 * @Description:
	 *
	 */
	private String card_code;

	/**
	 * @Description:
	 *
	 */
	private String level_code;

	/**
	 * @Description:
	 *
	 */
	private String poi_member_id;

	/**
	 * @Description:构造函数
	 *
	 */
	public OrderUserMemberInfoParam() {
	}

	public Boolean getIs_poi_member() {
		return this.is_poi_member;
	}

	public void setIs_poi_member(Boolean is_poi_member) {
		this.is_poi_member = is_poi_member;
	}

	public String getCard_code() {
		return this.card_code;
	}

	public void setCard_code(String card_code) {
		this.card_code = card_code;
	}

	public String getLevel_code() {
		return this.level_code;
	}

	public void setLevel_code(String level_code) {
		this.level_code = level_code;
	}

	public String getPoi_member_id() {
		return this.poi_member_id;
	}

	public void setPoi_member_id(String poi_member_id) {
		this.poi_member_id = poi_member_id;
	}

}
