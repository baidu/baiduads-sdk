/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

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
 * PaPicture
 */
@JsonPropertyOrder({
  PaPicture.JSON_PROPERTY_URL,
  PaPicture.JSON_PROPERTY_TARGET_URL,
  PaPicture.JSON_PROPERTY_NA_URL,
  PaPicture.JSON_PROPERTY_DESC1,
  PaPicture.JSON_PROPERTY_DESC2
})
@JsonTypeName("PaPicture")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaPicture {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_TARGET_URL = "targetUrl";
  private String targetUrl;

  public static final String JSON_PROPERTY_NA_URL = "naUrl";
  private String naUrl;

  public static final String JSON_PROPERTY_DESC1 = "desc1";
  private String desc1;

  public static final String JSON_PROPERTY_DESC2 = "desc2";
  private String desc2;

  public PaPicture() { 
  }

  public PaPicture url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public PaPicture targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetUrl() {
    return targetUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public PaPicture naUrl(String naUrl) {
    
    this.naUrl = naUrl;
    return this;
  }

   /**
   * Get naUrl
   * @return naUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNaUrl() {
    return naUrl;
  }


  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNaUrl(String naUrl) {
    this.naUrl = naUrl;
  }


  public PaPicture desc1(String desc1) {
    
    this.desc1 = desc1;
    return this;
  }

   /**
   * Get desc1
   * @return desc1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc1() {
    return desc1;
  }


  @JsonProperty(JSON_PROPERTY_DESC1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc1(String desc1) {
    this.desc1 = desc1;
  }


  public PaPicture desc2(String desc2) {
    
    this.desc2 = desc2;
    return this;
  }

   /**
   * Get desc2
   * @return desc2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc2() {
    return desc2;
  }


  @JsonProperty(JSON_PROPERTY_DESC2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc2(String desc2) {
    this.desc2 = desc2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaPicture paPicture = (PaPicture) o;
    return Objects.equals(this.url, paPicture.url) &&
        Objects.equals(this.targetUrl, paPicture.targetUrl) &&
        Objects.equals(this.naUrl, paPicture.naUrl) &&
        Objects.equals(this.desc1, paPicture.desc1) &&
        Objects.equals(this.desc2, paPicture.desc2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, targetUrl, naUrl, desc1, desc2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaPicture {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    naUrl: ").append(toIndentedString(naUrl)).append("\n");
    sb.append("    desc1: ").append(toIndentedString(desc1)).append("\n");
    sb.append("    desc2: ").append(toIndentedString(desc2)).append("\n");
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

