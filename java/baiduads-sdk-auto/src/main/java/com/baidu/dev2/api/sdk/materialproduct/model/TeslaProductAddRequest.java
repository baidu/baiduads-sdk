/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductExtDto;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductImage;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductVideo;
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
 * TeslaProductAddRequest
 */
@JsonPropertyOrder({
  TeslaProductAddRequest.JSON_PROPERTY_CATEGORY_ID,
  TeslaProductAddRequest.JSON_PROPERTY_PRODUCT_TITLE,
  TeslaProductAddRequest.JSON_PROPERTY_DESC,
  TeslaProductAddRequest.JSON_PROPERTY_CONTENT,
  TeslaProductAddRequest.JSON_PROPERTY_STATUS,
  TeslaProductAddRequest.JSON_PROPERTY_PRODUCT_SHORT_TITLE,
  TeslaProductAddRequest.JSON_PROPERTY_IMAGE,
  TeslaProductAddRequest.JSON_PROPERTY_PRODUCT_EXT,
  TeslaProductAddRequest.JSON_PROPERTY_TRADE_ID,
  TeslaProductAddRequest.JSON_PROPERTY_VIDEO,
  TeslaProductAddRequest.JSON_PROPERTY_DATA_VERSION,
  TeslaProductAddRequest.JSON_PROPERTY_REC_TITLE
})
@JsonTypeName("TeslaProductAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaProductAddRequest {
  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_PRODUCT_TITLE = "productTitle";
  private String productTitle;

  public static final String JSON_PROPERTY_DESC = "desc";
  private String desc;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_PRODUCT_SHORT_TITLE = "productShortTitle";
  private String productShortTitle;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private List<ProductImage> image = null;

  public static final String JSON_PROPERTY_PRODUCT_EXT = "productExt";
  private ProductExtDto productExt;

  public static final String JSON_PROPERTY_TRADE_ID = "tradeId";
  private Long tradeId;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private List<ProductVideo> video = null;

  public static final String JSON_PROPERTY_DATA_VERSION = "dataVersion";
  private Integer dataVersion;

  public static final String JSON_PROPERTY_REC_TITLE = "recTitle";
  private List<String> recTitle = null;

  public TeslaProductAddRequest() { 
  }

  public TeslaProductAddRequest categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public TeslaProductAddRequest productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * Get productTitle
   * @return productTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductTitle() {
    return productTitle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public TeslaProductAddRequest desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  public TeslaProductAddRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public TeslaProductAddRequest status(Integer status) {
    
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


  public TeslaProductAddRequest productShortTitle(String productShortTitle) {
    
    this.productShortTitle = productShortTitle;
    return this;
  }

   /**
   * Get productShortTitle
   * @return productShortTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SHORT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductShortTitle() {
    return productShortTitle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SHORT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductShortTitle(String productShortTitle) {
    this.productShortTitle = productShortTitle;
  }


  public TeslaProductAddRequest image(List<ProductImage> image) {
    
    this.image = image;
    return this;
  }

  public TeslaProductAddRequest addImageItem(ProductImage imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductImage> getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(List<ProductImage> image) {
    this.image = image;
  }


  public TeslaProductAddRequest productExt(ProductExtDto productExt) {
    
    this.productExt = productExt;
    return this;
  }

   /**
   * Get productExt
   * @return productExt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductExtDto getProductExt() {
    return productExt;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductExt(ProductExtDto productExt) {
    this.productExt = productExt;
  }


  public TeslaProductAddRequest tradeId(Long tradeId) {
    
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTradeId() {
    return tradeId;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }


  public TeslaProductAddRequest video(List<ProductVideo> video) {
    
    this.video = video;
    return this;
  }

  public TeslaProductAddRequest addVideoItem(ProductVideo videoItem) {
    if (this.video == null) {
      this.video = new ArrayList<>();
    }
    this.video.add(videoItem);
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductVideo> getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(List<ProductVideo> video) {
    this.video = video;
  }


  public TeslaProductAddRequest dataVersion(Integer dataVersion) {
    
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDataVersion() {
    return dataVersion;
  }


  @JsonProperty(JSON_PROPERTY_DATA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataVersion(Integer dataVersion) {
    this.dataVersion = dataVersion;
  }


  public TeslaProductAddRequest recTitle(List<String> recTitle) {
    
    this.recTitle = recTitle;
    return this;
  }

  public TeslaProductAddRequest addRecTitleItem(String recTitleItem) {
    if (this.recTitle == null) {
      this.recTitle = new ArrayList<>();
    }
    this.recTitle.add(recTitleItem);
    return this;
  }

   /**
   * Get recTitle
   * @return recTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REC_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRecTitle() {
    return recTitle;
  }


  @JsonProperty(JSON_PROPERTY_REC_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecTitle(List<String> recTitle) {
    this.recTitle = recTitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaProductAddRequest teslaProductAddRequest = (TeslaProductAddRequest) o;
    return Objects.equals(this.categoryId, teslaProductAddRequest.categoryId) &&
        Objects.equals(this.productTitle, teslaProductAddRequest.productTitle) &&
        Objects.equals(this.desc, teslaProductAddRequest.desc) &&
        Objects.equals(this.content, teslaProductAddRequest.content) &&
        Objects.equals(this.status, teslaProductAddRequest.status) &&
        Objects.equals(this.productShortTitle, teslaProductAddRequest.productShortTitle) &&
        Objects.equals(this.image, teslaProductAddRequest.image) &&
        Objects.equals(this.productExt, teslaProductAddRequest.productExt) &&
        Objects.equals(this.tradeId, teslaProductAddRequest.tradeId) &&
        Objects.equals(this.video, teslaProductAddRequest.video) &&
        Objects.equals(this.dataVersion, teslaProductAddRequest.dataVersion) &&
        Objects.equals(this.recTitle, teslaProductAddRequest.recTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, productTitle, desc, content, status, productShortTitle, image, productExt, tradeId, video, dataVersion, recTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaProductAddRequest {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productShortTitle: ").append(toIndentedString(productShortTitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    productExt: ").append(toIndentedString(productExt)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
    sb.append("    recTitle: ").append(toIndentedString(recTitle)).append("\n");
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

