/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.huituapiv2.model;

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
 * HuituUserTemplateType
 */
@JsonPropertyOrder({
  HuituUserTemplateType.JSON_PROPERTY_USER_TEMPLATE_ID,
  HuituUserTemplateType.JSON_PROPERTY_GROUP_ID,
  HuituUserTemplateType.JSON_PROPERTY_NAME,
  HuituUserTemplateType.JSON_PROPERTY_TYPE,
  HuituUserTemplateType.JSON_PROPERTY_HUITU_TEMPLATE_ID,
  HuituUserTemplateType.JSON_PROPERTY_PRODUCT_COUNT,
  HuituUserTemplateType.JSON_PROPERTY_FEED_ID,
  HuituUserTemplateType.JSON_PROPERTY_CATALOG_ID,
  HuituUserTemplateType.JSON_PROPERTY_FEED_TYPE,
  HuituUserTemplateType.JSON_PROPERTY_UNIT_IDS,
  HuituUserTemplateType.JSON_PROPERTY_DEMO_URL,
  HuituUserTemplateType.JSON_PROPERTY_DEMO_URLS
})
@JsonTypeName("HuituUserTemplateType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HuituUserTemplateType {
  public static final String JSON_PROPERTY_USER_TEMPLATE_ID = "userTemplateId";
  private Long userTemplateId;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private Long groupId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_HUITU_TEMPLATE_ID = "huituTemplateId";
  private Long huituTemplateId;

  public static final String JSON_PROPERTY_PRODUCT_COUNT = "productCount";
  private Integer productCount;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_CATALOG_ID = "catalogId";
  private Long catalogId;

  public static final String JSON_PROPERTY_FEED_TYPE = "feedType";
  private Integer feedType;

  public static final String JSON_PROPERTY_UNIT_IDS = "unitIds";
  private List<Long> unitIds = null;

  public static final String JSON_PROPERTY_DEMO_URL = "demoUrl";
  private String demoUrl;

  public static final String JSON_PROPERTY_DEMO_URLS = "demoUrls";
  private List<String> demoUrls = null;

  public HuituUserTemplateType() { 
  }

  public HuituUserTemplateType userTemplateId(Long userTemplateId) {
    
    this.userTemplateId = userTemplateId;
    return this;
  }

   /**
   * Get userTemplateId
   * @return userTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserTemplateId() {
    return userTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_USER_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserTemplateId(Long userTemplateId) {
    this.userTemplateId = userTemplateId;
  }


  public HuituUserTemplateType groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public HuituUserTemplateType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public HuituUserTemplateType type(Integer type) {
    
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


  public HuituUserTemplateType huituTemplateId(Long huituTemplateId) {
    
    this.huituTemplateId = huituTemplateId;
    return this;
  }

   /**
   * Get huituTemplateId
   * @return huituTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HUITU_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHuituTemplateId() {
    return huituTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_HUITU_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHuituTemplateId(Long huituTemplateId) {
    this.huituTemplateId = huituTemplateId;
  }


  public HuituUserTemplateType productCount(Integer productCount) {
    
    this.productCount = productCount;
    return this;
  }

   /**
   * Get productCount
   * @return productCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductCount() {
    return productCount;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }


  public HuituUserTemplateType feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public HuituUserTemplateType catalogId(Long catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCatalogId() {
    return catalogId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }


  public HuituUserTemplateType feedType(Integer feedType) {
    
    this.feedType = feedType;
    return this;
  }

   /**
   * Get feedType
   * @return feedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFeedType() {
    return feedType;
  }


  @JsonProperty(JSON_PROPERTY_FEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedType(Integer feedType) {
    this.feedType = feedType;
  }


  public HuituUserTemplateType unitIds(List<Long> unitIds) {
    
    this.unitIds = unitIds;
    return this;
  }

  public HuituUserTemplateType addUnitIdsItem(Long unitIdsItem) {
    if (this.unitIds == null) {
      this.unitIds = new ArrayList<>();
    }
    this.unitIds.add(unitIdsItem);
    return this;
  }

   /**
   * Get unitIds
   * @return unitIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUnitIds() {
    return unitIds;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
  }


  public HuituUserTemplateType demoUrl(String demoUrl) {
    
    this.demoUrl = demoUrl;
    return this;
  }

   /**
   * Get demoUrl
   * @return demoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEMO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDemoUrl() {
    return demoUrl;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoUrl(String demoUrl) {
    this.demoUrl = demoUrl;
  }


  public HuituUserTemplateType demoUrls(List<String> demoUrls) {
    
    this.demoUrls = demoUrls;
    return this;
  }

  public HuituUserTemplateType addDemoUrlsItem(String demoUrlsItem) {
    if (this.demoUrls == null) {
      this.demoUrls = new ArrayList<>();
    }
    this.demoUrls.add(demoUrlsItem);
    return this;
  }

   /**
   * Get demoUrls
   * @return demoUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEMO_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDemoUrls() {
    return demoUrls;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoUrls(List<String> demoUrls) {
    this.demoUrls = demoUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HuituUserTemplateType huituUserTemplateType = (HuituUserTemplateType) o;
    return Objects.equals(this.userTemplateId, huituUserTemplateType.userTemplateId) &&
        Objects.equals(this.groupId, huituUserTemplateType.groupId) &&
        Objects.equals(this.name, huituUserTemplateType.name) &&
        Objects.equals(this.type, huituUserTemplateType.type) &&
        Objects.equals(this.huituTemplateId, huituUserTemplateType.huituTemplateId) &&
        Objects.equals(this.productCount, huituUserTemplateType.productCount) &&
        Objects.equals(this.feedId, huituUserTemplateType.feedId) &&
        Objects.equals(this.catalogId, huituUserTemplateType.catalogId) &&
        Objects.equals(this.feedType, huituUserTemplateType.feedType) &&
        Objects.equals(this.unitIds, huituUserTemplateType.unitIds) &&
        Objects.equals(this.demoUrl, huituUserTemplateType.demoUrl) &&
        Objects.equals(this.demoUrls, huituUserTemplateType.demoUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTemplateId, groupId, name, type, huituTemplateId, productCount, feedId, catalogId, feedType, unitIds, demoUrl, demoUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuituUserTemplateType {\n");
    sb.append("    userTemplateId: ").append(toIndentedString(userTemplateId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    huituTemplateId: ").append(toIndentedString(huituTemplateId)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
    sb.append("    unitIds: ").append(toIndentedString(unitIds)).append("\n");
    sb.append("    demoUrl: ").append(toIndentedString(demoUrl)).append("\n");
    sb.append("    demoUrls: ").append(toIndentedString(demoUrls)).append("\n");
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

