# MaterialTradeQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserTrade**](MaterialTradeQueryService.md#getUserTrade) | **POST** /json/sms/service/MaterialTradeQueryService/getUserTrade | 



## getUserTrade

> GetUserTradeResponseWrapper getUserTrade(getUserTradeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialtradequery.api.MaterialTradeQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialTradeQueryService apiInstance = new MaterialTradeQueryService(defaultClient);
        GetUserTradeRequestWrapper getUserTradeRequestWrapper = new GetUserTradeRequestWrapper(); // GetUserTradeRequestWrapper | 
        try {
            GetUserTradeResponseWrapper result = apiInstance.getUserTrade(getUserTradeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialTradeQueryService#getUserTrade");
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
 **getUserTradeRequestWrapper** | [**GetUserTradeRequestWrapper**](GetUserTradeRequestWrapper.md)|  |

### Return type

[**GetUserTradeResponseWrapper**](GetUserTradeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

