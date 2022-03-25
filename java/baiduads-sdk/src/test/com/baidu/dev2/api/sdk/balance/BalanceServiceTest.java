package com.baidu.dev2.api.sdk.balance;

import com.baidu.dev2.api.sdk.balance.api.BalanceService;
import com.baidu.dev2.api.sdk.balance.model.GetBalanceInfoRequest;
import com.baidu.dev2.api.sdk.balance.model.GetBalanceInfoRequestWrapper;
import com.baidu.dev2.api.sdk.balance.model.GetBalanceInfoResponseWrapper;
import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BalanceServiceTest {
    private BalanceService balanceService;
    private ApiRequestHeader header;

    @Before
    public void before() {
        balanceService = new BalanceService();
        header = new ApiRequestHeader();
        header.setUsername("xxxxx"); // 替换为自己的用户名
        header.setPassword("xxxxx"); // 替换为自己的密码
        header.setToken("xxxxx"); // 替换为自己的token
    }

    @Test
    public void getBalanceInfo() throws ApiException {
        GetBalanceInfoRequestWrapper requestWrapper = new GetBalanceInfoRequestWrapper();
        requestWrapper.setHeader(header);

        GetBalanceInfoRequest getBalanceInfoRequest = new GetBalanceInfoRequest();
        List<Integer> productIds = new ArrayList<>();
        productIds.add(1);
        productIds.add(502);
        getBalanceInfoRequest.setProductIds(productIds);
        requestWrapper.setBody(getBalanceInfoRequest);

        GetBalanceInfoResponseWrapper responseWrapper = balanceService.getBalanceInfo(requestWrapper);
        Assert.assertTrue(responseWrapper.getHeader().getStatus() == 0);
        System.out.println(responseWrapper);
    }
}
