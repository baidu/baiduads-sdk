# baiduads.TeslaCommonRecordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_dict_info**](TeslaCommonRecordService.md#get_dict_info) | **POST** /json/sms/service/TeslaCommonRecordService/getDictInfo | 


# **get_dict_info**
> GetDictInfoResponseWrapper get_dict_info(get_dict_info_request_wrapper)



### Example


```python
import time
import baiduads
from teslacommonrecord.api import tesla_common_record_service
from baiduads.teslacommonrecord.model.get_dict_info_response_wrapper import GetDictInfoResponseWrapper
from baiduads.teslacommonrecord.model.get_dict_info_request_wrapper import GetDictInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = tesla_common_record_service.TeslaCommonRecordService(api_client)
    get_dict_info_request_wrapper = GetDictInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaCommonDictRequest(
            type=1,
        ),
    ) # GetDictInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_dict_info(get_dict_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling TeslaCommonRecordService->get_dict_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_dict_info_request_wrapper** | [**GetDictInfoRequestWrapper**](GetDictInfoRequestWrapper.md)|  |

### Return type

[**GetDictInfoResponseWrapper**](GetDictInfoResponseWrapper.md)

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

