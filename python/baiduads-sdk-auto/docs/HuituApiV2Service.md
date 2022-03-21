# baiduads.HuituApiV2Service

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_user_template**](HuituApiV2Service.md#get_user_template) | **POST** /json/sms/service/HuituApiV2Service/getUserTemplate | 


# **get_user_template**
> GetUserTemplateResponseWrapper get_user_template(get_user_template_request_wrapper)



### Example


```python
import time
import baiduads
from huituapiv2.api import huitu_api_v2_service
from baiduads.huituapiv2.model.get_user_template_request_wrapper import GetUserTemplateRequestWrapper
from baiduads.huituapiv2.model.get_user_template_response_wrapper import GetUserTemplateResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = huitu_api_v2_service.HuituApiV2Service(api_client)
    get_user_template_request_wrapper = GetUserTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=HuituGetUserTemplateRequest(
            type=1,
            page_no=1,
            page_size=1,
            huitu_template_id=1,
        ),
    ) # GetUserTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_user_template(get_user_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling HuituApiV2Service->get_user_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_user_template_request_wrapper** | [**GetUserTemplateRequestWrapper**](GetUserTemplateRequestWrapper.md)|  |

### Return type

[**GetUserTemplateResponseWrapper**](GetUserTemplateResponseWrapper.md)

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

