# baiduads.WtTradeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_trade_list**](WtTradeService.md#get_trade_list) | **POST** /json/sms/service/WtTradeService/getTradeList | 


# **get_trade_list**
> GetTradeListResponseWrapper get_trade_list(get_trade_list_request_wrapper)



### Example


```python
import time
import baiduads
from wttrade.api import wt_trade_service
from baiduads.wttrade.model.get_trade_list_request_wrapper import GetTradeListRequestWrapper
from baiduads.wttrade.model.get_trade_list_response_wrapper import GetTradeListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wt_trade_service.WtTradeService(api_client)
    get_trade_list_request_wrapper = GetTradeListRequestWrapper(
        header=ApiRequestHeader(),
        body=WtTradeRequest(
            cache=1,
        ),
    ) # GetTradeListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_trade_list(get_trade_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtTradeService->get_trade_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_trade_list_request_wrapper** | [**GetTradeListRequestWrapper**](GetTradeListRequestWrapper.md)|  |

### Return type

[**GetTradeListResponseWrapper**](GetTradeListResponseWrapper.md)

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

