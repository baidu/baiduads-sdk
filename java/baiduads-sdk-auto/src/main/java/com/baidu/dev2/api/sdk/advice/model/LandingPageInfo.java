/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.LandPageQualityApiType;
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
 * LandingPageInfo
 */
@JsonPropertyOrder({
  LandingPageInfo.JSON_PROPERTY_ITEMS,
  LandingPageInfo.JSON_PROPERTY_PART_TYPE
})
@JsonTypeName("LandingPageInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LandingPageInfo {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<LandPageQualityApiType> items = null;

  public static final String JSON_PROPERTY_PART_TYPE = "partType";
  private Integer partType;

  public LandingPageInfo() { 
  }

  public LandingPageInfo items(List<LandPageQualityApiType> items) {
    
    this.items = items;
    return this;
  }

  public LandingPageInfo addItemsItem(LandPageQualityApiType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LandPageQualityApiType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<LandPageQualityApiType> items) {
    this.items = items;
  }


  public LandingPageInfo partType(Integer partType) {
    
    this.partType = partType;
    return this;
  }

   /**
   * Get partType
   * @return partType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PART_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartType() {
    return partType;
  }


  @JsonProperty(JSON_PROPERTY_PART_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartType(Integer partType) {
    this.partType = partType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageInfo landingPageInfo = (LandingPageInfo) o;
    return Objects.equals(this.items, landingPageInfo.items) &&
        Objects.equals(this.partType, landingPageInfo.partType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, partType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPageInfo {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    partType: ").append(toIndentedString(partType)).append("\n");
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
