# AppCenterPackageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppPackagelist**](AppCenterPackageService.md#getAppPackagelist) | **POST** /json/sms/service/AppCenterPackageService/getAppPackagelist | 



## getAppPackagelist

> GetAppPackagelistResponseWrapper getAppPackagelist(getAppPackagelistRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appcenterpackage.api.AppCenterPackageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppCenterPackageService apiInstance = new AppCenterPackageService(defaultClient);
        GetAppPackagelistRequestWrapper getAppPackagelistRequestWrapper = new GetAppPackagelistRequestWrapper(); // GetAppPackagelistRequestWrapper | 
        try {
            GetAppPackagelistResponseWrapper result = apiInstance.getAppPackagelist(getAppPackagelistRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCenterPackageService#getAppPackagelist");
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
 **getAppPackagelistRequestWrapper** | [**GetAppPackagelistRequestWrapper**](GetAppPackagelistRequestWrapper.md)|  |

### Return type

[**GetAppPackagelistResponseWrapper**](GetAppPackagelistResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

