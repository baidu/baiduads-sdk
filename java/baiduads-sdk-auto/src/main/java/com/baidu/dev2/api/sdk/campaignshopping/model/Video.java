/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaignshopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.campaignshopping.model.Picture;
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
 * Video
 */
@JsonPropertyOrder({
  Video.JSON_PROPERTY_VIDEO_ID,
  Video.JSON_PROPERTY_ASTAT,
  Video.JSON_PROPERTY_REFUSE_REASON,
  Video.JSON_PROPERTY_URL,
  Video.JSON_PROPERTY_HEIGHT,
  Video.JSON_PROPERTY_WIDTH,
  Video.JSON_PROPERTY_DURATION,
  Video.JSON_PROPERTY_POSTERS,
  Video.JSON_PROPERTY_ELEMENT_ID,
  Video.JSON_PROPERTY_DIAGNOSTIC_INFOS
})
@JsonTypeName("Video")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Video {
  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_ASTAT = "astat";
  private Integer astat;

  public static final String JSON_PROPERTY_REFUSE_REASON = "refuseReason";
  private String refuseReason;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_POSTERS = "posters";
  private List<Picture> posters = null;

  public static final String JSON_PROPERTY_ELEMENT_ID = "elementId";
  private Long elementId;

  public static final String JSON_PROPERTY_DIAGNOSTIC_INFOS = "diagnosticInfos";
  private List<String> diagnosticInfos = null;

  public Video() { 
  }

  public Video videoId(Long videoId) {
    
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


  public Video astat(Integer astat) {
    
    this.astat = astat;
    return this;
  }

   /**
   * Get astat
   * @return astat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASTAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAstat() {
    return astat;
  }


  @JsonProperty(JSON_PROPERTY_ASTAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAstat(Integer astat) {
    this.astat = astat;
  }


  public Video refuseReason(String refuseReason) {
    
    this.refuseReason = refuseReason;
    return this;
  }

   /**
   * Get refuseReason
   * @return refuseReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUSE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefuseReason() {
    return refuseReason;
  }


  @JsonProperty(JSON_PROPERTY_REFUSE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefuseReason(String refuseReason) {
    this.refuseReason = refuseReason;
  }


  public Video url(String url) {
    
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


  public Video height(Integer height) {
    
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


  public Video width(Integer width) {
    
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


  public Video duration(Integer duration) {
    
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

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public Video posters(List<Picture> posters) {
    
    this.posters = posters;
    return this;
  }

  public Video addPostersItem(Picture postersItem) {
    if (this.posters == null) {
      this.posters = new ArrayList<>();
    }
    this.posters.add(postersItem);
    return this;
  }

   /**
   * Get posters
   * @return posters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Picture> getPosters() {
    return posters;
  }


  @JsonProperty(JSON_PROPERTY_POSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosters(List<Picture> posters) {
    this.posters = posters;
  }


  public Video elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * Get elementId
   * @return elementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getElementId() {
    return elementId;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }


  public Video diagnosticInfos(List<String> diagnosticInfos) {
    
    this.diagnosticInfos = diagnosticInfos;
    return this;
  }

  public Video addDiagnosticInfosItem(String diagnosticInfosItem) {
    if (this.diagnosticInfos == null) {
      this.diagnosticInfos = new ArrayList<>();
    }
    this.diagnosticInfos.add(diagnosticInfosItem);
    return this;
  }

   /**
   * Get diagnosticInfos
   * @return diagnosticInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDiagnosticInfos() {
    return diagnosticInfos;
  }


  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiagnosticInfos(List<String> diagnosticInfos) {
    this.diagnosticInfos = diagnosticInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.videoId, video.videoId) &&
        Objects.equals(this.astat, video.astat) &&
        Objects.equals(this.refuseReason, video.refuseReason) &&
        Objects.equals(this.url, video.url) &&
        Objects.equals(this.height, video.height) &&
        Objects.equals(this.width, video.width) &&
        Objects.equals(this.duration, video.duration) &&
        Objects.equals(this.posters, video.posters) &&
        Objects.equals(this.elementId, video.elementId) &&
        Objects.equals(this.diagnosticInfos, video.diagnosticInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, astat, refuseReason, url, height, width, duration, posters, elementId, diagnosticInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    astat: ").append(toIndentedString(astat)).append("\n");
    sb.append("    refuseReason: ").append(toIndentedString(refuseReason)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    posters: ").append(toIndentedString(posters)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    diagnosticInfos: ").append(toIndentedString(diagnosticInfos)).append("\n");
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

