/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.toolkit.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetOperationRecordResponse
 */
@JsonPropertyOrder({
  GetOperationRecordResponse.JSON_PROPERTY_USER_ID,
  GetOperationRecordResponse.JSON_PROPERTY_PLAN_ID,
  GetOperationRecordResponse.JSON_PROPERTY_UNIT_ID,
  GetOperationRecordResponse.JSON_PROPERTY_OPT_TIME,
  GetOperationRecordResponse.JSON_PROPERTY_OPT_CONTENT,
  GetOperationRecordResponse.JSON_PROPERTY_OPT_TYPE,
  GetOperationRecordResponse.JSON_PROPERTY_OPT_LEVEL,
  GetOperationRecordResponse.JSON_PROPERTY_OLD_VALUE,
  GetOperationRecordResponse.JSON_PROPERTY_NEW_VALUE,
  GetOperationRecordResponse.JSON_PROPERTY_OPT_OBJ
})
@JsonTypeName("GetOperationRecordResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetOperationRecordResponse {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_PLAN_ID = "planId";
  private Long planId;

  public static final String JSON_PROPERTY_UNIT_ID = "unitId";
  private Long unitId;

  public static final String JSON_PROPERTY_OPT_TIME = "optTime";
  private String optTime;

  public static final String JSON_PROPERTY_OPT_CONTENT = "optContent";
  private String optContent;

  public static final String JSON_PROPERTY_OPT_TYPE = "optType";
  private Integer optType;

  public static final String JSON_PROPERTY_OPT_LEVEL = "optLevel";
  private Integer optLevel;

  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private String oldValue;

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private String newValue;

  public static final String JSON_PROPERTY_OPT_OBJ = "optObj";
  private String optObj;

  public GetOperationRecordResponse() { 
  }

  public GetOperationRecordResponse userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public GetOperationRecordResponse planId(Long planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(Long planId) {
    this.planId = planId;
  }


  public GetOperationRecordResponse unitId(Long unitId) {
    
    this.unitId = unitId;
    return this;
  }

   /**
   * Get unitId
   * @return unitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUnitId() {
    return unitId;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }


  public GetOperationRecordResponse optTime(String optTime) {
    
    this.optTime = optTime;
    return this;
  }

   /**
   * Get optTime
   * @return optTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptTime() {
    return optTime;
  }


  @JsonProperty(JSON_PROPERTY_OPT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptTime(String optTime) {
    this.optTime = optTime;
  }


  public GetOperationRecordResponse optContent(String optContent) {
    
    this.optContent = optContent;
    return this;
  }

   /**
   * Get optContent
   * @return optContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptContent() {
    return optContent;
  }


  @JsonProperty(JSON_PROPERTY_OPT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptContent(String optContent) {
    this.optContent = optContent;
  }


  public GetOperationRecordResponse optType(Integer optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * Get optType
   * @return optType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOptType() {
    return optType;
  }


  @JsonProperty(JSON_PROPERTY_OPT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptType(Integer optType) {
    this.optType = optType;
  }


  public GetOperationRecordResponse optLevel(Integer optLevel) {
    
    this.optLevel = optLevel;
    return this;
  }

   /**
   * Get optLevel
   * @return optLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOptLevel() {
    return optLevel;
  }


  @JsonProperty(JSON_PROPERTY_OPT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptLevel(Integer optLevel) {
    this.optLevel = optLevel;
  }


  public GetOperationRecordResponse oldValue(String oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOldValue() {
    return oldValue;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  public GetOperationRecordResponse newValue(String newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewValue() {
    return newValue;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  public GetOperationRecordResponse optObj(String optObj) {
    
    this.optObj = optObj;
    return this;
  }

   /**
   * Get optObj
   * @return optObj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_OBJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptObj() {
    return optObj;
  }


  @JsonProperty(JSON_PROPERTY_OPT_OBJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptObj(String optObj) {
    this.optObj = optObj;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperationRecordResponse getOperationRecordResponse = (GetOperationRecordResponse) o;
    return Objects.equals(this.userId, getOperationRecordResponse.userId) &&
        Objects.equals(this.planId, getOperationRecordResponse.planId) &&
        Objects.equals(this.unitId, getOperationRecordResponse.unitId) &&
        Objects.equals(this.optTime, getOperationRecordResponse.optTime) &&
        Objects.equals(this.optContent, getOperationRecordResponse.optContent) &&
        Objects.equals(this.optType, getOperationRecordResponse.optType) &&
        Objects.equals(this.optLevel, getOperationRecordResponse.optLevel) &&
        Objects.equals(this.oldValue, getOperationRecordResponse.oldValue) &&
        Objects.equals(this.newValue, getOperationRecordResponse.newValue) &&
        Objects.equals(this.optObj, getOperationRecordResponse.optObj);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, planId, unitId, optTime, optContent, optType, optLevel, oldValue, newValue, optObj);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperationRecordResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    optTime: ").append(toIndentedString(optTime)).append("\n");
    sb.append("    optContent: ").append(toIndentedString(optContent)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
    sb.append("    optLevel: ").append(toIndentedString(optLevel)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    optObj: ").append(toIndentedString(optObj)).append("\n");
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
