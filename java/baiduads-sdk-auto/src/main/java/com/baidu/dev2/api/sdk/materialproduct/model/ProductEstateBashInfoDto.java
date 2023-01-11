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
 * ProductEstateBashInfoDto
 */
@JsonPropertyOrder({
  ProductEstateBashInfoDto.JSON_PROPERTY_SALES_STATUS,
  ProductEstateBashInfoDto.JSON_PROPERTY_PROPERTY_TYPE,
  ProductEstateBashInfoDto.JSON_PROPERTY_START_TIME,
  ProductEstateBashInfoDto.JSON_PROPERTY_MOST_DOOR_MODEL,
  ProductEstateBashInfoDto.JSON_PROPERTY_PRICE,
  ProductEstateBashInfoDto.JSON_PROPERTY_TOTAL_PRICE,
  ProductEstateBashInfoDto.JSON_PROPERTY_YEAR
})
@JsonTypeName("ProductEstateBashInfoDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductEstateBashInfoDto {
  public static final String JSON_PROPERTY_SALES_STATUS = "salesStatus";
  private String salesStatus;

  public static final String JSON_PROPERTY_PROPERTY_TYPE = "propertyType";
  private String propertyType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_MOST_DOOR_MODEL = "mostDoorModel";
  private List<String> mostDoorModel = null;

  public static final String JSON_PROPERTY_PRICE = "price";
  private PriceDto price;

  public static final String JSON_PROPERTY_TOTAL_PRICE = "totalPrice";
  private String totalPrice;

  public static final String JSON_PROPERTY_YEAR = "year";
  private String year;

  public ProductEstateBashInfoDto() { 
  }

  public ProductEstateBashInfoDto salesStatus(String salesStatus) {
    
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


  public ProductEstateBashInfoDto propertyType(String propertyType) {
    
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Get propertyType
   * @return propertyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyType() {
    return propertyType;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  public ProductEstateBashInfoDto startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ProductEstateBashInfoDto mostDoorModel(List<String> mostDoorModel) {
    
    this.mostDoorModel = mostDoorModel;
    return this;
  }

  public ProductEstateBashInfoDto addMostDoorModelItem(String mostDoorModelItem) {
    if (this.mostDoorModel == null) {
      this.mostDoorModel = new ArrayList<>();
    }
    this.mostDoorModel.add(mostDoorModelItem);
    return this;
  }

   /**
   * Get mostDoorModel
   * @return mostDoorModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOST_DOOR_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMostDoorModel() {
    return mostDoorModel;
  }


  @JsonProperty(JSON_PROPERTY_MOST_DOOR_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostDoorModel(List<String> mostDoorModel) {
    this.mostDoorModel = mostDoorModel;
  }


  public ProductEstateBashInfoDto price(PriceDto price) {
    
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


  public ProductEstateBashInfoDto totalPrice(String totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalPrice() {
    return totalPrice;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }


  public ProductEstateBashInfoDto year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductEstateBashInfoDto productEstateBashInfoDto = (ProductEstateBashInfoDto) o;
    return Objects.equals(this.salesStatus, productEstateBashInfoDto.salesStatus) &&
        Objects.equals(this.propertyType, productEstateBashInfoDto.propertyType) &&
        Objects.equals(this.startTime, productEstateBashInfoDto.startTime) &&
        Objects.equals(this.mostDoorModel, productEstateBashInfoDto.mostDoorModel) &&
        Objects.equals(this.price, productEstateBashInfoDto.price) &&
        Objects.equals(this.totalPrice, productEstateBashInfoDto.totalPrice) &&
        Objects.equals(this.year, productEstateBashInfoDto.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesStatus, propertyType, startTime, mostDoorModel, price, totalPrice, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEstateBashInfoDto {\n");
    sb.append("    salesStatus: ").append(toIndentedString(salesStatus)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    mostDoorModel: ").append(toIndentedString(mostDoorModel)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
