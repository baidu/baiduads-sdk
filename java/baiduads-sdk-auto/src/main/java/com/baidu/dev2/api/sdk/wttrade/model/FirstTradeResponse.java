/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.wttrade.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.wttrade.model.SecondTradeResponse;
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
 * FirstTradeResponse
 */
@JsonPropertyOrder({
  FirstTradeResponse.JSON_PROPERTY_FIRST_TRADE_ID,
  FirstTradeResponse.JSON_PROPERTY_FIRST_TRADE_NAME,
  FirstTradeResponse.JSON_PROPERTY_SECOND_TRADES
})
@JsonTypeName("FirstTradeResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FirstTradeResponse {
  public static final String JSON_PROPERTY_FIRST_TRADE_ID = "firstTradeId";
  private Long firstTradeId;

  public static final String JSON_PROPERTY_FIRST_TRADE_NAME = "firstTradeName";
  private String firstTradeName;

  public static final String JSON_PROPERTY_SECOND_TRADES = "secondTrades";
  private List<SecondTradeResponse> secondTrades = null;

  public FirstTradeResponse() { 
  }

  public FirstTradeResponse firstTradeId(Long firstTradeId) {
    
    this.firstTradeId = firstTradeId;
    return this;
  }

   /**
   * Get firstTradeId
   * @return firstTradeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFirstTradeId() {
    return firstTradeId;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstTradeId(Long firstTradeId) {
    this.firstTradeId = firstTradeId;
  }


  public FirstTradeResponse firstTradeName(String firstTradeName) {
    
    this.firstTradeName = firstTradeName;
    return this;
  }

   /**
   * Get firstTradeName
   * @return firstTradeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_TRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstTradeName() {
    return firstTradeName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TRADE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstTradeName(String firstTradeName) {
    this.firstTradeName = firstTradeName;
  }


  public FirstTradeResponse secondTrades(List<SecondTradeResponse> secondTrades) {
    
    this.secondTrades = secondTrades;
    return this;
  }

  public FirstTradeResponse addSecondTradesItem(SecondTradeResponse secondTradesItem) {
    if (this.secondTrades == null) {
      this.secondTrades = new ArrayList<>();
    }
    this.secondTrades.add(secondTradesItem);
    return this;
  }

   /**
   * Get secondTrades
   * @return secondTrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECOND_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SecondTradeResponse> getSecondTrades() {
    return secondTrades;
  }


  @JsonProperty(JSON_PROPERTY_SECOND_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondTrades(List<SecondTradeResponse> secondTrades) {
    this.secondTrades = secondTrades;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstTradeResponse firstTradeResponse = (FirstTradeResponse) o;
    return Objects.equals(this.firstTradeId, firstTradeResponse.firstTradeId) &&
        Objects.equals(this.firstTradeName, firstTradeResponse.firstTradeName) &&
        Objects.equals(this.secondTrades, firstTradeResponse.secondTrades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstTradeId, firstTradeName, secondTrades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstTradeResponse {\n");
    sb.append("    firstTradeId: ").append(toIndentedString(firstTradeId)).append("\n");
    sb.append("    firstTradeName: ").append(toIndentedString(firstTradeName)).append("\n");
    sb.append("    secondTrades: ").append(toIndentedString(secondTrades)).append("\n");
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

