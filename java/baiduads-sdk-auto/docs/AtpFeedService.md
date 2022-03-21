# AtpFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAtpFeed**](AtpFeedService.md#addAtpFeed) | **POST** /json/feed/v1/AtpFeedService/addAtpFeed | 
[**bindAtpFeed**](AtpFeedService.md#bindAtpFeed) | **POST** /json/feed/v1/AtpFeedService/bindAtpFeed | 
[**deleteAtpFeed**](AtpFeedService.md#deleteAtpFeed) | **POST** /json/feed/v1/AtpFeedService/deleteAtpFeed | 
[**getAtpFeed**](AtpFeedService.md#getAtpFeed) | **POST** /json/feed/v1/AtpFeedService/getAtpFeed | 
[**updateAtpFeed**](AtpFeedService.md#updateAtpFeed) | **POST** /json/feed/v1/AtpFeedService/updateAtpFeed | 



## addAtpFeed

> AddAtpFeedResponseWrapper addAtpFeed(addAtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.atpfeed.api.AtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AtpFeedService apiInstance = new AtpFeedService(defaultClient);
        AddAtpFeedRequestWrapper addAtpFeedRequestWrapper = new AddAtpFeedRequestWrapper(); // AddAtpFeedRequestWrapper | 
        try {
            AddAtpFeedResponseWrapper result = apiInstance.addAtpFeed(addAtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AtpFeedService#addAtpFeed");
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
 **addAtpFeedRequestWrapper** | [**AddAtpFeedRequestWrapper**](AddAtpFeedRequestWrapper.md)|  |

### Return type

[**AddAtpFeedResponseWrapper**](AddAtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## bindAtpFeed

> BindAtpFeedResponseWrapper bindAtpFeed(bindAtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.atpfeed.api.AtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AtpFeedService apiInstance = new AtpFeedService(defaultClient);
        BindAtpFeedRequestWrapper bindAtpFeedRequestWrapper = new BindAtpFeedRequestWrapper(); // BindAtpFeedRequestWrapper | 
        try {
            BindAtpFeedResponseWrapper result = apiInstance.bindAtpFeed(bindAtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AtpFeedService#bindAtpFeed");
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
 **bindAtpFeedRequestWrapper** | [**BindAtpFeedRequestWrapper**](BindAtpFeedRequestWrapper.md)|  |

### Return type

[**BindAtpFeedResponseWrapper**](BindAtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteAtpFeed

> DeleteAtpFeedResponseWrapper deleteAtpFeed(deleteAtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.atpfeed.api.AtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AtpFeedService apiInstance = new AtpFeedService(defaultClient);
        DeleteAtpFeedRequestWrapper deleteAtpFeedRequestWrapper = new DeleteAtpFeedRequestWrapper(); // DeleteAtpFeedRequestWrapper | 
        try {
            DeleteAtpFeedResponseWrapper result = apiInstance.deleteAtpFeed(deleteAtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AtpFeedService#deleteAtpFeed");
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
 **deleteAtpFeedRequestWrapper** | [**DeleteAtpFeedRequestWrapper**](DeleteAtpFeedRequestWrapper.md)|  |

### Return type

[**DeleteAtpFeedResponseWrapper**](DeleteAtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAtpFeed

> GetAtpFeedResponseWrapper getAtpFeed(getAtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.atpfeed.api.AtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AtpFeedService apiInstance = new AtpFeedService(defaultClient);
        GetAtpFeedRequestWrapper getAtpFeedRequestWrapper = new GetAtpFeedRequestWrapper(); // GetAtpFeedRequestWrapper | 
        try {
            GetAtpFeedResponseWrapper result = apiInstance.getAtpFeed(getAtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AtpFeedService#getAtpFeed");
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
 **getAtpFeedRequestWrapper** | [**GetAtpFeedRequestWrapper**](GetAtpFeedRequestWrapper.md)|  |

### Return type

[**GetAtpFeedResponseWrapper**](GetAtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAtpFeed

> UpdateAtpFeedResponseWrapper updateAtpFeed(updateAtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.atpfeed.api.AtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AtpFeedService apiInstance = new AtpFeedService(defaultClient);
        UpdateAtpFeedRequestWrapper updateAtpFeedRequestWrapper = new UpdateAtpFeedRequestWrapper(); // UpdateAtpFeedRequestWrapper | 
        try {
            UpdateAtpFeedResponseWrapper result = apiInstance.updateAtpFeed(updateAtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AtpFeedService#updateAtpFeed");
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
 **updateAtpFeedRequestWrapper** | [**UpdateAtpFeedRequestWrapper**](UpdateAtpFeedRequestWrapper.md)|  |

### Return type

[**UpdateAtpFeedResponseWrapper**](UpdateAtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

