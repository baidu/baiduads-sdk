# baiduads.MaterialCenterBindQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_material_bind**](MaterialCenterBindQueryService.md#get_material_bind) | **POST** /json/sms/service/MaterialCenterBindQueryService/getMaterialBind | 


# **get_material_bind**
> GetMaterialBindResponseWrapper get_material_bind(get_material_bind_request_wrapper)



### Example


```python
import time
import baiduads
from materialcenterbindquery.api import material_center_bind_query_service
from baiduads.materialcenterbindquery.model.get_material_bind_request_wrapper import GetMaterialBindRequestWrapper
from baiduads.materialcenterbindquery.model.get_material_bind_response_wrapper import GetMaterialBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_center_bind_query_service.MaterialCenterBindQueryService(api_client)
    get_material_bind_request_wrapper = GetMaterialBindRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaMaterialBindQueryRequest(
            material_id=[
                1,
            ],
            material_type=1,
            bind_material_type=1,
            page_size=1,
            page_num=1,
            bind_material_id=[
                1,
            ],
        ),
    ) # GetMaterialBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_material_bind(get_material_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialCenterBindQueryService->get_material_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_material_bind_request_wrapper** | [**GetMaterialBindRequestWrapper**](GetMaterialBindRequestWrapper.md)|  |

### Return type

[**GetMaterialBindResponseWrapper**](GetMaterialBindResponseWrapper.md)

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

