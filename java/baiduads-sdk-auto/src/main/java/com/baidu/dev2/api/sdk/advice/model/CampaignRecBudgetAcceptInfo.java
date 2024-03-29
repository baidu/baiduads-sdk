/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.CampaignBudgetType;
import com.baidu.dev2.api.sdk.advice.model.FieldFilter;
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
 * CampaignRecBudgetAcceptInfo
 */
@JsonPropertyOrder({
  CampaignRecBudgetAcceptInfo.JSON_PROPERTY_TOTAL_COUNT,
  CampaignRecBudgetAcceptInfo.JSON_PROPERTY_ITEMS,
  CampaignRecBudgetAcceptInfo.JSON_PROPERTY_BUDGET,
  CampaignRecBudgetAcceptInfo.JSON_PROPERTY_FILTERS
})
@JsonTypeName("CampaignRecBudgetAcceptInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignRecBudgetAcceptInfo {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CampaignBudgetType> items = null;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  private Double budget;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FieldFilter> filters = null;

  public CampaignRecBudgetAcceptInfo() { 
  }

  public CampaignRecBudgetAcceptInfo totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public CampaignRecBudgetAcceptInfo items(List<CampaignBudgetType> items) {
    
    this.items = items;
    return this;
  }

  public CampaignRecBudgetAcceptInfo addItemsItem(CampaignBudgetType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignBudgetType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<CampaignBudgetType> items) {
    this.items = items;
  }


  public CampaignRecBudgetAcceptInfo budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBudget() {
    return budget;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public CampaignRecBudgetAcceptInfo filters(List<FieldFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public CampaignRecBudgetAcceptInfo addFiltersItem(FieldFilter filtersItem) {
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

  public List<FieldFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FieldFilter> filters) {
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
    CampaignRecBudgetAcceptInfo campaignRecBudgetAcceptInfo = (CampaignRecBudgetAcceptInfo) o;
    return Objects.equals(this.totalCount, campaignRecBudgetAcceptInfo.totalCount) &&
        Objects.equals(this.items, campaignRecBudgetAcceptInfo.items) &&
        Objects.equals(this.budget, campaignRecBudgetAcceptInfo.budget) &&
        Objects.equals(this.filters, campaignRecBudgetAcceptInfo.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, items, budget, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRecBudgetAcceptInfo {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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

