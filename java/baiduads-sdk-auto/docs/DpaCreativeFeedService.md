# DpaCreativeFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCreativeFeed**](DpaCreativeFeedService.md#addCreativeFeed) | **POST** /json/feed/v1/DpaCreativeFeedService/addCreativeFeed | 
[**deleteCreativeFeed**](DpaCreativeFeedService.md#deleteCreativeFeed) | **POST** /json/feed/v1/DpaCreativeFeedService/deleteCreativeFeed | 
[**getCreativeFeed**](DpaCreativeFeedService.md#getCreativeFeed) | **POST** /json/feed/v1/DpaCreativeFeedService/getCreativeFeed | 
[**getCreativePreview**](DpaCreativeFeedService.md#getCreativePreview) | **POST** /json/feed/v1/DpaCreativeFeedService/getCreativePreview | 
[**getSymbolFields**](DpaCreativeFeedService.md#getSymbolFields) | **POST** /json/feed/v1/DpaCreativeFeedService/getSymbolFields | 
[**updateCreativeFeed**](DpaCreativeFeedService.md#updateCreativeFeed) | **POST** /json/feed/v1/DpaCreativeFeedService/updateCreativeFeed | 



## addCreativeFeed

> AddCreativeFeedResponseWrapper addCreativeFeed(addCreativeFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper = new AddCreativeFeedRequestWrapper(); // AddCreativeFeedRequestWrapper | 
        try {
            AddCreativeFeedResponseWrapper result = apiInstance.addCreativeFeed(addCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#addCreativeFeed");
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
 **addCreativeFeedRequestWrapper** | [**AddCreativeFeedRequestWrapper**](AddCreativeFeedRequestWrapper.md)|  |

### Return type

[**AddCreativeFeedResponseWrapper**](AddCreativeFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreativeFeed

> DeleteCreativeFeedResponseWrapper deleteCreativeFeed(deleteCreativeFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        DeleteCreativeFeedRequestWrapper deleteCreativeFeedRequestWrapper = new DeleteCreativeFeedRequestWrapper(); // DeleteCreativeFeedRequestWrapper | 
        try {
            DeleteCreativeFeedResponseWrapper result = apiInstance.deleteCreativeFeed(deleteCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#deleteCreativeFeed");
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
 **deleteCreativeFeedRequestWrapper** | [**DeleteCreativeFeedRequestWrapper**](DeleteCreativeFeedRequestWrapper.md)|  |

### Return type

[**DeleteCreativeFeedResponseWrapper**](DeleteCreativeFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeFeed

> GetCreativeFeedResponseWrapper getCreativeFeed(getCreativeFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        GetCreativeFeedRequestWrapper getCreativeFeedRequestWrapper = new GetCreativeFeedRequestWrapper(); // GetCreativeFeedRequestWrapper | 
        try {
            GetCreativeFeedResponseWrapper result = apiInstance.getCreativeFeed(getCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#getCreativeFeed");
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
 **getCreativeFeedRequestWrapper** | [**GetCreativeFeedRequestWrapper**](GetCreativeFeedRequestWrapper.md)|  |

### Return type

[**GetCreativeFeedResponseWrapper**](GetCreativeFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativePreview

> GetCreativePreviewResponseWrapper getCreativePreview(getCreativePreviewRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        GetCreativePreviewRequestWrapper getCreativePreviewRequestWrapper = new GetCreativePreviewRequestWrapper(); // GetCreativePreviewRequestWrapper | 
        try {
            GetCreativePreviewResponseWrapper result = apiInstance.getCreativePreview(getCreativePreviewRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#getCreativePreview");
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
 **getCreativePreviewRequestWrapper** | [**GetCreativePreviewRequestWrapper**](GetCreativePreviewRequestWrapper.md)|  |

### Return type

[**GetCreativePreviewResponseWrapper**](GetCreativePreviewResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSymbolFields

> GetSymbolFieldsResponseWrapper getSymbolFields(getSymbolFieldsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        GetSymbolFieldsRequestWrapper getSymbolFieldsRequestWrapper = new GetSymbolFieldsRequestWrapper(); // GetSymbolFieldsRequestWrapper | 
        try {
            GetSymbolFieldsResponseWrapper result = apiInstance.getSymbolFields(getSymbolFieldsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#getSymbolFields");
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
 **getSymbolFieldsRequestWrapper** | [**GetSymbolFieldsRequestWrapper**](GetSymbolFieldsRequestWrapper.md)|  |

### Return type

[**GetSymbolFieldsResponseWrapper**](GetSymbolFieldsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreativeFeed

> UpdateCreativeFeedResponseWrapper updateCreativeFeed(updateCreativeFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreativefeed.api.DpaCreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeFeedService apiInstance = new DpaCreativeFeedService(defaultClient);
        UpdateCreativeFeedRequestWrapper updateCreativeFeedRequestWrapper = new UpdateCreativeFeedRequestWrapper(); // UpdateCreativeFeedRequestWrapper | 
        try {
            UpdateCreativeFeedResponseWrapper result = apiInstance.updateCreativeFeed(updateCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeFeedService#updateCreativeFeed");
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
 **updateCreativeFeedRequestWrapper** | [**UpdateCreativeFeedRequestWrapper**](UpdateCreativeFeedRequestWrapper.md)|  |

### Return type

[**UpdateCreativeFeedResponseWrapper**](UpdateCreativeFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

