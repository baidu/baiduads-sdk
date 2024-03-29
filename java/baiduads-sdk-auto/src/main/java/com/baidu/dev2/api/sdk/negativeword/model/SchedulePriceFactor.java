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
 * SchedulePriceFactor
 */
@JsonPropertyOrder({
  SchedulePriceFactor.JSON_PROPERTY_TIME_ID,
  SchedulePriceFactor.JSON_PROPERTY_PRICE_FACTOR
})
@JsonTypeName("SchedulePriceFactor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchedulePriceFactor {
  public static final String JSON_PROPERTY_TIME_ID = "timeId";
  private Integer timeId;

  public static final String JSON_PROPERTY_PRICE_FACTOR = "priceFactor";
  private Double priceFactor;

  public SchedulePriceFactor() { 
  }

  public SchedulePriceFactor timeId(Integer timeId) {
    
    this.timeId = timeId;
    return this;
  }

   /**
   * Get timeId
   * @return timeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeId() {
    return timeId;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeId(Integer timeId) {
    this.timeId = timeId;
  }


  public SchedulePriceFactor priceFactor(Double priceFactor) {
    
    this.priceFactor = priceFactor;
    return this;
  }

   /**
   * Get priceFactor
   * @return priceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceFactor() {
    return priceFactor;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFactor(Double priceFactor) {
    this.priceFactor = priceFactor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePriceFactor schedulePriceFactor = (SchedulePriceFactor) o;
    return Objects.equals(this.timeId, schedulePriceFactor.timeId) &&
        Objects.equals(this.priceFactor, schedulePriceFactor.priceFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeId, priceFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePriceFactor {\n");
    sb.append("    timeId: ").append(toIndentedString(timeId)).append("\n");
    sb.append("    priceFactor: ").append(toIndentedString(priceFactor)).append("\n");
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

