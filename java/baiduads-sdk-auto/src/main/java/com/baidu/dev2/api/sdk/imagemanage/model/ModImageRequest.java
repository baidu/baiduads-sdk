/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagemanage.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.imagemanage.model.ModImageItem;
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
 * ModImageRequest
 */
@JsonPropertyOrder({
  ModImageRequest.JSON_PROPERTY_PRODUCT_LINE,
  ModImageRequest.JSON_PROPERTY_ITEMS
})
@JsonTypeName("ModImageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModImageRequest {
  public static final String JSON_PROPERTY_PRODUCT_LINE = "productLine";
  private String productLine;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ModImageItem> items = null;

  public ModImageRequest() { 
  }

  public ModImageRequest productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * Get productLine
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductLine() {
    return productLine;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public ModImageRequest items(List<ModImageItem> items) {
    
    this.items = items;
    return this;
  }

  public ModImageRequest addItemsItem(ModImageItem itemsItem) {
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

  public List<ModImageItem> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<ModImageItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModImageRequest modImageRequest = (ModImageRequest) o;
    return Objects.equals(this.productLine, modImageRequest.productLine) &&
        Objects.equals(this.items, modImageRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLine, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModImageRequest {\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

