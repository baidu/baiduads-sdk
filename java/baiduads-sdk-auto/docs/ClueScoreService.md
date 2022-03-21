# ClueScoreService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClueResultFileUrl**](ClueScoreService.md#getClueResultFileUrl) | **POST** /json/sms/service/ClueScoreService/getClueResultFileUrl | 
[**queryClueTaskStatus**](ClueScoreService.md#queryClueTaskStatus) | **POST** /json/sms/service/ClueScoreService/queryClueTaskStatus | 
[**submitClueTask**](ClueScoreService.md#submitClueTask) | **POST** /json/sms/service/ClueScoreService/submitClueTask | 



## getClueResultFileUrl

> GetClueResultFileUrlResponseWrapper getClueResultFileUrl(getClueResultFileUrlRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cluescore.api.ClueScoreService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ClueScoreService apiInstance = new ClueScoreService(defaultClient);
        GetClueResultFileUrlRequestWrapper getClueResultFileUrlRequestWrapper = new GetClueResultFileUrlRequestWrapper(); // GetClueResultFileUrlRequestWrapper | 
        try {
            GetClueResultFileUrlResponseWrapper result = apiInstance.getClueResultFileUrl(getClueResultFileUrlRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClueScoreService#getClueResultFileUrl");
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
 **getClueResultFileUrlRequestWrapper** | [**GetClueResultFileUrlRequestWrapper**](GetClueResultFileUrlRequestWrapper.md)|  |

### Return type

[**GetClueResultFileUrlResponseWrapper**](GetClueResultFileUrlResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryClueTaskStatus

> QueryClueTaskStatusResponseWrapper queryClueTaskStatus(queryClueTaskStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cluescore.api.ClueScoreService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ClueScoreService apiInstance = new ClueScoreService(defaultClient);
        QueryClueTaskStatusRequestWrapper queryClueTaskStatusRequestWrapper = new QueryClueTaskStatusRequestWrapper(); // QueryClueTaskStatusRequestWrapper | 
        try {
            QueryClueTaskStatusResponseWrapper result = apiInstance.queryClueTaskStatus(queryClueTaskStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClueScoreService#queryClueTaskStatus");
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
 **queryClueTaskStatusRequestWrapper** | [**QueryClueTaskStatusRequestWrapper**](QueryClueTaskStatusRequestWrapper.md)|  |

### Return type

[**QueryClueTaskStatusResponseWrapper**](QueryClueTaskStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## submitClueTask

> SubmitClueTaskResponseWrapper submitClueTask(submitClueTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cluescore.api.ClueScoreService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ClueScoreService apiInstance = new ClueScoreService(defaultClient);
        SubmitClueTaskRequestWrapper submitClueTaskRequestWrapper = new SubmitClueTaskRequestWrapper(); // SubmitClueTaskRequestWrapper | 
        try {
            SubmitClueTaskResponseWrapper result = apiInstance.submitClueTask(submitClueTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClueScoreService#submitClueTask");
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
 **submitClueTaskRequestWrapper** | [**SubmitClueTaskRequestWrapper**](SubmitClueTaskRequestWrapper.md)|  |

### Return type

[**SubmitClueTaskResponseWrapper**](SubmitClueTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

