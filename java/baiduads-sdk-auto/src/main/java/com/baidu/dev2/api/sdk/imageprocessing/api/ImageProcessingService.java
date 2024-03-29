/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.imageprocessing.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.imageprocessing.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.imageprocessing.model.AddCropImageRequestWrapper;
import com.baidu.dev2.api.sdk.imageprocessing.model.AddCropImageResponseWrapper;
import com.baidu.dev2.api.sdk.imageprocessing.model.GetDefaultVideoCoverFeedRequestWrapper;
import com.baidu.dev2.api.sdk.imageprocessing.model.GetDefaultVideoCoverFeedResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageProcessingService {
  private ApiClient apiClient;

  public ImageProcessingService() {
    this(Configuration.getDefaultApiClient());
  }

  public ImageProcessingService(ApiClient apiClient) {
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
   * @param addCropImageRequestWrapper  (required)
   * @return AddCropImageResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddCropImageResponseWrapper addCropImage(AddCropImageRequestWrapper addCropImageRequestWrapper) throws ApiException {
    Object localVarPostBody = addCropImageRequestWrapper;
    
    // verify the required parameter 'addCropImageRequestWrapper' is set
    if (addCropImageRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addCropImageRequestWrapper' when calling addCropImage");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/ImageProcessingService/addCropImage";

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

    TypeReference<AddCropImageResponseWrapper> localVarReturnType = new TypeReference<AddCropImageResponseWrapper>() {};
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
   * @param getDefaultVideoCoverFeedRequestWrapper  (required)
   * @return GetDefaultVideoCoverFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetDefaultVideoCoverFeedResponseWrapper getDefaultVideoCoverFeed(GetDefaultVideoCoverFeedRequestWrapper getDefaultVideoCoverFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = getDefaultVideoCoverFeedRequestWrapper;
    
    // verify the required parameter 'getDefaultVideoCoverFeedRequestWrapper' is set
    if (getDefaultVideoCoverFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getDefaultVideoCoverFeedRequestWrapper' when calling getDefaultVideoCoverFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/ImageProcessingService/getDefaultVideoCoverFeed";

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

    TypeReference<GetDefaultVideoCoverFeedResponseWrapper> localVarReturnType = new TypeReference<GetDefaultVideoCoverFeedResponseWrapper>() {};
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
