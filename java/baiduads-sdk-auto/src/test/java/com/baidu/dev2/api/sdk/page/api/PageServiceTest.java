/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.page.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.page.model.GetBroadCastPagesRequestWrapper;
import com.baidu.dev2.api.sdk.page.model.GetBroadCastPagesResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PageService
 */
@Ignore
public class PageServiceTest {

    private final PageService api = new PageService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBroadCastPagesTest() throws ApiException {
        GetBroadCastPagesRequestWrapper getBroadCastPagesRequestWrapper = null;
        GetBroadCastPagesResponseWrapper response = api.getBroadCastPages(getBroadCastPagesRequestWrapper);

        // TODO: test validations
    }
}
