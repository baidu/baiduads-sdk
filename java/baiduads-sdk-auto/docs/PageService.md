# PageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBroadCastPages**](PageService.md#getBroadCastPages) | **POST** /json/sms/service/PageService/getBroadCastPages | 



## getBroadCastPages

> GetBroadCastPagesResponseWrapper getBroadCastPages(getBroadCastPagesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.page.api.PageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PageService apiInstance = new PageService(defaultClient);
        GetBroadCastPagesRequestWrapper getBroadCastPagesRequestWrapper = new GetBroadCastPagesRequestWrapper(); // GetBroadCastPagesRequestWrapper | 
        try {
            GetBroadCastPagesResponseWrapper result = apiInstance.getBroadCastPages(getBroadCastPagesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PageService#getBroadCastPages");
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
 **getBroadCastPagesRequestWrapper** | [**GetBroadCastPagesRequestWrapper**](GetBroadCastPagesRequestWrapper.md)|  |

### Return type

[**GetBroadCastPagesResponseWrapper**](GetBroadCastPagesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

