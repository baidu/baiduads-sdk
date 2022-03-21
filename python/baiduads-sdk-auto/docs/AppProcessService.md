# baiduads.AppProcessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_list**](AppProcessService.md#get_app_list) | **POST** /json/sms/service/AppProcessService/getAppList | 


# **get_app_list**
> GetAppListResponseWrapper get_app_list(get_app_list_request_wrapper)



### Example


```python
import time
import baiduads
from appprocess.api import app_process_service
from baiduads.appprocess.model.get_app_list_request_wrapper import GetAppListRequestWrapper
from baiduads.appprocess.model.get_app_list_response_wrapper import GetAppListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_process_service.AppProcessService(api_client)
    get_app_list_request_wrapper = GetAppListRequestWrapper(
        header=ApiRequestHeader(),
        body=AppinfoConditionRequest(
            platforms=[
                1,
            ],
            limit=[
                1,
            ],
        ),
    ) # GetAppListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_app_list(get_app_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppProcessService->get_app_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_app_list_request_wrapper** | [**GetAppListRequestWrapper**](GetAppListRequestWrapper.md)|  |

### Return type

[**GetAppListResponseWrapper**](GetAppListResponseWrapper.md)

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

