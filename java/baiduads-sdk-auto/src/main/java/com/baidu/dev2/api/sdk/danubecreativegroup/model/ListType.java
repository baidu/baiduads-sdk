/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.ListRowType;
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
 * ListType
 */
@JsonPropertyOrder({
  ListType.JSON_PROPERTY_INDUSTRY,
  ListType.JSON_PROPERTY_LABELS,
  ListType.JSON_PROPERTY_SLOGAN,
  ListType.JSON_PROPERTY_ROWS,
  ListType.JSON_PROPERTY_MAX_CHAR_NUM_BY_COLUMN
})
@JsonTypeName("ListType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListType {
  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private String industry;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_SLOGAN = "slogan";
  private String slogan;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private List<ListRowType> rows = null;

  public static final String JSON_PROPERTY_MAX_CHAR_NUM_BY_COLUMN = "maxCharNumByColumn";
  private List<Integer> maxCharNumByColumn = null;

  public ListType() { 
  }

  public ListType industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public ListType labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ListType addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public ListType slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * Get slogan
   * @return slogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlogan() {
    return slogan;
  }


  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public ListType rows(List<ListRowType> rows) {
    
    this.rows = rows;
    return this;
  }

  public ListType addRowsItem(ListRowType rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListRowType> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRows(List<ListRowType> rows) {
    this.rows = rows;
  }


  public ListType maxCharNumByColumn(List<Integer> maxCharNumByColumn) {
    
    this.maxCharNumByColumn = maxCharNumByColumn;
    return this;
  }

  public ListType addMaxCharNumByColumnItem(Integer maxCharNumByColumnItem) {
    if (this.maxCharNumByColumn == null) {
      this.maxCharNumByColumn = new ArrayList<>();
    }
    this.maxCharNumByColumn.add(maxCharNumByColumnItem);
    return this;
  }

   /**
   * Get maxCharNumByColumn
   * @return maxCharNumByColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_CHAR_NUM_BY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getMaxCharNumByColumn() {
    return maxCharNumByColumn;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CHAR_NUM_BY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCharNumByColumn(List<Integer> maxCharNumByColumn) {
    this.maxCharNumByColumn = maxCharNumByColumn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListType listType = (ListType) o;
    return Objects.equals(this.industry, listType.industry) &&
        Objects.equals(this.labels, listType.labels) &&
        Objects.equals(this.slogan, listType.slogan) &&
        Objects.equals(this.rows, listType.rows) &&
        Objects.equals(this.maxCharNumByColumn, listType.maxCharNumByColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industry, labels, slogan, rows, maxCharNumByColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListType {\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    maxCharNumByColumn: ").append(toIndentedString(maxCharNumByColumn)).append("\n");
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

