# baiduads.VideoSynthetiseService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clip_video**](VideoSynthetiseService.md#clip_video) | **POST** /json/sms/service/VideoSynthetiseService/clipVideo | 
[**query_video_clip_status**](VideoSynthetiseService.md#query_video_clip_status) | **POST** /json/sms/service/VideoSynthetiseService/queryVideoClipStatus | 


# **clip_video**
> ClipVideoResponseWrapper clip_video(clip_video_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.clip_video_response_wrapper import ClipVideoResponseWrapper
from baiduads.videosynthetise.model.clip_video_request_wrapper import ClipVideoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_synthetise_service.VideoSynthetiseService(api_client)
    clip_video_request_wrapper = ClipVideoRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoClipRequest(
            cut_type=1,
            url="url_example",
            duration=1,
            begin_time=1,
            end_time=1,
            source=1,
            video_id=1,
            highlight_list=[
                3.14,
            ],
            product_line="product_line_example",
        ),
    ) # ClipVideoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.clip_video(clip_video_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->clip_video: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clip_video_request_wrapper** | [**ClipVideoRequestWrapper**](ClipVideoRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_video_clip_status**
> QueryVideoClipStatusResponseWrapper query_video_clip_status(query_video_clip_status_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.query_video_clip_status_request_wrapper import QueryVideoClipStatusRequestWrapper
from baiduads.videosynthetise.model.query_video_clip_status_response_wrapper import QueryVideoClipStatusResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_synthetise_service.VideoSynthetiseService(api_client)
    query_video_clip_status_request_wrapper = QueryVideoClipStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoPreviewRequest(
            task_ids=[
                1,
            ],
            tag=1,
        ),
    ) # QueryVideoClipStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_video_clip_status(query_video_clip_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->query_video_clip_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_video_clip_status_request_wrapper** | [**QueryVideoClipStatusRequestWrapper**](QueryVideoClipStatusRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

