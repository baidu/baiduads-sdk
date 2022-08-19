# baiduads.FmLeadsUpdateService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_mark**](FmLeadsUpdateService.md#add_mark) | **POST** /json/sms/service/FmLeadsUpdateService/addMark | 


# **add_mark**
> AddMarkResponseWrapper add_mark(add_mark_request_wrapper)



### Example


```python
import time
import baiduads
from fmleadsupdate.api import fm_leads_update_service
from baiduads.fmleadsupdate.model.add_mark_request_wrapper import AddMarkRequestWrapper
from baiduads.fmleadsupdate.model.add_mark_response_wrapper import AddMarkResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fm_leads_update_service.FmLeadsUpdateService(api_client)
    add_mark_request_wrapper = AddMarkRequestWrapper(
        header=ApiRequestHeader(),
        body=AddMarkRequest(
            data=[
                LeadsMark(
                    clue_id="clue_id_example",
                    mark_type=1,
                ),
            ],
        ),
    ) # AddMarkRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_mark(add_mark_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FmLeadsUpdateService->add_mark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_mark_request_wrapper** | [**AddMarkRequestWrapper**](AddMarkRequestWrapper.md)|  |

### Return type

[**AddMarkResponseWrapper**](AddMarkResponseWrapper.md)

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

