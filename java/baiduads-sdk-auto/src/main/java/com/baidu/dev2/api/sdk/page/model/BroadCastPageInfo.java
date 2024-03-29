/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.page.model;

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
 * BroadCastPageInfo
 */
@JsonPropertyOrder({
  BroadCastPageInfo.JSON_PROPERTY_LIVE_ROOM_TITLE,
  BroadCastPageInfo.JSON_PROPERTY_LIVE_URL,
  BroadCastPageInfo.JSON_PROPERTY_PASS_ID,
  BroadCastPageInfo.JSON_PROPERTY_ROOM_ID,
  BroadCastPageInfo.JSON_PROPERTY_ANCHOR_NAME
})
@JsonTypeName("BroadCastPageInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BroadCastPageInfo {
  public static final String JSON_PROPERTY_LIVE_ROOM_TITLE = "liveRoomTitle";
  private String liveRoomTitle;

  public static final String JSON_PROPERTY_LIVE_URL = "liveUrl";
  private String liveUrl;

  public static final String JSON_PROPERTY_PASS_ID = "passId";
  private Long passId;

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  private Long roomId;

  public static final String JSON_PROPERTY_ANCHOR_NAME = "anchorName";
  private String anchorName;

  public BroadCastPageInfo() { 
  }

  public BroadCastPageInfo liveRoomTitle(String liveRoomTitle) {
    
    this.liveRoomTitle = liveRoomTitle;
    return this;
  }

   /**
   * Get liveRoomTitle
   * @return liveRoomTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIVE_ROOM_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLiveRoomTitle() {
    return liveRoomTitle;
  }


  @JsonProperty(JSON_PROPERTY_LIVE_ROOM_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiveRoomTitle(String liveRoomTitle) {
    this.liveRoomTitle = liveRoomTitle;
  }


  public BroadCastPageInfo liveUrl(String liveUrl) {
    
    this.liveUrl = liveUrl;
    return this;
  }

   /**
   * Get liveUrl
   * @return liveUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIVE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLiveUrl() {
    return liveUrl;
  }


  @JsonProperty(JSON_PROPERTY_LIVE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiveUrl(String liveUrl) {
    this.liveUrl = liveUrl;
  }


  public BroadCastPageInfo passId(Long passId) {
    
    this.passId = passId;
    return this;
  }

   /**
   * Get passId
   * @return passId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPassId() {
    return passId;
  }


  @JsonProperty(JSON_PROPERTY_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassId(Long passId) {
    this.passId = passId;
  }


  public BroadCastPageInfo roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public BroadCastPageInfo anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * Get anchorName
   * @return anchorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnchorName() {
    return anchorName;
  }


  @JsonProperty(JSON_PROPERTY_ANCHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadCastPageInfo broadCastPageInfo = (BroadCastPageInfo) o;
    return Objects.equals(this.liveRoomTitle, broadCastPageInfo.liveRoomTitle) &&
        Objects.equals(this.liveUrl, broadCastPageInfo.liveUrl) &&
        Objects.equals(this.passId, broadCastPageInfo.passId) &&
        Objects.equals(this.roomId, broadCastPageInfo.roomId) &&
        Objects.equals(this.anchorName, broadCastPageInfo.anchorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveRoomTitle, liveUrl, passId, roomId, anchorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadCastPageInfo {\n");
    sb.append("    liveRoomTitle: ").append(toIndentedString(liveRoomTitle)).append("\n");
    sb.append("    liveUrl: ").append(toIndentedString(liveUrl)).append("\n");
    sb.append("    passId: ").append(toIndentedString(passId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
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

