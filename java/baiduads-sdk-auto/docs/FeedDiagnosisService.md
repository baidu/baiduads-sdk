# FeedDiagnosisService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryFeedUnitDiagnosisDetail**](FeedDiagnosisService.md#queryFeedUnitDiagnosisDetail) | **POST** /json/sms/service/FeedDiagnosisService/queryFeedUnitDiagnosisDetail | 



## queryFeedUnitDiagnosisDetail

> QueryFeedUnitDiagnosisDetailResponseWrapper queryFeedUnitDiagnosisDetail(queryFeedUnitDiagnosisDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.feeddiagnosis.api.FeedDiagnosisService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FeedDiagnosisService apiInstance = new FeedDiagnosisService(defaultClient);
        QueryFeedUnitDiagnosisDetailRequestWrapper queryFeedUnitDiagnosisDetailRequestWrapper = new QueryFeedUnitDiagnosisDetailRequestWrapper(); // QueryFeedUnitDiagnosisDetailRequestWrapper | 
        try {
            QueryFeedUnitDiagnosisDetailResponseWrapper result = apiInstance.queryFeedUnitDiagnosisDetail(queryFeedUnitDiagnosisDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedDiagnosisService#queryFeedUnitDiagnosisDetail");
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
 **queryFeedUnitDiagnosisDetailRequestWrapper** | [**QueryFeedUnitDiagnosisDetailRequestWrapper**](QueryFeedUnitDiagnosisDetailRequestWrapper.md)|  |

### Return type

[**QueryFeedUnitDiagnosisDetailResponseWrapper**](QueryFeedUnitDiagnosisDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

