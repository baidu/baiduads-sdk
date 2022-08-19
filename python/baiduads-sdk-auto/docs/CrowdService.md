# baiduads.CrowdService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_crowd**](CrowdService.md#add_crowd) | **POST** /json/sms/service/CrowdService/addCrowd | 
[**delete_crowd**](CrowdService.md#delete_crowd) | **POST** /json/sms/service/CrowdService/deleteCrowd | 
[**get_crowd**](CrowdService.md#get_crowd) | **POST** /json/sms/service/CrowdService/getCrowd | 
[**update_crowd**](CrowdService.md#update_crowd) | **POST** /json/sms/service/CrowdService/updateCrowd | 


# **add_crowd**
> AddCrowdResponseWrapper add_crowd(add_crowd_request_wrapper)



### Example


```python
import time
import baiduads
from crowd.api import crowd_service
from baiduads.crowd.model.add_crowd_request_wrapper import AddCrowdRequestWrapper
from baiduads.crowd.model.add_crowd_response_wrapper import AddCrowdResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_service.CrowdService(api_client)
    add_crowd_request_wrapper = AddCrowdRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdModRequest(
            crowd_types=[
                CrowdType(
                    crowd_id=1,
                    user_id=1,
                    crowd_name="crowd_name_example",
                    age=[
                        1,
                    ],
                    sex=1,
                    in_people=[
                        1,
                    ],
                    search_word=[
                        "search_word_example",
                    ],
                    browse_url=[
                        "browse_url_example",
                    ],
                    campaign_ids=[
                        1,
                    ],
                    creative_ids=[
                        1,
                    ],
                    id_pack=[
                        1,
                    ],
                    crowd_direct_type=1,
                    effect_type=1,
                    create_time="create_time_example",
                    recent_days=1,
                ),
            ],
        ),
    ) # AddCrowdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_crowd(add_crowd_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdService->add_crowd: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_crowd_request_wrapper** | [**AddCrowdRequestWrapper**](AddCrowdRequestWrapper.md)|  |

### Return type

[**AddCrowdResponseWrapper**](AddCrowdResponseWrapper.md)

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

# **delete_crowd**
> DeleteCrowdResponseWrapper delete_crowd(delete_crowd_request_wrapper)



### Example


```python
import time
import baiduads
from crowd.api import crowd_service
from baiduads.crowd.model.delete_crowd_response_wrapper import DeleteCrowdResponseWrapper
from baiduads.crowd.model.delete_crowd_request_wrapper import DeleteCrowdRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_service.CrowdService(api_client)
    delete_crowd_request_wrapper = DeleteCrowdRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdDelRequest(
            crowd_ids=[
                1,
            ],
        ),
    ) # DeleteCrowdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_crowd(delete_crowd_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdService->delete_crowd: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_crowd_request_wrapper** | [**DeleteCrowdRequestWrapper**](DeleteCrowdRequestWrapper.md)|  |

### Return type

[**DeleteCrowdResponseWrapper**](DeleteCrowdResponseWrapper.md)

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

# **get_crowd**
> GetCrowdResponseWrapper get_crowd(get_crowd_request_wrapper)



### Example


```python
import time
import baiduads
from crowd.api import crowd_service
from baiduads.crowd.model.get_crowd_request_wrapper import GetCrowdRequestWrapper
from baiduads.crowd.model.get_crowd_response_wrapper import GetCrowdResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_service.CrowdService(api_client)
    get_crowd_request_wrapper = GetCrowdRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdQueryRequest(
            crowd_fields=[
                "crowd_fields_example",
            ],
            crowd_direct_type=[
                1,
            ],
            limit=[
                1,
            ],
            desc=True,
        ),
    ) # GetCrowdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_crowd(get_crowd_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdService->get_crowd: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_crowd_request_wrapper** | [**GetCrowdRequestWrapper**](GetCrowdRequestWrapper.md)|  |

### Return type

[**GetCrowdResponseWrapper**](GetCrowdResponseWrapper.md)

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

# **update_crowd**
> UpdateCrowdResponseWrapper update_crowd(update_crowd_request_wrapper)



### Example


```python
import time
import baiduads
from crowd.api import crowd_service
from baiduads.crowd.model.update_crowd_response_wrapper import UpdateCrowdResponseWrapper
from baiduads.crowd.model.update_crowd_request_wrapper import UpdateCrowdRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_service.CrowdService(api_client)
    update_crowd_request_wrapper = UpdateCrowdRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdModRequest(
            crowd_types=[
                CrowdType(
                    crowd_id=1,
                    user_id=1,
                    crowd_name="crowd_name_example",
                    age=[
                        1,
                    ],
                    sex=1,
                    in_people=[
                        1,
                    ],
                    search_word=[
                        "search_word_example",
                    ],
                    browse_url=[
                        "browse_url_example",
                    ],
                    campaign_ids=[
                        1,
                    ],
                    creative_ids=[
                        1,
                    ],
                    id_pack=[
                        1,
                    ],
                    crowd_direct_type=1,
                    effect_type=1,
                    create_time="create_time_example",
                    recent_days=1,
                ),
            ],
        ),
    ) # UpdateCrowdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_crowd(update_crowd_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdService->update_crowd: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_crowd_request_wrapper** | [**UpdateCrowdRequestWrapper**](UpdateCrowdRequestWrapper.md)|  |

### Return type

[**UpdateCrowdResponseWrapper**](UpdateCrowdResponseWrapper.md)

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

