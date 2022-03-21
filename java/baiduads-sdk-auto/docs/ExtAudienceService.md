# ExtAudienceService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmptyGroup**](ExtAudienceService.md#createEmptyGroup) | **POST** /json/sms/service/ExtAudienceService/createEmptyGroup | 
[**getAudienceList**](ExtAudienceService.md#getAudienceList) | **POST** /json/sms/service/ExtAudienceService/getAudienceList | 
[**updateAudienceDsp**](ExtAudienceService.md#updateAudienceDsp) | **POST** /json/sms/service/ExtAudienceService/updateAudienceDsp | 
[**updateIdUpload4Pour**](ExtAudienceService.md#updateIdUpload4Pour) | **POST** /json/sms/service/ExtAudienceService/updateIdUpload4Pour | 



## createEmptyGroup

> CreateEmptyGroupResponseWrapper createEmptyGroup(createEmptyGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.extaudience.api.ExtAudienceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ExtAudienceService apiInstance = new ExtAudienceService(defaultClient);
        CreateEmptyGroupRequestWrapper createEmptyGroupRequestWrapper = new CreateEmptyGroupRequestWrapper(); // CreateEmptyGroupRequestWrapper | 
        try {
            CreateEmptyGroupResponseWrapper result = apiInstance.createEmptyGroup(createEmptyGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtAudienceService#createEmptyGroup");
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
 **createEmptyGroupRequestWrapper** | [**CreateEmptyGroupRequestWrapper**](CreateEmptyGroupRequestWrapper.md)|  |

### Return type

[**CreateEmptyGroupResponseWrapper**](CreateEmptyGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAudienceList

> GetAudienceListResponseWrapper getAudienceList(getAudienceListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.extaudience.api.ExtAudienceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ExtAudienceService apiInstance = new ExtAudienceService(defaultClient);
        GetAudienceListRequestWrapper getAudienceListRequestWrapper = new GetAudienceListRequestWrapper(); // GetAudienceListRequestWrapper | 
        try {
            GetAudienceListResponseWrapper result = apiInstance.getAudienceList(getAudienceListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtAudienceService#getAudienceList");
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
 **getAudienceListRequestWrapper** | [**GetAudienceListRequestWrapper**](GetAudienceListRequestWrapper.md)|  |

### Return type

[**GetAudienceListResponseWrapper**](GetAudienceListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAudienceDsp

> UpdateAudienceDspResponseWrapper updateAudienceDsp(updateAudienceDspRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.extaudience.api.ExtAudienceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ExtAudienceService apiInstance = new ExtAudienceService(defaultClient);
        UpdateAudienceDspRequestWrapper updateAudienceDspRequestWrapper = new UpdateAudienceDspRequestWrapper(); // UpdateAudienceDspRequestWrapper | 
        try {
            UpdateAudienceDspResponseWrapper result = apiInstance.updateAudienceDsp(updateAudienceDspRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtAudienceService#updateAudienceDsp");
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
 **updateAudienceDspRequestWrapper** | [**UpdateAudienceDspRequestWrapper**](UpdateAudienceDspRequestWrapper.md)|  |

### Return type

[**UpdateAudienceDspResponseWrapper**](UpdateAudienceDspResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateIdUpload4Pour

> UpdateIdUpload4PourResponseWrapper updateIdUpload4Pour(updateIdUpload4PourRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.extaudience.api.ExtAudienceService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ExtAudienceService apiInstance = new ExtAudienceService(defaultClient);
        UpdateIdUpload4PourRequestWrapper updateIdUpload4PourRequestWrapper = new UpdateIdUpload4PourRequestWrapper(); // UpdateIdUpload4PourRequestWrapper | 
        try {
            UpdateIdUpload4PourResponseWrapper result = apiInstance.updateIdUpload4Pour(updateIdUpload4PourRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtAudienceService#updateIdUpload4Pour");
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
 **updateIdUpload4PourRequestWrapper** | [**UpdateIdUpload4PourRequestWrapper**](UpdateIdUpload4PourRequestWrapper.md)|  |

### Return type

[**UpdateIdUpload4PourResponseWrapper**](UpdateIdUpload4PourResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

