/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.traceapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.traceapi.model.TransTraceUpdateType;
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
 * TransTraceUpdateRequest
 */
@JsonPropertyOrder({
  TransTraceUpdateRequest.JSON_PROPERTY_TRANS_TRACE_UPDATE_TYPES
})
@JsonTypeName("TransTraceUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransTraceUpdateRequest {
  public static final String JSON_PROPERTY_TRANS_TRACE_UPDATE_TYPES = "transTraceUpdateTypes";
  private List<TransTraceUpdateType> transTraceUpdateTypes = null;

  public TransTraceUpdateRequest() { 
  }

  public TransTraceUpdateRequest transTraceUpdateTypes(List<TransTraceUpdateType> transTraceUpdateTypes) {
    
    this.transTraceUpdateTypes = transTraceUpdateTypes;
    return this;
  }

  public TransTraceUpdateRequest addTransTraceUpdateTypesItem(TransTraceUpdateType transTraceUpdateTypesItem) {
    if (this.transTraceUpdateTypes == null) {
      this.transTraceUpdateTypes = new ArrayList<>();
    }
    this.transTraceUpdateTypes.add(transTraceUpdateTypesItem);
    return this;
  }

   /**
   * Get transTraceUpdateTypes
   * @return transTraceUpdateTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_TRACE_UPDATE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransTraceUpdateType> getTransTraceUpdateTypes() {
    return transTraceUpdateTypes;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_TRACE_UPDATE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransTraceUpdateTypes(List<TransTraceUpdateType> transTraceUpdateTypes) {
    this.transTraceUpdateTypes = transTraceUpdateTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransTraceUpdateRequest transTraceUpdateRequest = (TransTraceUpdateRequest) o;
    return Objects.equals(this.transTraceUpdateTypes, transTraceUpdateRequest.transTraceUpdateTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transTraceUpdateTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransTraceUpdateRequest {\n");
    sb.append("    transTraceUpdateTypes: ").append(toIndentedString(transTraceUpdateTypes)).append("\n");
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
