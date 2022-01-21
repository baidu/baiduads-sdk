# ReportFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealTimeFeedData**](ReportFeedService.md#getRealTimeFeedData) | **POST** /json/feed/v1/ReportFeedService/getRealTimeFeedData | 
[**getReportFeedFileUrl**](ReportFeedService.md#getReportFeedFileUrl) | **POST** /json/feed/v1/ReportFeedService/getReportFeedFileUrl | 
[**getReportFeedId**](ReportFeedService.md#getReportFeedId) | **POST** /json/feed/v1/ReportFeedService/getReportFeedId | 
[**getReportFeedState**](ReportFeedService.md#getReportFeedState) | **POST** /json/feed/v1/ReportFeedService/getReportFeedState | 



## getRealTimeFeedData

> GetRealTimeFeedDataResponseWrapper getRealTimeFeedData(getRealTimeFeedDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.reportfeed.api.ReportFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportFeedService apiInstance = new ReportFeedService(defaultClient);
        GetRealTimeFeedDataRequestWrapper getRealTimeFeedDataRequestWrapper = new GetRealTimeFeedDataRequestWrapper(); // GetRealTimeFeedDataRequestWrapper | 
        try {
            GetRealTimeFeedDataResponseWrapper result = apiInstance.getRealTimeFeedData(getRealTimeFeedDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportFeedService#getRealTimeFeedData");
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
 **getRealTimeFeedDataRequestWrapper** | [**GetRealTimeFeedDataRequestWrapper**](GetRealTimeFeedDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeFeedDataResponseWrapper**](GetRealTimeFeedDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportFeedFileUrl

> GetReportFeedFileUrlResponseWrapper getReportFeedFileUrl(getReportFeedFileUrlRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.reportfeed.api.ReportFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportFeedService apiInstance = new ReportFeedService(defaultClient);
        GetReportFeedFileUrlRequestWrapper getReportFeedFileUrlRequestWrapper = new GetReportFeedFileUrlRequestWrapper(); // GetReportFeedFileUrlRequestWrapper | 
        try {
            GetReportFeedFileUrlResponseWrapper result = apiInstance.getReportFeedFileUrl(getReportFeedFileUrlRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportFeedService#getReportFeedFileUrl");
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
 **getReportFeedFileUrlRequestWrapper** | [**GetReportFeedFileUrlRequestWrapper**](GetReportFeedFileUrlRequestWrapper.md)|  |

### Return type

[**GetReportFeedFileUrlResponseWrapper**](GetReportFeedFileUrlResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportFeedId

> GetReportFeedIdResponseWrapper getReportFeedId(getReportFeedIdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.reportfeed.api.ReportFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportFeedService apiInstance = new ReportFeedService(defaultClient);
        GetReportFeedIdRequestWrapper getReportFeedIdRequestWrapper = new GetReportFeedIdRequestWrapper(); // GetReportFeedIdRequestWrapper | 
        try {
            GetReportFeedIdResponseWrapper result = apiInstance.getReportFeedId(getReportFeedIdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportFeedService#getReportFeedId");
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
 **getReportFeedIdRequestWrapper** | [**GetReportFeedIdRequestWrapper**](GetReportFeedIdRequestWrapper.md)|  |

### Return type

[**GetReportFeedIdResponseWrapper**](GetReportFeedIdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportFeedState

> GetReportFeedStateResponseWrapper getReportFeedState(getReportFeedStateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.reportfeed.api.ReportFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportFeedService apiInstance = new ReportFeedService(defaultClient);
        GetReportFeedStateRequestWrapper getReportFeedStateRequestWrapper = new GetReportFeedStateRequestWrapper(); // GetReportFeedStateRequestWrapper | 
        try {
            GetReportFeedStateResponseWrapper result = apiInstance.getReportFeedState(getReportFeedStateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportFeedService#getReportFeedState");
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
 **getReportFeedStateRequestWrapper** | [**GetReportFeedStateRequestWrapper**](GetReportFeedStateRequestWrapper.md)|  |

### Return type

[**GetReportFeedStateResponseWrapper**](GetReportFeedStateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

