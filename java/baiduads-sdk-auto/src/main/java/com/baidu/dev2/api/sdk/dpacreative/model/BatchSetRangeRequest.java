/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpacreative.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpacreative.model.SetRangeRequest;
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
 * BatchSetRangeRequest
 */
@JsonPropertyOrder({
  BatchSetRangeRequest.JSON_PROPERTY_BAT_RANGE_ITEMS
})
@JsonTypeName("BatchSetRangeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchSetRangeRequest {
  public static final String JSON_PROPERTY_BAT_RANGE_ITEMS = "batRangeItems";
  private List<SetRangeRequest> batRangeItems = null;

  public BatchSetRangeRequest() { 
  }

  public BatchSetRangeRequest batRangeItems(List<SetRangeRequest> batRangeItems) {
    
    this.batRangeItems = batRangeItems;
    return this;
  }

  public BatchSetRangeRequest addBatRangeItemsItem(SetRangeRequest batRangeItemsItem) {
    if (this.batRangeItems == null) {
      this.batRangeItems = new ArrayList<>();
    }
    this.batRangeItems.add(batRangeItemsItem);
    return this;
  }

   /**
   * Get batRangeItems
   * @return batRangeItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BAT_RANGE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SetRangeRequest> getBatRangeItems() {
    return batRangeItems;
  }


  @JsonProperty(JSON_PROPERTY_BAT_RANGE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatRangeItems(List<SetRangeRequest> batRangeItems) {
    this.batRangeItems = batRangeItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchSetRangeRequest batchSetRangeRequest = (BatchSetRangeRequest) o;
    return Objects.equals(this.batRangeItems, batchSetRangeRequest.batRangeItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batRangeItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSetRangeRequest {\n");
    sb.append("    batRangeItems: ").append(toIndentedString(batRangeItems)).append("\n");
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

