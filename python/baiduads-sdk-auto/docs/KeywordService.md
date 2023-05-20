# baiduads.KeywordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_word**](KeywordService.md#add_word) | **POST** /json/sms/service/KeywordService/addWord | 
[**delete_word**](KeywordService.md#delete_word) | **POST** /json/sms/service/KeywordService/deleteWord | 
[**get_word**](KeywordService.md#get_word) | **POST** /json/sms/service/KeywordService/getWord | 
[**update_word**](KeywordService.md#update_word) | **POST** /json/sms/service/KeywordService/updateWord | 


# **add_word**
> AddWordResponseWrapper add_word(add_word_request_wrapper)



### Example


```python
import time
import baiduads
from keyword.api import keyword_service
from baiduads.keyword.model.add_word_response_wrapper import AddWordResponseWrapper
from baiduads.keyword.model.add_word_request_wrapper import AddWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = keyword_service.KeywordService(api_client)
    add_word_request_wrapper = AddWordRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiKeywordAddRequest(
            keyword_types=[
                ApiKeywordType(
                    campaign_id=1,
                    keyword_id=1,
                    adgroup_id=1,
                    keyword="keyword_example",
                    price=3.14,
                    match_type=1,
                    pause=True,
                    status=1,
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    phrase_type=1,
                    offline_reasons=[
                        ApiOfflineReason(
                            main_reason="main_reason_example",
                            detail_reason="detail_reason_example",
                        ),
                    ],
                    tabs=[
                        1,
                    ],
                    left_price_guide=3.14,
                    m_price_guide=3.14,
                    deeplink="deeplink_example",
                    mini_program_url="mini_program_url_example",
                    strategy_id=1,
                    quality=1,
                    estimated_click_rate=1,
                    business_relationship=1,
                    land_page_experience=1,
                    create_time="create_time_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                    ulink="ulink_example",
                    api_inefficient=1,
                ),
            ],
        ),
    ) # AddWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_word(add_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KeywordService->add_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_word_request_wrapper** | [**AddWordRequestWrapper**](AddWordRequestWrapper.md)|  |

### Return type

[**AddWordResponseWrapper**](AddWordResponseWrapper.md)

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

# **delete_word**
> DeleteWordResponseWrapper delete_word(delete_word_request_wrapper)



### Example


```python
import time
import baiduads
from keyword.api import keyword_service
from baiduads.keyword.model.delete_word_response_wrapper import DeleteWordResponseWrapper
from baiduads.keyword.model.delete_word_request_wrapper import DeleteWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = keyword_service.KeywordService(api_client)
    delete_word_request_wrapper = DeleteWordRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiKeywordDelRequest(
            keyword_ids=[
                1,
            ],
        ),
    ) # DeleteWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_word(delete_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KeywordService->delete_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_word_request_wrapper** | [**DeleteWordRequestWrapper**](DeleteWordRequestWrapper.md)|  |

### Return type

[**DeleteWordResponseWrapper**](DeleteWordResponseWrapper.md)

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

# **get_word**
> GetWordResponseWrapper get_word(get_word_request_wrapper)



### Example


```python
import time
import baiduads
from keyword.api import keyword_service
from baiduads.keyword.model.get_word_response_wrapper import GetWordResponseWrapper
from baiduads.keyword.model.get_word_request_wrapper import GetWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = keyword_service.KeywordService(api_client)
    get_word_request_wrapper = GetWordRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiKeywordQueryRequest(
            word_fields=[
                "word_fields_example",
            ],
            ids=[
                1,
            ],
            id_type=1,
            get_temp=1,
        ),
    ) # GetWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_word(get_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KeywordService->get_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_word_request_wrapper** | [**GetWordRequestWrapper**](GetWordRequestWrapper.md)|  |

### Return type

[**GetWordResponseWrapper**](GetWordResponseWrapper.md)

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

# **update_word**
> UpdateWordResponseWrapper update_word(update_word_request_wrapper)



### Example


```python
import time
import baiduads
from keyword.api import keyword_service
from baiduads.keyword.model.update_word_request_wrapper import UpdateWordRequestWrapper
from baiduads.keyword.model.update_word_response_wrapper import UpdateWordResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = keyword_service.KeywordService(api_client)
    update_word_request_wrapper = UpdateWordRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiKeywordUpdateRequest(
            keyword_types=[
                ApiKeywordType(
                    campaign_id=1,
                    keyword_id=1,
                    adgroup_id=1,
                    keyword="keyword_example",
                    price=3.14,
                    match_type=1,
                    pause=True,
                    status=1,
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    phrase_type=1,
                    offline_reasons=[
                        ApiOfflineReason(
                            main_reason="main_reason_example",
                            detail_reason="detail_reason_example",
                        ),
                    ],
                    tabs=[
                        1,
                    ],
                    left_price_guide=3.14,
                    m_price_guide=3.14,
                    deeplink="deeplink_example",
                    mini_program_url="mini_program_url_example",
                    strategy_id=1,
                    quality=1,
                    estimated_click_rate=1,
                    business_relationship=1,
                    land_page_experience=1,
                    create_time="create_time_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                    ulink="ulink_example",
                    api_inefficient=1,
                ),
            ],
        ),
    ) # UpdateWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_word(update_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling KeywordService->update_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_word_request_wrapper** | [**UpdateWordRequestWrapper**](UpdateWordRequestWrapper.md)|  |

### Return type

[**UpdateWordResponseWrapper**](UpdateWordResponseWrapper.md)

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

