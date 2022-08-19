# ShareRepertoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addShareRepertory**](ShareRepertoryService.md#addShareRepertory) | **POST** /json/sms/service/ShareRepertoryService/addShareRepertory | 
[**deleteShareRepertory**](ShareRepertoryService.md#deleteShareRepertory) | **POST** /json/sms/service/ShareRepertoryService/deleteShareRepertory | 
[**getShareRepertory**](ShareRepertoryService.md#getShareRepertory) | **POST** /json/sms/service/ShareRepertoryService/getShareRepertory | 
[**updateShareRepertory**](ShareRepertoryService.md#updateShareRepertory) | **POST** /json/sms/service/ShareRepertoryService/updateShareRepertory | 



## addShareRepertory

> AddShareRepertoryResponseWrapper addShareRepertory(addShareRepertoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.sharerepertory.api.ShareRepertoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShareRepertoryService apiInstance = new ShareRepertoryService(defaultClient);
        AddShareRepertoryRequestWrapper addShareRepertoryRequestWrapper = new AddShareRepertoryRequestWrapper(); // AddShareRepertoryRequestWrapper | 
        try {
            AddShareRepertoryResponseWrapper result = apiInstance.addShareRepertory(addShareRepertoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareRepertoryService#addShareRepertory");
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
 **addShareRepertoryRequestWrapper** | [**AddShareRepertoryRequestWrapper**](AddShareRepertoryRequestWrapper.md)|  |

### Return type

[**AddShareRepertoryResponseWrapper**](AddShareRepertoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteShareRepertory

> DeleteShareRepertoryResponseWrapper deleteShareRepertory(deleteShareRepertoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.sharerepertory.api.ShareRepertoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShareRepertoryService apiInstance = new ShareRepertoryService(defaultClient);
        DeleteShareRepertoryRequestWrapper deleteShareRepertoryRequestWrapper = new DeleteShareRepertoryRequestWrapper(); // DeleteShareRepertoryRequestWrapper | 
        try {
            DeleteShareRepertoryResponseWrapper result = apiInstance.deleteShareRepertory(deleteShareRepertoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareRepertoryService#deleteShareRepertory");
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
 **deleteShareRepertoryRequestWrapper** | [**DeleteShareRepertoryRequestWrapper**](DeleteShareRepertoryRequestWrapper.md)|  |

### Return type

[**DeleteShareRepertoryResponseWrapper**](DeleteShareRepertoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getShareRepertory

> GetShareRepertoryResponseWrapper getShareRepertory(getShareRepertoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.sharerepertory.api.ShareRepertoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShareRepertoryService apiInstance = new ShareRepertoryService(defaultClient);
        GetShareRepertoryRequestWrapper getShareRepertoryRequestWrapper = new GetShareRepertoryRequestWrapper(); // GetShareRepertoryRequestWrapper | 
        try {
            GetShareRepertoryResponseWrapper result = apiInstance.getShareRepertory(getShareRepertoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareRepertoryService#getShareRepertory");
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
 **getShareRepertoryRequestWrapper** | [**GetShareRepertoryRequestWrapper**](GetShareRepertoryRequestWrapper.md)|  |

### Return type

[**GetShareRepertoryResponseWrapper**](GetShareRepertoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateShareRepertory

> UpdateShareRepertoryResponseWrapper updateShareRepertory(updateShareRepertoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.sharerepertory.api.ShareRepertoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShareRepertoryService apiInstance = new ShareRepertoryService(defaultClient);
        UpdateShareRepertoryRequestWrapper updateShareRepertoryRequestWrapper = new UpdateShareRepertoryRequestWrapper(); // UpdateShareRepertoryRequestWrapper | 
        try {
            UpdateShareRepertoryResponseWrapper result = apiInstance.updateShareRepertory(updateShareRepertoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareRepertoryService#updateShareRepertory");
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
 **updateShareRepertoryRequestWrapper** | [**UpdateShareRepertoryRequestWrapper**](UpdateShareRepertoryRequestWrapper.md)|  |

### Return type

[**UpdateShareRepertoryResponseWrapper**](UpdateShareRepertoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

