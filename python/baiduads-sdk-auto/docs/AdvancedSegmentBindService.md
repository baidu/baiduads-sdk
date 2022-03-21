# baiduads.AdvancedSegmentBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_segment_bind**](AdvancedSegmentBindService.md#add_segment_bind) | **POST** /json/sms/service/AdvancedSegmentBindService/addSegmentBind | 
[**delete_segment_bind**](AdvancedSegmentBindService.md#delete_segment_bind) | **POST** /json/sms/service/AdvancedSegmentBindService/deleteSegmentBind | 
[**get_segment_bind**](AdvancedSegmentBindService.md#get_segment_bind) | **POST** /json/sms/service/AdvancedSegmentBindService/getSegmentBind | 
[**update_segment_bind**](AdvancedSegmentBindService.md#update_segment_bind) | **POST** /json/sms/service/AdvancedSegmentBindService/updateSegmentBind | 


# **add_segment_bind**
> AddSegmentBindResponseWrapper add_segment_bind(add_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegmentbind.api import advanced_segment_bind_service
from baiduads.advancedsegmentbind.model.add_segment_bind_request_wrapper import AddSegmentBindRequestWrapper
from baiduads.advancedsegmentbind.model.add_segment_bind_response_wrapper import AddSegmentBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_bind_service.AdvancedSegmentBindService(api_client)
    add_segment_bind_request_wrapper = AddSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiSegmentBatchRequest(
            items=[
                1,
            ],
        ),
    ) # AddSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_segment_bind(add_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentBindService->add_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_segment_bind_request_wrapper** | [**AddSegmentBindRequestWrapper**](AddSegmentBindRequestWrapper.md)|  |

### Return type

[**AddSegmentBindResponseWrapper**](AddSegmentBindResponseWrapper.md)

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

# **delete_segment_bind**
> DeleteSegmentBindResponseWrapper delete_segment_bind(delete_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegmentbind.api import advanced_segment_bind_service
from baiduads.advancedsegmentbind.model.delete_segment_bind_response_wrapper import DeleteSegmentBindResponseWrapper
from baiduads.advancedsegmentbind.model.delete_segment_bind_request_wrapper import DeleteSegmentBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_bind_service.AdvancedSegmentBindService(api_client)
    delete_segment_bind_request_wrapper = DeleteSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiSegmentBatchRequest(
            items=[
                1,
            ],
        ),
    ) # DeleteSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_segment_bind(delete_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentBindService->delete_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_segment_bind_request_wrapper** | [**DeleteSegmentBindRequestWrapper**](DeleteSegmentBindRequestWrapper.md)|  |

### Return type

[**DeleteSegmentBindResponseWrapper**](DeleteSegmentBindResponseWrapper.md)

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

# **get_segment_bind**
> GetSegmentBindResponseWrapper get_segment_bind(get_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegmentbind.api import advanced_segment_bind_service
from baiduads.advancedsegmentbind.model.get_segment_bind_response_wrapper import GetSegmentBindResponseWrapper
from baiduads.advancedsegmentbind.model.get_segment_bind_request_wrapper import GetSegmentBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_bind_service.AdvancedSegmentBindService(api_client)
    get_segment_bind_request_wrapper = GetSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiSegmentBindQueryRequest(
            segment_bind_type_fields=[
                "segment_bind_type_fields_example",
            ],
            bind_sources=[
                1,
            ],
            segment_types=[
                1,
            ],
            audit_statuses=[
                1,
            ],
            pauses=[
                True,
            ],
            ids=[
                1,
            ],
            id_type=1,
            limit=[
                1,
            ],
            is_desc=True,
            is_deletes=[
                True,
            ],
            count=True,
            user_id=1,
        ),
    ) # GetSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_segment_bind(get_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentBindService->get_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_segment_bind_request_wrapper** | [**GetSegmentBindRequestWrapper**](GetSegmentBindRequestWrapper.md)|  |

### Return type

[**GetSegmentBindResponseWrapper**](GetSegmentBindResponseWrapper.md)

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

# **update_segment_bind**
> UpdateSegmentBindResponseWrapper update_segment_bind(update_segment_bind_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegmentbind.api import advanced_segment_bind_service
from baiduads.advancedsegmentbind.model.update_segment_bind_response_wrapper import UpdateSegmentBindResponseWrapper
from baiduads.advancedsegmentbind.model.update_segment_bind_request_wrapper import UpdateSegmentBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_bind_service.AdvancedSegmentBindService(api_client)
    update_segment_bind_request_wrapper = UpdateSegmentBindRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiSegmentBatchRequest(
            items=[
                1,
            ],
        ),
    ) # UpdateSegmentBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_segment_bind(update_segment_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentBindService->update_segment_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_segment_bind_request_wrapper** | [**UpdateSegmentBindRequestWrapper**](UpdateSegmentBindRequestWrapper.md)|  |

### Return type

[**UpdateSegmentBindResponseWrapper**](UpdateSegmentBindResponseWrapper.md)

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

