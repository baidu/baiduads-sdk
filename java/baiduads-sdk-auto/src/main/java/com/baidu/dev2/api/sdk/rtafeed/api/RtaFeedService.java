/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.rtafeed.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.rtafeed.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.rtafeed.model.AddRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.AddRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelStrategyResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetConfigurableUsersRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetConfigurableUsersResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaTokenRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaTokenResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetStrategyResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateStrategyResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RtaFeedService {
  private ApiClient apiClient;

  public RtaFeedService() {
    this(Configuration.getDefaultApiClient());
  }

  public RtaFeedService(ApiClient apiClient) {
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
   * @param addRtaSettingRequestWrapper  (required)
   * @return AddRtaSettingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddRtaSettingResponseWrapper addRtaSetting(AddRtaSettingRequestWrapper addRtaSettingRequestWrapper) throws ApiException {
    Object localVarPostBody = addRtaSettingRequestWrapper;
    
    // verify the required parameter 'addRtaSettingRequestWrapper' is set
    if (addRtaSettingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addRtaSettingRequestWrapper' when calling addRtaSetting");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/addRtaSetting";

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

    TypeReference<AddRtaSettingResponseWrapper> localVarReturnType = new TypeReference<AddRtaSettingResponseWrapper>() {};
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
   * @param delRtaSettingRequestWrapper  (required)
   * @return DelRtaSettingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DelRtaSettingResponseWrapper delRtaSetting(DelRtaSettingRequestWrapper delRtaSettingRequestWrapper) throws ApiException {
    Object localVarPostBody = delRtaSettingRequestWrapper;
    
    // verify the required parameter 'delRtaSettingRequestWrapper' is set
    if (delRtaSettingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'delRtaSettingRequestWrapper' when calling delRtaSetting");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/delRtaSetting";

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

    TypeReference<DelRtaSettingResponseWrapper> localVarReturnType = new TypeReference<DelRtaSettingResponseWrapper>() {};
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
   * @param delStrategyRequestWrapper  (required)
   * @return DelStrategyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DelStrategyResponseWrapper delStrategy(DelStrategyRequestWrapper delStrategyRequestWrapper) throws ApiException {
    Object localVarPostBody = delStrategyRequestWrapper;
    
    // verify the required parameter 'delStrategyRequestWrapper' is set
    if (delStrategyRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'delStrategyRequestWrapper' when calling delStrategy");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/delStrategy";

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

    TypeReference<DelStrategyResponseWrapper> localVarReturnType = new TypeReference<DelStrategyResponseWrapper>() {};
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
   * @param getConfigurableUsersRequestWrapper  (required)
   * @return GetConfigurableUsersResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetConfigurableUsersResponseWrapper getConfigurableUsers(GetConfigurableUsersRequestWrapper getConfigurableUsersRequestWrapper) throws ApiException {
    Object localVarPostBody = getConfigurableUsersRequestWrapper;
    
    // verify the required parameter 'getConfigurableUsersRequestWrapper' is set
    if (getConfigurableUsersRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getConfigurableUsersRequestWrapper' when calling getConfigurableUsers");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/getConfigurableUsers";

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

    TypeReference<GetConfigurableUsersResponseWrapper> localVarReturnType = new TypeReference<GetConfigurableUsersResponseWrapper>() {};
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
   * @param getRtaSettingRequestWrapper  (required)
   * @return GetRtaSettingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetRtaSettingResponseWrapper getRtaSetting(GetRtaSettingRequestWrapper getRtaSettingRequestWrapper) throws ApiException {
    Object localVarPostBody = getRtaSettingRequestWrapper;
    
    // verify the required parameter 'getRtaSettingRequestWrapper' is set
    if (getRtaSettingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getRtaSettingRequestWrapper' when calling getRtaSetting");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/getRtaSetting";

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

    TypeReference<GetRtaSettingResponseWrapper> localVarReturnType = new TypeReference<GetRtaSettingResponseWrapper>() {};
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
   * @param getRtaTokenRequestWrapper  (required)
   * @return GetRtaTokenResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetRtaTokenResponseWrapper getRtaToken(GetRtaTokenRequestWrapper getRtaTokenRequestWrapper) throws ApiException {
    Object localVarPostBody = getRtaTokenRequestWrapper;
    
    // verify the required parameter 'getRtaTokenRequestWrapper' is set
    if (getRtaTokenRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getRtaTokenRequestWrapper' when calling getRtaToken");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/getRtaToken";

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

    TypeReference<GetRtaTokenResponseWrapper> localVarReturnType = new TypeReference<GetRtaTokenResponseWrapper>() {};
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
   * @param getStrategyRequestWrapper  (required)
   * @return GetStrategyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetStrategyResponseWrapper getStrategy(GetStrategyRequestWrapper getStrategyRequestWrapper) throws ApiException {
    Object localVarPostBody = getStrategyRequestWrapper;
    
    // verify the required parameter 'getStrategyRequestWrapper' is set
    if (getStrategyRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getStrategyRequestWrapper' when calling getStrategy");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/getStrategy";

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

    TypeReference<GetStrategyResponseWrapper> localVarReturnType = new TypeReference<GetStrategyResponseWrapper>() {};
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
   * @param updateRtaSettingRequestWrapper  (required)
   * @return UpdateRtaSettingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateRtaSettingResponseWrapper updateRtaSetting(UpdateRtaSettingRequestWrapper updateRtaSettingRequestWrapper) throws ApiException {
    Object localVarPostBody = updateRtaSettingRequestWrapper;
    
    // verify the required parameter 'updateRtaSettingRequestWrapper' is set
    if (updateRtaSettingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRtaSettingRequestWrapper' when calling updateRtaSetting");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/updateRtaSetting";

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

    TypeReference<UpdateRtaSettingResponseWrapper> localVarReturnType = new TypeReference<UpdateRtaSettingResponseWrapper>() {};
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
   * @param updateStrategyRequestWrapper  (required)
   * @return UpdateStrategyResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateStrategyResponseWrapper updateStrategy(UpdateStrategyRequestWrapper updateStrategyRequestWrapper) throws ApiException {
    Object localVarPostBody = updateStrategyRequestWrapper;
    
    // verify the required parameter 'updateStrategyRequestWrapper' is set
    if (updateStrategyRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateStrategyRequestWrapper' when calling updateStrategy");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/RtaFeedService/updateStrategy";

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

    TypeReference<UpdateStrategyResponseWrapper> localVarReturnType = new TypeReference<UpdateStrategyResponseWrapper>() {};
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
