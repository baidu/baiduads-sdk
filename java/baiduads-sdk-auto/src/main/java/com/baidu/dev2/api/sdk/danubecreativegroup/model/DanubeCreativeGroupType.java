/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DanubeCreativeComponent;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DanubeWebPlanRangeItemType;
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
 * DanubeCreativeGroupType
 */
@JsonPropertyOrder({
  DanubeCreativeGroupType.JSON_PROPERTY_CREATIVE_GROUP_ID,
  DanubeCreativeGroupType.JSON_PROPERTY_CREATIVE_GROUP_NAME,
  DanubeCreativeGroupType.JSON_PROPERTY_BINDING_RANGE,
  DanubeCreativeGroupType.JSON_PROPERTY_MATERIAL_TYPES,
  DanubeCreativeGroupType.JSON_PROPERTY_BINDING_LEVEL,
  DanubeCreativeGroupType.JSON_PROPERTY_CATEGORY,
  DanubeCreativeGroupType.JSON_PROPERTY_CREATIVE_COMPONENTS,
  DanubeCreativeGroupType.JSON_PROPERTY_DEVICE,
  DanubeCreativeGroupType.JSON_PROPERTY_STATUS,
  DanubeCreativeGroupType.JSON_PROPERTY_PAUSE
})
@JsonTypeName("DanubeCreativeGroupType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DanubeCreativeGroupType {
  public static final String JSON_PROPERTY_CREATIVE_GROUP_ID = "creativeGroupId";
  private Long creativeGroupId;

  public static final String JSON_PROPERTY_CREATIVE_GROUP_NAME = "creativeGroupName";
  private String creativeGroupName;

  public static final String JSON_PROPERTY_BINDING_RANGE = "bindingRange";
  private List<DanubeWebPlanRangeItemType> bindingRange = null;

  public static final String JSON_PROPERTY_MATERIAL_TYPES = "materialTypes";
  private List<Integer> materialTypes = null;

  public static final String JSON_PROPERTY_BINDING_LEVEL = "bindingLevel";
  private String bindingLevel;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<Long> category = null;

  public static final String JSON_PROPERTY_CREATIVE_COMPONENTS = "creativeComponents";
  private DanubeCreativeComponent creativeComponents;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_PAUSE = "pause";
  private Boolean pause;

  public DanubeCreativeGroupType() { 
  }

  public DanubeCreativeGroupType creativeGroupId(Long creativeGroupId) {
    
    this.creativeGroupId = creativeGroupId;
    return this;
  }

   /**
   * Get creativeGroupId
   * @return creativeGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeGroupId() {
    return creativeGroupId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupId(Long creativeGroupId) {
    this.creativeGroupId = creativeGroupId;
  }


  public DanubeCreativeGroupType creativeGroupName(String creativeGroupName) {
    
    this.creativeGroupName = creativeGroupName;
    return this;
  }

   /**
   * Get creativeGroupName
   * @return creativeGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreativeGroupName() {
    return creativeGroupName;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupName(String creativeGroupName) {
    this.creativeGroupName = creativeGroupName;
  }


  public DanubeCreativeGroupType bindingRange(List<DanubeWebPlanRangeItemType> bindingRange) {
    
    this.bindingRange = bindingRange;
    return this;
  }

  public DanubeCreativeGroupType addBindingRangeItem(DanubeWebPlanRangeItemType bindingRangeItem) {
    if (this.bindingRange == null) {
      this.bindingRange = new ArrayList<>();
    }
    this.bindingRange.add(bindingRangeItem);
    return this;
  }

   /**
   * Get bindingRange
   * @return bindingRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BINDING_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DanubeWebPlanRangeItemType> getBindingRange() {
    return bindingRange;
  }


  @JsonProperty(JSON_PROPERTY_BINDING_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindingRange(List<DanubeWebPlanRangeItemType> bindingRange) {
    this.bindingRange = bindingRange;
  }


  public DanubeCreativeGroupType materialTypes(List<Integer> materialTypes) {
    
    this.materialTypes = materialTypes;
    return this;
  }

  public DanubeCreativeGroupType addMaterialTypesItem(Integer materialTypesItem) {
    if (this.materialTypes == null) {
      this.materialTypes = new ArrayList<>();
    }
    this.materialTypes.add(materialTypesItem);
    return this;
  }

   /**
   * Get materialTypes
   * @return materialTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getMaterialTypes() {
    return materialTypes;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialTypes(List<Integer> materialTypes) {
    this.materialTypes = materialTypes;
  }


  public DanubeCreativeGroupType bindingLevel(String bindingLevel) {
    
    this.bindingLevel = bindingLevel;
    return this;
  }

   /**
   * Get bindingLevel
   * @return bindingLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BINDING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBindingLevel() {
    return bindingLevel;
  }


  @JsonProperty(JSON_PROPERTY_BINDING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindingLevel(String bindingLevel) {
    this.bindingLevel = bindingLevel;
  }


  public DanubeCreativeGroupType category(List<Long> category) {
    
    this.category = category;
    return this;
  }

  public DanubeCreativeGroupType addCategoryItem(Long categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(List<Long> category) {
    this.category = category;
  }


  public DanubeCreativeGroupType creativeComponents(DanubeCreativeComponent creativeComponents) {
    
    this.creativeComponents = creativeComponents;
    return this;
  }

   /**
   * Get creativeComponents
   * @return creativeComponents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DanubeCreativeComponent getCreativeComponents() {
    return creativeComponents;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeComponents(DanubeCreativeComponent creativeComponents) {
    this.creativeComponents = creativeComponents;
  }


  public DanubeCreativeGroupType device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(Integer device) {
    this.device = device;
  }


  public DanubeCreativeGroupType status(Integer status) {
    
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


  public DanubeCreativeGroupType pause(Boolean pause) {
    
    this.pause = pause;
    return this;
  }

   /**
   * Get pause
   * @return pause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPause() {
    return pause;
  }


  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPause(Boolean pause) {
    this.pause = pause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DanubeCreativeGroupType danubeCreativeGroupType = (DanubeCreativeGroupType) o;
    return Objects.equals(this.creativeGroupId, danubeCreativeGroupType.creativeGroupId) &&
        Objects.equals(this.creativeGroupName, danubeCreativeGroupType.creativeGroupName) &&
        Objects.equals(this.bindingRange, danubeCreativeGroupType.bindingRange) &&
        Objects.equals(this.materialTypes, danubeCreativeGroupType.materialTypes) &&
        Objects.equals(this.bindingLevel, danubeCreativeGroupType.bindingLevel) &&
        Objects.equals(this.category, danubeCreativeGroupType.category) &&
        Objects.equals(this.creativeComponents, danubeCreativeGroupType.creativeComponents) &&
        Objects.equals(this.device, danubeCreativeGroupType.device) &&
        Objects.equals(this.status, danubeCreativeGroupType.status) &&
        Objects.equals(this.pause, danubeCreativeGroupType.pause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeGroupId, creativeGroupName, bindingRange, materialTypes, bindingLevel, category, creativeComponents, device, status, pause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DanubeCreativeGroupType {\n");
    sb.append("    creativeGroupId: ").append(toIndentedString(creativeGroupId)).append("\n");
    sb.append("    creativeGroupName: ").append(toIndentedString(creativeGroupName)).append("\n");
    sb.append("    bindingRange: ").append(toIndentedString(bindingRange)).append("\n");
    sb.append("    materialTypes: ").append(toIndentedString(materialTypes)).append("\n");
    sb.append("    bindingLevel: ").append(toIndentedString(bindingLevel)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    creativeComponents: ").append(toIndentedString(creativeComponents)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
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

