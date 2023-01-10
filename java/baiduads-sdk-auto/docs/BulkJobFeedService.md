# BulkJobFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDownload**](BulkJobFeedService.md#cancelDownload) | **POST** /json/sms/service/BulkJobFeedService/cancelDownload | 
[**getAllFeedObjects**](BulkJobFeedService.md#getAllFeedObjects) | **POST** /json/feed/v1/BulkJobFeedService/getAllFeedObjects | 
[**getFilePath**](BulkJobFeedService.md#getFilePath) | **POST** /json/feed/v1/BulkJobFeedService/getFilePath | 
[**getFileStatus**](BulkJobFeedService.md#getFileStatus) | **POST** /json/feed/v1/BulkJobFeedService/getFileStatus | 



## cancelDownload

> CancelDownloadResponseWrapper cancelDownload(cancelDownloadRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjobfeed.api.BulkJobFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobFeedService apiInstance = new BulkJobFeedService(defaultClient);
        CancelDownloadRequestWrapper cancelDownloadRequestWrapper = new CancelDownloadRequestWrapper(); // CancelDownloadRequestWrapper | 
        try {
            CancelDownloadResponseWrapper result = apiInstance.cancelDownload(cancelDownloadRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobFeedService#cancelDownload");
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
 **cancelDownloadRequestWrapper** | [**CancelDownloadRequestWrapper**](CancelDownloadRequestWrapper.md)|  |

### Return type

[**CancelDownloadResponseWrapper**](CancelDownloadResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAllFeedObjects

> GetAllFeedObjectsResponseWrapper getAllFeedObjects(getAllFeedObjectsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjobfeed.api.BulkJobFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobFeedService apiInstance = new BulkJobFeedService(defaultClient);
        GetAllFeedObjectsRequestWrapper getAllFeedObjectsRequestWrapper = new GetAllFeedObjectsRequestWrapper(); // GetAllFeedObjectsRequestWrapper | 
        try {
            GetAllFeedObjectsResponseWrapper result = apiInstance.getAllFeedObjects(getAllFeedObjectsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobFeedService#getAllFeedObjects");
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
 **getAllFeedObjectsRequestWrapper** | [**GetAllFeedObjectsRequestWrapper**](GetAllFeedObjectsRequestWrapper.md)|  |

### Return type

[**GetAllFeedObjectsResponseWrapper**](GetAllFeedObjectsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getFilePath

> GetFilePathResponseWrapper getFilePath(getFilePathRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjobfeed.api.BulkJobFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobFeedService apiInstance = new BulkJobFeedService(defaultClient);
        GetFilePathRequestWrapper getFilePathRequestWrapper = new GetFilePathRequestWrapper(); // GetFilePathRequestWrapper | 
        try {
            GetFilePathResponseWrapper result = apiInstance.getFilePath(getFilePathRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobFeedService#getFilePath");
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
 **getFilePathRequestWrapper** | [**GetFilePathRequestWrapper**](GetFilePathRequestWrapper.md)|  |

### Return type

[**GetFilePathResponseWrapper**](GetFilePathResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getFileStatus

> GetFileStatusResponseWrapper getFileStatus(getFileStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjobfeed.api.BulkJobFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobFeedService apiInstance = new BulkJobFeedService(defaultClient);
        GetFileStatusRequestWrapper getFileStatusRequestWrapper = new GetFileStatusRequestWrapper(); // GetFileStatusRequestWrapper | 
        try {
            GetFileStatusResponseWrapper result = apiInstance.getFileStatus(getFileStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobFeedService#getFileStatus");
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
 **getFileStatusRequestWrapper** | [**GetFileStatusRequestWrapper**](GetFileStatusRequestWrapper.md)|  |

### Return type

[**GetFileStatusResponseWrapper**](GetFileStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

