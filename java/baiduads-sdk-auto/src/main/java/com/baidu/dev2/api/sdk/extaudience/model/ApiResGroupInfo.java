/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.extaudience.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.extaudience.model.DspStatsItemForFe;
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
 * ApiResGroupInfo
 */
@JsonPropertyOrder({
  ApiResGroupInfo.JSON_PROPERTY_GROUP_ID,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_NAME,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_TYPE,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_STATUS,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_COUNT,
  ApiResGroupInfo.JSON_PROPERTY_DAILY_COUNT,
  ApiResGroupInfo.JSON_PROPERTY_CREATE_TIME,
  ApiResGroupInfo.JSON_PROPERTY_EXPIRE_TIME,
  ApiResGroupInfo.JSON_PROPERTY_CREATE_BY,
  ApiResGroupInfo.JSON_PROPERTY_FC_HISTORY,
  ApiResGroupInfo.JSON_PROPERTY_FC_A_PI_APP,
  ApiResGroupInfo.JSON_PROPERTY_WORD_URL_COUNT,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_TYPE_DESC,
  ApiResGroupInfo.JSON_PROPERTY_THIRD_PARTY_TYPE,
  ApiResGroupInfo.JSON_PROPERTY_DPA_TYPE,
  ApiResGroupInfo.JSON_PROPERTY_DSP_STATS,
  ApiResGroupInfo.JSON_PROPERTY_DSP_STATUS,
  ApiResGroupInfo.JSON_PROPERTY_RECOMMEND,
  ApiResGroupInfo.JSON_PROPERTY_RECOMMEND_DESC,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_COUNT_XIAODU,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_COUNT_XIAODU_SCREEN,
  ApiResGroupInfo.JSON_PROPERTY_GROUP_COUNT_XIAODU_SOUND
})
@JsonTypeName("ApiResGroupInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiResGroupInfo {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private Long groupId;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_GROUP_TYPE = "groupType";
  private String groupType;

  public static final String JSON_PROPERTY_GROUP_STATUS = "groupStatus";
  private String groupStatus;

  public static final String JSON_PROPERTY_GROUP_COUNT = "groupCount";
  private Integer groupCount;

  public static final String JSON_PROPERTY_DAILY_COUNT = "dailyCount";
  private Integer dailyCount;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private Long createTime;

  public static final String JSON_PROPERTY_EXPIRE_TIME = "expireTime";
  private Long expireTime;

  public static final String JSON_PROPERTY_CREATE_BY = "createBy";
  private Long createBy;

  public static final String JSON_PROPERTY_FC_HISTORY = "fcHistory";
  private Boolean fcHistory;

  public static final String JSON_PROPERTY_FC_A_PI_APP = "fcAPiApp";
  private Boolean fcAPiApp;

  public static final String JSON_PROPERTY_WORD_URL_COUNT = "wordUrlCount";
  private Integer wordUrlCount;

  public static final String JSON_PROPERTY_GROUP_TYPE_DESC = "groupTypeDesc";
  private String groupTypeDesc;

  public static final String JSON_PROPERTY_THIRD_PARTY_TYPE = "thirdPartyType";
  private String thirdPartyType;

  public static final String JSON_PROPERTY_DPA_TYPE = "dpaType";
  private Integer dpaType;

  public static final String JSON_PROPERTY_DSP_STATS = "dspStats";
  private List<DspStatsItemForFe> dspStats = null;

  public static final String JSON_PROPERTY_DSP_STATUS = "dspStatus";
  private String dspStatus;

  public static final String JSON_PROPERTY_RECOMMEND = "recommend";
  private Boolean recommend;

  public static final String JSON_PROPERTY_RECOMMEND_DESC = "recommendDesc";
  private String recommendDesc;

  public static final String JSON_PROPERTY_GROUP_COUNT_XIAODU = "groupCountXiaodu";
  private Integer groupCountXiaodu;

  public static final String JSON_PROPERTY_GROUP_COUNT_XIAODU_SCREEN = "groupCountXiaoduScreen";
  private Integer groupCountXiaoduScreen;

  public static final String JSON_PROPERTY_GROUP_COUNT_XIAODU_SOUND = "groupCountXiaoduSound";
  private Integer groupCountXiaoduSound;

  public ApiResGroupInfo() { 
  }

  public ApiResGroupInfo groupId(Long groupId) {
    
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


  public ApiResGroupInfo groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public ApiResGroupInfo groupType(String groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupType() {
    return groupType;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  public ApiResGroupInfo groupStatus(String groupStatus) {
    
    this.groupStatus = groupStatus;
    return this;
  }

   /**
   * Get groupStatus
   * @return groupStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupStatus() {
    return groupStatus;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupStatus(String groupStatus) {
    this.groupStatus = groupStatus;
  }


  public ApiResGroupInfo groupCount(Integer groupCount) {
    
    this.groupCount = groupCount;
    return this;
  }

   /**
   * Get groupCount
   * @return groupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupCount() {
    return groupCount;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupCount(Integer groupCount) {
    this.groupCount = groupCount;
  }


  public ApiResGroupInfo dailyCount(Integer dailyCount) {
    
    this.dailyCount = dailyCount;
    return this;
  }

   /**
   * Get dailyCount
   * @return dailyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDailyCount() {
    return dailyCount;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyCount(Integer dailyCount) {
    this.dailyCount = dailyCount;
  }


  public ApiResGroupInfo createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public ApiResGroupInfo expireTime(Long expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Get expireTime
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExpireTime() {
    return expireTime;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }


  public ApiResGroupInfo createBy(Long createBy) {
    
    this.createBy = createBy;
    return this;
  }

   /**
   * Get createBy
   * @return createBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateBy() {
    return createBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateBy(Long createBy) {
    this.createBy = createBy;
  }


  public ApiResGroupInfo fcHistory(Boolean fcHistory) {
    
    this.fcHistory = fcHistory;
    return this;
  }

   /**
   * Get fcHistory
   * @return fcHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FC_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFcHistory() {
    return fcHistory;
  }


  @JsonProperty(JSON_PROPERTY_FC_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFcHistory(Boolean fcHistory) {
    this.fcHistory = fcHistory;
  }


  public ApiResGroupInfo fcAPiApp(Boolean fcAPiApp) {
    
    this.fcAPiApp = fcAPiApp;
    return this;
  }

   /**
   * Get fcAPiApp
   * @return fcAPiApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FC_A_PI_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFcAPiApp() {
    return fcAPiApp;
  }


  @JsonProperty(JSON_PROPERTY_FC_A_PI_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFcAPiApp(Boolean fcAPiApp) {
    this.fcAPiApp = fcAPiApp;
  }


  public ApiResGroupInfo wordUrlCount(Integer wordUrlCount) {
    
    this.wordUrlCount = wordUrlCount;
    return this;
  }

   /**
   * Get wordUrlCount
   * @return wordUrlCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORD_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWordUrlCount() {
    return wordUrlCount;
  }


  @JsonProperty(JSON_PROPERTY_WORD_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordUrlCount(Integer wordUrlCount) {
    this.wordUrlCount = wordUrlCount;
  }


  public ApiResGroupInfo groupTypeDesc(String groupTypeDesc) {
    
    this.groupTypeDesc = groupTypeDesc;
    return this;
  }

   /**
   * Get groupTypeDesc
   * @return groupTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_TYPE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupTypeDesc() {
    return groupTypeDesc;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_TYPE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupTypeDesc(String groupTypeDesc) {
    this.groupTypeDesc = groupTypeDesc;
  }


  public ApiResGroupInfo thirdPartyType(String thirdPartyType) {
    
    this.thirdPartyType = thirdPartyType;
    return this;
  }

   /**
   * Get thirdPartyType
   * @return thirdPartyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartyType() {
    return thirdPartyType;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdPartyType(String thirdPartyType) {
    this.thirdPartyType = thirdPartyType;
  }


  public ApiResGroupInfo dpaType(Integer dpaType) {
    
    this.dpaType = dpaType;
    return this;
  }

   /**
   * Get dpaType
   * @return dpaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DPA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDpaType() {
    return dpaType;
  }


  @JsonProperty(JSON_PROPERTY_DPA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDpaType(Integer dpaType) {
    this.dpaType = dpaType;
  }


  public ApiResGroupInfo dspStats(List<DspStatsItemForFe> dspStats) {
    
    this.dspStats = dspStats;
    return this;
  }

  public ApiResGroupInfo addDspStatsItem(DspStatsItemForFe dspStatsItem) {
    if (this.dspStats == null) {
      this.dspStats = new ArrayList<>();
    }
    this.dspStats.add(dspStatsItem);
    return this;
  }

   /**
   * Get dspStats
   * @return dspStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DSP_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DspStatsItemForFe> getDspStats() {
    return dspStats;
  }


  @JsonProperty(JSON_PROPERTY_DSP_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDspStats(List<DspStatsItemForFe> dspStats) {
    this.dspStats = dspStats;
  }


  public ApiResGroupInfo dspStatus(String dspStatus) {
    
    this.dspStatus = dspStatus;
    return this;
  }

   /**
   * Get dspStatus
   * @return dspStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DSP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDspStatus() {
    return dspStatus;
  }


  @JsonProperty(JSON_PROPERTY_DSP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDspStatus(String dspStatus) {
    this.dspStatus = dspStatus;
  }


  public ApiResGroupInfo recommend(Boolean recommend) {
    
    this.recommend = recommend;
    return this;
  }

   /**
   * Get recommend
   * @return recommend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRecommend() {
    return recommend;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }


  public ApiResGroupInfo recommendDesc(String recommendDesc) {
    
    this.recommendDesc = recommendDesc;
    return this;
  }

   /**
   * Get recommendDesc
   * @return recommendDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecommendDesc() {
    return recommendDesc;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendDesc(String recommendDesc) {
    this.recommendDesc = recommendDesc;
  }


  public ApiResGroupInfo groupCountXiaodu(Integer groupCountXiaodu) {
    
    this.groupCountXiaodu = groupCountXiaodu;
    return this;
  }

   /**
   * Get groupCountXiaodu
   * @return groupCountXiaodu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupCountXiaodu() {
    return groupCountXiaodu;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupCountXiaodu(Integer groupCountXiaodu) {
    this.groupCountXiaodu = groupCountXiaodu;
  }


  public ApiResGroupInfo groupCountXiaoduScreen(Integer groupCountXiaoduScreen) {
    
    this.groupCountXiaoduScreen = groupCountXiaoduScreen;
    return this;
  }

   /**
   * Get groupCountXiaoduScreen
   * @return groupCountXiaoduScreen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU_SCREEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupCountXiaoduScreen() {
    return groupCountXiaoduScreen;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU_SCREEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupCountXiaoduScreen(Integer groupCountXiaoduScreen) {
    this.groupCountXiaoduScreen = groupCountXiaoduScreen;
  }


  public ApiResGroupInfo groupCountXiaoduSound(Integer groupCountXiaoduSound) {
    
    this.groupCountXiaoduSound = groupCountXiaoduSound;
    return this;
  }

   /**
   * Get groupCountXiaoduSound
   * @return groupCountXiaoduSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupCountXiaoduSound() {
    return groupCountXiaoduSound;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_COUNT_XIAODU_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupCountXiaoduSound(Integer groupCountXiaoduSound) {
    this.groupCountXiaoduSound = groupCountXiaoduSound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResGroupInfo apiResGroupInfo = (ApiResGroupInfo) o;
    return Objects.equals(this.groupId, apiResGroupInfo.groupId) &&
        Objects.equals(this.groupName, apiResGroupInfo.groupName) &&
        Objects.equals(this.groupType, apiResGroupInfo.groupType) &&
        Objects.equals(this.groupStatus, apiResGroupInfo.groupStatus) &&
        Objects.equals(this.groupCount, apiResGroupInfo.groupCount) &&
        Objects.equals(this.dailyCount, apiResGroupInfo.dailyCount) &&
        Objects.equals(this.createTime, apiResGroupInfo.createTime) &&
        Objects.equals(this.expireTime, apiResGroupInfo.expireTime) &&
        Objects.equals(this.createBy, apiResGroupInfo.createBy) &&
        Objects.equals(this.fcHistory, apiResGroupInfo.fcHistory) &&
        Objects.equals(this.fcAPiApp, apiResGroupInfo.fcAPiApp) &&
        Objects.equals(this.wordUrlCount, apiResGroupInfo.wordUrlCount) &&
        Objects.equals(this.groupTypeDesc, apiResGroupInfo.groupTypeDesc) &&
        Objects.equals(this.thirdPartyType, apiResGroupInfo.thirdPartyType) &&
        Objects.equals(this.dpaType, apiResGroupInfo.dpaType) &&
        Objects.equals(this.dspStats, apiResGroupInfo.dspStats) &&
        Objects.equals(this.dspStatus, apiResGroupInfo.dspStatus) &&
        Objects.equals(this.recommend, apiResGroupInfo.recommend) &&
        Objects.equals(this.recommendDesc, apiResGroupInfo.recommendDesc) &&
        Objects.equals(this.groupCountXiaodu, apiResGroupInfo.groupCountXiaodu) &&
        Objects.equals(this.groupCountXiaoduScreen, apiResGroupInfo.groupCountXiaoduScreen) &&
        Objects.equals(this.groupCountXiaoduSound, apiResGroupInfo.groupCountXiaoduSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, groupType, groupStatus, groupCount, dailyCount, createTime, expireTime, createBy, fcHistory, fcAPiApp, wordUrlCount, groupTypeDesc, thirdPartyType, dpaType, dspStats, dspStatus, recommend, recommendDesc, groupCountXiaodu, groupCountXiaoduScreen, groupCountXiaoduSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResGroupInfo {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
    sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
    sb.append("    dailyCount: ").append(toIndentedString(dailyCount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    fcHistory: ").append(toIndentedString(fcHistory)).append("\n");
    sb.append("    fcAPiApp: ").append(toIndentedString(fcAPiApp)).append("\n");
    sb.append("    wordUrlCount: ").append(toIndentedString(wordUrlCount)).append("\n");
    sb.append("    groupTypeDesc: ").append(toIndentedString(groupTypeDesc)).append("\n");
    sb.append("    thirdPartyType: ").append(toIndentedString(thirdPartyType)).append("\n");
    sb.append("    dpaType: ").append(toIndentedString(dpaType)).append("\n");
    sb.append("    dspStats: ").append(toIndentedString(dspStats)).append("\n");
    sb.append("    dspStatus: ").append(toIndentedString(dspStatus)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    recommendDesc: ").append(toIndentedString(recommendDesc)).append("\n");
    sb.append("    groupCountXiaodu: ").append(toIndentedString(groupCountXiaodu)).append("\n");
    sb.append("    groupCountXiaoduScreen: ").append(toIndentedString(groupCountXiaoduScreen)).append("\n");
    sb.append("    groupCountXiaoduSound: ").append(toIndentedString(groupCountXiaoduSound)).append("\n");
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
