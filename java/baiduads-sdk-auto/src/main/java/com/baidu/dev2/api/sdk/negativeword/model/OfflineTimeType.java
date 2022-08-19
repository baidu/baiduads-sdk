/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

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
 * OfflineTimeType
 */
@JsonPropertyOrder({
  OfflineTimeType.JSON_PROPERTY_TIME,
  OfflineTimeType.JSON_PROPERTY_FLAG,
  OfflineTimeType.JSON_PROPERTY_ON_OR_OFF_TYPE
})
@JsonTypeName("OfflineTimeType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfflineTimeType {
  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_FLAG = "flag";
  private Integer flag;

  public static final String JSON_PROPERTY_ON_OR_OFF_TYPE = "onOrOffType";
  private Integer onOrOffType;

  public OfflineTimeType() { 
  }

  public OfflineTimeType time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public OfflineTimeType flag(Integer flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFlag() {
    return flag;
  }


  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlag(Integer flag) {
    this.flag = flag;
  }


  public OfflineTimeType onOrOffType(Integer onOrOffType) {
    
    this.onOrOffType = onOrOffType;
    return this;
  }

   /**
   * Get onOrOffType
   * @return onOrOffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_OR_OFF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOnOrOffType() {
    return onOrOffType;
  }


  @JsonProperty(JSON_PROPERTY_ON_OR_OFF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnOrOffType(Integer onOrOffType) {
    this.onOrOffType = onOrOffType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineTimeType offlineTimeType = (OfflineTimeType) o;
    return Objects.equals(this.time, offlineTimeType.time) &&
        Objects.equals(this.flag, offlineTimeType.flag) &&
        Objects.equals(this.onOrOffType, offlineTimeType.onOrOffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, flag, onOrOffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineTimeType {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    onOrOffType: ").append(toIndentedString(onOrOffType)).append("\n");
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
