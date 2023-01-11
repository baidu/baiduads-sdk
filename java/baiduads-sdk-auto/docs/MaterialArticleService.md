# MaterialArticleService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addArticle**](MaterialArticleService.md#addArticle) | **POST** /json/sms/service/MaterialArticleService/addArticle | 
[**deleteArticle**](MaterialArticleService.md#deleteArticle) | **POST** /json/sms/service/MaterialArticleService/deleteArticle | 
[**getArticleList**](MaterialArticleService.md#getArticleList) | **POST** /json/sms/service/MaterialArticleService/getArticleList | 
[**updateArticle**](MaterialArticleService.md#updateArticle) | **POST** /json/sms/service/MaterialArticleService/updateArticle | 
[**updateCategory**](MaterialArticleService.md#updateCategory) | **POST** /json/sms/service/MaterialArticleService/updateCategory | 
[**updatePutaway**](MaterialArticleService.md#updatePutaway) | **POST** /json/sms/service/MaterialArticleService/updatePutaway | 
[**updateRank**](MaterialArticleService.md#updateRank) | **POST** /json/sms/service/MaterialArticleService/updateRank | 



## addArticle

> AddArticleResponseWrapper addArticle(addArticleRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        AddArticleRequestWrapper addArticleRequestWrapper = new AddArticleRequestWrapper(); // AddArticleRequestWrapper | 
        try {
            AddArticleResponseWrapper result = apiInstance.addArticle(addArticleRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#addArticle");
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
 **addArticleRequestWrapper** | [**AddArticleRequestWrapper**](AddArticleRequestWrapper.md)|  |

### Return type

[**AddArticleResponseWrapper**](AddArticleResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteArticle

> DeleteArticleResponseWrapper deleteArticle(deleteArticleRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        DeleteArticleRequestWrapper deleteArticleRequestWrapper = new DeleteArticleRequestWrapper(); // DeleteArticleRequestWrapper | 
        try {
            DeleteArticleResponseWrapper result = apiInstance.deleteArticle(deleteArticleRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#deleteArticle");
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
 **deleteArticleRequestWrapper** | [**DeleteArticleRequestWrapper**](DeleteArticleRequestWrapper.md)|  |

### Return type

[**DeleteArticleResponseWrapper**](DeleteArticleResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getArticleList

> GetArticleListResponseWrapper getArticleList(getArticleListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        GetArticleListRequestWrapper getArticleListRequestWrapper = new GetArticleListRequestWrapper(); // GetArticleListRequestWrapper | 
        try {
            GetArticleListResponseWrapper result = apiInstance.getArticleList(getArticleListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#getArticleList");
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
 **getArticleListRequestWrapper** | [**GetArticleListRequestWrapper**](GetArticleListRequestWrapper.md)|  |

### Return type

[**GetArticleListResponseWrapper**](GetArticleListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateArticle

> UpdateArticleResponseWrapper updateArticle(updateArticleRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        UpdateArticleRequestWrapper updateArticleRequestWrapper = new UpdateArticleRequestWrapper(); // UpdateArticleRequestWrapper | 
        try {
            UpdateArticleResponseWrapper result = apiInstance.updateArticle(updateArticleRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#updateArticle");
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
 **updateArticleRequestWrapper** | [**UpdateArticleRequestWrapper**](UpdateArticleRequestWrapper.md)|  |

### Return type

[**UpdateArticleResponseWrapper**](UpdateArticleResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCategory

> UpdateCategoryResponseWrapper updateCategory(updateCategoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = new UpdateCategoryRequestWrapper(); // UpdateCategoryRequestWrapper | 
        try {
            UpdateCategoryResponseWrapper result = apiInstance.updateCategory(updateCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#updateCategory");
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
 **updateCategoryRequestWrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updatePutaway

> UpdatePutawayResponseWrapper updatePutaway(updatePutawayRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = new UpdatePutawayRequestWrapper(); // UpdatePutawayRequestWrapper | 
        try {
            UpdatePutawayResponseWrapper result = apiInstance.updatePutaway(updatePutawayRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#updatePutaway");
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
 **updatePutawayRequestWrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateRank

> UpdateRankResponseWrapper updateRank(updateRankRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialarticle.api.MaterialArticleService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialArticleService apiInstance = new MaterialArticleService(defaultClient);
        UpdateRankRequestWrapper updateRankRequestWrapper = new UpdateRankRequestWrapper(); // UpdateRankRequestWrapper | 
        try {
            UpdateRankResponseWrapper result = apiInstance.updateRank(updateRankRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialArticleService#updateRank");
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
 **updateRankRequestWrapper** | [**UpdateRankRequestWrapper**](UpdateRankRequestWrapper.md)|  |

### Return type

[**UpdateRankResponseWrapper**](UpdateRankResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

