/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.pvsearchfunction.model;

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
 * PvSearchRequestWordItem
 */
@JsonPropertyOrder({
  PvSearchRequestWordItem.JSON_PROPERTY_KEYWORD_NAME,
  PvSearchRequestWordItem.JSON_PROPERTY_MATCH_TYPE,
  PvSearchRequestWordItem.JSON_PROPERTY_PHRASE_TYPE
})
@JsonTypeName("PvSearchRequestWordItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PvSearchRequestWordItem {
  public static final String JSON_PROPERTY_KEYWORD_NAME = "keywordName";
  private String keywordName;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private Integer matchType;

  public static final String JSON_PROPERTY_PHRASE_TYPE = "phraseType";
  private Integer phraseType;

  public PvSearchRequestWordItem() { 
  }

  public PvSearchRequestWordItem keywordName(String keywordName) {
    
    this.keywordName = keywordName;
    return this;
  }

   /**
   * Get keywordName
   * @return keywordName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeywordName() {
    return keywordName;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }


  public PvSearchRequestWordItem matchType(Integer matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(Integer matchType) {
    this.matchType = matchType;
  }


  public PvSearchRequestWordItem phraseType(Integer phraseType) {
    
    this.phraseType = phraseType;
    return this;
  }

   /**
   * Get phraseType
   * @return phraseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHRASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPhraseType() {
    return phraseType;
  }


  @JsonProperty(JSON_PROPERTY_PHRASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhraseType(Integer phraseType) {
    this.phraseType = phraseType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PvSearchRequestWordItem pvSearchRequestWordItem = (PvSearchRequestWordItem) o;
    return Objects.equals(this.keywordName, pvSearchRequestWordItem.keywordName) &&
        Objects.equals(this.matchType, pvSearchRequestWordItem.matchType) &&
        Objects.equals(this.phraseType, pvSearchRequestWordItem.phraseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordName, matchType, phraseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PvSearchRequestWordItem {\n");
    sb.append("    keywordName: ").append(toIndentedString(keywordName)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    phraseType: ").append(toIndentedString(phraseType)).append("\n");
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

