/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.traceapi.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.traceapi.model.UpdateTransTraceRequestWrapper;
import com.baidu.dev2.api.sdk.traceapi.model.UpdateTransTraceResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TraceApiService
 */
@Ignore
public class TraceApiServiceTest {

    private final TraceApiService api = new TraceApiService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransTraceTest() throws ApiException {
        UpdateTransTraceRequestWrapper updateTransTraceRequestWrapper = null;
        UpdateTransTraceResponseWrapper response = api.updateTransTrace(updateTransTraceRequestWrapper);

        // TODO: test validations
    }
}
