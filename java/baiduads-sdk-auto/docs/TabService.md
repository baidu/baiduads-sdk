# TabService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTabs**](TabService.md#getTabs) | **POST** /json/sms/service/TabService/getTabs | 



## getTabs

> GetTabsResponseWrapper getTabs(getTabsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.tab.api.TabService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        TabService apiInstance = new TabService(defaultClient);
        GetTabsRequestWrapper getTabsRequestWrapper = new GetTabsRequestWrapper(); // GetTabsRequestWrapper | 
        try {
            GetTabsResponseWrapper result = apiInstance.getTabs(getTabsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TabService#getTabs");
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
 **getTabsRequestWrapper** | [**GetTabsRequestWrapper**](GetTabsRequestWrapper.md)|  |

### Return type

[**GetTabsResponseWrapper**](GetTabsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

