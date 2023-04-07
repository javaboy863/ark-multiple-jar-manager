package com.ark.jar.manager.sdk.dto.meituan;

import java.util.List;

/**
 * @Description:订单明细参数
 * 
 */
public class OrderDetailParam {
	/**
	 * @Description:
	 * 
	 */
	private String app_order_code;

	/**
	 * @Description:
	 * 
	 */
	private String app_poi_code;

	/**
	 * @Description:
	 * 
	 */
	private Double avg_send_time;

	/**
	 * @Description:
	 * 
	 */
	private String caution;

	/**
	 * @Description:城市id
	 * 
	 */
	private Long city_id;

	/**
	 * @Description:创建时间
	 * 
	 */
	private Long ctime;

	/**
	 * @Description:
	 * 
	 */
	private Integer day_seq;

	/**
	 * @Description:配送时间
	 * 
	 */
	private Long delivery_time;

	/**
	 * @Description:
	 * 
	 */
	private List<OrderFoodDetailParam> detail;

	/**
	 * @Description:
	 * 
	 */
	private Integer dinners_number;

	/**
	 * @Description:
	 * 
	 */
	private Integer expect_deliver_time;

	/**
	 * @Description:
	 * 
	 */
	private List<OrderExtraParam> extras;

	/**
	 * @Description: 是否有发票
	 * 
	 */
	private Integer has_invoiced;

	/**
	 * @Description:发票抬头
	 * 
	 */
	private String invoice_title;

	/**
	 * @Description:
	 * 
	 */
	private String taxpayer_id;

	/**
	 * @Description:
	 * 
	 */
	private Boolean is_favorites;

	/**
	 * @Description:
	 * 
	 */
	private Boolean is_poi_first_order;

	/**
	 * @Description:
	 * 
	 */
	private Integer is_pre;

	/**
	 * @Description:
	 * 
	 */
	private Integer is_third_shipping;

	/**
	 * @Description:
	 * 
	 */
	private Double latitude;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_cancel_time;

	/**
	 * @Description:
	 * 
	 */
	private String logistics_code;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_completed_time;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_confirm_time;

	/**
	 * @Description:
	 * 
	 */
	private String logistics_dispatcher_mobile;

	/**
	 * @Description:
	 * 
	 */
	private String logistics_dispatcher_name;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_fetch_time;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_id;

	/**
	 * @Description:
	 * 
	 */
	private String logistics_name;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_send_time;

	/**
	 * @Description:
	 * 
	 */
	private Integer logistics_status;

	/**
	 * @Description:
	 * 
	 */
	private Double longitude;

	/**
	 * @Description:订单取消时间
	 * 
	 */
	private Long order_cancel_time;

	/**
	 * @Description:订单完成时间
	 * 
	 */
	private Long order_completed_time;

	/**
	 * @Description:订单确认时间
	 * 
	 */
	private Long order_confirm_time;

	/**
	 * @Description:订单id
	 * 
	 */
	private Long order_id;

	/**
	 * @Description:订单接收时间
	 * 
	 */
	private Long order_receive_time;

	/**
	 * @Description:订单发送时间
	 * 
	 */
	private Long order_send_time;

	/**
	 * @Description:原价
	 * 
	 */
	private Double original_price;

	/**
	 * @Description:支付完成时间
	 * 
	 */
	private Integer pay_done_time;

	/**
	 * @Description:支付状态
	 * 
	 */
	private Integer pay_status;

	/**
	 * @Description:支付类型
	 * 
	 */
	private Integer pay_type;

	/**
	 * @Description:支付时间
	 * 
	 */
	private Integer paying_time;

	/**
	 * @Description:订单明细行接收详情
	 * 
	 */
	private String poi_receive_detail;

	/**
	 * @Description:
	 * 
	 */
	private String recipient_address;

	/**
	 * @Description:
	 * 
	 */
	private String recipient_name;

	/**
	 * @Description:
	 * 
	 */
	private String recipient_phone;

	/**
	 * @Description:退款申请时间
	 * 
	 */
	private Integer refund_apply_time;

	/**
	 * @Description:退款完成时间
	 * 
	 */
	private Integer refund_complete_time;

	/**
	 * @Description:退款确认时间
	 * 
	 */
	private Integer refund_confirm_time;

	/**
	 * @Description:退款拒绝时间
	 * 
	 */
	private Integer refund_reject_time;

	/**
	 * @Description:备注
	 * 
	 */
	private String remark;

	/**
	 * @Description:
	 * 
	 */
	private String result;

	/**
	 * @Description:
	 * 
	 */
	private String shipper_phone;

	/**
	 * @Description:
	 * 
	 */
	private Float shipping_fee;

	/**
	 * @Description:
	 * 
	 */
	private Integer shipping_type;

	/**
	 * @Description:
	 * 
	 */
	private Long source_id;

	/**
	 * @Description:状态
	 * 
	 */
	private Integer status;

	/**
	 * @Description:
	 * 
	 */
	private List<OrderSkuBenefitDetailParam> sku_benefit_detail;

	/**
	 * @Description:总数
	 * 
	 */
	private Double total;

	/**
	 * @Description:
	 * 
	 */
	private Integer unpaid_time;

	/**
	 * @Description:更新时间
	 * 
	 */
	private Long utime;

	/**
	 * @Description:
	 * 
	 */
	private OrderUserMemberInfoParam user_member_info;

	/**
	 * @Description:
	 * 
	 */
	private Long wm_order_id_view;

	/**
	 * @Description:
	 * 
	 */
	private String wm_poi_address;

	/**
	 * @Description:
	 * 
	 */
	private Long wm_poi_id;

	/**
	 * @Description:
	 * 
	 */
	private String wm_poi_name;

	/**
	 * @Description:
	 * 
	 */
	private String wm_poi_phone;

	/**
	 * @Description:
	 * 
	 */
	private Integer package_bag_money;

	/**
	 * @Description:构造函数
	 * 
	 */
	public OrderDetailParam() {
	}

	public String getApp_order_code() {
		return this.app_order_code;
	}

	public void setApp_order_code(String app_order_code) {
		this.app_order_code = app_order_code;
	}

	public String getApp_poi_code() {
		return this.app_poi_code;
	}

	public void setApp_poi_code(String app_poi_code) {
		this.app_poi_code = app_poi_code;
	}

	public Double getAvg_send_time() {
		return this.avg_send_time;
	}

	public void setAvg_send_time(Double avg_send_time) {
		this.avg_send_time = avg_send_time;
	}

	public String getCaution() {
		return this.caution;
	}

	public void setCaution(String caution) {
		this.caution = caution;
	}

	public Long getCity_id() {
		return this.city_id;
	}

	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

	public Long getCtime() {
		return this.ctime;
	}

	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}

	public Integer getDay_seq() {
		return this.day_seq;
	}

	public void setDay_seq(Integer day_seq) {
		this.day_seq = day_seq;
	}

	public Long getDelivery_time() {
		return this.delivery_time;
	}

	public void setDelivery_time(Long delivery_time) {
		this.delivery_time = delivery_time;
	}

	public List<OrderFoodDetailParam> getDetail() {
		return this.detail;
	}

	public void setDetail(List<OrderFoodDetailParam> detail) {
		this.detail = detail;
	}

	public Integer getDinners_number() {
		return this.dinners_number;
	}

	public void setDinners_number(Integer dinners_number) {
		this.dinners_number = dinners_number;
	}

	public Integer getExpect_deliver_time() {
		return this.expect_deliver_time;
	}

	public void setExpect_deliver_time(Integer expect_deliver_time) {
		this.expect_deliver_time = expect_deliver_time;
	}

	public List<OrderExtraParam> getExtras() {
		return this.extras;
	}

	public void setExtras(List<OrderExtraParam> extras) {
		this.extras = extras;
	}

	public Integer getHas_invoiced() {
		return this.has_invoiced;
	}

	public void setHas_invoiced(Integer has_invoiced) {
		this.has_invoiced = has_invoiced;
	}

	public String getInvoice_title() {
		return this.invoice_title;
	}

	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}

	public String getTaxpayer_id() {
		return this.taxpayer_id;
	}

	public void setTaxpayer_id(String taxpayer_id) {
		this.taxpayer_id = taxpayer_id;
	}

	public Boolean getIs_favorites() {
		return this.is_favorites;
	}

	public void setIs_favorites(Boolean is_favorites) {
		this.is_favorites = is_favorites;
	}

	public Boolean getIs_poi_first_order() {
		return this.is_poi_first_order;
	}

	public void setIs_poi_first_order(Boolean is_poi_first_order) {
		this.is_poi_first_order = is_poi_first_order;
	}

	public Integer getIs_pre() {
		return this.is_pre;
	}

	public void setIs_pre(Integer is_pre) {
		this.is_pre = is_pre;
	}

	public Integer getIs_third_shipping() {
		return this.is_third_shipping;
	}

	public void setIs_third_shipping(Integer is_third_shipping) {
		this.is_third_shipping = is_third_shipping;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Integer getLogistics_cancel_time() {
		return this.logistics_cancel_time;
	}

	public void setLogistics_cancel_time(Integer logistics_cancel_time) {
		this.logistics_cancel_time = logistics_cancel_time;
	}

	public String getLogistics_code() {
		return this.logistics_code;
	}

	public void setLogistics_code(String logistics_code) {
		this.logistics_code = logistics_code;
	}

	public Integer getLogistics_completed_time() {
		return this.logistics_completed_time;
	}

	public void setLogistics_completed_time(Integer logistics_completed_time) {
		this.logistics_completed_time = logistics_completed_time;
	}

	public Integer getLogistics_confirm_time() {
		return this.logistics_confirm_time;
	}

	public void setLogistics_confirm_time(Integer logistics_confirm_time) {
		this.logistics_confirm_time = logistics_confirm_time;
	}

	public String getLogistics_dispatcher_mobile() {
		return this.logistics_dispatcher_mobile;
	}

	public void setLogistics_dispatcher_mobile(String logistics_dispatcher_mobile) {
		this.logistics_dispatcher_mobile = logistics_dispatcher_mobile;
	}

	public String getLogistics_dispatcher_name() {
		return this.logistics_dispatcher_name;
	}

	public void setLogistics_dispatcher_name(String logistics_dispatcher_name) {
		this.logistics_dispatcher_name = logistics_dispatcher_name;
	}

	public Integer getLogistics_fetch_time() {
		return this.logistics_fetch_time;
	}

	public void setLogistics_fetch_time(Integer logistics_fetch_time) {
		this.logistics_fetch_time = logistics_fetch_time;
	}

	public Integer getLogistics_id() {
		return this.logistics_id;
	}

	public void setLogistics_id(Integer logistics_id) {
		this.logistics_id = logistics_id;
	}

	public String getLogistics_name() {
		return this.logistics_name;
	}

	public void setLogistics_name(String logistics_name) {
		this.logistics_name = logistics_name;
	}

	public Integer getLogistics_send_time() {
		return this.logistics_send_time;
	}

	public void setLogistics_send_time(Integer logistics_send_time) {
		this.logistics_send_time = logistics_send_time;
	}

	public Integer getLogistics_status() {
		return this.logistics_status;
	}

	public void setLogistics_status(Integer logistics_status) {
		this.logistics_status = logistics_status;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getOrder_cancel_time() {
		return this.order_cancel_time;
	}

	public void setOrder_cancel_time(Long order_cancel_time) {
		this.order_cancel_time = order_cancel_time;
	}

	public Long getOrder_completed_time() {
		return this.order_completed_time;
	}

	public void setOrder_completed_time(Long order_completed_time) {
		this.order_completed_time = order_completed_time;
	}

	public Long getOrder_confirm_time() {
		return this.order_confirm_time;
	}

	public void setOrder_confirm_time(Long order_confirm_time) {
		this.order_confirm_time = order_confirm_time;
	}

	public Long getOrder_id() {
		return this.order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getOrder_receive_time() {
		return this.order_receive_time;
	}

	public void setOrder_receive_time(Long order_receive_time) {
		this.order_receive_time = order_receive_time;
	}

	public Long getOrder_send_time() {
		return this.order_send_time;
	}

	public void setOrder_send_time(Long order_send_time) {
		this.order_send_time = order_send_time;
	}

	public Double getOriginal_price() {
		return this.original_price;
	}

	public void setOriginal_price(Double original_price) {
		this.original_price = original_price;
	}

	public Integer getPay_done_time() {
		return this.pay_done_time;
	}

	public void setPay_done_time(Integer pay_done_time) {
		this.pay_done_time = pay_done_time;
	}

	public Integer getPay_status() {
		return this.pay_status;
	}

	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
	}

	public Integer getPay_type() {
		return this.pay_type;
	}

	public void setPay_type(Integer pay_type) {
		this.pay_type = pay_type;
	}

	public Integer getPaying_time() {
		return this.paying_time;
	}

	public void setPaying_time(Integer paying_time) {
		this.paying_time = paying_time;
	}

	public String getPoi_receive_detail() {
		return this.poi_receive_detail;
	}

	public void setPoi_receive_detail(String poi_receive_detail) {
		this.poi_receive_detail = poi_receive_detail;
	}

	public String getRecipient_address() {
		return this.recipient_address;
	}

	public void setRecipient_address(String recipient_address) {
		this.recipient_address = recipient_address;
	}

	public String getRecipient_name() {
		return this.recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getRecipient_phone() {
		return this.recipient_phone;
	}

	public void setRecipient_phone(String recipient_phone) {
		this.recipient_phone = recipient_phone;
	}

	public Integer getRefund_apply_time() {
		return this.refund_apply_time;
	}

	public void setRefund_apply_time(Integer refund_apply_time) {
		this.refund_apply_time = refund_apply_time;
	}

	public Integer getRefund_complete_time() {
		return this.refund_complete_time;
	}

	public void setRefund_complete_time(Integer refund_complete_time) {
		this.refund_complete_time = refund_complete_time;
	}

	public Integer getRefund_confirm_time() {
		return this.refund_confirm_time;
	}

	public void setRefund_confirm_time(Integer refund_confirm_time) {
		this.refund_confirm_time = refund_confirm_time;
	}

	public Integer getRefund_reject_time() {
		return this.refund_reject_time;
	}

	public void setRefund_reject_time(Integer refund_reject_time) {
		this.refund_reject_time = refund_reject_time;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getShipper_phone() {
		return this.shipper_phone;
	}

	public void setShipper_phone(String shipper_phone) {
		this.shipper_phone = shipper_phone;
	}

	public Float getShipping_fee() {
		return this.shipping_fee;
	}

	public void setShipping_fee(Float shipping_fee) {
		this.shipping_fee = shipping_fee;
	}

	public Integer getShipping_type() {
		return this.shipping_type;
	}

	public void setShipping_type(Integer shipping_type) {
		this.shipping_type = shipping_type;
	}

	public Long getSource_id() {
		return this.source_id;
	}

	public void setSource_id(Long source_id) {
		this.source_id = source_id;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getUnpaid_time() {
		return this.unpaid_time;
	}

	public void setUnpaid_time(Integer unpaid_time) {
		this.unpaid_time = unpaid_time;
	}

	public Long getUtime() {
		return this.utime;
	}

	public void setUtime(Long utime) {
		this.utime = utime;
	}

	public Long getWm_order_id_view() {
		return this.wm_order_id_view;
	}

	public void setWm_order_id_view(Long wm_order_id_view) {
		this.wm_order_id_view = wm_order_id_view;
	}

	public String getWm_poi_address() {
		return this.wm_poi_address;
	}

	public void setWm_poi_address(String wm_poi_address) {
		this.wm_poi_address = wm_poi_address;
	}

	public Long getWm_poi_id() {
		return this.wm_poi_id;
	}

	public void setWm_poi_id(Long wm_poi_id) {
		this.wm_poi_id = wm_poi_id;
	}

	public String getWm_poi_name() {
		return this.wm_poi_name;
	}

	public void setWm_poi_name(String wm_poi_name) {
		this.wm_poi_name = wm_poi_name;
	}

	public String getWm_poi_phone() {
		return this.wm_poi_phone;
	}

	public void setWm_poi_phone(String wm_poi_phone) {
		this.wm_poi_phone = wm_poi_phone;
	}

	public Integer getPackage_bag_money() {
		return this.package_bag_money;
	}

	public void setPackage_bag_money(Integer package_bag_money) {
		this.package_bag_money = package_bag_money;
	}

	public List<OrderSkuBenefitDetailParam> getSku_benefit_detail() {
		return this.sku_benefit_detail;
	}

	public void setSku_benefit_detail(List<OrderSkuBenefitDetailParam> sku_benefit_detail) {
		this.sku_benefit_detail = sku_benefit_detail;
	}

	public OrderUserMemberInfoParam getUser_member_info() {
		return this.user_member_info;
	}

	public void setUser_member_info(OrderUserMemberInfoParam user_member_info) {
		this.user_member_info = user_member_info;
	}
	@Override
	public String toString() {
		return "OrderDetailParam{app_order_code='" + this.app_order_code + '\'' + ", app_poi_code='" + this.app_poi_code + '\'' + ", avg_send_time=" + this.avg_send_time + ", caution='" + this.caution + '\'' + ", city_id=" + this.city_id + ", ctime=" + this.ctime + ", day_seq=" + this.day_seq + ", delivery_time=" + this.delivery_time + ", detail=" + this.detail + ", dinners_number=" + this.dinners_number + ", expect_deliver_time=" + this.expect_deliver_time + ", extras=" + this.extras + ", has_invoiced=" + this.has_invoiced + ", invoice_title='" + this.invoice_title + '\'' + ", taxpayer_id='" + this.taxpayer_id + '\'' + ", is_favorites=" + this.is_favorites + ", is_poi_first_order=" + this.is_poi_first_order + ", is_pre=" + this.is_pre + ", is_third_shipping=" + this.is_third_shipping + ", latitude=" + this.latitude + ", logistics_cancel_time=" + this.logistics_cancel_time + ", logistics_code='" + this.logistics_code + '\'' + ", logistics_completed_time=" + this.logistics_completed_time + ", logistics_confirm_time=" + this.logistics_confirm_time + ", logistics_dispatcher_mobile='" + this.logistics_dispatcher_mobile + '\'' + ", logistics_dispatcher_name='" + this.logistics_dispatcher_name + '\'' + ", logistics_fetch_time=" + this.logistics_fetch_time + ", logistics_id=" + this.logistics_id + ", logistics_name='" + this.logistics_name + '\'' + ", logistics_send_time=" + this.logistics_send_time + ", logistics_status=" + this.logistics_status + ", longitude=" + this.longitude + ", order_cancel_time=" + this.order_cancel_time + ", order_completed_time=" + this.order_completed_time + ", order_confirm_time=" + this.order_confirm_time + ", order_id=" + this.order_id + ", order_receive_time=" + this.order_receive_time + ", order_send_time=" + this.order_send_time + ", original_price=" + this.original_price + ", pay_done_time=" + this.pay_done_time + ", pay_status=" + this.pay_status + ", pay_type=" + this.pay_type + ", paying_time=" + this.paying_time + ", poi_receive_detail='" + this.poi_receive_detail + '\'' + ", recipient_address='" + this.recipient_address + '\'' + ", recipient_name='" + this.recipient_name + '\'' + ", recipient_phone='" + this.recipient_phone + '\'' + ", refund_apply_time=" + this.refund_apply_time + ", refund_complete_time=" + this.refund_complete_time + ", refund_confirm_time=" + this.refund_confirm_time + ", refund_reject_time=" + this.refund_reject_time + ", remark='" + this.remark + '\'' + ", result='" + this.result + '\'' + ", shipper_phone='" + this.shipper_phone + '\'' + ", shipping_fee=" + this.shipping_fee + ", shipping_type=" + this.shipping_type + ", source_id=" + this.source_id + ", status=" + this.status + ", sku_benefit_detail=" + this.sku_benefit_detail + ", total=" + this.total + ", unpaid_time=" + this.unpaid_time + ", utime=" + this.utime + ", user_member_info=" + this.user_member_info + ", wm_order_id_view=" + this.wm_order_id_view + ", wm_poi_address='" + this.wm_poi_address + '\'' + ", wm_poi_id=" + this.wm_poi_id + ", wm_poi_name='" + this.wm_poi_name + '\'' + ", wm_poi_phone='" + this.wm_poi_phone + '\'' + ", package_bag_money=" + this.package_bag_money + '}';
	}

}
