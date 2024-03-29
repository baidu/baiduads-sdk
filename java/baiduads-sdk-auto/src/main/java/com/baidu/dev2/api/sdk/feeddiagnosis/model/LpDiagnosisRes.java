/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.feeddiagnosis.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.StrNumEChartVal;
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
 * LpDiagnosisRes
 */
@JsonPropertyOrder({
  LpDiagnosisRes.JSON_PROPERTY_LP_INFO,
  LpDiagnosisRes.JSON_PROPERTY_LP_DESC,
  LpDiagnosisRes.JSON_PROPERTY_CVR_LIST,
  LpDiagnosisRes.JSON_PROPERTY_GOOD_CVR_LIST,
  LpDiagnosisRes.JSON_PROPERTY_AVG_CVR_LIST,
  LpDiagnosisRes.JSON_PROPERTY_CVR_TRADE_RANK,
  LpDiagnosisRes.JSON_PROPERTY_LP_QUALITY_INFO,
  LpDiagnosisRes.JSON_PROPERTY_LP_QUALITY_DESC
})
@JsonTypeName("LpDiagnosisRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LpDiagnosisRes {
  public static final String JSON_PROPERTY_LP_INFO = "lpInfo";
  private String lpInfo;

  public static final String JSON_PROPERTY_LP_DESC = "lpDesc";
  private String lpDesc;

  public static final String JSON_PROPERTY_CVR_LIST = "cvrList";
  private List<StrNumEChartVal> cvrList = null;

  public static final String JSON_PROPERTY_GOOD_CVR_LIST = "goodCvrList";
  private List<StrNumEChartVal> goodCvrList = null;

  public static final String JSON_PROPERTY_AVG_CVR_LIST = "avgCvrList";
  private List<StrNumEChartVal> avgCvrList = null;

  public static final String JSON_PROPERTY_CVR_TRADE_RANK = "cvrTradeRank";
  private Double cvrTradeRank;

  public static final String JSON_PROPERTY_LP_QUALITY_INFO = "lpQualityInfo";
  private String lpQualityInfo;

  public static final String JSON_PROPERTY_LP_QUALITY_DESC = "lpQualityDesc";
  private String lpQualityDesc;

  public LpDiagnosisRes() { 
  }

  public LpDiagnosisRes lpInfo(String lpInfo) {
    
    this.lpInfo = lpInfo;
    return this;
  }

   /**
   * Get lpInfo
   * @return lpInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpInfo() {
    return lpInfo;
  }


  @JsonProperty(JSON_PROPERTY_LP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpInfo(String lpInfo) {
    this.lpInfo = lpInfo;
  }


  public LpDiagnosisRes lpDesc(String lpDesc) {
    
    this.lpDesc = lpDesc;
    return this;
  }

   /**
   * Get lpDesc
   * @return lpDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpDesc() {
    return lpDesc;
  }


  @JsonProperty(JSON_PROPERTY_LP_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpDesc(String lpDesc) {
    this.lpDesc = lpDesc;
  }


  public LpDiagnosisRes cvrList(List<StrNumEChartVal> cvrList) {
    
    this.cvrList = cvrList;
    return this;
  }

  public LpDiagnosisRes addCvrListItem(StrNumEChartVal cvrListItem) {
    if (this.cvrList == null) {
      this.cvrList = new ArrayList<>();
    }
    this.cvrList.add(cvrListItem);
    return this;
  }

   /**
   * Get cvrList
   * @return cvrList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StrNumEChartVal> getCvrList() {
    return cvrList;
  }


  @JsonProperty(JSON_PROPERTY_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvrList(List<StrNumEChartVal> cvrList) {
    this.cvrList = cvrList;
  }


  public LpDiagnosisRes goodCvrList(List<StrNumEChartVal> goodCvrList) {
    
    this.goodCvrList = goodCvrList;
    return this;
  }

  public LpDiagnosisRes addGoodCvrListItem(StrNumEChartVal goodCvrListItem) {
    if (this.goodCvrList == null) {
      this.goodCvrList = new ArrayList<>();
    }
    this.goodCvrList.add(goodCvrListItem);
    return this;
  }

   /**
   * Get goodCvrList
   * @return goodCvrList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOOD_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StrNumEChartVal> getGoodCvrList() {
    return goodCvrList;
  }


  @JsonProperty(JSON_PROPERTY_GOOD_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodCvrList(List<StrNumEChartVal> goodCvrList) {
    this.goodCvrList = goodCvrList;
  }


  public LpDiagnosisRes avgCvrList(List<StrNumEChartVal> avgCvrList) {
    
    this.avgCvrList = avgCvrList;
    return this;
  }

  public LpDiagnosisRes addAvgCvrListItem(StrNumEChartVal avgCvrListItem) {
    if (this.avgCvrList == null) {
      this.avgCvrList = new ArrayList<>();
    }
    this.avgCvrList.add(avgCvrListItem);
    return this;
  }

   /**
   * Get avgCvrList
   * @return avgCvrList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVG_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StrNumEChartVal> getAvgCvrList() {
    return avgCvrList;
  }


  @JsonProperty(JSON_PROPERTY_AVG_CVR_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgCvrList(List<StrNumEChartVal> avgCvrList) {
    this.avgCvrList = avgCvrList;
  }


  public LpDiagnosisRes cvrTradeRank(Double cvrTradeRank) {
    
    this.cvrTradeRank = cvrTradeRank;
    return this;
  }

   /**
   * Get cvrTradeRank
   * @return cvrTradeRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CVR_TRADE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCvrTradeRank() {
    return cvrTradeRank;
  }


  @JsonProperty(JSON_PROPERTY_CVR_TRADE_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvrTradeRank(Double cvrTradeRank) {
    this.cvrTradeRank = cvrTradeRank;
  }


  public LpDiagnosisRes lpQualityInfo(String lpQualityInfo) {
    
    this.lpQualityInfo = lpQualityInfo;
    return this;
  }

   /**
   * Get lpQualityInfo
   * @return lpQualityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_QUALITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpQualityInfo() {
    return lpQualityInfo;
  }


  @JsonProperty(JSON_PROPERTY_LP_QUALITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpQualityInfo(String lpQualityInfo) {
    this.lpQualityInfo = lpQualityInfo;
  }


  public LpDiagnosisRes lpQualityDesc(String lpQualityDesc) {
    
    this.lpQualityDesc = lpQualityDesc;
    return this;
  }

   /**
   * Get lpQualityDesc
   * @return lpQualityDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_QUALITY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLpQualityDesc() {
    return lpQualityDesc;
  }


  @JsonProperty(JSON_PROPERTY_LP_QUALITY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpQualityDesc(String lpQualityDesc) {
    this.lpQualityDesc = lpQualityDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LpDiagnosisRes lpDiagnosisRes = (LpDiagnosisRes) o;
    return Objects.equals(this.lpInfo, lpDiagnosisRes.lpInfo) &&
        Objects.equals(this.lpDesc, lpDiagnosisRes.lpDesc) &&
        Objects.equals(this.cvrList, lpDiagnosisRes.cvrList) &&
        Objects.equals(this.goodCvrList, lpDiagnosisRes.goodCvrList) &&
        Objects.equals(this.avgCvrList, lpDiagnosisRes.avgCvrList) &&
        Objects.equals(this.cvrTradeRank, lpDiagnosisRes.cvrTradeRank) &&
        Objects.equals(this.lpQualityInfo, lpDiagnosisRes.lpQualityInfo) &&
        Objects.equals(this.lpQualityDesc, lpDiagnosisRes.lpQualityDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lpInfo, lpDesc, cvrList, goodCvrList, avgCvrList, cvrTradeRank, lpQualityInfo, lpQualityDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LpDiagnosisRes {\n");
    sb.append("    lpInfo: ").append(toIndentedString(lpInfo)).append("\n");
    sb.append("    lpDesc: ").append(toIndentedString(lpDesc)).append("\n");
    sb.append("    cvrList: ").append(toIndentedString(cvrList)).append("\n");
    sb.append("    goodCvrList: ").append(toIndentedString(goodCvrList)).append("\n");
    sb.append("    avgCvrList: ").append(toIndentedString(avgCvrList)).append("\n");
    sb.append("    cvrTradeRank: ").append(toIndentedString(cvrTradeRank)).append("\n");
    sb.append("    lpQualityInfo: ").append(toIndentedString(lpQualityInfo)).append("\n");
    sb.append("    lpQualityDesc: ").append(toIndentedString(lpQualityDesc)).append("\n");
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

