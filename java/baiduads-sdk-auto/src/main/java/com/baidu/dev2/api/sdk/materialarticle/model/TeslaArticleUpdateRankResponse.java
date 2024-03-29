/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialarticle.model;

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
 * TeslaArticleUpdateRankResponse
 */
@JsonPropertyOrder({
  TeslaArticleUpdateRankResponse.JSON_PROPERTY_ARTICLE_ID_LIST
})
@JsonTypeName("TeslaArticleUpdateRankResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaArticleUpdateRankResponse {
  public static final String JSON_PROPERTY_ARTICLE_ID_LIST = "articleIdList";
  private List<Long> articleIdList = null;

  public TeslaArticleUpdateRankResponse() { 
  }

  public TeslaArticleUpdateRankResponse articleIdList(List<Long> articleIdList) {
    
    this.articleIdList = articleIdList;
    return this;
  }

  public TeslaArticleUpdateRankResponse addArticleIdListItem(Long articleIdListItem) {
    if (this.articleIdList == null) {
      this.articleIdList = new ArrayList<>();
    }
    this.articleIdList.add(articleIdListItem);
    return this;
  }

   /**
   * Get articleIdList
   * @return articleIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTICLE_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getArticleIdList() {
    return articleIdList;
  }


  @JsonProperty(JSON_PROPERTY_ARTICLE_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArticleIdList(List<Long> articleIdList) {
    this.articleIdList = articleIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaArticleUpdateRankResponse teslaArticleUpdateRankResponse = (TeslaArticleUpdateRankResponse) o;
    return Objects.equals(this.articleIdList, teslaArticleUpdateRankResponse.articleIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaArticleUpdateRankResponse {\n");
    sb.append("    articleIdList: ").append(toIndentedString(articleIdList)).append("\n");
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

