# baiduads.LivePreviewService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_live_preview**](LivePreviewService.md#get_live_preview) | **POST** /json/sms/service/LivePreviewService/getLivePreview | 


# **get_live_preview**
> GetLivePreviewResponseWrapper get_live_preview(get_live_preview_request_wrapper)



### Example


```python
import time
import baiduads
from livepreview.api import live_preview_service
from baiduads.livepreview.model.get_live_preview_request_wrapper import GetLivePreviewRequestWrapper
from baiduads.livepreview.model.get_live_preview_response_wrapper import GetLivePreviewResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = live_preview_service.LivePreviewService(api_client)
    get_live_preview_request_wrapper = GetLivePreviewRequestWrapper(
        header=ApiRequestHeader(),
        body=GetPreviewRequest(
            key_words=[
                "key_words_example",
            ],
            device=1,
            region=1,
            page=1,
        ),
    ) # GetLivePreviewRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_live_preview(get_live_preview_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LivePreviewService->get_live_preview: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_live_preview_request_wrapper** | [**GetLivePreviewRequestWrapper**](GetLivePreviewRequestWrapper.md)|  |

### Return type

[**GetLivePreviewResponseWrapper**](GetLivePreviewResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

