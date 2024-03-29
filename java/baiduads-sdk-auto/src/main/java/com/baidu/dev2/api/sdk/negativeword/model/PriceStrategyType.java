/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

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
 * PriceStrategyType
 */
@JsonPropertyOrder({
  PriceStrategyType.JSON_PROPERTY_STRATEGY_ID,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_NAME,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_TYPE,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_STATUS
})
@JsonTypeName("PriceStrategyType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceStrategyType {
  public static final String JSON_PROPERTY_STRATEGY_ID = "strategyId";
  private Long strategyId;

  public static final String JSON_PROPERTY_STRATEGY_NAME = "strategyName";
  private String strategyName;

  public static final String JSON_PROPERTY_STRATEGY_TYPE = "strategyType";
  private Integer strategyType;

  public static final String JSON_PROPERTY_STRATEGY_STATUS = "strategyStatus";
  private Integer strategyStatus;

  public PriceStrategyType() { 
  }

  public PriceStrategyType strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * Get strategyId
   * @return strategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyId() {
    return strategyId;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public PriceStrategyType strategyName(String strategyName) {
    
    this.strategyName = strategyName;
    return this;
  }

   /**
   * Get strategyName
   * @return strategyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStrategyName() {
    return strategyName;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyName(String strategyName) {
    this.strategyName = strategyName;
  }


  public PriceStrategyType strategyType(Integer strategyType) {
    
    this.strategyType = strategyType;
    return this;
  }

   /**
   * Get strategyType
   * @return strategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStrategyType() {
    return strategyType;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyType(Integer strategyType) {
    this.strategyType = strategyType;
  }


  public PriceStrategyType strategyStatus(Integer strategyStatus) {
    
    this.strategyStatus = strategyStatus;
    return this;
  }

   /**
   * Get strategyStatus
   * @return strategyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStrategyStatus() {
    return strategyStatus;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyStatus(Integer strategyStatus) {
    this.strategyStatus = strategyStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceStrategyType priceStrategyType = (PriceStrategyType) o;
    return Objects.equals(this.strategyId, priceStrategyType.strategyId) &&
        Objects.equals(this.strategyName, priceStrategyType.strategyName) &&
        Objects.equals(this.strategyType, priceStrategyType.strategyType) &&
        Objects.equals(this.strategyStatus, priceStrategyType.strategyStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategyId, strategyName, strategyType, strategyStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceStrategyType {\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    strategyStatus: ").append(toIndentedString(strategyStatus)).append("\n");
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

