# baiduads.VideoSynthetiseService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clip_video**](VideoSynthetiseService.md#clip_video) | **POST** /json/sms/service/VideoSynthetiseService/clipVideo | 
[**get_smart_audio_status**](VideoSynthetiseService.md#get_smart_audio_status) | **POST** /json/sms/service/VideoSynthetiseService/getSmartAudioStatus | 
[**get_task_videos**](VideoSynthetiseService.md#get_task_videos) | **POST** /json/sms/service/VideoSynthetiseService/getTaskVideos | 
[**push_smart_video**](VideoSynthetiseService.md#push_smart_video) | **POST** /json/sms/service/VideoSynthetiseService/pushSmartVideo | 
[**push_video**](VideoSynthetiseService.md#push_video) | **POST** /json/sms/service/VideoSynthetiseService/pushVideo | 
[**query_video_clip_status**](VideoSynthetiseService.md#query_video_clip_status) | **POST** /json/sms/service/VideoSynthetiseService/queryVideoClipStatus | 
[**smart_synthetise**](VideoSynthetiseService.md#smart_synthetise) | **POST** /json/sms/service/VideoSynthetiseService/smartSynthetise | 
[**synthetise_status**](VideoSynthetiseService.md#synthetise_status) | **POST** /json/sms/service/VideoSynthetiseService/synthetiseStatus | 


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

# **get_smart_audio_status**
> GetSmartAudioStatusResponseWrapper get_smart_audio_status(get_smart_audio_status_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.get_smart_audio_status_request_wrapper import GetSmartAudioStatusRequestWrapper
from baiduads.videosynthetise.model.get_smart_audio_status_response_wrapper import GetSmartAudioStatusResponseWrapper
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
    get_smart_audio_status_request_wrapper = GetSmartAudioStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoPreviewRequest(
            task_ids=[
                1,
            ],
        ),
    ) # GetSmartAudioStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_smart_audio_status(get_smart_audio_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->get_smart_audio_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_smart_audio_status_request_wrapper** | [**GetSmartAudioStatusRequestWrapper**](GetSmartAudioStatusRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_task_videos**
> GetTaskVideosResponseWrapper get_task_videos(get_task_videos_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.get_task_videos_request_wrapper import GetTaskVideosRequestWrapper
from baiduads.videosynthetise.model.get_task_videos_response_wrapper import GetTaskVideosResponseWrapper
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
    get_task_videos_request_wrapper = GetTaskVideosRequestWrapper(
        header=ApiRequestHeader(),
        body=TaskIdRequest(
            task_ids=[
                1,
            ],
        ),
    ) # GetTaskVideosRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_task_videos(get_task_videos_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->get_task_videos: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_task_videos_request_wrapper** | [**GetTaskVideosRequestWrapper**](GetTaskVideosRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **push_smart_video**
> PushSmartVideoResponseWrapper push_smart_video(push_smart_video_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.push_smart_video_response_wrapper import PushSmartVideoResponseWrapper
from baiduads.videosynthetise.model.push_smart_video_request_wrapper import PushSmartVideoRequestWrapper
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
    push_smart_video_request_wrapper = PushSmartVideoRequestWrapper(
        header=ApiRequestHeader(),
        body=SmartIdRequest(
            ids=[
                1,
            ],
        ),
    ) # PushSmartVideoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.push_smart_video(push_smart_video_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->push_smart_video: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **push_smart_video_request_wrapper** | [**PushSmartVideoRequestWrapper**](PushSmartVideoRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **push_video**
> PushVideoResponseWrapper push_video(push_video_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.push_video_request_wrapper import PushVideoRequestWrapper
from baiduads.videosynthetise.model.push_video_response_wrapper import PushVideoResponseWrapper
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
    push_video_request_wrapper = PushVideoRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoPreviewRequest(
            task_ids=[
                1,
            ],
        ),
    ) # PushVideoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.push_video(push_video_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->push_video: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **push_video_request_wrapper** | [**PushVideoRequestWrapper**](PushVideoRequestWrapper.md)|  |

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

# **smart_synthetise**
> SmartSynthetiseResponseWrapper smart_synthetise(smart_synthetise_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.smart_synthetise_request_wrapper import SmartSynthetiseRequestWrapper
from baiduads.videosynthetise.model.smart_synthetise_response_wrapper import SmartSynthetiseResponseWrapper
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
    smart_synthetise_request_wrapper = SmartSynthetiseRequestWrapper(
        header=ApiRequestHeader(),
        body=SmartSynthetiseRequest(
            video_type=1,
            materials=[
                SmartMaterialDto(
                    type="type_example",
                    url="url_example",
                    captions=[
                        "captions_example",
                    ],
                    texts=[
                        "texts_example",
                    ],
                    start_time=3.14,
                    end_time=3.14,
                    smart_cut=1,
                    key_frame=[
                        3.14,
                    ],
                ),
            ],
            preference=SmartSythetisePreferenceDto(
                bg_style=1,
                template_style=1,
                music_style=1,
                font_style=1,
                read_style=1,
            ),
        ),
    ) # SmartSynthetiseRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.smart_synthetise(smart_synthetise_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->smart_synthetise: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smart_synthetise_request_wrapper** | [**SmartSynthetiseRequestWrapper**](SmartSynthetiseRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **synthetise_status**
> SynthetiseStatusResponseWrapper synthetise_status(synthetise_status_request_wrapper)



### Example


```python
import time
import baiduads
from videosynthetise.api import video_synthetise_service
from baiduads.videosynthetise.model.synthetise_status_request_wrapper import SynthetiseStatusRequestWrapper
from baiduads.videosynthetise.model.synthetise_status_response_wrapper import SynthetiseStatusResponseWrapper
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
    synthetise_status_request_wrapper = SynthetiseStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoPreviewRequest(
            task_ids=[
                1,
            ],
        ),
    ) # SynthetiseStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.synthetise_status(synthetise_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoSynthetiseService->synthetise_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synthetise_status_request_wrapper** | [**SynthetiseStatusRequestWrapper**](SynthetiseStatusRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

