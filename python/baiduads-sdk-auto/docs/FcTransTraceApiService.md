# baiduads.FcTransTraceApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_fc_trans_trace**](FcTransTraceApiService.md#add_fc_trans_trace) | **POST** /json/sms/service/FcTransTraceApiService/addFcTransTrace | 
[**delete_fc_trans_trace**](FcTransTraceApiService.md#delete_fc_trans_trace) | **POST** /json/sms/service/FcTransTraceApiService/deleteFcTransTrace | 
[**get_fc_trans_trace_list**](FcTransTraceApiService.md#get_fc_trans_trace_list) | **POST** /json/sms/service/FcTransTraceApiService/getFcTransTraceList | 
[**update_fc_trans_trace**](FcTransTraceApiService.md#update_fc_trans_trace) | **POST** /json/sms/service/FcTransTraceApiService/updateFcTransTrace | 


# **add_fc_trans_trace**
> AddFcTransTraceResponseWrapper add_fc_trans_trace(add_fc_trans_trace_request_wrapper)



### Example


```python
import time
import baiduads
from fctranstraceapi.api import fc_trans_trace_api_service
from baiduads.fctranstraceapi.model.add_fc_trans_trace_response_wrapper import AddFcTransTraceResponseWrapper
from baiduads.fctranstraceapi.model.add_fc_trans_trace_request_wrapper import AddFcTransTraceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_trans_trace_api_service.FcTransTraceApiService(api_client)
    add_fc_trans_trace_request_wrapper = AddFcTransTraceRequestWrapper(
        header=ApiRequestHeader(),
        body=FcTransTraceAddRequest(
            trans_mode=1,
            trans_name="trans_name_example",
            trans_type=[
                1,
            ],
            app_type=1,
            monitor_url="monitor_url_example",
            download_url="download_url_example",
            channel_id=1,
            campaign_ids=[
                1,
            ],
            sdk_id=1,
            app_action=1,
        ),
    ) # AddFcTransTraceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_fc_trans_trace(add_fc_trans_trace_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcTransTraceApiService->add_fc_trans_trace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_fc_trans_trace_request_wrapper** | [**AddFcTransTraceRequestWrapper**](AddFcTransTraceRequestWrapper.md)|  |

### Return type

[**AddFcTransTraceResponseWrapper**](AddFcTransTraceResponseWrapper.md)

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

# **delete_fc_trans_trace**
> DeleteFcTransTraceResponseWrapper delete_fc_trans_trace(delete_fc_trans_trace_request_wrapper)



### Example


```python
import time
import baiduads
from fctranstraceapi.api import fc_trans_trace_api_service
from baiduads.fctranstraceapi.model.delete_fc_trans_trace_response_wrapper import DeleteFcTransTraceResponseWrapper
from baiduads.fctranstraceapi.model.delete_fc_trans_trace_request_wrapper import DeleteFcTransTraceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_trans_trace_api_service.FcTransTraceApiService(api_client)
    delete_fc_trans_trace_request_wrapper = DeleteFcTransTraceRequestWrapper(
        header=ApiRequestHeader(),
        body=FcTransTraceDelRequest(
            trans=[
                FcTransIdAndTransMode(
                    trans_id=1,
                    trans_mode=1,
                ),
            ],
        ),
    ) # DeleteFcTransTraceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_fc_trans_trace(delete_fc_trans_trace_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcTransTraceApiService->delete_fc_trans_trace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_fc_trans_trace_request_wrapper** | [**DeleteFcTransTraceRequestWrapper**](DeleteFcTransTraceRequestWrapper.md)|  |

### Return type

[**DeleteFcTransTraceResponseWrapper**](DeleteFcTransTraceResponseWrapper.md)

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

# **get_fc_trans_trace_list**
> GetFcTransTraceListResponseWrapper get_fc_trans_trace_list(get_fc_trans_trace_list_request_wrapper)



### Example


```python
import time
import baiduads
from fctranstraceapi.api import fc_trans_trace_api_service
from baiduads.fctranstraceapi.model.get_fc_trans_trace_list_request_wrapper import GetFcTransTraceListRequestWrapper
from baiduads.fctranstraceapi.model.get_fc_trans_trace_list_response_wrapper import GetFcTransTraceListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_trans_trace_api_service.FcTransTraceApiService(api_client)
    get_fc_trans_trace_list_request_wrapper = GetFcTransTraceListRequestWrapper(
        header=ApiRequestHeader(),
        body=FcTransTraceGetRequest(
            trans_name="trans_name_example",
            trace_target_list=[
                1,
            ],
            trans_mode_list=[
                1,
            ],
            trans_status_list=[
                1,
            ],
            limit=[
                1,
            ],
        ),
    ) # GetFcTransTraceListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_fc_trans_trace_list(get_fc_trans_trace_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcTransTraceApiService->get_fc_trans_trace_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_fc_trans_trace_list_request_wrapper** | [**GetFcTransTraceListRequestWrapper**](GetFcTransTraceListRequestWrapper.md)|  |

### Return type

[**GetFcTransTraceListResponseWrapper**](GetFcTransTraceListResponseWrapper.md)

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

# **update_fc_trans_trace**
> UpdateFcTransTraceResponseWrapper update_fc_trans_trace(update_fc_trans_trace_request_wrapper)



### Example


```python
import time
import baiduads
from fctranstraceapi.api import fc_trans_trace_api_service
from baiduads.fctranstraceapi.model.update_fc_trans_trace_request_wrapper import UpdateFcTransTraceRequestWrapper
from baiduads.fctranstraceapi.model.update_fc_trans_trace_response_wrapper import UpdateFcTransTraceResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_trans_trace_api_service.FcTransTraceApiService(api_client)
    update_fc_trans_trace_request_wrapper = UpdateFcTransTraceRequestWrapper(
        header=ApiRequestHeader(),
        body=FcTransTraceModRequest(
            trans_id=1,
            trans_mode=1,
            trans_name="trans_name_example",
            trans_type=[
                1,
            ],
            app_type=1,
            monitor_url="monitor_url_example",
            download_url="download_url_example",
            campaign_ids=[
                1,
            ],
        ),
    ) # UpdateFcTransTraceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_fc_trans_trace(update_fc_trans_trace_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcTransTraceApiService->update_fc_trans_trace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_fc_trans_trace_request_wrapper** | [**UpdateFcTransTraceRequestWrapper**](UpdateFcTransTraceRequestWrapper.md)|  |

### Return type

[**UpdateFcTransTraceResponseWrapper**](UpdateFcTransTraceResponseWrapper.md)

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

