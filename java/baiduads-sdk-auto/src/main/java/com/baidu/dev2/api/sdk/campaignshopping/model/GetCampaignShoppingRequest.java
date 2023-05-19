/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaignshopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.campaignshopping.model.FilterCondition;
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
 * GetCampaignShoppingRequest
 */
@JsonPropertyOrder({
  GetCampaignShoppingRequest.JSON_PROPERTY_CAMPAIGN_SHOPPING_IDS,
  GetCampaignShoppingRequest.JSON_PROPERTY_SORT_FIELD,
  GetCampaignShoppingRequest.JSON_PROPERTY_IS_DESC,
  GetCampaignShoppingRequest.JSON_PROPERTY_LIMIT,
  GetCampaignShoppingRequest.JSON_PROPERTY_CAMPAIGN_SHOPPING_FIELDS,
  GetCampaignShoppingRequest.JSON_PROPERTY_FILTERS
})
@JsonTypeName("GetCampaignShoppingRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetCampaignShoppingRequest {
  public static final String JSON_PROPERTY_CAMPAIGN_SHOPPING_IDS = "campaignShoppingIds";
  private List<Long> campaignShoppingIds = null;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_IS_DESC = "isDesc";
  private Boolean isDesc;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public static final String JSON_PROPERTY_CAMPAIGN_SHOPPING_FIELDS = "campaignShoppingFields";
  private List<String> campaignShoppingFields = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FilterCondition> filters = null;

  public GetCampaignShoppingRequest() { 
  }

  public GetCampaignShoppingRequest campaignShoppingIds(List<Long> campaignShoppingIds) {
    
    this.campaignShoppingIds = campaignShoppingIds;
    return this;
  }

  public GetCampaignShoppingRequest addCampaignShoppingIdsItem(Long campaignShoppingIdsItem) {
    if (this.campaignShoppingIds == null) {
      this.campaignShoppingIds = new ArrayList<>();
    }
    this.campaignShoppingIds.add(campaignShoppingIdsItem);
    return this;
  }

   /**
   * Get campaignShoppingIds
   * @return campaignShoppingIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignShoppingIds() {
    return campaignShoppingIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignShoppingIds(List<Long> campaignShoppingIds) {
    this.campaignShoppingIds = campaignShoppingIds;
  }


  public GetCampaignShoppingRequest sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public GetCampaignShoppingRequest isDesc(Boolean isDesc) {
    
    this.isDesc = isDesc;
    return this;
  }

   /**
   * Get isDesc
   * @return isDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDesc() {
    return isDesc;
  }


  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDesc(Boolean isDesc) {
    this.isDesc = isDesc;
  }


  public GetCampaignShoppingRequest limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public GetCampaignShoppingRequest addLimitItem(Integer limitItem) {
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


  public GetCampaignShoppingRequest campaignShoppingFields(List<String> campaignShoppingFields) {
    
    this.campaignShoppingFields = campaignShoppingFields;
    return this;
  }

  public GetCampaignShoppingRequest addCampaignShoppingFieldsItem(String campaignShoppingFieldsItem) {
    if (this.campaignShoppingFields == null) {
      this.campaignShoppingFields = new ArrayList<>();
    }
    this.campaignShoppingFields.add(campaignShoppingFieldsItem);
    return this;
  }

   /**
   * Get campaignShoppingFields
   * @return campaignShoppingFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCampaignShoppingFields() {
    return campaignShoppingFields;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignShoppingFields(List<String> campaignShoppingFields) {
    this.campaignShoppingFields = campaignShoppingFields;
  }


  public GetCampaignShoppingRequest filters(List<FilterCondition> filters) {
    
    this.filters = filters;
    return this;
  }

  public GetCampaignShoppingRequest addFiltersItem(FilterCondition filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FilterCondition> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FilterCondition> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignShoppingRequest getCampaignShoppingRequest = (GetCampaignShoppingRequest) o;
    return Objects.equals(this.campaignShoppingIds, getCampaignShoppingRequest.campaignShoppingIds) &&
        Objects.equals(this.sortField, getCampaignShoppingRequest.sortField) &&
        Objects.equals(this.isDesc, getCampaignShoppingRequest.isDesc) &&
        Objects.equals(this.limit, getCampaignShoppingRequest.limit) &&
        Objects.equals(this.campaignShoppingFields, getCampaignShoppingRequest.campaignShoppingFields) &&
        Objects.equals(this.filters, getCampaignShoppingRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignShoppingIds, sortField, isDesc, limit, campaignShoppingFields, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignShoppingRequest {\n");
    sb.append("    campaignShoppingIds: ").append(toIndentedString(campaignShoppingIds)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    campaignShoppingFields: ").append(toIndentedString(campaignShoppingFields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

