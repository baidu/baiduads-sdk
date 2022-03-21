# ToolkitService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOperationRecord**](ToolkitService.md#getOperationRecord) | **POST** /json/sms/service/ToolkitService/getOperationRecord | 



## getOperationRecord

> GetOperationRecordResponseWrapper getOperationRecord(getOperationRecordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.toolkit.api.ToolkitService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ToolkitService apiInstance = new ToolkitService(defaultClient);
        GetOperationRecordRequestWrapper getOperationRecordRequestWrapper = new GetOperationRecordRequestWrapper(); // GetOperationRecordRequestWrapper | 
        try {
            GetOperationRecordResponseWrapper result = apiInstance.getOperationRecord(getOperationRecordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolkitService#getOperationRecord");
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
 **getOperationRecordRequestWrapper** | [**GetOperationRecordRequestWrapper**](GetOperationRecordRequestWrapper.md)|  |

### Return type

[**GetOperationRecordResponseWrapper**](GetOperationRecordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

