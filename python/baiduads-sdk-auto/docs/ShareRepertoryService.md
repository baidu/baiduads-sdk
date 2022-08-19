# baiduads.ShareRepertoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_share_repertory**](ShareRepertoryService.md#add_share_repertory) | **POST** /json/sms/service/ShareRepertoryService/addShareRepertory | 
[**delete_share_repertory**](ShareRepertoryService.md#delete_share_repertory) | **POST** /json/sms/service/ShareRepertoryService/deleteShareRepertory | 
[**get_share_repertory**](ShareRepertoryService.md#get_share_repertory) | **POST** /json/sms/service/ShareRepertoryService/getShareRepertory | 
[**update_share_repertory**](ShareRepertoryService.md#update_share_repertory) | **POST** /json/sms/service/ShareRepertoryService/updateShareRepertory | 


# **add_share_repertory**
> AddShareRepertoryResponseWrapper add_share_repertory(add_share_repertory_request_wrapper)



### Example


```python
import time
import baiduads
from sharerepertory.api import share_repertory_service
from baiduads.sharerepertory.model.add_share_repertory_response_wrapper import AddShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.add_share_repertory_request_wrapper import AddShareRepertoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = share_repertory_service.ShareRepertoryService(api_client)
    add_share_repertory_request_wrapper = AddShareRepertoryRequestWrapper(
        header=ApiRequestHeader(),
        body=ShareRepertoryModRequest(
            share_repertory_types=[
                ShareRepertoryType(
                    share_repertory_type=1,
                    share_repertory_id=1,
                    share_repertory_name="share_repertory_name_example",
                    bind_campaign_names=[
                        "bind_campaign_names_example",
                    ],
                    bind_campaign_count=1,
                    bind_campaign_ids=[
                        1,
                    ],
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    negative_word_ids=[
                        1,
                    ],
                    exact_negative_word_ids=[
                        1,
                    ],
                    negative_word_count=1,
                ),
            ],
        ),
    ) # AddShareRepertoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_share_repertory(add_share_repertory_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShareRepertoryService->add_share_repertory: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_share_repertory_request_wrapper** | [**AddShareRepertoryRequestWrapper**](AddShareRepertoryRequestWrapper.md)|  |

### Return type

[**AddShareRepertoryResponseWrapper**](AddShareRepertoryResponseWrapper.md)

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

# **delete_share_repertory**
> DeleteShareRepertoryResponseWrapper delete_share_repertory(delete_share_repertory_request_wrapper)



### Example


```python
import time
import baiduads
from sharerepertory.api import share_repertory_service
from baiduads.sharerepertory.model.delete_share_repertory_response_wrapper import DeleteShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.delete_share_repertory_request_wrapper import DeleteShareRepertoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = share_repertory_service.ShareRepertoryService(api_client)
    delete_share_repertory_request_wrapper = DeleteShareRepertoryRequestWrapper(
        header=ApiRequestHeader(),
        body=ShareRepertoryDelRequest(
            share_repertory_ids=[
                1,
            ],
            share_repertory_type=1,
            selected=True,
        ),
    ) # DeleteShareRepertoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_share_repertory(delete_share_repertory_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShareRepertoryService->delete_share_repertory: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_share_repertory_request_wrapper** | [**DeleteShareRepertoryRequestWrapper**](DeleteShareRepertoryRequestWrapper.md)|  |

### Return type

[**DeleteShareRepertoryResponseWrapper**](DeleteShareRepertoryResponseWrapper.md)

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

# **get_share_repertory**
> GetShareRepertoryResponseWrapper get_share_repertory(get_share_repertory_request_wrapper)



### Example


```python
import time
import baiduads
from sharerepertory.api import share_repertory_service
from baiduads.sharerepertory.model.get_share_repertory_response_wrapper import GetShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.get_share_repertory_request_wrapper import GetShareRepertoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = share_repertory_service.ShareRepertoryService(api_client)
    get_share_repertory_request_wrapper = GetShareRepertoryRequestWrapper(
        header=ApiRequestHeader(),
        body=ShareRepertoryQueryRequest(
            order_by="order_by_example",
            share_repertory_fields=[
                "share_repertory_fields_example",
            ],
            share_repertory_type=1,
            limit=[
                1,
            ],
            desc=True,
        ),
    ) # GetShareRepertoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_share_repertory(get_share_repertory_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShareRepertoryService->get_share_repertory: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_share_repertory_request_wrapper** | [**GetShareRepertoryRequestWrapper**](GetShareRepertoryRequestWrapper.md)|  |

### Return type

[**GetShareRepertoryResponseWrapper**](GetShareRepertoryResponseWrapper.md)

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

# **update_share_repertory**
> UpdateShareRepertoryResponseWrapper update_share_repertory(update_share_repertory_request_wrapper)



### Example


```python
import time
import baiduads
from sharerepertory.api import share_repertory_service
from baiduads.sharerepertory.model.update_share_repertory_request_wrapper import UpdateShareRepertoryRequestWrapper
from baiduads.sharerepertory.model.update_share_repertory_response_wrapper import UpdateShareRepertoryResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = share_repertory_service.ShareRepertoryService(api_client)
    update_share_repertory_request_wrapper = UpdateShareRepertoryRequestWrapper(
        header=ApiRequestHeader(),
        body=ShareRepertoryModRequest(
            share_repertory_types=[
                ShareRepertoryType(
                    share_repertory_type=1,
                    share_repertory_id=1,
                    share_repertory_name="share_repertory_name_example",
                    bind_campaign_names=[
                        "bind_campaign_names_example",
                    ],
                    bind_campaign_count=1,
                    bind_campaign_ids=[
                        1,
                    ],
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    negative_word_ids=[
                        1,
                    ],
                    exact_negative_word_ids=[
                        1,
                    ],
                    negative_word_count=1,
                ),
            ],
        ),
    ) # UpdateShareRepertoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_share_repertory(update_share_repertory_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShareRepertoryService->update_share_repertory: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_share_repertory_request_wrapper** | [**UpdateShareRepertoryRequestWrapper**](UpdateShareRepertoryRequestWrapper.md)|  |

### Return type

[**UpdateShareRepertoryResponseWrapper**](UpdateShareRepertoryResponseWrapper.md)

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

