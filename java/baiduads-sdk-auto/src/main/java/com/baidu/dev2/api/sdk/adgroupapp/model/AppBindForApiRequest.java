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
 * AppBindForApiRequest
 */
@JsonPropertyOrder({
  AppBindForApiRequest.JSON_PROPERTY_ID_TYPE,
  AppBindForApiRequest.JSON_PROPERTY_IDS,
  AppBindForApiRequest.JSON_PROPERTY_NAME,
  AppBindForApiRequest.JSON_PROPERTY_PLATFORM,
  AppBindForApiRequest.JSON_PROPERTY_STATUS,
  AppBindForApiRequest.JSON_PROPERTY_ORDER_BY,
  AppBindForApiRequest.JSON_PROPERTY_DESC,
  AppBindForApiRequest.JSON_PROPERTY_LIMIT
})
@JsonTypeName("AppBindForApiRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppBindForApiRequest {
  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private List<Integer> platform = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<Integer> status = null;

  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  private String orderBy;

  public static final String JSON_PROPERTY_DESC = "desc";
  private Boolean desc;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public AppBindForApiRequest() { 
  }

  public AppBindForApiRequest idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  public AppBindForApiRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public AppBindForApiRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public AppBindForApiRequest name(String name) {
    
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


  public AppBindForApiRequest platform(List<Integer> platform) {
    
    this.platform = platform;
    return this;
  }

  public AppBindForApiRequest addPlatformItem(Integer platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(List<Integer> platform) {
    this.platform = platform;
  }


  public AppBindForApiRequest status(List<Integer> status) {
    
    this.status = status;
    return this;
  }

  public AppBindForApiRequest addStatusItem(Integer statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<Integer> status) {
    this.status = status;
  }


  public AppBindForApiRequest orderBy(String orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderBy() {
    return orderBy;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  public AppBindForApiRequest desc(Boolean desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(Boolean desc) {
    this.desc = desc;
  }


  public AppBindForApiRequest limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public AppBindForApiRequest addLimitItem(Integer limitItem) {
    if (this.limit == null) {
      this.limit = new ArrayList<>();
    }
    this.limit.add(limitItem);
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(List<Integer> limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppBindForApiRequest appBindForApiRequest = (AppBindForApiRequest) o;
    return Objects.equals(this.idType, appBindForApiRequest.idType) &&
        Objects.equals(this.ids, appBindForApiRequest.ids) &&
        Objects.equals(this.name, appBindForApiRequest.name) &&
        Objects.equals(this.platform, appBindForApiRequest.platform) &&
        Objects.equals(this.status, appBindForApiRequest.status) &&
        Objects.equals(this.orderBy, appBindForApiRequest.orderBy) &&
        Objects.equals(this.desc, appBindForApiRequest.desc) &&
        Objects.equals(this.limit, appBindForApiRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, ids, name, platform, status, orderBy, desc, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppBindForApiRequest {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
