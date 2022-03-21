# OcpcTransFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOcpcTransFeed**](OcpcTransFeedService.md#addOcpcTransFeed) | **POST** /json/feed/v1/OcpcTransFeedService/addOcpcTransFeed | 



## addOcpcTransFeed

> AddOcpcTransFeedResponseWrapper addOcpcTransFeed(addOcpcTransFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpctransfeed.api.OcpcTransFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcTransFeedService apiInstance = new OcpcTransFeedService(defaultClient);
        AddOcpcTransFeedRequestWrapper addOcpcTransFeedRequestWrapper = new AddOcpcTransFeedRequestWrapper(); // AddOcpcTransFeedRequestWrapper | 
        try {
            AddOcpcTransFeedResponseWrapper result = apiInstance.addOcpcTransFeed(addOcpcTransFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcTransFeedService#addOcpcTransFeed");
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
 **addOcpcTransFeedRequestWrapper** | [**AddOcpcTransFeedRequestWrapper**](AddOcpcTransFeedRequestWrapper.md)|  |

### Return type

[**AddOcpcTransFeedResponseWrapper**](AddOcpcTransFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

