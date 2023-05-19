# CampaignShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCampaignShopping**](CampaignShoppingService.md#addCampaignShopping) | **POST** /json/sms/service/CampaignShoppingService/addCampaignShopping | 
[**copyCampaignShopping**](CampaignShoppingService.md#copyCampaignShopping) | **POST** /json/sms/service/CampaignShoppingService/copyCampaignShopping | 
[**deleteCampaignShopping**](CampaignShoppingService.md#deleteCampaignShopping) | **POST** /json/sms/service/CampaignShoppingService/deleteCampaignShopping | 
[**getAnchor**](CampaignShoppingService.md#getAnchor) | **POST** /json/sms/service/CampaignShoppingService/getAnchor | 
[**getCampaignShopping**](CampaignShoppingService.md#getCampaignShopping) | **POST** /json/sms/service/CampaignShoppingService/getCampaignShopping | 
[**getInterests**](CampaignShoppingService.md#getInterests) | **POST** /json/sms/service/CampaignShoppingService/getInterests | 
[**getProduct**](CampaignShoppingService.md#getProduct) | **POST** /json/sms/service/CampaignShoppingService/getProduct | 
[**updateCampaignShopping**](CampaignShoppingService.md#updateCampaignShopping) | **POST** /json/sms/service/CampaignShoppingService/updateCampaignShopping | 



## addCampaignShopping

> AddCampaignShoppingResponseWrapper addCampaignShopping(addCampaignShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        AddCampaignShoppingRequestWrapper addCampaignShoppingRequestWrapper = new AddCampaignShoppingRequestWrapper(); // AddCampaignShoppingRequestWrapper | 
        try {
            AddCampaignShoppingResponseWrapper result = apiInstance.addCampaignShopping(addCampaignShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#addCampaignShopping");
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
 **addCampaignShoppingRequestWrapper** | [**AddCampaignShoppingRequestWrapper**](AddCampaignShoppingRequestWrapper.md)|  |

### Return type

[**AddCampaignShoppingResponseWrapper**](AddCampaignShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## copyCampaignShopping

> CopyCampaignShoppingResponseWrapper copyCampaignShopping(copyCampaignShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        CopyCampaignShoppingRequestWrapper copyCampaignShoppingRequestWrapper = new CopyCampaignShoppingRequestWrapper(); // CopyCampaignShoppingRequestWrapper | 
        try {
            CopyCampaignShoppingResponseWrapper result = apiInstance.copyCampaignShopping(copyCampaignShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#copyCampaignShopping");
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
 **copyCampaignShoppingRequestWrapper** | [**CopyCampaignShoppingRequestWrapper**](CopyCampaignShoppingRequestWrapper.md)|  |

### Return type

[**CopyCampaignShoppingResponseWrapper**](CopyCampaignShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCampaignShopping

> DeleteCampaignShoppingResponseWrapper deleteCampaignShopping(deleteCampaignShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        DeleteCampaignShoppingRequestWrapper deleteCampaignShoppingRequestWrapper = new DeleteCampaignShoppingRequestWrapper(); // DeleteCampaignShoppingRequestWrapper | 
        try {
            DeleteCampaignShoppingResponseWrapper result = apiInstance.deleteCampaignShopping(deleteCampaignShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#deleteCampaignShopping");
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
 **deleteCampaignShoppingRequestWrapper** | [**DeleteCampaignShoppingRequestWrapper**](DeleteCampaignShoppingRequestWrapper.md)|  |

### Return type

[**DeleteCampaignShoppingResponseWrapper**](DeleteCampaignShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAnchor

> GetAnchorResponseWrapper getAnchor(getAnchorRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        GetAnchorRequestWrapper getAnchorRequestWrapper = new GetAnchorRequestWrapper(); // GetAnchorRequestWrapper | 
        try {
            GetAnchorResponseWrapper result = apiInstance.getAnchor(getAnchorRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#getAnchor");
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
 **getAnchorRequestWrapper** | [**GetAnchorRequestWrapper**](GetAnchorRequestWrapper.md)|  |

### Return type

[**GetAnchorResponseWrapper**](GetAnchorResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCampaignShopping

> GetCampaignShoppingResponseWrapper getCampaignShopping(getCampaignShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        GetCampaignShoppingRequestWrapper getCampaignShoppingRequestWrapper = new GetCampaignShoppingRequestWrapper(); // GetCampaignShoppingRequestWrapper | 
        try {
            GetCampaignShoppingResponseWrapper result = apiInstance.getCampaignShopping(getCampaignShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#getCampaignShopping");
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
 **getCampaignShoppingRequestWrapper** | [**GetCampaignShoppingRequestWrapper**](GetCampaignShoppingRequestWrapper.md)|  |

### Return type

[**GetCampaignShoppingResponseWrapper**](GetCampaignShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getInterests

> GetInterestsResponseWrapper getInterests(getInterestsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        GetInterestsRequestWrapper getInterestsRequestWrapper = new GetInterestsRequestWrapper(); // GetInterestsRequestWrapper | 
        try {
            GetInterestsResponseWrapper result = apiInstance.getInterests(getInterestsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#getInterests");
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
 **getInterestsRequestWrapper** | [**GetInterestsRequestWrapper**](GetInterestsRequestWrapper.md)|  |

### Return type

[**GetInterestsResponseWrapper**](GetInterestsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProduct

> GetProductResponseWrapper getProduct(getProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        GetProductRequestWrapper getProductRequestWrapper = new GetProductRequestWrapper(); // GetProductRequestWrapper | 
        try {
            GetProductResponseWrapper result = apiInstance.getProduct(getProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#getProduct");
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
 **getProductRequestWrapper** | [**GetProductRequestWrapper**](GetProductRequestWrapper.md)|  |

### Return type

[**GetProductResponseWrapper**](GetProductResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCampaignShopping

> UpdateCampaignShoppingResponseWrapper updateCampaignShopping(updateCampaignShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignshopping.api.CampaignShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignShoppingService apiInstance = new CampaignShoppingService(defaultClient);
        UpdateCampaignShoppingRequestWrapper updateCampaignShoppingRequestWrapper = new UpdateCampaignShoppingRequestWrapper(); // UpdateCampaignShoppingRequestWrapper | 
        try {
            UpdateCampaignShoppingResponseWrapper result = apiInstance.updateCampaignShopping(updateCampaignShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignShoppingService#updateCampaignShopping");
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
 **updateCampaignShoppingRequestWrapper** | [**UpdateCampaignShoppingRequestWrapper**](UpdateCampaignShoppingRequestWrapper.md)|  |

### Return type

[**UpdateCampaignShoppingResponseWrapper**](UpdateCampaignShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

