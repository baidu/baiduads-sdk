/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fmleadsupdate.model;

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
 * UpdateMarkTypeResult
 */
@JsonPropertyOrder({
  UpdateMarkTypeResult.JSON_PROPERTY_CLUE_ID,
  UpdateMarkTypeResult.JSON_PROPERTY_ERROR_CODE,
  UpdateMarkTypeResult.JSON_PROPERTY_ERROR_INFO
})
@JsonTypeName("UpdateMarkTypeResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateMarkTypeResult {
  public static final String JSON_PROPERTY_CLUE_ID = "clueId";
  private String clueId;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR_INFO = "errorInfo";
  private String errorInfo;

  public UpdateMarkTypeResult() { 
  }

  public UpdateMarkTypeResult clueId(String clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * Get clueId
   * @return clueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClueId() {
    return clueId;
  }


  @JsonProperty(JSON_PROPERTY_CLUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClueId(String clueId) {
    this.clueId = clueId;
  }


  public UpdateMarkTypeResult errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public UpdateMarkTypeResult errorInfo(String errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorInfo() {
    return errorInfo;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMarkTypeResult updateMarkTypeResult = (UpdateMarkTypeResult) o;
    return Objects.equals(this.clueId, updateMarkTypeResult.clueId) &&
        Objects.equals(this.errorCode, updateMarkTypeResult.errorCode) &&
        Objects.equals(this.errorInfo, updateMarkTypeResult.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueId, errorCode, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMarkTypeResult {\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

