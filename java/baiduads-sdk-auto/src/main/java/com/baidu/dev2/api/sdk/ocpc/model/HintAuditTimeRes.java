/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpc.model;

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
 * HintAuditTimeRes
 */
@JsonPropertyOrder({
  HintAuditTimeRes.JSON_PROPERTY_HINT_AUDIT_TIME
})
@JsonTypeName("HintAuditTimeRes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HintAuditTimeRes {
  public static final String JSON_PROPERTY_HINT_AUDIT_TIME = "hintAuditTime";
  private String hintAuditTime;

  public HintAuditTimeRes() { 
  }

  public HintAuditTimeRes hintAuditTime(String hintAuditTime) {
    
    this.hintAuditTime = hintAuditTime;
    return this;
  }

   /**
   * Get hintAuditTime
   * @return hintAuditTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HINT_AUDIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHintAuditTime() {
    return hintAuditTime;
  }


  @JsonProperty(JSON_PROPERTY_HINT_AUDIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHintAuditTime(String hintAuditTime) {
    this.hintAuditTime = hintAuditTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HintAuditTimeRes hintAuditTimeRes = (HintAuditTimeRes) o;
    return Objects.equals(this.hintAuditTime, hintAuditTimeRes.hintAuditTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hintAuditTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HintAuditTimeRes {\n");
    sb.append("    hintAuditTime: ").append(toIndentedString(hintAuditTime)).append("\n");
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

