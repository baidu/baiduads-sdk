# baiduads.AdgroupAppService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_adgroup_app_bind**](AdgroupAppService.md#add_adgroup_app_bind) | **POST** /json/sms/service/AdgroupAppService/addAdgroupAppBind | 
[**delete_adgroup_app_bind**](AdgroupAppService.md#delete_adgroup_app_bind) | **POST** /json/sms/service/AdgroupAppService/deleteAdgroupAppBind | 
[**get_adgroup_app_bind**](AdgroupAppService.md#get_adgroup_app_bind) | **POST** /json/sms/service/AdgroupAppService/getAdgroupAppBind | 


# **add_adgroup_app_bind**
> AddAdgroupAppBindResponseWrapper add_adgroup_app_bind(add_adgroup_app_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupapp.api import adgroup_app_service
from baiduads.adgroupapp.model.add_adgroup_app_bind_response_wrapper import AddAdgroupAppBindResponseWrapper
from baiduads.adgroupapp.model.add_adgroup_app_bind_request_wrapper import AddAdgroupAppBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_app_service.AdgroupAppService(api_client)
    add_adgroup_app_bind_request_wrapper = AddAdgroupAppBindRequestWrapper(
        header=ApiRequestHeader(),
        body=AppBindBatchRequest(
            add_binds=[
                AppBindAddItem(
                    channel_id=1,
                    app_store_id=1,
                    platform=1,
                    bid_ratio=3.14,
                    adgroup_id=1,
                ),
            ],
        ),
    ) # AddAdgroupAppBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_adgroup_app_bind(add_adgroup_app_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupAppService->add_adgroup_app_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_adgroup_app_bind_request_wrapper** | [**AddAdgroupAppBindRequestWrapper**](AddAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**AddAdgroupAppBindResponseWrapper**](AddAdgroupAppBindResponseWrapper.md)

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

# **delete_adgroup_app_bind**
> DeleteAdgroupAppBindResponseWrapper delete_adgroup_app_bind(delete_adgroup_app_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupapp.api import adgroup_app_service
from baiduads.adgroupapp.model.delete_adgroup_app_bind_request_wrapper import DeleteAdgroupAppBindRequestWrapper
from baiduads.adgroupapp.model.delete_adgroup_app_bind_response_wrapper import DeleteAdgroupAppBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_app_service.AdgroupAppService(api_client)
    delete_adgroup_app_bind_request_wrapper = DeleteAdgroupAppBindRequestWrapper(
        header=ApiRequestHeader(),
        body=AppBindDelRequest(
            del_bind_ids=[
                1,
            ],
        ),
    ) # DeleteAdgroupAppBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_adgroup_app_bind(delete_adgroup_app_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupAppService->delete_adgroup_app_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_adgroup_app_bind_request_wrapper** | [**DeleteAdgroupAppBindRequestWrapper**](DeleteAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupAppBindResponseWrapper**](DeleteAdgroupAppBindResponseWrapper.md)

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

# **get_adgroup_app_bind**
> GetAdgroupAppBindResponseWrapper get_adgroup_app_bind(get_adgroup_app_bind_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupapp.api import adgroup_app_service
from baiduads.adgroupapp.model.get_adgroup_app_bind_request_wrapper import GetAdgroupAppBindRequestWrapper
from baiduads.adgroupapp.model.get_adgroup_app_bind_response_wrapper import GetAdgroupAppBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_app_service.AdgroupAppService(api_client)
    get_adgroup_app_bind_request_wrapper = GetAdgroupAppBindRequestWrapper(
        header=ApiRequestHeader(),
        body=AppBindForApiRequest(
            id_type=1,
            ids=[
                1,
            ],
            name="name_example",
            platform=[
                1,
            ],
            status=[
                1,
            ],
            order_by="order_by_example",
            desc=True,
            limit=[
                1,
            ],
        ),
    ) # GetAdgroupAppBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup_app_bind(get_adgroup_app_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupAppService->get_adgroup_app_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_adgroup_app_bind_request_wrapper** | [**GetAdgroupAppBindRequestWrapper**](GetAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**GetAdgroupAppBindResponseWrapper**](GetAdgroupAppBindResponseWrapper.md)

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

