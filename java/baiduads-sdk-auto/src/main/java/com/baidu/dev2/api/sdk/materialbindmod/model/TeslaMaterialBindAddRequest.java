/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialbindmod.model;

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
 * TeslaMaterialBindAddRequest
 */
@JsonPropertyOrder({
  TeslaMaterialBindAddRequest.JSON_PROPERTY_MATERIAL_ID,
  TeslaMaterialBindAddRequest.JSON_PROPERTY_MATERIAL_TYPE,
  TeslaMaterialBindAddRequest.JSON_PROPERTY_BIND_MATERIAL_ID,
  TeslaMaterialBindAddRequest.JSON_PROPERTY_BIND_MATERIAL_TYPE
})
@JsonTypeName("TeslaMaterialBindAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaMaterialBindAddRequest {
  public static final String JSON_PROPERTY_MATERIAL_ID = "materialId";
  private Long materialId;

  public static final String JSON_PROPERTY_MATERIAL_TYPE = "materialType";
  private Integer materialType;

  public static final String JSON_PROPERTY_BIND_MATERIAL_ID = "bindMaterialId";
  private List<Long> bindMaterialId = null;

  public static final String JSON_PROPERTY_BIND_MATERIAL_TYPE = "bindMaterialType";
  private Integer bindMaterialType;

  public TeslaMaterialBindAddRequest() { 
  }

  public TeslaMaterialBindAddRequest materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * Get materialId
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaterialId() {
    return materialId;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public TeslaMaterialBindAddRequest materialType(Integer materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaterialType() {
    return materialType;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialType(Integer materialType) {
    this.materialType = materialType;
  }


  public TeslaMaterialBindAddRequest bindMaterialId(List<Long> bindMaterialId) {
    
    this.bindMaterialId = bindMaterialId;
    return this;
  }

  public TeslaMaterialBindAddRequest addBindMaterialIdItem(Long bindMaterialIdItem) {
    if (this.bindMaterialId == null) {
      this.bindMaterialId = new ArrayList<>();
    }
    this.bindMaterialId.add(bindMaterialIdItem);
    return this;
  }

   /**
   * Get bindMaterialId
   * @return bindMaterialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getBindMaterialId() {
    return bindMaterialId;
  }


  @JsonProperty(JSON_PROPERTY_BIND_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindMaterialId(List<Long> bindMaterialId) {
    this.bindMaterialId = bindMaterialId;
  }


  public TeslaMaterialBindAddRequest bindMaterialType(Integer bindMaterialType) {
    
    this.bindMaterialType = bindMaterialType;
    return this;
  }

   /**
   * Get bindMaterialType
   * @return bindMaterialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBindMaterialType() {
    return bindMaterialType;
  }


  @JsonProperty(JSON_PROPERTY_BIND_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindMaterialType(Integer bindMaterialType) {
    this.bindMaterialType = bindMaterialType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaMaterialBindAddRequest teslaMaterialBindAddRequest = (TeslaMaterialBindAddRequest) o;
    return Objects.equals(this.materialId, teslaMaterialBindAddRequest.materialId) &&
        Objects.equals(this.materialType, teslaMaterialBindAddRequest.materialType) &&
        Objects.equals(this.bindMaterialId, teslaMaterialBindAddRequest.bindMaterialId) &&
        Objects.equals(this.bindMaterialType, teslaMaterialBindAddRequest.bindMaterialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, materialType, bindMaterialId, bindMaterialType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaMaterialBindAddRequest {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    bindMaterialId: ").append(toIndentedString(bindMaterialId)).append("\n");
    sb.append("    bindMaterialType: ").append(toIndentedString(bindMaterialType)).append("\n");
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

