# WordMaterialService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](WordMaterialService.md#search) | **POST** /json/sms/service/WordMaterialService/search | 



## search

> SearchResponseWrapper search(searchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wordmaterial.api.WordMaterialService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WordMaterialService apiInstance = new WordMaterialService(defaultClient);
        SearchRequestWrapper searchRequestWrapper = new SearchRequestWrapper(); // SearchRequestWrapper | 
        try {
            SearchResponseWrapper result = apiInstance.search(searchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WordMaterialService#search");
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
 **searchRequestWrapper** | [**SearchRequestWrapper**](SearchRequestWrapper.md)|  |

### Return type

[**SearchResponseWrapper**](SearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

