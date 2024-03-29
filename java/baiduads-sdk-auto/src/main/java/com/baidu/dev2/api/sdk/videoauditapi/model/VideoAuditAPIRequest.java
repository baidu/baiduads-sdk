/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videoauditapi.model;

import java.util.Objects;
import java.util.Arrays;
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
 * VideoAuditAPIRequest
 */
@JsonPropertyOrder({
  VideoAuditAPIRequest.JSON_PROPERTY_CHANNEL,
  VideoAuditAPIRequest.JSON_PROPERTY_VIDEO_ID_LIST
})
@JsonTypeName("VideoAuditAPIRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoAuditAPIRequest {
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Integer channel;

  public static final String JSON_PROPERTY_VIDEO_ID_LIST = "videoIdList";
  private List<Long> videoIdList = null;

  public VideoAuditAPIRequest() { 
  }

  public VideoAuditAPIRequest channel(Integer channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public VideoAuditAPIRequest videoIdList(List<Long> videoIdList) {
    
    this.videoIdList = videoIdList;
    return this;
  }

  public VideoAuditAPIRequest addVideoIdListItem(Long videoIdListItem) {
    if (this.videoIdList == null) {
      this.videoIdList = new ArrayList<>();
    }
    this.videoIdList.add(videoIdListItem);
    return this;
  }

   /**
   * Get videoIdList
   * @return videoIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getVideoIdList() {
    return videoIdList;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoIdList(List<Long> videoIdList) {
    this.videoIdList = videoIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAuditAPIRequest videoAuditAPIRequest = (VideoAuditAPIRequest) o;
    return Objects.equals(this.channel, videoAuditAPIRequest.channel) &&
        Objects.equals(this.videoIdList, videoAuditAPIRequest.videoIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, videoIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAuditAPIRequest {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    videoIdList: ").append(toIndentedString(videoIdList)).append("\n");
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

