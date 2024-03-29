/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaign.model;

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
 * ApiScheduleType
 */
@JsonPropertyOrder({
  ApiScheduleType.JSON_PROPERTY_START_HOUR,
  ApiScheduleType.JSON_PROPERTY_END_HOUR,
  ApiScheduleType.JSON_PROPERTY_WEEK_DAY
})
@JsonTypeName("ApiScheduleType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiScheduleType {
  public static final String JSON_PROPERTY_START_HOUR = "startHour";
  private Long startHour;

  public static final String JSON_PROPERTY_END_HOUR = "endHour";
  private Long endHour;

  public static final String JSON_PROPERTY_WEEK_DAY = "weekDay";
  private Long weekDay;

  public ApiScheduleType() { 
  }

  public ApiScheduleType startHour(Long startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(Long startHour) {
    this.startHour = startHour;
  }


  public ApiScheduleType endHour(Long endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(Long endHour) {
    this.endHour = endHour;
  }


  public ApiScheduleType weekDay(Long weekDay) {
    
    this.weekDay = weekDay;
    return this;
  }

   /**
   * Get weekDay
   * @return weekDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEEK_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWeekDay() {
    return weekDay;
  }


  @JsonProperty(JSON_PROPERTY_WEEK_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekDay(Long weekDay) {
    this.weekDay = weekDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiScheduleType apiScheduleType = (ApiScheduleType) o;
    return Objects.equals(this.startHour, apiScheduleType.startHour) &&
        Objects.equals(this.endHour, apiScheduleType.endHour) &&
        Objects.equals(this.weekDay, apiScheduleType.weekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startHour, endHour, weekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiScheduleType {\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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

