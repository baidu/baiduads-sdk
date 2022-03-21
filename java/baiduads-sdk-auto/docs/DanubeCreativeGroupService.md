# DanubeCreativeGroupService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDanubeCreativeGroup**](DanubeCreativeGroupService.md#addDanubeCreativeGroup) | **POST** /json/sms/service/DanubeCreativeGroupService/addDanubeCreativeGroup | 
[**copyDanubeCreativeGroup**](DanubeCreativeGroupService.md#copyDanubeCreativeGroup) | **POST** /json/sms/service/DanubeCreativeGroupService/copyDanubeCreativeGroup | 
[**deleteDanubeCreativeGroup**](DanubeCreativeGroupService.md#deleteDanubeCreativeGroup) | **POST** /json/sms/service/DanubeCreativeGroupService/deleteDanubeCreativeGroup | 
[**getDanubeConstants**](DanubeCreativeGroupService.md#getDanubeConstants) | **POST** /json/sms/service/DanubeCreativeGroupService/getDanubeConstants | 
[**getDanubeCreativeGroup**](DanubeCreativeGroupService.md#getDanubeCreativeGroup) | **POST** /json/sms/service/DanubeCreativeGroupService/getDanubeCreativeGroup | 
[**updateDanubeCreativeGroup**](DanubeCreativeGroupService.md#updateDanubeCreativeGroup) | **POST** /json/sms/service/DanubeCreativeGroupService/updateDanubeCreativeGroup | 



## addDanubeCreativeGroup

> AddDanubeCreativeGroupResponseWrapper addDanubeCreativeGroup(addDanubeCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        AddDanubeCreativeGroupRequestWrapper addDanubeCreativeGroupRequestWrapper = new AddDanubeCreativeGroupRequestWrapper(); // AddDanubeCreativeGroupRequestWrapper | 
        try {
            AddDanubeCreativeGroupResponseWrapper result = apiInstance.addDanubeCreativeGroup(addDanubeCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#addDanubeCreativeGroup");
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
 **addDanubeCreativeGroupRequestWrapper** | [**AddDanubeCreativeGroupRequestWrapper**](AddDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**AddDanubeCreativeGroupResponseWrapper**](AddDanubeCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## copyDanubeCreativeGroup

> CopyDanubeCreativeGroupResponseWrapper copyDanubeCreativeGroup(copyDanubeCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        CopyDanubeCreativeGroupRequestWrapper copyDanubeCreativeGroupRequestWrapper = new CopyDanubeCreativeGroupRequestWrapper(); // CopyDanubeCreativeGroupRequestWrapper | 
        try {
            CopyDanubeCreativeGroupResponseWrapper result = apiInstance.copyDanubeCreativeGroup(copyDanubeCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#copyDanubeCreativeGroup");
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
 **copyDanubeCreativeGroupRequestWrapper** | [**CopyDanubeCreativeGroupRequestWrapper**](CopyDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**CopyDanubeCreativeGroupResponseWrapper**](CopyDanubeCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteDanubeCreativeGroup

> DeleteDanubeCreativeGroupResponseWrapper deleteDanubeCreativeGroup(deleteDanubeCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        DeleteDanubeCreativeGroupRequestWrapper deleteDanubeCreativeGroupRequestWrapper = new DeleteDanubeCreativeGroupRequestWrapper(); // DeleteDanubeCreativeGroupRequestWrapper | 
        try {
            DeleteDanubeCreativeGroupResponseWrapper result = apiInstance.deleteDanubeCreativeGroup(deleteDanubeCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#deleteDanubeCreativeGroup");
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
 **deleteDanubeCreativeGroupRequestWrapper** | [**DeleteDanubeCreativeGroupRequestWrapper**](DeleteDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**DeleteDanubeCreativeGroupResponseWrapper**](DeleteDanubeCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDanubeConstants

> GetDanubeConstantsResponseWrapper getDanubeConstants(getDanubeConstantsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        GetDanubeConstantsRequestWrapper getDanubeConstantsRequestWrapper = new GetDanubeConstantsRequestWrapper(); // GetDanubeConstantsRequestWrapper | 
        try {
            GetDanubeConstantsResponseWrapper result = apiInstance.getDanubeConstants(getDanubeConstantsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#getDanubeConstants");
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
 **getDanubeConstantsRequestWrapper** | [**GetDanubeConstantsRequestWrapper**](GetDanubeConstantsRequestWrapper.md)|  |

### Return type

[**GetDanubeConstantsResponseWrapper**](GetDanubeConstantsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDanubeCreativeGroup

> GetDanubeCreativeGroupResponseWrapper getDanubeCreativeGroup(getDanubeCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        GetDanubeCreativeGroupRequestWrapper getDanubeCreativeGroupRequestWrapper = new GetDanubeCreativeGroupRequestWrapper(); // GetDanubeCreativeGroupRequestWrapper | 
        try {
            GetDanubeCreativeGroupResponseWrapper result = apiInstance.getDanubeCreativeGroup(getDanubeCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#getDanubeCreativeGroup");
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
 **getDanubeCreativeGroupRequestWrapper** | [**GetDanubeCreativeGroupRequestWrapper**](GetDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**GetDanubeCreativeGroupResponseWrapper**](GetDanubeCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateDanubeCreativeGroup

> UpdateDanubeCreativeGroupResponseWrapper updateDanubeCreativeGroup(updateDanubeCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.danubecreativegroup.api.DanubeCreativeGroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DanubeCreativeGroupService apiInstance = new DanubeCreativeGroupService(defaultClient);
        UpdateDanubeCreativeGroupRequestWrapper updateDanubeCreativeGroupRequestWrapper = new UpdateDanubeCreativeGroupRequestWrapper(); // UpdateDanubeCreativeGroupRequestWrapper | 
        try {
            UpdateDanubeCreativeGroupResponseWrapper result = apiInstance.updateDanubeCreativeGroup(updateDanubeCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DanubeCreativeGroupService#updateDanubeCreativeGroup");
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
 **updateDanubeCreativeGroupRequestWrapper** | [**UpdateDanubeCreativeGroupRequestWrapper**](UpdateDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**UpdateDanubeCreativeGroupResponseWrapper**](UpdateDanubeCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

