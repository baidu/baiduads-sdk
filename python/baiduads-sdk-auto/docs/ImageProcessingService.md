# baiduads.ImageProcessingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_crop_image**](ImageProcessingService.md#add_crop_image) | **POST** /json/feed/v1/ImageProcessingService/addCropImage | 
[**get_default_video_cover_feed**](ImageProcessingService.md#get_default_video_cover_feed) | **POST** /json/feed/v1/ImageProcessingService/getDefaultVideoCoverFeed | 


# **add_crop_image**
> AddCropImageResponseWrapper add_crop_image(add_crop_image_request_wrapper)



### Example


```python
import time
import baiduads
from imageprocessing.api import image_processing_service
from baiduads.imageprocessing.model.add_crop_image_request_wrapper import AddCropImageRequestWrapper
from baiduads.imageprocessing.model.add_crop_image_response_wrapper import AddCropImageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_processing_service.ImageProcessingService(api_client)
    add_crop_image_request_wrapper = AddCropImageRequestWrapper(
        header=ApiRequestHeader(),
        body=ImageCropRequest(
            src_url="src_url_example",
            width=1,
            height=1,
            desc="desc_example",
        ),
    ) # AddCropImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_crop_image(add_crop_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageProcessingService->add_crop_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_crop_image_request_wrapper** | [**AddCropImageRequestWrapper**](AddCropImageRequestWrapper.md)|  |

### Return type

[**AddCropImageResponseWrapper**](AddCropImageResponseWrapper.md)

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

# **get_default_video_cover_feed**
> GetDefaultVideoCoverFeedResponseWrapper get_default_video_cover_feed(get_default_video_cover_feed_request_wrapper)



### Example


```python
import time
import baiduads
from imageprocessing.api import image_processing_service
from baiduads.imageprocessing.model.get_default_video_cover_feed_request_wrapper import GetDefaultVideoCoverFeedRequestWrapper
from baiduads.imageprocessing.model.get_default_video_cover_feed_response_wrapper import GetDefaultVideoCoverFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_processing_service.ImageProcessingService(api_client)
    get_default_video_cover_feed_request_wrapper = GetDefaultVideoCoverFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoCoverFeedRequest(
            video_id=1,
        ),
    ) # GetDefaultVideoCoverFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_default_video_cover_feed(get_default_video_cover_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageProcessingService->get_default_video_cover_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_default_video_cover_feed_request_wrapper** | [**GetDefaultVideoCoverFeedRequestWrapper**](GetDefaultVideoCoverFeedRequestWrapper.md)|  |

### Return type

[**GetDefaultVideoCoverFeedResponseWrapper**](GetDefaultVideoCoverFeedResponseWrapper.md)

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

