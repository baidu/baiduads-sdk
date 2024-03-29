/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.crowdbind.model;

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
 * CrowdBindType
 */
@JsonPropertyOrder({
  CrowdBindType.JSON_PROPERTY_BIND_ID,
  CrowdBindType.JSON_PROPERTY_TARGET_TYPE,
  CrowdBindType.JSON_PROPERTY_TARGET_ID,
  CrowdBindType.JSON_PROPERTY_CROWD_PRICE_RATIO,
  CrowdBindType.JSON_PROPERTY_CAMPAIGN_ID,
  CrowdBindType.JSON_PROPERTY_CROWD_ID
})
@JsonTypeName("CrowdBindType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdBindType {
  public static final String JSON_PROPERTY_BIND_ID = "bindId";
  private Long bindId;

  public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
  private Integer targetType;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private Long targetId;

  public static final String JSON_PROPERTY_CROWD_PRICE_RATIO = "crowdPriceRatio";
  private Double crowdPriceRatio;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CROWD_ID = "crowdId";
  private Long crowdId;

  public CrowdBindType() { 
  }

  public CrowdBindType bindId(Long bindId) {
    
    this.bindId = bindId;
    return this;
  }

   /**
   * Get bindId
   * @return bindId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBindId() {
    return bindId;
  }


  @JsonProperty(JSON_PROPERTY_BIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindId(Long bindId) {
    this.bindId = bindId;
  }


  public CrowdBindType targetType(Integer targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetType(Integer targetType) {
    this.targetType = targetType;
  }


  public CrowdBindType targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public CrowdBindType crowdPriceRatio(Double crowdPriceRatio) {
    
    this.crowdPriceRatio = crowdPriceRatio;
    return this;
  }

   /**
   * Get crowdPriceRatio
   * @return crowdPriceRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROWD_PRICE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCrowdPriceRatio() {
    return crowdPriceRatio;
  }


  @JsonProperty(JSON_PROPERTY_CROWD_PRICE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrowdPriceRatio(Double crowdPriceRatio) {
    this.crowdPriceRatio = crowdPriceRatio;
  }


  public CrowdBindType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CrowdBindType crowdId(Long crowdId) {
    
    this.crowdId = crowdId;
    return this;
  }

   /**
   * Get crowdId
   * @return crowdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROWD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCrowdId() {
    return crowdId;
  }


  @JsonProperty(JSON_PROPERTY_CROWD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrowdId(Long crowdId) {
    this.crowdId = crowdId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdBindType crowdBindType = (CrowdBindType) o;
    return Objects.equals(this.bindId, crowdBindType.bindId) &&
        Objects.equals(this.targetType, crowdBindType.targetType) &&
        Objects.equals(this.targetId, crowdBindType.targetId) &&
        Objects.equals(this.crowdPriceRatio, crowdBindType.crowdPriceRatio) &&
        Objects.equals(this.campaignId, crowdBindType.campaignId) &&
        Objects.equals(this.crowdId, crowdBindType.crowdId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindId, targetType, targetId, crowdPriceRatio, campaignId, crowdId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdBindType {\n");
    sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    crowdPriceRatio: ").append(toIndentedString(crowdPriceRatio)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    crowdId: ").append(toIndentedString(crowdId)).append("\n");
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

