# baiduads.MiniProgramService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_mini_programs**](MiniProgramService.md#get_mini_programs) | **POST** /json/sms/service/MiniProgramService/getMiniPrograms | 


# **get_mini_programs**
> GetMiniProgramsResponseWrapper get_mini_programs(get_mini_programs_request_wrapper)



### Example


```python
import time
import baiduads
from miniprogram.api import mini_program_service
from baiduads.miniprogram.model.get_mini_programs_response_wrapper import GetMiniProgramsResponseWrapper
from baiduads.miniprogram.model.get_mini_programs_request_wrapper import GetMiniProgramsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = mini_program_service.MiniProgramService(api_client)
    get_mini_programs_request_wrapper = GetMiniProgramsRequestWrapper(
        header=ApiRequestHeader(),
        body=MiniProgramQueryRequest(
            app_name="app_name_example",
        ),
    ) # GetMiniProgramsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_mini_programs(get_mini_programs_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MiniProgramService->get_mini_programs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_mini_programs_request_wrapper** | [**GetMiniProgramsRequestWrapper**](GetMiniProgramsRequestWrapper.md)|  |

### Return type

[**GetMiniProgramsResponseWrapper**](GetMiniProgramsResponseWrapper.md)

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

