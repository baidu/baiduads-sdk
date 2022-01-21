# CampaignService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCampaign**](CampaignService.md#addCampaign) | **POST** /json/sms/service/CampaignService/addCampaign | 
[**deleteCampaign**](CampaignService.md#deleteCampaign) | **POST** /json/sms/service/CampaignService/deleteCampaign | 
[**getCampaign**](CampaignService.md#getCampaign) | **POST** /json/sms/service/CampaignService/getCampaign | 
[**updateCampaign**](CampaignService.md#updateCampaign) | **POST** /json/sms/service/CampaignService/updateCampaign | 



## addCampaign

> AddCampaignResponseWrapper addCampaign(addCampaignRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaign.api.CampaignService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignService apiInstance = new CampaignService(defaultClient);
        AddCampaignRequestWrapper addCampaignRequestWrapper = new AddCampaignRequestWrapper(); // AddCampaignRequestWrapper | 
        try {
            AddCampaignResponseWrapper result = apiInstance.addCampaign(addCampaignRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignService#addCampaign");
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
 **addCampaignRequestWrapper** | [**AddCampaignRequestWrapper**](AddCampaignRequestWrapper.md)|  |

### Return type

[**AddCampaignResponseWrapper**](AddCampaignResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCampaign

> DeleteCampaignResponseWrapper deleteCampaign(deleteCampaignRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaign.api.CampaignService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignService apiInstance = new CampaignService(defaultClient);
        DeleteCampaignRequestWrapper deleteCampaignRequestWrapper = new DeleteCampaignRequestWrapper(); // DeleteCampaignRequestWrapper | 
        try {
            DeleteCampaignResponseWrapper result = apiInstance.deleteCampaign(deleteCampaignRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignService#deleteCampaign");
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
 **deleteCampaignRequestWrapper** | [**DeleteCampaignRequestWrapper**](DeleteCampaignRequestWrapper.md)|  |

### Return type

[**DeleteCampaignResponseWrapper**](DeleteCampaignResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCampaign

> GetCampaignResponseWrapper getCampaign(getCampaignRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaign.api.CampaignService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignService apiInstance = new CampaignService(defaultClient);
        GetCampaignRequestWrapper getCampaignRequestWrapper = new GetCampaignRequestWrapper(); // GetCampaignRequestWrapper | 
        try {
            GetCampaignResponseWrapper result = apiInstance.getCampaign(getCampaignRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignService#getCampaign");
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
 **getCampaignRequestWrapper** | [**GetCampaignRequestWrapper**](GetCampaignRequestWrapper.md)|  |

### Return type

[**GetCampaignResponseWrapper**](GetCampaignResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCampaign

> UpdateCampaignResponseWrapper updateCampaign(updateCampaignRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaign.api.CampaignService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignService apiInstance = new CampaignService(defaultClient);
        UpdateCampaignRequestWrapper updateCampaignRequestWrapper = new UpdateCampaignRequestWrapper(); // UpdateCampaignRequestWrapper | 
        try {
            UpdateCampaignResponseWrapper result = apiInstance.updateCampaign(updateCampaignRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignService#updateCampaign");
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
 **updateCampaignRequestWrapper** | [**UpdateCampaignRequestWrapper**](UpdateCampaignRequestWrapper.md)|  |

### Return type

[**UpdateCampaignResponseWrapper**](UpdateCampaignResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

