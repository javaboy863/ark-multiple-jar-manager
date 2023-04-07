package com.ark.jar.manager.sdk.dto.meituan;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Description:
 *
 */
@ToString
@Setter
@Getter
public class RetailParam {
	/**
	 * @Description:
	 *
	 */
	private String app_poi_code;
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
	private Integer operation;

	/**
	 * @Description:
	 *
	 */
	private String name;

	/**
	 * @Description:
	 *
	 */
	private String description;

	/**
	 * @Description:
	 *
	 */
	private Float price;

	/**
	 * @Description:
	 *
	 */
	private Integer min_order_count;

	/**
	 * @Description:
	 *
	 */
	private String unit;

	/**
	 * @Description:
	 *
	 */
	private Float box_num;

	/**
	 * @Description:
	 *
	 */
	private Float box_price;

	/**
	 * @Description:
	 *
	 */
	private String category_name;

	/**
	 * @Description:
	 *
	 */
	private String secondary_category_name;

	/**
	 * @Description:
	 *
	 */
	private String category_code;

	/**
	 * @Description:
	 *
	 */
	private String secondary_category_code;

	/**
	 * @Description:
	 *
	 */
	private Integer is_sold_out;

	/**
	 * @Description:
	 *
	 */
	private String picture;

	/**
	 * @Description:
	 *
	 */
	private String picture_contents;

	/**
	 * @Description:
	 *
	 */
	private Integer sequence;

	/**
	 * @Description:
	 *
	 */
	private List<RetailSkuParam> skus;

	/**
	 * @Description:
	 *
	 */
	private RetailSkuParam standard_sku;

	/**
	 * @Description:
	 *
	 */
	private List<RetailSkuParam> unstandard_skus;

	/**
	 * @Description:
	 *
	 */
	private String upc_code;

	/**
	 * @Description:
	 *
	 */
	private Long ctime;

	/**
	 * @Description:
	 *
	 */
	private Long utime;

	/**
	 * @Description:
	 *
	 */
	private Float special_price;

	/**
	 * @Description:
	 *
	 */
	private Integer max_order_count;

	/**
	 * @Description:
	 *
	 */
	private Long tag_id;

	/**
	 * @Description:
	 *
	 */
	private String zh_name;

	/**
	 * @Description:
	 *
	 */
	private String product_name;

	/**
	 * @Description:
	 *
	 */
	private String flavour;

	/**
	 * @Description:
	 *
	 */
	private String origin_name;

	/**
	 * @Description:
	 *
	 */
	private Integer origin_id;

	/**
	 * @Description:
	 *
	 */
	private Integer isSp;

	//商品卖点
	private String sell_point;

	//商品属性
	private String properties;

	/**
	 * @Description:构造函数
	 *
	 */
	public RetailParam() {
	}



}
