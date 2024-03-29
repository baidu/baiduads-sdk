/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.crowdappinfo.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.crowdappinfo.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.crowdappinfo.model.GetAppInfoRequestWrapper;
import com.baidu.dev2.api.sdk.crowdappinfo.model.GetAppInfoResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdAppInfoService {
  private ApiClient apiClient;

  public CrowdAppInfoService() {
    this(Configuration.getDefaultApiClient());
  }

  public CrowdAppInfoService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param getAppInfoRequestWrapper  (required)
   * @return GetAppInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetAppInfoResponseWrapper getAppInfo(GetAppInfoRequestWrapper getAppInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = getAppInfoRequestWrapper;
    
    // verify the required parameter 'getAppInfoRequestWrapper' is set
    if (getAppInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getAppInfoRequestWrapper' when calling getAppInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/CrowdAppInfoService/getAppInfo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetAppInfoResponseWrapper> localVarReturnType = new TypeReference<GetAppInfoResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
