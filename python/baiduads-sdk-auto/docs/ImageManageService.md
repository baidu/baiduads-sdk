# baiduads.ImageManageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**del_image**](ImageManageService.md#del_image) | **POST** /json/sms/service/ImageManageService/delImage | 
[**get_image_list**](ImageManageService.md#get_image_list) | **POST** /json/sms/service/ImageManageService/getImageList | 
[**mod_image**](ImageManageService.md#mod_image) | **POST** /json/sms/service/ImageManageService/modImage | 
[**upload_image**](ImageManageService.md#upload_image) | **POST** /json/sms/service/ImageManageService/uploadImage | 


# **del_image**
> DelImageResponseWrapper del_image(del_image_request_wrapper)



### Example


```python
import time
import baiduads
from imagemanage.api import image_manage_service
from baiduads.imagemanage.model.del_image_response_wrapper import DelImageResponseWrapper
from baiduads.imagemanage.model.del_image_request_wrapper import DelImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_manage_service.ImageManageService(api_client)
    del_image_request_wrapper = DelImageRequestWrapper(
        header=ApiRequestHeader(),
        body=DelImageRequest(
            product_line="product_line_example",
            url_list=[
                "url_list_example",
            ],
            pic_ids=[
                1,
            ],
            image_ids=[
                1,
            ],
        ),
    ) # DelImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.del_image(del_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageManageService->del_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **del_image_request_wrapper** | [**DelImageRequestWrapper**](DelImageRequestWrapper.md)|  |

### Return type

[**DelImageResponseWrapper**](DelImageResponseWrapper.md)

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

# **get_image_list**
> GetImageListResponseWrapper get_image_list(get_image_list_request_wrapper)



### Example


```python
import time
import baiduads
from imagemanage.api import image_manage_service
from baiduads.imagemanage.model.get_image_list_response_wrapper import GetImageListResponseWrapper
from baiduads.imagemanage.model.get_image_list_request_wrapper import GetImageListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_manage_service.ImageManageService(api_client)
    get_image_list_request_wrapper = GetImageListRequestWrapper(
        header=ApiRequestHeader(),
        body=ImageListRequest(
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            fields=[
                "fields_example",
            ],
            image_relation="image_relation_example",
            product_line="product_line_example",
            sort_field="sort_field_example",
            sort_order="sort_order_example",
            page_no=1,
            page_size=1,
        ),
    ) # GetImageListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_image_list(get_image_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageManageService->get_image_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_image_list_request_wrapper** | [**GetImageListRequestWrapper**](GetImageListRequestWrapper.md)|  |

### Return type

[**GetImageListResponseWrapper**](GetImageListResponseWrapper.md)

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

# **mod_image**
> ModImageResponseWrapper mod_image(mod_image_request_wrapper)



### Example


```python
import time
import baiduads
from imagemanage.api import image_manage_service
from baiduads.imagemanage.model.mod_image_response_wrapper import ModImageResponseWrapper
from baiduads.imagemanage.model.mod_image_request_wrapper import ModImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_manage_service.ImageManageService(api_client)
    mod_image_request_wrapper = ModImageRequestWrapper(
        header=ApiRequestHeader(),
        body=ModImageRequest(
            product_line="product_line_example",
            items=[
                ModImageItem(
                    url="url_example",
                    collect=True,
                    field={},
                    pic_id=1,
                    image_name="image_name_example",
                    image_id=1,
                ),
            ],
        ),
    ) # ModImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.mod_image(mod_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageManageService->mod_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_image_request_wrapper** | [**ModImageRequestWrapper**](ModImageRequestWrapper.md)|  |

### Return type

[**ModImageResponseWrapper**](ModImageResponseWrapper.md)

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
from imagemanage.api import image_manage_service
from baiduads.imagemanage.model.upload_image_response_wrapper import UploadImageResponseWrapper
from baiduads.imagemanage.model.upload_image_request_wrapper import UploadImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_manage_service.ImageManageService(api_client)
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
        print("Exception when calling ImageManageService->upload_image: %s\n" % e)
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

