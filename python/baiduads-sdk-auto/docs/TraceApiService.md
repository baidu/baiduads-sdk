# baiduads.TraceApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update_trans_trace**](TraceApiService.md#update_trans_trace) | **POST** /json/feed/v1/TraceApiService/updateTransTrace | 


# **update_trans_trace**
> UpdateTransTraceResponseWrapper update_trans_trace(update_trans_trace_request_wrapper)



### Example


```python
import time
import baiduads
from traceapi.api import trace_api_service
from baiduads.traceapi.model.update_trans_trace_request_wrapper import UpdateTransTraceRequestWrapper
from baiduads.traceapi.model.update_trans_trace_response_wrapper import UpdateTransTraceResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = trace_api_service.TraceApiService(api_client)
    update_trans_trace_request_wrapper = UpdateTransTraceRequestWrapper(
        header=ApiRequestHeader(),
        body=TransTraceUpdateRequest(
            trans_trace_update_types=[
                TransTraceUpdateType(
                    trans_id=1,
                    trans_name="trans_name_example",
                    trans_types=[
                        1,
                    ],
                    deep_trans_types=[
                        1,
                    ],
                    monitor_url="monitor_url_example",
                    exposure_url="exposure_url_example",
                ),
            ],
        ),
    ) # UpdateTransTraceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_trans_trace(update_trans_trace_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling TraceApiService->update_trans_trace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_trans_trace_request_wrapper** | [**UpdateTransTraceRequestWrapper**](UpdateTransTraceRequestWrapper.md)|  |

### Return type

[**UpdateTransTraceResponseWrapper**](UpdateTransTraceResponseWrapper.md)

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

