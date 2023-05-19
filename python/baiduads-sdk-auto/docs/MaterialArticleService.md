# baiduads.MaterialArticleService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_article**](MaterialArticleService.md#add_article) | **POST** /json/sms/service/MaterialArticleService/addArticle | 
[**delete_article**](MaterialArticleService.md#delete_article) | **POST** /json/sms/service/MaterialArticleService/deleteArticle | 
[**get_article_list**](MaterialArticleService.md#get_article_list) | **POST** /json/sms/service/MaterialArticleService/getArticleList | 
[**update_article**](MaterialArticleService.md#update_article) | **POST** /json/sms/service/MaterialArticleService/updateArticle | 
[**update_category**](MaterialArticleService.md#update_category) | **POST** /json/sms/service/MaterialArticleService/updateCategory | 
[**update_putaway**](MaterialArticleService.md#update_putaway) | **POST** /json/sms/service/MaterialArticleService/updatePutaway | 
[**update_rank**](MaterialArticleService.md#update_rank) | **POST** /json/sms/service/MaterialArticleService/updateRank | 


# **add_article**
> AddArticleResponseWrapper add_article(add_article_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.add_article_request_wrapper import AddArticleRequestWrapper
from baiduads.materialarticle.model.add_article_response_wrapper import AddArticleResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    add_article_request_wrapper = AddArticleRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleAddRequest(
            category_id=1,
            title="title_example",
            image=[
                ArticleImage(
                    type="type_example",
                    value=[
                        ArticleImageDto(
                            url="url_example",
                        ),
                    ],
                ),
            ],
            summary="summary_example",
            content="content_example",
            tags=[
                "tags_example",
            ],
            status=1,
            trade_id=1,
            material_type=1,
            ext=ArticleExtDto(
                apartment_layout="apartment_layout_example",
                size="size_example",
                decoration_type=1,
                community_name="community_name_example",
                decoration_method=1,
                design_type="design_type_example",
                design_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                material_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                construction_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                author=AuthorInfo(
                    avatar="avatar_example",
                    name="name_example",
                ),
                detail_category=[
                    DetailCategoryDto(
                        id="id_example",
                        name="name_example",
                    ),
                ],
                article_source="article_source_example",
                article_link="article_link_example",
            ),
        ),
    ) # AddArticleRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_article(add_article_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->add_article: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_article_request_wrapper** | [**AddArticleRequestWrapper**](AddArticleRequestWrapper.md)|  |

### Return type

[**AddArticleResponseWrapper**](AddArticleResponseWrapper.md)

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

# **delete_article**
> DeleteArticleResponseWrapper delete_article(delete_article_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.delete_article_request_wrapper import DeleteArticleRequestWrapper
from baiduads.materialarticle.model.delete_article_response_wrapper import DeleteArticleResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    delete_article_request_wrapper = DeleteArticleRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleDeleteRequest(
            article_id_list=[
                1,
            ],
        ),
    ) # DeleteArticleRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_article(delete_article_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->delete_article: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_article_request_wrapper** | [**DeleteArticleRequestWrapper**](DeleteArticleRequestWrapper.md)|  |

### Return type

[**DeleteArticleResponseWrapper**](DeleteArticleResponseWrapper.md)

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

# **get_article_list**
> GetArticleListResponseWrapper get_article_list(get_article_list_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.get_article_list_request_wrapper import GetArticleListRequestWrapper
from baiduads.materialarticle.model.get_article_list_response_wrapper import GetArticleListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    get_article_list_request_wrapper = GetArticleListRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleQueryListRequest(
            article_id_list=[
                1,
            ],
            category_id_list=[
                1,
            ],
            title="title_example",
            status_list=[
                1,
            ],
            page_num=1,
            page_size=1,
            sort_list=[
                SortingRuleDto(
                    field="field_example",
                    order_by="order_by_example",
                ),
            ],
            material_type=1,
            trade_id=1,
            update_start_time="update_start_time_example",
            update_end_time="update_end_time_example",
            article_id_list_not_in=[
                1,
            ],
            content_type=1,
            content_quality_status=[
                1,
            ],
        ),
    ) # GetArticleListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_article_list(get_article_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->get_article_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_article_list_request_wrapper** | [**GetArticleListRequestWrapper**](GetArticleListRequestWrapper.md)|  |

### Return type

[**GetArticleListResponseWrapper**](GetArticleListResponseWrapper.md)

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

# **update_article**
> UpdateArticleResponseWrapper update_article(update_article_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.update_article_response_wrapper import UpdateArticleResponseWrapper
from baiduads.materialarticle.model.update_article_request_wrapper import UpdateArticleRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    update_article_request_wrapper = UpdateArticleRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleUpdateRequest(
            article_id=1,
            category_id=1,
            title="title_example",
            image=[
                ArticleImage(
                    type="type_example",
                    value=[
                        ArticleImageDto(
                            url="url_example",
                        ),
                    ],
                ),
            ],
            summary="summary_example",
            content="content_example",
            tags=[
                "tags_example",
            ],
            status=1,
            trade_id=1,
            material_type=1,
            ext=ArticleExtDto(
                apartment_layout="apartment_layout_example",
                size="size_example",
                decoration_type=1,
                community_name="community_name_example",
                decoration_method=1,
                design_type="design_type_example",
                design_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                material_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                construction_fee=CaseFee(
                    cost="cost_example",
                    unit=1,
                ),
                author=AuthorInfo(
                    avatar="avatar_example",
                    name="name_example",
                ),
                detail_category=[
                    DetailCategoryDto(
                        id="id_example",
                        name="name_example",
                    ),
                ],
                article_source="article_source_example",
                article_link="article_link_example",
            ),
        ),
    ) # UpdateArticleRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_article(update_article_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->update_article: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_article_request_wrapper** | [**UpdateArticleRequestWrapper**](UpdateArticleRequestWrapper.md)|  |

### Return type

[**UpdateArticleResponseWrapper**](UpdateArticleResponseWrapper.md)

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

# **update_category**
> UpdateCategoryResponseWrapper update_category(update_category_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from baiduads.materialarticle.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    update_category_request_wrapper = UpdateCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleUpdateCategoryRequest(
            article_id_list=[
                1,
            ],
            category_id=1,
        ),
    ) # UpdateCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_category(update_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->update_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_category_request_wrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

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

# **update_putaway**
> UpdatePutawayResponseWrapper update_putaway(update_putaway_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialarticle.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    update_putaway_request_wrapper = UpdatePutawayRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleUpdatePutawayRequest(
            article_id_list=[
                1,
            ],
            status=1,
        ),
    ) # UpdatePutawayRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_putaway(update_putaway_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->update_putaway: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_putaway_request_wrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

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

# **update_rank**
> UpdateRankResponseWrapper update_rank(update_rank_request_wrapper)



### Example


```python
import time
import baiduads
from materialarticle.api import material_article_service
from baiduads.materialarticle.model.update_rank_request_wrapper import UpdateRankRequestWrapper
from baiduads.materialarticle.model.update_rank_response_wrapper import UpdateRankResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_article_service.MaterialArticleService(api_client)
    update_rank_request_wrapper = UpdateRankRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaArticleUpdateRankRequest(
            article_id_list=[
                1,
            ],
            rank=1,
        ),
    ) # UpdateRankRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_rank(update_rank_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialArticleService->update_rank: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_rank_request_wrapper** | [**UpdateRankRequestWrapper**](UpdateRankRequestWrapper.md)|  |

### Return type

[**UpdateRankResponseWrapper**](UpdateRankResponseWrapper.md)

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

