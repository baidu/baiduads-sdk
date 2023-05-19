/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.crowdshopping.model;

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
 * EshopCrowdType
 */
@JsonPropertyOrder({
  EshopCrowdType.JSON_PROPERTY_ID,
  EshopCrowdType.JSON_PROPERTY_NAME,
  EshopCrowdType.JSON_PROPERTY_GROUP_COUNT,
  EshopCrowdType.JSON_PROPERTY_CHILDREN
})
@JsonTypeName("EshopCrowdType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EshopCrowdType {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_GROUP_COUNT = "groupCount";
  private Long groupCount;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<EshopCrowdType> children = null;

  public EshopCrowdType() { 
  }

  public EshopCrowdType id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public EshopCrowdType name(String name) {
    
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


  public EshopCrowdType groupCount(Long groupCount) {
    
    this.groupCount = groupCount;
    return this;
  }

   /**
   * Get groupCount
   * @return groupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGroupCount() {
    return groupCount;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupCount(Long groupCount) {
    this.groupCount = groupCount;
  }


  public EshopCrowdType children(List<EshopCrowdType> children) {
    
    this.children = children;
    return this;
  }

  public EshopCrowdType addChildrenItem(EshopCrowdType childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EshopCrowdType> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<EshopCrowdType> children) {
    this.children = children;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EshopCrowdType eshopCrowdType = (EshopCrowdType) o;
    return Objects.equals(this.id, eshopCrowdType.id) &&
        Objects.equals(this.name, eshopCrowdType.name) &&
        Objects.equals(this.groupCount, eshopCrowdType.groupCount) &&
        Objects.equals(this.children, eshopCrowdType.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, groupCount, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EshopCrowdType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

