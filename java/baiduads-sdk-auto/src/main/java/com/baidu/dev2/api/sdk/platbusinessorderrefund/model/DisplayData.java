/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platbusinessorderrefund.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.CashierTopBlock;
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
 * DisplayData
 */
@JsonPropertyOrder({
  DisplayData.JSON_PROPERTY_CASHIER_TOP_BLOCK
})
@JsonTypeName("DisplayData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisplayData {
  public static final String JSON_PROPERTY_CASHIER_TOP_BLOCK = "cashierTopBlock";
  private List<List<CashierTopBlock>> cashierTopBlock = null;

  public DisplayData() { 
  }

  public DisplayData cashierTopBlock(List<List<CashierTopBlock>> cashierTopBlock) {
    
    this.cashierTopBlock = cashierTopBlock;
    return this;
  }

  public DisplayData addCashierTopBlockItem(List<CashierTopBlock> cashierTopBlockItem) {
    if (this.cashierTopBlock == null) {
      this.cashierTopBlock = new ArrayList<>();
    }
    this.cashierTopBlock.add(cashierTopBlockItem);
    return this;
  }

   /**
   * Get cashierTopBlock
   * @return cashierTopBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASHIER_TOP_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<CashierTopBlock>> getCashierTopBlock() {
    return cashierTopBlock;
  }


  @JsonProperty(JSON_PROPERTY_CASHIER_TOP_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashierTopBlock(List<List<CashierTopBlock>> cashierTopBlock) {
    this.cashierTopBlock = cashierTopBlock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayData displayData = (DisplayData) o;
    return Objects.equals(this.cashierTopBlock, displayData.cashierTopBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashierTopBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayData {\n");
    sb.append("    cashierTopBlock: ").append(toIndentedString(cashierTopBlock)).append("\n");
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
