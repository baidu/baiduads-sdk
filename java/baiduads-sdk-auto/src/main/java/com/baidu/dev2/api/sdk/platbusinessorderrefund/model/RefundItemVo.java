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
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.OrderRefundExpressInfo;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.RefundExpressVo;
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
 * RefundItemVo
 */
@JsonPropertyOrder({
  RefundItemVo.JSON_PROPERTY_ORDER_ID,
  RefundItemVo.JSON_PROPERTY_REFUND_ID,
  RefundItemVo.JSON_PROPERTY_REFUND_TYPE,
  RefundItemVo.JSON_PROPERTY_REFUND_STATUS,
  RefundItemVo.JSON_PROPERTY_PRODUCT_NAME,
  RefundItemVo.JSON_PROPERTY_REFUND_AMOUNT,
  RefundItemVo.JSON_PROPERTY_ORDER_PAYMENT,
  RefundItemVo.JSON_PROPERTY_REFUND_DESC,
  RefundItemVo.JSON_PROPERTY_EXPRESS_PHONE,
  RefundItemVo.JSON_PROPERTY_CONTACT_NAME,
  RefundItemVo.JSON_PROPERTY_APPLY_TIME,
  RefundItemVo.JSON_PROPERTY_REFUND_IMAGE,
  RefundItemVo.JSON_PROPERTY_REFUND_STATUS_TEXT,
  RefundItemVo.JSON_PROPERTY_REFUND_TYPE_TEXT,
  RefundItemVo.JSON_PROPERTY_REFUND_REASON_TEXT,
  RefundItemVo.JSON_PROPERTY_EXPRESS_INFO,
  RefundItemVo.JSON_PROPERTY_TIMEOUT_DATE,
  RefundItemVo.JSON_PROPERTY_AGG_RETURN_STATUS,
  RefundItemVo.JSON_PROPERTY_AGG_RETURN_STATUS_TEXT,
  RefundItemVo.JSON_PROPERTY_DELIVERY_STATUS_TEXT,
  RefundItemVo.JSON_PROPERTY_ORDER_DETAIL_ID,
  RefundItemVo.JSON_PROPERTY_REJECT_REASON,
  RefundItemVo.JSON_PROPERTY_REJECT_PROOF,
  RefundItemVo.JSON_PROPERTY_SHOP_ID,
  RefundItemVo.JSON_PROPERTY_SKU_ID,
  RefundItemVo.JSON_PROPERTY_SKU_DESC,
  RefundItemVo.JSON_PROPERTY_PRODUCT_ID,
  RefundItemVo.JSON_PROPERTY_RETURN_TIME,
  RefundItemVo.JSON_PROPERTY_PRODUCT_IMAGE,
  RefundItemVo.JSON_PROPERTY_REFUND_NUM,
  RefundItemVo.JSON_PROPERTY_UCID,
  RefundItemVo.JSON_PROPERTY_LAST_OPERATION_TIME,
  RefundItemVo.JSON_PROPERTY_SELL_PRICE,
  RefundItemVo.JSON_PROPERTY_CREATE_TIME,
  RefundItemVo.JSON_PROPERTY_SHOP_NAME,
  RefundItemVo.JSON_PROPERTY_EXCHANGE_EXPRESS,
  RefundItemVo.JSON_PROPERTY_FINISH_TIME,
  RefundItemVo.JSON_PROPERTY_ENCODE_PASS_ID
})
@JsonTypeName("RefundItemVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundItemVo {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_REFUND_ID = "refundId";
  private String refundId;

  public static final String JSON_PROPERTY_REFUND_TYPE = "refundType";
  private Integer refundType;

  public static final String JSON_PROPERTY_REFUND_STATUS = "refundStatus";
  private Integer refundStatus;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private String productName;

  public static final String JSON_PROPERTY_REFUND_AMOUNT = "refundAmount";
  private String refundAmount;

  public static final String JSON_PROPERTY_ORDER_PAYMENT = "orderPayment";
  private String orderPayment;

  public static final String JSON_PROPERTY_REFUND_DESC = "refundDesc";
  private String refundDesc;

  public static final String JSON_PROPERTY_EXPRESS_PHONE = "expressPhone";
  private String expressPhone;

  public static final String JSON_PROPERTY_CONTACT_NAME = "contactName";
  private String contactName;

  public static final String JSON_PROPERTY_APPLY_TIME = "applyTime";
  private String applyTime;

  public static final String JSON_PROPERTY_REFUND_IMAGE = "refundImage";
  private List<String> refundImage = null;

  public static final String JSON_PROPERTY_REFUND_STATUS_TEXT = "refundStatusText";
  private String refundStatusText;

  public static final String JSON_PROPERTY_REFUND_TYPE_TEXT = "refundTypeText";
  private String refundTypeText;

  public static final String JSON_PROPERTY_REFUND_REASON_TEXT = "refundReasonText";
  private String refundReasonText;

  public static final String JSON_PROPERTY_EXPRESS_INFO = "expressInfo";
  private OrderRefundExpressInfo expressInfo;

  public static final String JSON_PROPERTY_TIMEOUT_DATE = "timeoutDate";
  private String timeoutDate;

  public static final String JSON_PROPERTY_AGG_RETURN_STATUS = "aggReturnStatus";
  private Integer aggReturnStatus;

  public static final String JSON_PROPERTY_AGG_RETURN_STATUS_TEXT = "aggReturnStatusText";
  private String aggReturnStatusText;

  public static final String JSON_PROPERTY_DELIVERY_STATUS_TEXT = "deliveryStatusText";
  private String deliveryStatusText;

  public static final String JSON_PROPERTY_ORDER_DETAIL_ID = "orderDetailId";
  private String orderDetailId;

  public static final String JSON_PROPERTY_REJECT_REASON = "rejectReason";
  private String rejectReason;

  public static final String JSON_PROPERTY_REJECT_PROOF = "rejectProof";
  private List<String> rejectProof = null;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_SKU_ID = "skuId";
  private String skuId;

  public static final String JSON_PROPERTY_SKU_DESC = "skuDesc";
  private String skuDesc;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_RETURN_TIME = "returnTime";
  private String returnTime;

  public static final String JSON_PROPERTY_PRODUCT_IMAGE = "productImage";
  private String productImage;

  public static final String JSON_PROPERTY_REFUND_NUM = "refundNum";
  private Integer refundNum;

  public static final String JSON_PROPERTY_UCID = "ucid";
  private Long ucid;

  public static final String JSON_PROPERTY_LAST_OPERATION_TIME = "lastOperationTime";
  private String lastOperationTime;

  public static final String JSON_PROPERTY_SELL_PRICE = "sellPrice";
  private Long sellPrice;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private String createTime;

  public static final String JSON_PROPERTY_SHOP_NAME = "shopName";
  private String shopName;

  public static final String JSON_PROPERTY_EXCHANGE_EXPRESS = "exchangeExpress";
  private RefundExpressVo exchangeExpress;

  public static final String JSON_PROPERTY_FINISH_TIME = "finishTime";
  private String finishTime;

  public static final String JSON_PROPERTY_ENCODE_PASS_ID = "encodePassId";
  private String encodePassId;

  public RefundItemVo() { 
  }

  public RefundItemVo orderId(String orderId) {
    
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

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public RefundItemVo refundId(String refundId) {
    
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

  public String getRefundId() {
    return refundId;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public RefundItemVo refundType(Integer refundType) {
    
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


  public RefundItemVo refundStatus(Integer refundStatus) {
    
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


  public RefundItemVo productName(String productName) {
    
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


  public RefundItemVo refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundAmount() {
    return refundAmount;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public RefundItemVo orderPayment(String orderPayment) {
    
    this.orderPayment = orderPayment;
    return this;
  }

   /**
   * Get orderPayment
   * @return orderPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderPayment() {
    return orderPayment;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderPayment(String orderPayment) {
    this.orderPayment = orderPayment;
  }


  public RefundItemVo refundDesc(String refundDesc) {
    
    this.refundDesc = refundDesc;
    return this;
  }

   /**
   * Get refundDesc
   * @return refundDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundDesc() {
    return refundDesc;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundDesc(String refundDesc) {
    this.refundDesc = refundDesc;
  }


  public RefundItemVo expressPhone(String expressPhone) {
    
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


  public RefundItemVo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactName() {
    return contactName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public RefundItemVo applyTime(String applyTime) {
    
    this.applyTime = applyTime;
    return this;
  }

   /**
   * Get applyTime
   * @return applyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplyTime() {
    return applyTime;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyTime(String applyTime) {
    this.applyTime = applyTime;
  }


  public RefundItemVo refundImage(List<String> refundImage) {
    
    this.refundImage = refundImage;
    return this;
  }

  public RefundItemVo addRefundImageItem(String refundImageItem) {
    if (this.refundImage == null) {
      this.refundImage = new ArrayList<>();
    }
    this.refundImage.add(refundImageItem);
    return this;
  }

   /**
   * Get refundImage
   * @return refundImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRefundImage() {
    return refundImage;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundImage(List<String> refundImage) {
    this.refundImage = refundImage;
  }


  public RefundItemVo refundStatusText(String refundStatusText) {
    
    this.refundStatusText = refundStatusText;
    return this;
  }

   /**
   * Get refundStatusText
   * @return refundStatusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundStatusText() {
    return refundStatusText;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundStatusText(String refundStatusText) {
    this.refundStatusText = refundStatusText;
  }


  public RefundItemVo refundTypeText(String refundTypeText) {
    
    this.refundTypeText = refundTypeText;
    return this;
  }

   /**
   * Get refundTypeText
   * @return refundTypeText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_TYPE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundTypeText() {
    return refundTypeText;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_TYPE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundTypeText(String refundTypeText) {
    this.refundTypeText = refundTypeText;
  }


  public RefundItemVo refundReasonText(String refundReasonText) {
    
    this.refundReasonText = refundReasonText;
    return this;
  }

   /**
   * Get refundReasonText
   * @return refundReasonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundReasonText() {
    return refundReasonText;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundReasonText(String refundReasonText) {
    this.refundReasonText = refundReasonText;
  }


  public RefundItemVo expressInfo(OrderRefundExpressInfo expressInfo) {
    
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

  public OrderRefundExpressInfo getExpressInfo() {
    return expressInfo;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpressInfo(OrderRefundExpressInfo expressInfo) {
    this.expressInfo = expressInfo;
  }


  public RefundItemVo timeoutDate(String timeoutDate) {
    
    this.timeoutDate = timeoutDate;
    return this;
  }

   /**
   * Get timeoutDate
   * @return timeoutDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeoutDate() {
    return timeoutDate;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutDate(String timeoutDate) {
    this.timeoutDate = timeoutDate;
  }


  public RefundItemVo aggReturnStatus(Integer aggReturnStatus) {
    
    this.aggReturnStatus = aggReturnStatus;
    return this;
  }

   /**
   * Get aggReturnStatus
   * @return aggReturnStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGG_RETURN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAggReturnStatus() {
    return aggReturnStatus;
  }


  @JsonProperty(JSON_PROPERTY_AGG_RETURN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggReturnStatus(Integer aggReturnStatus) {
    this.aggReturnStatus = aggReturnStatus;
  }


  public RefundItemVo aggReturnStatusText(String aggReturnStatusText) {
    
    this.aggReturnStatusText = aggReturnStatusText;
    return this;
  }

   /**
   * Get aggReturnStatusText
   * @return aggReturnStatusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGG_RETURN_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAggReturnStatusText() {
    return aggReturnStatusText;
  }


  @JsonProperty(JSON_PROPERTY_AGG_RETURN_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggReturnStatusText(String aggReturnStatusText) {
    this.aggReturnStatusText = aggReturnStatusText;
  }


  public RefundItemVo deliveryStatusText(String deliveryStatusText) {
    
    this.deliveryStatusText = deliveryStatusText;
    return this;
  }

   /**
   * Get deliveryStatusText
   * @return deliveryStatusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryStatusText() {
    return deliveryStatusText;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatusText(String deliveryStatusText) {
    this.deliveryStatusText = deliveryStatusText;
  }


  public RefundItemVo orderDetailId(String orderDetailId) {
    
    this.orderDetailId = orderDetailId;
    return this;
  }

   /**
   * Get orderDetailId
   * @return orderDetailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_DETAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderDetailId() {
    return orderDetailId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_DETAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderDetailId(String orderDetailId) {
    this.orderDetailId = orderDetailId;
  }


  public RefundItemVo rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Get rejectReason
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REJECT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRejectReason() {
    return rejectReason;
  }


  @JsonProperty(JSON_PROPERTY_REJECT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public RefundItemVo rejectProof(List<String> rejectProof) {
    
    this.rejectProof = rejectProof;
    return this;
  }

  public RefundItemVo addRejectProofItem(String rejectProofItem) {
    if (this.rejectProof == null) {
      this.rejectProof = new ArrayList<>();
    }
    this.rejectProof.add(rejectProofItem);
    return this;
  }

   /**
   * Get rejectProof
   * @return rejectProof
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REJECT_PROOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRejectProof() {
    return rejectProof;
  }


  @JsonProperty(JSON_PROPERTY_REJECT_PROOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectProof(List<String> rejectProof) {
    this.rejectProof = rejectProof;
  }


  public RefundItemVo shopId(Long shopId) {
    
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


  public RefundItemVo skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * Get skuId
   * @return skuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSkuId() {
    return skuId;
  }


  @JsonProperty(JSON_PROPERTY_SKU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public RefundItemVo skuDesc(String skuDesc) {
    
    this.skuDesc = skuDesc;
    return this;
  }

   /**
   * Get skuDesc
   * @return skuDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSkuDesc() {
    return skuDesc;
  }


  @JsonProperty(JSON_PROPERTY_SKU_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }


  public RefundItemVo productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public RefundItemVo returnTime(String returnTime) {
    
    this.returnTime = returnTime;
    return this;
  }

   /**
   * Get returnTime
   * @return returnTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnTime() {
    return returnTime;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnTime(String returnTime) {
    this.returnTime = returnTime;
  }


  public RefundItemVo productImage(String productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductImage() {
    return productImage;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }


  public RefundItemVo refundNum(Integer refundNum) {
    
    this.refundNum = refundNum;
    return this;
  }

   /**
   * Get refundNum
   * @return refundNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundNum() {
    return refundNum;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundNum(Integer refundNum) {
    this.refundNum = refundNum;
  }


  public RefundItemVo ucid(Long ucid) {
    
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


  public RefundItemVo lastOperationTime(String lastOperationTime) {
    
    this.lastOperationTime = lastOperationTime;
    return this;
  }

   /**
   * Get lastOperationTime
   * @return lastOperationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_OPERATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastOperationTime() {
    return lastOperationTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OPERATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOperationTime(String lastOperationTime) {
    this.lastOperationTime = lastOperationTime;
  }


  public RefundItemVo sellPrice(Long sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * Get sellPrice
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSellPrice() {
    return sellPrice;
  }


  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellPrice(Long sellPrice) {
    this.sellPrice = sellPrice;
  }


  public RefundItemVo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public RefundItemVo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * Get shopName
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopName() {
    return shopName;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public RefundItemVo exchangeExpress(RefundExpressVo exchangeExpress) {
    
    this.exchangeExpress = exchangeExpress;
    return this;
  }

   /**
   * Get exchangeExpress
   * @return exchangeExpress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_EXPRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundExpressVo getExchangeExpress() {
    return exchangeExpress;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_EXPRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeExpress(RefundExpressVo exchangeExpress) {
    this.exchangeExpress = exchangeExpress;
  }


  public RefundItemVo finishTime(String finishTime) {
    
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Get finishTime
   * @return finishTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINISH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinishTime() {
    return finishTime;
  }


  @JsonProperty(JSON_PROPERTY_FINISH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }


  public RefundItemVo encodePassId(String encodePassId) {
    
    this.encodePassId = encodePassId;
    return this;
  }

   /**
   * Get encodePassId
   * @return encodePassId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCODE_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodePassId() {
    return encodePassId;
  }


  @JsonProperty(JSON_PROPERTY_ENCODE_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncodePassId(String encodePassId) {
    this.encodePassId = encodePassId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundItemVo refundItemVo = (RefundItemVo) o;
    return Objects.equals(this.orderId, refundItemVo.orderId) &&
        Objects.equals(this.refundId, refundItemVo.refundId) &&
        Objects.equals(this.refundType, refundItemVo.refundType) &&
        Objects.equals(this.refundStatus, refundItemVo.refundStatus) &&
        Objects.equals(this.productName, refundItemVo.productName) &&
        Objects.equals(this.refundAmount, refundItemVo.refundAmount) &&
        Objects.equals(this.orderPayment, refundItemVo.orderPayment) &&
        Objects.equals(this.refundDesc, refundItemVo.refundDesc) &&
        Objects.equals(this.expressPhone, refundItemVo.expressPhone) &&
        Objects.equals(this.contactName, refundItemVo.contactName) &&
        Objects.equals(this.applyTime, refundItemVo.applyTime) &&
        Objects.equals(this.refundImage, refundItemVo.refundImage) &&
        Objects.equals(this.refundStatusText, refundItemVo.refundStatusText) &&
        Objects.equals(this.refundTypeText, refundItemVo.refundTypeText) &&
        Objects.equals(this.refundReasonText, refundItemVo.refundReasonText) &&
        Objects.equals(this.expressInfo, refundItemVo.expressInfo) &&
        Objects.equals(this.timeoutDate, refundItemVo.timeoutDate) &&
        Objects.equals(this.aggReturnStatus, refundItemVo.aggReturnStatus) &&
        Objects.equals(this.aggReturnStatusText, refundItemVo.aggReturnStatusText) &&
        Objects.equals(this.deliveryStatusText, refundItemVo.deliveryStatusText) &&
        Objects.equals(this.orderDetailId, refundItemVo.orderDetailId) &&
        Objects.equals(this.rejectReason, refundItemVo.rejectReason) &&
        Objects.equals(this.rejectProof, refundItemVo.rejectProof) &&
        Objects.equals(this.shopId, refundItemVo.shopId) &&
        Objects.equals(this.skuId, refundItemVo.skuId) &&
        Objects.equals(this.skuDesc, refundItemVo.skuDesc) &&
        Objects.equals(this.productId, refundItemVo.productId) &&
        Objects.equals(this.returnTime, refundItemVo.returnTime) &&
        Objects.equals(this.productImage, refundItemVo.productImage) &&
        Objects.equals(this.refundNum, refundItemVo.refundNum) &&
        Objects.equals(this.ucid, refundItemVo.ucid) &&
        Objects.equals(this.lastOperationTime, refundItemVo.lastOperationTime) &&
        Objects.equals(this.sellPrice, refundItemVo.sellPrice) &&
        Objects.equals(this.createTime, refundItemVo.createTime) &&
        Objects.equals(this.shopName, refundItemVo.shopName) &&
        Objects.equals(this.exchangeExpress, refundItemVo.exchangeExpress) &&
        Objects.equals(this.finishTime, refundItemVo.finishTime) &&
        Objects.equals(this.encodePassId, refundItemVo.encodePassId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, refundId, refundType, refundStatus, productName, refundAmount, orderPayment, refundDesc, expressPhone, contactName, applyTime, refundImage, refundStatusText, refundTypeText, refundReasonText, expressInfo, timeoutDate, aggReturnStatus, aggReturnStatusText, deliveryStatusText, orderDetailId, rejectReason, rejectProof, shopId, skuId, skuDesc, productId, returnTime, productImage, refundNum, ucid, lastOperationTime, sellPrice, createTime, shopName, exchangeExpress, finishTime, encodePassId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundItemVo {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    orderPayment: ").append(toIndentedString(orderPayment)).append("\n");
    sb.append("    refundDesc: ").append(toIndentedString(refundDesc)).append("\n");
    sb.append("    expressPhone: ").append(toIndentedString(expressPhone)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
    sb.append("    refundImage: ").append(toIndentedString(refundImage)).append("\n");
    sb.append("    refundStatusText: ").append(toIndentedString(refundStatusText)).append("\n");
    sb.append("    refundTypeText: ").append(toIndentedString(refundTypeText)).append("\n");
    sb.append("    refundReasonText: ").append(toIndentedString(refundReasonText)).append("\n");
    sb.append("    expressInfo: ").append(toIndentedString(expressInfo)).append("\n");
    sb.append("    timeoutDate: ").append(toIndentedString(timeoutDate)).append("\n");
    sb.append("    aggReturnStatus: ").append(toIndentedString(aggReturnStatus)).append("\n");
    sb.append("    aggReturnStatusText: ").append(toIndentedString(aggReturnStatusText)).append("\n");
    sb.append("    deliveryStatusText: ").append(toIndentedString(deliveryStatusText)).append("\n");
    sb.append("    orderDetailId: ").append(toIndentedString(orderDetailId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    rejectProof: ").append(toIndentedString(rejectProof)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuDesc: ").append(toIndentedString(skuDesc)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    returnTime: ").append(toIndentedString(returnTime)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    refundNum: ").append(toIndentedString(refundNum)).append("\n");
    sb.append("    ucid: ").append(toIndentedString(ucid)).append("\n");
    sb.append("    lastOperationTime: ").append(toIndentedString(lastOperationTime)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    exchangeExpress: ").append(toIndentedString(exchangeExpress)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    encodePassId: ").append(toIndentedString(encodePassId)).append("\n");
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

