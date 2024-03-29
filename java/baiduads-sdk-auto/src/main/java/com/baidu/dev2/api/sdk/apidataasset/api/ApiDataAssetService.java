/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.apidataasset.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.apidataasset.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.apidataasset.model.CreateDataAssetRequestWrapper;
import com.baidu.dev2.api.sdk.apidataasset.model.CreateDataAssetResponseWrapper;
import com.baidu.dev2.api.sdk.apidataasset.model.SubmitDataAssetTaskRequestWrapper;
import com.baidu.dev2.api.sdk.apidataasset.model.SubmitDataAssetTaskResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiDataAssetService {
  private ApiClient apiClient;

  public ApiDataAssetService() {
    this(Configuration.getDefaultApiClient());
  }

  public ApiDataAssetService(ApiClient apiClient) {
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
   * @param createDataAssetRequestWrapper  (required)
   * @return CreateDataAssetResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CreateDataAssetResponseWrapper createDataAsset(CreateDataAssetRequestWrapper createDataAssetRequestWrapper) throws ApiException {
    Object localVarPostBody = createDataAssetRequestWrapper;
    
    // verify the required parameter 'createDataAssetRequestWrapper' is set
    if (createDataAssetRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'createDataAssetRequestWrapper' when calling createDataAsset");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ApiDataAssetService/createDataAsset";

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

    TypeReference<CreateDataAssetResponseWrapper> localVarReturnType = new TypeReference<CreateDataAssetResponseWrapper>() {};
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
   * @param submitDataAssetTaskRequestWrapper  (required)
   * @return SubmitDataAssetTaskResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public SubmitDataAssetTaskResponseWrapper submitDataAssetTask(SubmitDataAssetTaskRequestWrapper submitDataAssetTaskRequestWrapper) throws ApiException {
    Object localVarPostBody = submitDataAssetTaskRequestWrapper;
    
    // verify the required parameter 'submitDataAssetTaskRequestWrapper' is set
    if (submitDataAssetTaskRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'submitDataAssetTaskRequestWrapper' when calling submitDataAssetTask");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ApiDataAssetService/submitDataAssetTask";

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

    TypeReference<SubmitDataAssetTaskResponseWrapper> localVarReturnType = new TypeReference<SubmitDataAssetTaskResponseWrapper>() {};
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
