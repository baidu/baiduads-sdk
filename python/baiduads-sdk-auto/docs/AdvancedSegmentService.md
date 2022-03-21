# baiduads.AdvancedSegmentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_segment**](AdvancedSegmentService.md#add_segment) | **POST** /json/sms/service/AdvancedSegmentService/addSegment | 
[**delete_segment**](AdvancedSegmentService.md#delete_segment) | **POST** /json/sms/service/AdvancedSegmentService/deleteSegment | 
[**get_segment**](AdvancedSegmentService.md#get_segment) | **POST** /json/sms/service/AdvancedSegmentService/getSegment | 
[**update_segment**](AdvancedSegmentService.md#update_segment) | **POST** /json/sms/service/AdvancedSegmentService/updateSegment | 


# **add_segment**
> AddSegmentResponseWrapper add_segment(add_segment_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegment.api import advanced_segment_service
from baiduads.advancedsegment.model.add_segment_response_wrapper import AddSegmentResponseWrapper
from baiduads.advancedsegment.model.add_segment_request_wrapper import AddSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_service.AdvancedSegmentService(api_client)
    add_segment_request_wrapper = AddSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiSegmentBatchRequest(
            items=[
                SegmentType(
                    segment_id=1,
                    source=1,
                    segment_type=1,
                    audit_content={},
                    content={},
                    pause=True,
                    user_id=1,
                    mod_time="mod_time_example",
                    status=1,
                    whole_reason="whole_reason_example",
                ),
            ],
        ),
    ) # AddSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_segment(add_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentService->add_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_segment_request_wrapper** | [**AddSegmentRequestWrapper**](AddSegmentRequestWrapper.md)|  |

### Return type

[**AddSegmentResponseWrapper**](AddSegmentResponseWrapper.md)

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

# **delete_segment**
> DeleteSegmentResponseWrapper delete_segment(delete_segment_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegment.api import advanced_segment_service
from baiduads.advancedsegment.model.delete_segment_request_wrapper import DeleteSegmentRequestWrapper
from baiduads.advancedsegment.model.delete_segment_response_wrapper import DeleteSegmentResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_service.AdvancedSegmentService(api_client)
    delete_segment_request_wrapper = DeleteSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchRequest(
            items=[
                1,
            ],
        ),
    ) # DeleteSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_segment(delete_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentService->delete_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_segment_request_wrapper** | [**DeleteSegmentRequestWrapper**](DeleteSegmentRequestWrapper.md)|  |

### Return type

[**DeleteSegmentResponseWrapper**](DeleteSegmentResponseWrapper.md)

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

# **get_segment**
> GetSegmentResponseWrapper get_segment(get_segment_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegment.api import advanced_segment_service
from baiduads.advancedsegment.model.get_segment_request_wrapper import GetSegmentRequestWrapper
from baiduads.advancedsegment.model.get_segment_response_wrapper import GetSegmentResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_service.AdvancedSegmentService(api_client)
    get_segment_request_wrapper = GetSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=SegmentQueryRequest(
            order_by="order_by_example",
            segment_types=[
                1,
            ],
            ids=[
                1,
            ],
            id_type=1,
        ),
    ) # GetSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_segment(get_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentService->get_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_segment_request_wrapper** | [**GetSegmentRequestWrapper**](GetSegmentRequestWrapper.md)|  |

### Return type

[**GetSegmentResponseWrapper**](GetSegmentResponseWrapper.md)

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

# **update_segment**
> UpdateSegmentResponseWrapper update_segment(update_segment_request_wrapper)



### Example


```python
import time
import baiduads
from advancedsegment.api import advanced_segment_service
from baiduads.advancedsegment.model.update_segment_response_wrapper import UpdateSegmentResponseWrapper
from baiduads.advancedsegment.model.update_segment_request_wrapper import UpdateSegmentRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advanced_segment_service.AdvancedSegmentService(api_client)
    update_segment_request_wrapper = UpdateSegmentRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchRequest(
            items=[
                1,
            ],
        ),
    ) # UpdateSegmentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_segment(update_segment_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdvancedSegmentService->update_segment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_segment_request_wrapper** | [**UpdateSegmentRequestWrapper**](UpdateSegmentRequestWrapper.md)|  |

### Return type

[**UpdateSegmentResponseWrapper**](UpdateSegmentResponseWrapper.md)

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

