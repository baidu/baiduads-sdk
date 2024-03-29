/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativesuggest.model;

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
 * CreativeSegmentRecommendRequest
 */
@JsonPropertyOrder({
  CreativeSegmentRecommendRequest.JSON_PROPERTY_CAMPAIGN_IDS,
  CreativeSegmentRecommendRequest.JSON_PROPERTY_ADGROUP_IDS,
  CreativeSegmentRecommendRequest.JSON_PROPERTY_SEGMENT_TYPES
})
@JsonTypeName("CreativeSegmentRecommendRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreativeSegmentRecommendRequest {
  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_ADGROUP_IDS = "adgroupIds";
  private List<Long> adgroupIds = null;

  public static final String JSON_PROPERTY_SEGMENT_TYPES = "segmentTypes";
  private List<Long> segmentTypes = null;

  public CreativeSegmentRecommendRequest() { 
  }

  public CreativeSegmentRecommendRequest campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CreativeSegmentRecommendRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public CreativeSegmentRecommendRequest adgroupIds(List<Long> adgroupIds) {
    
    this.adgroupIds = adgroupIds;
    return this;
  }

  public CreativeSegmentRecommendRequest addAdgroupIdsItem(Long adgroupIdsItem) {
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


  public CreativeSegmentRecommendRequest segmentTypes(List<Long> segmentTypes) {
    
    this.segmentTypes = segmentTypes;
    return this;
  }

  public CreativeSegmentRecommendRequest addSegmentTypesItem(Long segmentTypesItem) {
    if (this.segmentTypes == null) {
      this.segmentTypes = new ArrayList<>();
    }
    this.segmentTypes.add(segmentTypesItem);
    return this;
  }

   /**
   * Get segmentTypes
   * @return segmentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSegmentTypes() {
    return segmentTypes;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentTypes(List<Long> segmentTypes) {
    this.segmentTypes = segmentTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeSegmentRecommendRequest creativeSegmentRecommendRequest = (CreativeSegmentRecommendRequest) o;
    return Objects.equals(this.campaignIds, creativeSegmentRecommendRequest.campaignIds) &&
        Objects.equals(this.adgroupIds, creativeSegmentRecommendRequest.adgroupIds) &&
        Objects.equals(this.segmentTypes, creativeSegmentRecommendRequest.segmentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, adgroupIds, segmentTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeSegmentRecommendRequest {\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    segmentTypes: ").append(toIndentedString(segmentTypes)).append("\n");
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

