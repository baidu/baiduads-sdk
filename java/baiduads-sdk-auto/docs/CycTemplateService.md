# CycTemplateService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTemplate**](CycTemplateService.md#addTemplate) | **POST** /json/sms/service/CycTemplateService/addTemplate | 
[**deleteTemplate**](CycTemplateService.md#deleteTemplate) | **POST** /json/sms/service/CycTemplateService/deleteTemplate | 
[**getBindCycTemplate**](CycTemplateService.md#getBindCycTemplate) | **POST** /json/sms/service/CycTemplateService/getBindCycTemplate | 
[**getTemplate**](CycTemplateService.md#getTemplate) | **POST** /json/sms/service/CycTemplateService/getTemplate | 
[**updateTemplate**](CycTemplateService.md#updateTemplate) | **POST** /json/sms/service/CycTemplateService/updateTemplate | 



## addTemplate

> AddTemplateResponseWrapper addTemplate(addTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cyctemplate.api.CycTemplateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CycTemplateService apiInstance = new CycTemplateService(defaultClient);
        AddTemplateRequestWrapper addTemplateRequestWrapper = new AddTemplateRequestWrapper(); // AddTemplateRequestWrapper | 
        try {
            AddTemplateResponseWrapper result = apiInstance.addTemplate(addTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CycTemplateService#addTemplate");
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
 **addTemplateRequestWrapper** | [**AddTemplateRequestWrapper**](AddTemplateRequestWrapper.md)|  |

### Return type

[**AddTemplateResponseWrapper**](AddTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteTemplate

> DeleteTemplateResponseWrapper deleteTemplate(deleteTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cyctemplate.api.CycTemplateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CycTemplateService apiInstance = new CycTemplateService(defaultClient);
        DeleteTemplateRequestWrapper deleteTemplateRequestWrapper = new DeleteTemplateRequestWrapper(); // DeleteTemplateRequestWrapper | 
        try {
            DeleteTemplateResponseWrapper result = apiInstance.deleteTemplate(deleteTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CycTemplateService#deleteTemplate");
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
 **deleteTemplateRequestWrapper** | [**DeleteTemplateRequestWrapper**](DeleteTemplateRequestWrapper.md)|  |

### Return type

[**DeleteTemplateResponseWrapper**](DeleteTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getBindCycTemplate

> GetBindCycTemplateResponseWrapper getBindCycTemplate(getBindCycTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cyctemplate.api.CycTemplateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CycTemplateService apiInstance = new CycTemplateService(defaultClient);
        GetBindCycTemplateRequestWrapper getBindCycTemplateRequestWrapper = new GetBindCycTemplateRequestWrapper(); // GetBindCycTemplateRequestWrapper | 
        try {
            GetBindCycTemplateResponseWrapper result = apiInstance.getBindCycTemplate(getBindCycTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CycTemplateService#getBindCycTemplate");
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
 **getBindCycTemplateRequestWrapper** | [**GetBindCycTemplateRequestWrapper**](GetBindCycTemplateRequestWrapper.md)|  |

### Return type

[**GetBindCycTemplateResponseWrapper**](GetBindCycTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTemplate

> GetTemplateResponseWrapper getTemplate(getTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cyctemplate.api.CycTemplateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CycTemplateService apiInstance = new CycTemplateService(defaultClient);
        GetTemplateRequestWrapper getTemplateRequestWrapper = new GetTemplateRequestWrapper(); // GetTemplateRequestWrapper | 
        try {
            GetTemplateResponseWrapper result = apiInstance.getTemplate(getTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CycTemplateService#getTemplate");
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
 **getTemplateRequestWrapper** | [**GetTemplateRequestWrapper**](GetTemplateRequestWrapper.md)|  |

### Return type

[**GetTemplateResponseWrapper**](GetTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateTemplate

> UpdateTemplateResponseWrapper updateTemplate(updateTemplateRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.cyctemplate.api.CycTemplateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CycTemplateService apiInstance = new CycTemplateService(defaultClient);
        UpdateTemplateRequestWrapper updateTemplateRequestWrapper = new UpdateTemplateRequestWrapper(); // UpdateTemplateRequestWrapper | 
        try {
            UpdateTemplateResponseWrapper result = apiInstance.updateTemplate(updateTemplateRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CycTemplateService#updateTemplate");
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
 **updateTemplateRequestWrapper** | [**UpdateTemplateRequestWrapper**](UpdateTemplateRequestWrapper.md)|  |

### Return type

[**UpdateTemplateResponseWrapper**](UpdateTemplateResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

