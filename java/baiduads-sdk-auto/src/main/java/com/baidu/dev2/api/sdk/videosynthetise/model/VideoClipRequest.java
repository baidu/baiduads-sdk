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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VideoClipRequest
 */
@JsonPropertyOrder({
  VideoClipRequest.JSON_PROPERTY_CUT_TYPE,
  VideoClipRequest.JSON_PROPERTY_URL,
  VideoClipRequest.JSON_PROPERTY_DURATION,
  VideoClipRequest.JSON_PROPERTY_BEGIN_TIME,
  VideoClipRequest.JSON_PROPERTY_END_TIME,
  VideoClipRequest.JSON_PROPERTY_SOURCE,
  VideoClipRequest.JSON_PROPERTY_VIDEO_ID,
  VideoClipRequest.JSON_PROPERTY_HIGHLIGHT_LIST,
  VideoClipRequest.JSON_PROPERTY_PRODUCT_LINE
})
@JsonTypeName("VideoClipRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoClipRequest {
  public static final String JSON_PROPERTY_CUT_TYPE = "cutType";
  private Integer cutType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_BEGIN_TIME = "beginTime";
  private Integer beginTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Integer source;

  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_HIGHLIGHT_LIST = "highlightList";
  private List<Double> highlightList = null;

  public static final String JSON_PROPERTY_PRODUCT_LINE = "productLine";
  private String productLine;

  public VideoClipRequest() { 
  }

  public VideoClipRequest cutType(Integer cutType) {
    
    this.cutType = cutType;
    return this;
  }

   /**
   * Get cutType
   * @return cutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCutType() {
    return cutType;
  }


  @JsonProperty(JSON_PROPERTY_CUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCutType(Integer cutType) {
    this.cutType = cutType;
  }


  public VideoClipRequest url(String url) {
    
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


  public VideoClipRequest duration(Integer duration) {
    
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


  public VideoClipRequest beginTime(Integer beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Get beginTime
   * @return beginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BEGIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBeginTime() {
    return beginTime;
  }


  @JsonProperty(JSON_PROPERTY_BEGIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeginTime(Integer beginTime) {
    this.beginTime = beginTime;
  }


  public VideoClipRequest endTime(Integer endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }


  public VideoClipRequest source(Integer source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(Integer source) {
    this.source = source;
  }


  public VideoClipRequest videoId(Long videoId) {
    
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


  public VideoClipRequest highlightList(List<Double> highlightList) {
    
    this.highlightList = highlightList;
    return this;
  }

  public VideoClipRequest addHighlightListItem(Double highlightListItem) {
    if (this.highlightList == null) {
      this.highlightList = new ArrayList<>();
    }
    this.highlightList.add(highlightListItem);
    return this;
  }

   /**
   * Get highlightList
   * @return highlightList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Double> getHighlightList() {
    return highlightList;
  }


  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlightList(List<Double> highlightList) {
    this.highlightList = highlightList;
  }


  public VideoClipRequest productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * Get productLine
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductLine() {
    return productLine;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoClipRequest videoClipRequest = (VideoClipRequest) o;
    return Objects.equals(this.cutType, videoClipRequest.cutType) &&
        Objects.equals(this.url, videoClipRequest.url) &&
        Objects.equals(this.duration, videoClipRequest.duration) &&
        Objects.equals(this.beginTime, videoClipRequest.beginTime) &&
        Objects.equals(this.endTime, videoClipRequest.endTime) &&
        Objects.equals(this.source, videoClipRequest.source) &&
        Objects.equals(this.videoId, videoClipRequest.videoId) &&
        Objects.equals(this.highlightList, videoClipRequest.highlightList) &&
        Objects.equals(this.productLine, videoClipRequest.productLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cutType, url, duration, beginTime, endTime, source, videoId, highlightList, productLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoClipRequest {\n");
    sb.append("    cutType: ").append(toIndentedString(cutType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    highlightList: ").append(toIndentedString(highlightList)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
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

