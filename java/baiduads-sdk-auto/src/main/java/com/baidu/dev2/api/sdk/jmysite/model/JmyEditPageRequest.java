/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.jmysite.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.jmysite.model.JmyEditPageType;
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
 * JmyEditPageRequest
 */
@JsonPropertyOrder({
  JmyEditPageRequest.JSON_PROPERTY_LIST
})
@JsonTypeName("JmyEditPageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JmyEditPageRequest {
  public static final String JSON_PROPERTY_LIST = "list";
  private List<JmyEditPageType> list = null;

  public JmyEditPageRequest() { 
  }

  public JmyEditPageRequest list(List<JmyEditPageType> list) {
    
    this.list = list;
    return this;
  }

  public JmyEditPageRequest addListItem(JmyEditPageType listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<JmyEditPageType> getList() {
    return list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setList(List<JmyEditPageType> list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JmyEditPageRequest jmyEditPageRequest = (JmyEditPageRequest) o;
    return Objects.equals(this.list, jmyEditPageRequest.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JmyEditPageRequest {\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

