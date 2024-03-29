/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

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
 * DanubePlanListRequest
 */
@JsonPropertyOrder({
  DanubePlanListRequest.JSON_PROPERTY_PAGE_NO,
  DanubePlanListRequest.JSON_PROPERTY_PAGE_SIZE,
  DanubePlanListRequest.JSON_PROPERTY_FIELDS,
  DanubePlanListRequest.JSON_PROPERTY_CREATIVE_GROUP_IDS
})
@JsonTypeName("DanubePlanListRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DanubePlanListRequest {
  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = null;

  public static final String JSON_PROPERTY_CREATIVE_GROUP_IDS = "creativeGroupIds";
  private List<Long> creativeGroupIds = null;

  public DanubePlanListRequest() { 
  }

  public DanubePlanListRequest pageNo(Integer pageNo) {
    
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


  public DanubePlanListRequest pageSize(Integer pageSize) {
    
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


  public DanubePlanListRequest fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public DanubePlanListRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public DanubePlanListRequest creativeGroupIds(List<Long> creativeGroupIds) {
    
    this.creativeGroupIds = creativeGroupIds;
    return this;
  }

  public DanubePlanListRequest addCreativeGroupIdsItem(Long creativeGroupIdsItem) {
    if (this.creativeGroupIds == null) {
      this.creativeGroupIds = new ArrayList<>();
    }
    this.creativeGroupIds.add(creativeGroupIdsItem);
    return this;
  }

   /**
   * Get creativeGroupIds
   * @return creativeGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCreativeGroupIds() {
    return creativeGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupIds(List<Long> creativeGroupIds) {
    this.creativeGroupIds = creativeGroupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DanubePlanListRequest danubePlanListRequest = (DanubePlanListRequest) o;
    return Objects.equals(this.pageNo, danubePlanListRequest.pageNo) &&
        Objects.equals(this.pageSize, danubePlanListRequest.pageSize) &&
        Objects.equals(this.fields, danubePlanListRequest.fields) &&
        Objects.equals(this.creativeGroupIds, danubePlanListRequest.creativeGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNo, pageSize, fields, creativeGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DanubePlanListRequest {\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    creativeGroupIds: ").append(toIndentedString(creativeGroupIds)).append("\n");
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

