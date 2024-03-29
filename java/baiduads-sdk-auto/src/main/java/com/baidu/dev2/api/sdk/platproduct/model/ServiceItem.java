/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platproduct.model.ServiceItemValue;
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
 * ServiceItem
 */
@JsonPropertyOrder({
  ServiceItem.JSON_PROPERTY_NAME,
  ServiceItem.JSON_PROPERTY_SERVICE_ITEM_VALUE
})
@JsonTypeName("ServiceItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceItem {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICE_ITEM_VALUE = "serviceItemValue";
  private ServiceItemValue serviceItemValue;

  public ServiceItem() { 
  }

  public ServiceItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ServiceItem serviceItemValue(ServiceItemValue serviceItemValue) {
    
    this.serviceItemValue = serviceItemValue;
    return this;
  }

   /**
   * Get serviceItemValue
   * @return serviceItemValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceItemValue getServiceItemValue() {
    return serviceItemValue;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceItemValue(ServiceItemValue serviceItemValue) {
    this.serviceItemValue = serviceItemValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceItem serviceItem = (ServiceItem) o;
    return Objects.equals(this.name, serviceItem.name) &&
        Objects.equals(this.serviceItemValue, serviceItem.serviceItemValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceItemValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceItemValue: ").append(toIndentedString(serviceItemValue)).append("\n");
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

