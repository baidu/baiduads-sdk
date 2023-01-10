# baiduads.MaterialTradeQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_user_trade**](MaterialTradeQueryService.md#get_user_trade) | **POST** /json/sms/service/MaterialTradeQueryService/getUserTrade | 


# **get_user_trade**
> GetUserTradeResponseWrapper get_user_trade(get_user_trade_request_wrapper)



### Example


```python
import time
import baiduads
from materialtradequery.api import material_trade_query_service
from baiduads.materialtradequery.model.get_user_trade_response_wrapper import GetUserTradeResponseWrapper
from baiduads.materialtradequery.model.get_user_trade_request_wrapper import GetUserTradeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_trade_query_service.MaterialTradeQueryService(api_client)
    get_user_trade_request_wrapper = GetUserTradeRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetUserTradeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_user_trade(get_user_trade_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialTradeQueryService->get_user_trade: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_user_trade_request_wrapper** | [**GetUserTradeRequestWrapper**](GetUserTradeRequestWrapper.md)|  |

### Return type

[**GetUserTradeResponseWrapper**](GetUserTradeResponseWrapper.md)

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

