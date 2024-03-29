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
import com.baidu.dev2.api.sdk.advice.model.BudgetAdjustTimeType;
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
 * CampaignBudgetType
 */
@JsonPropertyOrder({
  CampaignBudgetType.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignBudgetType.JSON_PROPERTY_CAMPAIGN_NAME,
  CampaignBudgetType.JSON_PROPERTY_BUDGET,
  CampaignBudgetType.JSON_PROPERTY_LAST_BUDGET_OFFLINE_TIME,
  CampaignBudgetType.JSON_PROPERTY_BUDGET_CUMULATE_STATUS,
  CampaignBudgetType.JSON_PROPERTY_RE_ONLINE_REASONS,
  CampaignBudgetType.JSON_PROPERTY_OFFLINE_TIME_RATIO,
  CampaignBudgetType.JSON_PROPERTY_RECOMMEND_BUDGET,
  CampaignBudgetType.JSON_PROPERTY_IMPRESSION,
  CampaignBudgetType.JSON_PROPERTY_CLICK,
  CampaignBudgetType.JSON_PROPERTY_COST,
  CampaignBudgetType.JSON_PROPERTY_OLD_BUDGET
})
@JsonTypeName("CampaignBudgetType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignBudgetType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  private Double budget;

  public static final String JSON_PROPERTY_LAST_BUDGET_OFFLINE_TIME = "lastBudgetOfflineTime";
  private String lastBudgetOfflineTime;

  public static final String JSON_PROPERTY_BUDGET_CUMULATE_STATUS = "budgetCumulateStatus";
  private Boolean budgetCumulateStatus;

  public static final String JSON_PROPERTY_RE_ONLINE_REASONS = "reOnlineReasons";
  private List<BudgetAdjustTimeType> reOnlineReasons = null;

  public static final String JSON_PROPERTY_OFFLINE_TIME_RATIO = "offlineTimeRatio";
  private Double offlineTimeRatio;

  public static final String JSON_PROPERTY_RECOMMEND_BUDGET = "recommendBudget";
  private Double recommendBudget;

  public static final String JSON_PROPERTY_IMPRESSION = "impression";
  private Long impression;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Long click;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_OLD_BUDGET = "oldBudget";
  private Double oldBudget;

  public CampaignBudgetType() { 
  }

  public CampaignBudgetType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignBudgetType campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignBudgetType budget(Double budget) {
    
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


  public CampaignBudgetType lastBudgetOfflineTime(String lastBudgetOfflineTime) {
    
    this.lastBudgetOfflineTime = lastBudgetOfflineTime;
    return this;
  }

   /**
   * Get lastBudgetOfflineTime
   * @return lastBudgetOfflineTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_BUDGET_OFFLINE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastBudgetOfflineTime() {
    return lastBudgetOfflineTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_BUDGET_OFFLINE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastBudgetOfflineTime(String lastBudgetOfflineTime) {
    this.lastBudgetOfflineTime = lastBudgetOfflineTime;
  }


  public CampaignBudgetType budgetCumulateStatus(Boolean budgetCumulateStatus) {
    
    this.budgetCumulateStatus = budgetCumulateStatus;
    return this;
  }

   /**
   * Get budgetCumulateStatus
   * @return budgetCumulateStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUDGET_CUMULATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBudgetCumulateStatus() {
    return budgetCumulateStatus;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET_CUMULATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudgetCumulateStatus(Boolean budgetCumulateStatus) {
    this.budgetCumulateStatus = budgetCumulateStatus;
  }


  public CampaignBudgetType reOnlineReasons(List<BudgetAdjustTimeType> reOnlineReasons) {
    
    this.reOnlineReasons = reOnlineReasons;
    return this;
  }

  public CampaignBudgetType addReOnlineReasonsItem(BudgetAdjustTimeType reOnlineReasonsItem) {
    if (this.reOnlineReasons == null) {
      this.reOnlineReasons = new ArrayList<>();
    }
    this.reOnlineReasons.add(reOnlineReasonsItem);
    return this;
  }

   /**
   * Get reOnlineReasons
   * @return reOnlineReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RE_ONLINE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BudgetAdjustTimeType> getReOnlineReasons() {
    return reOnlineReasons;
  }


  @JsonProperty(JSON_PROPERTY_RE_ONLINE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReOnlineReasons(List<BudgetAdjustTimeType> reOnlineReasons) {
    this.reOnlineReasons = reOnlineReasons;
  }


  public CampaignBudgetType offlineTimeRatio(Double offlineTimeRatio) {
    
    this.offlineTimeRatio = offlineTimeRatio;
    return this;
  }

   /**
   * Get offlineTimeRatio
   * @return offlineTimeRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFLINE_TIME_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOfflineTimeRatio() {
    return offlineTimeRatio;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE_TIME_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfflineTimeRatio(Double offlineTimeRatio) {
    this.offlineTimeRatio = offlineTimeRatio;
  }


  public CampaignBudgetType recommendBudget(Double recommendBudget) {
    
    this.recommendBudget = recommendBudget;
    return this;
  }

   /**
   * Get recommendBudget
   * @return recommendBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRecommendBudget() {
    return recommendBudget;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendBudget(Double recommendBudget) {
    this.recommendBudget = recommendBudget;
  }


  public CampaignBudgetType impression(Long impression) {
    
    this.impression = impression;
    return this;
  }

   /**
   * Get impression
   * @return impression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpression() {
    return impression;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpression(Long impression) {
    this.impression = impression;
  }


  public CampaignBudgetType click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Long click) {
    this.click = click;
  }


  public CampaignBudgetType cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public CampaignBudgetType oldBudget(Double oldBudget) {
    
    this.oldBudget = oldBudget;
    return this;
  }

   /**
   * Get oldBudget
   * @return oldBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOldBudget() {
    return oldBudget;
  }


  @JsonProperty(JSON_PROPERTY_OLD_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldBudget(Double oldBudget) {
    this.oldBudget = oldBudget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBudgetType campaignBudgetType = (CampaignBudgetType) o;
    return Objects.equals(this.campaignId, campaignBudgetType.campaignId) &&
        Objects.equals(this.campaignName, campaignBudgetType.campaignName) &&
        Objects.equals(this.budget, campaignBudgetType.budget) &&
        Objects.equals(this.lastBudgetOfflineTime, campaignBudgetType.lastBudgetOfflineTime) &&
        Objects.equals(this.budgetCumulateStatus, campaignBudgetType.budgetCumulateStatus) &&
        Objects.equals(this.reOnlineReasons, campaignBudgetType.reOnlineReasons) &&
        Objects.equals(this.offlineTimeRatio, campaignBudgetType.offlineTimeRatio) &&
        Objects.equals(this.recommendBudget, campaignBudgetType.recommendBudget) &&
        Objects.equals(this.impression, campaignBudgetType.impression) &&
        Objects.equals(this.click, campaignBudgetType.click) &&
        Objects.equals(this.cost, campaignBudgetType.cost) &&
        Objects.equals(this.oldBudget, campaignBudgetType.oldBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, budget, lastBudgetOfflineTime, budgetCumulateStatus, reOnlineReasons, offlineTimeRatio, recommendBudget, impression, click, cost, oldBudget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBudgetType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    lastBudgetOfflineTime: ").append(toIndentedString(lastBudgetOfflineTime)).append("\n");
    sb.append("    budgetCumulateStatus: ").append(toIndentedString(budgetCumulateStatus)).append("\n");
    sb.append("    reOnlineReasons: ").append(toIndentedString(reOnlineReasons)).append("\n");
    sb.append("    offlineTimeRatio: ").append(toIndentedString(offlineTimeRatio)).append("\n");
    sb.append("    recommendBudget: ").append(toIndentedString(recommendBudget)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    oldBudget: ").append(toIndentedString(oldBudget)).append("\n");
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

