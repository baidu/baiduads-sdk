# AdviceService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptAdvice**](AdviceService.md#acceptAdvice) | **POST** /json/sms/service/AdviceService/acceptAdvice | 
[**acceptFeedAdvice**](AdviceService.md#acceptFeedAdvice) | **POST** /json/sms/service/AdviceService/acceptFeedAdvice | 
[**downloadAdvice**](AdviceService.md#downloadAdvice) | **POST** /json/sms/service/AdviceService/downloadAdvice | 
[**queryDetail**](AdviceService.md#queryDetail) | **POST** /json/sms/service/AdviceService/queryDetail | 
[**queryFeedDetail**](AdviceService.md#queryFeedDetail) | **POST** /json/sms/service/AdviceService/queryFeedDetail | 
[**queryFeedOutline**](AdviceService.md#queryFeedOutline) | **POST** /json/sms/service/AdviceService/queryFeedOutline | 



## acceptAdvice

> AcceptAdviceResponseWrapper acceptAdvice(acceptAdviceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        AcceptAdviceRequestWrapper acceptAdviceRequestWrapper = new AcceptAdviceRequestWrapper(); // AcceptAdviceRequestWrapper | 
        try {
            AcceptAdviceResponseWrapper result = apiInstance.acceptAdvice(acceptAdviceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#acceptAdvice");
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
 **acceptAdviceRequestWrapper** | [**AcceptAdviceRequestWrapper**](AcceptAdviceRequestWrapper.md)|  |

### Return type

[**AcceptAdviceResponseWrapper**](AcceptAdviceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## acceptFeedAdvice

> AcceptFeedAdviceResponseWrapper acceptFeedAdvice(acceptFeedAdviceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        AcceptFeedAdviceRequestWrapper acceptFeedAdviceRequestWrapper = new AcceptFeedAdviceRequestWrapper(); // AcceptFeedAdviceRequestWrapper | 
        try {
            AcceptFeedAdviceResponseWrapper result = apiInstance.acceptFeedAdvice(acceptFeedAdviceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#acceptFeedAdvice");
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
 **acceptFeedAdviceRequestWrapper** | [**AcceptFeedAdviceRequestWrapper**](AcceptFeedAdviceRequestWrapper.md)|  |

### Return type

[**AcceptFeedAdviceResponseWrapper**](AcceptFeedAdviceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## downloadAdvice

> DownloadAdviceResponseWrapper downloadAdvice(downloadAdviceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        DownloadAdviceRequestWrapper downloadAdviceRequestWrapper = new DownloadAdviceRequestWrapper(); // DownloadAdviceRequestWrapper | 
        try {
            DownloadAdviceResponseWrapper result = apiInstance.downloadAdvice(downloadAdviceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#downloadAdvice");
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
 **downloadAdviceRequestWrapper** | [**DownloadAdviceRequestWrapper**](DownloadAdviceRequestWrapper.md)|  |

### Return type

[**DownloadAdviceResponseWrapper**](DownloadAdviceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryDetail

> QueryDetailResponseWrapper queryDetail(queryDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        QueryDetailRequestWrapper queryDetailRequestWrapper = new QueryDetailRequestWrapper(); // QueryDetailRequestWrapper | 
        try {
            QueryDetailResponseWrapper result = apiInstance.queryDetail(queryDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#queryDetail");
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
 **queryDetailRequestWrapper** | [**QueryDetailRequestWrapper**](QueryDetailRequestWrapper.md)|  |

### Return type

[**QueryDetailResponseWrapper**](QueryDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryFeedDetail

> QueryFeedDetailResponseWrapper queryFeedDetail(queryFeedDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        QueryFeedDetailRequestWrapper queryFeedDetailRequestWrapper = new QueryFeedDetailRequestWrapper(); // QueryFeedDetailRequestWrapper | 
        try {
            QueryFeedDetailResponseWrapper result = apiInstance.queryFeedDetail(queryFeedDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#queryFeedDetail");
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
 **queryFeedDetailRequestWrapper** | [**QueryFeedDetailRequestWrapper**](QueryFeedDetailRequestWrapper.md)|  |

### Return type

[**QueryFeedDetailResponseWrapper**](QueryFeedDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryFeedOutline

> QueryFeedOutlineResponseWrapper queryFeedOutline(queryFeedOutlineRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advice.api.AdviceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceService apiInstance = new AdviceService(defaultClient);
        QueryFeedOutlineRequestWrapper queryFeedOutlineRequestWrapper = new QueryFeedOutlineRequestWrapper(); // QueryFeedOutlineRequestWrapper | 
        try {
            QueryFeedOutlineResponseWrapper result = apiInstance.queryFeedOutline(queryFeedOutlineRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceService#queryFeedOutline");
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
 **queryFeedOutlineRequestWrapper** | [**QueryFeedOutlineRequestWrapper**](QueryFeedOutlineRequestWrapper.md)|  |

### Return type

[**QueryFeedOutlineResponseWrapper**](QueryFeedOutlineResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

