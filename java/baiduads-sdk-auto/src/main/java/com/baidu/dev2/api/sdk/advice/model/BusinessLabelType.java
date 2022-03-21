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
 * BusinessLabelType
 */
@JsonPropertyOrder({
  BusinessLabelType.JSON_PROPERTY_BUSINESS_LABEL_ID,
  BusinessLabelType.JSON_PROPERTY_BUSINESS_NAME,
  BusinessLabelType.JSON_PROPERTY_BUSINESS_NAME_ID,
  BusinessLabelType.JSON_PROPERTY_BUSINESS_POINT_ID,
  BusinessLabelType.JSON_PROPERTY_STRATEGY_PRICE,
  BusinessLabelType.JSON_PROPERTY_STRATEGY_ADGROUP_ID,
  BusinessLabelType.JSON_PROPERTY_CAMPAIGN_ID,
  BusinessLabelType.JSON_PROPERTY_ADGROUP_ID,
  BusinessLabelType.JSON_PROPERTY_CAMPAIGN_NAME,
  BusinessLabelType.JSON_PROPERTY_ADGROUP_NAME,
  BusinessLabelType.JSON_PROPERTY_ADGROUP_STATUS,
  BusinessLabelType.JSON_PROPERTY_ADGROUP_STATUS_NAME,
  BusinessLabelType.JSON_PROPERTY_PRICE,
  BusinessLabelType.JSON_PROPERTY_MULTI_PRICE,
  BusinessLabelType.JSON_PROPERTY_ADGROUP_PRICE,
  BusinessLabelType.JSON_PROPERTY_IMPRESSION,
  BusinessLabelType.JSON_PROPERTY_CLICK,
  BusinessLabelType.JSON_PROPERTY_LOG_ID
})
@JsonTypeName("BusinessLabelType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessLabelType {
  public static final String JSON_PROPERTY_BUSINESS_LABEL_ID = "businessLabelId";
  private Long businessLabelId;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_NAME_ID = "businessNameId";
  private Long businessNameId;

  public static final String JSON_PROPERTY_BUSINESS_POINT_ID = "businessPointId";
  private Long businessPointId;

  public static final String JSON_PROPERTY_STRATEGY_PRICE = "strategyPrice";
  private Double strategyPrice;

  public static final String JSON_PROPERTY_STRATEGY_ADGROUP_ID = "strategyAdgroupId";
  private Long strategyAdgroupId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_ADGROUP_STATUS = "adgroupStatus";
  private Integer adgroupStatus;

  public static final String JSON_PROPERTY_ADGROUP_STATUS_NAME = "adgroupStatusName";
  private String adgroupStatusName;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_MULTI_PRICE = "multiPrice";
  private String multiPrice;

  public static final String JSON_PROPERTY_ADGROUP_PRICE = "adgroupPrice";
  private Double adgroupPrice;

  public static final String JSON_PROPERTY_IMPRESSION = "impression";
  private Long impression;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Long click;

  public static final String JSON_PROPERTY_LOG_ID = "logId";
  private String logId;

  public BusinessLabelType() { 
  }

  public BusinessLabelType businessLabelId(Long businessLabelId) {
    
    this.businessLabelId = businessLabelId;
    return this;
  }

   /**
   * Get businessLabelId
   * @return businessLabelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBusinessLabelId() {
    return businessLabelId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLabelId(Long businessLabelId) {
    this.businessLabelId = businessLabelId;
  }


  public BusinessLabelType businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public BusinessLabelType businessNameId(Long businessNameId) {
    
    this.businessNameId = businessNameId;
    return this;
  }

   /**
   * Get businessNameId
   * @return businessNameId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBusinessNameId() {
    return businessNameId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessNameId(Long businessNameId) {
    this.businessNameId = businessNameId;
  }


  public BusinessLabelType businessPointId(Long businessPointId) {
    
    this.businessPointId = businessPointId;
    return this;
  }

   /**
   * Get businessPointId
   * @return businessPointId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBusinessPointId() {
    return businessPointId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessPointId(Long businessPointId) {
    this.businessPointId = businessPointId;
  }


  public BusinessLabelType strategyPrice(Double strategyPrice) {
    
    this.strategyPrice = strategyPrice;
    return this;
  }

   /**
   * Get strategyPrice
   * @return strategyPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getStrategyPrice() {
    return strategyPrice;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyPrice(Double strategyPrice) {
    this.strategyPrice = strategyPrice;
  }


  public BusinessLabelType strategyAdgroupId(Long strategyAdgroupId) {
    
    this.strategyAdgroupId = strategyAdgroupId;
    return this;
  }

   /**
   * Get strategyAdgroupId
   * @return strategyAdgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyAdgroupId() {
    return strategyAdgroupId;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyAdgroupId(Long strategyAdgroupId) {
    this.strategyAdgroupId = strategyAdgroupId;
  }


  public BusinessLabelType campaignId(Long campaignId) {
    
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


  public BusinessLabelType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public BusinessLabelType campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BusinessLabelType adgroupName(String adgroupName) {
    
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupName() {
    return adgroupName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }


  public BusinessLabelType adgroupStatus(Integer adgroupStatus) {
    
    this.adgroupStatus = adgroupStatus;
    return this;
  }

   /**
   * Get adgroupStatus
   * @return adgroupStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdgroupStatus() {
    return adgroupStatus;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupStatus(Integer adgroupStatus) {
    this.adgroupStatus = adgroupStatus;
  }


  public BusinessLabelType adgroupStatusName(String adgroupStatusName) {
    
    this.adgroupStatusName = adgroupStatusName;
    return this;
  }

   /**
   * Get adgroupStatusName
   * @return adgroupStatusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupStatusName() {
    return adgroupStatusName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupStatusName(String adgroupStatusName) {
    this.adgroupStatusName = adgroupStatusName;
  }


  public BusinessLabelType price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public BusinessLabelType multiPrice(String multiPrice) {
    
    this.multiPrice = multiPrice;
    return this;
  }

   /**
   * Get multiPrice
   * @return multiPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTI_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMultiPrice() {
    return multiPrice;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiPrice(String multiPrice) {
    this.multiPrice = multiPrice;
  }


  public BusinessLabelType adgroupPrice(Double adgroupPrice) {
    
    this.adgroupPrice = adgroupPrice;
    return this;
  }

   /**
   * Get adgroupPrice
   * @return adgroupPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAdgroupPrice() {
    return adgroupPrice;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupPrice(Double adgroupPrice) {
    this.adgroupPrice = adgroupPrice;
  }


  public BusinessLabelType impression(Long impression) {
    
    this.impression = impression;
    return this;
  }

   /**
   * Get impression
   * @return impression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpression() {
    return impression;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpression(Long impression) {
    this.impression = impression;
  }


  public BusinessLabelType click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Long click) {
    this.click = click;
  }


  public BusinessLabelType logId(String logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogId() {
    return logId;
  }


  @JsonProperty(JSON_PROPERTY_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogId(String logId) {
    this.logId = logId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLabelType businessLabelType = (BusinessLabelType) o;
    return Objects.equals(this.businessLabelId, businessLabelType.businessLabelId) &&
        Objects.equals(this.businessName, businessLabelType.businessName) &&
        Objects.equals(this.businessNameId, businessLabelType.businessNameId) &&
        Objects.equals(this.businessPointId, businessLabelType.businessPointId) &&
        Objects.equals(this.strategyPrice, businessLabelType.strategyPrice) &&
        Objects.equals(this.strategyAdgroupId, businessLabelType.strategyAdgroupId) &&
        Objects.equals(this.campaignId, businessLabelType.campaignId) &&
        Objects.equals(this.adgroupId, businessLabelType.adgroupId) &&
        Objects.equals(this.campaignName, businessLabelType.campaignName) &&
        Objects.equals(this.adgroupName, businessLabelType.adgroupName) &&
        Objects.equals(this.adgroupStatus, businessLabelType.adgroupStatus) &&
        Objects.equals(this.adgroupStatusName, businessLabelType.adgroupStatusName) &&
        Objects.equals(this.price, businessLabelType.price) &&
        Objects.equals(this.multiPrice, businessLabelType.multiPrice) &&
        Objects.equals(this.adgroupPrice, businessLabelType.adgroupPrice) &&
        Objects.equals(this.impression, businessLabelType.impression) &&
        Objects.equals(this.click, businessLabelType.click) &&
        Objects.equals(this.logId, businessLabelType.logId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLabelId, businessName, businessNameId, businessPointId, strategyPrice, strategyAdgroupId, campaignId, adgroupId, campaignName, adgroupName, adgroupStatus, adgroupStatusName, price, multiPrice, adgroupPrice, impression, click, logId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLabelType {\n");
    sb.append("    businessLabelId: ").append(toIndentedString(businessLabelId)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessNameId: ").append(toIndentedString(businessNameId)).append("\n");
    sb.append("    businessPointId: ").append(toIndentedString(businessPointId)).append("\n");
    sb.append("    strategyPrice: ").append(toIndentedString(strategyPrice)).append("\n");
    sb.append("    strategyAdgroupId: ").append(toIndentedString(strategyAdgroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    adgroupStatus: ").append(toIndentedString(adgroupStatus)).append("\n");
    sb.append("    adgroupStatusName: ").append(toIndentedString(adgroupStatusName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    multiPrice: ").append(toIndentedString(multiPrice)).append("\n");
    sb.append("    adgroupPrice: ").append(toIndentedString(adgroupPrice)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
