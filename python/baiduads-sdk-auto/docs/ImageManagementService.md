# baiduads.ImageManagementService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_video_extract_image**](ImageManagementService.md#get_video_extract_image) | **POST** /json/sms/service/ImageManagementService/getVideoExtractImage | 
[**upload_image**](ImageManagementService.md#upload_image) | **POST** /json/sms/service/ImageManagementService/uploadImage | 


# **get_video_extract_image**
> GetVideoExtractImageResponseWrapper get_video_extract_image(get_video_extract_image_request_wrapper)



### Example


```python
import time
import baiduads
from imagemanagement.api import image_management_service
from baiduads.imagemanagement.model.get_video_extract_image_response_wrapper import GetVideoExtractImageResponseWrapper
from baiduads.imagemanagement.model.get_video_extract_image_request_wrapper import GetVideoExtractImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_management_service.ImageManagementService(api_client)
    get_video_extract_image_request_wrapper = GetVideoExtractImageRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoExtractRequest(
            video_id=1,
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            product_line="product_line_example",
            sort_field="sort_field_example",
            sort_order="sort_order_example",
            page_no=1,
            page_size=1,
        ),
    ) # GetVideoExtractImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_video_extract_image(get_video_extract_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageManagementService->get_video_extract_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_video_extract_image_request_wrapper** | [**GetVideoExtractImageRequestWrapper**](GetVideoExtractImageRequestWrapper.md)|  |

### Return type

[**GetVideoExtractImageResponseWrapper**](GetVideoExtractImageResponseWrapper.md)

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

# **upload_image**
> UploadImageResponseWrapper upload_image(upload_image_request_wrapper)



### Example


```python
import time
import baiduads
from imagemanagement.api import image_management_service
from baiduads.imagemanagement.model.upload_image_response_wrapper import UploadImageResponseWrapper
from baiduads.imagemanagement.model.upload_image_request_wrapper import UploadImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_management_service.ImageManagementService(api_client)
    upload_image_request_wrapper = UploadImageRequestWrapper(
        header=ApiRequestHeader(),
        body=UploadImageRequest(
            items=[
                UploadImageItem(
                    content="content_example",
                    imgmd5="imgmd5_example",
                    parent_url="parent_url_example",
                    provided_path="provided_path_example",
                    provided_url="provided_url_example",
                    extend_field={},
                    target_format="target_format_example",
                    source_type=1,
                    logo_pic_types=[
                        LogoPicType(
                            area=1,
                            gravity_x=1,
                            gravity_y=1,
                            logo_content="logo_content_example",
                            opacity=1,
                            logo_md5="logo_md5_example",
                            image_name="image_name_example",
                        ),
                    ],
                    image_name="image_name_example",
                ),
            ],
            need_mola=True,
            product_line="product_line_example",
            add_image=True,
            compression=1,
            compression_conf=CompressionConf(
                quality=1,
                resize_width=1,
                max_size=1,
                min_size=1,
            ),
            token="token_example",
        ),
    ) # UploadImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.upload_image(upload_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageManagementService->upload_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_image_request_wrapper** | [**UploadImageRequestWrapper**](UploadImageRequestWrapper.md)|  |

### Return type

[**UploadImageResponseWrapper**](UploadImageResponseWrapper.md)

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

