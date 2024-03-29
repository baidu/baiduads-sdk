/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.titlerecommend.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.titlerecommend.model.RecommendType;
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
 * TitleType
 */
@JsonPropertyOrder({
  TitleType.JSON_PROPERTY_RECOMMEND_TYPE_LIST,
  TitleType.JSON_PROPERTY_TEMPLATE_ID,
  TitleType.JSON_PROPERTY_TITLE,
  TitleType.JSON_PROPERTY_Q_SCORE,
  TitleType.JSON_PROPERTY_SALE_POINTS
})
@JsonTypeName("TitleType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TitleType {
  public static final String JSON_PROPERTY_RECOMMEND_TYPE_LIST = "recommendTypeList";
  private List<RecommendType> recommendTypeList = null;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private Long templateId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_Q_SCORE = "qScore";
  private Integer qScore;

  public static final String JSON_PROPERTY_SALE_POINTS = "salePoints";
  private List<String> salePoints = null;

  public TitleType() { 
  }

  public TitleType recommendTypeList(List<RecommendType> recommendTypeList) {
    
    this.recommendTypeList = recommendTypeList;
    return this;
  }

  public TitleType addRecommendTypeListItem(RecommendType recommendTypeListItem) {
    if (this.recommendTypeList == null) {
      this.recommendTypeList = new ArrayList<>();
    }
    this.recommendTypeList.add(recommendTypeListItem);
    return this;
  }

   /**
   * Get recommendTypeList
   * @return recommendTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_TYPE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendType> getRecommendTypeList() {
    return recommendTypeList;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_TYPE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendTypeList(List<RecommendType> recommendTypeList) {
    this.recommendTypeList = recommendTypeList;
  }


  public TitleType templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public TitleType title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public TitleType qScore(Integer qScore) {
    
    this.qScore = qScore;
    return this;
  }

   /**
   * Get qScore
   * @return qScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_Q_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getqScore() {
    return qScore;
  }


  @JsonProperty(JSON_PROPERTY_Q_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setqScore(Integer qScore) {
    this.qScore = qScore;
  }


  public TitleType salePoints(List<String> salePoints) {
    
    this.salePoints = salePoints;
    return this;
  }

  public TitleType addSalePointsItem(String salePointsItem) {
    if (this.salePoints == null) {
      this.salePoints = new ArrayList<>();
    }
    this.salePoints.add(salePointsItem);
    return this;
  }

   /**
   * Get salePoints
   * @return salePoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSalePoints() {
    return salePoints;
  }


  @JsonProperty(JSON_PROPERTY_SALE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalePoints(List<String> salePoints) {
    this.salePoints = salePoints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitleType titleType = (TitleType) o;
    return Objects.equals(this.recommendTypeList, titleType.recommendTypeList) &&
        Objects.equals(this.templateId, titleType.templateId) &&
        Objects.equals(this.title, titleType.title) &&
        Objects.equals(this.qScore, titleType.qScore) &&
        Objects.equals(this.salePoints, titleType.salePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendTypeList, templateId, title, qScore, salePoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitleType {\n");
    sb.append("    recommendTypeList: ").append(toIndentedString(recommendTypeList)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    qScore: ").append(toIndentedString(qScore)).append("\n");
    sb.append("    salePoints: ").append(toIndentedString(salePoints)).append("\n");
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

