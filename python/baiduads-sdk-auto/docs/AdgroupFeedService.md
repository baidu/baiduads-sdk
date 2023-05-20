# baiduads.AdgroupFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_adgroup_feed**](AdgroupFeedService.md#add_adgroup_feed) | **POST** /json/feed/v1/AdgroupFeedService/addAdgroupFeed | 
[**delete_adgroup_feed**](AdgroupFeedService.md#delete_adgroup_feed) | **POST** /json/feed/v1/AdgroupFeedService/deleteAdgroupFeed | 
[**get_adgroup_feed**](AdgroupFeedService.md#get_adgroup_feed) | **POST** /json/feed/v1/AdgroupFeedService/getAdgroupFeed | 
[**update_adgroup_feed**](AdgroupFeedService.md#update_adgroup_feed) | **POST** /json/feed/v1/AdgroupFeedService/updateAdgroupFeed | 


# **add_adgroup_feed**
> AddAdgroupFeedResponseWrapper add_adgroup_feed(add_adgroup_feed_request_wrapper)



### Example


```python
import time
import baiduads
from adgroupfeed.api import adgroup_feed_service
from baiduads.adgroupfeed.model.add_adgroup_feed_response_wrapper import AddAdgroupFeedResponseWrapper
from baiduads.adgroupfeed.model.add_adgroup_feed_request_wrapper import AddAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_feed_service.AdgroupFeedService(api_client)
    add_adgroup_feed_request_wrapper = AddAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddAdgroupFeedRequestWrapperBody(
            adgroup_feed_types=[
                AdgroupFeedType(
                    adgroup_feed_id=1,
                    campaign_feed_id=1,
                    adgroup_feed_name="adgroup_feed_name_example",
                    pause=True,
                    status=1,
                    audience={},
                    bid=3.14,
                    ftypes=[
                        1,
                    ],
                    bidtype=1,
                    ocpc=OcpcType(
                        app_trans_id=1,
                        trans_from=1,
                        ocpc_bid=3.14,
                        lp_url="lp_url_example",
                        trans_type=1,
                        optimize_deep_trans=True,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        url_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                        mini_program_type=1,
                        app_key="app_key_example",
                        page_path="page_path_example",
                        broad_cast_mode=1,
                        anchor_id=1,
                        trans_type_attribute=1,
                    ),
                    atp_feed_id=1,
                    delivery_type=[
                        1,
                    ],
                    unefficient_adgroup=1,
                    product_set_id=1,
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
                    ftype_selection=1,
                    bid_source=1,
                    url_type=1,
                    mini_program="mini_program_example",
                    broad_cast_info="broad_cast_info_example",
                    url="url_example",
                ),
            ],
        ),
    ) # AddAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_adgroup_feed(add_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupFeedService->add_adgroup_feed: %s\n" % e)
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
from adgroupfeed.api import adgroup_feed_service
from baiduads.adgroupfeed.model.delete_adgroup_feed_response_wrapper import DeleteAdgroupFeedResponseWrapper
from baiduads.adgroupfeed.model.delete_adgroup_feed_request_wrapper import DeleteAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_feed_service.AdgroupFeedService(api_client)
    delete_adgroup_feed_request_wrapper = DeleteAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteAdgroupFeedRequestWrapperBody(
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
        print("Exception when calling AdgroupFeedService->delete_adgroup_feed: %s\n" % e)
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
from adgroupfeed.api import adgroup_feed_service
from baiduads.adgroupfeed.model.get_adgroup_feed_response_wrapper import GetAdgroupFeedResponseWrapper
from baiduads.adgroupfeed.model.get_adgroup_feed_request_wrapper import GetAdgroupFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_feed_service.AdgroupFeedService(api_client)
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
        ),
    ) # GetAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup_feed(get_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupFeedService->get_adgroup_feed: %s\n" % e)
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
from adgroupfeed.api import adgroup_feed_service
from baiduads.adgroupfeed.model.update_adgroup_feed_request_wrapper import UpdateAdgroupFeedRequestWrapper
from baiduads.adgroupfeed.model.update_adgroup_feed_response_wrapper import UpdateAdgroupFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_feed_service.AdgroupFeedService(api_client)
    update_adgroup_feed_request_wrapper = UpdateAdgroupFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateAdgroupFeedRequestWrapperBody(
            adgroup_feed_types=[
                AdgroupFeedType(
                    adgroup_feed_id=1,
                    campaign_feed_id=1,
                    adgroup_feed_name="adgroup_feed_name_example",
                    pause=True,
                    status=1,
                    audience={},
                    bid=3.14,
                    ftypes=[
                        1,
                    ],
                    bidtype=1,
                    ocpc=OcpcType(
                        app_trans_id=1,
                        trans_from=1,
                        ocpc_bid=3.14,
                        lp_url="lp_url_example",
                        trans_type=1,
                        optimize_deep_trans=True,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        url_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                        mini_program_type=1,
                        app_key="app_key_example",
                        page_path="page_path_example",
                        broad_cast_mode=1,
                        anchor_id=1,
                        trans_type_attribute=1,
                    ),
                    atp_feed_id=1,
                    delivery_type=[
                        1,
                    ],
                    unefficient_adgroup=1,
                    product_set_id=1,
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
                    ftype_selection=1,
                    bid_source=1,
                    url_type=1,
                    mini_program="mini_program_example",
                    broad_cast_info="broad_cast_info_example",
                    url="url_example",
                ),
            ],
        ),
    ) # UpdateAdgroupFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adgroup_feed(update_adgroup_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupFeedService->update_adgroup_feed: %s\n" % e)
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

