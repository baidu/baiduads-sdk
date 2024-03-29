/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialpersonmod.model;

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
 * PersonExtDto
 */
@JsonPropertyOrder({
  PersonExtDto.JSON_PROPERTY_REPRESENT_WORK,
  PersonExtDto.JSON_PROPERTY_DESIGN_CONCEPT,
  PersonExtDto.JSON_PROPERTY_CONSTRUCTION_EXPERIENCE,
  PersonExtDto.JSON_PROPERTY_PRAC_HOSPITAL,
  PersonExtDto.JSON_PROPERTY_DEPARTMENT
})
@JsonTypeName("PersonExtDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PersonExtDto {
  public static final String JSON_PROPERTY_REPRESENT_WORK = "representWork";
  private String representWork;

  public static final String JSON_PROPERTY_DESIGN_CONCEPT = "designConcept";
  private String designConcept;

  public static final String JSON_PROPERTY_CONSTRUCTION_EXPERIENCE = "constructionExperience";
  private String constructionExperience;

  public static final String JSON_PROPERTY_PRAC_HOSPITAL = "pracHospital";
  private String pracHospital;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public PersonExtDto() { 
  }

  public PersonExtDto representWork(String representWork) {
    
    this.representWork = representWork;
    return this;
  }

   /**
   * Get representWork
   * @return representWork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPRESENT_WORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepresentWork() {
    return representWork;
  }


  @JsonProperty(JSON_PROPERTY_REPRESENT_WORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepresentWork(String representWork) {
    this.representWork = representWork;
  }


  public PersonExtDto designConcept(String designConcept) {
    
    this.designConcept = designConcept;
    return this;
  }

   /**
   * Get designConcept
   * @return designConcept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESIGN_CONCEPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesignConcept() {
    return designConcept;
  }


  @JsonProperty(JSON_PROPERTY_DESIGN_CONCEPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesignConcept(String designConcept) {
    this.designConcept = designConcept;
  }


  public PersonExtDto constructionExperience(String constructionExperience) {
    
    this.constructionExperience = constructionExperience;
    return this;
  }

   /**
   * Get constructionExperience
   * @return constructionExperience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConstructionExperience() {
    return constructionExperience;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructionExperience(String constructionExperience) {
    this.constructionExperience = constructionExperience;
  }


  public PersonExtDto pracHospital(String pracHospital) {
    
    this.pracHospital = pracHospital;
    return this;
  }

   /**
   * Get pracHospital
   * @return pracHospital
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRAC_HOSPITAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPracHospital() {
    return pracHospital;
  }


  @JsonProperty(JSON_PROPERTY_PRAC_HOSPITAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPracHospital(String pracHospital) {
    this.pracHospital = pracHospital;
  }


  public PersonExtDto department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepartment(String department) {
    this.department = department;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonExtDto personExtDto = (PersonExtDto) o;
    return Objects.equals(this.representWork, personExtDto.representWork) &&
        Objects.equals(this.designConcept, personExtDto.designConcept) &&
        Objects.equals(this.constructionExperience, personExtDto.constructionExperience) &&
        Objects.equals(this.pracHospital, personExtDto.pracHospital) &&
        Objects.equals(this.department, personExtDto.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(representWork, designConcept, constructionExperience, pracHospital, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonExtDto {\n");
    sb.append("    representWork: ").append(toIndentedString(representWork)).append("\n");
    sb.append("    designConcept: ").append(toIndentedString(designConcept)).append("\n");
    sb.append("    constructionExperience: ").append(toIndentedString(constructionExperience)).append("\n");
    sb.append("    pracHospital: ").append(toIndentedString(pracHospital)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

