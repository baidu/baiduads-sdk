package com.baidu.dev2.api.sdk.payment;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.payment.api.PaymentService;
import com.baidu.dev2.api.sdk.payment.model.Condition;
import com.baidu.dev2.api.sdk.payment.model.GetPaymentRecordRequest;
import com.baidu.dev2.api.sdk.payment.model.GetPaymentRecordRequestWrapper;
import com.baidu.dev2.api.sdk.payment.model.GetPaymentRecordResponseWrapper;
import com.baidu.dev2.api.sdk.payment.model.IdOffset;
import com.baidu.dev2.api.sdk.payment.model.Offset;
import com.baidu.dev2.api.sdk.payment.model.Paytime;
import com.baidu.dev2.api.sdk.payment.model.Sort;
import com.baidu.dev2.api.sdk.payment.model.Status;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PaymentServiceTest {

    private PaymentService paymentService;
    private ApiRequestHeader header;

    @Before
    public void before() {
        paymentService = new PaymentService();
        header = new ApiRequestHeader();
        header.setAccessToken("xxxxx"); // 替换为授权生成的accessToken
        header.setUserName("xxxxx"); // 替换为自己的用户名
    }

    @Test
    public void getPaymentRecord() throws ApiException {
        GetPaymentRecordRequestWrapper requestWrapper = new GetPaymentRecordRequestWrapper();
        requestWrapper.setHeader(header);

        GetPaymentRecordRequest request = new GetPaymentRecordRequest();
        request.setFundtype(1);
        request.setChunksize(10);
        // set condition
        Condition condition = new Condition();
        Paytime paytime = new Paytime();
        paytime.setLte("2022-03-15 00:00:00");
        paytime.setGte("2022-03-01 00:00:00");
        condition.setPaytime(paytime);
        Status status = new Status();
        List<Integer> statusIn = new ArrayList<>();
        statusIn.add(0);
        statusIn.add(1);
        statusIn.add(2);
        status.setIn(statusIn);
        condition.setStatus(status);
        request.setCondition(condition);
        // set offset
        Offset offset = new Offset();
        IdOffset idOffset = new IdOffset();
        idOffset.setGt(0);
        offset.setId(idOffset);
        request.setOffset(offset);
        // set sort
        Sort sort = new Sort();
        List<String> sortIn = new ArrayList<>();
        sortIn.add("id asc");
        sort.setIn(sortIn);
        request.setSort(sort);

        requestWrapper.setBody(request);
        GetPaymentRecordResponseWrapper responseWrapper = paymentService.getPaymentRecord(requestWrapper);
        Assert.assertTrue(responseWrapper.getHeader().getStatus() == 0);
        System.out.println(responseWrapper);
    }
}
