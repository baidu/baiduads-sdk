# AssetShareFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAssetShareFeed**](AssetShareFeedService.md#addAssetShareFeed) | **POST** /json/feed/v1/AssetShareFeedService/addAssetShareFeed | 



## addAssetShareFeed

> AddAssetShareFeedResponseWrapper addAssetShareFeed(addAssetShareFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.assetsharefeed.api.AssetShareFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AssetShareFeedService apiInstance = new AssetShareFeedService(defaultClient);
        AddAssetShareFeedRequestWrapper addAssetShareFeedRequestWrapper = new AddAssetShareFeedRequestWrapper(); // AddAssetShareFeedRequestWrapper | 
        try {
            AddAssetShareFeedResponseWrapper result = apiInstance.addAssetShareFeed(addAssetShareFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetShareFeedService#addAssetShareFeed");
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
 **addAssetShareFeedRequestWrapper** | [**AddAssetShareFeedRequestWrapper**](AddAssetShareFeedRequestWrapper.md)|  |

### Return type

[**AddAssetShareFeedResponseWrapper**](AddAssetShareFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

