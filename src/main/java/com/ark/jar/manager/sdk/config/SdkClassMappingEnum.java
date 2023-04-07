package com.ark.jar.manager.sdk.config;


/**
 * @Description:本地class 和sdk class映射类，sdk class是全路径
 * 
 */
public enum SdkClassMappingEnum {

	API_OP_EXCEPTION("com.sankuai.meituan.waimai.opensdk.exception.ApiOpException", "ApiOpException","com.ark.jar.manager.sdk.exception.meituan.ApiOpException"),
	API_SYS_EXCEPTION("com.sankuai.meituan.waimai.opensdk.exception.ApiSysException", "ApiSysException","com.ark.jar.manager.sdk.exception.meituan.ApiSysException"),
	RETAIL_PARAM("com.sankuai.meituan.waimai.opensdk.vo.RetailParam", "RetailParam","com.ark.jar.manager.sdk.dto.meituan.RetailParam"),
	RETAIL_SKU_STOCK_PARAM("com.sankuai.meituan.waimai.opensdk.vo.RetailSkuStockParam", "RetailSkuStockParam","com.ark.jar.manager.sdk.dto.meituan.RetailSkuStockParam"),
	RETAIL_SKU_PARAM("com.sankuai.meituan.waimai.opensdk.vo.RetailSkuParam", "RetailSkuParam","com.ark.jar.manager.sdk.dto.meituan.RetailSkuParam"),
	PLS_PRODUCT_CATEGORY("com.sankuai.meituan.waimai.opensdk.vo.PLSProductCategory", "PLSProductCategory","com.ark.jar.manager.sdk.dto.meituan.PLSProductCategory"),
	RETAIL_CAT_PARAM("com.sankuai.meituan.waimai.opensdk.vo.RetailCatParam", "RetailCatParam","com.ark.jar.manager.sdk.dto.meituan.RetailCatParam"),
	AVAILABLE_TIME_PARAM("com.sankuai.meituan.waimai.opensdk.vo.AvailableTimeParam", "AvailableTimeParam","com.ark.jar.manager.sdk.dto.meituan.AvailableTimeParam"),
	ORDER_DETAIL_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderDetailParam", "OrderDetailParam","com.ark.jar.manager.sdk.dto.meituan.OrderDetailParam"),
	FOOD_PARAM("com.sankuai.meituan.waimai.opensdk.vo.FoodParam", "FoodParam","com.ark.jar.manager.sdk.dto.meituan.FoodParam"),
	FOOD_SKU_PARAM("com.sankuai.meituan.waimai.opensdk.vo.FoodSkuParam", "FoodSkuParam","com.ark.jar.manager.sdk.dto.meituan.FoodSkuParam"),
	ORDER_ACT_DETAIL_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderActDetailParam", "OrderActDetailParam","com.ark.jar.manager.sdk.dto.meituan.OrderActDetailParam"),
	ORDER_EXTRA_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderExtraParam", "OrderExtraParam","com.ark.jar.manager.sdk.dto.meituan.OrderExtraParam"),
	ORDER_FOOD_DETAIL_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderFoodDetailParam", "OrderFoodDetailParam","com.ark.jar.manager.sdk.dto.meituan.OrderFoodDetailParam"),
	ORDER_SKU_BENEFIT_DETAIL_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderSkuBenefitDetailParam", "OrderSkuBenefitDetailParam","com.ark.jar.manager.sdk.dto.meituan.OrderSkuBenefitDetailParam"),
	ORDER_USER_MEMBER_INFO_PARAM("com.sankuai.meituan.waimai.opensdk.vo.OrderUserMemberInfoParam", "OrderUserMemberInfoParam","com.ark.jar.manager.sdk.dto.meituan.OrderUserMemberInfoParam"),
	POI_PARAM("com.sankuai.meituan.waimai.opensdk.vo.PoiParam", "PoiParam","com.ark.jar.manager.sdk.dto.meituan.PoiParam"),
	SYSTEM_PARAM("com.sankuai.meituan.waimai.opensdk.vo.SystemParam", "SystemParam","com.ark.jar.manager.sdk.dto.meituan.SystemParam"),
	SKU_STOCK_PARAM("com.sankuai.meituan.waimai.opensdk.vo.skuStockParam", "skuStockParam","com.ark.jar.manager.sdk.dto.meituan.skuStockParam"),
	Retail_Property("com.sankuai.meituan.waimai.opensdk.vo.RetailProperty.RetailProperty", "RetailProperty","com.ark.jar.manager.sdk.dto.meituan.RetailProperty"),
	APPLY_PART_REFUND("com.sankuai.meituan.waimai.opensdk.vo.FoodPartRefundParam", "FoodPartRefundParam","com.ark.jar.manager.sdk.dto.meituan.FoodPartRefundParam");

	/**
	 * @Description:本地类
	 * 
	 */
	private String localClass;

	/**
	 * @Description:本地类全类名
	 * 
	 */
	private String localClassFullName;

	/**
	 * @Description:sdk类
	 * 
	 */
	private String sdkClass;

	/**
	 * @Description:构造函数
	 * 
	 * @param sdkClass
	 * @param localClass
	 * @param localClassFullName
	 */
	SdkClassMappingEnum(String sdkClass,String localClass,String localClassFullName) {
		this.localClass = localClass;
		this.sdkClass = sdkClass;
		this.localClassFullName = localClassFullName;
	}


	/**
	 * @Description:查找sdk类或本地类
	 * 
	 * @param className
	 * @return
	 */
	public static SdkClassMappingEnum findBySdkClassOrLocalClass(String className){
		SdkClassMappingEnum[] values = SdkClassMappingEnum.values();
		for (SdkClassMappingEnum value : values) {
			if (value.localClass.equals(className)||value.sdkClass.equals(className)){
				return value;
			}
		}
		return null;
	}

	public String getLocalClass() {
		return localClass;
	}

	public String getSdkClass() {
		return sdkClass;
	}

	public String getLocalClassFullName() {
		return localClassFullName;
	}
}
