# BulkJobService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDownload**](BulkJobService.md#cancelDownload) | **POST** /json/sms/service/BulkJobService/cancelDownload | 
[**getAllChangedObjects**](BulkJobService.md#getAllChangedObjects) | **POST** /json/sms/service/BulkJobService/getAllChangedObjects | 
[**getAllObjects**](BulkJobService.md#getAllObjects) | **POST** /json/sms/service/BulkJobService/getAllObjects | 
[**getChangedItemId**](BulkJobService.md#getChangedItemId) | **POST** /json/sms/service/BulkJobService/getChangedItemId | 
[**getChangedScale**](BulkJobService.md#getChangedScale) | **POST** /json/sms/service/BulkJobService/getChangedScale | 
[**getFilePath**](BulkJobService.md#getFilePath) | **POST** /json/sms/service/BulkJobService/getFilePath | 
[**getFileStatus**](BulkJobService.md#getFileStatus) | **POST** /json/sms/service/BulkJobService/getFileStatus | 



## cancelDownload

> CancelDownloadResponseWrapper cancelDownload(cancelDownloadRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        CancelDownloadRequestWrapper cancelDownloadRequestWrapper = new CancelDownloadRequestWrapper(); // CancelDownloadRequestWrapper | 
        try {
            CancelDownloadResponseWrapper result = apiInstance.cancelDownload(cancelDownloadRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#cancelDownload");
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


## getAllChangedObjects

> GetAllChangedObjectsResponseWrapper getAllChangedObjects(getAllChangedObjectsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetAllChangedObjectsRequestWrapper getAllChangedObjectsRequestWrapper = new GetAllChangedObjectsRequestWrapper(); // GetAllChangedObjectsRequestWrapper | 
        try {
            GetAllChangedObjectsResponseWrapper result = apiInstance.getAllChangedObjects(getAllChangedObjectsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getAllChangedObjects");
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
 **getAllChangedObjectsRequestWrapper** | [**GetAllChangedObjectsRequestWrapper**](GetAllChangedObjectsRequestWrapper.md)|  |

### Return type

[**GetAllChangedObjectsResponseWrapper**](GetAllChangedObjectsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAllObjects

> GetAllObjectsResponseWrapper getAllObjects(getAllObjectsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetAllObjectsRequestWrapper getAllObjectsRequestWrapper = new GetAllObjectsRequestWrapper(); // GetAllObjectsRequestWrapper | 
        try {
            GetAllObjectsResponseWrapper result = apiInstance.getAllObjects(getAllObjectsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getAllObjects");
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
 **getAllObjectsRequestWrapper** | [**GetAllObjectsRequestWrapper**](GetAllObjectsRequestWrapper.md)|  |

### Return type

[**GetAllObjectsResponseWrapper**](GetAllObjectsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getChangedItemId

> GetChangedItemIdResponseWrapper getChangedItemId(getChangedItemIdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetChangedItemIdRequestWrapper getChangedItemIdRequestWrapper = new GetChangedItemIdRequestWrapper(); // GetChangedItemIdRequestWrapper | 
        try {
            GetChangedItemIdResponseWrapper result = apiInstance.getChangedItemId(getChangedItemIdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getChangedItemId");
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
 **getChangedItemIdRequestWrapper** | [**GetChangedItemIdRequestWrapper**](GetChangedItemIdRequestWrapper.md)|  |

### Return type

[**GetChangedItemIdResponseWrapper**](GetChangedItemIdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getChangedScale

> GetChangedScaleResponseWrapper getChangedScale(getChangedScaleRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetChangedScaleRequestWrapper getChangedScaleRequestWrapper = new GetChangedScaleRequestWrapper(); // GetChangedScaleRequestWrapper | 
        try {
            GetChangedScaleResponseWrapper result = apiInstance.getChangedScale(getChangedScaleRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getChangedScale");
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
 **getChangedScaleRequestWrapper** | [**GetChangedScaleRequestWrapper**](GetChangedScaleRequestWrapper.md)|  |

### Return type

[**GetChangedScaleResponseWrapper**](GetChangedScaleResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetFilePathRequestWrapper getFilePathRequestWrapper = new GetFilePathRequestWrapper(); // GetFilePathRequestWrapper | 
        try {
            GetFilePathResponseWrapper result = apiInstance.getFilePath(getFilePathRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getFilePath");
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
import com.baidu.dev2.api.sdk.bulkjob.api.BulkJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BulkJobService apiInstance = new BulkJobService(defaultClient);
        GetFileStatusRequestWrapper getFileStatusRequestWrapper = new GetFileStatusRequestWrapper(); // GetFileStatusRequestWrapper | 
        try {
            GetFileStatusResponseWrapper result = apiInstance.getFileStatus(getFileStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkJobService#getFileStatus");
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

