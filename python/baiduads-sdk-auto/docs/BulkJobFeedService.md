# baiduads.BulkJobFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_download**](BulkJobFeedService.md#cancel_download) | **POST** /json/sms/service/BulkJobFeedService/cancelDownload | 
[**get_all_feed_objects**](BulkJobFeedService.md#get_all_feed_objects) | **POST** /json/feed/v1/BulkJobFeedService/getAllFeedObjects | 
[**get_file_path**](BulkJobFeedService.md#get_file_path) | **POST** /json/feed/v1/BulkJobFeedService/getFilePath | 
[**get_file_status**](BulkJobFeedService.md#get_file_status) | **POST** /json/feed/v1/BulkJobFeedService/getFileStatus | 


# **cancel_download**
> CancelDownloadResponseWrapper cancel_download(cancel_download_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjobfeed.api import bulk_job_feed_service
from baiduads.bulkjobfeed.model.cancel_download_response_wrapper import CancelDownloadResponseWrapper
from baiduads.bulkjobfeed.model.cancel_download_request_wrapper import CancelDownloadRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_feed_service.BulkJobFeedService(api_client)
    cancel_download_request_wrapper = CancelDownloadRequestWrapper(
        header=ApiRequestHeader(),
        body=CancelDownloadCmd(
            file_id="file_id_example",
        ),
    ) # CancelDownloadRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.cancel_download(cancel_download_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobFeedService->cancel_download: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancel_download_request_wrapper** | [**CancelDownloadRequestWrapper**](CancelDownloadRequestWrapper.md)|  |

### Return type

[**CancelDownloadResponseWrapper**](CancelDownloadResponseWrapper.md)

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

# **get_all_feed_objects**
> GetAllFeedObjectsResponseWrapper get_all_feed_objects(get_all_feed_objects_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjobfeed.api import bulk_job_feed_service
from baiduads.bulkjobfeed.model.get_all_feed_objects_request_wrapper import GetAllFeedObjectsRequestWrapper
from baiduads.bulkjobfeed.model.get_all_feed_objects_response_wrapper import GetAllFeedObjectsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_feed_service.BulkJobFeedService(api_client)
    get_all_feed_objects_request_wrapper = GetAllFeedObjectsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAllFeedObjectsQuery(
            campaign_ids=[
                1,
            ],
            format=1,
            feed_account_fields=[
                "feed_account_fields_example",
            ],
            feed_campaign_fields=[
                "feed_campaign_fields_example",
            ],
            feed_adgroup_fields=[
                "feed_adgroup_fields_example",
            ],
            feed_creative_fields=[
                "feed_creative_fields_example",
            ],
        ),
    ) # GetAllFeedObjectsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_all_feed_objects(get_all_feed_objects_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobFeedService->get_all_feed_objects: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_all_feed_objects_request_wrapper** | [**GetAllFeedObjectsRequestWrapper**](GetAllFeedObjectsRequestWrapper.md)|  |

### Return type

[**GetAllFeedObjectsResponseWrapper**](GetAllFeedObjectsResponseWrapper.md)

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

# **get_file_path**
> GetFilePathResponseWrapper get_file_path(get_file_path_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjobfeed.api import bulk_job_feed_service
from baiduads.bulkjobfeed.model.get_file_path_response_wrapper import GetFilePathResponseWrapper
from baiduads.bulkjobfeed.model.get_file_path_request_wrapper import GetFilePathRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_feed_service.BulkJobFeedService(api_client)
    get_file_path_request_wrapper = GetFilePathRequestWrapper(
        header=ApiRequestHeader(),
        body=BulkJobResultQuery(
            file_id="file_id_example",
        ),
    ) # GetFilePathRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_file_path(get_file_path_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobFeedService->get_file_path: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_file_path_request_wrapper** | [**GetFilePathRequestWrapper**](GetFilePathRequestWrapper.md)|  |

### Return type

[**GetFilePathResponseWrapper**](GetFilePathResponseWrapper.md)

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

# **get_file_status**
> GetFileStatusResponseWrapper get_file_status(get_file_status_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjobfeed.api import bulk_job_feed_service
from baiduads.bulkjobfeed.model.get_file_status_response_wrapper import GetFileStatusResponseWrapper
from baiduads.bulkjobfeed.model.get_file_status_request_wrapper import GetFileStatusRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_feed_service.BulkJobFeedService(api_client)
    get_file_status_request_wrapper = GetFileStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=BulkJobStatusQuery(
            file_id="file_id_example",
        ),
    ) # GetFileStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_file_status(get_file_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobFeedService->get_file_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_file_status_request_wrapper** | [**GetFileStatusRequestWrapper**](GetFileStatusRequestWrapper.md)|  |

### Return type

[**GetFileStatusResponseWrapper**](GetFileStatusResponseWrapper.md)

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

