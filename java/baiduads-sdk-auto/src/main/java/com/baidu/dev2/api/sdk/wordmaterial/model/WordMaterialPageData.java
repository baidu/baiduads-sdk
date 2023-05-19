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
import com.baidu.dev2.api.sdk.wordmaterial.model.WordMaterial;
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
 * WordMaterialPageData
 */
@JsonPropertyOrder({
  WordMaterialPageData.JSON_PROPERTY_LIST_DATA,
  WordMaterialPageData.JSON_PROPERTY_TOTAL_COUNT,
  WordMaterialPageData.JSON_PROPERTY_PAGE_NO,
  WordMaterialPageData.JSON_PROPERTY_STATUS,
  WordMaterialPageData.JSON_PROPERTY_FAIL_REASON
})
@JsonTypeName("WordMaterialPageData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WordMaterialPageData {
  public static final String JSON_PROPERTY_LIST_DATA = "listData";
  private List<WordMaterial> listData = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_FAIL_REASON = "failReason";
  private String failReason;

  public WordMaterialPageData() { 
  }

  public WordMaterialPageData listData(List<WordMaterial> listData) {
    
    this.listData = listData;
    return this;
  }

  public WordMaterialPageData addListDataItem(WordMaterial listDataItem) {
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

  public List<WordMaterial> getListData() {
    return listData;
  }


  @JsonProperty(JSON_PROPERTY_LIST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListData(List<WordMaterial> listData) {
    this.listData = listData;
  }


  public WordMaterialPageData totalCount(Integer totalCount) {
    
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


  public WordMaterialPageData pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNo() {
    return pageNo;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public WordMaterialPageData status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public WordMaterialPageData failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * Get failReason
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAIL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailReason() {
    return failReason;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordMaterialPageData wordMaterialPageData = (WordMaterialPageData) o;
    return Objects.equals(this.listData, wordMaterialPageData.listData) &&
        Objects.equals(this.totalCount, wordMaterialPageData.totalCount) &&
        Objects.equals(this.pageNo, wordMaterialPageData.pageNo) &&
        Objects.equals(this.status, wordMaterialPageData.status) &&
        Objects.equals(this.failReason, wordMaterialPageData.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listData, totalCount, pageNo, status, failReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordMaterialPageData {\n");
    sb.append("    listData: ").append(toIndentedString(listData)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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

