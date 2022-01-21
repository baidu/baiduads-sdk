# ProductAdsKeywordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWord**](ProductAdsKeywordService.md#addWord) | **POST** /json/sms/service/ProductAdsKeywordService/addWord | 
[**deleteWord**](ProductAdsKeywordService.md#deleteWord) | **POST** /json/sms/service/ProductAdsKeywordService/deleteWord | 
[**getPagedWord**](ProductAdsKeywordService.md#getPagedWord) | **POST** /json/sms/service/ProductAdsKeywordService/getPagedWord | 
[**pauseKeyword**](ProductAdsKeywordService.md#pauseKeyword) | **POST** /json/sms/service/ProductAdsKeywordService/pauseKeyword | 
[**startKeyword**](ProductAdsKeywordService.md#startKeyword) | **POST** /json/sms/service/ProductAdsKeywordService/startKeyword | 
[**updateMatchType**](ProductAdsKeywordService.md#updateMatchType) | **POST** /json/sms/service/ProductAdsKeywordService/updateMatchType | 
[**updatePrice**](ProductAdsKeywordService.md#updatePrice) | **POST** /json/sms/service/ProductAdsKeywordService/updatePrice | 
[**updateTargetUrl**](ProductAdsKeywordService.md#updateTargetUrl) | **POST** /json/sms/service/ProductAdsKeywordService/updateTargetUrl | 



## addWord

> AddWordResponseWrapper addWord(addWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        AddWordRequestWrapper addWordRequestWrapper = new AddWordRequestWrapper(); // AddWordRequestWrapper | 
        try {
            AddWordResponseWrapper result = apiInstance.addWord(addWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#addWord");
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
 **addWordRequestWrapper** | [**AddWordRequestWrapper**](AddWordRequestWrapper.md)|  |

### Return type

[**AddWordResponseWrapper**](AddWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteWord

> DeleteWordResponseWrapper deleteWord(deleteWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        DeleteWordRequestWrapper deleteWordRequestWrapper = new DeleteWordRequestWrapper(); // DeleteWordRequestWrapper | 
        try {
            DeleteWordResponseWrapper result = apiInstance.deleteWord(deleteWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#deleteWord");
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
 **deleteWordRequestWrapper** | [**DeleteWordRequestWrapper**](DeleteWordRequestWrapper.md)|  |

### Return type

[**DeleteWordResponseWrapper**](DeleteWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getPagedWord

> GetPagedWordResponseWrapper getPagedWord(getPagedWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        GetPagedWordRequestWrapper getPagedWordRequestWrapper = new GetPagedWordRequestWrapper(); // GetPagedWordRequestWrapper | 
        try {
            GetPagedWordResponseWrapper result = apiInstance.getPagedWord(getPagedWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#getPagedWord");
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
 **getPagedWordRequestWrapper** | [**GetPagedWordRequestWrapper**](GetPagedWordRequestWrapper.md)|  |

### Return type

[**GetPagedWordResponseWrapper**](GetPagedWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## pauseKeyword

> PauseKeywordResponseWrapper pauseKeyword(pauseKeywordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        PauseKeywordRequestWrapper pauseKeywordRequestWrapper = new PauseKeywordRequestWrapper(); // PauseKeywordRequestWrapper | 
        try {
            PauseKeywordResponseWrapper result = apiInstance.pauseKeyword(pauseKeywordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#pauseKeyword");
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
 **pauseKeywordRequestWrapper** | [**PauseKeywordRequestWrapper**](PauseKeywordRequestWrapper.md)|  |

### Return type

[**PauseKeywordResponseWrapper**](PauseKeywordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## startKeyword

> StartKeywordResponseWrapper startKeyword(startKeywordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        StartKeywordRequestWrapper startKeywordRequestWrapper = new StartKeywordRequestWrapper(); // StartKeywordRequestWrapper | 
        try {
            StartKeywordResponseWrapper result = apiInstance.startKeyword(startKeywordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#startKeyword");
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
 **startKeywordRequestWrapper** | [**StartKeywordRequestWrapper**](StartKeywordRequestWrapper.md)|  |

### Return type

[**StartKeywordResponseWrapper**](StartKeywordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateMatchType

> UpdateMatchTypeResponseWrapper updateMatchType(updateMatchTypeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        UpdateMatchTypeRequestWrapper updateMatchTypeRequestWrapper = new UpdateMatchTypeRequestWrapper(); // UpdateMatchTypeRequestWrapper | 
        try {
            UpdateMatchTypeResponseWrapper result = apiInstance.updateMatchType(updateMatchTypeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#updateMatchType");
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
 **updateMatchTypeRequestWrapper** | [**UpdateMatchTypeRequestWrapper**](UpdateMatchTypeRequestWrapper.md)|  |

### Return type

[**UpdateMatchTypeResponseWrapper**](UpdateMatchTypeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updatePrice

> UpdatePriceResponseWrapper updatePrice(updatePriceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        UpdatePriceRequestWrapper updatePriceRequestWrapper = new UpdatePriceRequestWrapper(); // UpdatePriceRequestWrapper | 
        try {
            UpdatePriceResponseWrapper result = apiInstance.updatePrice(updatePriceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#updatePrice");
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
 **updatePriceRequestWrapper** | [**UpdatePriceRequestWrapper**](UpdatePriceRequestWrapper.md)|  |

### Return type

[**UpdatePriceResponseWrapper**](UpdatePriceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateTargetUrl

> UpdateTargetUrlResponseWrapper updateTargetUrl(updateTargetUrlRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.productadskeyword.api.ProductAdsKeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ProductAdsKeywordService apiInstance = new ProductAdsKeywordService(defaultClient);
        UpdateTargetUrlRequestWrapper updateTargetUrlRequestWrapper = new UpdateTargetUrlRequestWrapper(); // UpdateTargetUrlRequestWrapper | 
        try {
            UpdateTargetUrlResponseWrapper result = apiInstance.updateTargetUrl(updateTargetUrlRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductAdsKeywordService#updateTargetUrl");
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
 **updateTargetUrlRequestWrapper** | [**UpdateTargetUrlRequestWrapper**](UpdateTargetUrlRequestWrapper.md)|  |

### Return type

[**UpdateTargetUrlResponseWrapper**](UpdateTargetUrlResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

