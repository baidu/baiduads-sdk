/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialpersonquery.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialpersonquery.model.SortingRuleDto;
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
 * TeslaPersonListRequest
 */
@JsonPropertyOrder({
  TeslaPersonListRequest.JSON_PROPERTY_PERSON_ID_LIST,
  TeslaPersonListRequest.JSON_PROPERTY_NAME,
  TeslaPersonListRequest.JSON_PROPERTY_STATUS,
  TeslaPersonListRequest.JSON_PROPERTY_CATEGORY_ID,
  TeslaPersonListRequest.JSON_PROPERTY_PAGE_SIZE,
  TeslaPersonListRequest.JSON_PROPERTY_PAGE_NUM,
  TeslaPersonListRequest.JSON_PROPERTY_SORT_LIST,
  TeslaPersonListRequest.JSON_PROPERTY_TRADE_ID,
  TeslaPersonListRequest.JSON_PROPERTY_ROLE_TYPE,
  TeslaPersonListRequest.JSON_PROPERTY_TRADE_ID_LIST,
  TeslaPersonListRequest.JSON_PROPERTY_CONTENT_TYPE
})
@JsonTypeName("TeslaPersonListRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaPersonListRequest {
  public static final String JSON_PROPERTY_PERSON_ID_LIST = "personIdList";
  private List<Long> personIdList = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<Integer> status = null;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private List<Long> categoryId = null;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE_NUM = "pageNum";
  private Integer pageNum;

  public static final String JSON_PROPERTY_SORT_LIST = "sortList";
  private List<SortingRuleDto> sortList = null;

  public static final String JSON_PROPERTY_TRADE_ID = "tradeId";
  private Long tradeId;

  public static final String JSON_PROPERTY_ROLE_TYPE = "roleType";
  private Integer roleType;

  public static final String JSON_PROPERTY_TRADE_ID_LIST = "tradeIdList";
  private List<Long> tradeIdList = null;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private Integer contentType;

  public TeslaPersonListRequest() { 
  }

  public TeslaPersonListRequest personIdList(List<Long> personIdList) {
    
    this.personIdList = personIdList;
    return this;
  }

  public TeslaPersonListRequest addPersonIdListItem(Long personIdListItem) {
    if (this.personIdList == null) {
      this.personIdList = new ArrayList<>();
    }
    this.personIdList.add(personIdListItem);
    return this;
  }

   /**
   * Get personIdList
   * @return personIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSON_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPersonIdList() {
    return personIdList;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonIdList(List<Long> personIdList) {
    this.personIdList = personIdList;
  }


  public TeslaPersonListRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TeslaPersonListRequest status(List<Integer> status) {
    
    this.status = status;
    return this;
  }

  public TeslaPersonListRequest addStatusItem(Integer statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
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

  public List<Integer> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<Integer> status) {
    this.status = status;
  }


  public TeslaPersonListRequest categoryId(List<Long> categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

  public TeslaPersonListRequest addCategoryIdItem(Long categoryIdItem) {
    if (this.categoryId == null) {
      this.categoryId = new ArrayList<>();
    }
    this.categoryId.add(categoryIdItem);
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

  public List<Long> getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(List<Long> categoryId) {
    this.categoryId = categoryId;
  }


  public TeslaPersonListRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public TeslaPersonListRequest pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNum() {
    return pageNum;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public TeslaPersonListRequest sortList(List<SortingRuleDto> sortList) {
    
    this.sortList = sortList;
    return this;
  }

  public TeslaPersonListRequest addSortListItem(SortingRuleDto sortListItem) {
    if (this.sortList == null) {
      this.sortList = new ArrayList<>();
    }
    this.sortList.add(sortListItem);
    return this;
  }

   /**
   * Get sortList
   * @return sortList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SortingRuleDto> getSortList() {
    return sortList;
  }


  @JsonProperty(JSON_PROPERTY_SORT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortList(List<SortingRuleDto> sortList) {
    this.sortList = sortList;
  }


  public TeslaPersonListRequest tradeId(Long tradeId) {
    
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTradeId() {
    return tradeId;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }


  public TeslaPersonListRequest roleType(Integer roleType) {
    
    this.roleType = roleType;
    return this;
  }

   /**
   * Get roleType
   * @return roleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoleType() {
    return roleType;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleType(Integer roleType) {
    this.roleType = roleType;
  }


  public TeslaPersonListRequest tradeIdList(List<Long> tradeIdList) {
    
    this.tradeIdList = tradeIdList;
    return this;
  }

  public TeslaPersonListRequest addTradeIdListItem(Long tradeIdListItem) {
    if (this.tradeIdList == null) {
      this.tradeIdList = new ArrayList<>();
    }
    this.tradeIdList.add(tradeIdListItem);
    return this;
  }

   /**
   * Get tradeIdList
   * @return tradeIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTradeIdList() {
    return tradeIdList;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeIdList(List<Long> tradeIdList) {
    this.tradeIdList = tradeIdList;
  }


  public TeslaPersonListRequest contentType(Integer contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(Integer contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaPersonListRequest teslaPersonListRequest = (TeslaPersonListRequest) o;
    return Objects.equals(this.personIdList, teslaPersonListRequest.personIdList) &&
        Objects.equals(this.name, teslaPersonListRequest.name) &&
        Objects.equals(this.status, teslaPersonListRequest.status) &&
        Objects.equals(this.categoryId, teslaPersonListRequest.categoryId) &&
        Objects.equals(this.pageSize, teslaPersonListRequest.pageSize) &&
        Objects.equals(this.pageNum, teslaPersonListRequest.pageNum) &&
        Objects.equals(this.sortList, teslaPersonListRequest.sortList) &&
        Objects.equals(this.tradeId, teslaPersonListRequest.tradeId) &&
        Objects.equals(this.roleType, teslaPersonListRequest.roleType) &&
        Objects.equals(this.tradeIdList, teslaPersonListRequest.tradeIdList) &&
        Objects.equals(this.contentType, teslaPersonListRequest.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personIdList, name, status, categoryId, pageSize, pageNum, sortList, tradeId, roleType, tradeIdList, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaPersonListRequest {\n");
    sb.append("    personIdList: ").append(toIndentedString(personIdList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    sortList: ").append(toIndentedString(sortList)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    tradeIdList: ").append(toIndentedString(tradeIdList)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

