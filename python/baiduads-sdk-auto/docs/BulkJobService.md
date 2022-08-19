# baiduads.BulkJobService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_download**](BulkJobService.md#cancel_download) | **POST** /json/sms/service/BulkJobService/cancelDownload | 
[**get_all_changed_objects**](BulkJobService.md#get_all_changed_objects) | **POST** /json/sms/service/BulkJobService/getAllChangedObjects | 
[**get_all_objects**](BulkJobService.md#get_all_objects) | **POST** /json/sms/service/BulkJobService/getAllObjects | 
[**get_changed_item_id**](BulkJobService.md#get_changed_item_id) | **POST** /json/sms/service/BulkJobService/getChangedItemId | 
[**get_changed_scale**](BulkJobService.md#get_changed_scale) | **POST** /json/sms/service/BulkJobService/getChangedScale | 
[**get_file_path**](BulkJobService.md#get_file_path) | **POST** /json/sms/service/BulkJobService/getFilePath | 
[**get_file_status**](BulkJobService.md#get_file_status) | **POST** /json/sms/service/BulkJobService/getFileStatus | 


# **cancel_download**
> CancelDownloadResponseWrapper cancel_download(cancel_download_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.cancel_download_response_wrapper import CancelDownloadResponseWrapper
from baiduads.bulkjob.model.cancel_download_request_wrapper import CancelDownloadRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
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
        print("Exception when calling BulkJobService->cancel_download: %s\n" % e)
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

# **get_all_changed_objects**
> GetAllChangedObjectsResponseWrapper get_all_changed_objects(get_all_changed_objects_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_all_changed_objects_request_wrapper import GetAllChangedObjectsRequestWrapper
from baiduads.bulkjob.model.get_all_changed_objects_response_wrapper import GetAllChangedObjectsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
    get_all_changed_objects_request_wrapper = GetAllChangedObjectsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAllChangedObjectsQuery(
            start_time="start_time_example",
            need_show_q=True,
            campaign_ids=[
                1,
            ],
            include_temp=True,
            format=1,
            mobile_extend=1,
            only_bind_segments=True,
            account_fields=[
                "account_fields_example",
            ],
            campaign_fields=[
                "campaign_fields_example",
            ],
            adgroup_fields=[
                "adgroup_fields_example",
            ],
            adgroup_app_fields=[
                "adgroup_app_fields_example",
            ],
            keyword_fields=[
                "keyword_fields_example",
            ],
            creative_fields=[
                "creative_fields_example",
            ],
            segment_fields=[
                "segment_fields_example",
            ],
            url_fields=[
                "url_fields_example",
            ],
            showq_fields=[
                "showq_fields_example",
            ],
            business_label_fields=[
                "business_label_fields_example",
            ],
            auto_expansion_fields=[
                "auto_expansion_fields_example",
            ],
        ),
    ) # GetAllChangedObjectsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_all_changed_objects(get_all_changed_objects_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobService->get_all_changed_objects: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_all_changed_objects_request_wrapper** | [**GetAllChangedObjectsRequestWrapper**](GetAllChangedObjectsRequestWrapper.md)|  |

### Return type

[**GetAllChangedObjectsResponseWrapper**](GetAllChangedObjectsResponseWrapper.md)

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

# **get_all_objects**
> GetAllObjectsResponseWrapper get_all_objects(get_all_objects_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_all_objects_request_wrapper import GetAllObjectsRequestWrapper
from baiduads.bulkjob.model.get_all_objects_response_wrapper import GetAllObjectsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
    get_all_objects_request_wrapper = GetAllObjectsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAllObjectsQuery(
            campaign_ids=[
                1,
            ],
            include_temp=True,
            format=1,
            mobile_extend=1,
            only_bind_segments=True,
            account_fields=[
                "account_fields_example",
            ],
            campaign_fields=[
                "campaign_fields_example",
            ],
            adgroup_fields=[
                "adgroup_fields_example",
            ],
            adgroup_app_fields=[
                "adgroup_app_fields_example",
            ],
            keyword_fields=[
                "keyword_fields_example",
            ],
            creative_fields=[
                "creative_fields_example",
            ],
            segment_fields=[
                "segment_fields_example",
            ],
            url_fields=[
                "url_fields_example",
            ],
            showq_fields=[
                "showq_fields_example",
            ],
            business_label_fields=[
                "business_label_fields_example",
            ],
            auto_expansion_fields=[
                "auto_expansion_fields_example",
            ],
        ),
    ) # GetAllObjectsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_all_objects(get_all_objects_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobService->get_all_objects: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_all_objects_request_wrapper** | [**GetAllObjectsRequestWrapper**](GetAllObjectsRequestWrapper.md)|  |

### Return type

[**GetAllObjectsResponseWrapper**](GetAllObjectsResponseWrapper.md)

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

# **get_changed_item_id**
> GetChangedItemIdResponseWrapper get_changed_item_id(get_changed_item_id_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_changed_item_id_request_wrapper import GetChangedItemIdRequestWrapper
from baiduads.bulkjob.model.get_changed_item_id_response_wrapper import GetChangedItemIdResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
    get_changed_item_id_request_wrapper = GetChangedItemIdRequestWrapper(
        header=ApiRequestHeader(),
        body=GetChangedItemIdQuery(
            start_time="start_time_example",
            item_type=1,
            type=1,
            ids=[
                1,
            ],
            campaign_level=True,
            adgroup_level=True,
            keyword_level=True,
            creative_level=True,
            business_label_level=True,
            auto_expansion_level=True,
            campaign_feed_level=True,
            adgroup_feed_level=True,
            creative_feed_level=True,
        ),
    ) # GetChangedItemIdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_changed_item_id(get_changed_item_id_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobService->get_changed_item_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_changed_item_id_request_wrapper** | [**GetChangedItemIdRequestWrapper**](GetChangedItemIdRequestWrapper.md)|  |

### Return type

[**GetChangedItemIdResponseWrapper**](GetChangedItemIdResponseWrapper.md)

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

# **get_changed_scale**
> GetChangedScaleResponseWrapper get_changed_scale(get_changed_scale_request_wrapper)



### Example


```python
import time
import baiduads
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_changed_scale_response_wrapper import GetChangedScaleResponseWrapper
from baiduads.bulkjob.model.get_changed_scale_request_wrapper import GetChangedScaleRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
    get_changed_scale_request_wrapper = GetChangedScaleRequestWrapper(
        header=ApiRequestHeader(),
        body=GetChangedScaleQuery(
            start_time="start_time_example",
            campaign_ids=[
                1,
            ],
            changed_campaign_scale=True,
            changed_adgroup_scale=True,
            changed_keyword_scale=True,
            changed_creative_scale=True,
            changed_business_label_scale=True,
            changed_auto_expansion_scale=True,
        ),
    ) # GetChangedScaleRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_changed_scale(get_changed_scale_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BulkJobService->get_changed_scale: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_changed_scale_request_wrapper** | [**GetChangedScaleRequestWrapper**](GetChangedScaleRequestWrapper.md)|  |

### Return type

[**GetChangedScaleResponseWrapper**](GetChangedScaleResponseWrapper.md)

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
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_file_path_request_wrapper import GetFilePathRequestWrapper
from baiduads.bulkjob.model.get_file_path_response_wrapper import GetFilePathResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
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
        print("Exception when calling BulkJobService->get_file_path: %s\n" % e)
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
from bulkjob.api import bulk_job_service
from baiduads.bulkjob.model.get_file_status_request_wrapper import GetFileStatusRequestWrapper
from baiduads.bulkjob.model.get_file_status_response_wrapper import GetFileStatusResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bulk_job_service.BulkJobService(api_client)
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
        print("Exception when calling BulkJobService->get_file_status: %s\n" % e)
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

