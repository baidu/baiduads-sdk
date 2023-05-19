# baiduads.FMPhoneOutsideApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_virtual_phone**](FMPhoneOutsideApiService.md#get_virtual_phone) | **POST** /json/sms/service/FMPhoneOutsideApiService/getVirtualPhone | 


# **get_virtual_phone**
> GetVirtualPhoneResponseWrapper get_virtual_phone(get_virtual_phone_request_wrapper)



### Example


```python
import time
import baiduads
from fmphoneoutsideapi.api import fm_phone_outside_api_service
from baiduads.fmphoneoutsideapi.model.get_virtual_phone_response_wrapper import GetVirtualPhoneResponseWrapper
from baiduads.fmphoneoutsideapi.model.get_virtual_phone_request_wrapper import GetVirtualPhoneRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fm_phone_outside_api_service.FMPhoneOutsideApiService(api_client)
    get_virtual_phone_request_wrapper = GetVirtualPhoneRequestWrapper(
        header=ApiRequestHeader(),
        body=GetVirtualPhoneRequest(
            ref_clue_id="ref_clue_id_example",
            callee="callee_example",
            custom_param="custom_param_example",
            mode=1,
            caller="caller_example",
        ),
    ) # GetVirtualPhoneRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_virtual_phone(get_virtual_phone_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FMPhoneOutsideApiService->get_virtual_phone: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_virtual_phone_request_wrapper** | [**GetVirtualPhoneRequestWrapper**](GetVirtualPhoneRequestWrapper.md)|  |

### Return type

[**GetVirtualPhoneResponseWrapper**](GetVirtualPhoneResponseWrapper.md)

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

