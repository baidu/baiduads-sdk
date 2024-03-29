/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videosynthetise.model;

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
 * VideoInfoType
 */
@JsonPropertyOrder({
  VideoInfoType.JSON_PROPERTY_TASK_ID,
  VideoInfoType.JSON_PROPERTY_STATUS,
  VideoInfoType.JSON_PROPERTY_VIDEO_ID,
  VideoInfoType.JSON_PROPERTY_VIDEO_URL,
  VideoInfoType.JSON_PROPERTY_ERRORS,
  VideoInfoType.JSON_PROPERTY_VIDEO_NAME,
  VideoInfoType.JSON_PROPERTY_CREATE_TIME,
  VideoInfoType.JSON_PROPERTY_ID,
  VideoInfoType.JSON_PROPERTY_THUMBNAIL,
  VideoInfoType.JSON_PROPERTY_DURATION,
  VideoInfoType.JSON_PROPERTY_WIDTH,
  VideoInfoType.JSON_PROPERTY_HEIGHT,
  VideoInfoType.JSON_PROPERTY_MD5,
  VideoInfoType.JSON_PROPERTY_TEXTS,
  VideoInfoType.JSON_PROPERTY_MATERIAL
})
@JsonTypeName("VideoInfoType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoInfoType {
  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private Long taskId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";
  private String videoUrl;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private String errors;

  public static final String JSON_PROPERTY_VIDEO_NAME = "videoName";
  private String videoName;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private String createTime;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private String thumbnail;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_MD5 = "md5";
  private String md5;

  public static final String JSON_PROPERTY_TEXTS = "texts";
  private String texts;

  public static final String JSON_PROPERTY_MATERIAL = "material";
  private String material;

  public VideoInfoType() { 
  }

  public VideoInfoType taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTaskId() {
    return taskId;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public VideoInfoType status(Integer status) {
    
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

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public VideoInfoType videoId(Long videoId) {
    
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


  public VideoInfoType videoUrl(String videoUrl) {
    
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


  public VideoInfoType errors(String errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(String errors) {
    this.errors = errors;
  }


  public VideoInfoType videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * Get videoName
   * @return videoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoName() {
    return videoName;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public VideoInfoType createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public VideoInfoType id(Long id) {
    
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


  public VideoInfoType thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbnail() {
    return thumbnail;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public VideoInfoType duration(Integer duration) {
    
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


  public VideoInfoType width(Integer width) {
    
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


  public VideoInfoType height(Integer height) {
    
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


  public VideoInfoType md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd5() {
    return md5;
  }


  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public VideoInfoType texts(String texts) {
    
    this.texts = texts;
    return this;
  }

   /**
   * Get texts
   * @return texts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTexts() {
    return texts;
  }


  @JsonProperty(JSON_PROPERTY_TEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTexts(String texts) {
    this.texts = texts;
  }


  public VideoInfoType material(String material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaterial() {
    return material;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterial(String material) {
    this.material = material;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoInfoType videoInfoType = (VideoInfoType) o;
    return Objects.equals(this.taskId, videoInfoType.taskId) &&
        Objects.equals(this.status, videoInfoType.status) &&
        Objects.equals(this.videoId, videoInfoType.videoId) &&
        Objects.equals(this.videoUrl, videoInfoType.videoUrl) &&
        Objects.equals(this.errors, videoInfoType.errors) &&
        Objects.equals(this.videoName, videoInfoType.videoName) &&
        Objects.equals(this.createTime, videoInfoType.createTime) &&
        Objects.equals(this.id, videoInfoType.id) &&
        Objects.equals(this.thumbnail, videoInfoType.thumbnail) &&
        Objects.equals(this.duration, videoInfoType.duration) &&
        Objects.equals(this.width, videoInfoType.width) &&
        Objects.equals(this.height, videoInfoType.height) &&
        Objects.equals(this.md5, videoInfoType.md5) &&
        Objects.equals(this.texts, videoInfoType.texts) &&
        Objects.equals(this.material, videoInfoType.material);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, status, videoId, videoUrl, errors, videoName, createTime, id, thumbnail, duration, width, height, md5, texts, material);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoInfoType {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
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

