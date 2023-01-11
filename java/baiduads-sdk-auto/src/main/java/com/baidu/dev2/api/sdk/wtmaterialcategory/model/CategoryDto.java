/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.wtmaterialcategory.model;

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
 * CategoryDto
 */
@JsonPropertyOrder({
  CategoryDto.JSON_PROPERTY_CATEGORY_ID,
  CategoryDto.JSON_PROPERTY_TYPE,
  CategoryDto.JSON_PROPERTY_NAME,
  CategoryDto.JSON_PROPERTY_STATUS,
  CategoryDto.JSON_PROPERTY_AUDIT_REMARK
})
@JsonTypeName("CategoryDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoryDto {
  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_AUDIT_REMARK = "auditRemark";
  private String auditRemark;

  public CategoryDto() { 
  }

  public CategoryDto categoryId(Long categoryId) {
    
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


  public CategoryDto type(Integer type) {
    
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


  public CategoryDto name(String name) {
    
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


  public CategoryDto status(Integer status) {
    
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


  public CategoryDto auditRemark(String auditRemark) {
    
    this.auditRemark = auditRemark;
    return this;
  }

   /**
   * Get auditRemark
   * @return auditRemark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuditRemark() {
    return auditRemark;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditRemark(String auditRemark) {
    this.auditRemark = auditRemark;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDto categoryDto = (CategoryDto) o;
    return Objects.equals(this.categoryId, categoryDto.categoryId) &&
        Objects.equals(this.type, categoryDto.type) &&
        Objects.equals(this.name, categoryDto.name) &&
        Objects.equals(this.status, categoryDto.status) &&
        Objects.equals(this.auditRemark, categoryDto.auditRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, type, name, status, auditRemark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDto {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    auditRemark: ").append(toIndentedString(auditRemark)).append("\n");
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
