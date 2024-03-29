/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.jmysite.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.jmysite.model.JmyPageInfoType;
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
 * JmyPageListResponse
 */
@JsonPropertyOrder({
  JmyPageListResponse.JSON_PROPERTY_TOTAL_NUM,
  JmyPageListResponse.JSON_PROPERTY_LIST
})
@JsonTypeName("JmyPageListResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JmyPageListResponse {
  public static final String JSON_PROPERTY_TOTAL_NUM = "totalNum";
  private Integer totalNum;

  public static final String JSON_PROPERTY_LIST = "list";
  private List<JmyPageInfoType> list = null;

  public JmyPageListResponse() { 
  }

  public JmyPageListResponse totalNum(Integer totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * Get totalNum
   * @return totalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNum() {
    return totalNum;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }


  public JmyPageListResponse list(List<JmyPageInfoType> list) {
    
    this.list = list;
    return this;
  }

  public JmyPageListResponse addListItem(JmyPageInfoType listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<JmyPageInfoType> getList() {
    return list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setList(List<JmyPageInfoType> list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JmyPageListResponse jmyPageListResponse = (JmyPageListResponse) o;
    return Objects.equals(this.totalNum, jmyPageListResponse.totalNum) &&
        Objects.equals(this.list, jmyPageListResponse.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNum, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JmyPageListResponse {\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

