# baiduads.MaterialPersonQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_person_list**](MaterialPersonQueryService.md#get_person_list) | **POST** /json/sms/service/MaterialPersonQueryService/getPersonList | 


# **get_person_list**
> GetPersonListResponseWrapper get_person_list(get_person_list_request_wrapper)



### Example


```python
import time
import baiduads
from materialpersonquery.api import material_person_query_service
from baiduads.materialpersonquery.model.get_person_list_request_wrapper import GetPersonListRequestWrapper
from baiduads.materialpersonquery.model.get_person_list_response_wrapper import GetPersonListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_query_service.MaterialPersonQueryService(api_client)
    get_person_list_request_wrapper = GetPersonListRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonListRequest(
            person_id_list=[
                1,
            ],
            name="name_example",
            status=[
                1,
            ],
            category_id=[
                1,
            ],
            page_size=1,
            page_num=1,
            sort_list=[
                SortingRuleDto(
                    field="field_example",
                    order_by="order_by_example",
                ),
            ],
            trade_id=1,
            role_type=1,
            trade_id_list=[
                1,
            ],
            content_type=1,
        ),
    ) # GetPersonListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_person_list(get_person_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonQueryService->get_person_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_person_list_request_wrapper** | [**GetPersonListRequestWrapper**](GetPersonListRequestWrapper.md)|  |

### Return type

[**GetPersonListResponseWrapper**](GetPersonListResponseWrapper.md)

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

