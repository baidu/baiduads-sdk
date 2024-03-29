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
 * NgtWordType
 */
@JsonPropertyOrder({
  NgtWordType.JSON_PROPERTY_CAMPAIGN_ID,
  NgtWordType.JSON_PROPERTY_ADGROUP_ID,
  NgtWordType.JSON_PROPERTY_ADGROUP_NAME,
  NgtWordType.JSON_PROPERTY_NEGATIVE_WORD,
  NgtWordType.JSON_PROPERTY_NEGATIVE_WORD_TYPE,
  NgtWordType.JSON_PROPERTY_KEYWORD,
  NgtWordType.JSON_PROPERTY_MIX_MATCH_TYPE,
  NgtWordType.JSON_PROPERTY_CONFLICT_TYPE,
  NgtWordType.JSON_PROPERTY_CAMPAIGN_NAME,
  NgtWordType.JSON_PROPERTY_BUSINESS_POINT_ID,
  NgtWordType.JSON_PROPERTY_AD_TYPE,
  NgtWordType.JSON_PROPERTY_MARKETING_TARGET_ID,
  NgtWordType.JSON_PROPERTY_CONVERSION,
  NgtWordType.JSON_PROPERTY_CONVERSION_RATE,
  NgtWordType.JSON_PROPERTY_COMPARE_CONVERSION_RATE,
  NgtWordType.JSON_PROPERTY_REASON_CODE,
  NgtWordType.JSON_PROPERTY_REASON_TEXT
})
@JsonTypeName("NgtWordType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NgtWordType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_NEGATIVE_WORD = "negativeWord";
  private String negativeWord;

  public static final String JSON_PROPERTY_NEGATIVE_WORD_TYPE = "negativeWordType";
  private Integer negativeWordType;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_MIX_MATCH_TYPE = "mixMatchType";
  private Integer mixMatchType;

  public static final String JSON_PROPERTY_CONFLICT_TYPE = "conflictType";
  private Integer conflictType;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_BUSINESS_POINT_ID = "businessPointId";
  private Long businessPointId;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public static final String JSON_PROPERTY_MARKETING_TARGET_ID = "marketingTargetId";
  private Integer marketingTargetId;

  public static final String JSON_PROPERTY_CONVERSION = "conversion";
  private Long conversion;

  public static final String JSON_PROPERTY_CONVERSION_RATE = "conversionRate";
  private Double conversionRate;

  public static final String JSON_PROPERTY_COMPARE_CONVERSION_RATE = "compareConversionRate";
  private Double compareConversionRate;

  public static final String JSON_PROPERTY_REASON_CODE = "reasonCode";
  private String reasonCode;

  public static final String JSON_PROPERTY_REASON_TEXT = "reasonText";
  private String reasonText;

  public NgtWordType() { 
  }

  public NgtWordType campaignId(Long campaignId) {
    
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


  public NgtWordType adgroupId(Long adgroupId) {
    
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


  public NgtWordType adgroupName(String adgroupName) {
    
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


  public NgtWordType negativeWord(String negativeWord) {
    
    this.negativeWord = negativeWord;
    return this;
  }

   /**
   * Get negativeWord
   * @return negativeWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNegativeWord() {
    return negativeWord;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeWord(String negativeWord) {
    this.negativeWord = negativeWord;
  }


  public NgtWordType negativeWordType(Integer negativeWordType) {
    
    this.negativeWordType = negativeWordType;
    return this;
  }

   /**
   * Get negativeWordType
   * @return negativeWordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNegativeWordType() {
    return negativeWordType;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeWordType(Integer negativeWordType) {
    this.negativeWordType = negativeWordType;
  }


  public NgtWordType keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public NgtWordType mixMatchType(Integer mixMatchType) {
    
    this.mixMatchType = mixMatchType;
    return this;
  }

   /**
   * Get mixMatchType
   * @return mixMatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIX_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMixMatchType() {
    return mixMatchType;
  }


  @JsonProperty(JSON_PROPERTY_MIX_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMixMatchType(Integer mixMatchType) {
    this.mixMatchType = mixMatchType;
  }


  public NgtWordType conflictType(Integer conflictType) {
    
    this.conflictType = conflictType;
    return this;
  }

   /**
   * Get conflictType
   * @return conflictType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFLICT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConflictType() {
    return conflictType;
  }


  @JsonProperty(JSON_PROPERTY_CONFLICT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflictType(Integer conflictType) {
    this.conflictType = conflictType;
  }


  public NgtWordType campaignName(String campaignName) {
    
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


  public NgtWordType businessPointId(Long businessPointId) {
    
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


  public NgtWordType adType(Integer adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(Integer adType) {
    this.adType = adType;
  }


  public NgtWordType marketingTargetId(Integer marketingTargetId) {
    
    this.marketingTargetId = marketingTargetId;
    return this;
  }

   /**
   * Get marketingTargetId
   * @return marketingTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMarketingTargetId() {
    return marketingTargetId;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingTargetId(Integer marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
  }


  public NgtWordType conversion(Long conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversion() {
    return conversion;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversion(Long conversion) {
    this.conversion = conversion;
  }


  public NgtWordType conversionRate(Double conversionRate) {
    
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * Get conversionRate
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConversionRate() {
    return conversionRate;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
  }


  public NgtWordType compareConversionRate(Double compareConversionRate) {
    
    this.compareConversionRate = compareConversionRate;
    return this;
  }

   /**
   * Get compareConversionRate
   * @return compareConversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPARE_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCompareConversionRate() {
    return compareConversionRate;
  }


  @JsonProperty(JSON_PROPERTY_COMPARE_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompareConversionRate(Double compareConversionRate) {
    this.compareConversionRate = compareConversionRate;
  }


  public NgtWordType reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonCode() {
    return reasonCode;
  }


  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public NgtWordType reasonText(String reasonText) {
    
    this.reasonText = reasonText;
    return this;
  }

   /**
   * Get reasonText
   * @return reasonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonText() {
    return reasonText;
  }


  @JsonProperty(JSON_PROPERTY_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NgtWordType ngtWordType = (NgtWordType) o;
    return Objects.equals(this.campaignId, ngtWordType.campaignId) &&
        Objects.equals(this.adgroupId, ngtWordType.adgroupId) &&
        Objects.equals(this.adgroupName, ngtWordType.adgroupName) &&
        Objects.equals(this.negativeWord, ngtWordType.negativeWord) &&
        Objects.equals(this.negativeWordType, ngtWordType.negativeWordType) &&
        Objects.equals(this.keyword, ngtWordType.keyword) &&
        Objects.equals(this.mixMatchType, ngtWordType.mixMatchType) &&
        Objects.equals(this.conflictType, ngtWordType.conflictType) &&
        Objects.equals(this.campaignName, ngtWordType.campaignName) &&
        Objects.equals(this.businessPointId, ngtWordType.businessPointId) &&
        Objects.equals(this.adType, ngtWordType.adType) &&
        Objects.equals(this.marketingTargetId, ngtWordType.marketingTargetId) &&
        Objects.equals(this.conversion, ngtWordType.conversion) &&
        Objects.equals(this.conversionRate, ngtWordType.conversionRate) &&
        Objects.equals(this.compareConversionRate, ngtWordType.compareConversionRate) &&
        Objects.equals(this.reasonCode, ngtWordType.reasonCode) &&
        Objects.equals(this.reasonText, ngtWordType.reasonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, adgroupId, adgroupName, negativeWord, negativeWordType, keyword, mixMatchType, conflictType, campaignName, businessPointId, adType, marketingTargetId, conversion, conversionRate, compareConversionRate, reasonCode, reasonText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NgtWordType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    negativeWord: ").append(toIndentedString(negativeWord)).append("\n");
    sb.append("    negativeWordType: ").append(toIndentedString(negativeWordType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    mixMatchType: ").append(toIndentedString(mixMatchType)).append("\n");
    sb.append("    conflictType: ").append(toIndentedString(conflictType)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    businessPointId: ").append(toIndentedString(businessPointId)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    marketingTargetId: ").append(toIndentedString(marketingTargetId)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    compareConversionRate: ").append(toIndentedString(compareConversionRate)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
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

