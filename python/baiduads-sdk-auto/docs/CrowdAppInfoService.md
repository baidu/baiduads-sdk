# baiduads.CrowdAppInfoService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_info**](CrowdAppInfoService.md#get_app_info) | **POST** /json/sms/service/CrowdAppInfoService/getAppInfo | 


# **get_app_info**
> GetAppInfoResponseWrapper get_app_info(get_app_info_request_wrapper)



### Example


```python
import time
import baiduads
from crowdappinfo.api import crowd_app_info_service
from baiduads.crowdappinfo.model.get_app_info_response_wrapper import GetAppInfoResponseWrapper
from baiduads.crowdappinfo.model.get_app_info_request_wrapper import GetAppInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_app_info_service.CrowdAppInfoService(api_client)
    get_app_info_request_wrapper = GetAppInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAppInfoRequest(
            app_ids=[
                "app_ids_example",
            ],
            app_name_like="app_name_like_example",
            fields=[
                "fields_example",
            ],
            limit=[
                1,
            ],
            order_by="order_by_example",
            desc=True,
        ),
    ) # GetAppInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_app_info(get_app_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdAppInfoService->get_app_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_app_info_request_wrapper** | [**GetAppInfoRequestWrapper**](GetAppInfoRequestWrapper.md)|  |

### Return type

[**GetAppInfoResponseWrapper**](GetAppInfoResponseWrapper.md)

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

