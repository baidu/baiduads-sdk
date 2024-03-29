/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.payment.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.payment.model.Condition;
import com.baidu.dev2.api.sdk.payment.model.Offset;
import com.baidu.dev2.api.sdk.payment.model.Sort;
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
 * GetPaymentRecordRequest
 */
@JsonPropertyOrder({
  GetPaymentRecordRequest.JSON_PROPERTY_FUNDTYPE,
  GetPaymentRecordRequest.JSON_PROPERTY_CONDITION,
  GetPaymentRecordRequest.JSON_PROPERTY_CHUNKSIZE,
  GetPaymentRecordRequest.JSON_PROPERTY_OFFSET,
  GetPaymentRecordRequest.JSON_PROPERTY_SORT
})
@JsonTypeName("GetPaymentRecordRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPaymentRecordRequest {
  public static final String JSON_PROPERTY_FUNDTYPE = "fundtype";
  private Integer fundtype;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private Condition condition;

  public static final String JSON_PROPERTY_CHUNKSIZE = "chunksize";
  private Integer chunksize;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Offset offset;

  public static final String JSON_PROPERTY_SORT = "sort";
  private Sort sort;

  public GetPaymentRecordRequest() { 
  }

  public GetPaymentRecordRequest fundtype(Integer fundtype) {
    
    this.fundtype = fundtype;
    return this;
  }

   /**
   * Get fundtype
   * @return fundtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUNDTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFundtype() {
    return fundtype;
  }


  @JsonProperty(JSON_PROPERTY_FUNDTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundtype(Integer fundtype) {
    this.fundtype = fundtype;
  }


  public GetPaymentRecordRequest condition(Condition condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Condition getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(Condition condition) {
    this.condition = condition;
  }


  public GetPaymentRecordRequest chunksize(Integer chunksize) {
    
    this.chunksize = chunksize;
    return this;
  }

   /**
   * Get chunksize
   * @return chunksize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHUNKSIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChunksize() {
    return chunksize;
  }


  @JsonProperty(JSON_PROPERTY_CHUNKSIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChunksize(Integer chunksize) {
    this.chunksize = chunksize;
  }


  public GetPaymentRecordRequest offset(Offset offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Offset getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Offset offset) {
    this.offset = offset;
  }


  public GetPaymentRecordRequest sort(Sort sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Sort getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(Sort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentRecordRequest getPaymentRecordRequest = (GetPaymentRecordRequest) o;
    return Objects.equals(this.fundtype, getPaymentRecordRequest.fundtype) &&
        Objects.equals(this.condition, getPaymentRecordRequest.condition) &&
        Objects.equals(this.chunksize, getPaymentRecordRequest.chunksize) &&
        Objects.equals(this.offset, getPaymentRecordRequest.offset) &&
        Objects.equals(this.sort, getPaymentRecordRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundtype, condition, chunksize, offset, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentRecordRequest {\n");
    sb.append("    fundtype: ").append(toIndentedString(fundtype)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    chunksize: ").append(toIndentedString(chunksize)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

