/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.bmcproduct.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.bmcproduct.model.FastUpdateProductsRequestWrapper;
import com.baidu.dev2.api.sdk.bmcproduct.model.FastUpdateProductsResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BmcProductService
 */
@Ignore
public class BmcProductServiceTest {

    private final BmcProductService api = new BmcProductService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fastUpdateProductsTest() throws ApiException {
        FastUpdateProductsRequestWrapper fastUpdateProductsRequestWrapper = null;
        FastUpdateProductsResponseWrapper response = api.fastUpdateProducts(fastUpdateProductsRequestWrapper);

        // TODO: test validations
    }
}
