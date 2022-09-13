# baiduads.OrderBusinessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**grant_call_back**](OrderBusinessService.md#grant_call_back) | **POST** /json/sms/service/OrderBusinessService/grantCallBack | 


# **grant_call_back**
> GrantCallBackResponseWrapper grant_call_back(grant_call_back_request_wrapper)



### Example


```python
import time
import baiduads
from orderbusiness.api import order_business_service
from baiduads.orderbusiness.model.grant_call_back_response_wrapper import GrantCallBackResponseWrapper
from baiduads.orderbusiness.model.grant_call_back_request_wrapper import GrantCallBackRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = order_business_service.OrderBusinessService(api_client)
    grant_call_back_request_wrapper = GrantCallBackRequestWrapper(
        header=ApiRequestHeader(),
        body=GrantCallBackRequest(
            order_id=1,
            state=True,
        ),
    ) # GrantCallBackRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.grant_call_back(grant_call_back_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OrderBusinessService->grant_call_back: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_call_back_request_wrapper** | [**GrantCallBackRequestWrapper**](GrantCallBackRequestWrapper.md)|  |

### Return type

[**GrantCallBackResponseWrapper**](GrantCallBackResponseWrapper.md)

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

