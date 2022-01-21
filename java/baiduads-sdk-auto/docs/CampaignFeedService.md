# CampaignFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCampaignFeed**](CampaignFeedService.md#addCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/addCampaignFeed | 
[**deleteCampaignFeed**](CampaignFeedService.md#deleteCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/deleteCampaignFeed | 
[**getCampaignFeed**](CampaignFeedService.md#getCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/getCampaignFeed | 
[**updateCampaignFeed**](CampaignFeedService.md#updateCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/updateCampaignFeed | 



## addCampaignFeed

> AddCampaignFeedResponseWrapper addCampaignFeed(addCampaignFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignfeed.api.CampaignFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignFeedService apiInstance = new CampaignFeedService(defaultClient);
        AddCampaignFeedRequestWrapper addCampaignFeedRequestWrapper = new AddCampaignFeedRequestWrapper(); // AddCampaignFeedRequestWrapper | 
        try {
            AddCampaignFeedResponseWrapper result = apiInstance.addCampaignFeed(addCampaignFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignFeedService#addCampaignFeed");
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
 **addCampaignFeedRequestWrapper** | [**AddCampaignFeedRequestWrapper**](AddCampaignFeedRequestWrapper.md)|  |

### Return type

[**AddCampaignFeedResponseWrapper**](AddCampaignFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCampaignFeed

> DeleteCampaignFeedResponseWrapper deleteCampaignFeed(deleteCampaignFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignfeed.api.CampaignFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignFeedService apiInstance = new CampaignFeedService(defaultClient);
        DeleteCampaignFeedRequestWrapper deleteCampaignFeedRequestWrapper = new DeleteCampaignFeedRequestWrapper(); // DeleteCampaignFeedRequestWrapper | 
        try {
            DeleteCampaignFeedResponseWrapper result = apiInstance.deleteCampaignFeed(deleteCampaignFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignFeedService#deleteCampaignFeed");
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
 **deleteCampaignFeedRequestWrapper** | [**DeleteCampaignFeedRequestWrapper**](DeleteCampaignFeedRequestWrapper.md)|  |

### Return type

[**DeleteCampaignFeedResponseWrapper**](DeleteCampaignFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCampaignFeed

> GetCampaignFeedResponseWrapper getCampaignFeed(getCampaignFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignfeed.api.CampaignFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignFeedService apiInstance = new CampaignFeedService(defaultClient);
        GetCampaignFeedRequestWrapper getCampaignFeedRequestWrapper = new GetCampaignFeedRequestWrapper(); // GetCampaignFeedRequestWrapper | 
        try {
            GetCampaignFeedResponseWrapper result = apiInstance.getCampaignFeed(getCampaignFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignFeedService#getCampaignFeed");
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
 **getCampaignFeedRequestWrapper** | [**GetCampaignFeedRequestWrapper**](GetCampaignFeedRequestWrapper.md)|  |

### Return type

[**GetCampaignFeedResponseWrapper**](GetCampaignFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCampaignFeed

> UpdateCampaignFeedResponseWrapper updateCampaignFeed(updateCampaignFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.campaignfeed.api.CampaignFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CampaignFeedService apiInstance = new CampaignFeedService(defaultClient);
        UpdateCampaignFeedRequestWrapper updateCampaignFeedRequestWrapper = new UpdateCampaignFeedRequestWrapper(); // UpdateCampaignFeedRequestWrapper | 
        try {
            UpdateCampaignFeedResponseWrapper result = apiInstance.updateCampaignFeed(updateCampaignFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignFeedService#updateCampaignFeed");
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
 **updateCampaignFeedRequestWrapper** | [**UpdateCampaignFeedRequestWrapper**](UpdateCampaignFeedRequestWrapper.md)|  |

### Return type

[**UpdateCampaignFeedResponseWrapper**](UpdateCampaignFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

