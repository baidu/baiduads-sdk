# baiduads.SearchFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_id_name_feed**](SearchFeedService.md#get_app_id_name_feed) | **POST** /json/feed/v1/SearchFeedService/getAppIdNameFeed | 
[**get_biz_area_feed**](SearchFeedService.md#get_biz_area_feed) | **POST** /json/feed/v1/SearchFeedService/getBizAreaFeed | 
[**get_coordinate_feed**](SearchFeedService.md#get_coordinate_feed) | **POST** /json/feed/v1/SearchFeedService/getCoordinateFeed | 
[**get_media_packages**](SearchFeedService.md#get_media_packages) | **POST** /json/feed/v1/SearchFeedService/getMediaPackages | 
[**get_medias**](SearchFeedService.md#get_medias) | **POST** /json/feed/v1/SearchFeedService/getMedias | 
[**get_ocpc_trans_feed**](SearchFeedService.md#get_ocpc_trans_feed) | **POST** /json/feed/v1/SearchFeedService/getOcpcTransFeed | 
[**get_recm_word_packages_feed**](SearchFeedService.md#get_recm_word_packages_feed) | **POST** /json/feed/v1/SearchFeedService/getRecmWordPackagesFeed | 


# **get_app_id_name_feed**
> GetAppIdNameFeedResponseWrapper get_app_id_name_feed(get_app_id_name_feed_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_app_id_name_feed_response_wrapper import GetAppIdNameFeedResponseWrapper
from baiduads.searchfeed.model.get_app_id_name_feed_request_wrapper import GetAppIdNameFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_app_id_name_feed_request_wrapper = GetAppIdNameFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAppIdNameFeedRequest(
            query="query_example",
            os_type=1,
        ),
    ) # GetAppIdNameFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_app_id_name_feed(get_app_id_name_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_app_id_name_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_app_id_name_feed_request_wrapper** | [**GetAppIdNameFeedRequestWrapper**](GetAppIdNameFeedRequestWrapper.md)|  |

### Return type

[**GetAppIdNameFeedResponseWrapper**](GetAppIdNameFeedResponseWrapper.md)

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

# **get_biz_area_feed**
> GetBizAreaFeedResponseWrapper get_biz_area_feed(get_biz_area_feed_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_biz_area_feed_response_wrapper import GetBizAreaFeedResponseWrapper
from baiduads.searchfeed.model.get_biz_area_feed_request_wrapper import GetBizAreaFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_biz_area_feed_request_wrapper = GetBizAreaFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetBizAreaFeedRequest(
            cid=1,
        ),
    ) # GetBizAreaFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_biz_area_feed(get_biz_area_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_biz_area_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_biz_area_feed_request_wrapper** | [**GetBizAreaFeedRequestWrapper**](GetBizAreaFeedRequestWrapper.md)|  |

### Return type

[**GetBizAreaFeedResponseWrapper**](GetBizAreaFeedResponseWrapper.md)

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

# **get_coordinate_feed**
> GetCoordinateFeedResponseWrapper get_coordinate_feed(get_coordinate_feed_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_coordinate_feed_response_wrapper import GetCoordinateFeedResponseWrapper
from baiduads.searchfeed.model.get_coordinate_feed_request_wrapper import GetCoordinateFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_coordinate_feed_request_wrapper = GetCoordinateFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCoordinateFeedRequest(
            address="address_example",
        ),
    ) # GetCoordinateFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_coordinate_feed(get_coordinate_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_coordinate_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_coordinate_feed_request_wrapper** | [**GetCoordinateFeedRequestWrapper**](GetCoordinateFeedRequestWrapper.md)|  |

### Return type

[**GetCoordinateFeedResponseWrapper**](GetCoordinateFeedResponseWrapper.md)

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

# **get_media_packages**
> GetMediaPackagesResponseWrapper get_media_packages(get_media_packages_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_media_packages_request_wrapper import GetMediaPackagesRequestWrapper
from baiduads.searchfeed.model.get_media_packages_response_wrapper import GetMediaPackagesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_media_packages_request_wrapper = GetMediaPackagesRequestWrapper(
        header=ApiRequestHeader(),
        body=GetMediaPackageRequest(
            include_unavailable=True,
        ),
    ) # GetMediaPackagesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_media_packages(get_media_packages_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_media_packages: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_media_packages_request_wrapper** | [**GetMediaPackagesRequestWrapper**](GetMediaPackagesRequestWrapper.md)|  |

### Return type

[**GetMediaPackagesResponseWrapper**](GetMediaPackagesResponseWrapper.md)

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

# **get_medias**
> GetMediasResponseWrapper get_medias(get_medias_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_medias_request_wrapper import GetMediasRequestWrapper
from baiduads.searchfeed.model.get_medias_response_wrapper import GetMediasResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_medias_request_wrapper = GetMediasRequestWrapper(
        header=ApiRequestHeader(),
        body=SearchMediaFeedRequest(
            new_mediaids=[
                1,
            ],
        ),
    ) # GetMediasRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_medias(get_medias_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_medias: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_medias_request_wrapper** | [**GetMediasRequestWrapper**](GetMediasRequestWrapper.md)|  |

### Return type

[**GetMediasResponseWrapper**](GetMediasResponseWrapper.md)

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

# **get_ocpc_trans_feed**
> GetOcpcTransFeedResponseWrapper get_ocpc_trans_feed(get_ocpc_trans_feed_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_ocpc_trans_feed_request_wrapper import GetOcpcTransFeedRequestWrapper
from baiduads.searchfeed.model.get_ocpc_trans_feed_response_wrapper import GetOcpcTransFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_ocpc_trans_feed_request_wrapper = GetOcpcTransFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=TransTraceApiRequest(
            trans_from=1,
        ),
    ) # GetOcpcTransFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_ocpc_trans_feed(get_ocpc_trans_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_ocpc_trans_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_ocpc_trans_feed_request_wrapper** | [**GetOcpcTransFeedRequestWrapper**](GetOcpcTransFeedRequestWrapper.md)|  |

### Return type

[**GetOcpcTransFeedResponseWrapper**](GetOcpcTransFeedResponseWrapper.md)

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

# **get_recm_word_packages_feed**
> GetRecmWordPackagesFeedResponseWrapper get_recm_word_packages_feed(get_recm_word_packages_feed_request_wrapper)



### Example


```python
import time
import baiduads
from searchfeed.api import search_feed_service
from baiduads.searchfeed.model.get_recm_word_packages_feed_request_wrapper import GetRecmWordPackagesFeedRequestWrapper
from baiduads.searchfeed.model.get_recm_word_packages_feed_response_wrapper import GetRecmWordPackagesFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = search_feed_service.SearchFeedService(api_client)
    get_recm_word_packages_feed_request_wrapper = GetRecmWordPackagesFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=RecmWordsFeedRequest(
            query="query_example",
            planid=1,
            unitid=1,
        ),
    ) # GetRecmWordPackagesFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_recm_word_packages_feed(get_recm_word_packages_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SearchFeedService->get_recm_word_packages_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_recm_word_packages_feed_request_wrapper** | [**GetRecmWordPackagesFeedRequestWrapper**](GetRecmWordPackagesFeedRequestWrapper.md)|  |

### Return type

[**GetRecmWordPackagesFeedResponseWrapper**](GetRecmWordPackagesFeedResponseWrapper.md)

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

