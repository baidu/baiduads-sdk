# SearchService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountById**](SearchService.md#getCountById) | **POST** /json/sms/service/SearchService/getCountById | 
[**getCreativeIdBySearch**](SearchService.md#getCreativeIdBySearch) | **POST** /json/sms/service/SearchService/getCreativeIdBySearch | 
[**getIdsByTabs**](SearchService.md#getIdsByTabs) | **POST** /json/sms/service/SearchService/getIdsByTabs | 
[**getKeywordIdBySearch**](SearchService.md#getKeywordIdBySearch) | **POST** /json/sms/service/SearchService/getKeywordIdBySearch | 
[**getMaterialInfoBySearch**](SearchService.md#getMaterialInfoBySearch) | **POST** /json/sms/service/SearchService/getMaterialInfoBySearch | 
[**getTab**](SearchService.md#getTab) | **POST** /json/sms/service/SearchService/getTab | 



## getCountById

> GetCountByIdResponseWrapper getCountById(getCountByIdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetCountByIdRequestWrapper getCountByIdRequestWrapper = new GetCountByIdRequestWrapper(); // GetCountByIdRequestWrapper | 
        try {
            GetCountByIdResponseWrapper result = apiInstance.getCountById(getCountByIdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getCountById");
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
 **getCountByIdRequestWrapper** | [**GetCountByIdRequestWrapper**](GetCountByIdRequestWrapper.md)|  |

### Return type

[**GetCountByIdResponseWrapper**](GetCountByIdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeIdBySearch

> GetCreativeIdBySearchResponseWrapper getCreativeIdBySearch(getCreativeIdBySearchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetCreativeIdBySearchRequestWrapper getCreativeIdBySearchRequestWrapper = new GetCreativeIdBySearchRequestWrapper(); // GetCreativeIdBySearchRequestWrapper | 
        try {
            GetCreativeIdBySearchResponseWrapper result = apiInstance.getCreativeIdBySearch(getCreativeIdBySearchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getCreativeIdBySearch");
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
 **getCreativeIdBySearchRequestWrapper** | [**GetCreativeIdBySearchRequestWrapper**](GetCreativeIdBySearchRequestWrapper.md)|  |

### Return type

[**GetCreativeIdBySearchResponseWrapper**](GetCreativeIdBySearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getIdsByTabs

> GetIdsByTabsResponseWrapper getIdsByTabs(getIdsByTabsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetIdsByTabsRequestWrapper getIdsByTabsRequestWrapper = new GetIdsByTabsRequestWrapper(); // GetIdsByTabsRequestWrapper | 
        try {
            GetIdsByTabsResponseWrapper result = apiInstance.getIdsByTabs(getIdsByTabsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getIdsByTabs");
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
 **getIdsByTabsRequestWrapper** | [**GetIdsByTabsRequestWrapper**](GetIdsByTabsRequestWrapper.md)|  |

### Return type

[**GetIdsByTabsResponseWrapper**](GetIdsByTabsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getKeywordIdBySearch

> GetKeywordIdBySearchResponseWrapper getKeywordIdBySearch(getKeywordIdBySearchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetKeywordIdBySearchRequestWrapper getKeywordIdBySearchRequestWrapper = new GetKeywordIdBySearchRequestWrapper(); // GetKeywordIdBySearchRequestWrapper | 
        try {
            GetKeywordIdBySearchResponseWrapper result = apiInstance.getKeywordIdBySearch(getKeywordIdBySearchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getKeywordIdBySearch");
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
 **getKeywordIdBySearchRequestWrapper** | [**GetKeywordIdBySearchRequestWrapper**](GetKeywordIdBySearchRequestWrapper.md)|  |

### Return type

[**GetKeywordIdBySearchResponseWrapper**](GetKeywordIdBySearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getMaterialInfoBySearch

> GetMaterialInfoBySearchResponseWrapper getMaterialInfoBySearch(getMaterialInfoBySearchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetMaterialInfoBySearchRequestWrapper getMaterialInfoBySearchRequestWrapper = new GetMaterialInfoBySearchRequestWrapper(); // GetMaterialInfoBySearchRequestWrapper | 
        try {
            GetMaterialInfoBySearchResponseWrapper result = apiInstance.getMaterialInfoBySearch(getMaterialInfoBySearchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getMaterialInfoBySearch");
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
 **getMaterialInfoBySearchRequestWrapper** | [**GetMaterialInfoBySearchRequestWrapper**](GetMaterialInfoBySearchRequestWrapper.md)|  |

### Return type

[**GetMaterialInfoBySearchResponseWrapper**](GetMaterialInfoBySearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTab

> GetTabResponseWrapper getTab(getTabRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.search.api.SearchService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SearchService apiInstance = new SearchService(defaultClient);
        GetTabRequestWrapper getTabRequestWrapper = new GetTabRequestWrapper(); // GetTabRequestWrapper | 
        try {
            GetTabResponseWrapper result = apiInstance.getTab(getTabRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchService#getTab");
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
 **getTabRequestWrapper** | [**GetTabRequestWrapper**](GetTabRequestWrapper.md)|  |

### Return type

[**GetTabResponseWrapper**](GetTabResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

