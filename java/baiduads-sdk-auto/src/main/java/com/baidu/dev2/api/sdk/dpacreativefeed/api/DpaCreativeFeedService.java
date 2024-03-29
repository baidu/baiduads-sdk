/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.dpacreativefeed.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.dpacreativefeed.model.AddCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.AddCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.DeleteCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.DeleteCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativePreviewRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetCreativePreviewResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetSymbolFieldsRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.GetSymbolFieldsResponseWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.UpdateCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.UpdateCreativeFeedResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DpaCreativeFeedService {
  private ApiClient apiClient;

  public DpaCreativeFeedService() {
    this(Configuration.getDefaultApiClient());
  }

  public DpaCreativeFeedService(ApiClient apiClient) {
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
   * @param addCreativeFeedRequestWrapper  (required)
   * @return AddCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddCreativeFeedResponseWrapper addCreativeFeed(AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = addCreativeFeedRequestWrapper;
    
    // verify the required parameter 'addCreativeFeedRequestWrapper' is set
    if (addCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addCreativeFeedRequestWrapper' when calling addCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/addCreativeFeed";

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

    TypeReference<AddCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<AddCreativeFeedResponseWrapper>() {};
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
   * @param deleteCreativeFeedRequestWrapper  (required)
   * @return DeleteCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteCreativeFeedResponseWrapper deleteCreativeFeed(DeleteCreativeFeedRequestWrapper deleteCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteCreativeFeedRequestWrapper;
    
    // verify the required parameter 'deleteCreativeFeedRequestWrapper' is set
    if (deleteCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteCreativeFeedRequestWrapper' when calling deleteCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/deleteCreativeFeed";

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

    TypeReference<DeleteCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<DeleteCreativeFeedResponseWrapper>() {};
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
   * @param getCreativeFeedRequestWrapper  (required)
   * @return GetCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativeFeedResponseWrapper getCreativeFeed(GetCreativeFeedRequestWrapper getCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativeFeedRequestWrapper;
    
    // verify the required parameter 'getCreativeFeedRequestWrapper' is set
    if (getCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativeFeedRequestWrapper' when calling getCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/getCreativeFeed";

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

    TypeReference<GetCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<GetCreativeFeedResponseWrapper>() {};
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
   * @param getCreativePreviewRequestWrapper  (required)
   * @return GetCreativePreviewResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativePreviewResponseWrapper getCreativePreview(GetCreativePreviewRequestWrapper getCreativePreviewRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativePreviewRequestWrapper;
    
    // verify the required parameter 'getCreativePreviewRequestWrapper' is set
    if (getCreativePreviewRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativePreviewRequestWrapper' when calling getCreativePreview");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/getCreativePreview";

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

    TypeReference<GetCreativePreviewResponseWrapper> localVarReturnType = new TypeReference<GetCreativePreviewResponseWrapper>() {};
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
   * @param getSymbolFieldsRequestWrapper  (required)
   * @return GetSymbolFieldsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetSymbolFieldsResponseWrapper getSymbolFields(GetSymbolFieldsRequestWrapper getSymbolFieldsRequestWrapper) throws ApiException {
    Object localVarPostBody = getSymbolFieldsRequestWrapper;
    
    // verify the required parameter 'getSymbolFieldsRequestWrapper' is set
    if (getSymbolFieldsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getSymbolFieldsRequestWrapper' when calling getSymbolFields");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/getSymbolFields";

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

    TypeReference<GetSymbolFieldsResponseWrapper> localVarReturnType = new TypeReference<GetSymbolFieldsResponseWrapper>() {};
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
   * @param updateCreativeFeedRequestWrapper  (required)
   * @return UpdateCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateCreativeFeedResponseWrapper updateCreativeFeed(UpdateCreativeFeedRequestWrapper updateCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = updateCreativeFeedRequestWrapper;
    
    // verify the required parameter 'updateCreativeFeedRequestWrapper' is set
    if (updateCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCreativeFeedRequestWrapper' when calling updateCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/DpaCreativeFeedService/updateCreativeFeed";

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

    TypeReference<UpdateCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<UpdateCreativeFeedResponseWrapper>() {};
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
