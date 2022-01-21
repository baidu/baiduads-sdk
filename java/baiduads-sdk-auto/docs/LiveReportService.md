# LiveReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountLiveData**](LiveReportService.md#getAccountLiveData) | **POST** /json/sms/service/LiveReportService/getAccountLiveData | 
[**getKeywordLiveData**](LiveReportService.md#getKeywordLiveData) | **POST** /json/sms/service/LiveReportService/getKeywordLiveData | 



## getAccountLiveData

> GetAccountLiveDataResponseWrapper getAccountLiveData(getAccountLiveDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.livereport.api.LiveReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LiveReportService apiInstance = new LiveReportService(defaultClient);
        GetAccountLiveDataRequestWrapper getAccountLiveDataRequestWrapper = new GetAccountLiveDataRequestWrapper(); // GetAccountLiveDataRequestWrapper | 
        try {
            GetAccountLiveDataResponseWrapper result = apiInstance.getAccountLiveData(getAccountLiveDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveReportService#getAccountLiveData");
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
 **getAccountLiveDataRequestWrapper** | [**GetAccountLiveDataRequestWrapper**](GetAccountLiveDataRequestWrapper.md)|  |

### Return type

[**GetAccountLiveDataResponseWrapper**](GetAccountLiveDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getKeywordLiveData

> GetKeywordLiveDataResponseWrapper getKeywordLiveData(getKeywordLiveDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.livereport.api.LiveReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LiveReportService apiInstance = new LiveReportService(defaultClient);
        GetKeywordLiveDataRequestWrapper getKeywordLiveDataRequestWrapper = new GetKeywordLiveDataRequestWrapper(); // GetKeywordLiveDataRequestWrapper | 
        try {
            GetKeywordLiveDataResponseWrapper result = apiInstance.getKeywordLiveData(getKeywordLiveDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveReportService#getKeywordLiveData");
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
 **getKeywordLiveDataRequestWrapper** | [**GetKeywordLiveDataRequestWrapper**](GetKeywordLiveDataRequestWrapper.md)|  |

### Return type

[**GetKeywordLiveDataResponseWrapper**](GetKeywordLiveDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

