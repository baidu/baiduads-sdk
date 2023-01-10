/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.materialbrandmod.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.materialbrandmod.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.materialbrandmod.model.AddBrandRequestWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.AddBrandResponseWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.DeleteBrandRequestWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.DeleteBrandResponseWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.UpdateBrandRequestWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.UpdateBrandResponseWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.UpdatePutawayRequestWrapper;
import com.baidu.dev2.api.sdk.materialbrandmod.model.UpdatePutawayResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialBrandModService {
  private ApiClient apiClient;

  public MaterialBrandModService() {
    this(Configuration.getDefaultApiClient());
  }

  public MaterialBrandModService(ApiClient apiClient) {
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
   * @param addBrandRequestWrapper  (required)
   * @return AddBrandResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddBrandResponseWrapper addBrand(AddBrandRequestWrapper addBrandRequestWrapper) throws ApiException {
    Object localVarPostBody = addBrandRequestWrapper;
    
    // verify the required parameter 'addBrandRequestWrapper' is set
    if (addBrandRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addBrandRequestWrapper' when calling addBrand");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialBrandModService/addBrand";

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

    TypeReference<AddBrandResponseWrapper> localVarReturnType = new TypeReference<AddBrandResponseWrapper>() {};
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
   * @param deleteBrandRequestWrapper  (required)
   * @return DeleteBrandResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteBrandResponseWrapper deleteBrand(DeleteBrandRequestWrapper deleteBrandRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteBrandRequestWrapper;
    
    // verify the required parameter 'deleteBrandRequestWrapper' is set
    if (deleteBrandRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteBrandRequestWrapper' when calling deleteBrand");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialBrandModService/deleteBrand";

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

    TypeReference<DeleteBrandResponseWrapper> localVarReturnType = new TypeReference<DeleteBrandResponseWrapper>() {};
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
   * @param updateBrandRequestWrapper  (required)
   * @return UpdateBrandResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateBrandResponseWrapper updateBrand(UpdateBrandRequestWrapper updateBrandRequestWrapper) throws ApiException {
    Object localVarPostBody = updateBrandRequestWrapper;
    
    // verify the required parameter 'updateBrandRequestWrapper' is set
    if (updateBrandRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateBrandRequestWrapper' when calling updateBrand");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MaterialBrandModService/updateBrand";

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

    TypeReference<UpdateBrandResponseWrapper> localVarReturnType = new TypeReference<UpdateBrandResponseWrapper>() {};
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
    String localVarPath = "/json/sms/service/MaterialBrandModService/updatePutaway";

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
}
