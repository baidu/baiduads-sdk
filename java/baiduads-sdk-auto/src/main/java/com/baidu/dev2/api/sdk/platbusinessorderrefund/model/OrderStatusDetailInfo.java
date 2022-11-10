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
 * OrderStatusDetailInfo
 */
@JsonPropertyOrder({
  OrderStatusDetailInfo.JSON_PROPERTY_OPERATION_TYPE,
  OrderStatusDetailInfo.JSON_PROPERTY_MSG
})
@JsonTypeName("OrderStatusDetailInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderStatusDetailInfo {
  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private Integer operationType;

  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg;

  public OrderStatusDetailInfo() { 
  }

  public OrderStatusDetailInfo operationType(Integer operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOperationType() {
    return operationType;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationType(Integer operationType) {
    this.operationType = operationType;
  }


  public OrderStatusDetailInfo msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsg() {
    return msg;
  }


  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusDetailInfo orderStatusDetailInfo = (OrderStatusDetailInfo) o;
    return Objects.equals(this.operationType, orderStatusDetailInfo.operationType) &&
        Objects.equals(this.msg, orderStatusDetailInfo.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusDetailInfo {\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
