/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.oauthauthorizedtoolapi.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.oauthauthorizedtoolapi.model.GetAuthCodeRequestWrapper;
import com.baidu.dev2.api.sdk.oauthauthorizedtoolapi.model.GetAuthCodeResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthAuthorizedToolApi
 */
@Ignore
public class OAuthAuthorizedToolApiTest {

    private final OAuthAuthorizedToolApi api = new OAuthAuthorizedToolApi();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthCodeTest() throws ApiException {
        GetAuthCodeRequestWrapper getAuthCodeRequestWrapper = null;
        GetAuthCodeResponseWrapper response = api.getAuthCode(getAuthCodeRequestWrapper);

        // TODO: test validations
    }
}
