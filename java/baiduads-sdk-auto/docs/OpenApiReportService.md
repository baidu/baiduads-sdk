# OpenApiReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportTask**](OpenApiReportService.md#createReportTask) | **POST** /json/sms/service/OpenApiReportService/createReportTask | 
[**getReportData**](OpenApiReportService.md#getReportData) | **POST** /json/sms/service/OpenApiReportService/getReportData | 
[**getTaskStatus**](OpenApiReportService.md#getTaskStatus) | **POST** /json/sms/service/OpenApiReportService/getTaskStatus | 



## createReportTask

> CreateReportTaskResponseWrapper createReportTask(createReportTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.openapireport.api.OpenApiReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OpenApiReportService apiInstance = new OpenApiReportService(defaultClient);
        CreateReportTaskRequestWrapper createReportTaskRequestWrapper = new CreateReportTaskRequestWrapper(); // CreateReportTaskRequestWrapper | 
        try {
            CreateReportTaskResponseWrapper result = apiInstance.createReportTask(createReportTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenApiReportService#createReportTask");
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
 **createReportTaskRequestWrapper** | [**CreateReportTaskRequestWrapper**](CreateReportTaskRequestWrapper.md)|  |

### Return type

[**CreateReportTaskResponseWrapper**](CreateReportTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getReportData

> GetReportDataResponseWrapper getReportData(getReportDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.openapireport.api.OpenApiReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OpenApiReportService apiInstance = new OpenApiReportService(defaultClient);
        GetReportDataRequestWrapper getReportDataRequestWrapper = new GetReportDataRequestWrapper(); // GetReportDataRequestWrapper | 
        try {
            GetReportDataResponseWrapper result = apiInstance.getReportData(getReportDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenApiReportService#getReportData");
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
 **getReportDataRequestWrapper** | [**GetReportDataRequestWrapper**](GetReportDataRequestWrapper.md)|  |

### Return type

[**GetReportDataResponseWrapper**](GetReportDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTaskStatus

> GetTaskStatusResponseWrapper getTaskStatus(getTaskStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.openapireport.api.OpenApiReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OpenApiReportService apiInstance = new OpenApiReportService(defaultClient);
        GetTaskStatusRequestWrapper getTaskStatusRequestWrapper = new GetTaskStatusRequestWrapper(); // GetTaskStatusRequestWrapper | 
        try {
            GetTaskStatusResponseWrapper result = apiInstance.getTaskStatus(getTaskStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenApiReportService#getTaskStatus");
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
 **getTaskStatusRequestWrapper** | [**GetTaskStatusRequestWrapper**](GetTaskStatusRequestWrapper.md)|  |

### Return type

[**GetTaskStatusResponseWrapper**](GetTaskStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

