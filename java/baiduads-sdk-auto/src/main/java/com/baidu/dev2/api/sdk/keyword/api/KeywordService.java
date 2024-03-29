/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.keyword.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.keyword.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.keyword.model.AddWordRequestWrapper;
import com.baidu.dev2.api.sdk.keyword.model.AddWordResponseWrapper;
import com.baidu.dev2.api.sdk.keyword.model.DeleteWordRequestWrapper;
import com.baidu.dev2.api.sdk.keyword.model.DeleteWordResponseWrapper;
import com.baidu.dev2.api.sdk.keyword.model.GetWordRequestWrapper;
import com.baidu.dev2.api.sdk.keyword.model.GetWordResponseWrapper;
import com.baidu.dev2.api.sdk.keyword.model.UpdateWordRequestWrapper;
import com.baidu.dev2.api.sdk.keyword.model.UpdateWordResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordService {
  private ApiClient apiClient;

  public KeywordService() {
    this(Configuration.getDefaultApiClient());
  }

  public KeywordService(ApiClient apiClient) {
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
   * @param addWordRequestWrapper  (required)
   * @return AddWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddWordResponseWrapper addWord(AddWordRequestWrapper addWordRequestWrapper) throws ApiException {
    Object localVarPostBody = addWordRequestWrapper;
    
    // verify the required parameter 'addWordRequestWrapper' is set
    if (addWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addWordRequestWrapper' when calling addWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KeywordService/addWord";

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

    TypeReference<AddWordResponseWrapper> localVarReturnType = new TypeReference<AddWordResponseWrapper>() {};
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
   * @param deleteWordRequestWrapper  (required)
   * @return DeleteWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteWordResponseWrapper deleteWord(DeleteWordRequestWrapper deleteWordRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteWordRequestWrapper;
    
    // verify the required parameter 'deleteWordRequestWrapper' is set
    if (deleteWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteWordRequestWrapper' when calling deleteWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KeywordService/deleteWord";

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

    TypeReference<DeleteWordResponseWrapper> localVarReturnType = new TypeReference<DeleteWordResponseWrapper>() {};
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
   * @param getWordRequestWrapper  (required)
   * @return GetWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetWordResponseWrapper getWord(GetWordRequestWrapper getWordRequestWrapper) throws ApiException {
    Object localVarPostBody = getWordRequestWrapper;
    
    // verify the required parameter 'getWordRequestWrapper' is set
    if (getWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getWordRequestWrapper' when calling getWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KeywordService/getWord";

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

    TypeReference<GetWordResponseWrapper> localVarReturnType = new TypeReference<GetWordResponseWrapper>() {};
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
   * @param updateWordRequestWrapper  (required)
   * @return UpdateWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateWordResponseWrapper updateWord(UpdateWordRequestWrapper updateWordRequestWrapper) throws ApiException {
    Object localVarPostBody = updateWordRequestWrapper;
    
    // verify the required parameter 'updateWordRequestWrapper' is set
    if (updateWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateWordRequestWrapper' when calling updateWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KeywordService/updateWord";

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

    TypeReference<UpdateWordResponseWrapper> localVarReturnType = new TypeReference<UpdateWordResponseWrapper>() {};
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
