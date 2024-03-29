/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpaapicreative.model;

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
 * DpaDeleteCreativeRequest
 */
@JsonPropertyOrder({
  DpaDeleteCreativeRequest.JSON_PROPERTY_CREATIVE_IDS,
  DpaDeleteCreativeRequest.JSON_PROPERTY_ADGROUP_IDS
})
@JsonTypeName("DpaDeleteCreativeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DpaDeleteCreativeRequest {
  public static final String JSON_PROPERTY_CREATIVE_IDS = "creativeIds";
  private List<Long> creativeIds = null;

  public static final String JSON_PROPERTY_ADGROUP_IDS = "adgroupIds";
  private List<Long> adgroupIds = null;

  public DpaDeleteCreativeRequest() { 
  }

  public DpaDeleteCreativeRequest creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public DpaDeleteCreativeRequest addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * Get creativeIds
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public DpaDeleteCreativeRequest adgroupIds(List<Long> adgroupIds) {
    
    this.adgroupIds = adgroupIds;
    return this;
  }

  public DpaDeleteCreativeRequest addAdgroupIdsItem(Long adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * Get adgroupIds
   * @return adgroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdgroupIds() {
    return adgroupIds;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupIds(List<Long> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaDeleteCreativeRequest dpaDeleteCreativeRequest = (DpaDeleteCreativeRequest) o;
    return Objects.equals(this.creativeIds, dpaDeleteCreativeRequest.creativeIds) &&
        Objects.equals(this.adgroupIds, dpaDeleteCreativeRequest.adgroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeIds, adgroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaDeleteCreativeRequest {\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
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

