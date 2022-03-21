# baiduads.AssetShareFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_asset_share_feed**](AssetShareFeedService.md#add_asset_share_feed) | **POST** /json/feed/v1/AssetShareFeedService/addAssetShareFeed | 


# **add_asset_share_feed**
> AddAssetShareFeedResponseWrapper add_asset_share_feed(add_asset_share_feed_request_wrapper)



### Example


```python
import time
import baiduads
from assetsharefeed.api import asset_share_feed_service
from baiduads.assetsharefeed.model.add_asset_share_feed_request_wrapper import AddAssetShareFeedRequestWrapper
from baiduads.assetsharefeed.model.add_asset_share_feed_response_wrapper import AddAssetShareFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = asset_share_feed_service.AssetShareFeedService(api_client)
    add_asset_share_feed_request_wrapper = AddAssetShareFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=AddAssetShareFeedRequestWrapperBody(
            asset_share_types=[
                AssetShareFeedType(
                    src_asset_id=1,
                    to_user_id=1,
                    type=1,
                    asset_id=1,
                    asset_name="asset_name_example",
                    asset_content="asset_content_example",
                ),
            ],
        ),
    ) # AddAssetShareFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_asset_share_feed(add_asset_share_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AssetShareFeedService->add_asset_share_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_asset_share_feed_request_wrapper** | [**AddAssetShareFeedRequestWrapper**](AddAssetShareFeedRequestWrapper.md)|  |

### Return type

[**AddAssetShareFeedResponseWrapper**](AddAssetShareFeedResponseWrapper.md)

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

