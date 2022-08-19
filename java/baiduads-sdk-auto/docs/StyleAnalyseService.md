# StyleAnalyseService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**decode**](StyleAnalyseService.md#decode) | **POST** /json/sms/service/StyleAnalyseService/decode | 



## decode

> DecodeResponseWrapper decode(decodeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.styleanalyse.api.StyleAnalyseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        StyleAnalyseService apiInstance = new StyleAnalyseService(defaultClient);
        DecodeRequestWrapper decodeRequestWrapper = new DecodeRequestWrapper(); // DecodeRequestWrapper | 
        try {
            DecodeResponseWrapper result = apiInstance.decode(decodeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StyleAnalyseService#decode");
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
 **decodeRequestWrapper** | [**DecodeRequestWrapper**](DecodeRequestWrapper.md)|  |

### Return type

[**DecodeResponseWrapper**](DecodeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

