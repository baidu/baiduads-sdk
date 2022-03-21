# baiduads.WtpFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_wtp_feed**](WtpFeedService.md#add_wtp_feed) | **POST** /json/feed/v1/WtpFeedService/addWtpFeed | 
[**delete_wtp_feed**](WtpFeedService.md#delete_wtp_feed) | **POST** /json/feed/v1/WtpFeedService/deleteWtpFeed | 
[**get_wtp_feed**](WtpFeedService.md#get_wtp_feed) | **POST** /json/feed/v1/WtpFeedService/getWtpFeed | 
[**update_wtp_feed**](WtpFeedService.md#update_wtp_feed) | **POST** /json/feed/v1/WtpFeedService/updateWtpFeed | 


# **add_wtp_feed**
> AddWtpFeedResponseWrapper add_wtp_feed(add_wtp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from wtpfeed.api import wtp_feed_service
from baiduads.wtpfeed.model.add_wtp_feed_request_wrapper import AddWtpFeedRequestWrapper
from baiduads.wtpfeed.model.add_wtp_feed_response_wrapper import AddWtpFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wtp_feed_service.WtpFeedService(api_client)
    add_wtp_feed_request_wrapper = AddWtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddWtpFeedRequestWrapperBody(
            wtp_feed_types=[
                WtpFeedType(
                    wtp_id=1,
                    wtp_name="wtp_name_example",
                    keywords="keywords_example",
                    estimate=3.14,
                    hot=1,
                    word_count=1,
                    hot_level="hot_level_example",
                    recm_word_models=[
                        RecmWordModel(
                            key_word="key_word_example",
                            hot=1,
                            wtype=1,
                            w_tag=[
                                "w_tag_example",
                            ],
                            concern=[
                                "concern_example",
                            ],
                            type=[
                                "type_example",
                            ],
                            correlation=3.14,
                            hot_level="hot_level_example",
                        ),
                    ],
                ),
            ],
        ),
    ) # AddWtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_wtp_feed(add_wtp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtpFeedService->add_wtp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_wtp_feed_request_wrapper** | [**AddWtpFeedRequestWrapper**](AddWtpFeedRequestWrapper.md)|  |

### Return type

[**AddWtpFeedResponseWrapper**](AddWtpFeedResponseWrapper.md)

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

# **delete_wtp_feed**
> DeleteWtpFeedResponseWrapper delete_wtp_feed(delete_wtp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from wtpfeed.api import wtp_feed_service
from baiduads.wtpfeed.model.delete_wtp_feed_response_wrapper import DeleteWtpFeedResponseWrapper
from baiduads.wtpfeed.model.delete_wtp_feed_request_wrapper import DeleteWtpFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wtp_feed_service.WtpFeedService(api_client)
    delete_wtp_feed_request_wrapper = DeleteWtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteWtpFeedRequestWrapperBody(
            wtp_ids=[
                1,
            ],
        ),
    ) # DeleteWtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_wtp_feed(delete_wtp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtpFeedService->delete_wtp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_wtp_feed_request_wrapper** | [**DeleteWtpFeedRequestWrapper**](DeleteWtpFeedRequestWrapper.md)|  |

### Return type

[**DeleteWtpFeedResponseWrapper**](DeleteWtpFeedResponseWrapper.md)

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

# **get_wtp_feed**
> GetWtpFeedResponseWrapper get_wtp_feed(get_wtp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from wtpfeed.api import wtp_feed_service
from baiduads.wtpfeed.model.get_wtp_feed_response_wrapper import GetWtpFeedResponseWrapper
from baiduads.wtpfeed.model.get_wtp_feed_request_wrapper import GetWtpFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wtp_feed_service.WtpFeedService(api_client)
    get_wtp_feed_request_wrapper = GetWtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetWtpFeedRequestWrapperBody(
            wtp_ids=[
                1,
            ],
        ),
    ) # GetWtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_wtp_feed(get_wtp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtpFeedService->get_wtp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_wtp_feed_request_wrapper** | [**GetWtpFeedRequestWrapper**](GetWtpFeedRequestWrapper.md)|  |

### Return type

[**GetWtpFeedResponseWrapper**](GetWtpFeedResponseWrapper.md)

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

# **update_wtp_feed**
> UpdateWtpFeedResponseWrapper update_wtp_feed(update_wtp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from wtpfeed.api import wtp_feed_service
from baiduads.wtpfeed.model.update_wtp_feed_response_wrapper import UpdateWtpFeedResponseWrapper
from baiduads.wtpfeed.model.update_wtp_feed_request_wrapper import UpdateWtpFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wtp_feed_service.WtpFeedService(api_client)
    update_wtp_feed_request_wrapper = UpdateWtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateWtpFeedRequestWrapperBody(
            wtp_feed_types=[
                WtpFeedType(
                    wtp_id=1,
                    wtp_name="wtp_name_example",
                    keywords="keywords_example",
                    estimate=3.14,
                    hot=1,
                    word_count=1,
                    hot_level="hot_level_example",
                    recm_word_models=[
                        RecmWordModel(
                            key_word="key_word_example",
                            hot=1,
                            wtype=1,
                            w_tag=[
                                "w_tag_example",
                            ],
                            concern=[
                                "concern_example",
                            ],
                            type=[
                                "type_example",
                            ],
                            correlation=3.14,
                            hot_level="hot_level_example",
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdateWtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_wtp_feed(update_wtp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtpFeedService->update_wtp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_wtp_feed_request_wrapper** | [**UpdateWtpFeedRequestWrapper**](UpdateWtpFeedRequestWrapper.md)|  |

### Return type

[**UpdateWtpFeedResponseWrapper**](UpdateWtpFeedResponseWrapper.md)

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

