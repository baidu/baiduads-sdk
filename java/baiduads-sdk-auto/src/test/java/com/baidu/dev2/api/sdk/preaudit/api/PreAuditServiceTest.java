/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.preaudit.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.preaudit.model.MaterialPreAuditRequestWrapper;
import com.baidu.dev2.api.sdk.preaudit.model.MaterialPreAuditResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PreAuditService
 */
@Ignore
public class PreAuditServiceTest {

    private final PreAuditService api = new PreAuditService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void materialPreAuditTest() throws ApiException {
        MaterialPreAuditRequestWrapper materialPreAuditRequestWrapper = null;
        MaterialPreAuditResponseWrapper response = api.materialPreAudit(materialPreAuditRequestWrapper);

        // TODO: test validations
    }
}
