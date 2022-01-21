# KeywordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWord**](KeywordService.md#addWord) | **POST** /json/sms/service/KeywordService/addWord | 
[**deleteWord**](KeywordService.md#deleteWord) | **POST** /json/sms/service/KeywordService/deleteWord | 
[**getWord**](KeywordService.md#getWord) | **POST** /json/sms/service/KeywordService/getWord | 
[**updateWord**](KeywordService.md#updateWord) | **POST** /json/sms/service/KeywordService/updateWord | 



## addWord

> AddWordResponseWrapper addWord(addWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.keyword.api.KeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KeywordService apiInstance = new KeywordService(defaultClient);
        AddWordRequestWrapper addWordRequestWrapper = new AddWordRequestWrapper(); // AddWordRequestWrapper | 
        try {
            AddWordResponseWrapper result = apiInstance.addWord(addWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeywordService#addWord");
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
import com.baidu.dev2.api.sdk.keyword.api.KeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KeywordService apiInstance = new KeywordService(defaultClient);
        DeleteWordRequestWrapper deleteWordRequestWrapper = new DeleteWordRequestWrapper(); // DeleteWordRequestWrapper | 
        try {
            DeleteWordResponseWrapper result = apiInstance.deleteWord(deleteWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeywordService#deleteWord");
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


## getWord

> GetWordResponseWrapper getWord(getWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.keyword.api.KeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KeywordService apiInstance = new KeywordService(defaultClient);
        GetWordRequestWrapper getWordRequestWrapper = new GetWordRequestWrapper(); // GetWordRequestWrapper | 
        try {
            GetWordResponseWrapper result = apiInstance.getWord(getWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeywordService#getWord");
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
 **getWordRequestWrapper** | [**GetWordRequestWrapper**](GetWordRequestWrapper.md)|  |

### Return type

[**GetWordResponseWrapper**](GetWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateWord

> UpdateWordResponseWrapper updateWord(updateWordRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.keyword.api.KeywordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        KeywordService apiInstance = new KeywordService(defaultClient);
        UpdateWordRequestWrapper updateWordRequestWrapper = new UpdateWordRequestWrapper(); // UpdateWordRequestWrapper | 
        try {
            UpdateWordResponseWrapper result = apiInstance.updateWord(updateWordRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeywordService#updateWord");
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
 **updateWordRequestWrapper** | [**UpdateWordRequestWrapper**](UpdateWordRequestWrapper.md)|  |

### Return type

[**UpdateWordResponseWrapper**](UpdateWordResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

