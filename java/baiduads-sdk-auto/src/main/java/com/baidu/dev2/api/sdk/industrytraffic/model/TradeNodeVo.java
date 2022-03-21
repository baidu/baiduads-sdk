/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.industrytraffic.model;

import java.util.Objects;
import java.util.Arrays;
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
 * TradeNodeVo
 */
@JsonPropertyOrder({
  TradeNodeVo.JSON_PROPERTY_TRADE_NAME,
  TradeNodeVo.JSON_PROPERTY_SUB_TRADE,
  TradeNodeVo.JSON_PROPERTY_ENABLE
})
@JsonTypeName("TradeNodeVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeNodeVo {
  public static final String JSON_PROPERTY_TRADE_NAME = "tradeName";
  private String tradeName;

  public static final String JSON_PROPERTY_SUB_TRADE = "subTrade";
  private List<TradeNodeVo> subTrade = null;

  public static final String JSON_PROPERTY_ENABLE = "enable";
  private Boolean enable;

  public TradeNodeVo() { 
  }

  public TradeNodeVo tradeName(String tradeName) {
    
    this.tradeName = tradeName;
    return this;
  }

   /**
   * Get tradeName
   * @return tradeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTradeName() {
    return tradeName;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }


  public TradeNodeVo subTrade(List<TradeNodeVo> subTrade) {
    
    this.subTrade = subTrade;
    return this;
  }

  public TradeNodeVo addSubTradeItem(TradeNodeVo subTradeItem) {
    if (this.subTrade == null) {
      this.subTrade = new ArrayList<>();
    }
    this.subTrade.add(subTradeItem);
    return this;
  }

   /**
   * Get subTrade
   * @return subTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TradeNodeVo> getSubTrade() {
    return subTrade;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubTrade(List<TradeNodeVo> subTrade) {
    this.subTrade = subTrade;
  }


  public TradeNodeVo enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnable() {
    return enable;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeNodeVo tradeNodeVo = (TradeNodeVo) o;
    return Objects.equals(this.tradeName, tradeNodeVo.tradeName) &&
        Objects.equals(this.subTrade, tradeNodeVo.subTrade) &&
        Objects.equals(this.enable, tradeNodeVo.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeName, subTrade, enable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeNodeVo {\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    subTrade: ").append(toIndentedString(subTrade)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
