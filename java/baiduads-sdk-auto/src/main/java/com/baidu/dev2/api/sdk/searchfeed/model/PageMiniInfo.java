/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.searchfeed.model;

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
 * PageMiniInfo
 */
@JsonPropertyOrder({
  PageMiniInfo.JSON_PROPERTY_SITE_ID,
  PageMiniInfo.JSON_PROPERTY_LP_URL
})
@JsonTypeName("PageMiniInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageMiniInfo {
  public static final String JSON_PROPERTY_SITE_ID = "siteId";
  private Long siteId;

  public static final String JSON_PROPERTY_LP_URL = "lpUrl";
  private String lpUrl;

  public PageMiniInfo() { 
  }

  public PageMiniInfo siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSiteId() {
    return siteId;
  }


  @JsonProperty(JSON_PROPERTY_SITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public PageMiniInfo lpUrl(String lpUrl) {
    
    this.lpUrl = lpUrl;
    return this;
  }

   /**
   * Get lpUrl
   * @return lpUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpUrl() {
    return lpUrl;
  }


  @JsonProperty(JSON_PROPERTY_LP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpUrl(String lpUrl) {
    this.lpUrl = lpUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMiniInfo pageMiniInfo = (PageMiniInfo) o;
    return Objects.equals(this.siteId, pageMiniInfo.siteId) &&
        Objects.equals(this.lpUrl, pageMiniInfo.lpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, lpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMiniInfo {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    lpUrl: ").append(toIndentedString(lpUrl)).append("\n");
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

