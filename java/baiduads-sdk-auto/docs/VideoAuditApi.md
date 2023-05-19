# VideoAuditApi

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuditTask**](VideoAuditApi.md#createAuditTask) | **POST** /json/sms/service/VideoAuditAPI/createAuditTask | 
[**queryCount**](VideoAuditApi.md#queryCount) | **POST** /json/sms/service/VideoAuditAPI/queryCount | 
[**queryTask**](VideoAuditApi.md#queryTask) | **POST** /json/sms/service/VideoAuditAPI/queryTask | 



## createAuditTask

> CreateAuditTaskResponseWrapper createAuditTask(createAuditTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoauditapi.api.VideoAuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoAuditApi apiInstance = new VideoAuditApi(defaultClient);
        CreateAuditTaskRequestWrapper createAuditTaskRequestWrapper = new CreateAuditTaskRequestWrapper(); // CreateAuditTaskRequestWrapper | 
        try {
            CreateAuditTaskResponseWrapper result = apiInstance.createAuditTask(createAuditTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoAuditApi#createAuditTask");
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
 **createAuditTaskRequestWrapper** | [**CreateAuditTaskRequestWrapper**](CreateAuditTaskRequestWrapper.md)|  |

### Return type

[**CreateAuditTaskResponseWrapper**](CreateAuditTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryCount

> QueryCountResponseWrapper queryCount(queryCountRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoauditapi.api.VideoAuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoAuditApi apiInstance = new VideoAuditApi(defaultClient);
        QueryCountRequestWrapper queryCountRequestWrapper = new QueryCountRequestWrapper(); // QueryCountRequestWrapper | 
        try {
            QueryCountResponseWrapper result = apiInstance.queryCount(queryCountRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoAuditApi#queryCount");
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
 **queryCountRequestWrapper** | [**QueryCountRequestWrapper**](QueryCountRequestWrapper.md)|  |

### Return type

[**QueryCountResponseWrapper**](QueryCountResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryTask

> QueryTaskResponseWrapper queryTask(queryTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoauditapi.api.VideoAuditApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoAuditApi apiInstance = new VideoAuditApi(defaultClient);
        QueryTaskRequestWrapper queryTaskRequestWrapper = new QueryTaskRequestWrapper(); // QueryTaskRequestWrapper | 
        try {
            QueryTaskResponseWrapper result = apiInstance.queryTask(queryTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoAuditApi#queryTask");
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
 **queryTaskRequestWrapper** | [**QueryTaskRequestWrapper**](QueryTaskRequestWrapper.md)|  |

### Return type

[**QueryTaskResponseWrapper**](QueryTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

