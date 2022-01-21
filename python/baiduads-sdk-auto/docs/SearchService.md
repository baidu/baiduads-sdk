# baiduads.SearchService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count_by_id**](SearchService.md#get_count_by_id) | **POST** /json/sms/service/SearchService/getCountById | 
[**get_creative_id_by_search**](SearchService.md#get_creative_id_by_search) | **POST** /json/sms/service/SearchService/getCreativeIdBySearch | 
[**get_ids_by_tabs**](SearchService.md#get_ids_by_tabs) | **POST** /json/sms/service/SearchService/getIdsByTabs | 
[**get_keyword_id_by_search**](SearchService.md#get_keyword_id_by_search) | **POST** /json/sms/service/SearchService/getKeywordIdBySearch | 
[**get_material_info_by_search**](SearchService.md#get_material_info_by_search) | **POST** /json/sms/service/SearchService/getMaterialInfoBySearch | 
[**get_tab**](SearchService.md#get_tab) | **POST** /json/sms/service/SearchService/getTab | 


# **get_count_by_id**
> GetCountByIdResponseWrapper get_count_by_id(get_count_by_id_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_count_by_id_response_wrapper import GetCountByIdResponseWrapper
from baiduads.search.model.get_count_by_id_request_wrapper import GetCountByIdRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_count_by_id_request_wrapper = GetCountByIdRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCountByIdParams(
            id_type=1,
            count_type=1,
            ids=[
                1,
            ],
        ),
    ) # GetCountByIdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_count_by_id(get_count_by_id_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_count_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_count_by_id_request_wrapper** | [**GetCountByIdRequestWrapper**](GetCountByIdRequestWrapper.md)|  |

### Return type

[**GetCountByIdResponseWrapper**](GetCountByIdResponseWrapper.md)

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

# **get_creative_id_by_search**
> GetCreativeIdBySearchResponseWrapper get_creative_id_by_search(get_creative_id_by_search_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_creative_id_by_search_request_wrapper import GetCreativeIdBySearchRequestWrapper
from baiduads.search.model.get_creative_id_by_search_response_wrapper import GetCreativeIdBySearchResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_creative_id_by_search_request_wrapper = GetCreativeIdBySearchRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeIdBySearchParams(
            campaign_ids=[
                1,
            ],
            page=1,
            status=[
                1,
            ],
        ),
    ) # GetCreativeIdBySearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_id_by_search(get_creative_id_by_search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_creative_id_by_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_id_by_search_request_wrapper** | [**GetCreativeIdBySearchRequestWrapper**](GetCreativeIdBySearchRequestWrapper.md)|  |

### Return type

[**GetCreativeIdBySearchResponseWrapper**](GetCreativeIdBySearchResponseWrapper.md)

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

# **get_ids_by_tabs**
> GetIdsByTabsResponseWrapper get_ids_by_tabs(get_ids_by_tabs_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_ids_by_tabs_response_wrapper import GetIdsByTabsResponseWrapper
from baiduads.search.model.get_ids_by_tabs_request_wrapper import GetIdsByTabsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_ids_by_tabs_request_wrapper = GetIdsByTabsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetIdsByTabsParams(
            tab_ids=[
                1,
            ],
            id_type=1,
            page=1,
        ),
    ) # GetIdsByTabsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_ids_by_tabs(get_ids_by_tabs_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_ids_by_tabs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_ids_by_tabs_request_wrapper** | [**GetIdsByTabsRequestWrapper**](GetIdsByTabsRequestWrapper.md)|  |

### Return type

[**GetIdsByTabsResponseWrapper**](GetIdsByTabsResponseWrapper.md)

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

# **get_keyword_id_by_search**
> GetKeywordIdBySearchResponseWrapper get_keyword_id_by_search(get_keyword_id_by_search_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_keyword_id_by_search_response_wrapper import GetKeywordIdBySearchResponseWrapper
from baiduads.search.model.get_keyword_id_by_search_request_wrapper import GetKeywordIdBySearchRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_keyword_id_by_search_request_wrapper = GetKeywordIdBySearchRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKeywordIdBySearchParams(
            campaign_ids=[
                1,
            ],
            page=1,
            pc_quality=[
                1,
            ],
            mobile_quality=[
                1,
            ],
            status=[
                1,
            ],
        ),
    ) # GetKeywordIdBySearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_keyword_id_by_search(get_keyword_id_by_search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_keyword_id_by_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_keyword_id_by_search_request_wrapper** | [**GetKeywordIdBySearchRequestWrapper**](GetKeywordIdBySearchRequestWrapper.md)|  |

### Return type

[**GetKeywordIdBySearchResponseWrapper**](GetKeywordIdBySearchResponseWrapper.md)

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

# **get_material_info_by_search**
> GetMaterialInfoBySearchResponseWrapper get_material_info_by_search(get_material_info_by_search_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_material_info_by_search_response_wrapper import GetMaterialInfoBySearchResponseWrapper
from baiduads.search.model.get_material_info_by_search_request_wrapper import GetMaterialInfoBySearchRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_material_info_by_search_request_wrapper = GetMaterialInfoBySearchRequestWrapper(
        header=ApiRequestHeader(),
        body=GetMaterialInfoBySearchParams(
            search_word="search_word_example",
            start_num=1,
            end_num=1,
            campaign_id=1,
            adgroup_id=1,
            search_type=1,
            search_level=1,
            material_fields=[
                "material_fields_example",
            ],
        ),
    ) # GetMaterialInfoBySearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_material_info_by_search(get_material_info_by_search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_material_info_by_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_material_info_by_search_request_wrapper** | [**GetMaterialInfoBySearchRequestWrapper**](GetMaterialInfoBySearchRequestWrapper.md)|  |

### Return type

[**GetMaterialInfoBySearchResponseWrapper**](GetMaterialInfoBySearchResponseWrapper.md)

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

# **get_tab**
> GetTabResponseWrapper get_tab(get_tab_request_wrapper)



### Example


```python
import time
import baiduads
from search.api import search_service
from baiduads.search.model.get_tab_request_wrapper import GetTabRequestWrapper
from baiduads.search.model.get_tab_response_wrapper import GetTabResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_service.SearchService(api_client)
    get_tab_request_wrapper = GetTabRequestWrapper(
        header=ApiRequestHeader(),
        body=GetTabParams(
            tab_ids=[
                1,
            ],
            id_type=1,
        ),
    ) # GetTabRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_tab(get_tab_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchService->get_tab: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_tab_request_wrapper** | [**GetTabRequestWrapper**](GetTabRequestWrapper.md)|  |

### Return type

[**GetTabResponseWrapper**](GetTabResponseWrapper.md)

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

