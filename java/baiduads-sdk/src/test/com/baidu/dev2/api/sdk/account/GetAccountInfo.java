package com.baidu.dev2.api.sdk.account;

import com.baidu.dev2.api.sdk.account.api.AccountService;
import com.baidu.dev2.api.sdk.account.model.ApiAccountQueryRequest;
import com.baidu.dev2.api.sdk.account.model.GetAccountInfoRequestWrapper;
import com.baidu.dev2.api.sdk.account.model.GetAccountInfoResponseWrapper;
import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;

import java.util.ArrayList;

/**
 * SDK指南 演示代码
 */
public class GetAccountInfo {

    public static void main(String[] args) {
        try {
            // 全局设置代理
            ApiClient defaultApiClient = Configuration.getDefaultApiClient();
            defaultApiClient.setBasePath("https://{proxyHost}:{proxyPort}");

            // init service
            AccountService accountService = new AccountService();

            // init requset header
            ApiRequestHeader requestHeader = new ApiRequestHeader();
            requestHeader.setToken("xxxxx");
            requestHeader.setUsername("xxxxx");
            requestHeader.setPassword("xxxxx");

            // init requset
            ApiAccountQueryRequest request = new ApiAccountQueryRequest();
            ArrayList<String> fields = new ArrayList<>();
            fields.add("pictureOptimizeSegmentStatus");
            fields.add("balance");
            fields.add("userLevel");
            request.setAccountFields(fields);

            // init requster wrapper
            GetAccountInfoRequestWrapper requestWrapper = new GetAccountInfoRequestWrapper();
            requestWrapper.setHeader(requestHeader);
            requestWrapper.setBody(request);

            GetAccountInfoResponseWrapper responseWrapper = accountService.getAccountInfo(requestWrapper);
            System.out.println(responseWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
