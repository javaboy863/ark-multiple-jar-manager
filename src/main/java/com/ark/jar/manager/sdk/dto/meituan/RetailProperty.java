package com.ark.jar.manager.sdk.dto.meituan;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @version 1.0
 * 
 * @Descriptin:
 * @Date: 2021-05-31 上午11:35
 */
@ToString
@Setter
@Getter
public class RetailProperty {

    //属性名称
    private String property_name;
    //属性值
    private List<String> values;

}
