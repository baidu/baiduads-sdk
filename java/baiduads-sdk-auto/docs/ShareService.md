# ShareService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveSharingBatchDr**](ShareService.md#saveSharingBatchDr) | **POST** /json/sms/service/ShareService/saveSharingBatchDr | 



## saveSharingBatchDr

> SaveSharingBatchDrResponseWrapper saveSharingBatchDr(saveSharingBatchDrRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.share.api.ShareService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShareService apiInstance = new ShareService(defaultClient);
        SaveSharingBatchDrRequestWrapper saveSharingBatchDrRequestWrapper = new SaveSharingBatchDrRequestWrapper(); // SaveSharingBatchDrRequestWrapper | 
        try {
            SaveSharingBatchDrResponseWrapper result = apiInstance.saveSharingBatchDr(saveSharingBatchDrRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareService#saveSharingBatchDr");
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
 **saveSharingBatchDrRequestWrapper** | [**SaveSharingBatchDrRequestWrapper**](SaveSharingBatchDrRequestWrapper.md)|  |

### Return type

[**SaveSharingBatchDrResponseWrapper**](SaveSharingBatchDrResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

