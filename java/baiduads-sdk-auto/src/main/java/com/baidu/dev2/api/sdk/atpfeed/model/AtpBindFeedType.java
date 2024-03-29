/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.atpfeed.model;

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
 * AtpBindFeedType
 */
@JsonPropertyOrder({
  AtpBindFeedType.JSON_PROPERTY_ATP_FEED_ID,
  AtpBindFeedType.JSON_PROPERTY_ADGROUP_FEED_IDS
})
@JsonTypeName("AtpBindFeedType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AtpBindFeedType {
  public static final String JSON_PROPERTY_ATP_FEED_ID = "atpFeedId";
  private Long atpFeedId;

  public static final String JSON_PROPERTY_ADGROUP_FEED_IDS = "adgroupFeedIds";
  private List<Long> adgroupFeedIds = null;

  public AtpBindFeedType() { 
  }

  public AtpBindFeedType atpFeedId(Long atpFeedId) {
    
    this.atpFeedId = atpFeedId;
    return this;
  }

   /**
   * Get atpFeedId
   * @return atpFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAtpFeedId() {
    return atpFeedId;
  }


  @JsonProperty(JSON_PROPERTY_ATP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtpFeedId(Long atpFeedId) {
    this.atpFeedId = atpFeedId;
  }


  public AtpBindFeedType adgroupFeedIds(List<Long> adgroupFeedIds) {
    
    this.adgroupFeedIds = adgroupFeedIds;
    return this;
  }

  public AtpBindFeedType addAdgroupFeedIdsItem(Long adgroupFeedIdsItem) {
    if (this.adgroupFeedIds == null) {
      this.adgroupFeedIds = new ArrayList<>();
    }
    this.adgroupFeedIds.add(adgroupFeedIdsItem);
    return this;
  }

   /**
   * Get adgroupFeedIds
   * @return adgroupFeedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdgroupFeedIds() {
    return adgroupFeedIds;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupFeedIds(List<Long> adgroupFeedIds) {
    this.adgroupFeedIds = adgroupFeedIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtpBindFeedType atpBindFeedType = (AtpBindFeedType) o;
    return Objects.equals(this.atpFeedId, atpBindFeedType.atpFeedId) &&
        Objects.equals(this.adgroupFeedIds, atpBindFeedType.adgroupFeedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atpFeedId, adgroupFeedIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtpBindFeedType {\n");
    sb.append("    atpFeedId: ").append(toIndentedString(atpFeedId)).append("\n");
    sb.append("    adgroupFeedIds: ").append(toIndentedString(adgroupFeedIds)).append("\n");
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

