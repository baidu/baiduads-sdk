/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.marketapi.model;

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
 * OpenPageInfoType
 */
@JsonPropertyOrder({
  OpenPageInfoType.JSON_PROPERTY_PAGE_ID,
  OpenPageInfoType.JSON_PROPERTY_PAGE_NAME,
  OpenPageInfoType.JSON_PROPERTY_PAGE_ONLINE_URL,
  OpenPageInfoType.JSON_PROPERTY_AUDIT_STATUS,
  OpenPageInfoType.JSON_PROPERTY_AUDIT_REMARK,
  OpenPageInfoType.JSON_PROPERTY_IS_DELETE,
  OpenPageInfoType.JSON_PROPERTY_CREATE_TIME,
  OpenPageInfoType.JSON_PROPERTY_THUMBNAIL_URL,
  OpenPageInfoType.JSON_PROPERTY_PAGE_TYPE
})
@JsonTypeName("OpenPageInfoType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenPageInfoType {
  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private Long pageId;

  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;

  public static final String JSON_PROPERTY_PAGE_ONLINE_URL = "pageOnlineUrl";
  private String pageOnlineUrl;

  public static final String JSON_PROPERTY_AUDIT_STATUS = "auditStatus";
  private Integer auditStatus;

  public static final String JSON_PROPERTY_AUDIT_REMARK = "auditRemark";
  private String auditRemark;

  public static final String JSON_PROPERTY_IS_DELETE = "isDelete";
  private Boolean isDelete;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private Long createTime;

  public static final String JSON_PROPERTY_THUMBNAIL_URL = "thumbnailUrl";
  private String thumbnailUrl;

  public static final String JSON_PROPERTY_PAGE_TYPE = "pageType";
  private Integer pageType;

  public OpenPageInfoType() { 
  }

  public OpenPageInfoType pageId(Long pageId) {
    
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


  public OpenPageInfoType pageName(String pageName) {
    
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


  public OpenPageInfoType pageOnlineUrl(String pageOnlineUrl) {
    
    this.pageOnlineUrl = pageOnlineUrl;
    return this;
  }

   /**
   * Get pageOnlineUrl
   * @return pageOnlineUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_ONLINE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageOnlineUrl() {
    return pageOnlineUrl;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_ONLINE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageOnlineUrl(String pageOnlineUrl) {
    this.pageOnlineUrl = pageOnlineUrl;
  }


  public OpenPageInfoType auditStatus(Integer auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAuditStatus() {
    return auditStatus;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditStatus(Integer auditStatus) {
    this.auditStatus = auditStatus;
  }


  public OpenPageInfoType auditRemark(String auditRemark) {
    
    this.auditRemark = auditRemark;
    return this;
  }

   /**
   * Get auditRemark
   * @return auditRemark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuditRemark() {
    return auditRemark;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditRemark(String auditRemark) {
    this.auditRemark = auditRemark;
  }


  public OpenPageInfoType isDelete(Boolean isDelete) {
    
    this.isDelete = isDelete;
    return this;
  }

   /**
   * Get isDelete
   * @return isDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDelete() {
    return isDelete;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDelete(Boolean isDelete) {
    this.isDelete = isDelete;
  }


  public OpenPageInfoType createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public OpenPageInfoType thumbnailUrl(String thumbnailUrl) {
    
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public OpenPageInfoType pageType(Integer pageType) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenPageInfoType openPageInfoType = (OpenPageInfoType) o;
    return Objects.equals(this.pageId, openPageInfoType.pageId) &&
        Objects.equals(this.pageName, openPageInfoType.pageName) &&
        Objects.equals(this.pageOnlineUrl, openPageInfoType.pageOnlineUrl) &&
        Objects.equals(this.auditStatus, openPageInfoType.auditStatus) &&
        Objects.equals(this.auditRemark, openPageInfoType.auditRemark) &&
        Objects.equals(this.isDelete, openPageInfoType.isDelete) &&
        Objects.equals(this.createTime, openPageInfoType.createTime) &&
        Objects.equals(this.thumbnailUrl, openPageInfoType.thumbnailUrl) &&
        Objects.equals(this.pageType, openPageInfoType.pageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, pageName, pageOnlineUrl, auditStatus, auditRemark, isDelete, createTime, thumbnailUrl, pageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenPageInfoType {\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    pageOnlineUrl: ").append(toIndentedString(pageOnlineUrl)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    auditRemark: ").append(toIndentedString(auditRemark)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
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

