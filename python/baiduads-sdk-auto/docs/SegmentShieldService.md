# baiduads.SegmentShieldService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_segment_shield**](SegmentShieldService.md#add_segment_shield) | **POST** /json/sms/service/SegmentShieldService/addSegmentShield | 
[**get_segment_shield_page**](SegmentShieldService.md#get_segment_shield_page) | **POST** /json/sms/service/SegmentShieldService/getSegmentShieldPage | 


# **add_segment_shield**
> AddSegmentShieldResponseWrapper add_segment_shield(add_segment_shield_request_wrapper)



### Example


```python
import time
import baiduads
from segmentshield.api import segment_shield_service
from baiduads.segmentshield.model.add_segment_shield_request_wrapper import AddSegmentShieldRequestWrapper
from baiduads.segmentshield.model.add_segment_shield_response_wrapper import AddSegmentShieldResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = segment_shield_service.SegmentShieldService(api_client)
    add_segment_shield_request_wrapper = AddSegmentShieldRequestWrapper(
        header=ApiRequestHeader(),
        body=SegmentShieldModRequest(
            segment_shield_types=[
                SegmentShieldType(
                    shield_id=1,
                    user_id=1,
                    content="content_example",
                    product=1,
                    type=1,
                    is_delete=True,
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                    opt_id=1,
                    segment_sign="segment_sign_example",
                ),
            ],
        ),
    ) # AddSegmentShieldRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_segment_shield(add_segment_shield_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SegmentShieldService->add_segment_shield: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_segment_shield_request_wrapper** | [**AddSegmentShieldRequestWrapper**](AddSegmentShieldRequestWrapper.md)|  |

### Return type

[**AddSegmentShieldResponseWrapper**](AddSegmentShieldResponseWrapper.md)

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

# **get_segment_shield_page**
> GetSegmentShieldPageResponseWrapper get_segment_shield_page(get_segment_shield_page_request_wrapper)



### Example


```python
import time
import baiduads
from segmentshield.api import segment_shield_service
from baiduads.segmentshield.model.get_segment_shield_page_response_wrapper import GetSegmentShieldPageResponseWrapper
from baiduads.segmentshield.model.get_segment_shield_page_request_wrapper import GetSegmentShieldPageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = segment_shield_service.SegmentShieldService(api_client)
    get_segment_shield_page_request_wrapper = GetSegmentShieldPageRequestWrapper(
        header=ApiRequestHeader(),
        body=SegmentShieldQueryRequest(
            segment_shield_fields=[
                "segment_shield_fields_example",
            ],
            shield_ids=[
                1,
            ],
            products=[
                1,
            ],
            types=[
                1,
            ],
            limit=[
                1,
            ],
            segment_signs=[
                "segment_signs_example",
            ],
        ),
    ) # GetSegmentShieldPageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_segment_shield_page(get_segment_shield_page_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SegmentShieldService->get_segment_shield_page: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_segment_shield_page_request_wrapper** | [**GetSegmentShieldPageRequestWrapper**](GetSegmentShieldPageRequestWrapper.md)|  |

### Return type

[**GetSegmentShieldPageResponseWrapper**](GetSegmentShieldPageResponseWrapper.md)

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

