# baiduads.DpaCreativeFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_creative_feed**](DpaCreativeFeedService.md#add_creative_feed) | **POST** /json/feed/v1/DpaCreativeFeedService/addCreativeFeed | 
[**delete_creative_feed**](DpaCreativeFeedService.md#delete_creative_feed) | **POST** /json/feed/v1/DpaCreativeFeedService/deleteCreativeFeed | 
[**get_creative_feed**](DpaCreativeFeedService.md#get_creative_feed) | **POST** /json/feed/v1/DpaCreativeFeedService/getCreativeFeed | 
[**get_creative_preview**](DpaCreativeFeedService.md#get_creative_preview) | **POST** /json/feed/v1/DpaCreativeFeedService/getCreativePreview | 
[**get_symbol_fields**](DpaCreativeFeedService.md#get_symbol_fields) | **POST** /json/feed/v1/DpaCreativeFeedService/getSymbolFields | 
[**update_creative_feed**](DpaCreativeFeedService.md#update_creative_feed) | **POST** /json/feed/v1/DpaCreativeFeedService/updateCreativeFeed | 


# **add_creative_feed**
> AddCreativeFeedResponseWrapper add_creative_feed(add_creative_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.add_creative_feed_request_wrapper import AddCreativeFeedRequestWrapper
from baiduads.dpacreativefeed.model.add_creative_feed_response_wrapper import AddCreativeFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    add_creative_feed_request_wrapper = AddCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeFeedRequest(
            creative_feed_types=[
                DpaCreativeFeedType(
                    creative_feed_id=1,
                    campaign_feed_id=1,
                    adgroup_feed_id=1,
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    material="material_example",
                    template=Template(
                        title="title_example",
                        subtitle="subtitle_example",
                        target_url="target_url_example",
                        monitor_url="monitor_url_example",
                        user_portrait="user_portrait_example",
                        na_url="na_url_example",
                        brand="brand_example",
                        pictures=[
                            Picture(
                                url="url_example",
                                target_url="target_url_example",
                                na_url="na_url_example",
                                desc1="desc1_example",
                                desc2="desc2_example",
                            ),
                        ],
                        extra_pictures=[
                            ExtraPicture(
                                pictures=[
                                    ExtraPictureItem(
                                        image="image_example",
                                    ),
                                ],
                                width=1,
                                height=1,
                            ),
                        ],
                        poster="poster_example",
                        video_id="video_id_example",
                        duration="duration_example",
                        video_url="video_url_example",
                        mini_program_schema="mini_program_schema_example",
                        exposure_url="exposure_url_example",
                        ulk_scheme="ulk_scheme_example",
                        ulk_url="ulk_url_example",
                    ),
                    pause=True,
                    status=1,
                    refusereason="refusereason_example",
                    huitus=[
                        1,
                    ],
                ),
            ],
        ),
    ) # AddCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_creative_feed(add_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->add_creative_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_creative_feed_request_wrapper** | [**AddCreativeFeedRequestWrapper**](AddCreativeFeedRequestWrapper.md)|  |

### Return type

[**AddCreativeFeedResponseWrapper**](AddCreativeFeedResponseWrapper.md)

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

# **delete_creative_feed**
> DeleteCreativeFeedResponseWrapper delete_creative_feed(delete_creative_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.delete_creative_feed_response_wrapper import DeleteCreativeFeedResponseWrapper
from baiduads.dpacreativefeed.model.delete_creative_feed_request_wrapper import DeleteCreativeFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    delete_creative_feed_request_wrapper = DeleteCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteCreativeFeedRequest(
            creative_feed_ids=[
                1,
            ],
        ),
    ) # DeleteCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_creative_feed(delete_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->delete_creative_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_creative_feed_request_wrapper** | [**DeleteCreativeFeedRequestWrapper**](DeleteCreativeFeedRequestWrapper.md)|  |

### Return type

[**DeleteCreativeFeedResponseWrapper**](DeleteCreativeFeedResponseWrapper.md)

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

# **get_creative_feed**
> GetCreativeFeedResponseWrapper get_creative_feed(get_creative_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.get_creative_feed_response_wrapper import GetCreativeFeedResponseWrapper
from baiduads.dpacreativefeed.model.get_creative_feed_request_wrapper import GetCreativeFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    get_creative_feed_request_wrapper = GetCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeFeedRequest(
            creative_feed_fields=[
                "creative_feed_fields_example",
            ],
            ids=[
                1,
            ],
            id_type=1,
            creative_feed_filter=CreativeFeedFilter(
                status=[
                    1,
                ],
            ),
        ),
    ) # GetCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_feed(get_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->get_creative_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_feed_request_wrapper** | [**GetCreativeFeedRequestWrapper**](GetCreativeFeedRequestWrapper.md)|  |

### Return type

[**GetCreativeFeedResponseWrapper**](GetCreativeFeedResponseWrapper.md)

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

# **get_creative_preview**
> GetCreativePreviewResponseWrapper get_creative_preview(get_creative_preview_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.get_creative_preview_response_wrapper import GetCreativePreviewResponseWrapper
from baiduads.dpacreativefeed.model.get_creative_preview_request_wrapper import GetCreativePreviewRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    get_creative_preview_request_wrapper = GetCreativePreviewRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativePreviewRequest(
            creative_feed_types=[
                DpaCreativeFeedType(
                    creative_feed_id=1,
                    campaign_feed_id=1,
                    adgroup_feed_id=1,
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    material="material_example",
                    template=Template(
                        title="title_example",
                        subtitle="subtitle_example",
                        target_url="target_url_example",
                        monitor_url="monitor_url_example",
                        user_portrait="user_portrait_example",
                        na_url="na_url_example",
                        brand="brand_example",
                        pictures=[
                            Picture(
                                url="url_example",
                                target_url="target_url_example",
                                na_url="na_url_example",
                                desc1="desc1_example",
                                desc2="desc2_example",
                            ),
                        ],
                        extra_pictures=[
                            ExtraPicture(
                                pictures=[
                                    ExtraPictureItem(
                                        image="image_example",
                                    ),
                                ],
                                width=1,
                                height=1,
                            ),
                        ],
                        poster="poster_example",
                        video_id="video_id_example",
                        duration="duration_example",
                        video_url="video_url_example",
                        mini_program_schema="mini_program_schema_example",
                        exposure_url="exposure_url_example",
                        ulk_scheme="ulk_scheme_example",
                        ulk_url="ulk_url_example",
                    ),
                    pause=True,
                    status=1,
                    refusereason="refusereason_example",
                    huitus=[
                        1,
                    ],
                ),
            ],
        ),
    ) # GetCreativePreviewRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_preview(get_creative_preview_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->get_creative_preview: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_preview_request_wrapper** | [**GetCreativePreviewRequestWrapper**](GetCreativePreviewRequestWrapper.md)|  |

### Return type

[**GetCreativePreviewResponseWrapper**](GetCreativePreviewResponseWrapper.md)

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

# **get_symbol_fields**
> GetSymbolFieldsResponseWrapper get_symbol_fields(get_symbol_fields_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.get_symbol_fields_response_wrapper import GetSymbolFieldsResponseWrapper
from baiduads.dpacreativefeed.model.get_symbol_fields_request_wrapper import GetSymbolFieldsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    get_symbol_fields_request_wrapper = GetSymbolFieldsRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetSymbolFieldsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_symbol_fields(get_symbol_fields_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->get_symbol_fields: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_symbol_fields_request_wrapper** | [**GetSymbolFieldsRequestWrapper**](GetSymbolFieldsRequestWrapper.md)|  |

### Return type

[**GetSymbolFieldsResponseWrapper**](GetSymbolFieldsResponseWrapper.md)

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

# **update_creative_feed**
> UpdateCreativeFeedResponseWrapper update_creative_feed(update_creative_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreativefeed.api import dpa_creative_feed_service
from baiduads.dpacreativefeed.model.update_creative_feed_request_wrapper import UpdateCreativeFeedRequestWrapper
from baiduads.dpacreativefeed.model.update_creative_feed_response_wrapper import UpdateCreativeFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_feed_service.DpaCreativeFeedService(api_client)
    update_creative_feed_request_wrapper = UpdateCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateCreativeFeedRequest(
            creative_feed_types=[
                DpaCreativeFeedType(
                    creative_feed_id=1,
                    campaign_feed_id=1,
                    adgroup_feed_id=1,
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    material="material_example",
                    template=Template(
                        title="title_example",
                        subtitle="subtitle_example",
                        target_url="target_url_example",
                        monitor_url="monitor_url_example",
                        user_portrait="user_portrait_example",
                        na_url="na_url_example",
                        brand="brand_example",
                        pictures=[
                            Picture(
                                url="url_example",
                                target_url="target_url_example",
                                na_url="na_url_example",
                                desc1="desc1_example",
                                desc2="desc2_example",
                            ),
                        ],
                        extra_pictures=[
                            ExtraPicture(
                                pictures=[
                                    ExtraPictureItem(
                                        image="image_example",
                                    ),
                                ],
                                width=1,
                                height=1,
                            ),
                        ],
                        poster="poster_example",
                        video_id="video_id_example",
                        duration="duration_example",
                        video_url="video_url_example",
                        mini_program_schema="mini_program_schema_example",
                        exposure_url="exposure_url_example",
                        ulk_scheme="ulk_scheme_example",
                        ulk_url="ulk_url_example",
                    ),
                    pause=True,
                    status=1,
                    refusereason="refusereason_example",
                    huitus=[
                        1,
                    ],
                ),
            ],
        ),
    ) # UpdateCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_creative_feed(update_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaCreativeFeedService->update_creative_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_creative_feed_request_wrapper** | [**UpdateCreativeFeedRequestWrapper**](UpdateCreativeFeedRequestWrapper.md)|  |

### Return type

[**UpdateCreativeFeedResponseWrapper**](UpdateCreativeFeedResponseWrapper.md)

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

