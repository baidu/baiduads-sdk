# CrowdAppInfoService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppInfo**](CrowdAppInfoService.md#getAppInfo) | **POST** /json/sms/service/CrowdAppInfoService/getAppInfo | 



## getAppInfo

> GetAppInfoResponseWrapper getAppInfo(getAppInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdappinfo.api.CrowdAppInfoService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdAppInfoService apiInstance = new CrowdAppInfoService(defaultClient);
        GetAppInfoRequestWrapper getAppInfoRequestWrapper = new GetAppInfoRequestWrapper(); // GetAppInfoRequestWrapper | 
        try {
            GetAppInfoResponseWrapper result = apiInstance.getAppInfo(getAppInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdAppInfoService#getAppInfo");
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
 **getAppInfoRequestWrapper** | [**GetAppInfoRequestWrapper**](GetAppInfoRequestWrapper.md)|  |

### Return type

[**GetAppInfoResponseWrapper**](GetAppInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

