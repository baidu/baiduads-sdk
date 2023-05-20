# baiduads.CampaignService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_campaign**](CampaignService.md#add_campaign) | **POST** /json/sms/service/CampaignService/addCampaign | 
[**delete_campaign**](CampaignService.md#delete_campaign) | **POST** /json/sms/service/CampaignService/deleteCampaign | 
[**get_campaign**](CampaignService.md#get_campaign) | **POST** /json/sms/service/CampaignService/getCampaign | 
[**update_campaign**](CampaignService.md#update_campaign) | **POST** /json/sms/service/CampaignService/updateCampaign | 


# **add_campaign**
> AddCampaignResponseWrapper add_campaign(add_campaign_request_wrapper)



### Example


```python
import time
import baiduads
from campaign.api import campaign_service
from baiduads.campaign.model.add_campaign_request_wrapper import AddCampaignRequestWrapper
from baiduads.campaign.model.add_campaign_response_wrapper import AddCampaignResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_service.CampaignService(api_client)
    add_campaign_request_wrapper = AddCampaignRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCampaignAddRequest(
            campaign_types=[
                ApiCampaignType(
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    budget=3.14,
                    region_target=[
                        1,
                    ],
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    schedule=[
                        ApiScheduleType(
                            start_hour=1,
                            end_hour=1,
                            week_day=1,
                        ),
                    ],
                    budget_offline_time=[
                        ApiOfflineTimeType(
                            time="time_example",
                            flag=1,
                        ),
                    ],
                    pause=True,
                    status=1,
                    price_ratio=3.14,
                    pc_price_ratio=3.14,
                    bid_prefer=1,
                    ad_type=1,
                    business_point_id=1,
                    business_point_name="business_point_name_example",
                    smart_region=True,
                    pa_device=1,
                    os=[
                        "os_example",
                    ],
                    region_price_factor=[
                        RegionPriceFactor(
                            region_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    schedule_price_factors=[
                        SchedulePriceFactor(
                            time_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    store_page_infos=[
                        ApiStorePageInfoType(
                            store_id=1,
                            page_id=1,
                            url="url_example",
                            page_type=1,
                            monitor_code="monitor_code_example",
                            store_shop_type=1,
                            user_id=1,
                        ),
                    ],
                    marketing_target_id=1,
                    shop_type=1,
                    equipment_type=1,
                    campaign_bid_type=1,
                    campaign_bid=3.14,
                    campaign_ocpc_bid_type=1,
                    campaign_ocpc_bid=3.14,
                    campaign_trans_types=[
                        1,
                    ],
                    campaign_deep_trans_types=[
                        1,
                    ],
                    campaign_cv_sources=[
                        1,
                    ],
                    shared_budget_id=1,
                    shared_budget_name="shared_budget_name_example",
                    shared_budget=3.14,
                    budget_type=1,
                    catalog_id=1,
                    trans_asset=1,
                    trans_asset_id=1,
                ),
            ],
            ad_type=1,
        ),
    ) # AddCampaignRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_campaign(add_campaign_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignService->add_campaign: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_campaign_request_wrapper** | [**AddCampaignRequestWrapper**](AddCampaignRequestWrapper.md)|  |

### Return type

[**AddCampaignResponseWrapper**](AddCampaignResponseWrapper.md)

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

# **delete_campaign**
> DeleteCampaignResponseWrapper delete_campaign(delete_campaign_request_wrapper)



### Example


```python
import time
import baiduads
from campaign.api import campaign_service
from baiduads.campaign.model.delete_campaign_request_wrapper import DeleteCampaignRequestWrapper
from baiduads.campaign.model.delete_campaign_response_wrapper import DeleteCampaignResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_service.CampaignService(api_client)
    delete_campaign_request_wrapper = DeleteCampaignRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCampaignDelRequest(
            campaign_ids=[
                1,
            ],
        ),
    ) # DeleteCampaignRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_campaign(delete_campaign_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignService->delete_campaign: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_campaign_request_wrapper** | [**DeleteCampaignRequestWrapper**](DeleteCampaignRequestWrapper.md)|  |

### Return type

[**DeleteCampaignResponseWrapper**](DeleteCampaignResponseWrapper.md)

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

# **get_campaign**
> GetCampaignResponseWrapper get_campaign(get_campaign_request_wrapper)



### Example


```python
import time
import baiduads
from campaign.api import campaign_service
from baiduads.campaign.model.get_campaign_request_wrapper import GetCampaignRequestWrapper
from baiduads.campaign.model.get_campaign_response_wrapper import GetCampaignResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_service.CampaignService(api_client)
    get_campaign_request_wrapper = GetCampaignRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCampaignQueryRequest(
            campaign_fields=[
                "campaign_fields_example",
            ],
            campaign_ids=[
                1,
            ],
            mobile_extend=1,
            ad_type=1,
        ),
    ) # GetCampaignRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_campaign(get_campaign_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignService->get_campaign: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_campaign_request_wrapper** | [**GetCampaignRequestWrapper**](GetCampaignRequestWrapper.md)|  |

### Return type

[**GetCampaignResponseWrapper**](GetCampaignResponseWrapper.md)

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

# **update_campaign**
> UpdateCampaignResponseWrapper update_campaign(update_campaign_request_wrapper)



### Example


```python
import time
import baiduads
from campaign.api import campaign_service
from baiduads.campaign.model.update_campaign_request_wrapper import UpdateCampaignRequestWrapper
from baiduads.campaign.model.update_campaign_response_wrapper import UpdateCampaignResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_service.CampaignService(api_client)
    update_campaign_request_wrapper = UpdateCampaignRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiCampaignUpdateRequest(
            campaign_types=[
                ApiCampaignType(
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    budget=3.14,
                    region_target=[
                        1,
                    ],
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    schedule=[
                        ApiScheduleType(
                            start_hour=1,
                            end_hour=1,
                            week_day=1,
                        ),
                    ],
                    budget_offline_time=[
                        ApiOfflineTimeType(
                            time="time_example",
                            flag=1,
                        ),
                    ],
                    pause=True,
                    status=1,
                    price_ratio=3.14,
                    pc_price_ratio=3.14,
                    bid_prefer=1,
                    ad_type=1,
                    business_point_id=1,
                    business_point_name="business_point_name_example",
                    smart_region=True,
                    pa_device=1,
                    os=[
                        "os_example",
                    ],
                    region_price_factor=[
                        RegionPriceFactor(
                            region_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    schedule_price_factors=[
                        SchedulePriceFactor(
                            time_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    store_page_infos=[
                        ApiStorePageInfoType(
                            store_id=1,
                            page_id=1,
                            url="url_example",
                            page_type=1,
                            monitor_code="monitor_code_example",
                            store_shop_type=1,
                            user_id=1,
                        ),
                    ],
                    marketing_target_id=1,
                    shop_type=1,
                    equipment_type=1,
                    campaign_bid_type=1,
                    campaign_bid=3.14,
                    campaign_ocpc_bid_type=1,
                    campaign_ocpc_bid=3.14,
                    campaign_trans_types=[
                        1,
                    ],
                    campaign_deep_trans_types=[
                        1,
                    ],
                    campaign_cv_sources=[
                        1,
                    ],
                    shared_budget_id=1,
                    shared_budget_name="shared_budget_name_example",
                    shared_budget=3.14,
                    budget_type=1,
                    catalog_id=1,
                    trans_asset=1,
                    trans_asset_id=1,
                ),
            ],
        ),
    ) # UpdateCampaignRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_campaign(update_campaign_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignService->update_campaign: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_campaign_request_wrapper** | [**UpdateCampaignRequestWrapper**](UpdateCampaignRequestWrapper.md)|  |

### Return type

[**UpdateCampaignResponseWrapper**](UpdateCampaignResponseWrapper.md)

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

