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
 * StorePageInfoType
 */
@JsonPropertyOrder({
  StorePageInfoType.JSON_PROPERTY_STORE_ID,
  StorePageInfoType.JSON_PROPERTY_PAGE_ID,
  StorePageInfoType.JSON_PROPERTY_URL,
  StorePageInfoType.JSON_PROPERTY_PAGE_TYPE,
  StorePageInfoType.JSON_PROPERTY_STORE_NAME,
  StorePageInfoType.JSON_PROPERTY_RESOURCE_ID,
  StorePageInfoType.JSON_PROPERTY_NEW_STORE_ID,
  StorePageInfoType.JSON_PROPERTY_TYPE,
  StorePageInfoType.JSON_PROPERTY_MONITOR_CODE,
  StorePageInfoType.JSON_PROPERTY_STORE_SHOP_TYPE
})
@JsonTypeName("StorePageInfoType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StorePageInfoType {
  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private Long storeId;

  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private Long pageId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PAGE_TYPE = "pageType";
  private Integer pageType;

  public static final String JSON_PROPERTY_STORE_NAME = "storeName";
  private String storeName;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private Long resourceId;

  public static final String JSON_PROPERTY_NEW_STORE_ID = "newStoreId";
  private Long newStoreId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_MONITOR_CODE = "monitorCode";
  private String monitorCode;

  public static final String JSON_PROPERTY_STORE_SHOP_TYPE = "storeShopType";
  private Integer storeShopType;

  public StorePageInfoType() { 
  }

  public StorePageInfoType storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStoreId() {
    return storeId;
  }


  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public StorePageInfoType pageId(Long pageId) {
    
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


  public StorePageInfoType url(String url) {
    
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


  public StorePageInfoType pageType(Integer pageType) {
    
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


  public StorePageInfoType storeName(String storeName) {
    
    this.storeName = storeName;
    return this;
  }

   /**
   * Get storeName
   * @return storeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreName() {
    return storeName;
  }


  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public StorePageInfoType resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResourceId() {
    return resourceId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public StorePageInfoType newStoreId(Long newStoreId) {
    
    this.newStoreId = newStoreId;
    return this;
  }

   /**
   * Get newStoreId
   * @return newStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNewStoreId() {
    return newStoreId;
  }


  @JsonProperty(JSON_PROPERTY_NEW_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewStoreId(Long newStoreId) {
    this.newStoreId = newStoreId;
  }


  public StorePageInfoType type(Integer type) {
    
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


  public StorePageInfoType monitorCode(String monitorCode) {
    
    this.monitorCode = monitorCode;
    return this;
  }

   /**
   * Get monitorCode
   * @return monitorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorCode() {
    return monitorCode;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorCode(String monitorCode) {
    this.monitorCode = monitorCode;
  }


  public StorePageInfoType storeShopType(Integer storeShopType) {
    
    this.storeShopType = storeShopType;
    return this;
  }

   /**
   * Get storeShopType
   * @return storeShopType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORE_SHOP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStoreShopType() {
    return storeShopType;
  }


  @JsonProperty(JSON_PROPERTY_STORE_SHOP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreShopType(Integer storeShopType) {
    this.storeShopType = storeShopType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorePageInfoType storePageInfoType = (StorePageInfoType) o;
    return Objects.equals(this.storeId, storePageInfoType.storeId) &&
        Objects.equals(this.pageId, storePageInfoType.pageId) &&
        Objects.equals(this.url, storePageInfoType.url) &&
        Objects.equals(this.pageType, storePageInfoType.pageType) &&
        Objects.equals(this.storeName, storePageInfoType.storeName) &&
        Objects.equals(this.resourceId, storePageInfoType.resourceId) &&
        Objects.equals(this.newStoreId, storePageInfoType.newStoreId) &&
        Objects.equals(this.type, storePageInfoType.type) &&
        Objects.equals(this.monitorCode, storePageInfoType.monitorCode) &&
        Objects.equals(this.storeShopType, storePageInfoType.storeShopType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, pageId, url, pageType, storeName, resourceId, newStoreId, type, monitorCode, storeShopType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorePageInfoType {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    newStoreId: ").append(toIndentedString(newStoreId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    monitorCode: ").append(toIndentedString(monitorCode)).append("\n");
    sb.append("    storeShopType: ").append(toIndentedString(storeShopType)).append("\n");
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

