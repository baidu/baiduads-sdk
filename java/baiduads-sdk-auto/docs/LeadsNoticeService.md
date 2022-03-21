# LeadsNoticeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNoticeList**](LeadsNoticeService.md#getNoticeList) | **POST** /json/sms/service/LeadsNoticeService/getNoticeList | 



## getNoticeList

> GetNoticeListResponseWrapper getNoticeList(getNoticeListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadsnotice.api.LeadsNoticeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadsNoticeService apiInstance = new LeadsNoticeService(defaultClient);
        GetNoticeListRequestWrapper getNoticeListRequestWrapper = new GetNoticeListRequestWrapper(); // GetNoticeListRequestWrapper | 
        try {
            GetNoticeListResponseWrapper result = apiInstance.getNoticeList(getNoticeListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadsNoticeService#getNoticeList");
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
 **getNoticeListRequestWrapper** | [**GetNoticeListRequestWrapper**](GetNoticeListRequestWrapper.md)|  |

### Return type

[**GetNoticeListResponseWrapper**](GetNoticeListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

