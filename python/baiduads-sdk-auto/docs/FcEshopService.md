# baiduads.FcEshopService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_auto_deeplink**](FcEshopService.md#get_auto_deeplink) | **POST** /json/sms/service/FcEshopService/getAutoDeeplink | 


# **get_auto_deeplink**
> GetAutoDeeplinkResponseWrapper get_auto_deeplink(get_auto_deeplink_request_wrapper)



### Example


```python
import time
import baiduads
from fceshop.api import fc_eshop_service
from baiduads.fceshop.model.get_auto_deeplink_request_wrapper import GetAutoDeeplinkRequestWrapper
from baiduads.fceshop.model.get_auto_deeplink_response_wrapper import GetAutoDeeplinkResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_eshop_service.FcEshopService(api_client)
    get_auto_deeplink_request_wrapper = GetAutoDeeplinkRequestWrapper(
        header=ApiRequestHeader(),
        body=AutoDeeplinkQueryRequest(
            deeplink_types=[
                EshopAutoDeeplinkType(
                    murl="murl_example",
                    deeplink="deeplink_example",
                    material_id=1,
                    material_id_type=1,
                ),
            ],
        ),
    ) # GetAutoDeeplinkRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_auto_deeplink(get_auto_deeplink_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcEshopService->get_auto_deeplink: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_auto_deeplink_request_wrapper** | [**GetAutoDeeplinkRequestWrapper**](GetAutoDeeplinkRequestWrapper.md)|  |

### Return type

[**GetAutoDeeplinkResponseWrapper**](GetAutoDeeplinkResponseWrapper.md)

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

