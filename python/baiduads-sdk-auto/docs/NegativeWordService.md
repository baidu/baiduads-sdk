# baiduads.NegativeWordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_duplicate_negative_words**](NegativeWordService.md#get_duplicate_negative_words) | **POST** /json/sms/service/NegativeWordService/getDuplicateNegativeWords | 
[**update_adgroup_negative_words**](NegativeWordService.md#update_adgroup_negative_words) | **POST** /json/sms/service/NegativeWordService/updateAdgroupNegativeWords | 
[**update_adgroup_negative_words_sync**](NegativeWordService.md#update_adgroup_negative_words_sync) | **POST** /json/sms/service/NegativeWordService/updateAdgroupNegativeWordsSync | 
[**update_campaign_negative_words_sync**](NegativeWordService.md#update_campaign_negative_words_sync) | **POST** /json/sms/service/NegativeWordService/updateCampaignNegativeWordsSync | 


# **get_duplicate_negative_words**
> GetDuplicateNegativeWordsResponseWrapper get_duplicate_negative_words(get_duplicate_negative_words_request_wrapper)



### Example


```python
import time
import baiduads
from negativeword.api import negative_word_service
from baiduads.negativeword.model.get_duplicate_negative_words_request_wrapper import GetDuplicateNegativeWordsRequestWrapper
from baiduads.negativeword.model.get_duplicate_negative_words_response_wrapper import GetDuplicateNegativeWordsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = negative_word_service.NegativeWordService(api_client)
    get_duplicate_negative_words_request_wrapper = GetDuplicateNegativeWordsRequestWrapper(
        header=ApiRequestHeader(),
        body=NegativeWordQueryRequest(
            negative_word_query_items=[
                NegativeWordQueryItem(
                    campaign_id=1,
                    duplicate_type=1,
                    adgroup_id=1,
                ),
            ],
        ),
    ) # GetDuplicateNegativeWordsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_duplicate_negative_words(get_duplicate_negative_words_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NegativeWordService->get_duplicate_negative_words: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_duplicate_negative_words_request_wrapper** | [**GetDuplicateNegativeWordsRequestWrapper**](GetDuplicateNegativeWordsRequestWrapper.md)|  |

### Return type

[**GetDuplicateNegativeWordsResponseWrapper**](GetDuplicateNegativeWordsResponseWrapper.md)

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

# **update_adgroup_negative_words**
> UpdateAdgroupNegativeWordsResponseWrapper update_adgroup_negative_words(update_adgroup_negative_words_request_wrapper)



### Example


```python
import time
import baiduads
from negativeword.api import negative_word_service
from baiduads.negativeword.model.update_adgroup_negative_words_response_wrapper import UpdateAdgroupNegativeWordsResponseWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_request_wrapper import UpdateAdgroupNegativeWordsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = negative_word_service.NegativeWordService(api_client)
    update_adgroup_negative_words_request_wrapper = UpdateAdgroupNegativeWordsRequestWrapper(
        header=ApiRequestHeader(),
        body=NegativeWordModRequest(
            update_type=1,
            negative_word_types=[
                NegativeWordType(
                    campaign_id=1,
                    adgroup_id=1,
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    negative_word_packet_ids=[
                        1,
                    ],
                    negative_word_packets=[
                        NegativeWordPacket(
                            negative_word_packet_id=1,
                            negative_word_packet_name="negative_word_packet_name_example",
                            negative_words=[
                                "negative_words_example",
                            ],
                            exact_negative_words=[
                                "exact_negative_words_example",
                            ],
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdateAdgroupNegativeWordsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adgroup_negative_words(update_adgroup_negative_words_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NegativeWordService->update_adgroup_negative_words: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_adgroup_negative_words_request_wrapper** | [**UpdateAdgroupNegativeWordsRequestWrapper**](UpdateAdgroupNegativeWordsRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupNegativeWordsResponseWrapper**](UpdateAdgroupNegativeWordsResponseWrapper.md)

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

# **update_adgroup_negative_words_sync**
> UpdateAdgroupNegativeWordsSyncResponseWrapper update_adgroup_negative_words_sync(update_adgroup_negative_words_sync_request_wrapper)



### Example


```python
import time
import baiduads
from negativeword.api import negative_word_service
from baiduads.negativeword.model.update_adgroup_negative_words_sync_response_wrapper import UpdateAdgroupNegativeWordsSyncResponseWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_sync_request_wrapper import UpdateAdgroupNegativeWordsSyncRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = negative_word_service.NegativeWordService(api_client)
    update_adgroup_negative_words_sync_request_wrapper = UpdateAdgroupNegativeWordsSyncRequestWrapper(
        header=ApiRequestHeader(),
        body=NegativeWordModRequest(
            update_type=1,
            negative_word_types=[
                NegativeWordType(
                    campaign_id=1,
                    adgroup_id=1,
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    negative_word_packet_ids=[
                        1,
                    ],
                    negative_word_packets=[
                        NegativeWordPacket(
                            negative_word_packet_id=1,
                            negative_word_packet_name="negative_word_packet_name_example",
                            negative_words=[
                                "negative_words_example",
                            ],
                            exact_negative_words=[
                                "exact_negative_words_example",
                            ],
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdateAdgroupNegativeWordsSyncRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adgroup_negative_words_sync(update_adgroup_negative_words_sync_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NegativeWordService->update_adgroup_negative_words_sync: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_adgroup_negative_words_sync_request_wrapper** | [**UpdateAdgroupNegativeWordsSyncRequestWrapper**](UpdateAdgroupNegativeWordsSyncRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupNegativeWordsSyncResponseWrapper**](UpdateAdgroupNegativeWordsSyncResponseWrapper.md)

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

# **update_campaign_negative_words_sync**
> UpdateCampaignNegativeWordsSyncResponseWrapper update_campaign_negative_words_sync(update_campaign_negative_words_sync_request_wrapper)



### Example


```python
import time
import baiduads
from negativeword.api import negative_word_service
from baiduads.negativeword.model.update_campaign_negative_words_sync_response_wrapper import UpdateCampaignNegativeWordsSyncResponseWrapper
from baiduads.negativeword.model.update_campaign_negative_words_sync_request_wrapper import UpdateCampaignNegativeWordsSyncRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = negative_word_service.NegativeWordService(api_client)
    update_campaign_negative_words_sync_request_wrapper = UpdateCampaignNegativeWordsSyncRequestWrapper(
        header=ApiRequestHeader(),
        body=NegativeWordModRequest(
            update_type=1,
            negative_word_types=[
                NegativeWordType(
                    campaign_id=1,
                    adgroup_id=1,
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    negative_word_packet_ids=[
                        1,
                    ],
                    negative_word_packets=[
                        NegativeWordPacket(
                            negative_word_packet_id=1,
                            negative_word_packet_name="negative_word_packet_name_example",
                            negative_words=[
                                "negative_words_example",
                            ],
                            exact_negative_words=[
                                "exact_negative_words_example",
                            ],
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdateCampaignNegativeWordsSyncRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_campaign_negative_words_sync(update_campaign_negative_words_sync_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NegativeWordService->update_campaign_negative_words_sync: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_campaign_negative_words_sync_request_wrapper** | [**UpdateCampaignNegativeWordsSyncRequestWrapper**](UpdateCampaignNegativeWordsSyncRequestWrapper.md)|  |

### Return type

[**UpdateCampaignNegativeWordsSyncResponseWrapper**](UpdateCampaignNegativeWordsSyncResponseWrapper.md)

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

