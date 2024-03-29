/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagesegment.model;

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
 * LogoPicType
 */
@JsonPropertyOrder({
  LogoPicType.JSON_PROPERTY_AREA,
  LogoPicType.JSON_PROPERTY_GRAVITY_X,
  LogoPicType.JSON_PROPERTY_GRAVITY_Y,
  LogoPicType.JSON_PROPERTY_LOGO_IMG_CONTENT,
  LogoPicType.JSON_PROPERTY_OPACITY
})
@JsonTypeName("LogoPicType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogoPicType {
  public static final String JSON_PROPERTY_AREA = "area";
  private Integer area;

  public static final String JSON_PROPERTY_GRAVITY_X = "gravityX";
  private Integer gravityX;

  public static final String JSON_PROPERTY_GRAVITY_Y = "gravityY";
  private Integer gravityY;

  public static final String JSON_PROPERTY_LOGO_IMG_CONTENT = "logoImgContent";
  private String logoImgContent;

  public static final String JSON_PROPERTY_OPACITY = "opacity";
  private Integer opacity;

  public LogoPicType() { 
  }

  public LogoPicType area(Integer area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getArea() {
    return area;
  }


  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArea(Integer area) {
    this.area = area;
  }


  public LogoPicType gravityX(Integer gravityX) {
    
    this.gravityX = gravityX;
    return this;
  }

   /**
   * Get gravityX
   * @return gravityX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GRAVITY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGravityX() {
    return gravityX;
  }


  @JsonProperty(JSON_PROPERTY_GRAVITY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGravityX(Integer gravityX) {
    this.gravityX = gravityX;
  }


  public LogoPicType gravityY(Integer gravityY) {
    
    this.gravityY = gravityY;
    return this;
  }

   /**
   * Get gravityY
   * @return gravityY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GRAVITY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGravityY() {
    return gravityY;
  }


  @JsonProperty(JSON_PROPERTY_GRAVITY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGravityY(Integer gravityY) {
    this.gravityY = gravityY;
  }


  public LogoPicType logoImgContent(String logoImgContent) {
    
    this.logoImgContent = logoImgContent;
    return this;
  }

   /**
   * Get logoImgContent
   * @return logoImgContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_IMG_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoImgContent() {
    return logoImgContent;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_IMG_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImgContent(String logoImgContent) {
    this.logoImgContent = logoImgContent;
  }


  public LogoPicType opacity(Integer opacity) {
    
    this.opacity = opacity;
    return this;
  }

   /**
   * Get opacity
   * @return opacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpacity() {
    return opacity;
  }


  @JsonProperty(JSON_PROPERTY_OPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpacity(Integer opacity) {
    this.opacity = opacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoPicType logoPicType = (LogoPicType) o;
    return Objects.equals(this.area, logoPicType.area) &&
        Objects.equals(this.gravityX, logoPicType.gravityX) &&
        Objects.equals(this.gravityY, logoPicType.gravityY) &&
        Objects.equals(this.logoImgContent, logoPicType.logoImgContent) &&
        Objects.equals(this.opacity, logoPicType.opacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, gravityX, gravityY, logoImgContent, opacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoPicType {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    gravityX: ").append(toIndentedString(gravityX)).append("\n");
    sb.append("    gravityY: ").append(toIndentedString(gravityY)).append("\n");
    sb.append("    logoImgContent: ").append(toIndentedString(logoImgContent)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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

