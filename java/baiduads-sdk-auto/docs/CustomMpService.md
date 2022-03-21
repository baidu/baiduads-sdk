# CustomMpService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomMP**](CustomMpService.md#addCustomMP) | **POST** /json/feed/v1/CustomMPService/addCustomMP | 
[**deleteCustomMP**](CustomMpService.md#deleteCustomMP) | **POST** /json/feed/v1/CustomMPService/deleteCustomMP | 
[**getCustomMP**](CustomMpService.md#getCustomMP) | **POST** /json/feed/v1/CustomMPService/getCustomMP | 
[**updateCustomMP**](CustomMpService.md#updateCustomMP) | **POST** /json/feed/v1/CustomMPService/updateCustomMP | 



## addCustomMP

> AddCustomMPResponseWrapper addCustomMP(addCustomMPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.custommp.api.CustomMpService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CustomMpService apiInstance = new CustomMpService(defaultClient);
        AddCustomMPRequestWrapper addCustomMPRequestWrapper = new AddCustomMPRequestWrapper(); // AddCustomMPRequestWrapper | 
        try {
            AddCustomMPResponseWrapper result = apiInstance.addCustomMP(addCustomMPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomMpService#addCustomMP");
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
 **addCustomMPRequestWrapper** | [**AddCustomMPRequestWrapper**](AddCustomMPRequestWrapper.md)|  |

### Return type

[**AddCustomMPResponseWrapper**](AddCustomMPResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCustomMP

> DeleteCustomMPResponseWrapper deleteCustomMP(deleteCustomMPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.custommp.api.CustomMpService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CustomMpService apiInstance = new CustomMpService(defaultClient);
        DeleteCustomMPRequestWrapper deleteCustomMPRequestWrapper = new DeleteCustomMPRequestWrapper(); // DeleteCustomMPRequestWrapper | 
        try {
            DeleteCustomMPResponseWrapper result = apiInstance.deleteCustomMP(deleteCustomMPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomMpService#deleteCustomMP");
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
 **deleteCustomMPRequestWrapper** | [**DeleteCustomMPRequestWrapper**](DeleteCustomMPRequestWrapper.md)|  |

### Return type

[**DeleteCustomMPResponseWrapper**](DeleteCustomMPResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCustomMP

> GetCustomMPResponseWrapper getCustomMP(getCustomMPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.custommp.api.CustomMpService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CustomMpService apiInstance = new CustomMpService(defaultClient);
        GetCustomMPRequestWrapper getCustomMPRequestWrapper = new GetCustomMPRequestWrapper(); // GetCustomMPRequestWrapper | 
        try {
            GetCustomMPResponseWrapper result = apiInstance.getCustomMP(getCustomMPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomMpService#getCustomMP");
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
 **getCustomMPRequestWrapper** | [**GetCustomMPRequestWrapper**](GetCustomMPRequestWrapper.md)|  |

### Return type

[**GetCustomMPResponseWrapper**](GetCustomMPResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCustomMP

> UpdateCustomMPResponseWrapper updateCustomMP(updateCustomMPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.custommp.api.CustomMpService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CustomMpService apiInstance = new CustomMpService(defaultClient);
        UpdateCustomMPRequestWrapper updateCustomMPRequestWrapper = new UpdateCustomMPRequestWrapper(); // UpdateCustomMPRequestWrapper | 
        try {
            UpdateCustomMPResponseWrapper result = apiInstance.updateCustomMP(updateCustomMPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomMpService#updateCustomMP");
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
 **updateCustomMPRequestWrapper** | [**UpdateCustomMPRequestWrapper**](UpdateCustomMPRequestWrapper.md)|  |

### Return type

[**UpdateCustomMPResponseWrapper**](UpdateCustomMPResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

