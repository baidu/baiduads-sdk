/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.materialpersonmod.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.materialpersonmod.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.materialpersonmod.model.AddPersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.AddPersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.DeletePersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.DeletePersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateCategoryRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateCategoryResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePutawayRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePutawayResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateRankRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateRankResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialPersonModService {
  private ApiClient apiClient;

  public MaterialPersonModService() {
    this(Configuration.getDefaultApiClient());
  }

  public MaterialPersonModService(ApiClient apiClient) {
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
   * @param addPersonRequestWrapper  (required)
   * @return AddPersonResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddPersonResponseWrapper addPerson(AddPersonRequestWrapper addPersonRequestWrapper) throws ApiException {
    Object localVarPostBody = addPersonRequestWrapper;
    
    // verify the required parameter 'addPersonRequestWrapper' is set
    if (addPersonRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addPersonRequestWrapper' when calling addPerson");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/addPerson";

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

    TypeReference<AddPersonResponseWrapper> localVarReturnType = new TypeReference<AddPersonResponseWrapper>() {};
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
   * @param deletePersonRequestWrapper  (required)
   * @return DeletePersonResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeletePersonResponseWrapper deletePerson(DeletePersonRequestWrapper deletePersonRequestWrapper) throws ApiException {
    Object localVarPostBody = deletePersonRequestWrapper;
    
    // verify the required parameter 'deletePersonRequestWrapper' is set
    if (deletePersonRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deletePersonRequestWrapper' when calling deletePerson");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/deletePerson";

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

    TypeReference<DeletePersonResponseWrapper> localVarReturnType = new TypeReference<DeletePersonResponseWrapper>() {};
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
   * @param updateCategoryRequestWrapper  (required)
   * @return UpdateCategoryResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateCategoryResponseWrapper updateCategory(UpdateCategoryRequestWrapper updateCategoryRequestWrapper) throws ApiException {
    Object localVarPostBody = updateCategoryRequestWrapper;
    
    // verify the required parameter 'updateCategoryRequestWrapper' is set
    if (updateCategoryRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCategoryRequestWrapper' when calling updateCategory");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/updateCategory";

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

    TypeReference<UpdateCategoryResponseWrapper> localVarReturnType = new TypeReference<UpdateCategoryResponseWrapper>() {};
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
   * @param updatePersonRequestWrapper  (required)
   * @return UpdatePersonResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdatePersonResponseWrapper updatePerson(UpdatePersonRequestWrapper updatePersonRequestWrapper) throws ApiException {
    Object localVarPostBody = updatePersonRequestWrapper;
    
    // verify the required parameter 'updatePersonRequestWrapper' is set
    if (updatePersonRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePersonRequestWrapper' when calling updatePerson");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/updatePerson";

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

    TypeReference<UpdatePersonResponseWrapper> localVarReturnType = new TypeReference<UpdatePersonResponseWrapper>() {};
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
   * @param updatePutawayRequestWrapper  (required)
   * @return UpdatePutawayResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdatePutawayResponseWrapper updatePutaway(UpdatePutawayRequestWrapper updatePutawayRequestWrapper) throws ApiException {
    Object localVarPostBody = updatePutawayRequestWrapper;
    
    // verify the required parameter 'updatePutawayRequestWrapper' is set
    if (updatePutawayRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePutawayRequestWrapper' when calling updatePutaway");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/updatePutaway";

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

    TypeReference<UpdatePutawayResponseWrapper> localVarReturnType = new TypeReference<UpdatePutawayResponseWrapper>() {};
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
   * @param updateRankRequestWrapper  (required)
   * @return UpdateRankResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateRankResponseWrapper updateRank(UpdateRankRequestWrapper updateRankRequestWrapper) throws ApiException {
    Object localVarPostBody = updateRankRequestWrapper;
    
    // verify the required parameter 'updateRankRequestWrapper' is set
    if (updateRankRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRankRequestWrapper' when calling updateRank");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialPersonModService/updateRank";

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

    TypeReference<UpdateRankResponseWrapper> localVarReturnType = new TypeReference<UpdateRankResponseWrapper>() {};
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