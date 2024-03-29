/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.feedmaterialsearch.model;

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
 * FeedMaterialSearchType
 */
@JsonPropertyOrder({
  FeedMaterialSearchType.JSON_PROPERTY_TOTAL_COUNT,
  FeedMaterialSearchType.JSON_PROPERTY_MATERIAL_SEARCH_INFOS
})
@JsonTypeName("FeedMaterialSearchType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedMaterialSearchType {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_MATERIAL_SEARCH_INFOS = "materialSearchInfos";
  private List<Object> materialSearchInfos = null;

  public FeedMaterialSearchType() { 
  }

  public FeedMaterialSearchType totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public FeedMaterialSearchType materialSearchInfos(List<Object> materialSearchInfos) {
    
    this.materialSearchInfos = materialSearchInfos;
    return this;
  }

  public FeedMaterialSearchType addMaterialSearchInfosItem(Object materialSearchInfosItem) {
    if (this.materialSearchInfos == null) {
      this.materialSearchInfos = new ArrayList<>();
    }
    this.materialSearchInfos.add(materialSearchInfosItem);
    return this;
  }

   /**
   * Get materialSearchInfos
   * @return materialSearchInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_SEARCH_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMaterialSearchInfos() {
    return materialSearchInfos;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_SEARCH_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialSearchInfos(List<Object> materialSearchInfos) {
    this.materialSearchInfos = materialSearchInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedMaterialSearchType feedMaterialSearchType = (FeedMaterialSearchType) o;
    return Objects.equals(this.totalCount, feedMaterialSearchType.totalCount) &&
        Objects.equals(this.materialSearchInfos, feedMaterialSearchType.materialSearchInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, materialSearchInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedMaterialSearchType {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    materialSearchInfos: ").append(toIndentedString(materialSearchInfos)).append("\n");
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

