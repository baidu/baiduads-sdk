# ImageIntelligentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSmartTemplateImage**](ImageIntelligentService.md#getSmartTemplateImage) | **POST** /json/sms/service/ImageIntelligentService/getSmartTemplateImage | 



## getSmartTemplateImage

> GetSmartTemplateImageResponseWrapper getSmartTemplateImage(getSmartTemplateImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imageintelligent.api.ImageIntelligentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageIntelligentService apiInstance = new ImageIntelligentService(defaultClient);
        GetSmartTemplateImageRequestWrapper getSmartTemplateImageRequestWrapper = new GetSmartTemplateImageRequestWrapper(); // GetSmartTemplateImageRequestWrapper | 
        try {
            GetSmartTemplateImageResponseWrapper result = apiInstance.getSmartTemplateImage(getSmartTemplateImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageIntelligentService#getSmartTemplateImage");
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
 **getSmartTemplateImageRequestWrapper** | [**GetSmartTemplateImageRequestWrapper**](GetSmartTemplateImageRequestWrapper.md)|  |

### Return type

[**GetSmartTemplateImageResponseWrapper**](GetSmartTemplateImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

