# baiduads.CrowdShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_eshop_trade_crowds**](CrowdShoppingService.md#get_eshop_trade_crowds) | **POST** /json/sms/service/CrowdShoppingService/getEshopTradeCrowds | 


# **get_eshop_trade_crowds**
> GetEshopTradeCrowdsResponseWrapper get_eshop_trade_crowds(get_eshop_trade_crowds_request_wrapper)



### Example


```python
import time
import baiduads
from crowdshopping.api import crowd_shopping_service
from baiduads.crowdshopping.model.get_eshop_trade_crowds_request_wrapper import GetEshopTradeCrowdsRequestWrapper
from baiduads.crowdshopping.model.get_eshop_trade_crowds_response_wrapper import GetEshopTradeCrowdsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_shopping_service.CrowdShoppingService(api_client)
    get_eshop_trade_crowds_request_wrapper = GetEshopTradeCrowdsRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetEshopTradeCrowdsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_eshop_trade_crowds(get_eshop_trade_crowds_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdShoppingService->get_eshop_trade_crowds: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_eshop_trade_crowds_request_wrapper** | [**GetEshopTradeCrowdsRequestWrapper**](GetEshopTradeCrowdsRequestWrapper.md)|  |

### Return type

[**GetEshopTradeCrowdsResponseWrapper**](GetEshopTradeCrowdsResponseWrapper.md)

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

