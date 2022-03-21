# AutoExpansionService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutoExpansion**](AutoExpansionService.md#getAutoExpansion) | **POST** /json/sms/service/AutoExpansionService/getAutoExpansion | 



## getAutoExpansion

> GetAutoExpansionResponseWrapper getAutoExpansion(getAutoExpansionRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.autoexpansion.api.AutoExpansionService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AutoExpansionService apiInstance = new AutoExpansionService(defaultClient);
        GetAutoExpansionRequestWrapper getAutoExpansionRequestWrapper = new GetAutoExpansionRequestWrapper(); // GetAutoExpansionRequestWrapper | 
        try {
            GetAutoExpansionResponseWrapper result = apiInstance.getAutoExpansion(getAutoExpansionRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoExpansionService#getAutoExpansion");
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
 **getAutoExpansionRequestWrapper** | [**GetAutoExpansionRequestWrapper**](GetAutoExpansionRequestWrapper.md)|  |

### Return type

[**GetAutoExpansionResponseWrapper**](GetAutoExpansionResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

