/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.extaudience.model;

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
 * APIResExtAudience
 */
@JsonPropertyOrder({
  APIResExtAudience.JSON_PROPERTY_GROUP_ID,
  APIResExtAudience.JSON_PROPERTY_GROUP_NAME,
  APIResExtAudience.JSON_PROPERTY_DSP_NAMES
})
@JsonTypeName("APIResExtAudience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIResExtAudience {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private Long groupId;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_DSP_NAMES = "dspNames";
  private String dspNames;

  public APIResExtAudience() { 
  }

  public APIResExtAudience groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public APIResExtAudience groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public APIResExtAudience dspNames(String dspNames) {
    
    this.dspNames = dspNames;
    return this;
  }

   /**
   * Get dspNames
   * @return dspNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DSP_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDspNames() {
    return dspNames;
  }


  @JsonProperty(JSON_PROPERTY_DSP_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDspNames(String dspNames) {
    this.dspNames = dspNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIResExtAudience apIResExtAudience = (APIResExtAudience) o;
    return Objects.equals(this.groupId, apIResExtAudience.groupId) &&
        Objects.equals(this.groupName, apIResExtAudience.groupName) &&
        Objects.equals(this.dspNames, apIResExtAudience.dspNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, dspNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIResExtAudience {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    dspNames: ").append(toIndentedString(dspNames)).append("\n");
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
