# baiduads.BusinessPointService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_business_point**](BusinessPointService.md#get_all_business_point) | **POST** /json/sms/service/BusinessPointService/getAllBusinessPoint | 


# **get_all_business_point**
> GetAllBusinessPointResponseWrapper get_all_business_point(get_all_business_point_request_wrapper)



### Example


```python
import time
import baiduads
from businesspoint.api import business_point_service
from baiduads.businesspoint.model.get_all_business_point_request_wrapper import GetAllBusinessPointRequestWrapper
from baiduads.businesspoint.model.get_all_business_point_response_wrapper import GetAllBusinessPointResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = business_point_service.BusinessPointService(api_client)
    get_all_business_point_request_wrapper = GetAllBusinessPointRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetAllBusinessPointRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_all_business_point(get_all_business_point_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BusinessPointService->get_all_business_point: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_all_business_point_request_wrapper** | [**GetAllBusinessPointRequestWrapper**](GetAllBusinessPointRequestWrapper.md)|  |

### Return type

[**GetAllBusinessPointResponseWrapper**](GetAllBusinessPointResponseWrapper.md)

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

