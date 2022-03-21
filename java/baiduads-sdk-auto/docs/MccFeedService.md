# MccFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListByMccid**](MccFeedService.md#getUserListByMccid) | **POST** /json/feed/v1/MccFeedService/getUserListByMccid | 



## getUserListByMccid

> GetUserListByMccidResponseWrapper getUserListByMccid(getUserListByMccidRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.mccfeed.api.MccFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MccFeedService apiInstance = new MccFeedService(defaultClient);
        GetUserListByMccidRequestWrapper getUserListByMccidRequestWrapper = new GetUserListByMccidRequestWrapper(); // GetUserListByMccidRequestWrapper | 
        try {
            GetUserListByMccidResponseWrapper result = apiInstance.getUserListByMccid(getUserListByMccidRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccFeedService#getUserListByMccid");
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
 **getUserListByMccidRequestWrapper** | [**GetUserListByMccidRequestWrapper**](GetUserListByMccidRequestWrapper.md)|  |

### Return type

[**GetUserListByMccidResponseWrapper**](GetUserListByMccidResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

