# CreativeSuggestService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCreativeSegmentRecommend**](CreativeSuggestService.md#getCreativeSegmentRecommend) | **POST** /json/sms/service/CreativeSuggestService/getCreativeSegmentRecommend | 



## getCreativeSegmentRecommend

> GetCreativeSegmentRecommendResponseWrapper getCreativeSegmentRecommend(getCreativeSegmentRecommendRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativesuggest.api.CreativeSuggestService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeSuggestService apiInstance = new CreativeSuggestService(defaultClient);
        GetCreativeSegmentRecommendRequestWrapper getCreativeSegmentRecommendRequestWrapper = new GetCreativeSegmentRecommendRequestWrapper(); // GetCreativeSegmentRecommendRequestWrapper | 
        try {
            GetCreativeSegmentRecommendResponseWrapper result = apiInstance.getCreativeSegmentRecommend(getCreativeSegmentRecommendRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeSuggestService#getCreativeSegmentRecommend");
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
 **getCreativeSegmentRecommendRequestWrapper** | [**GetCreativeSegmentRecommendRequestWrapper**](GetCreativeSegmentRecommendRequestWrapper.md)|  |

### Return type

[**GetCreativeSegmentRecommendResponseWrapper**](GetCreativeSegmentRecommendResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

