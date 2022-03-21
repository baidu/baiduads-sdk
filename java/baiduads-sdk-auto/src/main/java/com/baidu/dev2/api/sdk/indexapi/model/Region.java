/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.indexapi.model;

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
 * Region
 */
@JsonPropertyOrder({
  Region.JSON_PROPERTY_PROVINCE,
  Region.JSON_PROPERTY_CITY,
  Region.JSON_PROPERTY_IS_ALL
})
@JsonTypeName("Region")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Region {
  public static final String JSON_PROPERTY_PROVINCE = "province";
  private List<String> province = null;

  public static final String JSON_PROPERTY_CITY = "city";
  private List<String> city = null;

  public static final String JSON_PROPERTY_IS_ALL = "isAll";
  private Boolean isAll;

  public Region() { 
  }

  public Region province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public Region addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(List<String> province) {
    this.province = province;
  }


  public Region city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public Region addCityItem(String cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(List<String> city) {
    this.city = city;
  }


  public Region isAll(Boolean isAll) {
    
    this.isAll = isAll;
    return this;
  }

   /**
   * Get isAll
   * @return isAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAll() {
    return isAll;
  }


  @JsonProperty(JSON_PROPERTY_IS_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAll(Boolean isAll) {
    this.isAll = isAll;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Region region = (Region) o;
    return Objects.equals(this.province, region.province) &&
        Objects.equals(this.city, region.city) &&
        Objects.equals(this.isAll, region.isAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(province, city, isAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Region {\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    isAll: ").append(toIndentedString(isAll)).append("\n");
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
