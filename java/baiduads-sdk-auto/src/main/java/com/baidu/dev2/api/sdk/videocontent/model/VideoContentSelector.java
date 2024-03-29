/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videocontent.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.videocontent.model.Page;
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
 * VideoContentSelector
 */
@JsonPropertyOrder({
  VideoContentSelector.JSON_PROPERTY_FIELDS,
  VideoContentSelector.JSON_PROPERTY_PAGE,
  VideoContentSelector.JSON_PROPERTY_PREDICATES,
  VideoContentSelector.JSON_PROPERTY_ORDERBY,
  VideoContentSelector.JSON_PROPERTY_QUERY_FIELDS,
  VideoContentSelector.JSON_PROPERTY_PREDICATE_FIELDS,
  VideoContentSelector.JSON_PROPERTY_ORDER_FIELDS,
  VideoContentSelector.JSON_PROPERTY_HTTP_PROTOCOL
})
@JsonTypeName("VideoContentSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoContentSelector {
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<Object> fields = null;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Page page;

  public static final String JSON_PROPERTY_PREDICATES = "predicates";
  private List<Object> predicates = null;

  public static final String JSON_PROPERTY_ORDERBY = "orderby";
  private Object orderby;

  public static final String JSON_PROPERTY_QUERY_FIELDS = "queryFields";
  private List<Object> queryFields = null;

  public static final String JSON_PROPERTY_PREDICATE_FIELDS = "predicateFields";
  private List<Object> predicateFields = null;

  public static final String JSON_PROPERTY_ORDER_FIELDS = "orderFields";
  private List<Object> orderFields = null;

  public static final String JSON_PROPERTY_HTTP_PROTOCOL = "httpProtocol";
  private String httpProtocol;

  public VideoContentSelector() { 
  }

  public VideoContentSelector fields(List<Object> fields) {
    
    this.fields = fields;
    return this;
  }

  public VideoContentSelector addFieldsItem(Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<Object> fields) {
    this.fields = fields;
  }


  public VideoContentSelector page(Page page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Page getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Page page) {
    this.page = page;
  }


  public VideoContentSelector predicates(List<Object> predicates) {
    
    this.predicates = predicates;
    return this;
  }

  public VideoContentSelector addPredicatesItem(Object predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * Get predicates
   * @return predicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPredicates() {
    return predicates;
  }


  @JsonProperty(JSON_PROPERTY_PREDICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredicates(List<Object> predicates) {
    this.predicates = predicates;
  }


  public VideoContentSelector orderby(Object orderby) {
    
    this.orderby = orderby;
    return this;
  }

   /**
   * Get orderby
   * @return orderby
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDERBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOrderby() {
    return orderby;
  }


  @JsonProperty(JSON_PROPERTY_ORDERBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderby(Object orderby) {
    this.orderby = orderby;
  }


  public VideoContentSelector queryFields(List<Object> queryFields) {
    
    this.queryFields = queryFields;
    return this;
  }

  public VideoContentSelector addQueryFieldsItem(Object queryFieldsItem) {
    if (this.queryFields == null) {
      this.queryFields = new ArrayList<>();
    }
    this.queryFields.add(queryFieldsItem);
    return this;
  }

   /**
   * Get queryFields
   * @return queryFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getQueryFields() {
    return queryFields;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryFields(List<Object> queryFields) {
    this.queryFields = queryFields;
  }


  public VideoContentSelector predicateFields(List<Object> predicateFields) {
    
    this.predicateFields = predicateFields;
    return this;
  }

  public VideoContentSelector addPredicateFieldsItem(Object predicateFieldsItem) {
    if (this.predicateFields == null) {
      this.predicateFields = new ArrayList<>();
    }
    this.predicateFields.add(predicateFieldsItem);
    return this;
  }

   /**
   * Get predicateFields
   * @return predicateFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDICATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPredicateFields() {
    return predicateFields;
  }


  @JsonProperty(JSON_PROPERTY_PREDICATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredicateFields(List<Object> predicateFields) {
    this.predicateFields = predicateFields;
  }


  public VideoContentSelector orderFields(List<Object> orderFields) {
    
    this.orderFields = orderFields;
    return this;
  }

  public VideoContentSelector addOrderFieldsItem(Object orderFieldsItem) {
    if (this.orderFields == null) {
      this.orderFields = new ArrayList<>();
    }
    this.orderFields.add(orderFieldsItem);
    return this;
  }

   /**
   * Get orderFields
   * @return orderFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getOrderFields() {
    return orderFields;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderFields(List<Object> orderFields) {
    this.orderFields = orderFields;
  }


  public VideoContentSelector httpProtocol(String httpProtocol) {
    
    this.httpProtocol = httpProtocol;
    return this;
  }

   /**
   * Get httpProtocol
   * @return httpProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HTTP_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHttpProtocol() {
    return httpProtocol;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpProtocol(String httpProtocol) {
    this.httpProtocol = httpProtocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoContentSelector videoContentSelector = (VideoContentSelector) o;
    return Objects.equals(this.fields, videoContentSelector.fields) &&
        Objects.equals(this.page, videoContentSelector.page) &&
        Objects.equals(this.predicates, videoContentSelector.predicates) &&
        Objects.equals(this.orderby, videoContentSelector.orderby) &&
        Objects.equals(this.queryFields, videoContentSelector.queryFields) &&
        Objects.equals(this.predicateFields, videoContentSelector.predicateFields) &&
        Objects.equals(this.orderFields, videoContentSelector.orderFields) &&
        Objects.equals(this.httpProtocol, videoContentSelector.httpProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, page, predicates, orderby, queryFields, predicateFields, orderFields, httpProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoContentSelector {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    orderby: ").append(toIndentedString(orderby)).append("\n");
    sb.append("    queryFields: ").append(toIndentedString(queryFields)).append("\n");
    sb.append("    predicateFields: ").append(toIndentedString(predicateFields)).append("\n");
    sb.append("    orderFields: ").append(toIndentedString(orderFields)).append("\n");
    sb.append("    httpProtocol: ").append(toIndentedString(httpProtocol)).append("\n");
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

