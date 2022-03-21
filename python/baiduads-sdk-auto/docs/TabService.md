# baiduads.TabService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_tabs**](TabService.md#get_tabs) | **POST** /json/sms/service/TabService/getTabs | 


# **get_tabs**
> GetTabsResponseWrapper get_tabs(get_tabs_request_wrapper)



### Example


```python
import time
import baiduads
from tab.api import tab_service
from baiduads.tab.model.get_tabs_request_wrapper import GetTabsRequestWrapper
from baiduads.tab.model.get_tabs_response_wrapper import GetTabsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = tab_service.TabService(api_client)
    get_tabs_request_wrapper = GetTabsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetTabRequestType(
            id_type=1,
            tab_ids=[
                1,
            ],
        ),
    ) # GetTabsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_tabs(get_tabs_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling TabService->get_tabs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_tabs_request_wrapper** | [**GetTabsRequestWrapper**](GetTabsRequestWrapper.md)|  |

### Return type

[**GetTabsResponseWrapper**](GetTabsResponseWrapper.md)

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

