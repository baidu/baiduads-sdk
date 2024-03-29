/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DynamicCreativeGrabUrl
 */
@JsonPropertyOrder({
  DynamicCreativeGrabUrl.JSON_PROPERTY_URL_TYPE,
  DynamicCreativeGrabUrl.JSON_PROPERTY_URL_NAME
})
@JsonTypeName("DynamicCreativeGrabUrl")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicCreativeGrabUrl {
  public static final String JSON_PROPERTY_URL_TYPE = "urlType";
  private Integer urlType;

  public static final String JSON_PROPERTY_URL_NAME = "urlName";
  private String urlName;

  public DynamicCreativeGrabUrl() { 
  }

  public DynamicCreativeGrabUrl urlType(Integer urlType) {
    
    this.urlType = urlType;
    return this;
  }

   /**
   * Get urlType
   * @return urlType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUrlType() {
    return urlType;
  }


  @JsonProperty(JSON_PROPERTY_URL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlType(Integer urlType) {
    this.urlType = urlType;
  }


  public DynamicCreativeGrabUrl urlName(String urlName) {
    
    this.urlName = urlName;
    return this;
  }

   /**
   * Get urlName
   * @return urlName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlName() {
    return urlName;
  }


  @JsonProperty(JSON_PROPERTY_URL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlName(String urlName) {
    this.urlName = urlName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativeGrabUrl dynamicCreativeGrabUrl = (DynamicCreativeGrabUrl) o;
    return Objects.equals(this.urlType, dynamicCreativeGrabUrl.urlType) &&
        Objects.equals(this.urlName, dynamicCreativeGrabUrl.urlName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlType, urlName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicCreativeGrabUrl {\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
    sb.append("    urlName: ").append(toIndentedString(urlName)).append("\n");
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

