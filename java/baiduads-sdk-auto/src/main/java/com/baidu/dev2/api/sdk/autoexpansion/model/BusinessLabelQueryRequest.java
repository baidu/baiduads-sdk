/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.autoexpansion.model;

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
 * BusinessLabelQueryRequest
 */
@JsonPropertyOrder({
  BusinessLabelQueryRequest.JSON_PROPERTY_BUSINESS_LABEL_TYPE_FIELDS,
  BusinessLabelQueryRequest.JSON_PROPERTY_BUSINESS_POINT_IDS,
  BusinessLabelQueryRequest.JSON_PROPERTY_IDS,
  BusinessLabelQueryRequest.JSON_PROPERTY_ID_TYPE
})
@JsonTypeName("BusinessLabelQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessLabelQueryRequest {
  public static final String JSON_PROPERTY_BUSINESS_LABEL_TYPE_FIELDS = "businessLabelTypeFields";
  private List<String> businessLabelTypeFields = null;

  public static final String JSON_PROPERTY_BUSINESS_POINT_IDS = "businessPointIds";
  private List<Long> businessPointIds = null;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public BusinessLabelQueryRequest() { 
  }

  public BusinessLabelQueryRequest businessLabelTypeFields(List<String> businessLabelTypeFields) {
    
    this.businessLabelTypeFields = businessLabelTypeFields;
    return this;
  }

  public BusinessLabelQueryRequest addBusinessLabelTypeFieldsItem(String businessLabelTypeFieldsItem) {
    if (this.businessLabelTypeFields == null) {
      this.businessLabelTypeFields = new ArrayList<>();
    }
    this.businessLabelTypeFields.add(businessLabelTypeFieldsItem);
    return this;
  }

   /**
   * Get businessLabelTypeFields
   * @return businessLabelTypeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_TYPE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBusinessLabelTypeFields() {
    return businessLabelTypeFields;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_TYPE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLabelTypeFields(List<String> businessLabelTypeFields) {
    this.businessLabelTypeFields = businessLabelTypeFields;
  }


  public BusinessLabelQueryRequest businessPointIds(List<Long> businessPointIds) {
    
    this.businessPointIds = businessPointIds;
    return this;
  }

  public BusinessLabelQueryRequest addBusinessPointIdsItem(Long businessPointIdsItem) {
    if (this.businessPointIds == null) {
      this.businessPointIds = new ArrayList<>();
    }
    this.businessPointIds.add(businessPointIdsItem);
    return this;
  }

   /**
   * Get businessPointIds
   * @return businessPointIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getBusinessPointIds() {
    return businessPointIds;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessPointIds(List<Long> businessPointIds) {
    this.businessPointIds = businessPointIds;
  }


  public BusinessLabelQueryRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public BusinessLabelQueryRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public BusinessLabelQueryRequest idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLabelQueryRequest businessLabelQueryRequest = (BusinessLabelQueryRequest) o;
    return Objects.equals(this.businessLabelTypeFields, businessLabelQueryRequest.businessLabelTypeFields) &&
        Objects.equals(this.businessPointIds, businessLabelQueryRequest.businessPointIds) &&
        Objects.equals(this.ids, businessLabelQueryRequest.ids) &&
        Objects.equals(this.idType, businessLabelQueryRequest.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLabelTypeFields, businessPointIds, ids, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLabelQueryRequest {\n");
    sb.append("    businessLabelTypeFields: ").append(toIndentedString(businessLabelTypeFields)).append("\n");
    sb.append("    businessPointIds: ").append(toIndentedString(businessPointIds)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

