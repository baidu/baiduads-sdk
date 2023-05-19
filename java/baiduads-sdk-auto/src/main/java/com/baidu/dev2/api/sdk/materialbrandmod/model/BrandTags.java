/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialbrandmod.model;

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
 * BrandTags
 */
@JsonPropertyOrder({
  BrandTags.JSON_PROPERTY_TAG_NAME,
  BrandTags.JSON_PROPERTY_TAG_DESC
})
@JsonTypeName("BrandTags")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrandTags {
  public static final String JSON_PROPERTY_TAG_NAME = "tagName";
  private String tagName;

  public static final String JSON_PROPERTY_TAG_DESC = "tagDesc";
  private String tagDesc;

  public BrandTags() { 
  }

  public BrandTags tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagName() {
    return tagName;
  }


  @JsonProperty(JSON_PROPERTY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public BrandTags tagDesc(String tagDesc) {
    
    this.tagDesc = tagDesc;
    return this;
  }

   /**
   * Get tagDesc
   * @return tagDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAG_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagDesc() {
    return tagDesc;
  }


  @JsonProperty(JSON_PROPERTY_TAG_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagDesc(String tagDesc) {
    this.tagDesc = tagDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandTags brandTags = (BrandTags) o;
    return Objects.equals(this.tagName, brandTags.tagName) &&
        Objects.equals(this.tagDesc, brandTags.tagDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, tagDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandTags {\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagDesc: ").append(toIndentedString(tagDesc)).append("\n");
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

