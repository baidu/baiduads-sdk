/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.wordmaterial.model;

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
 * WordMaterial
 */
@JsonPropertyOrder({
  WordMaterial.JSON_PROPERTY_ID,
  WordMaterial.JSON_PROPERTY_INDUSTRY,
  WordMaterial.JSON_PROPERTY_MAJOR_WORD,
  WordMaterial.JSON_PROPERTY_MINOR_WORD,
  WordMaterial.JSON_PROPERTY_GUIDE_WORD
})
@JsonTypeName("WordMaterial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WordMaterial {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private String industry;

  public static final String JSON_PROPERTY_MAJOR_WORD = "majorWord";
  private String majorWord;

  public static final String JSON_PROPERTY_MINOR_WORD = "minorWord";
  private String minorWord;

  public static final String JSON_PROPERTY_GUIDE_WORD = "guideWord";
  private String guideWord;

  public WordMaterial() { 
  }

  public WordMaterial id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public WordMaterial industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public WordMaterial majorWord(String majorWord) {
    
    this.majorWord = majorWord;
    return this;
  }

   /**
   * Get majorWord
   * @return majorWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAJOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMajorWord() {
    return majorWord;
  }


  @JsonProperty(JSON_PROPERTY_MAJOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMajorWord(String majorWord) {
    this.majorWord = majorWord;
  }


  public WordMaterial minorWord(String minorWord) {
    
    this.minorWord = minorWord;
    return this;
  }

   /**
   * Get minorWord
   * @return minorWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinorWord() {
    return minorWord;
  }


  @JsonProperty(JSON_PROPERTY_MINOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinorWord(String minorWord) {
    this.minorWord = minorWord;
  }


  public WordMaterial guideWord(String guideWord) {
    
    this.guideWord = guideWord;
    return this;
  }

   /**
   * Get guideWord
   * @return guideWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUIDE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuideWord() {
    return guideWord;
  }


  @JsonProperty(JSON_PROPERTY_GUIDE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuideWord(String guideWord) {
    this.guideWord = guideWord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordMaterial wordMaterial = (WordMaterial) o;
    return Objects.equals(this.id, wordMaterial.id) &&
        Objects.equals(this.industry, wordMaterial.industry) &&
        Objects.equals(this.majorWord, wordMaterial.majorWord) &&
        Objects.equals(this.minorWord, wordMaterial.minorWord) &&
        Objects.equals(this.guideWord, wordMaterial.guideWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, industry, majorWord, minorWord, guideWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordMaterial {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    majorWord: ").append(toIndentedString(majorWord)).append("\n");
    sb.append("    minorWord: ").append(toIndentedString(minorWord)).append("\n");
    sb.append("    guideWord: ").append(toIndentedString(guideWord)).append("\n");
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

