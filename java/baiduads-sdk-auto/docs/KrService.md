# KrService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFilePath**](KrService.md#getFilePath) | **POST** /json/sms/service/KRService/getFilePath | 
[**getFileStatus**](KrService.md#getFileStatus) | **POST** /json/sms/service/KRService/getFileStatus | 
[**getKRByQuery**](KrService.md#getKRByQuery) | **POST** /json/sms/service/KRService/getKRByQuery | 
[**getKRCustom**](KrService.md#getKRCustom) | **POST** /json/sms/service/KRService/getKRCustom | 
[**getKRFileIdByWords**](KrService.md#getKRFileIdByWords) | **POST** /json/sms/service/KRService/getKRFileIdByWords | 



## getFilePath

> GetFilePathResponseWrapper getFilePath(getFilePathRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.kr.api.KrService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KrService apiInstance = new KrService(defaultClient);
        GetFilePathRequestWrapper getFilePathRequestWrapper = new GetFilePathRequestWrapper(); // GetFilePathRequestWrapper | 
        try {
            GetFilePathResponseWrapper result = apiInstance.getFilePath(getFilePathRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KrService#getFilePath");
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
import com.baidu.dev2.api.sdk.kr.api.KrService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KrService apiInstance = new KrService(defaultClient);
        GetFileStatusRequestWrapper getFileStatusRequestWrapper = new GetFileStatusRequestWrapper(); // GetFileStatusRequestWrapper | 
        try {
            GetFileStatusResponseWrapper result = apiInstance.getFileStatus(getFileStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KrService#getFileStatus");
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


## getKRByQuery

> GetKRByQueryResponseWrapper getKRByQuery(getKRByQueryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.kr.api.KrService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KrService apiInstance = new KrService(defaultClient);
        GetKRByQueryRequestWrapper getKRByQueryRequestWrapper = new GetKRByQueryRequestWrapper(); // GetKRByQueryRequestWrapper | 
        try {
            GetKRByQueryResponseWrapper result = apiInstance.getKRByQuery(getKRByQueryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KrService#getKRByQuery");
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
 **getKRByQueryRequestWrapper** | [**GetKRByQueryRequestWrapper**](GetKRByQueryRequestWrapper.md)|  |

### Return type

[**GetKRByQueryResponseWrapper**](GetKRByQueryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getKRCustom

> GetKRCustomResponseWrapper getKRCustom(getKRCustomRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.kr.api.KrService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KrService apiInstance = new KrService(defaultClient);
        GetKRCustomRequestWrapper getKRCustomRequestWrapper = new GetKRCustomRequestWrapper(); // GetKRCustomRequestWrapper | 
        try {
            GetKRCustomResponseWrapper result = apiInstance.getKRCustom(getKRCustomRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KrService#getKRCustom");
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
 **getKRCustomRequestWrapper** | [**GetKRCustomRequestWrapper**](GetKRCustomRequestWrapper.md)|  |

### Return type

[**GetKRCustomResponseWrapper**](GetKRCustomResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getKRFileIdByWords

> GetKRFileIdByWordsResponseWrapper getKRFileIdByWords(getKRFileIdByWordsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.kr.api.KrService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KrService apiInstance = new KrService(defaultClient);
        GetKRFileIdByWordsRequestWrapper getKRFileIdByWordsRequestWrapper = new GetKRFileIdByWordsRequestWrapper(); // GetKRFileIdByWordsRequestWrapper | 
        try {
            GetKRFileIdByWordsResponseWrapper result = apiInstance.getKRFileIdByWords(getKRFileIdByWordsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KrService#getKRFileIdByWords");
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
 **getKRFileIdByWordsRequestWrapper** | [**GetKRFileIdByWordsRequestWrapper**](GetKRFileIdByWordsRequestWrapper.md)|  |

### Return type

[**GetKRFileIdByWordsResponseWrapper**](GetKRFileIdByWordsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

