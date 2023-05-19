# baiduads.CreativeFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_creative_feed**](CreativeFeedService.md#add_creative_feed) | **POST** /json/feed/v1/CreativeFeedService/addCreativeFeed | 
[**bind_recommend_reasons**](CreativeFeedService.md#bind_recommend_reasons) | **POST** /json/feed/v1/CreativeFeedService/bindRecommendReasons | 
[**delete_creative_feed**](CreativeFeedService.md#delete_creative_feed) | **POST** /json/feed/v1/CreativeFeedService/deleteCreativeFeed | 
[**get_creative_feed**](CreativeFeedService.md#get_creative_feed) | **POST** /json/feed/v1/CreativeFeedService/getCreativeFeed | 
[**get_creative_feed_preview_url_with_preview_source**](CreativeFeedService.md#get_creative_feed_preview_url_with_preview_source) | **POST** /json/feed/v1/CreativeFeedService/getCreativeFeedPreviewUrlWithPreviewSource | 
[**get_temp_creative_feed_preview_url**](CreativeFeedService.md#get_temp_creative_feed_preview_url) | **POST** /json/feed/v1/CreativeFeedService/getTempCreativeFeedPreviewUrl | 
[**query_recommend_reasons**](CreativeFeedService.md#query_recommend_reasons) | **POST** /json/feed/v1/CreativeFeedService/queryRecommendReasons | 
[**update_creative_feed**](CreativeFeedService.md#update_creative_feed) | **POST** /json/feed/v1/CreativeFeedService/updateCreativeFeed | 


# **add_creative_feed**
> AddCreativeFeedResponseWrapper add_creative_feed(add_creative_feed_request_wrapper)



### Example


```python
import time
import baiduads
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.add_creative_feed_request_wrapper import AddCreativeFeedRequestWrapper
from baiduads.creativefeed.model.add_creative_feed_response_wrapper import AddCreativeFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    add_creative_feed_request_wrapper = AddCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeFeedRequestWrapperBody(
            creative_feed_types=[
                CreativeFeedType(
                    creative_feed_id=1,
                    adgroup_feed_id=1,
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    pause=True,
                    status=1,
                    material="material_example",
                    refusereason="refusereason_example",
                    playnum=1,
                    idea_type=1,
                    show_mt=1,
                    addtime="addtime_example",
                    approvemsgnew="approvemsgnew_example",
                    audit_time_model=AuditTimeModel(
                        idea_id=1,
                        idea_state=1,
                        start_time="start_time_example",
                        estimation_time="estimation_time_example",
                        estimation_minute=1,
                        complete_radio="complete_radio_example",
                    ),
                    attribute_list=1,
                    template=PaIdeaTemplate(
                        title="title_example",
                        subtitle="subtitle_example",
                        target_url="target_url_example",
                        monitor_url="monitor_url_example",
                        user_portrait="user_portrait_example",
                        na_url="na_url_example",
                        brand="brand_example",
                        pictures=[
                            PaPicture(
                                url="url_example",
                                target_url="target_url_example",
                                na_url="na_url_example",
                                desc1="desc1_example",
                                desc2="desc2_example",
                            ),
                        ],
                        extra_pictures=[
                            PaExtraPicture(
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
                        video_id=1,
                        duration="duration_example",
                        video_url="video_url_example",
                        mini_program_schema="mini_program_schema_example",
                        exposure_url="exposure_url_example",
                        ulk_scheme="ulk_scheme_example",
                        ulk_url="ulk_url_example",
                    ),
                    huitus=[
                        1,
                    ],
                    eshop_type="eshop_type_example",
                ),
            ],
        ),
    ) # AddCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_creative_feed(add_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->add_creative_feed: %s\n" % e)
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

# **bind_recommend_reasons**
> BindRecommendReasonsResponseWrapper bind_recommend_reasons(bind_recommend_reasons_request_wrapper)



### Example


```python
import time
import baiduads
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.bind_recommend_reasons_request_wrapper import BindRecommendReasonsRequestWrapper
from baiduads.creativefeed.model.bind_recommend_reasons_response_wrapper import BindRecommendReasonsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    bind_recommend_reasons_request_wrapper = BindRecommendReasonsRequestWrapper(
        header=ApiRequestHeader(),
        body=RecommendReason(
            adgroup_feed_id=1,
            recommend_reasons=[
                "recommend_reasons_example",
            ],
            binded_reasons=[
                "binded_reasons_example",
            ],
        ),
    ) # BindRecommendReasonsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.bind_recommend_reasons(bind_recommend_reasons_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->bind_recommend_reasons: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bind_recommend_reasons_request_wrapper** | [**BindRecommendReasonsRequestWrapper**](BindRecommendReasonsRequestWrapper.md)|  |

### Return type

[**BindRecommendReasonsResponseWrapper**](BindRecommendReasonsResponseWrapper.md)

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
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.delete_creative_feed_response_wrapper import DeleteCreativeFeedResponseWrapper
from baiduads.creativefeed.model.delete_creative_feed_request_wrapper import DeleteCreativeFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    delete_creative_feed_request_wrapper = DeleteCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteCreativeFeedRequestWrapperBody(
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
        print("Exception when calling CreativeFeedService->delete_creative_feed: %s\n" % e)
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
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.get_creative_feed_response_wrapper import GetCreativeFeedResponseWrapper
from baiduads.creativefeed.model.get_creative_feed_request_wrapper import GetCreativeFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
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
        print("Exception when calling CreativeFeedService->get_creative_feed: %s\n" % e)
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

# **get_creative_feed_preview_url_with_preview_source**
> GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper get_creative_feed_preview_url_with_preview_source(get_creative_feed_preview_url_with_preview_source_request_wrapper)



### Example


```python
import time
import baiduads
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.get_creative_feed_preview_url_with_preview_source_response_wrapper import GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper
from baiduads.creativefeed.model.get_creative_feed_preview_url_with_preview_source_request_wrapper import GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    get_creative_feed_preview_url_with_preview_source_request_wrapper = GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapperBody(
            preview_feed_request=PreviewFeedRequest(
                creative_feed_id=1,
                preview_source="preview_source_example",
            ),
        ),
    ) # GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_feed_preview_url_with_preview_source(get_creative_feed_preview_url_with_preview_source_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->get_creative_feed_preview_url_with_preview_source: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_feed_preview_url_with_preview_source_request_wrapper** | [**GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper**](GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper.md)|  |

### Return type

[**GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper**](GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper.md)

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

# **get_temp_creative_feed_preview_url**
> GetTempCreativeFeedPreviewUrlResponseWrapper get_temp_creative_feed_preview_url(get_temp_creative_feed_preview_url_request_wrapper)



### Example


```python
import time
import baiduads
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.get_temp_creative_feed_preview_url_request_wrapper import GetTempCreativeFeedPreviewUrlRequestWrapper
from baiduads.creativefeed.model.get_temp_creative_feed_preview_url_response_wrapper import GetTempCreativeFeedPreviewUrlResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    get_temp_creative_feed_preview_url_request_wrapper = GetTempCreativeFeedPreviewUrlRequestWrapper(
        header=ApiRequestHeader(),
        body=GetTempCreativeFeedPreviewUrlRequestWrapperBody(
            preview_feed_types=[
                PreviewFeedType(
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    material="material_example",
                    preview_source="preview_source_example",
                    app_name="app_name_example",
                    download_url="download_url_example",
                    appid="appid_example",
                    apkname="apkname_example",
                    subject="subject_example",
                ),
            ],
        ),
    ) # GetTempCreativeFeedPreviewUrlRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_temp_creative_feed_preview_url(get_temp_creative_feed_preview_url_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->get_temp_creative_feed_preview_url: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_temp_creative_feed_preview_url_request_wrapper** | [**GetTempCreativeFeedPreviewUrlRequestWrapper**](GetTempCreativeFeedPreviewUrlRequestWrapper.md)|  |

### Return type

[**GetTempCreativeFeedPreviewUrlResponseWrapper**](GetTempCreativeFeedPreviewUrlResponseWrapper.md)

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

# **query_recommend_reasons**
> QueryRecommendReasonsResponseWrapper query_recommend_reasons(query_recommend_reasons_request_wrapper)



### Example


```python
import time
import baiduads
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.query_recommend_reasons_request_wrapper import QueryRecommendReasonsRequestWrapper
from baiduads.creativefeed.model.query_recommend_reasons_response_wrapper import QueryRecommendReasonsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    query_recommend_reasons_request_wrapper = QueryRecommendReasonsRequestWrapper(
        header=ApiRequestHeader(),
        body=RecmReasonApiRequest(
            adgroup_feed_id=1,
        ),
    ) # QueryRecommendReasonsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_recommend_reasons(query_recommend_reasons_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->query_recommend_reasons: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_recommend_reasons_request_wrapper** | [**QueryRecommendReasonsRequestWrapper**](QueryRecommendReasonsRequestWrapper.md)|  |

### Return type

[**QueryRecommendReasonsResponseWrapper**](QueryRecommendReasonsResponseWrapper.md)

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
from creativefeed.api import creative_feed_service
from baiduads.creativefeed.model.update_creative_feed_request_wrapper import UpdateCreativeFeedRequestWrapper
from baiduads.creativefeed.model.update_creative_feed_response_wrapper import UpdateCreativeFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_feed_service.CreativeFeedService(api_client)
    update_creative_feed_request_wrapper = UpdateCreativeFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateCreativeFeedRequestWrapperBody(
            creative_feed_types=[
                CreativeFeedType(
                    creative_feed_id=1,
                    adgroup_feed_id=1,
                    materialstyle=1,
                    creative_feed_name="creative_feed_name_example",
                    pause=True,
                    status=1,
                    material="material_example",
                    refusereason="refusereason_example",
                    playnum=1,
                    idea_type=1,
                    show_mt=1,
                    addtime="addtime_example",
                    approvemsgnew="approvemsgnew_example",
                    audit_time_model=AuditTimeModel(
                        idea_id=1,
                        idea_state=1,
                        start_time="start_time_example",
                        estimation_time="estimation_time_example",
                        estimation_minute=1,
                        complete_radio="complete_radio_example",
                    ),
                    attribute_list=1,
                    template=PaIdeaTemplate(
                        title="title_example",
                        subtitle="subtitle_example",
                        target_url="target_url_example",
                        monitor_url="monitor_url_example",
                        user_portrait="user_portrait_example",
                        na_url="na_url_example",
                        brand="brand_example",
                        pictures=[
                            PaPicture(
                                url="url_example",
                                target_url="target_url_example",
                                na_url="na_url_example",
                                desc1="desc1_example",
                                desc2="desc2_example",
                            ),
                        ],
                        extra_pictures=[
                            PaExtraPicture(
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
                        video_id=1,
                        duration="duration_example",
                        video_url="video_url_example",
                        mini_program_schema="mini_program_schema_example",
                        exposure_url="exposure_url_example",
                        ulk_scheme="ulk_scheme_example",
                        ulk_url="ulk_url_example",
                    ),
                    huitus=[
                        1,
                    ],
                    eshop_type="eshop_type_example",
                ),
            ],
        ),
    ) # UpdateCreativeFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_creative_feed(update_creative_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeFeedService->update_creative_feed: %s\n" % e)
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

