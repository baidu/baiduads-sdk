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
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.AppointmentInfoModInfo;
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
 * AddressModInfo
 */
@JsonPropertyOrder({
  AddressModInfo.JSON_PROPERTY_LAST_OPERATOR_TYPE,
  AddressModInfo.JSON_PROPERTY_MOD_ADDRESS_COUNT,
  AddressModInfo.JSON_PROPERTY_ADDRESS_ID,
  AddressModInfo.JSON_PROPERTY_APPOINTMENT_MOD_INFO
})
@JsonTypeName("AddressModInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressModInfo {
  public static final String JSON_PROPERTY_LAST_OPERATOR_TYPE = "lastOperatorType";
  private Integer lastOperatorType;

  public static final String JSON_PROPERTY_MOD_ADDRESS_COUNT = "modAddressCount";
  private Integer modAddressCount;

  public static final String JSON_PROPERTY_ADDRESS_ID = "addressId";
  private String addressId;

  public static final String JSON_PROPERTY_APPOINTMENT_MOD_INFO = "appointmentModInfo";
  private AppointmentInfoModInfo appointmentModInfo;

  public AddressModInfo() { 
  }

  public AddressModInfo lastOperatorType(Integer lastOperatorType) {
    
    this.lastOperatorType = lastOperatorType;
    return this;
  }

   /**
   * Get lastOperatorType
   * @return lastOperatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_OPERATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastOperatorType() {
    return lastOperatorType;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OPERATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOperatorType(Integer lastOperatorType) {
    this.lastOperatorType = lastOperatorType;
  }


  public AddressModInfo modAddressCount(Integer modAddressCount) {
    
    this.modAddressCount = modAddressCount;
    return this;
  }

   /**
   * Get modAddressCount
   * @return modAddressCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOD_ADDRESS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getModAddressCount() {
    return modAddressCount;
  }


  @JsonProperty(JSON_PROPERTY_MOD_ADDRESS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModAddressCount(Integer modAddressCount) {
    this.modAddressCount = modAddressCount;
  }


  public AddressModInfo addressId(String addressId) {
    
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressId() {
    return addressId;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public AddressModInfo appointmentModInfo(AppointmentInfoModInfo appointmentModInfo) {
    
    this.appointmentModInfo = appointmentModInfo;
    return this;
  }

   /**
   * Get appointmentModInfo
   * @return appointmentModInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPOINTMENT_MOD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppointmentInfoModInfo getAppointmentModInfo() {
    return appointmentModInfo;
  }


  @JsonProperty(JSON_PROPERTY_APPOINTMENT_MOD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppointmentModInfo(AppointmentInfoModInfo appointmentModInfo) {
    this.appointmentModInfo = appointmentModInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressModInfo addressModInfo = (AddressModInfo) o;
    return Objects.equals(this.lastOperatorType, addressModInfo.lastOperatorType) &&
        Objects.equals(this.modAddressCount, addressModInfo.modAddressCount) &&
        Objects.equals(this.addressId, addressModInfo.addressId) &&
        Objects.equals(this.appointmentModInfo, addressModInfo.appointmentModInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastOperatorType, modAddressCount, addressId, appointmentModInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressModInfo {\n");
    sb.append("    lastOperatorType: ").append(toIndentedString(lastOperatorType)).append("\n");
    sb.append("    modAddressCount: ").append(toIndentedString(modAddressCount)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    appointmentModInfo: ").append(toIndentedString(appointmentModInfo)).append("\n");
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

