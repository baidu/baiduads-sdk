# OptimizationCenterService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdgroupRecommendHotQueryWord**](OptimizationCenterService.md#getAdgroupRecommendHotQueryWord) | **POST** /json/sms/service/OptimizationCenterService/getAdgroupRecommendHotQueryWord | 



## getAdgroupRecommendHotQueryWord

> GetAdgroupRecommendHotQueryWordResponseWrapper getAdgroupRecommendHotQueryWord(getAdgroupRecommendHotQueryWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.optimizationcenter.api.OptimizationCenterService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OptimizationCenterService apiInstance = new OptimizationCenterService(defaultClient);
        GetAdgroupRecommendHotQueryWordRequestWrapper getAdgroupRecommendHotQueryWordRequestWrapper = new GetAdgroupRecommendHotQueryWordRequestWrapper(); // GetAdgroupRecommendHotQueryWordRequestWrapper | 
        try {
            GetAdgroupRecommendHotQueryWordResponseWrapper result = apiInstance.getAdgroupRecommendHotQueryWord(getAdgroupRecommendHotQueryWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptimizationCenterService#getAdgroupRecommendHotQueryWord");
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
 **getAdgroupRecommendHotQueryWordRequestWrapper** | [**GetAdgroupRecommendHotQueryWordRequestWrapper**](GetAdgroupRecommendHotQueryWordRequestWrapper.md)|  |

### Return type

[**GetAdgroupRecommendHotQueryWordResponseWrapper**](GetAdgroupRecommendHotQueryWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

