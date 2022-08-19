# IndexApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkKeywords**](IndexApiService.md#checkKeywords) | **POST** /json/sms/service/IndexApiService/checkKeywords | 
[**createTask**](IndexApiService.md#createTask) | **POST** /json/sms/service/IndexApiService/createTask | 
[**getResult**](IndexApiService.md#getResult) | **POST** /json/sms/service/IndexApiService/getResult | 
[**refreshAccessToken**](IndexApiService.md#refreshAccessToken) | **POST** /json/sms/service/IndexApiService/refreshAccessToken | 



## checkKeywords

> CheckKeywordsResponseWrapper checkKeywords(checkKeywordsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.indexapi.api.IndexApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndexApiService apiInstance = new IndexApiService(defaultClient);
        CheckKeywordsRequestWrapper checkKeywordsRequestWrapper = new CheckKeywordsRequestWrapper(); // CheckKeywordsRequestWrapper | 
        try {
            CheckKeywordsResponseWrapper result = apiInstance.checkKeywords(checkKeywordsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApiService#checkKeywords");
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
 **checkKeywordsRequestWrapper** | [**CheckKeywordsRequestWrapper**](CheckKeywordsRequestWrapper.md)|  |

### Return type

[**CheckKeywordsResponseWrapper**](CheckKeywordsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## createTask

> CreateTaskResponseWrapper createTask(createTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.indexapi.api.IndexApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndexApiService apiInstance = new IndexApiService(defaultClient);
        CreateTaskRequestWrapper createTaskRequestWrapper = new CreateTaskRequestWrapper(); // CreateTaskRequestWrapper | 
        try {
            CreateTaskResponseWrapper result = apiInstance.createTask(createTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApiService#createTask");
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
 **createTaskRequestWrapper** | [**CreateTaskRequestWrapper**](CreateTaskRequestWrapper.md)|  |

### Return type

[**CreateTaskResponseWrapper**](CreateTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getResult

> GetResultResponseWrapper getResult(getResultRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.indexapi.api.IndexApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndexApiService apiInstance = new IndexApiService(defaultClient);
        GetResultRequestWrapper getResultRequestWrapper = new GetResultRequestWrapper(); // GetResultRequestWrapper | 
        try {
            GetResultResponseWrapper result = apiInstance.getResult(getResultRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApiService#getResult");
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
 **getResultRequestWrapper** | [**GetResultRequestWrapper**](GetResultRequestWrapper.md)|  |

### Return type

[**GetResultResponseWrapper**](GetResultResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## refreshAccessToken

> RefreshAccessTokenResponseWrapper refreshAccessToken(refreshAccessTokenRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.indexapi.api.IndexApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndexApiService apiInstance = new IndexApiService(defaultClient);
        RefreshAccessTokenRequestWrapper refreshAccessTokenRequestWrapper = new RefreshAccessTokenRequestWrapper(); // RefreshAccessTokenRequestWrapper | 
        try {
            RefreshAccessTokenResponseWrapper result = apiInstance.refreshAccessToken(refreshAccessTokenRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApiService#refreshAccessToken");
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
 **refreshAccessTokenRequestWrapper** | [**RefreshAccessTokenRequestWrapper**](RefreshAccessTokenRequestWrapper.md)|  |

### Return type

[**RefreshAccessTokenResponseWrapper**](RefreshAccessTokenResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

