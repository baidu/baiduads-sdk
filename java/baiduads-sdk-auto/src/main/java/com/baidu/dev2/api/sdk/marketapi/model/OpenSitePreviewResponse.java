/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.marketapi.model;

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
 * OpenSitePreviewResponse
 */
@JsonPropertyOrder({
  OpenSitePreviewResponse.JSON_PROPERTY_ID,
  OpenSitePreviewResponse.JSON_PROPERTY_IS_HOME,
  OpenSitePreviewResponse.JSON_PROPERTY_NAME,
  OpenSitePreviewResponse.JSON_PROPERTY_PREVIEW_URL,
  OpenSitePreviewResponse.JSON_PROPERTY_QRCODE_URL,
  OpenSitePreviewResponse.JSON_PROPERTY_THUMBNAIL_URL,
  OpenSitePreviewResponse.JSON_PROPERTY_ID_TYPE
})
@JsonTypeName("OpenSitePreviewResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenSitePreviewResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IS_HOME = "isHome";
  private Boolean isHome;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREVIEW_URL = "previewUrl";
  private String previewUrl;

  public static final String JSON_PROPERTY_QRCODE_URL = "qrcodeUrl";
  private String qrcodeUrl;

  public static final String JSON_PROPERTY_THUMBNAIL_URL = "thumbnailUrl";
  private String thumbnailUrl;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public OpenSitePreviewResponse() { 
  }

  public OpenSitePreviewResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public OpenSitePreviewResponse isHome(Boolean isHome) {
    
    this.isHome = isHome;
    return this;
  }

   /**
   * Get isHome
   * @return isHome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHome() {
    return isHome;
  }


  @JsonProperty(JSON_PROPERTY_IS_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHome(Boolean isHome) {
    this.isHome = isHome;
  }


  public OpenSitePreviewResponse name(String name) {
    
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


  public OpenSitePreviewResponse previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Get previewUrl
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviewUrl() {
    return previewUrl;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public OpenSitePreviewResponse qrcodeUrl(String qrcodeUrl) {
    
    this.qrcodeUrl = qrcodeUrl;
    return this;
  }

   /**
   * Get qrcodeUrl
   * @return qrcodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QRCODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQrcodeUrl() {
    return qrcodeUrl;
  }


  @JsonProperty(JSON_PROPERTY_QRCODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQrcodeUrl(String qrcodeUrl) {
    this.qrcodeUrl = qrcodeUrl;
  }


  public OpenSitePreviewResponse thumbnailUrl(String thumbnailUrl) {
    
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public OpenSitePreviewResponse idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSitePreviewResponse openSitePreviewResponse = (OpenSitePreviewResponse) o;
    return Objects.equals(this.id, openSitePreviewResponse.id) &&
        Objects.equals(this.isHome, openSitePreviewResponse.isHome) &&
        Objects.equals(this.name, openSitePreviewResponse.name) &&
        Objects.equals(this.previewUrl, openSitePreviewResponse.previewUrl) &&
        Objects.equals(this.qrcodeUrl, openSitePreviewResponse.qrcodeUrl) &&
        Objects.equals(this.thumbnailUrl, openSitePreviewResponse.thumbnailUrl) &&
        Objects.equals(this.idType, openSitePreviewResponse.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isHome, name, previewUrl, qrcodeUrl, thumbnailUrl, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSitePreviewResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHome: ").append(toIndentedString(isHome)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    qrcodeUrl: ").append(toIndentedString(qrcodeUrl)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

