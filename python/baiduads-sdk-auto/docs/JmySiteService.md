# baiduads.JmySiteService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_page**](JmySiteService.md#create_page) | **POST** /json/sms/service/JmySiteService/createPage | 
[**delete_page**](JmySiteService.md#delete_page) | **POST** /json/sms/service/JmySiteService/deletePage | 
[**edit_page**](JmySiteService.md#edit_page) | **POST** /json/sms/service/JmySiteService/editPage | 
[**get_page_detail**](JmySiteService.md#get_page_detail) | **POST** /json/sms/service/JmySiteService/getPageDetail | 
[**get_page_list**](JmySiteService.md#get_page_list) | **POST** /json/sms/service/JmySiteService/getPageList | 
[**preview_page**](JmySiteService.md#preview_page) | **POST** /json/sms/service/JmySiteService/previewPage | 


# **create_page**
> CreatePageResponseWrapper create_page(create_page_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.create_page_request_wrapper import CreatePageRequestWrapper
from baiduads.jmysite.model.create_page_response_wrapper import CreatePageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    create_page_request_wrapper = CreatePageRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyCreatePageRequest(
            list=[
                JmyCreatePageType(
                    page_name="page_name_example",
                    alias_name="alias_name_example",
                    widgets="widgets_example",
                ),
            ],
        ),
    ) # CreatePageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_page(create_page_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->create_page: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_page_request_wrapper** | [**CreatePageRequestWrapper**](CreatePageRequestWrapper.md)|  |

### Return type

[**CreatePageResponseWrapper**](CreatePageResponseWrapper.md)

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

# **delete_page**
> DeletePageResponseWrapper delete_page(delete_page_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.delete_page_response_wrapper import DeletePageResponseWrapper
from baiduads.jmysite.model.delete_page_request_wrapper import DeletePageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    delete_page_request_wrapper = DeletePageRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyDeletePageRequest(
            page_ids=[
                1,
            ],
        ),
    ) # DeletePageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_page(delete_page_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->delete_page: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_page_request_wrapper** | [**DeletePageRequestWrapper**](DeletePageRequestWrapper.md)|  |

### Return type

[**DeletePageResponseWrapper**](DeletePageResponseWrapper.md)

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

# **edit_page**
> EditPageResponseWrapper edit_page(edit_page_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.edit_page_response_wrapper import EditPageResponseWrapper
from baiduads.jmysite.model.edit_page_request_wrapper import EditPageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    edit_page_request_wrapper = EditPageRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyEditPageRequest(
            list=[
                JmyEditPageType(
                    page_id=1,
                    alias_name="alias_name_example",
                    widgets="widgets_example",
                    page_name="page_name_example",
                ),
            ],
        ),
    ) # EditPageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.edit_page(edit_page_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->edit_page: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edit_page_request_wrapper** | [**EditPageRequestWrapper**](EditPageRequestWrapper.md)|  |

### Return type

[**EditPageResponseWrapper**](EditPageResponseWrapper.md)

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

# **get_page_detail**
> GetPageDetailResponseWrapper get_page_detail(get_page_detail_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.get_page_detail_request_wrapper import GetPageDetailRequestWrapper
from baiduads.jmysite.model.get_page_detail_response_wrapper import GetPageDetailResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    get_page_detail_request_wrapper = GetPageDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyPageDetailRequest(
            page_ids=[
                1,
            ],
        ),
    ) # GetPageDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_page_detail(get_page_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->get_page_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_page_detail_request_wrapper** | [**GetPageDetailRequestWrapper**](GetPageDetailRequestWrapper.md)|  |

### Return type

[**GetPageDetailResponseWrapper**](GetPageDetailResponseWrapper.md)

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

# **get_page_list**
> GetPageListResponseWrapper get_page_list(get_page_list_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.get_page_list_request_wrapper import GetPageListRequestWrapper
from baiduads.jmysite.model.get_page_list_response_wrapper import GetPageListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    get_page_list_request_wrapper = GetPageListRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyPageListRequest(
            page_num=1,
            page_size=1,
        ),
    ) # GetPageListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_page_list(get_page_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->get_page_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_page_list_request_wrapper** | [**GetPageListRequestWrapper**](GetPageListRequestWrapper.md)|  |

### Return type

[**GetPageListResponseWrapper**](GetPageListResponseWrapper.md)

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

# **preview_page**
> PreviewPageResponseWrapper preview_page(preview_page_request_wrapper)



### Example


```python
import time
import baiduads
from jmysite.api import jmy_site_service
from baiduads.jmysite.model.preview_page_request_wrapper import PreviewPageRequestWrapper
from baiduads.jmysite.model.preview_page_response_wrapper import PreviewPageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jmy_site_service.JmySiteService(api_client)
    preview_page_request_wrapper = PreviewPageRequestWrapper(
        header=ApiRequestHeader(),
        body=JmyPreviewPageRequest(
            page_id=1,
        ),
    ) # PreviewPageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.preview_page(preview_page_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling JmySiteService->preview_page: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preview_page_request_wrapper** | [**PreviewPageRequestWrapper**](PreviewPageRequestWrapper.md)|  |

### Return type

[**PreviewPageResponseWrapper**](PreviewPageResponseWrapper.md)

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

