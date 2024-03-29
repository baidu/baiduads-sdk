/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.bulkjobfeed.model;

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
 * GetAllFeedObjectsQuery
 */
@JsonPropertyOrder({
  GetAllFeedObjectsQuery.JSON_PROPERTY_CAMPAIGN_IDS,
  GetAllFeedObjectsQuery.JSON_PROPERTY_FORMAT,
  GetAllFeedObjectsQuery.JSON_PROPERTY_FEED_ACCOUNT_FIELDS,
  GetAllFeedObjectsQuery.JSON_PROPERTY_FEED_CAMPAIGN_FIELDS,
  GetAllFeedObjectsQuery.JSON_PROPERTY_FEED_ADGROUP_FIELDS,
  GetAllFeedObjectsQuery.JSON_PROPERTY_FEED_CREATIVE_FIELDS
})
@JsonTypeName("GetAllFeedObjectsQuery")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAllFeedObjectsQuery {
  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Integer format;

  public static final String JSON_PROPERTY_FEED_ACCOUNT_FIELDS = "feedAccountFields";
  private List<String> feedAccountFields = null;

  public static final String JSON_PROPERTY_FEED_CAMPAIGN_FIELDS = "feedCampaignFields";
  private List<String> feedCampaignFields = null;

  public static final String JSON_PROPERTY_FEED_ADGROUP_FIELDS = "feedAdgroupFields";
  private List<String> feedAdgroupFields = null;

  public static final String JSON_PROPERTY_FEED_CREATIVE_FIELDS = "feedCreativeFields";
  private List<String> feedCreativeFields = null;

  public GetAllFeedObjectsQuery() { 
  }

  public GetAllFeedObjectsQuery campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public GetAllFeedObjectsQuery addCampaignIdsItem(Long campaignIdsItem) {
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


  public GetAllFeedObjectsQuery format(Integer format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(Integer format) {
    this.format = format;
  }


  public GetAllFeedObjectsQuery feedAccountFields(List<String> feedAccountFields) {
    
    this.feedAccountFields = feedAccountFields;
    return this;
  }

  public GetAllFeedObjectsQuery addFeedAccountFieldsItem(String feedAccountFieldsItem) {
    if (this.feedAccountFields == null) {
      this.feedAccountFields = new ArrayList<>();
    }
    this.feedAccountFields.add(feedAccountFieldsItem);
    return this;
  }

   /**
   * Get feedAccountFields
   * @return feedAccountFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_ACCOUNT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFeedAccountFields() {
    return feedAccountFields;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ACCOUNT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAccountFields(List<String> feedAccountFields) {
    this.feedAccountFields = feedAccountFields;
  }


  public GetAllFeedObjectsQuery feedCampaignFields(List<String> feedCampaignFields) {
    
    this.feedCampaignFields = feedCampaignFields;
    return this;
  }

  public GetAllFeedObjectsQuery addFeedCampaignFieldsItem(String feedCampaignFieldsItem) {
    if (this.feedCampaignFields == null) {
      this.feedCampaignFields = new ArrayList<>();
    }
    this.feedCampaignFields.add(feedCampaignFieldsItem);
    return this;
  }

   /**
   * Get feedCampaignFields
   * @return feedCampaignFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFeedCampaignFields() {
    return feedCampaignFields;
  }


  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedCampaignFields(List<String> feedCampaignFields) {
    this.feedCampaignFields = feedCampaignFields;
  }


  public GetAllFeedObjectsQuery feedAdgroupFields(List<String> feedAdgroupFields) {
    
    this.feedAdgroupFields = feedAdgroupFields;
    return this;
  }

  public GetAllFeedObjectsQuery addFeedAdgroupFieldsItem(String feedAdgroupFieldsItem) {
    if (this.feedAdgroupFields == null) {
      this.feedAdgroupFields = new ArrayList<>();
    }
    this.feedAdgroupFields.add(feedAdgroupFieldsItem);
    return this;
  }

   /**
   * Get feedAdgroupFields
   * @return feedAdgroupFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFeedAdgroupFields() {
    return feedAdgroupFields;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAdgroupFields(List<String> feedAdgroupFields) {
    this.feedAdgroupFields = feedAdgroupFields;
  }


  public GetAllFeedObjectsQuery feedCreativeFields(List<String> feedCreativeFields) {
    
    this.feedCreativeFields = feedCreativeFields;
    return this;
  }

  public GetAllFeedObjectsQuery addFeedCreativeFieldsItem(String feedCreativeFieldsItem) {
    if (this.feedCreativeFields == null) {
      this.feedCreativeFields = new ArrayList<>();
    }
    this.feedCreativeFields.add(feedCreativeFieldsItem);
    return this;
  }

   /**
   * Get feedCreativeFields
   * @return feedCreativeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_CREATIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFeedCreativeFields() {
    return feedCreativeFields;
  }


  @JsonProperty(JSON_PROPERTY_FEED_CREATIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedCreativeFields(List<String> feedCreativeFields) {
    this.feedCreativeFields = feedCreativeFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllFeedObjectsQuery getAllFeedObjectsQuery = (GetAllFeedObjectsQuery) o;
    return Objects.equals(this.campaignIds, getAllFeedObjectsQuery.campaignIds) &&
        Objects.equals(this.format, getAllFeedObjectsQuery.format) &&
        Objects.equals(this.feedAccountFields, getAllFeedObjectsQuery.feedAccountFields) &&
        Objects.equals(this.feedCampaignFields, getAllFeedObjectsQuery.feedCampaignFields) &&
        Objects.equals(this.feedAdgroupFields, getAllFeedObjectsQuery.feedAdgroupFields) &&
        Objects.equals(this.feedCreativeFields, getAllFeedObjectsQuery.feedCreativeFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, format, feedAccountFields, feedCampaignFields, feedAdgroupFields, feedCreativeFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllFeedObjectsQuery {\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    feedAccountFields: ").append(toIndentedString(feedAccountFields)).append("\n");
    sb.append("    feedCampaignFields: ").append(toIndentedString(feedCampaignFields)).append("\n");
    sb.append("    feedAdgroupFields: ").append(toIndentedString(feedAdgroupFields)).append("\n");
    sb.append("    feedCreativeFields: ").append(toIndentedString(feedCreativeFields)).append("\n");
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

