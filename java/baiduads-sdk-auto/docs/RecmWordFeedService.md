# RecmWordFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecmWord**](RecmWordFeedService.md#getRecmWord) | **POST** /json/feed/v1/RecmWordFeedService/getRecmWord | 



## getRecmWord

> GetRecmWordResponseWrapper getRecmWord(getRecmWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.recmwordfeed.api.RecmWordFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RecmWordFeedService apiInstance = new RecmWordFeedService(defaultClient);
        GetRecmWordRequestWrapper getRecmWordRequestWrapper = new GetRecmWordRequestWrapper(); // GetRecmWordRequestWrapper | 
        try {
            GetRecmWordResponseWrapper result = apiInstance.getRecmWord(getRecmWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecmWordFeedService#getRecmWord");
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
 **getRecmWordRequestWrapper** | [**GetRecmWordRequestWrapper**](GetRecmWordRequestWrapper.md)|  |

### Return type

[**GetRecmWordResponseWrapper**](GetRecmWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

