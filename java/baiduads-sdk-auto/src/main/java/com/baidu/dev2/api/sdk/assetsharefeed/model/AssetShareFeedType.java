/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.assetsharefeed.model;

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
 * AssetShareFeedType
 */
@JsonPropertyOrder({
  AssetShareFeedType.JSON_PROPERTY_SRC_ASSET_ID,
  AssetShareFeedType.JSON_PROPERTY_TO_USER_ID,
  AssetShareFeedType.JSON_PROPERTY_TYPE,
  AssetShareFeedType.JSON_PROPERTY_ASSET_ID,
  AssetShareFeedType.JSON_PROPERTY_ASSET_NAME,
  AssetShareFeedType.JSON_PROPERTY_ASSET_CONTENT
})
@JsonTypeName("AssetShareFeedType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetShareFeedType {
  public static final String JSON_PROPERTY_SRC_ASSET_ID = "srcAssetId";
  private Long srcAssetId;

  public static final String JSON_PROPERTY_TO_USER_ID = "toUserId";
  private Long toUserId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private Long assetId;

  public static final String JSON_PROPERTY_ASSET_NAME = "assetName";
  private String assetName;

  public static final String JSON_PROPERTY_ASSET_CONTENT = "assetContent";
  private String assetContent;

  public AssetShareFeedType() { 
  }

  public AssetShareFeedType srcAssetId(Long srcAssetId) {
    
    this.srcAssetId = srcAssetId;
    return this;
  }

   /**
   * Get srcAssetId
   * @return srcAssetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SRC_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSrcAssetId() {
    return srcAssetId;
  }


  @JsonProperty(JSON_PROPERTY_SRC_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcAssetId(Long srcAssetId) {
    this.srcAssetId = srcAssetId;
  }


  public AssetShareFeedType toUserId(Long toUserId) {
    
    this.toUserId = toUserId;
    return this;
  }

   /**
   * Get toUserId
   * @return toUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToUserId() {
    return toUserId;
  }


  @JsonProperty(JSON_PROPERTY_TO_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToUserId(Long toUserId) {
    this.toUserId = toUserId;
  }


  public AssetShareFeedType type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public AssetShareFeedType assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public AssetShareFeedType assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetName() {
    return assetName;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public AssetShareFeedType assetContent(String assetContent) {
    
    this.assetContent = assetContent;
    return this;
  }

   /**
   * Get assetContent
   * @return assetContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetContent() {
    return assetContent;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetContent(String assetContent) {
    this.assetContent = assetContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetShareFeedType assetShareFeedType = (AssetShareFeedType) o;
    return Objects.equals(this.srcAssetId, assetShareFeedType.srcAssetId) &&
        Objects.equals(this.toUserId, assetShareFeedType.toUserId) &&
        Objects.equals(this.type, assetShareFeedType.type) &&
        Objects.equals(this.assetId, assetShareFeedType.assetId) &&
        Objects.equals(this.assetName, assetShareFeedType.assetName) &&
        Objects.equals(this.assetContent, assetShareFeedType.assetContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcAssetId, toUserId, type, assetId, assetName, assetContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetShareFeedType {\n");
    sb.append("    srcAssetId: ").append(toIndentedString(srcAssetId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetContent: ").append(toIndentedString(assetContent)).append("\n");
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

