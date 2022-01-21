package com.baidu.dev2.api.sdk.manual.oauth.api;

import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Pair;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetAccessTokenRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetAccessTokenResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetOpenIdRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetOpenIdResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetUserInfoRequset;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetUserInfoResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.RefreshTokenRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.RefreshTokenResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OAuthService {
    private static final String OAUTH_HOST_NAME = "https://u.baidu.com";

    private ApiClient apiClient;

    public OAuthService() {
        this.apiClient = new ApiClient();
        apiClient.setBasePath(OAUTH_HOST_NAME);
        apiClient.setServerIndex(null);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public GetAccessTokenResponse getAccessToken(GetAccessTokenRequest request) throws ApiException {
        Object localVarPostBody = request;

        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling getAccessToken");
        }
        String localVarPath = "/oauth/accessToken";

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

        String[] localVarAuthNames = new String[]{};

        TypeReference<GetAccessTokenResponse> localVarReturnType = new TypeReference<GetAccessTokenResponse>() {
        };
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

    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) throws ApiException {
        Object localVarPostBody = request;

        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling refreshToken");
        }
        String localVarPath = "/oauth/refreshToken";

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

        String[] localVarAuthNames = new String[]{};

        TypeReference<RefreshTokenResponse> localVarReturnType = new TypeReference<RefreshTokenResponse>() {
        };
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

    public GetUserInfoResponse getUserInfo(GetUserInfoRequset request) throws ApiException {
        Object localVarPostBody = request;

        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling getUserInfo");
        }
        String localVarPath = "/oauth/getUserInfo";

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

        String[] localVarAuthNames = new String[]{};

        TypeReference<GetUserInfoResponse> localVarReturnType = new TypeReference<GetUserInfoResponse>() {
        };
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

    public GetOpenIdResponse getOpenId(GetOpenIdRequest request) throws ApiException {
        Object localVarPostBody = request;

        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling getOpenId");
        }
        String localVarPath = "/oauth/getOpenId";

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

        String[] localVarAuthNames = new String[]{};

        TypeReference<GetOpenIdResponse> localVarReturnType = new TypeReference<GetOpenIdResponse>() {
        };
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
