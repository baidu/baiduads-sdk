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
import com.baidu.dev2.api.sdk.titlerecommend.model.TitleType;
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
 * GetExtTitleResponse
 */
@JsonPropertyOrder({
  GetExtTitleResponse.JSON_PROPERTY_LIST_DATA,
  GetExtTitleResponse.JSON_PROPERTY_TOTAL_COUNT
})
@JsonTypeName("GetExtTitleResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetExtTitleResponse {
  public static final String JSON_PROPERTY_LIST_DATA = "listData";
  private List<TitleType> listData = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public GetExtTitleResponse() { 
  }

  public GetExtTitleResponse listData(List<TitleType> listData) {
    
    this.listData = listData;
    return this;
  }

  public GetExtTitleResponse addListDataItem(TitleType listDataItem) {
    if (this.listData == null) {
      this.listData = new ArrayList<>();
    }
    this.listData.add(listDataItem);
    return this;
  }

   /**
   * Get listData
   * @return listData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TitleType> getListData() {
    return listData;
  }


  @JsonProperty(JSON_PROPERTY_LIST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListData(List<TitleType> listData) {
    this.listData = listData;
  }


  public GetExtTitleResponse totalCount(Integer totalCount) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtTitleResponse getExtTitleResponse = (GetExtTitleResponse) o;
    return Objects.equals(this.listData, getExtTitleResponse.listData) &&
        Objects.equals(this.totalCount, getExtTitleResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listData, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtTitleResponse {\n");
    sb.append("    listData: ").append(toIndentedString(listData)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

