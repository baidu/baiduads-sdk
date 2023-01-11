# MaterialPersonModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPerson**](MaterialPersonModService.md#addPerson) | **POST** /json/sms/service/MaterialPersonModService/addPerson | 
[**deletePerson**](MaterialPersonModService.md#deletePerson) | **POST** /json/sms/service/MaterialPersonModService/deletePerson | 
[**updateCategory**](MaterialPersonModService.md#updateCategory) | **POST** /json/sms/service/MaterialPersonModService/updateCategory | 
[**updatePerson**](MaterialPersonModService.md#updatePerson) | **POST** /json/sms/service/MaterialPersonModService/updatePerson | 
[**updatePutaway**](MaterialPersonModService.md#updatePutaway) | **POST** /json/sms/service/MaterialPersonModService/updatePutaway | 
[**updateRank**](MaterialPersonModService.md#updateRank) | **POST** /json/sms/service/MaterialPersonModService/updateRank | 



## addPerson

> AddPersonResponseWrapper addPerson(addPersonRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        AddPersonRequestWrapper addPersonRequestWrapper = new AddPersonRequestWrapper(); // AddPersonRequestWrapper | 
        try {
            AddPersonResponseWrapper result = apiInstance.addPerson(addPersonRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#addPerson");
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
 **addPersonRequestWrapper** | [**AddPersonRequestWrapper**](AddPersonRequestWrapper.md)|  |

### Return type

[**AddPersonResponseWrapper**](AddPersonResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deletePerson

> DeletePersonResponseWrapper deletePerson(deletePersonRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        DeletePersonRequestWrapper deletePersonRequestWrapper = new DeletePersonRequestWrapper(); // DeletePersonRequestWrapper | 
        try {
            DeletePersonResponseWrapper result = apiInstance.deletePerson(deletePersonRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#deletePerson");
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
 **deletePersonRequestWrapper** | [**DeletePersonRequestWrapper**](DeletePersonRequestWrapper.md)|  |

### Return type

[**DeletePersonResponseWrapper**](DeletePersonResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = new UpdateCategoryRequestWrapper(); // UpdateCategoryRequestWrapper | 
        try {
            UpdateCategoryResponseWrapper result = apiInstance.updateCategory(updateCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#updateCategory");
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


## updatePerson

> UpdatePersonResponseWrapper updatePerson(updatePersonRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        UpdatePersonRequestWrapper updatePersonRequestWrapper = new UpdatePersonRequestWrapper(); // UpdatePersonRequestWrapper | 
        try {
            UpdatePersonResponseWrapper result = apiInstance.updatePerson(updatePersonRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#updatePerson");
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
 **updatePersonRequestWrapper** | [**UpdatePersonRequestWrapper**](UpdatePersonRequestWrapper.md)|  |

### Return type

[**UpdatePersonResponseWrapper**](UpdatePersonResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = new UpdatePutawayRequestWrapper(); // UpdatePutawayRequestWrapper | 
        try {
            UpdatePutawayResponseWrapper result = apiInstance.updatePutaway(updatePutawayRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#updatePutaway");
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
import com.baidu.dev2.api.sdk.materialpersonmod.api.MaterialPersonModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialPersonModService apiInstance = new MaterialPersonModService(defaultClient);
        UpdateRankRequestWrapper updateRankRequestWrapper = new UpdateRankRequestWrapper(); // UpdateRankRequestWrapper | 
        try {
            UpdateRankResponseWrapper result = apiInstance.updateRank(updateRankRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialPersonModService#updateRank");
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

