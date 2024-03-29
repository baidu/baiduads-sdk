/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

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
 * AuditTimeModel
 */
@JsonPropertyOrder({
  AuditTimeModel.JSON_PROPERTY_IDEA_ID,
  AuditTimeModel.JSON_PROPERTY_IDEA_STATE,
  AuditTimeModel.JSON_PROPERTY_START_TIME,
  AuditTimeModel.JSON_PROPERTY_ESTIMATION_TIME,
  AuditTimeModel.JSON_PROPERTY_ESTIMATION_MINUTE,
  AuditTimeModel.JSON_PROPERTY_COMPLETE_RADIO
})
@JsonTypeName("AuditTimeModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditTimeModel {
  public static final String JSON_PROPERTY_IDEA_ID = "ideaId";
  private Long ideaId;

  public static final String JSON_PROPERTY_IDEA_STATE = "ideaState";
  private Integer ideaState;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_ESTIMATION_TIME = "estimationTime";
  private String estimationTime;

  public static final String JSON_PROPERTY_ESTIMATION_MINUTE = "estimationMinute";
  private Integer estimationMinute;

  public static final String JSON_PROPERTY_COMPLETE_RADIO = "completeRadio";
  private String completeRadio;

  public AuditTimeModel() { 
  }

  public AuditTimeModel ideaId(Long ideaId) {
    
    this.ideaId = ideaId;
    return this;
  }

   /**
   * Get ideaId
   * @return ideaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDEA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIdeaId() {
    return ideaId;
  }


  @JsonProperty(JSON_PROPERTY_IDEA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdeaId(Long ideaId) {
    this.ideaId = ideaId;
  }


  public AuditTimeModel ideaState(Integer ideaState) {
    
    this.ideaState = ideaState;
    return this;
  }

   /**
   * Get ideaState
   * @return ideaState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDEA_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdeaState() {
    return ideaState;
  }


  @JsonProperty(JSON_PROPERTY_IDEA_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdeaState(Integer ideaState) {
    this.ideaState = ideaState;
  }


  public AuditTimeModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AuditTimeModel estimationTime(String estimationTime) {
    
    this.estimationTime = estimationTime;
    return this;
  }

   /**
   * Get estimationTime
   * @return estimationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEstimationTime() {
    return estimationTime;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimationTime(String estimationTime) {
    this.estimationTime = estimationTime;
  }


  public AuditTimeModel estimationMinute(Integer estimationMinute) {
    
    this.estimationMinute = estimationMinute;
    return this;
  }

   /**
   * Get estimationMinute
   * @return estimationMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATION_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEstimationMinute() {
    return estimationMinute;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATION_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimationMinute(Integer estimationMinute) {
    this.estimationMinute = estimationMinute;
  }


  public AuditTimeModel completeRadio(String completeRadio) {
    
    this.completeRadio = completeRadio;
    return this;
  }

   /**
   * Get completeRadio
   * @return completeRadio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETE_RADIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompleteRadio() {
    return completeRadio;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE_RADIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleteRadio(String completeRadio) {
    this.completeRadio = completeRadio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTimeModel auditTimeModel = (AuditTimeModel) o;
    return Objects.equals(this.ideaId, auditTimeModel.ideaId) &&
        Objects.equals(this.ideaState, auditTimeModel.ideaState) &&
        Objects.equals(this.startTime, auditTimeModel.startTime) &&
        Objects.equals(this.estimationTime, auditTimeModel.estimationTime) &&
        Objects.equals(this.estimationMinute, auditTimeModel.estimationMinute) &&
        Objects.equals(this.completeRadio, auditTimeModel.completeRadio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ideaId, ideaState, startTime, estimationTime, estimationMinute, completeRadio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTimeModel {\n");
    sb.append("    ideaId: ").append(toIndentedString(ideaId)).append("\n");
    sb.append("    ideaState: ").append(toIndentedString(ideaState)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    estimationTime: ").append(toIndentedString(estimationTime)).append("\n");
    sb.append("    estimationMinute: ").append(toIndentedString(estimationMinute)).append("\n");
    sb.append("    completeRadio: ").append(toIndentedString(completeRadio)).append("\n");
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

