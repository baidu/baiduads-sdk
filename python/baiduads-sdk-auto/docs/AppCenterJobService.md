# baiduads.AppCenterJobService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_batch_packages**](AppCenterJobService.md#add_batch_packages) | **POST** /json/sms/service/AppCenterJobService/addBatchPackages | 
[**get_batch_job_details**](AppCenterJobService.md#get_batch_job_details) | **POST** /json/sms/service/AppCenterJobService/getBatchJobDetails | 
[**get_batch_job_list_results**](AppCenterJobService.md#get_batch_job_list_results) | **POST** /json/sms/service/AppCenterJobService/getBatchJobListResults | 


# **add_batch_packages**
> AddBatchPackagesResponseWrapper add_batch_packages(add_batch_packages_request_wrapper)



### Example


```python
import time
import baiduads
from appcenterjob.api import app_center_job_service
from baiduads.appcenterjob.model.add_batch_packages_response_wrapper import AddBatchPackagesResponseWrapper
from baiduads.appcenterjob.model.add_batch_packages_request_wrapper import AddBatchPackagesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_center_job_service.AppCenterJobService(api_client)
    add_batch_packages_request_wrapper = AddBatchPackagesRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchJobRequest(
            unique_id="unique_id_example",
            job_list=[
                JobDto(
                    tp_ref_id="tp_ref_id_example",
                    package_id=1,
                    channel_name="channel_name_example",
                    package_link="package_link_example",
                    app_logo="app_logo_example",
                    app_screenshots=[
                        "app_screenshots_example",
                    ],
                    app_introduce="app_introduce_example",
                    category=1,
                    private_url="private_url_example",
                    developer_name="developer_name_example",
                    summary="summary_example",
                    copyright=[
                        "copyright_example",
                    ],
                    licence_desc="licence_desc_example",
                    video_link="video_link_example",
                    video_pass="video_pass_example",
                    test_account="test_account_example",
                    test_pwd="test_pwd_example",
                    is_commit=True,
                    auto_update=True,
                    privacy_protection_agreement=True,
                    tags=[
                        1,
                    ],
                    cate_gory_info=[
                        TreeNode(
                            id=1,
                            name="name_example",
                            children=[],
                        ),
                    ],
                ),
            ],
            from_type=1,
            if_zhuaqu=True,
        ),
    ) # AddBatchPackagesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_batch_packages(add_batch_packages_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppCenterJobService->add_batch_packages: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_batch_packages_request_wrapper** | [**AddBatchPackagesRequestWrapper**](AddBatchPackagesRequestWrapper.md)|  |

### Return type

[**AddBatchPackagesResponseWrapper**](AddBatchPackagesResponseWrapper.md)

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

# **get_batch_job_details**
> GetBatchJobDetailsResponseWrapper get_batch_job_details(get_batch_job_details_request_wrapper)



### Example


```python
import time
import baiduads
from appcenterjob.api import app_center_job_service
from baiduads.appcenterjob.model.get_batch_job_details_request_wrapper import GetBatchJobDetailsRequestWrapper
from baiduads.appcenterjob.model.get_batch_job_details_response_wrapper import GetBatchJobDetailsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_center_job_service.AppCenterJobService(api_client)
    get_batch_job_details_request_wrapper = GetBatchJobDetailsRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchJobDetailRequest(
            job_id=1,
            page_size=1,
            page_no=1,
        ),
    ) # GetBatchJobDetailsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_batch_job_details(get_batch_job_details_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppCenterJobService->get_batch_job_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_batch_job_details_request_wrapper** | [**GetBatchJobDetailsRequestWrapper**](GetBatchJobDetailsRequestWrapper.md)|  |

### Return type

[**GetBatchJobDetailsResponseWrapper**](GetBatchJobDetailsResponseWrapper.md)

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

# **get_batch_job_list_results**
> GetBatchJobListResultsResponseWrapper get_batch_job_list_results(get_batch_job_list_results_request_wrapper)



### Example


```python
import time
import baiduads
from appcenterjob.api import app_center_job_service
from baiduads.appcenterjob.model.get_batch_job_list_results_response_wrapper import GetBatchJobListResultsResponseWrapper
from baiduads.appcenterjob.model.get_batch_job_list_results_request_wrapper import GetBatchJobListResultsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_center_job_service.AppCenterJobService(api_client)
    get_batch_job_list_results_request_wrapper = GetBatchJobListResultsRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchJobQueryRequest(
            start_time="start_time_example",
            end_time="end_time_example",
            opt_type=1,
            page_size=1,
            page_no=1,
        ),
    ) # GetBatchJobListResultsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_batch_job_list_results(get_batch_job_list_results_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppCenterJobService->get_batch_job_list_results: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_batch_job_list_results_request_wrapper** | [**GetBatchJobListResultsRequestWrapper**](GetBatchJobListResultsRequestWrapper.md)|  |

### Return type

[**GetBatchJobListResultsResponseWrapper**](GetBatchJobListResultsResponseWrapper.md)

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

