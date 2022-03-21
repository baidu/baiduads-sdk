# baiduads.AutoExpansionService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_auto_expansion**](AutoExpansionService.md#get_auto_expansion) | **POST** /json/sms/service/AutoExpansionService/getAutoExpansion | 


# **get_auto_expansion**
> GetAutoExpansionResponseWrapper get_auto_expansion(get_auto_expansion_request_wrapper)



### Example


```python
import time
import baiduads
from autoexpansion.api import auto_expansion_service
from baiduads.autoexpansion.model.get_auto_expansion_response_wrapper import GetAutoExpansionResponseWrapper
from baiduads.autoexpansion.model.get_auto_expansion_request_wrapper import GetAutoExpansionRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = auto_expansion_service.AutoExpansionService(api_client)
    get_auto_expansion_request_wrapper = GetAutoExpansionRequestWrapper(
        header=ApiRequestHeader(),
        body=BusinessLabelQueryRequest(
            business_label_type_fields=[
                "business_label_type_fields_example",
            ],
            business_point_ids=[
                1,
            ],
            ids=[
                1,
            ],
            id_type=1,
        ),
    ) # GetAutoExpansionRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_auto_expansion(get_auto_expansion_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AutoExpansionService->get_auto_expansion: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_auto_expansion_request_wrapper** | [**GetAutoExpansionRequestWrapper**](GetAutoExpansionRequestWrapper.md)|  |

### Return type

[**GetAutoExpansionResponseWrapper**](GetAutoExpansionResponseWrapper.md)

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

