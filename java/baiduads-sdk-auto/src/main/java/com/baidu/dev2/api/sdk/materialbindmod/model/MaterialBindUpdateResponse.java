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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MaterialBindUpdateResponse
 */
@JsonPropertyOrder({
  MaterialBindUpdateResponse.JSON_PROPERTY_BIND_ID
})
@JsonTypeName("MaterialBindUpdateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialBindUpdateResponse {
  public static final String JSON_PROPERTY_BIND_ID = "bindId";
  private Long bindId;

  public MaterialBindUpdateResponse() { 
  }

  public MaterialBindUpdateResponse bindId(Long bindId) {
    
    this.bindId = bindId;
    return this;
  }

   /**
   * Get bindId
   * @return bindId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBindId() {
    return bindId;
  }


  @JsonProperty(JSON_PROPERTY_BIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindId(Long bindId) {
    this.bindId = bindId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialBindUpdateResponse materialBindUpdateResponse = (MaterialBindUpdateResponse) o;
    return Objects.equals(this.bindId, materialBindUpdateResponse.bindId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialBindUpdateResponse {\n");
    sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
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

