# DpaApiCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDpaCreative**](DpaApiCreativeService.md#addDpaCreative) | **POST** /json/sms/service/DpaApiCreativeService/addDpaCreative | 
[**deleteDpaCreative**](DpaApiCreativeService.md#deleteDpaCreative) | **POST** /json/sms/service/DpaApiCreativeService/deleteDpaCreative | 
[**getDpaCreative**](DpaApiCreativeService.md#getDpaCreative) | **POST** /json/sms/service/DpaApiCreativeService/getDpaCreative | 
[**getDpaMaterialTypes**](DpaApiCreativeService.md#getDpaMaterialTypes) | **POST** /json/sms/service/DpaApiCreativeService/getDpaMaterialTypes | 
[**updateDpaCreative**](DpaApiCreativeService.md#updateDpaCreative) | **POST** /json/sms/service/DpaApiCreativeService/updateDpaCreative | 



## addDpaCreative

> AddDpaCreativeResponseWrapper addDpaCreative(addDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapicreative.api.DpaApiCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiCreativeService apiInstance = new DpaApiCreativeService(defaultClient);
        AddDpaCreativeRequestWrapper addDpaCreativeRequestWrapper = new AddDpaCreativeRequestWrapper(); // AddDpaCreativeRequestWrapper | 
        try {
            AddDpaCreativeResponseWrapper result = apiInstance.addDpaCreative(addDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiCreativeService#addDpaCreative");
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
 **addDpaCreativeRequestWrapper** | [**AddDpaCreativeRequestWrapper**](AddDpaCreativeRequestWrapper.md)|  |

### Return type

[**AddDpaCreativeResponseWrapper**](AddDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteDpaCreative

> DeleteDpaCreativeResponseWrapper deleteDpaCreative(deleteDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapicreative.api.DpaApiCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiCreativeService apiInstance = new DpaApiCreativeService(defaultClient);
        DeleteDpaCreativeRequestWrapper deleteDpaCreativeRequestWrapper = new DeleteDpaCreativeRequestWrapper(); // DeleteDpaCreativeRequestWrapper | 
        try {
            DeleteDpaCreativeResponseWrapper result = apiInstance.deleteDpaCreative(deleteDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiCreativeService#deleteDpaCreative");
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
 **deleteDpaCreativeRequestWrapper** | [**DeleteDpaCreativeRequestWrapper**](DeleteDpaCreativeRequestWrapper.md)|  |

### Return type

[**DeleteDpaCreativeResponseWrapper**](DeleteDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDpaCreative

> GetDpaCreativeResponseWrapper getDpaCreative(getDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapicreative.api.DpaApiCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiCreativeService apiInstance = new DpaApiCreativeService(defaultClient);
        GetDpaCreativeRequestWrapper getDpaCreativeRequestWrapper = new GetDpaCreativeRequestWrapper(); // GetDpaCreativeRequestWrapper | 
        try {
            GetDpaCreativeResponseWrapper result = apiInstance.getDpaCreative(getDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiCreativeService#getDpaCreative");
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
 **getDpaCreativeRequestWrapper** | [**GetDpaCreativeRequestWrapper**](GetDpaCreativeRequestWrapper.md)|  |

### Return type

[**GetDpaCreativeResponseWrapper**](GetDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDpaMaterialTypes

> GetDpaMaterialTypesResponseWrapper getDpaMaterialTypes(getDpaMaterialTypesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapicreative.api.DpaApiCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiCreativeService apiInstance = new DpaApiCreativeService(defaultClient);
        GetDpaMaterialTypesRequestWrapper getDpaMaterialTypesRequestWrapper = new GetDpaMaterialTypesRequestWrapper(); // GetDpaMaterialTypesRequestWrapper | 
        try {
            GetDpaMaterialTypesResponseWrapper result = apiInstance.getDpaMaterialTypes(getDpaMaterialTypesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiCreativeService#getDpaMaterialTypes");
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
 **getDpaMaterialTypesRequestWrapper** | [**GetDpaMaterialTypesRequestWrapper**](GetDpaMaterialTypesRequestWrapper.md)|  |

### Return type

[**GetDpaMaterialTypesResponseWrapper**](GetDpaMaterialTypesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateDpaCreative

> UpdateDpaCreativeResponseWrapper updateDpaCreative(updateDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapicreative.api.DpaApiCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiCreativeService apiInstance = new DpaApiCreativeService(defaultClient);
        UpdateDpaCreativeRequestWrapper updateDpaCreativeRequestWrapper = new UpdateDpaCreativeRequestWrapper(); // UpdateDpaCreativeRequestWrapper | 
        try {
            UpdateDpaCreativeResponseWrapper result = apiInstance.updateDpaCreative(updateDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiCreativeService#updateDpaCreative");
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
 **updateDpaCreativeRequestWrapper** | [**UpdateDpaCreativeRequestWrapper**](UpdateDpaCreativeRequestWrapper.md)|  |

### Return type

[**UpdateDpaCreativeResponseWrapper**](UpdateDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

