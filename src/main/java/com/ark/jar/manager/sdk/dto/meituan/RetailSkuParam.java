package com.ark.jar.manager.sdk.dto.meituan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 *
 */
@Setter
@Getter
@ToString
public class RetailSkuParam {

	/**
	 * @Description:
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
	 * @Description:
	 *
	 */
	private String stock;

	/**
	 * @Description:
	 *
	 */
	private String price;

	/**
	 * @Description:
	 *
	 */
	private String location_code;

	/**
	 * @Description:
	 *
	 */
	private AvailableTimeParam available_times;

	/**
	 * @Description:
	 *
	 */
	private String box_num;

	/**
	 * @Description:
	 *
	 */
	private String box_price;

	/**
	 * @Description:
	 *
	 */
	private Long weight;

	/**
	 * @Description:
	 *
	 */
	private String weight_for_unit;

	/**
	 * @Description:
	 *
	 */
	private String weight_unit;


}
