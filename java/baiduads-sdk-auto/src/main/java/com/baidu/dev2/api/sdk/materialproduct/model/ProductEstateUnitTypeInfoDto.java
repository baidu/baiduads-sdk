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
import com.baidu.dev2.api.sdk.materialproduct.model.PriceDto;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductImage;
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
 * ProductEstateUnitTypeInfoDto
 */
@JsonPropertyOrder({
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_NAME,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_TYPE,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_SALES_STATUS,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_BEDROOM,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_BUILDING_AREA,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_INDOOR_AREA,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_GIVING_AREA,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_TOWARD,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_HIGH,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_HOUSE_RATE,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_ALL_NUM,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_UNIT_TYPE_IMAGE,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_SAMPLE_ROOM_IMAGE,
  ProductEstateUnitTypeInfoDto.JSON_PROPERTY_PRICE
})
@JsonTypeName("ProductEstateUnitTypeInfoDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductEstateUnitTypeInfoDto {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_SALES_STATUS = "salesStatus";
  private String salesStatus;

  public static final String JSON_PROPERTY_BEDROOM = "bedroom";
  private String bedroom;

  public static final String JSON_PROPERTY_BUILDING_AREA = "buildingArea";
  private String buildingArea;

  public static final String JSON_PROPERTY_INDOOR_AREA = "indoorArea";
  private String indoorArea;

  public static final String JSON_PROPERTY_GIVING_AREA = "givingArea";
  private String givingArea;

  public static final String JSON_PROPERTY_TOWARD = "toward";
  private String toward;

  public static final String JSON_PROPERTY_HIGH = "high";
  private Float high;

  public static final String JSON_PROPERTY_HOUSE_RATE = "houseRate";
  private Float houseRate;

  public static final String JSON_PROPERTY_ALL_NUM = "allNum";
  private Integer allNum;

  public static final String JSON_PROPERTY_UNIT_TYPE_IMAGE = "unitTypeImage";
  private ProductImage unitTypeImage;

  public static final String JSON_PROPERTY_SAMPLE_ROOM_IMAGE = "sampleRoomImage";
  private ProductImage sampleRoomImage;

  public static final String JSON_PROPERTY_PRICE = "price";
  private PriceDto price;

  public ProductEstateUnitTypeInfoDto() { 
  }

  public ProductEstateUnitTypeInfoDto name(String name) {
    
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


  public ProductEstateUnitTypeInfoDto type(String type) {
    
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

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ProductEstateUnitTypeInfoDto salesStatus(String salesStatus) {
    
    this.salesStatus = salesStatus;
    return this;
  }

   /**
   * Get salesStatus
   * @return salesStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALES_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalesStatus() {
    return salesStatus;
  }


  @JsonProperty(JSON_PROPERTY_SALES_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesStatus(String salesStatus) {
    this.salesStatus = salesStatus;
  }


  public ProductEstateUnitTypeInfoDto bedroom(String bedroom) {
    
    this.bedroom = bedroom;
    return this;
  }

   /**
   * Get bedroom
   * @return bedroom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BEDROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBedroom() {
    return bedroom;
  }


  @JsonProperty(JSON_PROPERTY_BEDROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBedroom(String bedroom) {
    this.bedroom = bedroom;
  }


  public ProductEstateUnitTypeInfoDto buildingArea(String buildingArea) {
    
    this.buildingArea = buildingArea;
    return this;
  }

   /**
   * Get buildingArea
   * @return buildingArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUILDING_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingArea() {
    return buildingArea;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingArea(String buildingArea) {
    this.buildingArea = buildingArea;
  }


  public ProductEstateUnitTypeInfoDto indoorArea(String indoorArea) {
    
    this.indoorArea = indoorArea;
    return this;
  }

   /**
   * Get indoorArea
   * @return indoorArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDOOR_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndoorArea() {
    return indoorArea;
  }


  @JsonProperty(JSON_PROPERTY_INDOOR_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndoorArea(String indoorArea) {
    this.indoorArea = indoorArea;
  }


  public ProductEstateUnitTypeInfoDto givingArea(String givingArea) {
    
    this.givingArea = givingArea;
    return this;
  }

   /**
   * Get givingArea
   * @return givingArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIVING_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivingArea() {
    return givingArea;
  }


  @JsonProperty(JSON_PROPERTY_GIVING_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivingArea(String givingArea) {
    this.givingArea = givingArea;
  }


  public ProductEstateUnitTypeInfoDto toward(String toward) {
    
    this.toward = toward;
    return this;
  }

   /**
   * Get toward
   * @return toward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToward() {
    return toward;
  }


  @JsonProperty(JSON_PROPERTY_TOWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToward(String toward) {
    this.toward = toward;
  }


  public ProductEstateUnitTypeInfoDto high(Float high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(Float high) {
    this.high = high;
  }


  public ProductEstateUnitTypeInfoDto houseRate(Float houseRate) {
    
    this.houseRate = houseRate;
    return this;
  }

   /**
   * Get houseRate
   * @return houseRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOUSE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getHouseRate() {
    return houseRate;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseRate(Float houseRate) {
    this.houseRate = houseRate;
  }


  public ProductEstateUnitTypeInfoDto allNum(Integer allNum) {
    
    this.allNum = allNum;
    return this;
  }

   /**
   * Get allNum
   * @return allNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllNum() {
    return allNum;
  }


  @JsonProperty(JSON_PROPERTY_ALL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllNum(Integer allNum) {
    this.allNum = allNum;
  }


  public ProductEstateUnitTypeInfoDto unitTypeImage(ProductImage unitTypeImage) {
    
    this.unitTypeImage = unitTypeImage;
    return this;
  }

   /**
   * Get unitTypeImage
   * @return unitTypeImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_TYPE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductImage getUnitTypeImage() {
    return unitTypeImage;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_TYPE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitTypeImage(ProductImage unitTypeImage) {
    this.unitTypeImage = unitTypeImage;
  }


  public ProductEstateUnitTypeInfoDto sampleRoomImage(ProductImage sampleRoomImage) {
    
    this.sampleRoomImage = sampleRoomImage;
    return this;
  }

   /**
   * Get sampleRoomImage
   * @return sampleRoomImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAMPLE_ROOM_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductImage getSampleRoomImage() {
    return sampleRoomImage;
  }


  @JsonProperty(JSON_PROPERTY_SAMPLE_ROOM_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSampleRoomImage(ProductImage sampleRoomImage) {
    this.sampleRoomImage = sampleRoomImage;
  }


  public ProductEstateUnitTypeInfoDto price(PriceDto price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriceDto getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(PriceDto price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductEstateUnitTypeInfoDto productEstateUnitTypeInfoDto = (ProductEstateUnitTypeInfoDto) o;
    return Objects.equals(this.name, productEstateUnitTypeInfoDto.name) &&
        Objects.equals(this.type, productEstateUnitTypeInfoDto.type) &&
        Objects.equals(this.salesStatus, productEstateUnitTypeInfoDto.salesStatus) &&
        Objects.equals(this.bedroom, productEstateUnitTypeInfoDto.bedroom) &&
        Objects.equals(this.buildingArea, productEstateUnitTypeInfoDto.buildingArea) &&
        Objects.equals(this.indoorArea, productEstateUnitTypeInfoDto.indoorArea) &&
        Objects.equals(this.givingArea, productEstateUnitTypeInfoDto.givingArea) &&
        Objects.equals(this.toward, productEstateUnitTypeInfoDto.toward) &&
        Objects.equals(this.high, productEstateUnitTypeInfoDto.high) &&
        Objects.equals(this.houseRate, productEstateUnitTypeInfoDto.houseRate) &&
        Objects.equals(this.allNum, productEstateUnitTypeInfoDto.allNum) &&
        Objects.equals(this.unitTypeImage, productEstateUnitTypeInfoDto.unitTypeImage) &&
        Objects.equals(this.sampleRoomImage, productEstateUnitTypeInfoDto.sampleRoomImage) &&
        Objects.equals(this.price, productEstateUnitTypeInfoDto.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, salesStatus, bedroom, buildingArea, indoorArea, givingArea, toward, high, houseRate, allNum, unitTypeImage, sampleRoomImage, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEstateUnitTypeInfoDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    salesStatus: ").append(toIndentedString(salesStatus)).append("\n");
    sb.append("    bedroom: ").append(toIndentedString(bedroom)).append("\n");
    sb.append("    buildingArea: ").append(toIndentedString(buildingArea)).append("\n");
    sb.append("    indoorArea: ").append(toIndentedString(indoorArea)).append("\n");
    sb.append("    givingArea: ").append(toIndentedString(givingArea)).append("\n");
    sb.append("    toward: ").append(toIndentedString(toward)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    houseRate: ").append(toIndentedString(houseRate)).append("\n");
    sb.append("    allNum: ").append(toIndentedString(allNum)).append("\n");
    sb.append("    unitTypeImage: ").append(toIndentedString(unitTypeImage)).append("\n");
    sb.append("    sampleRoomImage: ").append(toIndentedString(sampleRoomImage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

