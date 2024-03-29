/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialquestionmod.model;

import java.util.Objects;
import java.util.Arrays;
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
 * TeslaQuestionBatchUpdateCategoryRequest
 */
@JsonPropertyOrder({
  TeslaQuestionBatchUpdateCategoryRequest.JSON_PROPERTY_CATEGORY_ID,
  TeslaQuestionBatchUpdateCategoryRequest.JSON_PROPERTY_QUESTION_IDS
})
@JsonTypeName("TeslaQuestionBatchUpdateCategoryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaQuestionBatchUpdateCategoryRequest {
  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_QUESTION_IDS = "questionIds";
  private List<Long> questionIds = null;

  public TeslaQuestionBatchUpdateCategoryRequest() { 
  }

  public TeslaQuestionBatchUpdateCategoryRequest categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public TeslaQuestionBatchUpdateCategoryRequest questionIds(List<Long> questionIds) {
    
    this.questionIds = questionIds;
    return this;
  }

  public TeslaQuestionBatchUpdateCategoryRequest addQuestionIdsItem(Long questionIdsItem) {
    if (this.questionIds == null) {
      this.questionIds = new ArrayList<>();
    }
    this.questionIds.add(questionIdsItem);
    return this;
  }

   /**
   * Get questionIds
   * @return questionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUESTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getQuestionIds() {
    return questionIds;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestionIds(List<Long> questionIds) {
    this.questionIds = questionIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaQuestionBatchUpdateCategoryRequest teslaQuestionBatchUpdateCategoryRequest = (TeslaQuestionBatchUpdateCategoryRequest) o;
    return Objects.equals(this.categoryId, teslaQuestionBatchUpdateCategoryRequest.categoryId) &&
        Objects.equals(this.questionIds, teslaQuestionBatchUpdateCategoryRequest.questionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, questionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaQuestionBatchUpdateCategoryRequest {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    questionIds: ").append(toIndentedString(questionIds)).append("\n");
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

