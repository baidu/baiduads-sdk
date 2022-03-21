# baiduads.CustomMPService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_custom_mp**](CustomMPService.md#add_custom_mp) | **POST** /json/feed/v1/CustomMPService/addCustomMP | 
[**delete_custom_mp**](CustomMPService.md#delete_custom_mp) | **POST** /json/feed/v1/CustomMPService/deleteCustomMP | 
[**get_custom_mp**](CustomMPService.md#get_custom_mp) | **POST** /json/feed/v1/CustomMPService/getCustomMP | 
[**update_custom_mp**](CustomMPService.md#update_custom_mp) | **POST** /json/feed/v1/CustomMPService/updateCustomMP | 


# **add_custom_mp**
> AddCustomMPResponseWrapper add_custom_mp(add_custom_mp_request_wrapper)



### Example


```python
import time
import baiduads
from custommp.api import custom_mp_service
from baiduads.custommp.model.add_custom_mp_request_wrapper import AddCustomMPRequestWrapper
from baiduads.custommp.model.add_custom_mp_response_wrapper import AddCustomMPResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = custom_mp_service.CustomMPService(api_client)
    add_custom_mp_request_wrapper = AddCustomMPRequestWrapper(
        header=ApiRequestHeader(),
        body=AddModCustomMPRequest(
            custom_mps=[
                CustomMP(
                    mpid=1,
                    mp_name="mp_name_example",
                    mp_type=1,
                    mediaids=[
                        1,
                    ],
                    flow_type=1,
                ),
            ],
        ),
    ) # AddCustomMPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_custom_mp(add_custom_mp_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CustomMPService->add_custom_mp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_custom_mp_request_wrapper** | [**AddCustomMPRequestWrapper**](AddCustomMPRequestWrapper.md)|  |

### Return type

[**AddCustomMPResponseWrapper**](AddCustomMPResponseWrapper.md)

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

# **delete_custom_mp**
> DeleteCustomMPResponseWrapper delete_custom_mp(delete_custom_mp_request_wrapper)



### Example


```python
import time
import baiduads
from custommp.api import custom_mp_service
from baiduads.custommp.model.delete_custom_mp_response_wrapper import DeleteCustomMPResponseWrapper
from baiduads.custommp.model.delete_custom_mp_request_wrapper import DeleteCustomMPRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = custom_mp_service.CustomMPService(api_client)
    delete_custom_mp_request_wrapper = DeleteCustomMPRequestWrapper(
        header=ApiRequestHeader(),
        body=DelCustomMPRequest(
            mpids=[
                1,
            ],
        ),
    ) # DeleteCustomMPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_custom_mp(delete_custom_mp_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CustomMPService->delete_custom_mp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_custom_mp_request_wrapper** | [**DeleteCustomMPRequestWrapper**](DeleteCustomMPRequestWrapper.md)|  |

### Return type

[**DeleteCustomMPResponseWrapper**](DeleteCustomMPResponseWrapper.md)

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

# **get_custom_mp**
> GetCustomMPResponseWrapper get_custom_mp(get_custom_mp_request_wrapper)



### Example


```python
import time
import baiduads
from custommp.api import custom_mp_service
from baiduads.custommp.model.get_custom_mp_response_wrapper import GetCustomMPResponseWrapper
from baiduads.custommp.model.get_custom_mp_request_wrapper import GetCustomMPRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = custom_mp_service.CustomMPService(api_client)
    get_custom_mp_request_wrapper = GetCustomMPRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCustomMPRequest(
            mpids=[
                1,
            ],
        ),
    ) # GetCustomMPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_custom_mp(get_custom_mp_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CustomMPService->get_custom_mp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_custom_mp_request_wrapper** | [**GetCustomMPRequestWrapper**](GetCustomMPRequestWrapper.md)|  |

### Return type

[**GetCustomMPResponseWrapper**](GetCustomMPResponseWrapper.md)

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

# **update_custom_mp**
> UpdateCustomMPResponseWrapper update_custom_mp(update_custom_mp_request_wrapper)



### Example


```python
import time
import baiduads
from custommp.api import custom_mp_service
from baiduads.custommp.model.update_custom_mp_response_wrapper import UpdateCustomMPResponseWrapper
from baiduads.custommp.model.update_custom_mp_request_wrapper import UpdateCustomMPRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = custom_mp_service.CustomMPService(api_client)
    update_custom_mp_request_wrapper = UpdateCustomMPRequestWrapper(
        header=ApiRequestHeader(),
        body=AddModCustomMPRequest(
            custom_mps=[
                CustomMP(
                    mpid=1,
                    mp_name="mp_name_example",
                    mp_type=1,
                    mediaids=[
                        1,
                    ],
                    flow_type=1,
                ),
            ],
        ),
    ) # UpdateCustomMPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_custom_mp(update_custom_mp_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CustomMPService->update_custom_mp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_custom_mp_request_wrapper** | [**UpdateCustomMPRequestWrapper**](UpdateCustomMPRequestWrapper.md)|  |

### Return type

[**UpdateCustomMPResponseWrapper**](UpdateCustomMPResponseWrapper.md)

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

