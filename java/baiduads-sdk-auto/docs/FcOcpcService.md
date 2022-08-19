# FcOcpcService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSuggestCPAs**](FcOcpcService.md#getSuggestCPAs) | **POST** /json/sms/service/FcOcpcService/getSuggestCPAs | 



## getSuggestCPAs

> GetSuggestCPAsResponseWrapper getSuggestCPAs(getSuggestCPAsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fcocpc.api.FcOcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FcOcpcService apiInstance = new FcOcpcService(defaultClient);
        GetSuggestCPAsRequestWrapper getSuggestCPAsRequestWrapper = new GetSuggestCPAsRequestWrapper(); // GetSuggestCPAsRequestWrapper | 
        try {
            GetSuggestCPAsResponseWrapper result = apiInstance.getSuggestCPAs(getSuggestCPAsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FcOcpcService#getSuggestCPAs");
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
 **getSuggestCPAsRequestWrapper** | [**GetSuggestCPAsRequestWrapper**](GetSuggestCPAsRequestWrapper.md)|  |

### Return type

[**GetSuggestCPAsResponseWrapper**](GetSuggestCPAsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

