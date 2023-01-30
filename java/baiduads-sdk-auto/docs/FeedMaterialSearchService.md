# FeedMaterialSearchService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMaterialInfoBySearch**](FeedMaterialSearchService.md#getMaterialInfoBySearch) | **POST** /json/sms/service/FeedMaterialSearchService/getMaterialInfoBySearch | 



## getMaterialInfoBySearch

> GetMaterialInfoBySearchResponseWrapper getMaterialInfoBySearch(getMaterialInfoBySearchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.feedmaterialsearch.api.FeedMaterialSearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FeedMaterialSearchService apiInstance = new FeedMaterialSearchService(defaultClient);
        GetMaterialInfoBySearchRequestWrapper getMaterialInfoBySearchRequestWrapper = new GetMaterialInfoBySearchRequestWrapper(); // GetMaterialInfoBySearchRequestWrapper | 
        try {
            GetMaterialInfoBySearchResponseWrapper result = apiInstance.getMaterialInfoBySearch(getMaterialInfoBySearchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedMaterialSearchService#getMaterialInfoBySearch");
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
 **getMaterialInfoBySearchRequestWrapper** | [**GetMaterialInfoBySearchRequestWrapper**](GetMaterialInfoBySearchRequestWrapper.md)|  |

### Return type

[**GetMaterialInfoBySearchResponseWrapper**](GetMaterialInfoBySearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

