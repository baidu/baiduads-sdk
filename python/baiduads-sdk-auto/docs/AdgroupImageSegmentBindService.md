# baiduads.AdgroupImageSegmentBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_adgroup_image_segment_bind**](AdgroupImageSegmentBindService.md#add_adgroup_image_segment_bind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/addAdgroupImageSegmentBind | 
[**delete_adgroup_image_segment_bind**](AdgroupImageSegmentBindService.md#delete_adgroup_image_segment_bind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/deleteAdgroupImageSegmentBind | 
[**get_adgroup_image_segment_bind**](AdgroupImageSegmentBindService.md#get_adgroup_image_segment_bind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/getAdgroupImageSegmentBind | 


# **add_adgroup_image_segment_bind**
> AddAdgroupImageSegmentBindResponseWrapper add_adgroup_image_segment_bind(add_adgroup_image_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupimagesegmentbind.api import adgroup_image_segment_bind_service
from baiduads.adgroupimagesegmentbind.model.add_adgroup_image_segment_bind_response_wrapper import AddAdgroupImageSegmentBindResponseWrapper
from baiduads.adgroupimagesegmentbind.model.add_adgroup_image_segment_bind_request_wrapper import AddAdgroupImageSegmentBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_image_segment_bind_service.AdgroupImageSegmentBindService(api_client)
    add_adgroup_image_segment_bind_request_wrapper = AddAdgroupImageSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=AddAdgroupImageSegmentBindType(
            adgroup_image_segment_bind_id_types=[
                AdgroupImageSegmentBindIdType(
                    adgroup_id=1,
                    segment_id=1,
                ),
            ],
        ),
    ) # AddAdgroupImageSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_adgroup_image_segment_bind(add_adgroup_image_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupImageSegmentBindService->add_adgroup_image_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_adgroup_image_segment_bind_request_wrapper** | [**AddAdgroupImageSegmentBindRequestWrapper**](AddAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**AddAdgroupImageSegmentBindResponseWrapper**](AddAdgroupImageSegmentBindResponseWrapper.md)

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

# **delete_adgroup_image_segment_bind**
> DeleteAdgroupImageSegmentBindResponseWrapper delete_adgroup_image_segment_bind(delete_adgroup_image_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupimagesegmentbind.api import adgroup_image_segment_bind_service
from baiduads.adgroupimagesegmentbind.model.delete_adgroup_image_segment_bind_request_wrapper import DeleteAdgroupImageSegmentBindRequestWrapper
from baiduads.adgroupimagesegmentbind.model.delete_adgroup_image_segment_bind_response_wrapper import DeleteAdgroupImageSegmentBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_image_segment_bind_service.AdgroupImageSegmentBindService(api_client)
    delete_adgroup_image_segment_bind_request_wrapper = DeleteAdgroupImageSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteAdgroupImageSegmentBindRequestType(
            bind_ids=[
                1,
            ],
        ),
    ) # DeleteAdgroupImageSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_adgroup_image_segment_bind(delete_adgroup_image_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupImageSegmentBindService->delete_adgroup_image_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_adgroup_image_segment_bind_request_wrapper** | [**DeleteAdgroupImageSegmentBindRequestWrapper**](DeleteAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupImageSegmentBindResponseWrapper**](DeleteAdgroupImageSegmentBindResponseWrapper.md)

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

# **get_adgroup_image_segment_bind**
> GetAdgroupImageSegmentBindResponseWrapper get_adgroup_image_segment_bind(get_adgroup_image_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupimagesegmentbind.api import adgroup_image_segment_bind_service
from baiduads.adgroupimagesegmentbind.model.get_adgroup_image_segment_bind_request_wrapper import GetAdgroupImageSegmentBindRequestWrapper
from baiduads.adgroupimagesegmentbind.model.get_adgroup_image_segment_bind_response_wrapper import GetAdgroupImageSegmentBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_image_segment_bind_service.AdgroupImageSegmentBindService(api_client)
    get_adgroup_image_segment_bind_request_wrapper = GetAdgroupImageSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAdgroupImageSegmentBindRequestType(
            adgroup_ids=[
                1,
            ],
            fields=[
                "fields_example",
            ],
            limit=[
                1,
            ],
        ),
    ) # GetAdgroupImageSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup_image_segment_bind(get_adgroup_image_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupImageSegmentBindService->get_adgroup_image_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_adgroup_image_segment_bind_request_wrapper** | [**GetAdgroupImageSegmentBindRequestWrapper**](GetAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**GetAdgroupImageSegmentBindResponseWrapper**](GetAdgroupImageSegmentBindResponseWrapper.md)

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

