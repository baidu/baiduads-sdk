/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videodata.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.videodata.model.LabelDataMeta;
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
 * LabelDataResponse
 */
@JsonPropertyOrder({
  LabelDataResponse.JSON_PROPERTY_LABEL_DATA_META_LIST
})
@JsonTypeName("LabelDataResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelDataResponse {
  public static final String JSON_PROPERTY_LABEL_DATA_META_LIST = "labelDataMetaList";
  private List<LabelDataMeta> labelDataMetaList = null;

  public LabelDataResponse() { 
  }

  public LabelDataResponse labelDataMetaList(List<LabelDataMeta> labelDataMetaList) {
    
    this.labelDataMetaList = labelDataMetaList;
    return this;
  }

  public LabelDataResponse addLabelDataMetaListItem(LabelDataMeta labelDataMetaListItem) {
    if (this.labelDataMetaList == null) {
      this.labelDataMetaList = new ArrayList<>();
    }
    this.labelDataMetaList.add(labelDataMetaListItem);
    return this;
  }

   /**
   * Get labelDataMetaList
   * @return labelDataMetaList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL_DATA_META_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LabelDataMeta> getLabelDataMetaList() {
    return labelDataMetaList;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_DATA_META_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelDataMetaList(List<LabelDataMeta> labelDataMetaList) {
    this.labelDataMetaList = labelDataMetaList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDataResponse labelDataResponse = (LabelDataResponse) o;
    return Objects.equals(this.labelDataMetaList, labelDataResponse.labelDataMetaList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelDataMetaList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDataResponse {\n");
    sb.append("    labelDataMetaList: ").append(toIndentedString(labelDataMetaList)).append("\n");
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

