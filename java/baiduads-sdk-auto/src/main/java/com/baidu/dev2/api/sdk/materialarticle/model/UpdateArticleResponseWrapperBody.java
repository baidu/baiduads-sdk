/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialarticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialarticle.model.TeslaArticleUpdateResponse;
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
 * UpdateArticleResponseWrapperBody
 */
@JsonPropertyOrder({
  UpdateArticleResponseWrapperBody.JSON_PROPERTY_DATA
})
@JsonTypeName("UpdateArticleResponseWrapperBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateArticleResponseWrapperBody {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TeslaArticleUpdateResponse> data = null;

  public UpdateArticleResponseWrapperBody() { 
  }

  public UpdateArticleResponseWrapperBody data(List<TeslaArticleUpdateResponse> data) {
    
    this.data = data;
    return this;
  }

  public UpdateArticleResponseWrapperBody addDataItem(TeslaArticleUpdateResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TeslaArticleUpdateResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TeslaArticleUpdateResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateArticleResponseWrapperBody updateArticleResponseWrapperBody = (UpdateArticleResponseWrapperBody) o;
    return Objects.equals(this.data, updateArticleResponseWrapperBody.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateArticleResponseWrapperBody {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

