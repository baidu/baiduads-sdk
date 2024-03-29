/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shieldfunction.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.shieldfunction.model.PolicyInfo;
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
 * CustomerInfo
 */
@JsonPropertyOrder({
  CustomerInfo.JSON_PROPERTY_ID,
  CustomerInfo.JSON_PROPERTY_ADD_TIME,
  CustomerInfo.JSON_PROPERTY_CUSTOM_ID,
  CustomerInfo.JSON_PROPERTY_IP_LIST,
  CustomerInfo.JSON_PROPERTY_IDENTITY_SHOW,
  CustomerInfo.JSON_PROPERTY_IDENTITY_SYSTEM,
  CustomerInfo.JSON_PROPERTY_SHIELD_TYPE,
  CustomerInfo.JSON_PROPERTY_SHIELD_NUM,
  CustomerInfo.JSON_PROPERTY_DEVICE_TYPE,
  CustomerInfo.JSON_PROPERTY_POLICY_INFOS
})
@JsonTypeName("CustomerInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerInfo {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public static final String JSON_PROPERTY_CUSTOM_ID = "customId";
  private String customId;

  public static final String JSON_PROPERTY_IP_LIST = "ipList";
  private String ipList;

  public static final String JSON_PROPERTY_IDENTITY_SHOW = "identityShow";
  private String identityShow;

  public static final String JSON_PROPERTY_IDENTITY_SYSTEM = "identitySystem";
  private String identitySystem;

  public static final String JSON_PROPERTY_SHIELD_TYPE = "shieldType";
  private Integer shieldType;

  public static final String JSON_PROPERTY_SHIELD_NUM = "shieldNum";
  private Long shieldNum;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "deviceType";
  private Integer deviceType;

  public static final String JSON_PROPERTY_POLICY_INFOS = "policyInfos";
  private List<PolicyInfo> policyInfos = null;

  public CustomerInfo() { 
  }

  public CustomerInfo id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public CustomerInfo addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * Get addTime
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public CustomerInfo customId(String customId) {
    
    this.customId = customId;
    return this;
  }

   /**
   * Get customId
   * @return customId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomId() {
    return customId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomId(String customId) {
    this.customId = customId;
  }


  public CustomerInfo ipList(String ipList) {
    
    this.ipList = ipList;
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpList() {
    return ipList;
  }


  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpList(String ipList) {
    this.ipList = ipList;
  }


  public CustomerInfo identityShow(String identityShow) {
    
    this.identityShow = identityShow;
    return this;
  }

   /**
   * Get identityShow
   * @return identityShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTITY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentityShow() {
    return identityShow;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityShow(String identityShow) {
    this.identityShow = identityShow;
  }


  public CustomerInfo identitySystem(String identitySystem) {
    
    this.identitySystem = identitySystem;
    return this;
  }

   /**
   * Get identitySystem
   * @return identitySystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTITY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentitySystem() {
    return identitySystem;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentitySystem(String identitySystem) {
    this.identitySystem = identitySystem;
  }


  public CustomerInfo shieldType(Integer shieldType) {
    
    this.shieldType = shieldType;
    return this;
  }

   /**
   * Get shieldType
   * @return shieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShieldType() {
    return shieldType;
  }


  @JsonProperty(JSON_PROPERTY_SHIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShieldType(Integer shieldType) {
    this.shieldType = shieldType;
  }


  public CustomerInfo shieldNum(Long shieldNum) {
    
    this.shieldNum = shieldNum;
    return this;
  }

   /**
   * Get shieldNum
   * @return shieldNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIELD_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShieldNum() {
    return shieldNum;
  }


  @JsonProperty(JSON_PROPERTY_SHIELD_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShieldNum(Long shieldNum) {
    this.shieldNum = shieldNum;
  }


  public CustomerInfo deviceType(Integer deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public CustomerInfo policyInfos(List<PolicyInfo> policyInfos) {
    
    this.policyInfos = policyInfos;
    return this;
  }

  public CustomerInfo addPolicyInfosItem(PolicyInfo policyInfosItem) {
    if (this.policyInfos == null) {
      this.policyInfos = new ArrayList<>();
    }
    this.policyInfos.add(policyInfosItem);
    return this;
  }

   /**
   * Get policyInfos
   * @return policyInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLICY_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PolicyInfo> getPolicyInfos() {
    return policyInfos;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyInfos(List<PolicyInfo> policyInfos) {
    this.policyInfos = policyInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfo customerInfo = (CustomerInfo) o;
    return Objects.equals(this.id, customerInfo.id) &&
        Objects.equals(this.addTime, customerInfo.addTime) &&
        Objects.equals(this.customId, customerInfo.customId) &&
        Objects.equals(this.ipList, customerInfo.ipList) &&
        Objects.equals(this.identityShow, customerInfo.identityShow) &&
        Objects.equals(this.identitySystem, customerInfo.identitySystem) &&
        Objects.equals(this.shieldType, customerInfo.shieldType) &&
        Objects.equals(this.shieldNum, customerInfo.shieldNum) &&
        Objects.equals(this.deviceType, customerInfo.deviceType) &&
        Objects.equals(this.policyInfos, customerInfo.policyInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addTime, customId, ipList, identityShow, identitySystem, shieldType, shieldNum, deviceType, policyInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    identityShow: ").append(toIndentedString(identityShow)).append("\n");
    sb.append("    identitySystem: ").append(toIndentedString(identitySystem)).append("\n");
    sb.append("    shieldType: ").append(toIndentedString(shieldType)).append("\n");
    sb.append("    shieldNum: ").append(toIndentedString(shieldNum)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    policyInfos: ").append(toIndentedString(policyInfos)).append("\n");
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

