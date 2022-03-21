# baiduads.KRService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_file_path**](KRService.md#get_file_path) | **POST** /json/sms/service/KRService/getFilePath | 
[**get_file_status**](KRService.md#get_file_status) | **POST** /json/sms/service/KRService/getFileStatus | 
[**get_kr_custom**](KRService.md#get_kr_custom) | **POST** /json/sms/service/KRService/getKRCustom | 
[**get_kr_file_id_by_words**](KRService.md#get_kr_file_id_by_words) | **POST** /json/sms/service/KRService/getKRFileIdByWords | 
[**get_krby_query**](KRService.md#get_krby_query) | **POST** /json/sms/service/KRService/getKRByQuery | 


# **get_file_path**
> GetFilePathResponseWrapper get_file_path(get_file_path_request_wrapper)



### Example


```python
import time
import baiduads
from kr.api import kr_service
from baiduads.kr.model.get_file_path_request_wrapper import GetFilePathRequestWrapper
from baiduads.kr.model.get_file_path_response_wrapper import GetFilePathResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = kr_service.KRService(api_client)
    get_file_path_request_wrapper = GetFilePathRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKRFileRequestParams(
            file_id="file_id_example",
        ),
    ) # GetFilePathRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_file_path(get_file_path_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KRService->get_file_path: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_file_path_request_wrapper** | [**GetFilePathRequestWrapper**](GetFilePathRequestWrapper.md)|  |

### Return type

[**GetFilePathResponseWrapper**](GetFilePathResponseWrapper.md)

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

# **get_file_status**
> GetFileStatusResponseWrapper get_file_status(get_file_status_request_wrapper)



### Example


```python
import time
import baiduads
from kr.api import kr_service
from baiduads.kr.model.get_file_status_response_wrapper import GetFileStatusResponseWrapper
from baiduads.kr.model.get_file_status_request_wrapper import GetFileStatusRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = kr_service.KRService(api_client)
    get_file_status_request_wrapper = GetFileStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKRFileRequestParams(
            file_id="file_id_example",
        ),
    ) # GetFileStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_file_status(get_file_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KRService->get_file_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_file_status_request_wrapper** | [**GetFileStatusRequestWrapper**](GetFileStatusRequestWrapper.md)|  |

### Return type

[**GetFileStatusResponseWrapper**](GetFileStatusResponseWrapper.md)

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

# **get_kr_custom**
> GetKRCustomResponseWrapper get_kr_custom(get_kr_custom_request_wrapper)



### Example


```python
import time
import baiduads
from kr.api import kr_service
from baiduads.kr.model.get_kr_custom_response_wrapper import GetKRCustomResponseWrapper
from baiduads.kr.model.get_kr_custom_request_wrapper import GetKRCustomRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = kr_service.KRService(api_client)
    get_kr_custom_request_wrapper = GetKRCustomRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKRCustomParams(
            id_type=1,
            id=1,
            seed_filter=SeedFilter(
                device=1,
                max_num=1,
                negative_words=[
                    "negative_words_example",
                ],
                positive_word="positive_word_example",
                region_extend=True,
                remove_duplicate=True,
                search_regions=[
                    1,
                ],
                remove_campaign_duplicate=True,
                remove_brand_words=True,
            ),
        ),
    ) # GetKRCustomRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_kr_custom(get_kr_custom_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KRService->get_kr_custom: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_kr_custom_request_wrapper** | [**GetKRCustomRequestWrapper**](GetKRCustomRequestWrapper.md)|  |

### Return type

[**GetKRCustomResponseWrapper**](GetKRCustomResponseWrapper.md)

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

# **get_kr_file_id_by_words**
> GetKRFileIdByWordsResponseWrapper get_kr_file_id_by_words(get_kr_file_id_by_words_request_wrapper)



### Example


```python
import time
import baiduads
from kr.api import kr_service
from baiduads.kr.model.get_kr_file_id_by_words_response_wrapper import GetKRFileIdByWordsResponseWrapper
from baiduads.kr.model.get_kr_file_id_by_words_request_wrapper import GetKRFileIdByWordsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = kr_service.KRService(api_client)
    get_kr_file_id_by_words_request_wrapper = GetKRFileIdByWordsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKRFileIdByWordsParams(
            seed_words=[
                "seed_words_example",
            ],
            seed_filter=SeedFilter(
                device=1,
                max_num=1,
                negative_words=[
                    "negative_words_example",
                ],
                positive_word="positive_word_example",
                region_extend=True,
                remove_duplicate=True,
                search_regions=[
                    1,
                ],
                remove_campaign_duplicate=True,
                remove_brand_words=True,
            ),
        ),
    ) # GetKRFileIdByWordsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_kr_file_id_by_words(get_kr_file_id_by_words_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KRService->get_kr_file_id_by_words: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_kr_file_id_by_words_request_wrapper** | [**GetKRFileIdByWordsRequestWrapper**](GetKRFileIdByWordsRequestWrapper.md)|  |

### Return type

[**GetKRFileIdByWordsResponseWrapper**](GetKRFileIdByWordsResponseWrapper.md)

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

# **get_krby_query**
> GetKRByQueryResponseWrapper get_krby_query(get_krby_query_request_wrapper)



### Example


```python
import time
import baiduads
from kr.api import kr_service
from baiduads.kr.model.get_krby_query_request_wrapper import GetKRByQueryRequestWrapper
from baiduads.kr.model.get_krby_query_response_wrapper import GetKRByQueryResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = kr_service.KRService(api_client)
    get_krby_query_request_wrapper = GetKRByQueryRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKRByQueryParams(
            seed_filter=SeedFilter(
                device=1,
                max_num=1,
                negative_words=[
                    "negative_words_example",
                ],
                positive_word="positive_word_example",
                region_extend=True,
                remove_duplicate=True,
                search_regions=[
                    1,
                ],
                remove_campaign_duplicate=True,
                remove_brand_words=True,
            ),
            query="query_example",
        ),
    ) # GetKRByQueryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_krby_query(get_krby_query_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KRService->get_krby_query: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_krby_query_request_wrapper** | [**GetKRByQueryRequestWrapper**](GetKRByQueryRequestWrapper.md)|  |

### Return type

[**GetKRByQueryResponseWrapper**](GetKRByQueryResponseWrapper.md)

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

