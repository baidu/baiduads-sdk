/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

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
 * CreativePreviewType
 */
@JsonPropertyOrder({
  CreativePreviewType.JSON_PROPERTY_STATUS,
  CreativePreviewType.JSON_PROPERTY_MT,
  CreativePreviewType.JSON_PROPERTY_JSON,
  CreativePreviewType.JSON_PROPERTY_PREVIEW_TYPE,
  CreativePreviewType.JSON_PROPERTY_DEMO_URL
})
@JsonTypeName("CreativePreviewType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreativePreviewType {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_MT = "mt";
  private Long mt;

  public static final String JSON_PROPERTY_JSON = "json";
  private String json;

  public static final String JSON_PROPERTY_PREVIEW_TYPE = "previewType";
  private Integer previewType;

  public static final String JSON_PROPERTY_DEMO_URL = "demoUrl";
  private String demoUrl;

  public CreativePreviewType() { 
  }

  public CreativePreviewType status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public CreativePreviewType mt(Long mt) {
    
    this.mt = mt;
    return this;
  }

   /**
   * Get mt
   * @return mt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMt() {
    return mt;
  }


  @JsonProperty(JSON_PROPERTY_MT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMt(Long mt) {
    this.mt = mt;
  }


  public CreativePreviewType json(String json) {
    
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJson() {
    return json;
  }


  @JsonProperty(JSON_PROPERTY_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJson(String json) {
    this.json = json;
  }


  public CreativePreviewType previewType(Integer previewType) {
    
    this.previewType = previewType;
    return this;
  }

   /**
   * Get previewType
   * @return previewType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPreviewType() {
    return previewType;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewType(Integer previewType) {
    this.previewType = previewType;
  }


  public CreativePreviewType demoUrl(String demoUrl) {
    
    this.demoUrl = demoUrl;
    return this;
  }

   /**
   * Get demoUrl
   * @return demoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEMO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDemoUrl() {
    return demoUrl;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoUrl(String demoUrl) {
    this.demoUrl = demoUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativePreviewType creativePreviewType = (CreativePreviewType) o;
    return Objects.equals(this.status, creativePreviewType.status) &&
        Objects.equals(this.mt, creativePreviewType.mt) &&
        Objects.equals(this.json, creativePreviewType.json) &&
        Objects.equals(this.previewType, creativePreviewType.previewType) &&
        Objects.equals(this.demoUrl, creativePreviewType.demoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mt, json, previewType, demoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativePreviewType {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mt: ").append(toIndentedString(mt)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    previewType: ").append(toIndentedString(previewType)).append("\n");
    sb.append("    demoUrl: ").append(toIndentedString(demoUrl)).append("\n");
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

