# SearchFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppIdNameFeed**](SearchFeedService.md#getAppIdNameFeed) | **POST** /json/feed/v1/SearchFeedService/getAppIdNameFeed | 
[**getAutoBidCost**](SearchFeedService.md#getAutoBidCost) | **POST** /json/feed/v1/SearchFeedService/getAutoBidCost | 
[**getBizAreaFeed**](SearchFeedService.md#getBizAreaFeed) | **POST** /json/feed/v1/SearchFeedService/getBizAreaFeed | 
[**getCoordinateFeed**](SearchFeedService.md#getCoordinateFeed) | **POST** /json/feed/v1/SearchFeedService/getCoordinateFeed | 
[**getMediaPackages**](SearchFeedService.md#getMediaPackages) | **POST** /json/feed/v1/SearchFeedService/getMediaPackages | 
[**getMedias**](SearchFeedService.md#getMedias) | **POST** /json/feed/v1/SearchFeedService/getMedias | 
[**getOcpcTransFeed**](SearchFeedService.md#getOcpcTransFeed) | **POST** /json/feed/v1/SearchFeedService/getOcpcTransFeed | 



## getAppIdNameFeed

> GetAppIdNameFeedResponseWrapper getAppIdNameFeed(getAppIdNameFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetAppIdNameFeedRequestWrapper getAppIdNameFeedRequestWrapper = new GetAppIdNameFeedRequestWrapper(); // GetAppIdNameFeedRequestWrapper | 
        try {
            GetAppIdNameFeedResponseWrapper result = apiInstance.getAppIdNameFeed(getAppIdNameFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getAppIdNameFeed");
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
 **getAppIdNameFeedRequestWrapper** | [**GetAppIdNameFeedRequestWrapper**](GetAppIdNameFeedRequestWrapper.md)|  |

### Return type

[**GetAppIdNameFeedResponseWrapper**](GetAppIdNameFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAutoBidCost

> GetAutoBidCostResponseWrapper getAutoBidCost(getAutoBidCostRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetAutoBidCostRequestWrapper getAutoBidCostRequestWrapper = new GetAutoBidCostRequestWrapper(); // GetAutoBidCostRequestWrapper | 
        try {
            GetAutoBidCostResponseWrapper result = apiInstance.getAutoBidCost(getAutoBidCostRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getAutoBidCost");
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
 **getAutoBidCostRequestWrapper** | [**GetAutoBidCostRequestWrapper**](GetAutoBidCostRequestWrapper.md)|  |

### Return type

[**GetAutoBidCostResponseWrapper**](GetAutoBidCostResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getBizAreaFeed

> GetBizAreaFeedResponseWrapper getBizAreaFeed(getBizAreaFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetBizAreaFeedRequestWrapper getBizAreaFeedRequestWrapper = new GetBizAreaFeedRequestWrapper(); // GetBizAreaFeedRequestWrapper | 
        try {
            GetBizAreaFeedResponseWrapper result = apiInstance.getBizAreaFeed(getBizAreaFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getBizAreaFeed");
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
 **getBizAreaFeedRequestWrapper** | [**GetBizAreaFeedRequestWrapper**](GetBizAreaFeedRequestWrapper.md)|  |

### Return type

[**GetBizAreaFeedResponseWrapper**](GetBizAreaFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCoordinateFeed

> GetCoordinateFeedResponseWrapper getCoordinateFeed(getCoordinateFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetCoordinateFeedRequestWrapper getCoordinateFeedRequestWrapper = new GetCoordinateFeedRequestWrapper(); // GetCoordinateFeedRequestWrapper | 
        try {
            GetCoordinateFeedResponseWrapper result = apiInstance.getCoordinateFeed(getCoordinateFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getCoordinateFeed");
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
 **getCoordinateFeedRequestWrapper** | [**GetCoordinateFeedRequestWrapper**](GetCoordinateFeedRequestWrapper.md)|  |

### Return type

[**GetCoordinateFeedResponseWrapper**](GetCoordinateFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getMediaPackages

> GetMediaPackagesResponseWrapper getMediaPackages(getMediaPackagesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetMediaPackagesRequestWrapper getMediaPackagesRequestWrapper = new GetMediaPackagesRequestWrapper(); // GetMediaPackagesRequestWrapper | 
        try {
            GetMediaPackagesResponseWrapper result = apiInstance.getMediaPackages(getMediaPackagesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getMediaPackages");
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
 **getMediaPackagesRequestWrapper** | [**GetMediaPackagesRequestWrapper**](GetMediaPackagesRequestWrapper.md)|  |

### Return type

[**GetMediaPackagesResponseWrapper**](GetMediaPackagesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getMedias

> GetMediasResponseWrapper getMedias(getMediasRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetMediasRequestWrapper getMediasRequestWrapper = new GetMediasRequestWrapper(); // GetMediasRequestWrapper | 
        try {
            GetMediasResponseWrapper result = apiInstance.getMedias(getMediasRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getMedias");
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
 **getMediasRequestWrapper** | [**GetMediasRequestWrapper**](GetMediasRequestWrapper.md)|  |

### Return type

[**GetMediasResponseWrapper**](GetMediasResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getOcpcTransFeed

> GetOcpcTransFeedResponseWrapper getOcpcTransFeed(getOcpcTransFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.searchfeed.api.SearchFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchFeedService apiInstance = new SearchFeedService(defaultClient);
        GetOcpcTransFeedRequestWrapper getOcpcTransFeedRequestWrapper = new GetOcpcTransFeedRequestWrapper(); // GetOcpcTransFeedRequestWrapper | 
        try {
            GetOcpcTransFeedResponseWrapper result = apiInstance.getOcpcTransFeed(getOcpcTransFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchFeedService#getOcpcTransFeed");
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
 **getOcpcTransFeedRequestWrapper** | [**GetOcpcTransFeedRequestWrapper**](GetOcpcTransFeedRequestWrapper.md)|  |

### Return type

[**GetOcpcTransFeedResponseWrapper**](GetOcpcTransFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

