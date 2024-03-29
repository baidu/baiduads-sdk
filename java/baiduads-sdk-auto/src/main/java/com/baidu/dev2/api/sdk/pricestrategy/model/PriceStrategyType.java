/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.pricestrategy.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.pricestrategy.model.PriceStrategyCampaignType;
import com.baidu.dev2.api.sdk.pricestrategy.model.PriceStrategyWordType;
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
 * PriceStrategyType
 */
@JsonPropertyOrder({
  PriceStrategyType.JSON_PROPERTY_USER_ID,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_ID,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_NAME,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_TYPE,
  PriceStrategyType.JSON_PROPERTY_TARGET_RANK,
  PriceStrategyType.JSON_PROPERTY_PRICE_FACTOR,
  PriceStrategyType.JSON_PROPERTY_TARGET_URL,
  PriceStrategyType.JSON_PROPERTY_SUB_TYPE,
  PriceStrategyType.JSON_PROPERTY_IS_PAUSE,
  PriceStrategyType.JSON_PROPERTY_WORD_COUNT,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_WORDS,
  PriceStrategyType.JSON_PROPERTY_STRATEGY_LEVEL,
  PriceStrategyType.JSON_PROPERTY_PRICE_STRATEGY_CAMPAIGN_TYPES
})
@JsonTypeName("PriceStrategyType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceStrategyType {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_STRATEGY_ID = "strategyId";
  private Long strategyId;

  public static final String JSON_PROPERTY_STRATEGY_NAME = "strategyName";
  private String strategyName;

  public static final String JSON_PROPERTY_STRATEGY_TYPE = "strategyType";
  private Integer strategyType;

  public static final String JSON_PROPERTY_TARGET_RANK = "targetRank";
  private Integer targetRank;

  public static final String JSON_PROPERTY_PRICE_FACTOR = "priceFactor";
  private Double priceFactor;

  public static final String JSON_PROPERTY_TARGET_URL = "targetUrl";
  private String targetUrl;

  public static final String JSON_PROPERTY_SUB_TYPE = "subType";
  private Integer subType;

  public static final String JSON_PROPERTY_IS_PAUSE = "isPause";
  private Boolean isPause;

  public static final String JSON_PROPERTY_WORD_COUNT = "wordCount";
  private Long wordCount;

  public static final String JSON_PROPERTY_STRATEGY_WORDS = "strategyWords";
  private List<PriceStrategyWordType> strategyWords = null;

  public static final String JSON_PROPERTY_STRATEGY_LEVEL = "strategyLevel";
  private Integer strategyLevel;

  public static final String JSON_PROPERTY_PRICE_STRATEGY_CAMPAIGN_TYPES = "priceStrategyCampaignTypes";
  private List<PriceStrategyCampaignType> priceStrategyCampaignTypes = null;

  public PriceStrategyType() { 
  }

  public PriceStrategyType userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
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


  public PriceStrategyType targetRank(Integer targetRank) {
    
    this.targetRank = targetRank;
    return this;
  }

   /**
   * Get targetRank
   * @return targetRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetRank() {
    return targetRank;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRank(Integer targetRank) {
    this.targetRank = targetRank;
  }


  public PriceStrategyType priceFactor(Double priceFactor) {
    
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


  public PriceStrategyType targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetUrl() {
    return targetUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public PriceStrategyType subType(Integer subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubType() {
    return subType;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubType(Integer subType) {
    this.subType = subType;
  }


  public PriceStrategyType isPause(Boolean isPause) {
    
    this.isPause = isPause;
    return this;
  }

   /**
   * Get isPause
   * @return isPause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPause() {
    return isPause;
  }


  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPause(Boolean isPause) {
    this.isPause = isPause;
  }


  public PriceStrategyType wordCount(Long wordCount) {
    
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Get wordCount
   * @return wordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWordCount() {
    return wordCount;
  }


  @JsonProperty(JSON_PROPERTY_WORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordCount(Long wordCount) {
    this.wordCount = wordCount;
  }


  public PriceStrategyType strategyWords(List<PriceStrategyWordType> strategyWords) {
    
    this.strategyWords = strategyWords;
    return this;
  }

  public PriceStrategyType addStrategyWordsItem(PriceStrategyWordType strategyWordsItem) {
    if (this.strategyWords == null) {
      this.strategyWords = new ArrayList<>();
    }
    this.strategyWords.add(strategyWordsItem);
    return this;
  }

   /**
   * Get strategyWords
   * @return strategyWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PriceStrategyWordType> getStrategyWords() {
    return strategyWords;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyWords(List<PriceStrategyWordType> strategyWords) {
    this.strategyWords = strategyWords;
  }


  public PriceStrategyType strategyLevel(Integer strategyLevel) {
    
    this.strategyLevel = strategyLevel;
    return this;
  }

   /**
   * Get strategyLevel
   * @return strategyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStrategyLevel() {
    return strategyLevel;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyLevel(Integer strategyLevel) {
    this.strategyLevel = strategyLevel;
  }


  public PriceStrategyType priceStrategyCampaignTypes(List<PriceStrategyCampaignType> priceStrategyCampaignTypes) {
    
    this.priceStrategyCampaignTypes = priceStrategyCampaignTypes;
    return this;
  }

  public PriceStrategyType addPriceStrategyCampaignTypesItem(PriceStrategyCampaignType priceStrategyCampaignTypesItem) {
    if (this.priceStrategyCampaignTypes == null) {
      this.priceStrategyCampaignTypes = new ArrayList<>();
    }
    this.priceStrategyCampaignTypes.add(priceStrategyCampaignTypesItem);
    return this;
  }

   /**
   * Get priceStrategyCampaignTypes
   * @return priceStrategyCampaignTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_STRATEGY_CAMPAIGN_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PriceStrategyCampaignType> getPriceStrategyCampaignTypes() {
    return priceStrategyCampaignTypes;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_STRATEGY_CAMPAIGN_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceStrategyCampaignTypes(List<PriceStrategyCampaignType> priceStrategyCampaignTypes) {
    this.priceStrategyCampaignTypes = priceStrategyCampaignTypes;
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
    return Objects.equals(this.userId, priceStrategyType.userId) &&
        Objects.equals(this.strategyId, priceStrategyType.strategyId) &&
        Objects.equals(this.strategyName, priceStrategyType.strategyName) &&
        Objects.equals(this.strategyType, priceStrategyType.strategyType) &&
        Objects.equals(this.targetRank, priceStrategyType.targetRank) &&
        Objects.equals(this.priceFactor, priceStrategyType.priceFactor) &&
        Objects.equals(this.targetUrl, priceStrategyType.targetUrl) &&
        Objects.equals(this.subType, priceStrategyType.subType) &&
        Objects.equals(this.isPause, priceStrategyType.isPause) &&
        Objects.equals(this.wordCount, priceStrategyType.wordCount) &&
        Objects.equals(this.strategyWords, priceStrategyType.strategyWords) &&
        Objects.equals(this.strategyLevel, priceStrategyType.strategyLevel) &&
        Objects.equals(this.priceStrategyCampaignTypes, priceStrategyType.priceStrategyCampaignTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, strategyId, strategyName, strategyType, targetRank, priceFactor, targetUrl, subType, isPause, wordCount, strategyWords, strategyLevel, priceStrategyCampaignTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceStrategyType {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    targetRank: ").append(toIndentedString(targetRank)).append("\n");
    sb.append("    priceFactor: ").append(toIndentedString(priceFactor)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    isPause: ").append(toIndentedString(isPause)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    strategyWords: ").append(toIndentedString(strategyWords)).append("\n");
    sb.append("    strategyLevel: ").append(toIndentedString(strategyLevel)).append("\n");
    sb.append("    priceStrategyCampaignTypes: ").append(toIndentedString(priceStrategyCampaignTypes)).append("\n");
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

