/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.accountfeed.model;

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
 * GetAccountFeedRequest
 */
@JsonPropertyOrder({
  GetAccountFeedRequest.JSON_PROPERTY_ACCOUNT_FEED_FIELDS
})
@JsonTypeName("GetAccountFeedRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAccountFeedRequest {
  public static final String JSON_PROPERTY_ACCOUNT_FEED_FIELDS = "accountFeedFields";
  private List<String> accountFeedFields = null;

  public GetAccountFeedRequest() { 
  }

  public GetAccountFeedRequest accountFeedFields(List<String> accountFeedFields) {
    
    this.accountFeedFields = accountFeedFields;
    return this;
  }

  public GetAccountFeedRequest addAccountFeedFieldsItem(String accountFeedFieldsItem) {
    if (this.accountFeedFields == null) {
      this.accountFeedFields = new ArrayList<>();
    }
    this.accountFeedFields.add(accountFeedFieldsItem);
    return this;
  }

   /**
   * Get accountFeedFields
   * @return accountFeedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_FEED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountFeedFields() {
    return accountFeedFields;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_FEED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountFeedFields(List<String> accountFeedFields) {
    this.accountFeedFields = accountFeedFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountFeedRequest getAccountFeedRequest = (GetAccountFeedRequest) o;
    return Objects.equals(this.accountFeedFields, getAccountFeedRequest.accountFeedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountFeedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountFeedRequest {\n");
    sb.append("    accountFeedFields: ").append(toIndentedString(accountFeedFields)).append("\n");
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

