/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.assetsharefeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.assetsharefeed.model.AddAssetShareFeedRequestWrapper;
import com.baidu.dev2.api.sdk.assetsharefeed.model.AddAssetShareFeedResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetShareFeedService
 */
@Ignore
public class AssetShareFeedServiceTest {

    private final AssetShareFeedService api = new AssetShareFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAssetShareFeedTest() throws ApiException {
        AddAssetShareFeedRequestWrapper addAssetShareFeedRequestWrapper = null;
        AddAssetShareFeedResponseWrapper response = api.addAssetShareFeed(addAssetShareFeedRequestWrapper);

        // TODO: test validations
    }
}
