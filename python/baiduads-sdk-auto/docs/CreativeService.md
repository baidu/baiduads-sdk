# baiduads.CreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_creative**](CreativeService.md#add_creative) | **POST** /json/sms/service/CreativeService/addCreative | 
[**delete_creative**](CreativeService.md#delete_creative) | **POST** /json/sms/service/CreativeService/deleteCreative | 
[**get_creative**](CreativeService.md#get_creative) | **POST** /json/sms/service/CreativeService/getCreative | 
[**update_creative**](CreativeService.md#update_creative) | **POST** /json/sms/service/CreativeService/updateCreative | 


# **add_creative**
> AddCreativeResponseWrapper add_creative(add_creative_request_wrapper)



### Example


```python
import time
import baiduads
from creative.api import creative_service
from baiduads.creative.model.add_creative_request_wrapper import AddCreativeRequestWrapper
from baiduads.creative.model.add_creative_response_wrapper import AddCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_service.CreativeService(api_client)
    add_creative_request_wrapper = AddCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCreativeAddRequest(
            creative_types=[
                ApiCreativeType(
                    campaign_id=1,
                    creative_id=1,
                    adgroup_id=1,
                    title="title_example",
                    description1="description1_example",
                    description2="description2_example",
                    pause=True,
                    status=1,
                    mobile_destination_url="mobile_destination_url_example",
                    mobile_display_url="mobile_display_url_example",
                    pc_destination_url="pc_destination_url_example",
                    pc_display_url="pc_display_url_example",
                    offline_reasons=[
                        ApiOfflineReason(
                            main_reason="main_reason_example",
                            detail_reason="detail_reason_example",
                        ),
                    ],
                    tabs=[
                        1,
                    ],
                    deeplink="deeplink_example",
                    mini_program_url="mini_program_url_example",
                    create_time="create_time_example",
                ),
            ],
        ),
    ) # AddCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_creative(add_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeService->add_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_creative_request_wrapper** | [**AddCreativeRequestWrapper**](AddCreativeRequestWrapper.md)|  |

### Return type

[**AddCreativeResponseWrapper**](AddCreativeResponseWrapper.md)

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

# **delete_creative**
> DeleteCreativeResponseWrapper delete_creative(delete_creative_request_wrapper)



### Example


```python
import time
import baiduads
from creative.api import creative_service
from baiduads.creative.model.delete_creative_request_wrapper import DeleteCreativeRequestWrapper
from baiduads.creative.model.delete_creative_response_wrapper import DeleteCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_service.CreativeService(api_client)
    delete_creative_request_wrapper = DeleteCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCreativeDelRequest(
            creative_ids=[
                1,
            ],
        ),
    ) # DeleteCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_creative(delete_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeService->delete_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_creative_request_wrapper** | [**DeleteCreativeRequestWrapper**](DeleteCreativeRequestWrapper.md)|  |

### Return type

[**DeleteCreativeResponseWrapper**](DeleteCreativeResponseWrapper.md)

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

# **get_creative**
> GetCreativeResponseWrapper get_creative(get_creative_request_wrapper)



### Example


```python
import time
import baiduads
from creative.api import creative_service
from baiduads.creative.model.get_creative_request_wrapper import GetCreativeRequestWrapper
from baiduads.creative.model.get_creative_response_wrapper import GetCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_service.CreativeService(api_client)
    get_creative_request_wrapper = GetCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCreativeQueryRequest(
            creative_fields=[
                "creative_fields_example",
            ],
            ids=[
                1,
            ],
            id_type=1,
            get_temp=1,
        ),
    ) # GetCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative(get_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeService->get_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_request_wrapper** | [**GetCreativeRequestWrapper**](GetCreativeRequestWrapper.md)|  |

### Return type

[**GetCreativeResponseWrapper**](GetCreativeResponseWrapper.md)

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

# **update_creative**
> UpdateCreativeResponseWrapper update_creative(update_creative_request_wrapper)



### Example


```python
import time
import baiduads
from creative.api import creative_service
from baiduads.creative.model.update_creative_request_wrapper import UpdateCreativeRequestWrapper
from baiduads.creative.model.update_creative_response_wrapper import UpdateCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_service.CreativeService(api_client)
    update_creative_request_wrapper = UpdateCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCreativeUpdateRequest(
            creative_types=[
                ApiCreativeType(
                    campaign_id=1,
                    creative_id=1,
                    adgroup_id=1,
                    title="title_example",
                    description1="description1_example",
                    description2="description2_example",
                    pause=True,
                    status=1,
                    mobile_destination_url="mobile_destination_url_example",
                    mobile_display_url="mobile_display_url_example",
                    pc_destination_url="pc_destination_url_example",
                    pc_display_url="pc_display_url_example",
                    offline_reasons=[
                        ApiOfflineReason(
                            main_reason="main_reason_example",
                            detail_reason="detail_reason_example",
                        ),
                    ],
                    tabs=[
                        1,
                    ],
                    deeplink="deeplink_example",
                    mini_program_url="mini_program_url_example",
                    create_time="create_time_example",
                ),
            ],
        ),
    ) # UpdateCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_creative(update_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeService->update_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_creative_request_wrapper** | [**UpdateCreativeRequestWrapper**](UpdateCreativeRequestWrapper.md)|  |

### Return type

[**UpdateCreativeResponseWrapper**](UpdateCreativeResponseWrapper.md)

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

