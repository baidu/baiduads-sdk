/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.mccfeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.mccfeed.model.GetUserListByMccidRequestWrapper;
import com.baidu.dev2.api.sdk.mccfeed.model.GetUserListByMccidResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MccFeedService
 */
@Ignore
public class MccFeedServiceTest {

    private final MccFeedService api = new MccFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserListByMccidTest() throws ApiException {
        GetUserListByMccidRequestWrapper getUserListByMccidRequestWrapper = null;
        GetUserListByMccidResponseWrapper response = api.getUserListByMccid(getUserListByMccidRequestWrapper);

        // TODO: test validations
    }
}