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
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.OrderDetailAdjustFlow;
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
 * OrderDetailAdjustInfo
 */
@JsonPropertyOrder({
  OrderDetailAdjustInfo.JSON_PROPERTY_SUB_ORDER_ID,
  OrderDetailAdjustInfo.JSON_PROPERTY_ORIGINAL_PRICE,
  OrderDetailAdjustInfo.JSON_PROPERTY_ORIGINAL_FREIGHT,
  OrderDetailAdjustInfo.JSON_PROPERTY_ADJUST_FLOWS
})
@JsonTypeName("OrderDetailAdjustInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderDetailAdjustInfo {
  public static final String JSON_PROPERTY_SUB_ORDER_ID = "subOrderId";
  private Long subOrderId;

  public static final String JSON_PROPERTY_ORIGINAL_PRICE = "originalPrice";
  private Long originalPrice;

  public static final String JSON_PROPERTY_ORIGINAL_FREIGHT = "originalFreight";
  private Long originalFreight;

  public static final String JSON_PROPERTY_ADJUST_FLOWS = "adjustFlows";
  private List<OrderDetailAdjustFlow> adjustFlows = null;

  public OrderDetailAdjustInfo() { 
  }

  public OrderDetailAdjustInfo subOrderId(Long subOrderId) {
    
    this.subOrderId = subOrderId;
    return this;
  }

   /**
   * Get subOrderId
   * @return subOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubOrderId() {
    return subOrderId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
  }


  public OrderDetailAdjustInfo originalPrice(Long originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOriginalPrice() {
    return originalPrice;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalPrice(Long originalPrice) {
    this.originalPrice = originalPrice;
  }


  public OrderDetailAdjustInfo originalFreight(Long originalFreight) {
    
    this.originalFreight = originalFreight;
    return this;
  }

   /**
   * Get originalFreight
   * @return originalFreight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FREIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOriginalFreight() {
    return originalFreight;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_FREIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalFreight(Long originalFreight) {
    this.originalFreight = originalFreight;
  }


  public OrderDetailAdjustInfo adjustFlows(List<OrderDetailAdjustFlow> adjustFlows) {
    
    this.adjustFlows = adjustFlows;
    return this;
  }

  public OrderDetailAdjustInfo addAdjustFlowsItem(OrderDetailAdjustFlow adjustFlowsItem) {
    if (this.adjustFlows == null) {
      this.adjustFlows = new ArrayList<>();
    }
    this.adjustFlows.add(adjustFlowsItem);
    return this;
  }

   /**
   * Get adjustFlows
   * @return adjustFlows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADJUST_FLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderDetailAdjustFlow> getAdjustFlows() {
    return adjustFlows;
  }


  @JsonProperty(JSON_PROPERTY_ADJUST_FLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjustFlows(List<OrderDetailAdjustFlow> adjustFlows) {
    this.adjustFlows = adjustFlows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailAdjustInfo orderDetailAdjustInfo = (OrderDetailAdjustInfo) o;
    return Objects.equals(this.subOrderId, orderDetailAdjustInfo.subOrderId) &&
        Objects.equals(this.originalPrice, orderDetailAdjustInfo.originalPrice) &&
        Objects.equals(this.originalFreight, orderDetailAdjustInfo.originalFreight) &&
        Objects.equals(this.adjustFlows, orderDetailAdjustInfo.adjustFlows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderId, originalPrice, originalFreight, adjustFlows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailAdjustInfo {\n");
    sb.append("    subOrderId: ").append(toIndentedString(subOrderId)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    originalFreight: ").append(toIndentedString(originalFreight)).append("\n");
    sb.append("    adjustFlows: ").append(toIndentedString(adjustFlows)).append("\n");
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

