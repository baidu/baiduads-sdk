# FmPhoneOutsideApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVirtualPhone**](FmPhoneOutsideApiService.md#getVirtualPhone) | **POST** /json/sms/service/FMPhoneOutsideApiService/getVirtualPhone | 



## getVirtualPhone

> GetVirtualPhoneResponseWrapper getVirtualPhone(getVirtualPhoneRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fmphoneoutsideapi.api.FmPhoneOutsideApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FmPhoneOutsideApiService apiInstance = new FmPhoneOutsideApiService(defaultClient);
        GetVirtualPhoneRequestWrapper getVirtualPhoneRequestWrapper = new GetVirtualPhoneRequestWrapper(); // GetVirtualPhoneRequestWrapper | 
        try {
            GetVirtualPhoneResponseWrapper result = apiInstance.getVirtualPhone(getVirtualPhoneRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FmPhoneOutsideApiService#getVirtualPhone");
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
 **getVirtualPhoneRequestWrapper** | [**GetVirtualPhoneRequestWrapper**](GetVirtualPhoneRequestWrapper.md)|  |

### Return type

[**GetVirtualPhoneResponseWrapper**](GetVirtualPhoneResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

