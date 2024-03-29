/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.storefunction.model;

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
 * DecorationPage
 */
@JsonPropertyOrder({
  DecorationPage.JSON_PROPERTY_PAGE_ID,
  DecorationPage.JSON_PROPERTY_PAGE_NAME,
  DecorationPage.JSON_PROPERTY_PAGE_URL,
  DecorationPage.JSON_PROPERTY_APP_ID,
  DecorationPage.JSON_PROPERTY_SITE_ID,
  DecorationPage.JSON_PROPERTY_VERSION,
  DecorationPage.JSON_PROPERTY_TPL_ID,
  DecorationPage.JSON_PROPERTY_PAGE_TYPE,
  DecorationPage.JSON_PROPERTY_TYPE,
  DecorationPage.JSON_PROPERTY_DYNAMIC
})
@JsonTypeName("DecorationPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DecorationPage {
  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private Long pageId;

  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;

  public static final String JSON_PROPERTY_PAGE_URL = "pageUrl";
  private String pageUrl;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_SITE_ID = "siteId";
  private Long siteId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TPL_ID = "tplId";
  private Long tplId;

  public static final String JSON_PROPERTY_PAGE_TYPE = "pageType";
  private Integer pageType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_DYNAMIC = "dynamic";
  private Integer dynamic;

  public DecorationPage() { 
  }

  public DecorationPage pageId(Long pageId) {
    
    this.pageId = pageId;
    return this;
  }

   /**
   * Get pageId
   * @return pageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageId() {
    return pageId;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }


  public DecorationPage pageName(String pageName) {
    
    this.pageName = pageName;
    return this;
  }

   /**
   * Get pageName
   * @return pageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageName() {
    return pageName;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  public DecorationPage pageUrl(String pageUrl) {
    
    this.pageUrl = pageUrl;
    return this;
  }

   /**
   * Get pageUrl
   * @return pageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageUrl() {
    return pageUrl;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }


  public DecorationPage appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public DecorationPage siteId(Long siteId) {
    
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


  public DecorationPage version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public DecorationPage tplId(Long tplId) {
    
    this.tplId = tplId;
    return this;
  }

   /**
   * Get tplId
   * @return tplId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TPL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTplId() {
    return tplId;
  }


  @JsonProperty(JSON_PROPERTY_TPL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTplId(Long tplId) {
    this.tplId = tplId;
  }


  public DecorationPage pageType(Integer pageType) {
    
    this.pageType = pageType;
    return this;
  }

   /**
   * Get pageType
   * @return pageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageType() {
    return pageType;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageType(Integer pageType) {
    this.pageType = pageType;
  }


  public DecorationPage type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public DecorationPage dynamic(Integer dynamic) {
    
    this.dynamic = dynamic;
    return this;
  }

   /**
   * Get dynamic
   * @return dynamic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DYNAMIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDynamic() {
    return dynamic;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamic(Integer dynamic) {
    this.dynamic = dynamic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecorationPage decorationPage = (DecorationPage) o;
    return Objects.equals(this.pageId, decorationPage.pageId) &&
        Objects.equals(this.pageName, decorationPage.pageName) &&
        Objects.equals(this.pageUrl, decorationPage.pageUrl) &&
        Objects.equals(this.appId, decorationPage.appId) &&
        Objects.equals(this.siteId, decorationPage.siteId) &&
        Objects.equals(this.version, decorationPage.version) &&
        Objects.equals(this.tplId, decorationPage.tplId) &&
        Objects.equals(this.pageType, decorationPage.pageType) &&
        Objects.equals(this.type, decorationPage.type) &&
        Objects.equals(this.dynamic, decorationPage.dynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, pageName, pageUrl, appId, siteId, version, tplId, pageType, type, dynamic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecorationPage {\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
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

