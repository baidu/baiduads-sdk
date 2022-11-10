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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlatRefundInfoRequest
 */
@JsonPropertyOrder({
  PlatRefundInfoRequest.JSON_PROPERTY_UCID,
  PlatRefundInfoRequest.JSON_PROPERTY_APP_ID,
  PlatRefundInfoRequest.JSON_PROPERTY_REFUND_ID,
  PlatRefundInfoRequest.JSON_PROPERTY_SHOP_ID
})
@JsonTypeName("PlatRefundInfoRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatRefundInfoRequest {
  public static final String JSON_PROPERTY_UCID = "ucid";
  private Long ucid;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_REFUND_ID = "refundId";
  private Long refundId;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public PlatRefundInfoRequest() { 
  }

  public PlatRefundInfoRequest ucid(Long ucid) {
    
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


  public PlatRefundInfoRequest appId(Integer appId) {
    
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


  public PlatRefundInfoRequest refundId(Long refundId) {
    
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


  public PlatRefundInfoRequest shopId(Long shopId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatRefundInfoRequest platRefundInfoRequest = (PlatRefundInfoRequest) o;
    return Objects.equals(this.ucid, platRefundInfoRequest.ucid) &&
        Objects.equals(this.appId, platRefundInfoRequest.appId) &&
        Objects.equals(this.refundId, platRefundInfoRequest.refundId) &&
        Objects.equals(this.shopId, platRefundInfoRequest.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ucid, appId, refundId, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatRefundInfoRequest {\n");
    sb.append("    ucid: ").append(toIndentedString(ucid)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
