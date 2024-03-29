/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.adgroup.model.ApiAdgroupType;
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
 * ApiAdgroupAddRequest
 */
@JsonPropertyOrder({
  ApiAdgroupAddRequest.JSON_PROPERTY_ADGROUP_TYPES,
  ApiAdgroupAddRequest.JSON_PROPERTY_AD_TYPE
})
@JsonTypeName("ApiAdgroupAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAdgroupAddRequest {
  public static final String JSON_PROPERTY_ADGROUP_TYPES = "adgroupTypes";
  private List<ApiAdgroupType> adgroupTypes = null;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public ApiAdgroupAddRequest() { 
  }

  public ApiAdgroupAddRequest adgroupTypes(List<ApiAdgroupType> adgroupTypes) {
    
    this.adgroupTypes = adgroupTypes;
    return this;
  }

  public ApiAdgroupAddRequest addAdgroupTypesItem(ApiAdgroupType adgroupTypesItem) {
    if (this.adgroupTypes == null) {
      this.adgroupTypes = new ArrayList<>();
    }
    this.adgroupTypes.add(adgroupTypesItem);
    return this;
  }

   /**
   * Get adgroupTypes
   * @return adgroupTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiAdgroupType> getAdgroupTypes() {
    return adgroupTypes;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupTypes(List<ApiAdgroupType> adgroupTypes) {
    this.adgroupTypes = adgroupTypes;
  }


  public ApiAdgroupAddRequest adType(Integer adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(Integer adType) {
    this.adType = adType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAdgroupAddRequest apiAdgroupAddRequest = (ApiAdgroupAddRequest) o;
    return Objects.equals(this.adgroupTypes, apiAdgroupAddRequest.adgroupTypes) &&
        Objects.equals(this.adType, apiAdgroupAddRequest.adType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupTypes, adType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAdgroupAddRequest {\n");
    sb.append("    adgroupTypes: ").append(toIndentedString(adgroupTypes)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
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

