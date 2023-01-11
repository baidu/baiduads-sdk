/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.wttrade.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.wttrade.model.FirstTradeResponse;
import com.baidu.dev2.api.sdk.wttrade.model.TradeUserInfo;
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
 * WtTradeResponse
 */
@JsonPropertyOrder({
  WtTradeResponse.JSON_PROPERTY_LIST,
  WtTradeResponse.JSON_PROPERTY_USER_INFO
})
@JsonTypeName("WtTradeResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WtTradeResponse {
  public static final String JSON_PROPERTY_LIST = "list";
  private List<FirstTradeResponse> list = null;

  public static final String JSON_PROPERTY_USER_INFO = "userInfo";
  private TradeUserInfo userInfo;

  public WtTradeResponse() { 
  }

  public WtTradeResponse list(List<FirstTradeResponse> list) {
    
    this.list = list;
    return this;
  }

  public WtTradeResponse addListItem(FirstTradeResponse listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FirstTradeResponse> getList() {
    return list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setList(List<FirstTradeResponse> list) {
    this.list = list;
  }


  public WtTradeResponse userInfo(TradeUserInfo userInfo) {
    
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TradeUserInfo getUserInfo() {
    return userInfo;
  }


  @JsonProperty(JSON_PROPERTY_USER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserInfo(TradeUserInfo userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WtTradeResponse wtTradeResponse = (WtTradeResponse) o;
    return Objects.equals(this.list, wtTradeResponse.list) &&
        Objects.equals(this.userInfo, wtTradeResponse.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, userInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WtTradeResponse {\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
