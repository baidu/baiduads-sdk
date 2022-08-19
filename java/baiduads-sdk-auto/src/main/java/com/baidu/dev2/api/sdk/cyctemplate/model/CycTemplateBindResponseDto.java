/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.cyctemplate.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.cyctemplate.model.CycTemplateType;
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
 * CycTemplateBindResponseDto
 */
@JsonPropertyOrder({
  CycTemplateBindResponseDto.JSON_PROPERTY_CURRENT_TEMPLATE,
  CycTemplateBindResponseDto.JSON_PROPERTY_TEMPLATES,
  CycTemplateBindResponseDto.JSON_PROPERTY_TOTAL_COUNT
})
@JsonTypeName("CycTemplateBindResponseDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CycTemplateBindResponseDto {
  public static final String JSON_PROPERTY_CURRENT_TEMPLATE = "currentTemplate";
  private CycTemplateType currentTemplate;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<CycTemplateType> templates = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public CycTemplateBindResponseDto() { 
  }

  public CycTemplateBindResponseDto currentTemplate(CycTemplateType currentTemplate) {
    
    this.currentTemplate = currentTemplate;
    return this;
  }

   /**
   * Get currentTemplate
   * @return currentTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CycTemplateType getCurrentTemplate() {
    return currentTemplate;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentTemplate(CycTemplateType currentTemplate) {
    this.currentTemplate = currentTemplate;
  }


  public CycTemplateBindResponseDto templates(List<CycTemplateType> templates) {
    
    this.templates = templates;
    return this;
  }

  public CycTemplateBindResponseDto addTemplatesItem(CycTemplateType templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CycTemplateType> getTemplates() {
    return templates;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplates(List<CycTemplateType> templates) {
    this.templates = templates;
  }


  public CycTemplateBindResponseDto totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycTemplateBindResponseDto cycTemplateBindResponseDto = (CycTemplateBindResponseDto) o;
    return Objects.equals(this.currentTemplate, cycTemplateBindResponseDto.currentTemplate) &&
        Objects.equals(this.templates, cycTemplateBindResponseDto.templates) &&
        Objects.equals(this.totalCount, cycTemplateBindResponseDto.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTemplate, templates, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycTemplateBindResponseDto {\n");
    sb.append("    currentTemplate: ").append(toIndentedString(currentTemplate)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
