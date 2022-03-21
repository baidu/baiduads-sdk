# JmySiteService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPage**](JmySiteService.md#createPage) | **POST** /json/sms/service/JmySiteService/createPage | 
[**deletePage**](JmySiteService.md#deletePage) | **POST** /json/sms/service/JmySiteService/deletePage | 
[**editPage**](JmySiteService.md#editPage) | **POST** /json/sms/service/JmySiteService/editPage | 
[**getPageDetail**](JmySiteService.md#getPageDetail) | **POST** /json/sms/service/JmySiteService/getPageDetail | 
[**getPageList**](JmySiteService.md#getPageList) | **POST** /json/sms/service/JmySiteService/getPageList | 
[**previewPage**](JmySiteService.md#previewPage) | **POST** /json/sms/service/JmySiteService/previewPage | 



## createPage

> CreatePageResponseWrapper createPage(createPageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        CreatePageRequestWrapper createPageRequestWrapper = new CreatePageRequestWrapper(); // CreatePageRequestWrapper | 
        try {
            CreatePageResponseWrapper result = apiInstance.createPage(createPageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#createPage");
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
 **createPageRequestWrapper** | [**CreatePageRequestWrapper**](CreatePageRequestWrapper.md)|  |

### Return type

[**CreatePageResponseWrapper**](CreatePageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deletePage

> DeletePageResponseWrapper deletePage(deletePageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        DeletePageRequestWrapper deletePageRequestWrapper = new DeletePageRequestWrapper(); // DeletePageRequestWrapper | 
        try {
            DeletePageResponseWrapper result = apiInstance.deletePage(deletePageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#deletePage");
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
 **deletePageRequestWrapper** | [**DeletePageRequestWrapper**](DeletePageRequestWrapper.md)|  |

### Return type

[**DeletePageResponseWrapper**](DeletePageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## editPage

> EditPageResponseWrapper editPage(editPageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        EditPageRequestWrapper editPageRequestWrapper = new EditPageRequestWrapper(); // EditPageRequestWrapper | 
        try {
            EditPageResponseWrapper result = apiInstance.editPage(editPageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#editPage");
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
 **editPageRequestWrapper** | [**EditPageRequestWrapper**](EditPageRequestWrapper.md)|  |

### Return type

[**EditPageResponseWrapper**](EditPageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getPageDetail

> GetPageDetailResponseWrapper getPageDetail(getPageDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        GetPageDetailRequestWrapper getPageDetailRequestWrapper = new GetPageDetailRequestWrapper(); // GetPageDetailRequestWrapper | 
        try {
            GetPageDetailResponseWrapper result = apiInstance.getPageDetail(getPageDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#getPageDetail");
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
 **getPageDetailRequestWrapper** | [**GetPageDetailRequestWrapper**](GetPageDetailRequestWrapper.md)|  |

### Return type

[**GetPageDetailResponseWrapper**](GetPageDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getPageList

> GetPageListResponseWrapper getPageList(getPageListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        GetPageListRequestWrapper getPageListRequestWrapper = new GetPageListRequestWrapper(); // GetPageListRequestWrapper | 
        try {
            GetPageListResponseWrapper result = apiInstance.getPageList(getPageListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#getPageList");
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
 **getPageListRequestWrapper** | [**GetPageListRequestWrapper**](GetPageListRequestWrapper.md)|  |

### Return type

[**GetPageListResponseWrapper**](GetPageListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## previewPage

> PreviewPageResponseWrapper previewPage(previewPageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.jmysite.api.JmySiteService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        JmySiteService apiInstance = new JmySiteService(defaultClient);
        PreviewPageRequestWrapper previewPageRequestWrapper = new PreviewPageRequestWrapper(); // PreviewPageRequestWrapper | 
        try {
            PreviewPageResponseWrapper result = apiInstance.previewPage(previewPageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JmySiteService#previewPage");
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
 **previewPageRequestWrapper** | [**PreviewPageRequestWrapper**](PreviewPageRequestWrapper.md)|  |

### Return type

[**PreviewPageResponseWrapper**](PreviewPageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

