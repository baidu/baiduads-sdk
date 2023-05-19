/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.musicapi.model;

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
 * UploadMusicRequest
 */
@JsonPropertyOrder({
  UploadMusicRequest.JSON_PROPERTY_FILE_NAME,
  UploadMusicRequest.JSON_PROPERTY_BASE64
})
@JsonTypeName("UploadMusicRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadMusicRequest {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_BASE64 = "base64";
  private String base64;

  public UploadMusicRequest() { 
  }

  public UploadMusicRequest fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public UploadMusicRequest base64(String base64) {
    
    this.base64 = base64;
    return this;
  }

   /**
   * Get base64
   * @return base64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBase64() {
    return base64;
  }


  @JsonProperty(JSON_PROPERTY_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBase64(String base64) {
    this.base64 = base64;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadMusicRequest uploadMusicRequest = (UploadMusicRequest) o;
    return Objects.equals(this.fileName, uploadMusicRequest.fileName) &&
        Objects.equals(this.base64, uploadMusicRequest.base64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, base64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadMusicRequest {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
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

