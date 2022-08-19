# baiduads.FcOcpcService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_suggest_cpas**](FcOcpcService.md#get_suggest_cpas) | **POST** /json/sms/service/FcOcpcService/getSuggestCPAs | 


# **get_suggest_cpas**
> GetSuggestCPAsResponseWrapper get_suggest_cpas(get_suggest_cpas_request_wrapper)



### Example


```python
import time
import baiduads
from fcocpc.api import fc_ocpc_service
from baiduads.fcocpc.model.get_suggest_cpas_response_wrapper import GetSuggestCPAsResponseWrapper
from baiduads.fcocpc.model.get_suggest_cpas_request_wrapper import GetSuggestCPAsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fc_ocpc_service.FcOcpcService(api_client)
    get_suggest_cpas_request_wrapper = GetSuggestCPAsRequestWrapper(
        header=ApiRequestHeader(),
        body=SuggestCPARequest(
            fields=[
                "fields_example",
            ],
            equipment_type=1,
            data_flow=[
                1,
            ],
            trans_types=[
                1,
            ],
            campaign_ids=[
                1,
            ],
        ),
    ) # GetSuggestCPAsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_suggest_cpas(get_suggest_cpas_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FcOcpcService->get_suggest_cpas: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_suggest_cpas_request_wrapper** | [**GetSuggestCPAsRequestWrapper**](GetSuggestCPAsRequestWrapper.md)|  |

### Return type

[**GetSuggestCPAsResponseWrapper**](GetSuggestCPAsResponseWrapper.md)

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

