/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.appcenterjob.model;

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
 * BatchJobDto
 */
@JsonPropertyOrder({
  BatchJobDto.JSON_PROPERTY_JOB_ID,
  BatchJobDto.JSON_PROPERTY_SUBMIT_TIME,
  BatchJobDto.JSON_PROPERTY_JOB_TYPE,
  BatchJobDto.JSON_PROPERTY_JOB_RESULT,
  BatchJobDto.JSON_PROPERTY_OPT_NAME,
  BatchJobDto.JSON_PROPERTY_FAILURE_MESSAGE,
  BatchJobDto.JSON_PROPERTY_CHANNEL_NAME,
  BatchJobDto.JSON_PROPERTY_OPT_DETAIL
})
@JsonTypeName("BatchJobDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchJobDto {
  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private Long jobId;

  public static final String JSON_PROPERTY_SUBMIT_TIME = "submitTime";
  private String submitTime;

  public static final String JSON_PROPERTY_JOB_TYPE = "jobType";
  private String jobType;

  public static final String JSON_PROPERTY_JOB_RESULT = "jobResult";
  private String jobResult;

  public static final String JSON_PROPERTY_OPT_NAME = "optName";
  private String optName;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failureMessage";
  private String failureMessage;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channelName";
  private String channelName;

  public static final String JSON_PROPERTY_OPT_DETAIL = "optDetail";
  private String optDetail;

  public BatchJobDto() { 
  }

  public BatchJobDto jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getJobId() {
    return jobId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  public BatchJobDto submitTime(String submitTime) {
    
    this.submitTime = submitTime;
    return this;
  }

   /**
   * Get submitTime
   * @return submitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBMIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubmitTime() {
    return submitTime;
  }


  @JsonProperty(JSON_PROPERTY_SUBMIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitTime(String submitTime) {
    this.submitTime = submitTime;
  }


  public BatchJobDto jobType(String jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobType() {
    return jobType;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobType(String jobType) {
    this.jobType = jobType;
  }


  public BatchJobDto jobResult(String jobResult) {
    
    this.jobResult = jobResult;
    return this;
  }

   /**
   * Get jobResult
   * @return jobResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobResult() {
    return jobResult;
  }


  @JsonProperty(JSON_PROPERTY_JOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobResult(String jobResult) {
    this.jobResult = jobResult;
  }


  public BatchJobDto optName(String optName) {
    
    this.optName = optName;
    return this;
  }

   /**
   * Get optName
   * @return optName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptName() {
    return optName;
  }


  @JsonProperty(JSON_PROPERTY_OPT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptName(String optName) {
    this.optName = optName;
  }


  public BatchJobDto failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public BatchJobDto channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelName() {
    return channelName;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public BatchJobDto optDetail(String optDetail) {
    
    this.optDetail = optDetail;
    return this;
  }

   /**
   * Get optDetail
   * @return optDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPT_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptDetail() {
    return optDetail;
  }


  @JsonProperty(JSON_PROPERTY_OPT_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptDetail(String optDetail) {
    this.optDetail = optDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchJobDto batchJobDto = (BatchJobDto) o;
    return Objects.equals(this.jobId, batchJobDto.jobId) &&
        Objects.equals(this.submitTime, batchJobDto.submitTime) &&
        Objects.equals(this.jobType, batchJobDto.jobType) &&
        Objects.equals(this.jobResult, batchJobDto.jobResult) &&
        Objects.equals(this.optName, batchJobDto.optName) &&
        Objects.equals(this.failureMessage, batchJobDto.failureMessage) &&
        Objects.equals(this.channelName, batchJobDto.channelName) &&
        Objects.equals(this.optDetail, batchJobDto.optDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, submitTime, jobType, jobResult, optName, failureMessage, channelName, optDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchJobDto {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
    sb.append("    optName: ").append(toIndentedString(optName)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    optDetail: ").append(toIndentedString(optDetail)).append("\n");
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

