# MiniProgramService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMiniPrograms**](MiniProgramService.md#getMiniPrograms) | **POST** /json/sms/service/MiniProgramService/getMiniPrograms | 



## getMiniPrograms

> GetMiniProgramsResponseWrapper getMiniPrograms(getMiniProgramsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.miniprogram.api.MiniProgramService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MiniProgramService apiInstance = new MiniProgramService(defaultClient);
        GetMiniProgramsRequestWrapper getMiniProgramsRequestWrapper = new GetMiniProgramsRequestWrapper(); // GetMiniProgramsRequestWrapper | 
        try {
            GetMiniProgramsResponseWrapper result = apiInstance.getMiniPrograms(getMiniProgramsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiniProgramService#getMiniPrograms");
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
 **getMiniProgramsRequestWrapper** | [**GetMiniProgramsRequestWrapper**](GetMiniProgramsRequestWrapper.md)|  |

### Return type

[**GetMiniProgramsResponseWrapper**](GetMiniProgramsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

