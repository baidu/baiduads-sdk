# baiduads.AdviceSettingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_setting**](AdviceSettingService.md#mod_setting) | **POST** /json/sms/service/AdviceSettingService/modSetting | 


# **mod_setting**
> ModSettingResponseWrapper mod_setting(mod_setting_request_wrapper)



### Example


```python
import time
import baiduads
from advicesetting.api import advice_setting_service
from baiduads.advicesetting.model.mod_setting_response_wrapper import ModSettingResponseWrapper
from baiduads.advicesetting.model.mod_setting_request_wrapper import ModSettingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_setting_service.AdviceSettingService(api_client)
    mod_setting_request_wrapper = ModSettingRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceSettingTypeCommonBatchRequest(
            items=[
                AdviceSettingType(
                    attribute="attribute_example",
                    value="value_example",
                    advice_key="advice_key_example",
                ),
            ],
        ),
    ) # ModSettingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.mod_setting(mod_setting_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceSettingService->mod_setting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_setting_request_wrapper** | [**ModSettingRequestWrapper**](ModSettingRequestWrapper.md)|  |

### Return type

[**ModSettingResponseWrapper**](ModSettingResponseWrapper.md)

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

