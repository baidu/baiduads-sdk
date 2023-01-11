# baiduads.MaterialBrandQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_brand_list**](MaterialBrandQueryService.md#get_brand_list) | **POST** /json/sms/service/MaterialBrandQueryService/getBrandList | 


# **get_brand_list**
> GetBrandListResponseWrapper get_brand_list(get_brand_list_request_wrapper)



### Example


```python
import time
import baiduads
from materialbrandquery.api import material_brand_query_service
from baiduads.materialbrandquery.model.get_brand_list_request_wrapper import GetBrandListRequestWrapper
from baiduads.materialbrandquery.model.get_brand_list_response_wrapper import GetBrandListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_brand_query_service.MaterialBrandQueryService(api_client)
    get_brand_list_request_wrapper = GetBrandListRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaBrandQueryRequest(
            brand_id=[
                1,
            ],
            name="name_example",
            status=[
                1,
            ],
            sort_list=[
                SortingRuleDto(
                    field="field_example",
                    order_by="order_by_example",
                ),
            ],
            page_size=1,
            page_num=1,
        ),
    ) # GetBrandListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_brand_list(get_brand_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBrandQueryService->get_brand_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_brand_list_request_wrapper** | [**GetBrandListRequestWrapper**](GetBrandListRequestWrapper.md)|  |

### Return type

[**GetBrandListResponseWrapper**](GetBrandListResponseWrapper.md)

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

