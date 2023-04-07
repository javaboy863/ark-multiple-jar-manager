package com.ark.jar.manager.sdk.dto.meituan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 方法描述 :
 *
 * @param :
 *
 * @return :
 * @date: 2021/11/30 下午8:36
 */

@ToString
@Setter
@Getter
public class FoodPartRefundParam {
    //App方商品Id
    private String app_spu_code;
    private String app_food_code;
    private Double box_num;
    private Double box_price;
    private Integer count;
    private String food_name;
    private Double food_price;
    private Double origin_food_price;
    private Double refund_price;
    //商品sku唯一标识码，如为单规格商品，可以不传此参数；如为多规格商品，必须上传要退款商品sku的sku_id
    private String sku_id;
    private String spec;
    private Double actual_weight;

}
