# baiduads.CampaignShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_campaign_shopping**](CampaignShoppingService.md#add_campaign_shopping) | **POST** /json/sms/service/CampaignShoppingService/addCampaignShopping | 
[**copy_campaign_shopping**](CampaignShoppingService.md#copy_campaign_shopping) | **POST** /json/sms/service/CampaignShoppingService/copyCampaignShopping | 
[**delete_campaign_shopping**](CampaignShoppingService.md#delete_campaign_shopping) | **POST** /json/sms/service/CampaignShoppingService/deleteCampaignShopping | 
[**get_anchor**](CampaignShoppingService.md#get_anchor) | **POST** /json/sms/service/CampaignShoppingService/getAnchor | 
[**get_campaign_shopping**](CampaignShoppingService.md#get_campaign_shopping) | **POST** /json/sms/service/CampaignShoppingService/getCampaignShopping | 
[**get_interests**](CampaignShoppingService.md#get_interests) | **POST** /json/sms/service/CampaignShoppingService/getInterests | 
[**get_product**](CampaignShoppingService.md#get_product) | **POST** /json/sms/service/CampaignShoppingService/getProduct | 
[**update_campaign_shopping**](CampaignShoppingService.md#update_campaign_shopping) | **POST** /json/sms/service/CampaignShoppingService/updateCampaignShopping | 


# **add_campaign_shopping**
> AddCampaignShoppingResponseWrapper add_campaign_shopping(add_campaign_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.add_campaign_shopping_request_wrapper import AddCampaignShoppingRequestWrapper
from baiduads.campaignshopping.model.add_campaign_shopping_response_wrapper import AddCampaignShoppingResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    add_campaign_shopping_request_wrapper = AddCampaignShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCampaignRequest(
            campaign_shopping_types=[
                CampaignShoppingType(
                    campaign_shopping_id=1,
                    status=1,
                    campaign_shopping_name="campaign_shopping_name_example",
                    pause=True,
                    target_type=1,
                    eshop_type=1,
                    product_id="product_id_example",
                    product_name="product_name_example",
                    anchor_id=1,
                    budget=3.14,
                    trans_type=1,
                    ocpc_bid=3.14,
                    start_time="start_time_example",
                    end_time="end_time_example",
                    schedule=[
                        Schedule(
                            week_day=1,
                            start_hour=1,
                            end_hour=1,
                        ),
                    ],
                    audience={},
                    idea_type=1,
                    material=Material(
                        brand="brand_example",
                        user_portrait=Picture(
                            image_id=1,
                            url="url_example",
                            astat=1,
                            refuse_reason="refuse_reason_example",
                            height=1,
                            width=1,
                            element_id=1,
                        ),
                        title=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                        description=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                        pictures=[
                            Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                        ],
                        videos=[
                            Video(
                                video_id=1,
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                url="url_example",
                                height=1,
                                width=1,
                                duration=1,
                                posters=[
                                    Picture(
                                        image_id=1,
                                        url="url_example",
                                        astat=1,
                                        refuse_reason="refuse_reason_example",
                                        height=1,
                                        width=1,
                                        element_id=1,
                                    ),
                                ],
                                element_id=1,
                                diagnostic_infos=[
                                    "diagnostic_infos_example",
                                ],
                            ),
                        ],
                        broadcast_covers=[
                            Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                        ],
                        idea_id=1,
                        i_type=1,
                        astat=1,
                        fengchao_title=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                    ),
                    campaign_type=1,
                    custom_materials=[
                        Material(
                            brand="brand_example",
                            user_portrait=Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                            title=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                            description=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                            pictures=[
                                Picture(
                                    image_id=1,
                                    url="url_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    height=1,
                                    width=1,
                                    element_id=1,
                                ),
                            ],
                            videos=[
                                Video(
                                    video_id=1,
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    url="url_example",
                                    height=1,
                                    width=1,
                                    duration=1,
                                    posters=[
                                        Picture(
                                            image_id=1,
                                            url="url_example",
                                            astat=1,
                                            refuse_reason="refuse_reason_example",
                                            height=1,
                                            width=1,
                                            element_id=1,
                                        ),
                                    ],
                                    element_id=1,
                                    diagnostic_infos=[
                                        "diagnostic_infos_example",
                                    ],
                                ),
                            ],
                            broadcast_covers=[
                                Picture(
                                    image_id=1,
                                    url="url_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    height=1,
                                    width=1,
                                    element_id=1,
                                ),
                            ],
                            idea_id=1,
                            i_type=1,
                            astat=1,
                            fengchao_title=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                        ),
                    ],
                    adgroup_shopping_id=1,
                    diagnostic_label="diagnostic_label_example",
                    repay_show_status=1,
                    repay_show_desc="repay_show_desc_example",
                    promotion_url="promotion_url_example",
                ),
            ],
        ),
    ) # AddCampaignShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_campaign_shopping(add_campaign_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->add_campaign_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_campaign_shopping_request_wrapper** | [**AddCampaignShoppingRequestWrapper**](AddCampaignShoppingRequestWrapper.md)|  |

### Return type

[**AddCampaignShoppingResponseWrapper**](AddCampaignShoppingResponseWrapper.md)

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

# **copy_campaign_shopping**
> CopyCampaignShoppingResponseWrapper copy_campaign_shopping(copy_campaign_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.copy_campaign_shopping_response_wrapper import CopyCampaignShoppingResponseWrapper
from baiduads.campaignshopping.model.copy_campaign_shopping_request_wrapper import CopyCampaignShoppingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    copy_campaign_shopping_request_wrapper = CopyCampaignShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=CopyCampaignRequest(
            campaign_shopping_id=[
                1,
            ],
            copy_num=1,
        ),
    ) # CopyCampaignShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.copy_campaign_shopping(copy_campaign_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->copy_campaign_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **copy_campaign_shopping_request_wrapper** | [**CopyCampaignShoppingRequestWrapper**](CopyCampaignShoppingRequestWrapper.md)|  |

### Return type

[**CopyCampaignShoppingResponseWrapper**](CopyCampaignShoppingResponseWrapper.md)

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

# **delete_campaign_shopping**
> DeleteCampaignShoppingResponseWrapper delete_campaign_shopping(delete_campaign_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.delete_campaign_shopping_request_wrapper import DeleteCampaignShoppingRequestWrapper
from baiduads.campaignshopping.model.delete_campaign_shopping_response_wrapper import DeleteCampaignShoppingResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    delete_campaign_shopping_request_wrapper = DeleteCampaignShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteCampaignRequest(
            campaign_shopping_ids=[
                1,
            ],
        ),
    ) # DeleteCampaignShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_campaign_shopping(delete_campaign_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->delete_campaign_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_campaign_shopping_request_wrapper** | [**DeleteCampaignShoppingRequestWrapper**](DeleteCampaignShoppingRequestWrapper.md)|  |

### Return type

[**DeleteCampaignShoppingResponseWrapper**](DeleteCampaignShoppingResponseWrapper.md)

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

# **get_anchor**
> GetAnchorResponseWrapper get_anchor(get_anchor_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.get_anchor_request_wrapper import GetAnchorRequestWrapper
from baiduads.campaignshopping.model.get_anchor_response_wrapper import GetAnchorResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    get_anchor_request_wrapper = GetAnchorRequestWrapper(
        header=ApiRequestHeader(),
        body={},
    ) # GetAnchorRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_anchor(get_anchor_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->get_anchor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_anchor_request_wrapper** | [**GetAnchorRequestWrapper**](GetAnchorRequestWrapper.md)|  |

### Return type

[**GetAnchorResponseWrapper**](GetAnchorResponseWrapper.md)

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

# **get_campaign_shopping**
> GetCampaignShoppingResponseWrapper get_campaign_shopping(get_campaign_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.get_campaign_shopping_request_wrapper import GetCampaignShoppingRequestWrapper
from baiduads.campaignshopping.model.get_campaign_shopping_response_wrapper import GetCampaignShoppingResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    get_campaign_shopping_request_wrapper = GetCampaignShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCampaignShoppingRequest(
            campaign_shopping_ids=[
                1,
            ],
            sort_field="sort_field_example",
            is_desc=True,
            limit=[
                1,
            ],
            campaign_shopping_fields=[
                "campaign_shopping_fields_example",
            ],
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
        ),
    ) # GetCampaignShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_campaign_shopping(get_campaign_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->get_campaign_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_campaign_shopping_request_wrapper** | [**GetCampaignShoppingRequestWrapper**](GetCampaignShoppingRequestWrapper.md)|  |

### Return type

[**GetCampaignShoppingResponseWrapper**](GetCampaignShoppingResponseWrapper.md)

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

# **get_interests**
> GetInterestsResponseWrapper get_interests(get_interests_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.get_interests_request_wrapper import GetInterestsRequestWrapper
from baiduads.campaignshopping.model.get_interests_response_wrapper import GetInterestsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    get_interests_request_wrapper = GetInterestsRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetInterestsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_interests(get_interests_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->get_interests: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_interests_request_wrapper** | [**GetInterestsRequestWrapper**](GetInterestsRequestWrapper.md)|  |

### Return type

[**GetInterestsResponseWrapper**](GetInterestsResponseWrapper.md)

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

# **get_product**
> GetProductResponseWrapper get_product(get_product_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.get_product_response_wrapper import GetProductResponseWrapper
from baiduads.campaignshopping.model.get_product_request_wrapper import GetProductRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    get_product_request_wrapper = GetProductRequestWrapper(
        header=ApiRequestHeader(),
        body=ProductQureyRequest(
            eshop_type=1,
            limit=[
                1,
            ],
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            is_desc=True,
        ),
    ) # GetProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product(get_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->get_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_request_wrapper** | [**GetProductRequestWrapper**](GetProductRequestWrapper.md)|  |

### Return type

[**GetProductResponseWrapper**](GetProductResponseWrapper.md)

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

# **update_campaign_shopping**
> UpdateCampaignShoppingResponseWrapper update_campaign_shopping(update_campaign_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from campaignshopping.api import campaign_shopping_service
from baiduads.campaignshopping.model.update_campaign_shopping_response_wrapper import UpdateCampaignShoppingResponseWrapper
from baiduads.campaignshopping.model.update_campaign_shopping_request_wrapper import UpdateCampaignShoppingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_shopping_service.CampaignShoppingService(api_client)
    update_campaign_shopping_request_wrapper = UpdateCampaignShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=ModCampaignRequest(
            campaign_shopping_types=[
                CampaignShoppingType(
                    campaign_shopping_id=1,
                    status=1,
                    campaign_shopping_name="campaign_shopping_name_example",
                    pause=True,
                    target_type=1,
                    eshop_type=1,
                    product_id="product_id_example",
                    product_name="product_name_example",
                    anchor_id=1,
                    budget=3.14,
                    trans_type=1,
                    ocpc_bid=3.14,
                    start_time="start_time_example",
                    end_time="end_time_example",
                    schedule=[
                        Schedule(
                            week_day=1,
                            start_hour=1,
                            end_hour=1,
                        ),
                    ],
                    audience={},
                    idea_type=1,
                    material=Material(
                        brand="brand_example",
                        user_portrait=Picture(
                            image_id=1,
                            url="url_example",
                            astat=1,
                            refuse_reason="refuse_reason_example",
                            height=1,
                            width=1,
                            element_id=1,
                        ),
                        title=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                        description=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                        pictures=[
                            Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                        ],
                        videos=[
                            Video(
                                video_id=1,
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                url="url_example",
                                height=1,
                                width=1,
                                duration=1,
                                posters=[
                                    Picture(
                                        image_id=1,
                                        url="url_example",
                                        astat=1,
                                        refuse_reason="refuse_reason_example",
                                        height=1,
                                        width=1,
                                        element_id=1,
                                    ),
                                ],
                                element_id=1,
                                diagnostic_infos=[
                                    "diagnostic_infos_example",
                                ],
                            ),
                        ],
                        broadcast_covers=[
                            Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                        ],
                        idea_id=1,
                        i_type=1,
                        astat=1,
                        fengchao_title=[
                            Text(
                                text="text_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                element_id=1,
                            ),
                        ],
                    ),
                    campaign_type=1,
                    custom_materials=[
                        Material(
                            brand="brand_example",
                            user_portrait=Picture(
                                image_id=1,
                                url="url_example",
                                astat=1,
                                refuse_reason="refuse_reason_example",
                                height=1,
                                width=1,
                                element_id=1,
                            ),
                            title=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                            description=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                            pictures=[
                                Picture(
                                    image_id=1,
                                    url="url_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    height=1,
                                    width=1,
                                    element_id=1,
                                ),
                            ],
                            videos=[
                                Video(
                                    video_id=1,
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    url="url_example",
                                    height=1,
                                    width=1,
                                    duration=1,
                                    posters=[
                                        Picture(
                                            image_id=1,
                                            url="url_example",
                                            astat=1,
                                            refuse_reason="refuse_reason_example",
                                            height=1,
                                            width=1,
                                            element_id=1,
                                        ),
                                    ],
                                    element_id=1,
                                    diagnostic_infos=[
                                        "diagnostic_infos_example",
                                    ],
                                ),
                            ],
                            broadcast_covers=[
                                Picture(
                                    image_id=1,
                                    url="url_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    height=1,
                                    width=1,
                                    element_id=1,
                                ),
                            ],
                            idea_id=1,
                            i_type=1,
                            astat=1,
                            fengchao_title=[
                                Text(
                                    text="text_example",
                                    astat=1,
                                    refuse_reason="refuse_reason_example",
                                    element_id=1,
                                ),
                            ],
                        ),
                    ],
                    adgroup_shopping_id=1,
                    diagnostic_label="diagnostic_label_example",
                    repay_show_status=1,
                    repay_show_desc="repay_show_desc_example",
                    promotion_url="promotion_url_example",
                ),
            ],
        ),
    ) # UpdateCampaignShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_campaign_shopping(update_campaign_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignShoppingService->update_campaign_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_campaign_shopping_request_wrapper** | [**UpdateCampaignShoppingRequestWrapper**](UpdateCampaignShoppingRequestWrapper.md)|  |

### Return type

[**UpdateCampaignShoppingResponseWrapper**](UpdateCampaignShoppingResponseWrapper.md)

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

