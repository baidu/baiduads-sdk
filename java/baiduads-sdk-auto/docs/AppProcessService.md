# AppProcessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppList**](AppProcessService.md#getAppList) | **POST** /json/sms/service/AppProcessService/getAppList | 



## getAppList

> GetAppListResponseWrapper getAppList(getAppListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appprocess.api.AppProcessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppProcessService apiInstance = new AppProcessService(defaultClient);
        GetAppListRequestWrapper getAppListRequestWrapper = new GetAppListRequestWrapper(); // GetAppListRequestWrapper | 
        try {
            GetAppListResponseWrapper result = apiInstance.getAppList(getAppListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppProcessService#getAppList");
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
 **getAppListRequestWrapper** | [**GetAppListRequestWrapper**](GetAppListRequestWrapper.md)|  |

### Return type

[**GetAppListResponseWrapper**](GetAppListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

