/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.creativefeed.model.PaExtraPicture;
import com.baidu.dev2.api.sdk.creativefeed.model.PaPicture;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaIdeaTemplate
 */
@JsonPropertyOrder({
  PaIdeaTemplate.JSON_PROPERTY_TITLE,
  PaIdeaTemplate.JSON_PROPERTY_SUBTITLE,
  PaIdeaTemplate.JSON_PROPERTY_TARGET_URL,
  PaIdeaTemplate.JSON_PROPERTY_MONITOR_URL,
  PaIdeaTemplate.JSON_PROPERTY_USER_PORTRAIT,
  PaIdeaTemplate.JSON_PROPERTY_NA_URL,
  PaIdeaTemplate.JSON_PROPERTY_BRAND,
  PaIdeaTemplate.JSON_PROPERTY_PICTURES,
  PaIdeaTemplate.JSON_PROPERTY_EXTRA_PICTURES,
  PaIdeaTemplate.JSON_PROPERTY_POSTER,
  PaIdeaTemplate.JSON_PROPERTY_VIDEO_ID,
  PaIdeaTemplate.JSON_PROPERTY_DURATION,
  PaIdeaTemplate.JSON_PROPERTY_VIDEO_URL,
  PaIdeaTemplate.JSON_PROPERTY_MINI_PROGRAM_SCHEMA,
  PaIdeaTemplate.JSON_PROPERTY_EXPOSURE_URL,
  PaIdeaTemplate.JSON_PROPERTY_ULK_SCHEME,
  PaIdeaTemplate.JSON_PROPERTY_ULK_URL
})
@JsonTypeName("PaIdeaTemplate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaIdeaTemplate {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_TARGET_URL = "targetUrl";
  private String targetUrl;

  public static final String JSON_PROPERTY_MONITOR_URL = "monitorUrl";
  private String monitorUrl;

  public static final String JSON_PROPERTY_USER_PORTRAIT = "userPortrait";
  private String userPortrait;

  public static final String JSON_PROPERTY_NA_URL = "naUrl";
  private String naUrl;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_PICTURES = "pictures";
  private List<PaPicture> pictures = null;

  public static final String JSON_PROPERTY_EXTRA_PICTURES = "extraPictures";
  private List<PaExtraPicture> extraPictures = null;

  public static final String JSON_PROPERTY_POSTER = "poster";
  private String poster;

  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";
  private String videoUrl;

  public static final String JSON_PROPERTY_MINI_PROGRAM_SCHEMA = "miniProgramSchema";
  private String miniProgramSchema;

  public static final String JSON_PROPERTY_EXPOSURE_URL = "exposureUrl";
  private String exposureUrl;

  public static final String JSON_PROPERTY_ULK_SCHEME = "ulkScheme";
  private String ulkScheme;

  public static final String JSON_PROPERTY_ULK_URL = "ulkUrl";
  private String ulkUrl;

  public PaIdeaTemplate() { 
  }

  public PaIdeaTemplate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public PaIdeaTemplate subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public PaIdeaTemplate targetUrl(String targetUrl) {
    
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

  public String getTargetUrl() {
    return targetUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public PaIdeaTemplate monitorUrl(String monitorUrl) {
    
    this.monitorUrl = monitorUrl;
    return this;
  }

   /**
   * Get monitorUrl
   * @return monitorUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorUrl() {
    return monitorUrl;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorUrl(String monitorUrl) {
    this.monitorUrl = monitorUrl;
  }


  public PaIdeaTemplate userPortrait(String userPortrait) {
    
    this.userPortrait = userPortrait;
    return this;
  }

   /**
   * Get userPortrait
   * @return userPortrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserPortrait() {
    return userPortrait;
  }


  @JsonProperty(JSON_PROPERTY_USER_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserPortrait(String userPortrait) {
    this.userPortrait = userPortrait;
  }


  public PaIdeaTemplate naUrl(String naUrl) {
    
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


  public PaIdeaTemplate brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaIdeaTemplate pictures(List<PaPicture> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public PaIdeaTemplate addPicturesItem(PaPicture picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaPicture> getPictures() {
    return pictures;
  }


  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictures(List<PaPicture> pictures) {
    this.pictures = pictures;
  }


  public PaIdeaTemplate extraPictures(List<PaExtraPicture> extraPictures) {
    
    this.extraPictures = extraPictures;
    return this;
  }

  public PaIdeaTemplate addExtraPicturesItem(PaExtraPicture extraPicturesItem) {
    if (this.extraPictures == null) {
      this.extraPictures = new ArrayList<>();
    }
    this.extraPictures.add(extraPicturesItem);
    return this;
  }

   /**
   * Get extraPictures
   * @return extraPictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaExtraPicture> getExtraPictures() {
    return extraPictures;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraPictures(List<PaExtraPicture> extraPictures) {
    this.extraPictures = extraPictures;
  }


  public PaIdeaTemplate poster(String poster) {
    
    this.poster = poster;
    return this;
  }

   /**
   * Get poster
   * @return poster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoster() {
    return poster;
  }


  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoster(String poster) {
    this.poster = poster;
  }


  public PaIdeaTemplate videoId(Long videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVideoId() {
    return videoId;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public PaIdeaTemplate duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public PaIdeaTemplate videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoUrl() {
    return videoUrl;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public PaIdeaTemplate miniProgramSchema(String miniProgramSchema) {
    
    this.miniProgramSchema = miniProgramSchema;
    return this;
  }

   /**
   * Get miniProgramSchema
   * @return miniProgramSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiniProgramSchema() {
    return miniProgramSchema;
  }


  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiniProgramSchema(String miniProgramSchema) {
    this.miniProgramSchema = miniProgramSchema;
  }


  public PaIdeaTemplate exposureUrl(String exposureUrl) {
    
    this.exposureUrl = exposureUrl;
    return this;
  }

   /**
   * Get exposureUrl
   * @return exposureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExposureUrl() {
    return exposureUrl;
  }


  @JsonProperty(JSON_PROPERTY_EXPOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExposureUrl(String exposureUrl) {
    this.exposureUrl = exposureUrl;
  }


  public PaIdeaTemplate ulkScheme(String ulkScheme) {
    
    this.ulkScheme = ulkScheme;
    return this;
  }

   /**
   * Get ulkScheme
   * @return ulkScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ULK_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUlkScheme() {
    return ulkScheme;
  }


  @JsonProperty(JSON_PROPERTY_ULK_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUlkScheme(String ulkScheme) {
    this.ulkScheme = ulkScheme;
  }


  public PaIdeaTemplate ulkUrl(String ulkUrl) {
    
    this.ulkUrl = ulkUrl;
    return this;
  }

   /**
   * Get ulkUrl
   * @return ulkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ULK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUlkUrl() {
    return ulkUrl;
  }


  @JsonProperty(JSON_PROPERTY_ULK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUlkUrl(String ulkUrl) {
    this.ulkUrl = ulkUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaIdeaTemplate paIdeaTemplate = (PaIdeaTemplate) o;
    return Objects.equals(this.title, paIdeaTemplate.title) &&
        Objects.equals(this.subtitle, paIdeaTemplate.subtitle) &&
        Objects.equals(this.targetUrl, paIdeaTemplate.targetUrl) &&
        Objects.equals(this.monitorUrl, paIdeaTemplate.monitorUrl) &&
        Objects.equals(this.userPortrait, paIdeaTemplate.userPortrait) &&
        Objects.equals(this.naUrl, paIdeaTemplate.naUrl) &&
        Objects.equals(this.brand, paIdeaTemplate.brand) &&
        Objects.equals(this.pictures, paIdeaTemplate.pictures) &&
        Objects.equals(this.extraPictures, paIdeaTemplate.extraPictures) &&
        Objects.equals(this.poster, paIdeaTemplate.poster) &&
        Objects.equals(this.videoId, paIdeaTemplate.videoId) &&
        Objects.equals(this.duration, paIdeaTemplate.duration) &&
        Objects.equals(this.videoUrl, paIdeaTemplate.videoUrl) &&
        Objects.equals(this.miniProgramSchema, paIdeaTemplate.miniProgramSchema) &&
        Objects.equals(this.exposureUrl, paIdeaTemplate.exposureUrl) &&
        Objects.equals(this.ulkScheme, paIdeaTemplate.ulkScheme) &&
        Objects.equals(this.ulkUrl, paIdeaTemplate.ulkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, targetUrl, monitorUrl, userPortrait, naUrl, brand, pictures, extraPictures, poster, videoId, duration, videoUrl, miniProgramSchema, exposureUrl, ulkScheme, ulkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaIdeaTemplate {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    monitorUrl: ").append(toIndentedString(monitorUrl)).append("\n");
    sb.append("    userPortrait: ").append(toIndentedString(userPortrait)).append("\n");
    sb.append("    naUrl: ").append(toIndentedString(naUrl)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    extraPictures: ").append(toIndentedString(extraPictures)).append("\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    miniProgramSchema: ").append(toIndentedString(miniProgramSchema)).append("\n");
    sb.append("    exposureUrl: ").append(toIndentedString(exposureUrl)).append("\n");
    sb.append("    ulkScheme: ").append(toIndentedString(ulkScheme)).append("\n");
    sb.append("    ulkUrl: ").append(toIndentedString(ulkUrl)).append("\n");
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

