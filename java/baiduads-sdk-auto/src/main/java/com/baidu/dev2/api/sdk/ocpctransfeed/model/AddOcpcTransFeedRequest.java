/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpctransfeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.ocpctransfeed.model.OcpcTransApiType;
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
 * AddOcpcTransFeedRequest
 */
@JsonPropertyOrder({
  AddOcpcTransFeedRequest.JSON_PROPERTY_OCPC_TRANS_FEED_TYPES
})
@JsonTypeName("AddOcpcTransFeedRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddOcpcTransFeedRequest {
  public static final String JSON_PROPERTY_OCPC_TRANS_FEED_TYPES = "ocpcTransFeedTypes";
  private List<OcpcTransApiType> ocpcTransFeedTypes = null;

  public AddOcpcTransFeedRequest() { 
  }

  public AddOcpcTransFeedRequest ocpcTransFeedTypes(List<OcpcTransApiType> ocpcTransFeedTypes) {
    
    this.ocpcTransFeedTypes = ocpcTransFeedTypes;
    return this;
  }

  public AddOcpcTransFeedRequest addOcpcTransFeedTypesItem(OcpcTransApiType ocpcTransFeedTypesItem) {
    if (this.ocpcTransFeedTypes == null) {
      this.ocpcTransFeedTypes = new ArrayList<>();
    }
    this.ocpcTransFeedTypes.add(ocpcTransFeedTypesItem);
    return this;
  }

   /**
   * Get ocpcTransFeedTypes
   * @return ocpcTransFeedTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_TRANS_FEED_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcpcTransApiType> getOcpcTransFeedTypes() {
    return ocpcTransFeedTypes;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_TRANS_FEED_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcTransFeedTypes(List<OcpcTransApiType> ocpcTransFeedTypes) {
    this.ocpcTransFeedTypes = ocpcTransFeedTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOcpcTransFeedRequest addOcpcTransFeedRequest = (AddOcpcTransFeedRequest) o;
    return Objects.equals(this.ocpcTransFeedTypes, addOcpcTransFeedRequest.ocpcTransFeedTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ocpcTransFeedTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOcpcTransFeedRequest {\n");
    sb.append("    ocpcTransFeedTypes: ").append(toIndentedString(ocpcTransFeedTypes)).append("\n");
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

