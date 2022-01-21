# ReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfessionalReportId**](ReportService.md#getProfessionalReportId) | **POST** /json/sms/service/ReportService/getProfessionalReportId | 
[**getRealTimeData**](ReportService.md#getRealTimeData) | **POST** /json/sms/service/ReportService/getRealTimeData | 
[**getRealTimeQueryData**](ReportService.md#getRealTimeQueryData) | **POST** /json/sms/service/ReportService/getRealTimeQueryData | 
[**getReportFileUrl**](ReportService.md#getReportFileUrl) | **POST** /json/sms/service/ReportService/getReportFileUrl | 
[**getReportState**](ReportService.md#getReportState) | **POST** /json/sms/service/ReportService/getReportState | 



## getProfessionalReportId

> GetProfessionalReportIdResponseWrapper getProfessionalReportId(getProfessionalReportIdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.report.api.ReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportService apiInstance = new ReportService(defaultClient);
        GetProfessionalReportIdRequestWrapper getProfessionalReportIdRequestWrapper = new GetProfessionalReportIdRequestWrapper(); // GetProfessionalReportIdRequestWrapper | 
        try {
            GetProfessionalReportIdResponseWrapper result = apiInstance.getProfessionalReportId(getProfessionalReportIdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportService#getProfessionalReportId");
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
 **getProfessionalReportIdRequestWrapper** | [**GetProfessionalReportIdRequestWrapper**](GetProfessionalReportIdRequestWrapper.md)|  |

### Return type

[**GetProfessionalReportIdResponseWrapper**](GetProfessionalReportIdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getRealTimeData

> GetRealTimeDataResponseWrapper getRealTimeData(getRealTimeDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.report.api.ReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportService apiInstance = new ReportService(defaultClient);
        GetRealTimeDataRequestWrapper getRealTimeDataRequestWrapper = new GetRealTimeDataRequestWrapper(); // GetRealTimeDataRequestWrapper | 
        try {
            GetRealTimeDataResponseWrapper result = apiInstance.getRealTimeData(getRealTimeDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportService#getRealTimeData");
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
 **getRealTimeDataRequestWrapper** | [**GetRealTimeDataRequestWrapper**](GetRealTimeDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeDataResponseWrapper**](GetRealTimeDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getRealTimeQueryData

> GetRealTimeQueryDataResponseWrapper getRealTimeQueryData(getRealTimeQueryDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.report.api.ReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportService apiInstance = new ReportService(defaultClient);
        GetRealTimeQueryDataRequestWrapper getRealTimeQueryDataRequestWrapper = new GetRealTimeQueryDataRequestWrapper(); // GetRealTimeQueryDataRequestWrapper | 
        try {
            GetRealTimeQueryDataResponseWrapper result = apiInstance.getRealTimeQueryData(getRealTimeQueryDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportService#getRealTimeQueryData");
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
 **getRealTimeQueryDataRequestWrapper** | [**GetRealTimeQueryDataRequestWrapper**](GetRealTimeQueryDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeQueryDataResponseWrapper**](GetRealTimeQueryDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportFileUrl

> GetReportFileUrlResponseWrapper getReportFileUrl(getReportFileUrlRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.report.api.ReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportService apiInstance = new ReportService(defaultClient);
        GetReportFileUrlRequestWrapper getReportFileUrlRequestWrapper = new GetReportFileUrlRequestWrapper(); // GetReportFileUrlRequestWrapper | 
        try {
            GetReportFileUrlResponseWrapper result = apiInstance.getReportFileUrl(getReportFileUrlRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportService#getReportFileUrl");
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
 **getReportFileUrlRequestWrapper** | [**GetReportFileUrlRequestWrapper**](GetReportFileUrlRequestWrapper.md)|  |

### Return type

[**GetReportFileUrlResponseWrapper**](GetReportFileUrlResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportState

> GetReportStateResponseWrapper getReportState(getReportStateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.report.api.ReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ReportService apiInstance = new ReportService(defaultClient);
        GetReportStateRequestWrapper getReportStateRequestWrapper = new GetReportStateRequestWrapper(); // GetReportStateRequestWrapper | 
        try {
            GetReportStateResponseWrapper result = apiInstance.getReportState(getReportStateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportService#getReportState");
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
 **getReportStateRequestWrapper** | [**GetReportStateRequestWrapper**](GetReportStateRequestWrapper.md)|  |

### Return type

[**GetReportStateResponseWrapper**](GetReportStateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

