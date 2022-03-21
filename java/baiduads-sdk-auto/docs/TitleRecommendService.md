# TitleRecommendService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTitle**](TitleRecommendService.md#getTitle) | **POST** /json/feed/v1/TitleRecommendService/getTitle | 



## getTitle

> GetTitleResponseWrapper getTitle(getTitleRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.titlerecommend.api.TitleRecommendService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        TitleRecommendService apiInstance = new TitleRecommendService(defaultClient);
        GetTitleRequestWrapper getTitleRequestWrapper = new GetTitleRequestWrapper(); // GetTitleRequestWrapper | 
        try {
            GetTitleResponseWrapper result = apiInstance.getTitle(getTitleRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TitleRecommendService#getTitle");
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
 **getTitleRequestWrapper** | [**GetTitleRequestWrapper**](GetTitleRequestWrapper.md)|  |

### Return type

[**GetTitleResponseWrapper**](GetTitleResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

