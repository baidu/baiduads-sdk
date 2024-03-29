/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.recmwordfeed.model;

import java.util.Objects;
import java.util.Arrays;
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
 * RecmWordRequest
 */
@JsonPropertyOrder({
  RecmWordRequest.JSON_PROPERTY_QUERY,
  RecmWordRequest.JSON_PROPERTY_CONTAINS,
  RecmWordRequest.JSON_PROPERTY_N_CONTAINS,
  RecmWordRequest.JSON_PROPERTY_SORT_FIELD,
  RecmWordRequest.JSON_PROPERTY_SORT_ORDER
})
@JsonTypeName("RecmWordRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecmWordRequest {
  public static final String JSON_PROPERTY_QUERY = "query";
  private List<String> query = null;

  public static final String JSON_PROPERTY_CONTAINS = "contains";
  private List<String> contains = null;

  public static final String JSON_PROPERTY_N_CONTAINS = "nContains";
  private List<String> nContains = null;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private String sortOrder;

  public RecmWordRequest() { 
  }

  public RecmWordRequest query(List<String> query) {
    
    this.query = query;
    return this;
  }

  public RecmWordRequest addQueryItem(String queryItem) {
    if (this.query == null) {
      this.query = new ArrayList<>();
    }
    this.query.add(queryItem);
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(List<String> query) {
    this.query = query;
  }


  public RecmWordRequest contains(List<String> contains) {
    
    this.contains = contains;
    return this;
  }

  public RecmWordRequest addContainsItem(String containsItem) {
    if (this.contains == null) {
      this.contains = new ArrayList<>();
    }
    this.contains.add(containsItem);
    return this;
  }

   /**
   * Get contains
   * @return contains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContains() {
    return contains;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContains(List<String> contains) {
    this.contains = contains;
  }


  public RecmWordRequest nContains(List<String> nContains) {
    
    this.nContains = nContains;
    return this;
  }

  public RecmWordRequest addNContainsItem(String nContainsItem) {
    if (this.nContains == null) {
      this.nContains = new ArrayList<>();
    }
    this.nContains.add(nContainsItem);
    return this;
  }

   /**
   * Get nContains
   * @return nContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_N_CONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getnContains() {
    return nContains;
  }


  @JsonProperty(JSON_PROPERTY_N_CONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setnContains(List<String> nContains) {
    this.nContains = nContains;
  }


  public RecmWordRequest sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public RecmWordRequest sortOrder(String sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecmWordRequest recmWordRequest = (RecmWordRequest) o;
    return Objects.equals(this.query, recmWordRequest.query) &&
        Objects.equals(this.contains, recmWordRequest.contains) &&
        Objects.equals(this.nContains, recmWordRequest.nContains) &&
        Objects.equals(this.sortField, recmWordRequest.sortField) &&
        Objects.equals(this.sortOrder, recmWordRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, contains, nContains, sortField, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecmWordRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    nContains: ").append(toIndentedString(nContains)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

