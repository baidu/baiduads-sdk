# baiduads.ImageSegmentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_image_segment**](ImageSegmentService.md#add_image_segment) | **POST** /json/sms/service/ImageSegmentService/addImageSegment | 
[**delete_image_segment**](ImageSegmentService.md#delete_image_segment) | **POST** /json/sms/service/ImageSegmentService/deleteImageSegment | 
[**get_image_segment**](ImageSegmentService.md#get_image_segment) | **POST** /json/sms/service/ImageSegmentService/getImageSegment | 
[**update_image_segment**](ImageSegmentService.md#update_image_segment) | **POST** /json/sms/service/ImageSegmentService/updateImageSegment | 


# **add_image_segment**
> AddImageSegmentResponseWrapper add_image_segment(add_image_segment_request_wrapper)



### Example


```python
import time
import baiduads
from imagesegment.api import image_segment_service
from baiduads.imagesegment.model.add_image_segment_response_wrapper import AddImageSegmentResponseWrapper
from baiduads.imagesegment.model.add_image_segment_request_wrapper import AddImageSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_segment_service.ImageSegmentService(api_client)
    add_image_segment_request_wrapper = AddImageSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=AddImageSegmentRequestType(
            add_segment_request_types=[
                AddImageSegmentType(
                    src_image_content="src_image_content_example",
                    segment_type=1,
                    desc=[
                        "desc_example",
                    ],
                    crop_location=CoordinateType(
                        x=1,
                        y=1,
                    ),
                    logo_pic_types=[
                        LogoPicType(
                            area=1,
                            gravity_x=1,
                            gravity_y=1,
                            logo_img_content="logo_img_content_example",
                            opacity=1,
                        ),
                    ],
                    image_id=1,
                ),
            ],
            preview=True,
        ),
    ) # AddImageSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_image_segment(add_image_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageSegmentService->add_image_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_image_segment_request_wrapper** | [**AddImageSegmentRequestWrapper**](AddImageSegmentRequestWrapper.md)|  |

### Return type

[**AddImageSegmentResponseWrapper**](AddImageSegmentResponseWrapper.md)

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

# **delete_image_segment**
> DeleteImageSegmentResponseWrapper delete_image_segment(delete_image_segment_request_wrapper)



### Example


```python
import time
import baiduads
from imagesegment.api import image_segment_service
from baiduads.imagesegment.model.delete_image_segment_response_wrapper import DeleteImageSegmentResponseWrapper
from baiduads.imagesegment.model.delete_image_segment_request_wrapper import DeleteImageSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_segment_service.ImageSegmentService(api_client)
    delete_image_segment_request_wrapper = DeleteImageSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteImageSegmentRequestType(
            segment_ids=[
                1,
            ],
        ),
    ) # DeleteImageSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_image_segment(delete_image_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageSegmentService->delete_image_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_image_segment_request_wrapper** | [**DeleteImageSegmentRequestWrapper**](DeleteImageSegmentRequestWrapper.md)|  |

### Return type

[**DeleteImageSegmentResponseWrapper**](DeleteImageSegmentResponseWrapper.md)

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

# **get_image_segment**
> GetImageSegmentResponseWrapper get_image_segment(get_image_segment_request_wrapper)



### Example


```python
import time
import baiduads
from imagesegment.api import image_segment_service
from baiduads.imagesegment.model.get_image_segment_response_wrapper import GetImageSegmentResponseWrapper
from baiduads.imagesegment.model.get_image_segment_request_wrapper import GetImageSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_segment_service.ImageSegmentService(api_client)
    get_image_segment_request_wrapper = GetImageSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=GetImageSegmentRequestType(
            segment_ids=[
                1,
            ],
            segment_fields=[
                "segment_fields_example",
            ],
        ),
    ) # GetImageSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_image_segment(get_image_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageSegmentService->get_image_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_image_segment_request_wrapper** | [**GetImageSegmentRequestWrapper**](GetImageSegmentRequestWrapper.md)|  |

### Return type

[**GetImageSegmentResponseWrapper**](GetImageSegmentResponseWrapper.md)

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

# **update_image_segment**
> UpdateImageSegmentResponseWrapper update_image_segment(update_image_segment_request_wrapper)



### Example


```python
import time
import baiduads
from imagesegment.api import image_segment_service
from baiduads.imagesegment.model.update_image_segment_response_wrapper import UpdateImageSegmentResponseWrapper
from baiduads.imagesegment.model.update_image_segment_request_wrapper import UpdateImageSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_segment_service.ImageSegmentService(api_client)
    update_image_segment_request_wrapper = UpdateImageSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateImageSegmentType(
            segment_types=[
                ImageSegmentType(
                    segment_id=1,
                    desc=[
                        "desc_example",
                    ],
                    url="url_example",
                    segment_type=1,
                    segment_sign="segment_sign_example",
                    status=1,
                    audit_status=1,
                    reason_text="reason_text_example",
                    image_id=1,
                ),
            ],
        ),
    ) # UpdateImageSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_image_segment(update_image_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageSegmentService->update_image_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_image_segment_request_wrapper** | [**UpdateImageSegmentRequestWrapper**](UpdateImageSegmentRequestWrapper.md)|  |

### Return type

[**UpdateImageSegmentResponseWrapper**](UpdateImageSegmentResponseWrapper.md)

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

