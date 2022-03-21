# baiduads.CrowdBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_bind**](CrowdBindService.md#add_bind) | **POST** /json/sms/service/CrowdBindService/addBind | 
[**delete_bind**](CrowdBindService.md#delete_bind) | **POST** /json/sms/service/CrowdBindService/deleteBind | 
[**get_bind**](CrowdBindService.md#get_bind) | **POST** /json/sms/service/CrowdBindService/getBind | 
[**update_bind**](CrowdBindService.md#update_bind) | **POST** /json/sms/service/CrowdBindService/updateBind | 


# **add_bind**
> AddBindResponseWrapper add_bind(add_bind_request_wrapper)



### Example


```python
import time
import baiduads
from crowdbind.api import crowd_bind_service
from baiduads.crowdbind.model.add_bind_request_wrapper import AddBindRequestWrapper
from baiduads.crowdbind.model.add_bind_response_wrapper import AddBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_bind_service.CrowdBindService(api_client)
    add_bind_request_wrapper = AddBindRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdBindModRequest(
            crowd_bind_types=[
                CrowdBindType(
                    bind_id=1,
                    target_type=1,
                    target_id=1,
                    crowd_price_ratio=3.14,
                    campaign_id=1,
                    crowd_id=1,
                ),
            ],
        ),
    ) # AddBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_bind(add_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdBindService->add_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_bind_request_wrapper** | [**AddBindRequestWrapper**](AddBindRequestWrapper.md)|  |

### Return type

[**AddBindResponseWrapper**](AddBindResponseWrapper.md)

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

# **delete_bind**
> DeleteBindResponseWrapper delete_bind(delete_bind_request_wrapper)



### Example


```python
import time
import baiduads
from crowdbind.api import crowd_bind_service
from baiduads.crowdbind.model.delete_bind_request_wrapper import DeleteBindRequestWrapper
from baiduads.crowdbind.model.delete_bind_response_wrapper import DeleteBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_bind_service.CrowdBindService(api_client)
    delete_bind_request_wrapper = DeleteBindRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdBindDelRequest(
            bind_ids=[
                1,
            ],
        ),
    ) # DeleteBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_bind(delete_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdBindService->delete_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_bind_request_wrapper** | [**DeleteBindRequestWrapper**](DeleteBindRequestWrapper.md)|  |

### Return type

[**DeleteBindResponseWrapper**](DeleteBindResponseWrapper.md)

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

# **get_bind**
> GetBindResponseWrapper get_bind(get_bind_request_wrapper)



### Example


```python
import time
import baiduads
from crowdbind.api import crowd_bind_service
from baiduads.crowdbind.model.get_bind_response_wrapper import GetBindResponseWrapper
from baiduads.crowdbind.model.get_bind_request_wrapper import GetBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_bind_service.CrowdBindService(api_client)
    get_bind_request_wrapper = GetBindRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdBindQueryRequest(
            crowd_bind_fields=[
                "crowd_bind_fields_example",
            ],
            target_type=1,
            ids=[
                1,
            ],
            id_type=1,
        ),
    ) # GetBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_bind(get_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdBindService->get_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_bind_request_wrapper** | [**GetBindRequestWrapper**](GetBindRequestWrapper.md)|  |

### Return type

[**GetBindResponseWrapper**](GetBindResponseWrapper.md)

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

# **update_bind**
> UpdateBindResponseWrapper update_bind(update_bind_request_wrapper)



### Example


```python
import time
import baiduads
from crowdbind.api import crowd_bind_service
from baiduads.crowdbind.model.update_bind_response_wrapper import UpdateBindResponseWrapper
from baiduads.crowdbind.model.update_bind_request_wrapper import UpdateBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_bind_service.CrowdBindService(api_client)
    update_bind_request_wrapper = UpdateBindRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdBindModRequest(
            crowd_bind_types=[
                CrowdBindType(
                    bind_id=1,
                    target_type=1,
                    target_id=1,
                    crowd_price_ratio=3.14,
                    campaign_id=1,
                    crowd_id=1,
                ),
            ],
        ),
    ) # UpdateBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_bind(update_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdBindService->update_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_bind_request_wrapper** | [**UpdateBindRequestWrapper**](UpdateBindRequestWrapper.md)|  |

### Return type

[**UpdateBindResponseWrapper**](UpdateBindResponseWrapper.md)

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

