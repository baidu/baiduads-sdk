# FmDataReport

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPhoneRecordings**](FmDataReport.md#getPhoneRecordings) | **POST** /json/sms/service/FMDataReport/getPhoneRecordings | 



## getPhoneRecordings

> GetPhoneRecordingsResponseWrapper getPhoneRecordings(getPhoneRecordingsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fmdatareport.api.FmDataReport;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FmDataReport apiInstance = new FmDataReport(defaultClient);
        GetPhoneRecordingsRequestWrapper getPhoneRecordingsRequestWrapper = new GetPhoneRecordingsRequestWrapper(); // GetPhoneRecordingsRequestWrapper | 
        try {
            GetPhoneRecordingsResponseWrapper result = apiInstance.getPhoneRecordings(getPhoneRecordingsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FmDataReport#getPhoneRecordings");
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
 **getPhoneRecordingsRequestWrapper** | [**GetPhoneRecordingsRequestWrapper**](GetPhoneRecordingsRequestWrapper.md)|  |

### Return type

[**GetPhoneRecordingsResponseWrapper**](GetPhoneRecordingsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

