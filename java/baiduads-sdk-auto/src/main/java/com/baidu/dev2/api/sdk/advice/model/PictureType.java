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
 * PictureType
 */
@JsonPropertyOrder({
  PictureType.JSON_PROPERTY_IMAGE,
  PictureType.JSON_PROPERTY_URL,
  PictureType.JSON_PROPERTY_DESC1,
  PictureType.JSON_PROPERTY_DESC2,
  PictureType.JSON_PROPERTY_WIDTH,
  PictureType.JSON_PROPERTY_HEIGHT,
  PictureType.JSON_PROPERTY_NA_URL,
  PictureType.JSON_PROPERTY_PID,
  PictureType.JSON_PROPERTY_TARGET_URL
})
@JsonTypeName("PictureType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PictureType {
  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DESC1 = "desc1";
  private String desc1;

  public static final String JSON_PROPERTY_DESC2 = "desc2";
  private String desc2;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_NA_URL = "naUrl";
  private String naUrl;

  public static final String JSON_PROPERTY_PID = "pid";
  private Long pid;

  public static final String JSON_PROPERTY_TARGET_URL = "targetUrl";
  private Long targetUrl;

  public PictureType() { 
  }

  public PictureType image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(String image) {
    this.image = image;
  }


  public PictureType url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public PictureType desc1(String desc1) {
    
    this.desc1 = desc1;
    return this;
  }

   /**
   * Get desc1
   * @return desc1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc1() {
    return desc1;
  }


  @JsonProperty(JSON_PROPERTY_DESC1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc1(String desc1) {
    this.desc1 = desc1;
  }


  public PictureType desc2(String desc2) {
    
    this.desc2 = desc2;
    return this;
  }

   /**
   * Get desc2
   * @return desc2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc2() {
    return desc2;
  }


  @JsonProperty(JSON_PROPERTY_DESC2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc2(String desc2) {
    this.desc2 = desc2;
  }


  public PictureType width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public PictureType height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public PictureType naUrl(String naUrl) {
    
    this.naUrl = naUrl;
    return this;
  }

   /**
   * Get naUrl
   * @return naUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNaUrl() {
    return naUrl;
  }


  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNaUrl(String naUrl) {
    this.naUrl = naUrl;
  }


  public PictureType pid(Long pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPid() {
    return pid;
  }


  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPid(Long pid) {
    this.pid = pid;
  }


  public PictureType targetUrl(Long targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetUrl() {
    return targetUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUrl(Long targetUrl) {
    this.targetUrl = targetUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PictureType pictureType = (PictureType) o;
    return Objects.equals(this.image, pictureType.image) &&
        Objects.equals(this.url, pictureType.url) &&
        Objects.equals(this.desc1, pictureType.desc1) &&
        Objects.equals(this.desc2, pictureType.desc2) &&
        Objects.equals(this.width, pictureType.width) &&
        Objects.equals(this.height, pictureType.height) &&
        Objects.equals(this.naUrl, pictureType.naUrl) &&
        Objects.equals(this.pid, pictureType.pid) &&
        Objects.equals(this.targetUrl, pictureType.targetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, url, desc1, desc2, width, height, naUrl, pid, targetUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PictureType {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    desc1: ").append(toIndentedString(desc1)).append("\n");
    sb.append("    desc2: ").append(toIndentedString(desc2)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    naUrl: ").append(toIndentedString(naUrl)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
