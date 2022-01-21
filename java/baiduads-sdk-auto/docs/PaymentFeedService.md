# PaymentFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentHistory**](PaymentFeedService.md#getPaymentHistory) | **POST** /json/feed/v1/PaymentFeedService/getPaymentHistory | 



## getPaymentHistory

> GetPaymentHistoryResponseWrapper getPaymentHistory(getPaymentHistoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.paymentfeed.api.PaymentFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PaymentFeedService apiInstance = new PaymentFeedService(defaultClient);
        GetPaymentHistoryRequestWrapper getPaymentHistoryRequestWrapper = new GetPaymentHistoryRequestWrapper(); // GetPaymentHistoryRequestWrapper | 
        try {
            GetPaymentHistoryResponseWrapper result = apiInstance.getPaymentHistory(getPaymentHistoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentFeedService#getPaymentHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPaymentHistoryRequestWrapper** | [**GetPaymentHistoryRequestWrapper**](GetPaymentHistoryRequestWrapper.md)|  |

### Return type

[**GetPaymentHistoryResponseWrapper**](GetPaymentHistoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

