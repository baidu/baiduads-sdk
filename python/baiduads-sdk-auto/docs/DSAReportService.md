# baiduads.DSAReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_creative_detail_report**](DSAReportService.md#get_creative_detail_report) | **POST** /json/ao/v1/DSAReportService/getCreativeDetailReport | 
[**get_creative_group_detail_report**](DSAReportService.md#get_creative_group_detail_report) | **POST** /json/ao/v1/DSAReportService/getCreativeGroupDetailReport | 
[**get_creative_group_report**](DSAReportService.md#get_creative_group_report) | **POST** /json/ao/v1/DSAReportService/getCreativeGroupReport | 
[**get_product_detail_report**](DSAReportService.md#get_product_detail_report) | **POST** /json/ao/v1/DSAReportService/getProductDetailReport | 


# **get_creative_detail_report**
> GetCreativeDetailReportResponseWrapper get_creative_detail_report(get_creative_detail_report_request_wrapper)



### Example


```python
import time
import baiduads
from dsareport.api import dsa_report_service
from baiduads.dsareport.model.get_creative_detail_report_response_wrapper import GetCreativeDetailReportResponseWrapper
from baiduads.dsareport.model.get_creative_detail_report_request_wrapper import GetCreativeDetailReportRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dsa_report_service.DSAReportService(api_client)
    get_creative_detail_report_request_wrapper = GetCreativeDetailReportRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeDetailReportRequest(
            device=1,
            plan_ids=[
                1,
            ],
            unit_ids=[
                1,
            ],
            start_time="start_time_example",
            end_time="end_time_example",
            time_dim=1,
            report_week_day=1,
            limit=1,
            offset=1,
        ),
    ) # GetCreativeDetailReportRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_detail_report(get_creative_detail_report_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DSAReportService->get_creative_detail_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_detail_report_request_wrapper** | [**GetCreativeDetailReportRequestWrapper**](GetCreativeDetailReportRequestWrapper.md)|  |

### Return type

[**GetCreativeDetailReportResponseWrapper**](GetCreativeDetailReportResponseWrapper.md)

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

# **get_creative_group_detail_report**
> GetCreativeGroupDetailReportResponseWrapper get_creative_group_detail_report(get_creative_group_detail_report_request_wrapper)



### Example


```python
import time
import baiduads
from dsareport.api import dsa_report_service
from baiduads.dsareport.model.get_creative_group_detail_report_response_wrapper import GetCreativeGroupDetailReportResponseWrapper
from baiduads.dsareport.model.get_creative_group_detail_report_request_wrapper import GetCreativeGroupDetailReportRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dsa_report_service.DSAReportService(api_client)
    get_creative_group_detail_report_request_wrapper = GetCreativeGroupDetailReportRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeGroupDetailReportRequest(
            device=1,
            plan_ids=[
                1,
            ],
            unit_ids=[
                1,
            ],
            creative_group_ids=[
                1,
            ],
            start_time="start_time_example",
            end_time="end_time_example",
            time_dim=1,
            report_week_day=1,
            limit=1,
            offset=1,
        ),
    ) # GetCreativeGroupDetailReportRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_group_detail_report(get_creative_group_detail_report_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DSAReportService->get_creative_group_detail_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_group_detail_report_request_wrapper** | [**GetCreativeGroupDetailReportRequestWrapper**](GetCreativeGroupDetailReportRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupDetailReportResponseWrapper**](GetCreativeGroupDetailReportResponseWrapper.md)

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

# **get_creative_group_report**
> GetCreativeGroupReportResponseWrapper get_creative_group_report(get_creative_group_report_request_wrapper)



### Example


```python
import time
import baiduads
from dsareport.api import dsa_report_service
from baiduads.dsareport.model.get_creative_group_report_response_wrapper import GetCreativeGroupReportResponseWrapper
from baiduads.dsareport.model.get_creative_group_report_request_wrapper import GetCreativeGroupReportRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dsa_report_service.DSAReportService(api_client)
    get_creative_group_report_request_wrapper = GetCreativeGroupReportRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCreativeGroupReportRequest(
            device=1,
            plan_ids=[
                1,
            ],
            unit_ids=[
                1,
            ],
            creative_group_ids=[
                1,
            ],
            start_time="start_time_example",
            end_time="end_time_example",
            time_dim=1,
            report_week_day=1,
            limit=1,
            offset=1,
        ),
    ) # GetCreativeGroupReportRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_group_report(get_creative_group_report_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DSAReportService->get_creative_group_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_group_report_request_wrapper** | [**GetCreativeGroupReportRequestWrapper**](GetCreativeGroupReportRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupReportResponseWrapper**](GetCreativeGroupReportResponseWrapper.md)

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

# **get_product_detail_report**
> GetProductDetailReportResponseWrapper get_product_detail_report(get_product_detail_report_request_wrapper)



### Example


```python
import time
import baiduads
from dsareport.api import dsa_report_service
from baiduads.dsareport.model.get_product_detail_report_response_wrapper import GetProductDetailReportResponseWrapper
from baiduads.dsareport.model.get_product_detail_report_request_wrapper import GetProductDetailReportRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dsa_report_service.DSAReportService(api_client)
    get_product_detail_report_request_wrapper = GetProductDetailReportRequestWrapper(
        header=ApiRequestHeader(),
        body=GetProductReportDetailRequest(
            device=1,
            plan_ids=[
                1,
            ],
            unit_ids=[
                1,
            ],
            start_time="start_time_example",
            end_time="end_time_example",
            time_dim=1,
            report_week_day=1,
            limit=1,
            offset=1,
        ),
    ) # GetProductDetailReportRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_detail_report(get_product_detail_report_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DSAReportService->get_product_detail_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_detail_report_request_wrapper** | [**GetProductDetailReportRequestWrapper**](GetProductDetailReportRequestWrapper.md)|  |

### Return type

[**GetProductDetailReportResponseWrapper**](GetProductDetailReportResponseWrapper.md)

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

