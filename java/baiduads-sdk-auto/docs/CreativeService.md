# CreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCreative**](CreativeService.md#addCreative) | **POST** /json/sms/service/CreativeService/addCreative | 
[**deleteCreative**](CreativeService.md#deleteCreative) | **POST** /json/sms/service/CreativeService/deleteCreative | 
[**getCreative**](CreativeService.md#getCreative) | **POST** /json/sms/service/CreativeService/getCreative | 
[**getCreativeTemplate**](CreativeService.md#getCreativeTemplate) | **POST** /json/sms/service/CreativeService/getCreativeTemplate | 
[**updateCreative**](CreativeService.md#updateCreative) | **POST** /json/sms/service/CreativeService/updateCreative | 



## addCreative

> AddCreativeResponseWrapper addCreative(addCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeService apiInstance = new CreativeService(defaultClient);
        AddCreativeRequestWrapper addCreativeRequestWrapper = new AddCreativeRequestWrapper(); // AddCreativeRequestWrapper | 
        try {
            AddCreativeResponseWrapper result = apiInstance.addCreative(addCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeService#addCreative");
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
 **addCreativeRequestWrapper** | [**AddCreativeRequestWrapper**](AddCreativeRequestWrapper.md)|  |

### Return type

[**AddCreativeResponseWrapper**](AddCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreative

> DeleteCreativeResponseWrapper deleteCreative(deleteCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeService apiInstance = new CreativeService(defaultClient);
        DeleteCreativeRequestWrapper deleteCreativeRequestWrapper = new DeleteCreativeRequestWrapper(); // DeleteCreativeRequestWrapper | 
        try {
            DeleteCreativeResponseWrapper result = apiInstance.deleteCreative(deleteCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeService#deleteCreative");
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
 **deleteCreativeRequestWrapper** | [**DeleteCreativeRequestWrapper**](DeleteCreativeRequestWrapper.md)|  |

### Return type

[**DeleteCreativeResponseWrapper**](DeleteCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreative

> GetCreativeResponseWrapper getCreative(getCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeService apiInstance = new CreativeService(defaultClient);
        GetCreativeRequestWrapper getCreativeRequestWrapper = new GetCreativeRequestWrapper(); // GetCreativeRequestWrapper | 
        try {
            GetCreativeResponseWrapper result = apiInstance.getCreative(getCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeService#getCreative");
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
 **getCreativeRequestWrapper** | [**GetCreativeRequestWrapper**](GetCreativeRequestWrapper.md)|  |

### Return type

[**GetCreativeResponseWrapper**](GetCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeTemplate

> GetCreativeTemplateResponseWrapper getCreativeTemplate(getCreativeTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeService apiInstance = new CreativeService(defaultClient);
        GetCreativeTemplateRequestWrapper getCreativeTemplateRequestWrapper = new GetCreativeTemplateRequestWrapper(); // GetCreativeTemplateRequestWrapper | 
        try {
            GetCreativeTemplateResponseWrapper result = apiInstance.getCreativeTemplate(getCreativeTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeService#getCreativeTemplate");
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
 **getCreativeTemplateRequestWrapper** | [**GetCreativeTemplateRequestWrapper**](GetCreativeTemplateRequestWrapper.md)|  |

### Return type

[**GetCreativeTemplateResponseWrapper**](GetCreativeTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreative

> UpdateCreativeResponseWrapper updateCreative(updateCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeService apiInstance = new CreativeService(defaultClient);
        UpdateCreativeRequestWrapper updateCreativeRequestWrapper = new UpdateCreativeRequestWrapper(); // UpdateCreativeRequestWrapper | 
        try {
            UpdateCreativeResponseWrapper result = apiInstance.updateCreative(updateCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeService#updateCreative");
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
 **updateCreativeRequestWrapper** | [**UpdateCreativeRequestWrapper**](UpdateCreativeRequestWrapper.md)|  |

### Return type

[**UpdateCreativeResponseWrapper**](UpdateCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

