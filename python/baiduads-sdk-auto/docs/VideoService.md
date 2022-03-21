# baiduads.VideoService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_videos**](VideoService.md#delete_videos) | **POST** /json/sms/service/VideoService/deleteVideos | 
[**get_video_infos**](VideoService.md#get_video_infos) | **POST** /json/sms/service/VideoService/getVideoInfos | 


# **delete_videos**
> DeleteVideosResponseWrapper delete_videos(delete_videos_request_wrapper)



### Example


```python
import time
import baiduads
from video.api import video_service
from baiduads.video.model.delete_videos_response_wrapper import DeleteVideosResponseWrapper
from baiduads.video.model.delete_videos_request_wrapper import DeleteVideosRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_service.VideoService(api_client)
    delete_videos_request_wrapper = DeleteVideosRequestWrapper(
        header=ApiRequestHeader(),
        body=DelVideoRequest(
            videoids=[
                1,
            ],
        ),
    ) # DeleteVideosRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_videos(delete_videos_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoService->delete_videos: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_videos_request_wrapper** | [**DeleteVideosRequestWrapper**](DeleteVideosRequestWrapper.md)|  |

### Return type

[**DeleteVideosResponseWrapper**](DeleteVideosResponseWrapper.md)

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

# **get_video_infos**
> GetVideoInfosResponseWrapper get_video_infos(get_video_infos_request_wrapper)



### Example


```python
import time
import baiduads
from video.api import video_service
from baiduads.video.model.get_video_infos_response_wrapper import GetVideoInfosResponseWrapper
from baiduads.video.model.get_video_infos_request_wrapper import GetVideoInfosRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_service.VideoService(api_client)
    get_video_infos_request_wrapper = GetVideoInfosRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoQueryRequest(
            ids=[
                1,
            ],
            page_size=1,
            page_no=1,
        ),
    ) # GetVideoInfosRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_video_infos(get_video_infos_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoService->get_video_infos: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_video_infos_request_wrapper** | [**GetVideoInfosRequestWrapper**](GetVideoInfosRequestWrapper.md)|  |

### Return type

[**GetVideoInfosResponseWrapper**](GetVideoInfosResponseWrapper.md)

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

