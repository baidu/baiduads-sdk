/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

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
 * RecommendReasonType
 */
@JsonPropertyOrder({
  RecommendReasonType.JSON_PROPERTY_REASON_TYPE,
  RecommendReasonType.JSON_PROPERTY_IMPROVE_RATIO
})
@JsonTypeName("RecommendReasonType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendReasonType {
  public static final String JSON_PROPERTY_REASON_TYPE = "reasonType";
  private Integer reasonType;

  public static final String JSON_PROPERTY_IMPROVE_RATIO = "improveRatio";
  private Double improveRatio;

  public RecommendReasonType() { 
  }

  public RecommendReasonType reasonType(Integer reasonType) {
    
    this.reasonType = reasonType;
    return this;
  }

   /**
   * Get reasonType
   * @return reasonType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReasonType() {
    return reasonType;
  }


  @JsonProperty(JSON_PROPERTY_REASON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonType(Integer reasonType) {
    this.reasonType = reasonType;
  }


  public RecommendReasonType improveRatio(Double improveRatio) {
    
    this.improveRatio = improveRatio;
    return this;
  }

   /**
   * Get improveRatio
   * @return improveRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPROVE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImproveRatio() {
    return improveRatio;
  }


  @JsonProperty(JSON_PROPERTY_IMPROVE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImproveRatio(Double improveRatio) {
    this.improveRatio = improveRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendReasonType recommendReasonType = (RecommendReasonType) o;
    return Objects.equals(this.reasonType, recommendReasonType.reasonType) &&
        Objects.equals(this.improveRatio, recommendReasonType.improveRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonType, improveRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendReasonType {\n");
    sb.append("    reasonType: ").append(toIndentedString(reasonType)).append("\n");
    sb.append("    improveRatio: ").append(toIndentedString(improveRatio)).append("\n");
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
