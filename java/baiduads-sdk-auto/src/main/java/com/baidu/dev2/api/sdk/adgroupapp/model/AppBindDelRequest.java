/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroupapp.model;

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
 * AppBindDelRequest
 */
@JsonPropertyOrder({
  AppBindDelRequest.JSON_PROPERTY_DEL_BIND_IDS
})
@JsonTypeName("AppBindDelRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppBindDelRequest {
  public static final String JSON_PROPERTY_DEL_BIND_IDS = "delBindIds";
  private List<Long> delBindIds = null;

  public AppBindDelRequest() { 
  }

  public AppBindDelRequest delBindIds(List<Long> delBindIds) {
    
    this.delBindIds = delBindIds;
    return this;
  }

  public AppBindDelRequest addDelBindIdsItem(Long delBindIdsItem) {
    if (this.delBindIds == null) {
      this.delBindIds = new ArrayList<>();
    }
    this.delBindIds.add(delBindIdsItem);
    return this;
  }

   /**
   * Get delBindIds
   * @return delBindIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEL_BIND_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getDelBindIds() {
    return delBindIds;
  }


  @JsonProperty(JSON_PROPERTY_DEL_BIND_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelBindIds(List<Long> delBindIds) {
    this.delBindIds = delBindIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppBindDelRequest appBindDelRequest = (AppBindDelRequest) o;
    return Objects.equals(this.delBindIds, appBindDelRequest.delBindIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delBindIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppBindDelRequest {\n");
    sb.append("    delBindIds: ").append(toIndentedString(delBindIds)).append("\n");
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

