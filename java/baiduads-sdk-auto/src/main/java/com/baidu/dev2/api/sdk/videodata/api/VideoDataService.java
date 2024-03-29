/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.videodata.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.videodata.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.videodata.model.GetLabelDataRequestWrapper;
import com.baidu.dev2.api.sdk.videodata.model.GetLabelDataResponseWrapper;
import com.baidu.dev2.api.sdk.videodata.model.GetSecondLevelDataRequestWrapper;
import com.baidu.dev2.api.sdk.videodata.model.GetSecondLevelDataResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoDataService {
  private ApiClient apiClient;

  public VideoDataService() {
    this(Configuration.getDefaultApiClient());
  }

  public VideoDataService(ApiClient apiClient) {
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
   * @param getLabelDataRequestWrapper  (required)
   * @return GetLabelDataResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetLabelDataResponseWrapper getLabelData(GetLabelDataRequestWrapper getLabelDataRequestWrapper) throws ApiException {
    Object localVarPostBody = getLabelDataRequestWrapper;
    
    // verify the required parameter 'getLabelDataRequestWrapper' is set
    if (getLabelDataRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getLabelDataRequestWrapper' when calling getLabelData");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/VideoDataService/getLabelData";

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

    TypeReference<GetLabelDataResponseWrapper> localVarReturnType = new TypeReference<GetLabelDataResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getSecondLevelDataRequestWrapper  (required)
   * @return GetSecondLevelDataResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetSecondLevelDataResponseWrapper getSecondLevelData(GetSecondLevelDataRequestWrapper getSecondLevelDataRequestWrapper) throws ApiException {
    Object localVarPostBody = getSecondLevelDataRequestWrapper;
    
    // verify the required parameter 'getSecondLevelDataRequestWrapper' is set
    if (getSecondLevelDataRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getSecondLevelDataRequestWrapper' when calling getSecondLevelData");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/VideoDataService/getSecondLevelData";

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

    TypeReference<GetSecondLevelDataResponseWrapper> localVarReturnType = new TypeReference<GetSecondLevelDataResponseWrapper>() {};
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
