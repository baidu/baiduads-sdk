/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platbusinessorderrefund.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.StatusUnionCase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlatRefundListRequest
 */
@JsonPropertyOrder({
  PlatRefundListRequest.JSON_PROPERTY_UCID,
  PlatRefundListRequest.JSON_PROPERTY_APP_ID,
  PlatRefundListRequest.JSON_PROPERTY_ORDER_ID,
  PlatRefundListRequest.JSON_PROPERTY_SHOP_ID,
  PlatRefundListRequest.JSON_PROPERTY_PASSPORT_ID,
  PlatRefundListRequest.JSON_PROPERTY_REFUND_ID,
  PlatRefundListRequest.JSON_PROPERTY_REFUND_TYPE,
  PlatRefundListRequest.JSON_PROPERTY_REFUND_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_REFUND_REASON,
  PlatRefundListRequest.JSON_PROPERTY_EXPRESS_PHONE,
  PlatRefundListRequest.JSON_PROPERTY_PAGE_NUM,
  PlatRefundListRequest.JSON_PROPERTY_PAGE_COUNT,
  PlatRefundListRequest.JSON_PROPERTY_PRODUCT_TYPE,
  PlatRefundListRequest.JSON_PROPERTY_START_TIME,
  PlatRefundListRequest.JSON_PROPERTY_END_TIME,
  PlatRefundListRequest.JSON_PROPERTY_ORDER_REFUND_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_PAY_TYPE,
  PlatRefundListRequest.JSON_PROPERTY_COMPLAINT_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_CUSTOMER_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_RETURN_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_PRODUCT_NAME,
  PlatRefundListRequest.JSON_PROPERTY_EXPRESS_INFO,
  PlatRefundListRequest.JSON_PROPERTY_STATUS_LIST,
  PlatRefundListRequest.JSON_PROPERTY_DELIVERY_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_AGG_REFUND_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_TAB_REFUND_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_TIMEOUT_SORT_TYPE,
  PlatRefundListRequest.JSON_PROPERTY_RETURN_GOODS_STATUS,
  PlatRefundListRequest.JSON_PROPERTY_REFUND_BASE_REASON,
  PlatRefundListRequest.JSON_PROPERTY_COMPLAINT_JUDGE_RESULT
})
@JsonTypeName("PlatRefundListRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatRefundListRequest {
  public static final String JSON_PROPERTY_UCID = "ucid";
  private Long ucid;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_PASSPORT_ID = "passportId";
  private Long passportId;

  public static final String JSON_PROPERTY_REFUND_ID = "refundId";
  private Long refundId;

  public static final String JSON_PROPERTY_REFUND_TYPE = "refundType";
  private Integer refundType;

  public static final String JSON_PROPERTY_REFUND_STATUS = "refundStatus";
  private Integer refundStatus;

  public static final String JSON_PROPERTY_REFUND_REASON = "refundReason";
  private Integer refundReason;

  public static final String JSON_PROPERTY_EXPRESS_PHONE = "expressPhone";
  private String expressPhone;

  public static final String JSON_PROPERTY_PAGE_NUM = "pageNum";
  private Integer pageNum;

  public static final String JSON_PROPERTY_PAGE_COUNT = "pageCount";
  private Integer pageCount;

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";
  private Integer productType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_ORDER_REFUND_STATUS = "orderRefundStatus";
  private List<Integer> orderRefundStatus = null;

  public static final String JSON_PROPERTY_PAY_TYPE = "payType";
  private Integer payType;

  public static final String JSON_PROPERTY_COMPLAINT_STATUS = "complaintStatus";
  private List<Integer> complaintStatus = null;

  public static final String JSON_PROPERTY_CUSTOMER_STATUS = "customerStatus";
  private List<Integer> customerStatus = null;

  public static final String JSON_PROPERTY_RETURN_STATUS = "returnStatus";
  private Integer returnStatus;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private String productName;

  public static final String JSON_PROPERTY_EXPRESS_INFO = "expressInfo";
  private String expressInfo;

  public static final String JSON_PROPERTY_STATUS_LIST = "statusList";
  private List<StatusUnionCase> statusList = null;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private Integer deliveryStatus;

  public static final String JSON_PROPERTY_AGG_REFUND_STATUS = "aggRefundStatus";
  private List<Integer> aggRefundStatus = null;

  public static final String JSON_PROPERTY_TAB_REFUND_STATUS = "tabRefundStatus";
  private List<Integer> tabRefundStatus = null;

  public static final String JSON_PROPERTY_TIMEOUT_SORT_TYPE = "timeoutSortType";
  private Integer timeoutSortType;

  public static final String JSON_PROPERTY_RETURN_GOODS_STATUS = "returnGoodsStatus";
  private Integer returnGoodsStatus;

  public static final String JSON_PROPERTY_REFUND_BASE_REASON = "refundBaseReason";
  private Integer refundBaseReason;

  public static final String JSON_PROPERTY_COMPLAINT_JUDGE_RESULT = "complaintJudgeResult";
  private Integer complaintJudgeResult;

  public PlatRefundListRequest() { 
  }

  public PlatRefundListRequest ucid(Long ucid) {
    
    this.ucid = ucid;
    return this;
  }

   /**
   * Get ucid
   * @return ucid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUcid() {
    return ucid;
  }


  @JsonProperty(JSON_PROPERTY_UCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUcid(Long ucid) {
    this.ucid = ucid;
  }


  public PlatRefundListRequest appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public PlatRefundListRequest orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public PlatRefundListRequest shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * Get shopId
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopId() {
    return shopId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public PlatRefundListRequest passportId(Long passportId) {
    
    this.passportId = passportId;
    return this;
  }

   /**
   * Get passportId
   * @return passportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPassportId() {
    return passportId;
  }


  @JsonProperty(JSON_PROPERTY_PASSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassportId(Long passportId) {
    this.passportId = passportId;
  }


  public PlatRefundListRequest refundId(Long refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Get refundId
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRefundId() {
    return refundId;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundId(Long refundId) {
    this.refundId = refundId;
  }


  public PlatRefundListRequest refundType(Integer refundType) {
    
    this.refundType = refundType;
    return this;
  }

   /**
   * Get refundType
   * @return refundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundType() {
    return refundType;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundType(Integer refundType) {
    this.refundType = refundType;
  }


  public PlatRefundListRequest refundStatus(Integer refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * Get refundStatus
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundStatus() {
    return refundStatus;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundStatus(Integer refundStatus) {
    this.refundStatus = refundStatus;
  }


  public PlatRefundListRequest refundReason(Integer refundReason) {
    
    this.refundReason = refundReason;
    return this;
  }

   /**
   * Get refundReason
   * @return refundReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundReason() {
    return refundReason;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundReason(Integer refundReason) {
    this.refundReason = refundReason;
  }


  public PlatRefundListRequest expressPhone(String expressPhone) {
    
    this.expressPhone = expressPhone;
    return this;
  }

   /**
   * Get expressPhone
   * @return expressPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPRESS_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpressPhone() {
    return expressPhone;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESS_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpressPhone(String expressPhone) {
    this.expressPhone = expressPhone;
  }


  public PlatRefundListRequest pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNum() {
    return pageNum;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public PlatRefundListRequest pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public PlatRefundListRequest productType(Integer productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductType() {
    return productType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductType(Integer productType) {
    this.productType = productType;
  }


  public PlatRefundListRequest startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PlatRefundListRequest endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PlatRefundListRequest orderRefundStatus(List<Integer> orderRefundStatus) {
    
    this.orderRefundStatus = orderRefundStatus;
    return this;
  }

  public PlatRefundListRequest addOrderRefundStatusItem(Integer orderRefundStatusItem) {
    if (this.orderRefundStatus == null) {
      this.orderRefundStatus = new ArrayList<>();
    }
    this.orderRefundStatus.add(orderRefundStatusItem);
    return this;
  }

   /**
   * Get orderRefundStatus
   * @return orderRefundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getOrderRefundStatus() {
    return orderRefundStatus;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderRefundStatus(List<Integer> orderRefundStatus) {
    this.orderRefundStatus = orderRefundStatus;
  }


  public PlatRefundListRequest payType(Integer payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * Get payType
   * @return payType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPayType() {
    return payType;
  }


  @JsonProperty(JSON_PROPERTY_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayType(Integer payType) {
    this.payType = payType;
  }


  public PlatRefundListRequest complaintStatus(List<Integer> complaintStatus) {
    
    this.complaintStatus = complaintStatus;
    return this;
  }

  public PlatRefundListRequest addComplaintStatusItem(Integer complaintStatusItem) {
    if (this.complaintStatus == null) {
      this.complaintStatus = new ArrayList<>();
    }
    this.complaintStatus.add(complaintStatusItem);
    return this;
  }

   /**
   * Get complaintStatus
   * @return complaintStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLAINT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getComplaintStatus() {
    return complaintStatus;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintStatus(List<Integer> complaintStatus) {
    this.complaintStatus = complaintStatus;
  }


  public PlatRefundListRequest customerStatus(List<Integer> customerStatus) {
    
    this.customerStatus = customerStatus;
    return this;
  }

  public PlatRefundListRequest addCustomerStatusItem(Integer customerStatusItem) {
    if (this.customerStatus == null) {
      this.customerStatus = new ArrayList<>();
    }
    this.customerStatus.add(customerStatusItem);
    return this;
  }

   /**
   * Get customerStatus
   * @return customerStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getCustomerStatus() {
    return customerStatus;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerStatus(List<Integer> customerStatus) {
    this.customerStatus = customerStatus;
  }


  public PlatRefundListRequest returnStatus(Integer returnStatus) {
    
    this.returnStatus = returnStatus;
    return this;
  }

   /**
   * Get returnStatus
   * @return returnStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReturnStatus() {
    return returnStatus;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnStatus(Integer returnStatus) {
    this.returnStatus = returnStatus;
  }


  public PlatRefundListRequest productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductName() {
    return productName;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductName(String productName) {
    this.productName = productName;
  }


  public PlatRefundListRequest expressInfo(String expressInfo) {
    
    this.expressInfo = expressInfo;
    return this;
  }

   /**
   * Get expressInfo
   * @return expressInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpressInfo() {
    return expressInfo;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpressInfo(String expressInfo) {
    this.expressInfo = expressInfo;
  }


  public PlatRefundListRequest statusList(List<StatusUnionCase> statusList) {
    
    this.statusList = statusList;
    return this;
  }

  public PlatRefundListRequest addStatusListItem(StatusUnionCase statusListItem) {
    if (this.statusList == null) {
      this.statusList = new ArrayList<>();
    }
    this.statusList.add(statusListItem);
    return this;
  }

   /**
   * Get statusList
   * @return statusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StatusUnionCase> getStatusList() {
    return statusList;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusList(List<StatusUnionCase> statusList) {
    this.statusList = statusList;
  }


  public PlatRefundListRequest deliveryStatus(Integer deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(Integer deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public PlatRefundListRequest aggRefundStatus(List<Integer> aggRefundStatus) {
    
    this.aggRefundStatus = aggRefundStatus;
    return this;
  }

  public PlatRefundListRequest addAggRefundStatusItem(Integer aggRefundStatusItem) {
    if (this.aggRefundStatus == null) {
      this.aggRefundStatus = new ArrayList<>();
    }
    this.aggRefundStatus.add(aggRefundStatusItem);
    return this;
  }

   /**
   * Get aggRefundStatus
   * @return aggRefundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGG_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getAggRefundStatus() {
    return aggRefundStatus;
  }


  @JsonProperty(JSON_PROPERTY_AGG_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggRefundStatus(List<Integer> aggRefundStatus) {
    this.aggRefundStatus = aggRefundStatus;
  }


  public PlatRefundListRequest tabRefundStatus(List<Integer> tabRefundStatus) {
    
    this.tabRefundStatus = tabRefundStatus;
    return this;
  }

  public PlatRefundListRequest addTabRefundStatusItem(Integer tabRefundStatusItem) {
    if (this.tabRefundStatus == null) {
      this.tabRefundStatus = new ArrayList<>();
    }
    this.tabRefundStatus.add(tabRefundStatusItem);
    return this;
  }

   /**
   * Get tabRefundStatus
   * @return tabRefundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAB_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTabRefundStatus() {
    return tabRefundStatus;
  }


  @JsonProperty(JSON_PROPERTY_TAB_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabRefundStatus(List<Integer> tabRefundStatus) {
    this.tabRefundStatus = tabRefundStatus;
  }


  public PlatRefundListRequest timeoutSortType(Integer timeoutSortType) {
    
    this.timeoutSortType = timeoutSortType;
    return this;
  }

   /**
   * Get timeoutSortType
   * @return timeoutSortType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutSortType() {
    return timeoutSortType;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutSortType(Integer timeoutSortType) {
    this.timeoutSortType = timeoutSortType;
  }


  public PlatRefundListRequest returnGoodsStatus(Integer returnGoodsStatus) {
    
    this.returnGoodsStatus = returnGoodsStatus;
    return this;
  }

   /**
   * Get returnGoodsStatus
   * @return returnGoodsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_GOODS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReturnGoodsStatus() {
    return returnGoodsStatus;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_GOODS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnGoodsStatus(Integer returnGoodsStatus) {
    this.returnGoodsStatus = returnGoodsStatus;
  }


  public PlatRefundListRequest refundBaseReason(Integer refundBaseReason) {
    
    this.refundBaseReason = refundBaseReason;
    return this;
  }

   /**
   * Get refundBaseReason
   * @return refundBaseReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_BASE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundBaseReason() {
    return refundBaseReason;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_BASE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundBaseReason(Integer refundBaseReason) {
    this.refundBaseReason = refundBaseReason;
  }


  public PlatRefundListRequest complaintJudgeResult(Integer complaintJudgeResult) {
    
    this.complaintJudgeResult = complaintJudgeResult;
    return this;
  }

   /**
   * Get complaintJudgeResult
   * @return complaintJudgeResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLAINT_JUDGE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComplaintJudgeResult() {
    return complaintJudgeResult;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_JUDGE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintJudgeResult(Integer complaintJudgeResult) {
    this.complaintJudgeResult = complaintJudgeResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatRefundListRequest platRefundListRequest = (PlatRefundListRequest) o;
    return Objects.equals(this.ucid, platRefundListRequest.ucid) &&
        Objects.equals(this.appId, platRefundListRequest.appId) &&
        Objects.equals(this.orderId, platRefundListRequest.orderId) &&
        Objects.equals(this.shopId, platRefundListRequest.shopId) &&
        Objects.equals(this.passportId, platRefundListRequest.passportId) &&
        Objects.equals(this.refundId, platRefundListRequest.refundId) &&
        Objects.equals(this.refundType, platRefundListRequest.refundType) &&
        Objects.equals(this.refundStatus, platRefundListRequest.refundStatus) &&
        Objects.equals(this.refundReason, platRefundListRequest.refundReason) &&
        Objects.equals(this.expressPhone, platRefundListRequest.expressPhone) &&
        Objects.equals(this.pageNum, platRefundListRequest.pageNum) &&
        Objects.equals(this.pageCount, platRefundListRequest.pageCount) &&
        Objects.equals(this.productType, platRefundListRequest.productType) &&
        Objects.equals(this.startTime, platRefundListRequest.startTime) &&
        Objects.equals(this.endTime, platRefundListRequest.endTime) &&
        Objects.equals(this.orderRefundStatus, platRefundListRequest.orderRefundStatus) &&
        Objects.equals(this.payType, platRefundListRequest.payType) &&
        Objects.equals(this.complaintStatus, platRefundListRequest.complaintStatus) &&
        Objects.equals(this.customerStatus, platRefundListRequest.customerStatus) &&
        Objects.equals(this.returnStatus, platRefundListRequest.returnStatus) &&
        Objects.equals(this.productName, platRefundListRequest.productName) &&
        Objects.equals(this.expressInfo, platRefundListRequest.expressInfo) &&
        Objects.equals(this.statusList, platRefundListRequest.statusList) &&
        Objects.equals(this.deliveryStatus, platRefundListRequest.deliveryStatus) &&
        Objects.equals(this.aggRefundStatus, platRefundListRequest.aggRefundStatus) &&
        Objects.equals(this.tabRefundStatus, platRefundListRequest.tabRefundStatus) &&
        Objects.equals(this.timeoutSortType, platRefundListRequest.timeoutSortType) &&
        Objects.equals(this.returnGoodsStatus, platRefundListRequest.returnGoodsStatus) &&
        Objects.equals(this.refundBaseReason, platRefundListRequest.refundBaseReason) &&
        Objects.equals(this.complaintJudgeResult, platRefundListRequest.complaintJudgeResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ucid, appId, orderId, shopId, passportId, refundId, refundType, refundStatus, refundReason, expressPhone, pageNum, pageCount, productType, startTime, endTime, orderRefundStatus, payType, complaintStatus, customerStatus, returnStatus, productName, expressInfo, statusList, deliveryStatus, aggRefundStatus, tabRefundStatus, timeoutSortType, returnGoodsStatus, refundBaseReason, complaintJudgeResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatRefundListRequest {\n");
    sb.append("    ucid: ").append(toIndentedString(ucid)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    passportId: ").append(toIndentedString(passportId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    expressPhone: ").append(toIndentedString(expressPhone)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    orderRefundStatus: ").append(toIndentedString(orderRefundStatus)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    complaintStatus: ").append(toIndentedString(complaintStatus)).append("\n");
    sb.append("    customerStatus: ").append(toIndentedString(customerStatus)).append("\n");
    sb.append("    returnStatus: ").append(toIndentedString(returnStatus)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    expressInfo: ").append(toIndentedString(expressInfo)).append("\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    aggRefundStatus: ").append(toIndentedString(aggRefundStatus)).append("\n");
    sb.append("    tabRefundStatus: ").append(toIndentedString(tabRefundStatus)).append("\n");
    sb.append("    timeoutSortType: ").append(toIndentedString(timeoutSortType)).append("\n");
    sb.append("    returnGoodsStatus: ").append(toIndentedString(returnGoodsStatus)).append("\n");
    sb.append("    refundBaseReason: ").append(toIndentedString(refundBaseReason)).append("\n");
    sb.append("    complaintJudgeResult: ").append(toIndentedString(complaintJudgeResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
