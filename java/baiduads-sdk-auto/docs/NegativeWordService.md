# NegativeWordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDuplicateNegativeWords**](NegativeWordService.md#getDuplicateNegativeWords) | **POST** /json/sms/service/NegativeWordService/getDuplicateNegativeWords | 
[**updateAdgroupNegativeWords**](NegativeWordService.md#updateAdgroupNegativeWords) | **POST** /json/sms/service/NegativeWordService/updateAdgroupNegativeWords | 
[**updateAdgroupNegativeWordsSync**](NegativeWordService.md#updateAdgroupNegativeWordsSync) | **POST** /json/sms/service/NegativeWordService/updateAdgroupNegativeWordsSync | 
[**updateCampaignNegativeWordsSync**](NegativeWordService.md#updateCampaignNegativeWordsSync) | **POST** /json/sms/service/NegativeWordService/updateCampaignNegativeWordsSync | 



## getDuplicateNegativeWords

> GetDuplicateNegativeWordsResponseWrapper getDuplicateNegativeWords(getDuplicateNegativeWordsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.negativeword.api.NegativeWordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NegativeWordService apiInstance = new NegativeWordService(defaultClient);
        GetDuplicateNegativeWordsRequestWrapper getDuplicateNegativeWordsRequestWrapper = new GetDuplicateNegativeWordsRequestWrapper(); // GetDuplicateNegativeWordsRequestWrapper | 
        try {
            GetDuplicateNegativeWordsResponseWrapper result = apiInstance.getDuplicateNegativeWords(getDuplicateNegativeWordsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NegativeWordService#getDuplicateNegativeWords");
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
 **getDuplicateNegativeWordsRequestWrapper** | [**GetDuplicateNegativeWordsRequestWrapper**](GetDuplicateNegativeWordsRequestWrapper.md)|  |

### Return type

[**GetDuplicateNegativeWordsResponseWrapper**](GetDuplicateNegativeWordsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAdgroupNegativeWords

> UpdateAdgroupNegativeWordsResponseWrapper updateAdgroupNegativeWords(updateAdgroupNegativeWordsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.negativeword.api.NegativeWordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NegativeWordService apiInstance = new NegativeWordService(defaultClient);
        UpdateAdgroupNegativeWordsRequestWrapper updateAdgroupNegativeWordsRequestWrapper = new UpdateAdgroupNegativeWordsRequestWrapper(); // UpdateAdgroupNegativeWordsRequestWrapper | 
        try {
            UpdateAdgroupNegativeWordsResponseWrapper result = apiInstance.updateAdgroupNegativeWords(updateAdgroupNegativeWordsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NegativeWordService#updateAdgroupNegativeWords");
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
 **updateAdgroupNegativeWordsRequestWrapper** | [**UpdateAdgroupNegativeWordsRequestWrapper**](UpdateAdgroupNegativeWordsRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupNegativeWordsResponseWrapper**](UpdateAdgroupNegativeWordsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAdgroupNegativeWordsSync

> UpdateAdgroupNegativeWordsSyncResponseWrapper updateAdgroupNegativeWordsSync(updateAdgroupNegativeWordsSyncRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.negativeword.api.NegativeWordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NegativeWordService apiInstance = new NegativeWordService(defaultClient);
        UpdateAdgroupNegativeWordsSyncRequestWrapper updateAdgroupNegativeWordsSyncRequestWrapper = new UpdateAdgroupNegativeWordsSyncRequestWrapper(); // UpdateAdgroupNegativeWordsSyncRequestWrapper | 
        try {
            UpdateAdgroupNegativeWordsSyncResponseWrapper result = apiInstance.updateAdgroupNegativeWordsSync(updateAdgroupNegativeWordsSyncRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NegativeWordService#updateAdgroupNegativeWordsSync");
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
 **updateAdgroupNegativeWordsSyncRequestWrapper** | [**UpdateAdgroupNegativeWordsSyncRequestWrapper**](UpdateAdgroupNegativeWordsSyncRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupNegativeWordsSyncResponseWrapper**](UpdateAdgroupNegativeWordsSyncResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCampaignNegativeWordsSync

> UpdateCampaignNegativeWordsSyncResponseWrapper updateCampaignNegativeWordsSync(updateCampaignNegativeWordsSyncRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.negativeword.api.NegativeWordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NegativeWordService apiInstance = new NegativeWordService(defaultClient);
        UpdateCampaignNegativeWordsSyncRequestWrapper updateCampaignNegativeWordsSyncRequestWrapper = new UpdateCampaignNegativeWordsSyncRequestWrapper(); // UpdateCampaignNegativeWordsSyncRequestWrapper | 
        try {
            UpdateCampaignNegativeWordsSyncResponseWrapper result = apiInstance.updateCampaignNegativeWordsSync(updateCampaignNegativeWordsSyncRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NegativeWordService#updateCampaignNegativeWordsSync");
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
 **updateCampaignNegativeWordsSyncRequestWrapper** | [**UpdateCampaignNegativeWordsSyncRequestWrapper**](UpdateCampaignNegativeWordsSyncRequestWrapper.md)|  |

### Return type

[**UpdateCampaignNegativeWordsSyncResponseWrapper**](UpdateCampaignNegativeWordsSyncResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

