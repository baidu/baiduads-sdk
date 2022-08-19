# LeadAdsService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStrategies**](LeadAdsService.md#addStrategies) | **POST** /json/sms/service/LeadAdsService/addStrategies | 
[**deleteStrategies**](LeadAdsService.md#deleteStrategies) | **POST** /json/sms/service/LeadAdsService/deleteStrategies | 
[**getMaterials**](LeadAdsService.md#getMaterials) | **POST** /json/sms/service/LeadAdsService/getMaterials | 
[**getStrategies**](LeadAdsService.md#getStrategies) | **POST** /json/sms/service/LeadAdsService/getStrategies | 
[**updateStrategies**](LeadAdsService.md#updateStrategies) | **POST** /json/sms/service/LeadAdsService/updateStrategies | 



## addStrategies

> AddStrategiesResponseWrapper addStrategies(addStrategiesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadads.api.LeadAdsService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadAdsService apiInstance = new LeadAdsService(defaultClient);
        AddStrategiesRequestWrapper addStrategiesRequestWrapper = new AddStrategiesRequestWrapper(); // AddStrategiesRequestWrapper | 
        try {
            AddStrategiesResponseWrapper result = apiInstance.addStrategies(addStrategiesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadAdsService#addStrategies");
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
 **addStrategiesRequestWrapper** | [**AddStrategiesRequestWrapper**](AddStrategiesRequestWrapper.md)|  |

### Return type

[**AddStrategiesResponseWrapper**](AddStrategiesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteStrategies

> DeleteStrategiesResponseWrapper deleteStrategies(deleteStrategiesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadads.api.LeadAdsService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadAdsService apiInstance = new LeadAdsService(defaultClient);
        DeleteStrategiesRequestWrapper deleteStrategiesRequestWrapper = new DeleteStrategiesRequestWrapper(); // DeleteStrategiesRequestWrapper | 
        try {
            DeleteStrategiesResponseWrapper result = apiInstance.deleteStrategies(deleteStrategiesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadAdsService#deleteStrategies");
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
 **deleteStrategiesRequestWrapper** | [**DeleteStrategiesRequestWrapper**](DeleteStrategiesRequestWrapper.md)|  |

### Return type

[**DeleteStrategiesResponseWrapper**](DeleteStrategiesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getMaterials

> GetMaterialsResponseWrapper getMaterials(getMaterialsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadads.api.LeadAdsService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadAdsService apiInstance = new LeadAdsService(defaultClient);
        GetMaterialsRequestWrapper getMaterialsRequestWrapper = new GetMaterialsRequestWrapper(); // GetMaterialsRequestWrapper | 
        try {
            GetMaterialsResponseWrapper result = apiInstance.getMaterials(getMaterialsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadAdsService#getMaterials");
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
 **getMaterialsRequestWrapper** | [**GetMaterialsRequestWrapper**](GetMaterialsRequestWrapper.md)|  |

### Return type

[**GetMaterialsResponseWrapper**](GetMaterialsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getStrategies

> GetStrategiesResponseWrapper getStrategies(getStrategiesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadads.api.LeadAdsService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadAdsService apiInstance = new LeadAdsService(defaultClient);
        GetStrategiesRequestWrapper getStrategiesRequestWrapper = new GetStrategiesRequestWrapper(); // GetStrategiesRequestWrapper | 
        try {
            GetStrategiesResponseWrapper result = apiInstance.getStrategies(getStrategiesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadAdsService#getStrategies");
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
 **getStrategiesRequestWrapper** | [**GetStrategiesRequestWrapper**](GetStrategiesRequestWrapper.md)|  |

### Return type

[**GetStrategiesResponseWrapper**](GetStrategiesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateStrategies

> UpdateStrategiesResponseWrapper updateStrategies(updateStrategiesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.leadads.api.LeadAdsService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LeadAdsService apiInstance = new LeadAdsService(defaultClient);
        UpdateStrategiesRequestWrapper updateStrategiesRequestWrapper = new UpdateStrategiesRequestWrapper(); // UpdateStrategiesRequestWrapper | 
        try {
            UpdateStrategiesResponseWrapper result = apiInstance.updateStrategies(updateStrategiesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LeadAdsService#updateStrategies");
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
 **updateStrategiesRequestWrapper** | [**UpdateStrategiesRequestWrapper**](UpdateStrategiesRequestWrapper.md)|  |

### Return type

[**UpdateStrategiesResponseWrapper**](UpdateStrategiesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

