# CreativeFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCreativeFeed**](CreativeFeedService.md#addCreativeFeed) | **POST** /json/feed/v1/CreativeFeedService/addCreativeFeed | 
[**bindRecommendReasons**](CreativeFeedService.md#bindRecommendReasons) | **POST** /json/feed/v1/CreativeFeedService/bindRecommendReasons | 
[**deleteCreativeFeed**](CreativeFeedService.md#deleteCreativeFeed) | **POST** /json/feed/v1/CreativeFeedService/deleteCreativeFeed | 
[**getCreativeFeed**](CreativeFeedService.md#getCreativeFeed) | **POST** /json/feed/v1/CreativeFeedService/getCreativeFeed | 
[**getCreativeFeedPreviewUrlWithPreviewSource**](CreativeFeedService.md#getCreativeFeedPreviewUrlWithPreviewSource) | **POST** /json/feed/v1/CreativeFeedService/getCreativeFeedPreviewUrlWithPreviewSource | 
[**getTempCreativeFeedPreviewUrl**](CreativeFeedService.md#getTempCreativeFeedPreviewUrl) | **POST** /json/feed/v1/CreativeFeedService/getTempCreativeFeedPreviewUrl | 
[**queryRecommendReasons**](CreativeFeedService.md#queryRecommendReasons) | **POST** /json/feed/v1/CreativeFeedService/queryRecommendReasons | 
[**updateCreativeFeed**](CreativeFeedService.md#updateCreativeFeed) | **POST** /json/feed/v1/CreativeFeedService/updateCreativeFeed | 



## addCreativeFeed

> AddCreativeFeedResponseWrapper addCreativeFeed(addCreativeFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper = new AddCreativeFeedRequestWrapper(); // AddCreativeFeedRequestWrapper | 
        try {
            AddCreativeFeedResponseWrapper result = apiInstance.addCreativeFeed(addCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#addCreativeFeed");
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


## bindRecommendReasons

> BindRecommendReasonsResponseWrapper bindRecommendReasons(bindRecommendReasonsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        BindRecommendReasonsRequestWrapper bindRecommendReasonsRequestWrapper = new BindRecommendReasonsRequestWrapper(); // BindRecommendReasonsRequestWrapper | 
        try {
            BindRecommendReasonsResponseWrapper result = apiInstance.bindRecommendReasons(bindRecommendReasonsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#bindRecommendReasons");
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
 **bindRecommendReasonsRequestWrapper** | [**BindRecommendReasonsRequestWrapper**](BindRecommendReasonsRequestWrapper.md)|  |

### Return type

[**BindRecommendReasonsResponseWrapper**](BindRecommendReasonsResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        DeleteCreativeFeedRequestWrapper deleteCreativeFeedRequestWrapper = new DeleteCreativeFeedRequestWrapper(); // DeleteCreativeFeedRequestWrapper | 
        try {
            DeleteCreativeFeedResponseWrapper result = apiInstance.deleteCreativeFeed(deleteCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#deleteCreativeFeed");
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
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        GetCreativeFeedRequestWrapper getCreativeFeedRequestWrapper = new GetCreativeFeedRequestWrapper(); // GetCreativeFeedRequestWrapper | 
        try {
            GetCreativeFeedResponseWrapper result = apiInstance.getCreativeFeed(getCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#getCreativeFeed");
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


## getCreativeFeedPreviewUrlWithPreviewSource

> GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper getCreativeFeedPreviewUrlWithPreviewSource(getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper = new GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper(); // GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper | 
        try {
            GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper result = apiInstance.getCreativeFeedPreviewUrlWithPreviewSource(getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#getCreativeFeedPreviewUrlWithPreviewSource");
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
 **getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper** | [**GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper**](GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper.md)|  |

### Return type

[**GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper**](GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTempCreativeFeedPreviewUrl

> GetTempCreativeFeedPreviewUrlResponseWrapper getTempCreativeFeedPreviewUrl(getTempCreativeFeedPreviewUrlRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        GetTempCreativeFeedPreviewUrlRequestWrapper getTempCreativeFeedPreviewUrlRequestWrapper = new GetTempCreativeFeedPreviewUrlRequestWrapper(); // GetTempCreativeFeedPreviewUrlRequestWrapper | 
        try {
            GetTempCreativeFeedPreviewUrlResponseWrapper result = apiInstance.getTempCreativeFeedPreviewUrl(getTempCreativeFeedPreviewUrlRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#getTempCreativeFeedPreviewUrl");
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
 **getTempCreativeFeedPreviewUrlRequestWrapper** | [**GetTempCreativeFeedPreviewUrlRequestWrapper**](GetTempCreativeFeedPreviewUrlRequestWrapper.md)|  |

### Return type

[**GetTempCreativeFeedPreviewUrlResponseWrapper**](GetTempCreativeFeedPreviewUrlResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryRecommendReasons

> QueryRecommendReasonsResponseWrapper queryRecommendReasons(queryRecommendReasonsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        QueryRecommendReasonsRequestWrapper queryRecommendReasonsRequestWrapper = new QueryRecommendReasonsRequestWrapper(); // QueryRecommendReasonsRequestWrapper | 
        try {
            QueryRecommendReasonsResponseWrapper result = apiInstance.queryRecommendReasons(queryRecommendReasonsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#queryRecommendReasons");
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
 **queryRecommendReasonsRequestWrapper** | [**QueryRecommendReasonsRequestWrapper**](QueryRecommendReasonsRequestWrapper.md)|  |

### Return type

[**QueryRecommendReasonsResponseWrapper**](QueryRecommendReasonsResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CreativeFeedService apiInstance = new CreativeFeedService(defaultClient);
        UpdateCreativeFeedRequestWrapper updateCreativeFeedRequestWrapper = new UpdateCreativeFeedRequestWrapper(); // UpdateCreativeFeedRequestWrapper | 
        try {
            UpdateCreativeFeedResponseWrapper result = apiInstance.updateCreativeFeed(updateCreativeFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeFeedService#updateCreativeFeed");
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

