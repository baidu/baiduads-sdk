/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.indexapi.model;

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
 * OAuthRefreshTokenResponse
 */
@JsonPropertyOrder({
  OAuthRefreshTokenResponse.JSON_PROPERTY_ACCESS_TOKEN,
  OAuthRefreshTokenResponse.JSON_PROPERTY_ACCESS_TOKEN_EXPIRE_TIME
})
@JsonTypeName("OAuthRefreshTokenResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuthRefreshTokenResponse {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  private String accessToken;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_EXPIRE_TIME = "accessTokenExpireTime";
  private String accessTokenExpireTime;

  public OAuthRefreshTokenResponse() { 
  }

  public OAuthRefreshTokenResponse accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public OAuthRefreshTokenResponse accessTokenExpireTime(String accessTokenExpireTime) {
    
    this.accessTokenExpireTime = accessTokenExpireTime;
    return this;
  }

   /**
   * Get accessTokenExpireTime
   * @return accessTokenExpireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessTokenExpireTime() {
    return accessTokenExpireTime;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessTokenExpireTime(String accessTokenExpireTime) {
    this.accessTokenExpireTime = accessTokenExpireTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthRefreshTokenResponse oauthRefreshTokenResponse = (OAuthRefreshTokenResponse) o;
    return Objects.equals(this.accessToken, oauthRefreshTokenResponse.accessToken) &&
        Objects.equals(this.accessTokenExpireTime, oauthRefreshTokenResponse.accessTokenExpireTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accessTokenExpireTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthRefreshTokenResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpireTime: ").append(toIndentedString(accessTokenExpireTime)).append("\n");
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

