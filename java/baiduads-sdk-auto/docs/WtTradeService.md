# WtTradeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTradeList**](WtTradeService.md#getTradeList) | **POST** /json/sms/service/WtTradeService/getTradeList | 



## getTradeList

> GetTradeListResponseWrapper getTradeList(getTradeListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wttrade.api.WtTradeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtTradeService apiInstance = new WtTradeService(defaultClient);
        GetTradeListRequestWrapper getTradeListRequestWrapper = new GetTradeListRequestWrapper(); // GetTradeListRequestWrapper | 
        try {
            GetTradeListResponseWrapper result = apiInstance.getTradeList(getTradeListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtTradeService#getTradeList");
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
 **getTradeListRequestWrapper** | [**GetTradeListRequestWrapper**](GetTradeListRequestWrapper.md)|  |

### Return type

[**GetTradeListResponseWrapper**](GetTradeListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

