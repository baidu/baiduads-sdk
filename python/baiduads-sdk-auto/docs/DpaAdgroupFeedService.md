# baiduads.DpaAdgroupFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_adgroup_feed**](DpaAdgroupFeedService.md#add_adgroup_feed) | **POST** /json/feed/v1/DpaAdgroupFeedService/addAdgroupFeed | 
[**delete_adgroup_feed**](DpaAdgroupFeedService.md#delete_adgroup_feed) | **POST** /json/feed/v1/DpaAdgroupFeedService/deleteAdgroupFeed | 
[**get_adgroup_feed**](DpaAdgroupFeedService.md#get_adgroup_feed) | **POST** /json/feed/v1/DpaAdgroupFeedService/getAdgroupFeed | 
[**update_adgroup_feed**](DpaAdgroupFeedService.md#update_adgroup_feed) | **POST** /json/feed/v1/DpaAdgroupFeedService/updateAdgroupFeed | 


# **add_adgroup_feed**
> AddAdgroupFeedResponseWrapper add_adgroup_feed(add_adgroup_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpaadgroupfeed.api import dpa_adgroup_feed_service
from baiduads.dpaadgroupfeed.model.add_adgroup_feed_request_wrapper import AddAdgroupFeedRequestWrapper
from baiduads.dpaadgroupfeed.model.add_adgroup_feed_response_wrapper import AddAdgroupFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_adgroup_feed_service.DpaAdgroupFeedService(api_client)
    add_adgroup_feed_request_wrapper = AddAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateAdgroupFeedRequest(
            adgroup_feed_types=[
                DpaAdgroupFeedType(
                    campaign_feed_id=1,
                    adgroup_feed_id=1,
                    adgroup_feed_name="adgroup_feed_name_example",
                    bid=3.14,
                    status=1,
                    pause=True,
                    ftypes=[
                        1,
                    ],
                    producttypes=[
                        1,
                    ],
                    product_set_id=1,
                    audience=DpaAudienceType(
                        pa_crowd="pa_crowd_example",
                        premium="premium_example",
                        pa_keywords="pa_keywords_example",
                        interests="interests_example",
                        age="age_example",
                        sex="sex_example",
                        education="education_example",
                        device="device_example",
                        net="net_example",
                        region="region_example",
                        media_categories_bind_type="media_categories_bind_type_example",
                        media_categories="media_categories_example",
                        mediaids_bind_type="mediaids_bind_type_example",
                        mediaids="mediaids_example",
                        media_package="media_package_example",
                        auto_region="auto_region_example",
                        auto_expansion="auto_expansion_example",
                        new_interests="new_interests_example",
                        custom_media_package="custom_media_package_example",
                        deep_link=True,
                        exclude_trans="exclude_trans_example",
                        custom_age="custom_age_example",
                    ),
                    bidtype=1,
                    ocpc=DpaOcpcType(
                        app_trans_id=1,
                        trans_from=1,
                        ocpc_bid=3.14,
                        lp_url="lp_url_example",
                        trans_type=1,
                        ocpc_level=1,
                        is_skip_stage_one=True,
                        pay_mode=1,
                        optimize_deep_trans=True,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                    ),
                    unit_products=UnitProducts(
                        catalog_id=1,
                        rule_products=[
                            ProductSetRule(
                                field="field_example",
                                operation="operation_example",
                                value="value_example",
                            ),
                        ],
                    ),
                ),
            ],
        ),
    ) # AddAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_adgroup_feed(add_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaAdgroupFeedService->add_adgroup_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_adgroup_feed_request_wrapper** | [**AddAdgroupFeedRequestWrapper**](AddAdgroupFeedRequestWrapper.md)|  |

### Return type

[**AddAdgroupFeedResponseWrapper**](AddAdgroupFeedResponseWrapper.md)

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

# **delete_adgroup_feed**
> DeleteAdgroupFeedResponseWrapper delete_adgroup_feed(delete_adgroup_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpaadgroupfeed.api import dpa_adgroup_feed_service
from baiduads.dpaadgroupfeed.model.delete_adgroup_feed_response_wrapper import DeleteAdgroupFeedResponseWrapper
from baiduads.dpaadgroupfeed.model.delete_adgroup_feed_request_wrapper import DeleteAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_adgroup_feed_service.DpaAdgroupFeedService(api_client)
    delete_adgroup_feed_request_wrapper = DeleteAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteAdgroupFeedRequest(
            adgroup_feed_ids=[
                1,
            ],
        ),
    ) # DeleteAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_adgroup_feed(delete_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaAdgroupFeedService->delete_adgroup_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_adgroup_feed_request_wrapper** | [**DeleteAdgroupFeedRequestWrapper**](DeleteAdgroupFeedRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupFeedResponseWrapper**](DeleteAdgroupFeedResponseWrapper.md)

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

# **get_adgroup_feed**
> GetAdgroupFeedResponseWrapper get_adgroup_feed(get_adgroup_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpaadgroupfeed.api import dpa_adgroup_feed_service
from baiduads.dpaadgroupfeed.model.get_adgroup_feed_response_wrapper import GetAdgroupFeedResponseWrapper
from baiduads.dpaadgroupfeed.model.get_adgroup_feed_request_wrapper import GetAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_adgroup_feed_service.DpaAdgroupFeedService(api_client)
    get_adgroup_feed_request_wrapper = GetAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAdgroupFeedRequest(
            adgroup_feed_fields=[
                "adgroup_feed_fields_example",
            ],
            ids=[
                1,
            ],
            id_type=1,
            adgroup_feed_filter=AdgroupFeedFilter(
                status=[
                    1,
                ],
            ),
        ),
    ) # GetAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup_feed(get_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaAdgroupFeedService->get_adgroup_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_adgroup_feed_request_wrapper** | [**GetAdgroupFeedRequestWrapper**](GetAdgroupFeedRequestWrapper.md)|  |

### Return type

[**GetAdgroupFeedResponseWrapper**](GetAdgroupFeedResponseWrapper.md)

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

# **update_adgroup_feed**
> UpdateAdgroupFeedResponseWrapper update_adgroup_feed(update_adgroup_feed_request_wrapper)



### Example


```python
import time
import baiduads
from dpaadgroupfeed.api import dpa_adgroup_feed_service
from baiduads.dpaadgroupfeed.model.update_adgroup_feed_response_wrapper import UpdateAdgroupFeedResponseWrapper
from baiduads.dpaadgroupfeed.model.update_adgroup_feed_request_wrapper import UpdateAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_adgroup_feed_service.DpaAdgroupFeedService(api_client)
    update_adgroup_feed_request_wrapper = UpdateAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateAdgroupFeedRequest(
            adgroup_feed_types=[
                DpaAdgroupFeedType(
                    campaign_feed_id=1,
                    adgroup_feed_id=1,
                    adgroup_feed_name="adgroup_feed_name_example",
                    bid=3.14,
                    status=1,
                    pause=True,
                    ftypes=[
                        1,
                    ],
                    producttypes=[
                        1,
                    ],
                    product_set_id=1,
                    audience=DpaAudienceType(
                        pa_crowd="pa_crowd_example",
                        premium="premium_example",
                        pa_keywords="pa_keywords_example",
                        interests="interests_example",
                        age="age_example",
                        sex="sex_example",
                        education="education_example",
                        device="device_example",
                        net="net_example",
                        region="region_example",
                        media_categories_bind_type="media_categories_bind_type_example",
                        media_categories="media_categories_example",
                        mediaids_bind_type="mediaids_bind_type_example",
                        mediaids="mediaids_example",
                        media_package="media_package_example",
                        auto_region="auto_region_example",
                        auto_expansion="auto_expansion_example",
                        new_interests="new_interests_example",
                        custom_media_package="custom_media_package_example",
                        deep_link=True,
                        exclude_trans="exclude_trans_example",
                        custom_age="custom_age_example",
                    ),
                    bidtype=1,
                    ocpc=DpaOcpcType(
                        app_trans_id=1,
                        trans_from=1,
                        ocpc_bid=3.14,
                        lp_url="lp_url_example",
                        trans_type=1,
                        ocpc_level=1,
                        is_skip_stage_one=True,
                        pay_mode=1,
                        optimize_deep_trans=True,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                    ),
                    unit_products=UnitProducts(
                        catalog_id=1,
                        rule_products=[
                            ProductSetRule(
                                field="field_example",
                                operation="operation_example",
                                value="value_example",
                            ),
                        ],
                    ),
                ),
            ],
        ),
    ) # UpdateAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adgroup_feed(update_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaAdgroupFeedService->update_adgroup_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_adgroup_feed_request_wrapper** | [**UpdateAdgroupFeedRequestWrapper**](UpdateAdgroupFeedRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupFeedResponseWrapper**](UpdateAdgroupFeedResponseWrapper.md)

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

