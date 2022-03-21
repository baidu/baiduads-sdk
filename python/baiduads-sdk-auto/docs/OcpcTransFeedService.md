# baiduads.OcpcTransFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_ocpc_trans_feed**](OcpcTransFeedService.md#add_ocpc_trans_feed) | **POST** /json/feed/v1/OcpcTransFeedService/addOcpcTransFeed | 


# **add_ocpc_trans_feed**
> AddOcpcTransFeedResponseWrapper add_ocpc_trans_feed(add_ocpc_trans_feed_request_wrapper)



### Example


```python
import time
import baiduads
from ocpctransfeed.api import ocpc_trans_feed_service
from baiduads.ocpctransfeed.model.add_ocpc_trans_feed_request_wrapper import AddOcpcTransFeedRequestWrapper
from baiduads.ocpctransfeed.model.add_ocpc_trans_feed_response_wrapper import AddOcpcTransFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_trans_feed_service.OcpcTransFeedService(api_client)
    add_ocpc_trans_feed_request_wrapper = AddOcpcTransFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddOcpcTransFeedRequest(
            ocpc_trans_feed_types=[
                OcpcTransApiType(
                    app_trans_id=1,
                    trans_from=1,
                    trans_types=[
                        1,
                    ],
                    monitor_url="monitor_url_example",
                    lp_url="lp_url_example",
                    related_urls=[
                        "related_urls_example",
                    ],
                    trans_name="trans_name_example",
                    app_type=1,
                    download_url="download_url_example",
                    exposure_url="exposure_url_example",
                    mode=1,
                    trans_status=1,
                    deep_trans_types=[
                        1,
                    ],
                    docid=1,
                    app_name="app_name_example",
                    apk_name="apk_name_example",
                    appid=1,
                    sdk_app_id=1,
                    sdk_secret_key="sdk_secret_key_example",
                    channel_id=1,
                ),
            ],
        ),
    ) # AddOcpcTransFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_ocpc_trans_feed(add_ocpc_trans_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcTransFeedService->add_ocpc_trans_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_ocpc_trans_feed_request_wrapper** | [**AddOcpcTransFeedRequestWrapper**](AddOcpcTransFeedRequestWrapper.md)|  |

### Return type

[**AddOcpcTransFeedResponseWrapper**](AddOcpcTransFeedResponseWrapper.md)

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

