# VideoSynthetiseService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clipVideo**](VideoSynthetiseService.md#clipVideo) | **POST** /json/sms/service/VideoSynthetiseService/clipVideo | 
[**getSmartAudioStatus**](VideoSynthetiseService.md#getSmartAudioStatus) | **POST** /json/sms/service/VideoSynthetiseService/getSmartAudioStatus | 
[**getTaskVideos**](VideoSynthetiseService.md#getTaskVideos) | **POST** /json/sms/service/VideoSynthetiseService/getTaskVideos | 
[**pushSmartVideo**](VideoSynthetiseService.md#pushSmartVideo) | **POST** /json/sms/service/VideoSynthetiseService/pushSmartVideo | 
[**pushVideo**](VideoSynthetiseService.md#pushVideo) | **POST** /json/sms/service/VideoSynthetiseService/pushVideo | 
[**queryVideoClipStatus**](VideoSynthetiseService.md#queryVideoClipStatus) | **POST** /json/sms/service/VideoSynthetiseService/queryVideoClipStatus | 
[**smartSynthetise**](VideoSynthetiseService.md#smartSynthetise) | **POST** /json/sms/service/VideoSynthetiseService/smartSynthetise | 
[**synthetiseStatus**](VideoSynthetiseService.md#synthetiseStatus) | **POST** /json/sms/service/VideoSynthetiseService/synthetiseStatus | 



## clipVideo

> ClipVideoResponseWrapper clipVideo(clipVideoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        ClipVideoRequestWrapper clipVideoRequestWrapper = new ClipVideoRequestWrapper(); // ClipVideoRequestWrapper | 
        try {
            ClipVideoResponseWrapper result = apiInstance.clipVideo(clipVideoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#clipVideo");
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
 **clipVideoRequestWrapper** | [**ClipVideoRequestWrapper**](ClipVideoRequestWrapper.md)|  |

### Return type

[**ClipVideoResponseWrapper**](ClipVideoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSmartAudioStatus

> GetSmartAudioStatusResponseWrapper getSmartAudioStatus(getSmartAudioStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        GetSmartAudioStatusRequestWrapper getSmartAudioStatusRequestWrapper = new GetSmartAudioStatusRequestWrapper(); // GetSmartAudioStatusRequestWrapper | 
        try {
            GetSmartAudioStatusResponseWrapper result = apiInstance.getSmartAudioStatus(getSmartAudioStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#getSmartAudioStatus");
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
 **getSmartAudioStatusRequestWrapper** | [**GetSmartAudioStatusRequestWrapper**](GetSmartAudioStatusRequestWrapper.md)|  |

### Return type

[**GetSmartAudioStatusResponseWrapper**](GetSmartAudioStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTaskVideos

> GetTaskVideosResponseWrapper getTaskVideos(getTaskVideosRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        GetTaskVideosRequestWrapper getTaskVideosRequestWrapper = new GetTaskVideosRequestWrapper(); // GetTaskVideosRequestWrapper | 
        try {
            GetTaskVideosResponseWrapper result = apiInstance.getTaskVideos(getTaskVideosRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#getTaskVideos");
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
 **getTaskVideosRequestWrapper** | [**GetTaskVideosRequestWrapper**](GetTaskVideosRequestWrapper.md)|  |

### Return type

[**GetTaskVideosResponseWrapper**](GetTaskVideosResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## pushSmartVideo

> PushSmartVideoResponseWrapper pushSmartVideo(pushSmartVideoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        PushSmartVideoRequestWrapper pushSmartVideoRequestWrapper = new PushSmartVideoRequestWrapper(); // PushSmartVideoRequestWrapper | 
        try {
            PushSmartVideoResponseWrapper result = apiInstance.pushSmartVideo(pushSmartVideoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#pushSmartVideo");
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
 **pushSmartVideoRequestWrapper** | [**PushSmartVideoRequestWrapper**](PushSmartVideoRequestWrapper.md)|  |

### Return type

[**PushSmartVideoResponseWrapper**](PushSmartVideoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## pushVideo

> PushVideoResponseWrapper pushVideo(pushVideoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        PushVideoRequestWrapper pushVideoRequestWrapper = new PushVideoRequestWrapper(); // PushVideoRequestWrapper | 
        try {
            PushVideoResponseWrapper result = apiInstance.pushVideo(pushVideoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#pushVideo");
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
 **pushVideoRequestWrapper** | [**PushVideoRequestWrapper**](PushVideoRequestWrapper.md)|  |

### Return type

[**PushVideoResponseWrapper**](PushVideoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryVideoClipStatus

> QueryVideoClipStatusResponseWrapper queryVideoClipStatus(queryVideoClipStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        QueryVideoClipStatusRequestWrapper queryVideoClipStatusRequestWrapper = new QueryVideoClipStatusRequestWrapper(); // QueryVideoClipStatusRequestWrapper | 
        try {
            QueryVideoClipStatusResponseWrapper result = apiInstance.queryVideoClipStatus(queryVideoClipStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#queryVideoClipStatus");
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
 **queryVideoClipStatusRequestWrapper** | [**QueryVideoClipStatusRequestWrapper**](QueryVideoClipStatusRequestWrapper.md)|  |

### Return type

[**QueryVideoClipStatusResponseWrapper**](QueryVideoClipStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## smartSynthetise

> SmartSynthetiseResponseWrapper smartSynthetise(smartSynthetiseRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        SmartSynthetiseRequestWrapper smartSynthetiseRequestWrapper = new SmartSynthetiseRequestWrapper(); // SmartSynthetiseRequestWrapper | 
        try {
            SmartSynthetiseResponseWrapper result = apiInstance.smartSynthetise(smartSynthetiseRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#smartSynthetise");
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
 **smartSynthetiseRequestWrapper** | [**SmartSynthetiseRequestWrapper**](SmartSynthetiseRequestWrapper.md)|  |

### Return type

[**SmartSynthetiseResponseWrapper**](SmartSynthetiseResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## synthetiseStatus

> SynthetiseStatusResponseWrapper synthetiseStatus(synthetiseStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        SynthetiseStatusRequestWrapper synthetiseStatusRequestWrapper = new SynthetiseStatusRequestWrapper(); // SynthetiseStatusRequestWrapper | 
        try {
            SynthetiseStatusResponseWrapper result = apiInstance.synthetiseStatus(synthetiseStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#synthetiseStatus");
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
 **synthetiseStatusRequestWrapper** | [**SynthetiseStatusRequestWrapper**](SynthetiseStatusRequestWrapper.md)|  |

### Return type

[**SynthetiseStatusResponseWrapper**](SynthetiseStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

