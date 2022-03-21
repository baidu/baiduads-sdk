# baiduads.ToolkitService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_operation_record**](ToolkitService.md#get_operation_record) | **POST** /json/sms/service/ToolkitService/getOperationRecord | 


# **get_operation_record**
> GetOperationRecordResponseWrapper get_operation_record(get_operation_record_request_wrapper)



### Example


```python
import time
import baiduads
from toolkit.api import toolkit_service
from baiduads.toolkit.model.get_operation_record_response_wrapper import GetOperationRecordResponseWrapper
from baiduads.toolkit.model.get_operation_record_request_wrapper import GetOperationRecordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = toolkit_service.ToolkitService(api_client)
    get_operation_record_request_wrapper = GetOperationRecordRequestWrapper(
        header=ApiRequestHeader(),
        body=GetOperationRecordRequest(
            start_date="start_date_example",
            end_date="end_date_example",
            opt_types=[
                1,
            ],
            opt_level=1,
            opt_contents=[
                "opt_contents_example",
            ],
            offset=1,
            record_type=1,
        ),
    ) # GetOperationRecordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_operation_record(get_operation_record_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ToolkitService->get_operation_record: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_operation_record_request_wrapper** | [**GetOperationRecordRequestWrapper**](GetOperationRecordRequestWrapper.md)|  |

### Return type

[**GetOperationRecordResponseWrapper**](GetOperationRecordResponseWrapper.md)

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

