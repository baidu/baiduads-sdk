# MaterialQuestionModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQuestion**](MaterialQuestionModService.md#addQuestion) | **POST** /json/sms/service/MaterialQuestionModService/addQuestion | 
[**deleteQuestion**](MaterialQuestionModService.md#deleteQuestion) | **POST** /json/sms/service/MaterialQuestionModService/deleteQuestion | 
[**updateCategory**](MaterialQuestionModService.md#updateCategory) | **POST** /json/sms/service/MaterialQuestionModService/updateCategory | 
[**updatePutaway**](MaterialQuestionModService.md#updatePutaway) | **POST** /json/sms/service/MaterialQuestionModService/updatePutaway | 
[**updateQuestion**](MaterialQuestionModService.md#updateQuestion) | **POST** /json/sms/service/MaterialQuestionModService/updateQuestion | 
[**updateRank**](MaterialQuestionModService.md#updateRank) | **POST** /json/sms/service/MaterialQuestionModService/updateRank | 



## addQuestion

> AddQuestionResponseWrapper addQuestion(addQuestionRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        AddQuestionRequestWrapper addQuestionRequestWrapper = new AddQuestionRequestWrapper(); // AddQuestionRequestWrapper | 
        try {
            AddQuestionResponseWrapper result = apiInstance.addQuestion(addQuestionRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#addQuestion");
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
 **addQuestionRequestWrapper** | [**AddQuestionRequestWrapper**](AddQuestionRequestWrapper.md)|  |

### Return type

[**AddQuestionResponseWrapper**](AddQuestionResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteQuestion

> DeleteQuestionResponseWrapper deleteQuestion(deleteQuestionRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        DeleteQuestionRequestWrapper deleteQuestionRequestWrapper = new DeleteQuestionRequestWrapper(); // DeleteQuestionRequestWrapper | 
        try {
            DeleteQuestionResponseWrapper result = apiInstance.deleteQuestion(deleteQuestionRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#deleteQuestion");
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
 **deleteQuestionRequestWrapper** | [**DeleteQuestionRequestWrapper**](DeleteQuestionRequestWrapper.md)|  |

### Return type

[**DeleteQuestionResponseWrapper**](DeleteQuestionResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = new UpdateCategoryRequestWrapper(); // UpdateCategoryRequestWrapper | 
        try {
            UpdateCategoryResponseWrapper result = apiInstance.updateCategory(updateCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#updateCategory");
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
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = new UpdatePutawayRequestWrapper(); // UpdatePutawayRequestWrapper | 
        try {
            UpdatePutawayResponseWrapper result = apiInstance.updatePutaway(updatePutawayRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#updatePutaway");
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


## updateQuestion

> UpdateQuestionResponseWrapper updateQuestion(updateQuestionRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        UpdateQuestionRequestWrapper updateQuestionRequestWrapper = new UpdateQuestionRequestWrapper(); // UpdateQuestionRequestWrapper | 
        try {
            UpdateQuestionResponseWrapper result = apiInstance.updateQuestion(updateQuestionRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#updateQuestion");
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
 **updateQuestionRequestWrapper** | [**UpdateQuestionRequestWrapper**](UpdateQuestionRequestWrapper.md)|  |

### Return type

[**UpdateQuestionResponseWrapper**](UpdateQuestionResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.materialquestionmod.api.MaterialQuestionModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialQuestionModService apiInstance = new MaterialQuestionModService(defaultClient);
        UpdateRankRequestWrapper updateRankRequestWrapper = new UpdateRankRequestWrapper(); // UpdateRankRequestWrapper | 
        try {
            UpdateRankResponseWrapper result = apiInstance.updateRank(updateRankRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialQuestionModService#updateRank");
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

