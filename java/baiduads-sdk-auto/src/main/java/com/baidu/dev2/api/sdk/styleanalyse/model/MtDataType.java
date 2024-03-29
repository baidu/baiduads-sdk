/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.styleanalyse.model;

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
 * MtDataType
 */
@JsonPropertyOrder({
  MtDataType.JSON_PROPERTY_MT,
  MtDataType.JSON_PROPERTY_NAME,
  MtDataType.JSON_PROPERTY_HTML,
  MtDataType.JSON_PROPERTY_CSS
})
@JsonTypeName("MtDataType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MtDataType {
  public static final String JSON_PROPERTY_MT = "mt";
  private String mt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public static final String JSON_PROPERTY_CSS = "css";
  private String css;

  public MtDataType() { 
  }

  public MtDataType mt(String mt) {
    
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

  public String getMt() {
    return mt;
  }


  @JsonProperty(JSON_PROPERTY_MT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMt(String mt) {
    this.mt = mt;
  }


  public MtDataType name(String name) {
    
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


  public MtDataType html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtml(String html) {
    this.html = html;
  }


  public MtDataType css(String css) {
    
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCss() {
    return css;
  }


  @JsonProperty(JSON_PROPERTY_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCss(String css) {
    this.css = css;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MtDataType mtDataType = (MtDataType) o;
    return Objects.equals(this.mt, mtDataType.mt) &&
        Objects.equals(this.name, mtDataType.name) &&
        Objects.equals(this.html, mtDataType.html) &&
        Objects.equals(this.css, mtDataType.css);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mt, name, html, css);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MtDataType {\n");
    sb.append("    mt: ").append(toIndentedString(mt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
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

