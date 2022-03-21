# HuituApiV2Service

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserTemplate**](HuituApiV2Service.md#getUserTemplate) | **POST** /json/sms/service/HuituApiV2Service/getUserTemplate | 



## getUserTemplate

> GetUserTemplateResponseWrapper getUserTemplate(getUserTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.huituapiv2.api.HuituApiV2Service;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        HuituApiV2Service apiInstance = new HuituApiV2Service(defaultClient);
        GetUserTemplateRequestWrapper getUserTemplateRequestWrapper = new GetUserTemplateRequestWrapper(); // GetUserTemplateRequestWrapper | 
        try {
            GetUserTemplateResponseWrapper result = apiInstance.getUserTemplate(getUserTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HuituApiV2Service#getUserTemplate");
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
 **getUserTemplateRequestWrapper** | [**GetUserTemplateRequestWrapper**](GetUserTemplateRequestWrapper.md)|  |

### Return type

[**GetUserTemplateResponseWrapper**](GetUserTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

