# AdviceSettingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modSetting**](AdviceSettingService.md#modSetting) | **POST** /json/sms/service/AdviceSettingService/modSetting | 



## modSetting

> ModSettingResponseWrapper modSetting(modSettingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advicesetting.api.AdviceSettingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceSettingService apiInstance = new AdviceSettingService(defaultClient);
        ModSettingRequestWrapper modSettingRequestWrapper = new ModSettingRequestWrapper(); // ModSettingRequestWrapper | 
        try {
            ModSettingResponseWrapper result = apiInstance.modSetting(modSettingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceSettingService#modSetting");
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
 **modSettingRequestWrapper** | [**ModSettingRequestWrapper**](ModSettingRequestWrapper.md)|  |

### Return type

[**ModSettingResponseWrapper**](ModSettingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

