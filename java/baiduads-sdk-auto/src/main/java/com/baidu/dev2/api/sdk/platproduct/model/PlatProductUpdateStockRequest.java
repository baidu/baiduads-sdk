/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductSkuPackageVo;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductSkuVo;
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
 * PlatProductUpdateStockRequest
 */
@JsonPropertyOrder({
  PlatProductUpdateStockRequest.JSON_PROPERTY_APP_ID,
  PlatProductUpdateStockRequest.JSON_PROPERTY_SHOP_ID,
  PlatProductUpdateStockRequest.JSON_PROPERTY_SPU_ID,
  PlatProductUpdateStockRequest.JSON_PROPERTY_SKU_LIST,
  PlatProductUpdateStockRequest.JSON_PROPERTY_PRODUCT_SKU_PACKAGES
})
@JsonTypeName("PlatProductUpdateStockRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatProductUpdateStockRequest {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_SPU_ID = "spuId";
  private Long spuId;

  public static final String JSON_PROPERTY_SKU_LIST = "skuList";
  private List<PlatProductSkuVo> skuList = null;

  public static final String JSON_PROPERTY_PRODUCT_SKU_PACKAGES = "productSkuPackages";
  private List<PlatProductSkuPackageVo> productSkuPackages = null;

  public PlatProductUpdateStockRequest() { 
  }

  public PlatProductUpdateStockRequest appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public PlatProductUpdateStockRequest shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * Get shopId
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopId() {
    return shopId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public PlatProductUpdateStockRequest spuId(Long spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * Get spuId
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpuId() {
    return spuId;
  }


  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }


  public PlatProductUpdateStockRequest skuList(List<PlatProductSkuVo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public PlatProductUpdateStockRequest addSkuListItem(PlatProductSkuVo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * Get skuList
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatProductSkuVo> getSkuList() {
    return skuList;
  }


  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuList(List<PlatProductSkuVo> skuList) {
    this.skuList = skuList;
  }


  public PlatProductUpdateStockRequest productSkuPackages(List<PlatProductSkuPackageVo> productSkuPackages) {
    
    this.productSkuPackages = productSkuPackages;
    return this;
  }

  public PlatProductUpdateStockRequest addProductSkuPackagesItem(PlatProductSkuPackageVo productSkuPackagesItem) {
    if (this.productSkuPackages == null) {
      this.productSkuPackages = new ArrayList<>();
    }
    this.productSkuPackages.add(productSkuPackagesItem);
    return this;
  }

   /**
   * Get productSkuPackages
   * @return productSkuPackages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SKU_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatProductSkuPackageVo> getProductSkuPackages() {
    return productSkuPackages;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SKU_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductSkuPackages(List<PlatProductSkuPackageVo> productSkuPackages) {
    this.productSkuPackages = productSkuPackages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatProductUpdateStockRequest platProductUpdateStockRequest = (PlatProductUpdateStockRequest) o;
    return Objects.equals(this.appId, platProductUpdateStockRequest.appId) &&
        Objects.equals(this.shopId, platProductUpdateStockRequest.shopId) &&
        Objects.equals(this.spuId, platProductUpdateStockRequest.spuId) &&
        Objects.equals(this.skuList, platProductUpdateStockRequest.skuList) &&
        Objects.equals(this.productSkuPackages, platProductUpdateStockRequest.productSkuPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, shopId, spuId, skuList, productSkuPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatProductUpdateStockRequest {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    productSkuPackages: ").append(toIndentedString(productSkuPackages)).append("\n");
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

