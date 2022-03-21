# baiduads.AtpFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_atp_feed**](AtpFeedService.md#add_atp_feed) | **POST** /json/feed/v1/AtpFeedService/addAtpFeed | 
[**bind_atp_feed**](AtpFeedService.md#bind_atp_feed) | **POST** /json/feed/v1/AtpFeedService/bindAtpFeed | 
[**delete_atp_feed**](AtpFeedService.md#delete_atp_feed) | **POST** /json/feed/v1/AtpFeedService/deleteAtpFeed | 
[**get_atp_feed**](AtpFeedService.md#get_atp_feed) | **POST** /json/feed/v1/AtpFeedService/getAtpFeed | 
[**update_atp_feed**](AtpFeedService.md#update_atp_feed) | **POST** /json/feed/v1/AtpFeedService/updateAtpFeed | 


# **add_atp_feed**
> AddAtpFeedResponseWrapper add_atp_feed(add_atp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from atpfeed.api import atp_feed_service
from baiduads.atpfeed.model.add_atp_feed_response_wrapper import AddAtpFeedResponseWrapper
from baiduads.atpfeed.model.add_atp_feed_request_wrapper import AddAtpFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = atp_feed_service.AtpFeedService(api_client)
    add_atp_feed_request_wrapper = AddAtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddAtpFeedRequest(
            atp_feed_types=[
                AtpFeedType(
                    atp_feed_id=1,
                    atp_feed_name="atp_feed_name_example",
                    atp_feed_desc="atp_feed_desc_example",
                    ftypes=[
                        1,
                    ],
                    subject=1,
                    related_adgroup_feeds=[
                        1,
                    ],
                    audience={},
                    delivery_type=[
                        1,
                    ],
                ),
            ],
        ),
    ) # AddAtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_atp_feed(add_atp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AtpFeedService->add_atp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_atp_feed_request_wrapper** | [**AddAtpFeedRequestWrapper**](AddAtpFeedRequestWrapper.md)|  |

### Return type

[**AddAtpFeedResponseWrapper**](AddAtpFeedResponseWrapper.md)

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

# **bind_atp_feed**
> BindAtpFeedResponseWrapper bind_atp_feed(bind_atp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from atpfeed.api import atp_feed_service
from baiduads.atpfeed.model.bind_atp_feed_request_wrapper import BindAtpFeedRequestWrapper
from baiduads.atpfeed.model.bind_atp_feed_response_wrapper import BindAtpFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = atp_feed_service.AtpFeedService(api_client)
    bind_atp_feed_request_wrapper = BindAtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=BindAtpFeedRequest(
            atp_bind_feed_types=[
                AtpBindFeedType(
                    atp_feed_id=1,
                    adgroup_feed_ids=[
                        1,
                    ],
                ),
            ],
        ),
    ) # BindAtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.bind_atp_feed(bind_atp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AtpFeedService->bind_atp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bind_atp_feed_request_wrapper** | [**BindAtpFeedRequestWrapper**](BindAtpFeedRequestWrapper.md)|  |

### Return type

[**BindAtpFeedResponseWrapper**](BindAtpFeedResponseWrapper.md)

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

# **delete_atp_feed**
> DeleteAtpFeedResponseWrapper delete_atp_feed(delete_atp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from atpfeed.api import atp_feed_service
from baiduads.atpfeed.model.delete_atp_feed_request_wrapper import DeleteAtpFeedRequestWrapper
from baiduads.atpfeed.model.delete_atp_feed_response_wrapper import DeleteAtpFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = atp_feed_service.AtpFeedService(api_client)
    delete_atp_feed_request_wrapper = DeleteAtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DelAtpFeedRequest(
            atp_feed_ids=[
                1,
            ],
        ),
    ) # DeleteAtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_atp_feed(delete_atp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AtpFeedService->delete_atp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_atp_feed_request_wrapper** | [**DeleteAtpFeedRequestWrapper**](DeleteAtpFeedRequestWrapper.md)|  |

### Return type

[**DeleteAtpFeedResponseWrapper**](DeleteAtpFeedResponseWrapper.md)

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

# **get_atp_feed**
> GetAtpFeedResponseWrapper get_atp_feed(get_atp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from atpfeed.api import atp_feed_service
from baiduads.atpfeed.model.get_atp_feed_response_wrapper import GetAtpFeedResponseWrapper
from baiduads.atpfeed.model.get_atp_feed_request_wrapper import GetAtpFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = atp_feed_service.AtpFeedService(api_client)
    get_atp_feed_request_wrapper = GetAtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAtpFeedRequest(
            atp_feed_fields=[
                "atp_feed_fields_example",
            ],
            ids=[
                1,
            ],
            key="key_example",
        ),
    ) # GetAtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_atp_feed(get_atp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AtpFeedService->get_atp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_atp_feed_request_wrapper** | [**GetAtpFeedRequestWrapper**](GetAtpFeedRequestWrapper.md)|  |

### Return type

[**GetAtpFeedResponseWrapper**](GetAtpFeedResponseWrapper.md)

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

# **update_atp_feed**
> UpdateAtpFeedResponseWrapper update_atp_feed(update_atp_feed_request_wrapper)



### Example


```python
import time
import baiduads
from atpfeed.api import atp_feed_service
from baiduads.atpfeed.model.update_atp_feed_request_wrapper import UpdateAtpFeedRequestWrapper
from baiduads.atpfeed.model.update_atp_feed_response_wrapper import UpdateAtpFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = atp_feed_service.AtpFeedService(api_client)
    update_atp_feed_request_wrapper = UpdateAtpFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=ModAtpFeedRequest(
            atp_feed_types=[
                AtpFeedType(
                    atp_feed_id=1,
                    atp_feed_name="atp_feed_name_example",
                    atp_feed_desc="atp_feed_desc_example",
                    ftypes=[
                        1,
                    ],
                    subject=1,
                    related_adgroup_feeds=[
                        1,
                    ],
                    audience={},
                    delivery_type=[
                        1,
                    ],
                ),
            ],
        ),
    ) # UpdateAtpFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_atp_feed(update_atp_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AtpFeedService->update_atp_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_atp_feed_request_wrapper** | [**UpdateAtpFeedRequestWrapper**](UpdateAtpFeedRequestWrapper.md)|  |

### Return type

[**UpdateAtpFeedResponseWrapper**](UpdateAtpFeedResponseWrapper.md)

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

