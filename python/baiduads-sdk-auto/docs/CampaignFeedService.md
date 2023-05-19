# baiduads.CampaignFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_campaign_feed**](CampaignFeedService.md#add_campaign_feed) | **POST** /json/feed/v1/CampaignFeedService/addCampaignFeed | 
[**delete_campaign_feed**](CampaignFeedService.md#delete_campaign_feed) | **POST** /json/feed/v1/CampaignFeedService/deleteCampaignFeed | 
[**get_campaign_feed**](CampaignFeedService.md#get_campaign_feed) | **POST** /json/feed/v1/CampaignFeedService/getCampaignFeed | 
[**update_campaign_feed**](CampaignFeedService.md#update_campaign_feed) | **POST** /json/feed/v1/CampaignFeedService/updateCampaignFeed | 


# **add_campaign_feed**
> AddCampaignFeedResponseWrapper add_campaign_feed(add_campaign_feed_request_wrapper)



### Example


```python
import time
import baiduads
from campaignfeed.api import campaign_feed_service
from baiduads.campaignfeed.model.add_campaign_feed_request_wrapper import AddCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.add_campaign_feed_response_wrapper import AddCampaignFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_feed_service.CampaignFeedService(api_client)
    add_campaign_feed_request_wrapper = AddCampaignFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCampaignFeedRequestWrapperBody(
            campaign_feed_types=[
                CampaignFeedType(
                    campaign_feed_id=1,
                    campaign_feed_name="campaign_feed_name_example",
                    subject=1,
                    appinfo=AppInfoType(
                        app_name="app_name_example",
                        apk_name="apk_name_example",
                        app_url="app_url_example",
                        doc_id=1,
                        channel_id=1,
                        openurl="openurl_example",
                        download_type=1,
                        app_id=1,
                    ),
                    budget=3.14,
                    starttime="starttime_example",
                    endtime="endtime_example",
                    schedule=[
                        ScheduleType(
                            week_day=1,
                            start_hour=1,
                            end_hour=1,
                        ),
                    ],
                    pause=True,
                    status=1,
                    bstype=1,
                    campaign_type=1,
                    addtime="addtime_example",
                    eshop_type="eshop_type_example",
                    shadow=AppInfoShadowType(
                        appinfo=AppInfoType(
                            app_name="app_name_example",
                            apk_name="apk_name_example",
                            app_url="app_url_example",
                            doc_id=1,
                            channel_id=1,
                            openurl="openurl_example",
                            download_type=1,
                            app_id=1,
                        ),
                        status=1,
                    ),
                    rta_status=1,
                    ftypes=[
                        1,
                    ],
                    bidtype=1,
                    bid=3.14,
                    ocpc=OcpcModel(
                        ocpc_bid=3.14,
                        trans_type=1,
                        trans_from=1,
                        app_trans_id=1,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                        trans_type_attribute=1,
                        optimize_deep_trans=True,
                    ),
                    unefficient_campaign=1,
                    bmc_user_id=1,
                    catalog_id=1,
                ),
            ],
        ),
    ) # AddCampaignFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_campaign_feed(add_campaign_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignFeedService->add_campaign_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_campaign_feed_request_wrapper** | [**AddCampaignFeedRequestWrapper**](AddCampaignFeedRequestWrapper.md)|  |

### Return type

[**AddCampaignFeedResponseWrapper**](AddCampaignFeedResponseWrapper.md)

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

# **delete_campaign_feed**
> DeleteCampaignFeedResponseWrapper delete_campaign_feed(delete_campaign_feed_request_wrapper)



### Example


```python
import time
import baiduads
from campaignfeed.api import campaign_feed_service
from baiduads.campaignfeed.model.delete_campaign_feed_request_wrapper import DeleteCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.delete_campaign_feed_response_wrapper import DeleteCampaignFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_feed_service.CampaignFeedService(api_client)
    delete_campaign_feed_request_wrapper = DeleteCampaignFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteCampaignFeedRequestWrapperBody(
            campaign_feed_ids=[
                1,
            ],
        ),
    ) # DeleteCampaignFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_campaign_feed(delete_campaign_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignFeedService->delete_campaign_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_campaign_feed_request_wrapper** | [**DeleteCampaignFeedRequestWrapper**](DeleteCampaignFeedRequestWrapper.md)|  |

### Return type

[**DeleteCampaignFeedResponseWrapper**](DeleteCampaignFeedResponseWrapper.md)

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

# **get_campaign_feed**
> GetCampaignFeedResponseWrapper get_campaign_feed(get_campaign_feed_request_wrapper)



### Example


```python
import time
import baiduads
from campaignfeed.api import campaign_feed_service
from baiduads.campaignfeed.model.get_campaign_feed_response_wrapper import GetCampaignFeedResponseWrapper
from baiduads.campaignfeed.model.get_campaign_feed_request_wrapper import GetCampaignFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_feed_service.CampaignFeedService(api_client)
    get_campaign_feed_request_wrapper = GetCampaignFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCampaignFeedRequest(
            campaign_feed_fields=[
                "campaign_feed_fields_example",
            ],
            campaign_feed_ids=[
                1,
            ],
            campaign_feed_filter=CampaignFeedFilter(
                bstype=[
                    1,
                ],
            ),
        ),
    ) # GetCampaignFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_campaign_feed(get_campaign_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignFeedService->get_campaign_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_campaign_feed_request_wrapper** | [**GetCampaignFeedRequestWrapper**](GetCampaignFeedRequestWrapper.md)|  |

### Return type

[**GetCampaignFeedResponseWrapper**](GetCampaignFeedResponseWrapper.md)

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

# **update_campaign_feed**
> UpdateCampaignFeedResponseWrapper update_campaign_feed(update_campaign_feed_request_wrapper)



### Example


```python
import time
import baiduads
from campaignfeed.api import campaign_feed_service
from baiduads.campaignfeed.model.update_campaign_feed_request_wrapper import UpdateCampaignFeedRequestWrapper
from baiduads.campaignfeed.model.update_campaign_feed_response_wrapper import UpdateCampaignFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = campaign_feed_service.CampaignFeedService(api_client)
    update_campaign_feed_request_wrapper = UpdateCampaignFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateCampaignFeedRequestWrapperBody(
            campaign_feed_types=[
                CampaignFeedType(
                    campaign_feed_id=1,
                    campaign_feed_name="campaign_feed_name_example",
                    subject=1,
                    appinfo=AppInfoType(
                        app_name="app_name_example",
                        apk_name="apk_name_example",
                        app_url="app_url_example",
                        doc_id=1,
                        channel_id=1,
                        openurl="openurl_example",
                        download_type=1,
                        app_id=1,
                    ),
                    budget=3.14,
                    starttime="starttime_example",
                    endtime="endtime_example",
                    schedule=[
                        ScheduleType(
                            week_day=1,
                            start_hour=1,
                            end_hour=1,
                        ),
                    ],
                    pause=True,
                    status=1,
                    bstype=1,
                    campaign_type=1,
                    addtime="addtime_example",
                    eshop_type="eshop_type_example",
                    shadow=AppInfoShadowType(
                        appinfo=AppInfoType(
                            app_name="app_name_example",
                            apk_name="apk_name_example",
                            app_url="app_url_example",
                            doc_id=1,
                            channel_id=1,
                            openurl="openurl_example",
                            download_type=1,
                            app_id=1,
                        ),
                        status=1,
                    ),
                    rta_status=1,
                    ftypes=[
                        1,
                    ],
                    bidtype=1,
                    bid=3.14,
                    ocpc=OcpcModel(
                        ocpc_bid=3.14,
                        trans_type=1,
                        trans_from=1,
                        app_trans_id=1,
                        deep_ocpc_bid=3.14,
                        deep_trans_type=1,
                        use_roi=True,
                        roi_ratio=3.14,
                        trans_type_attribute=1,
                        optimize_deep_trans=True,
                    ),
                    unefficient_campaign=1,
                    bmc_user_id=1,
                    catalog_id=1,
                ),
            ],
        ),
    ) # UpdateCampaignFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_campaign_feed(update_campaign_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CampaignFeedService->update_campaign_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_campaign_feed_request_wrapper** | [**UpdateCampaignFeedRequestWrapper**](UpdateCampaignFeedRequestWrapper.md)|  |

### Return type

[**UpdateCampaignFeedResponseWrapper**](UpdateCampaignFeedResponseWrapper.md)

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

