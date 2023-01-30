# baiduads.MaterialQuestionModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_question**](MaterialQuestionModService.md#add_question) | **POST** /json/sms/service/MaterialQuestionModService/addQuestion | 
[**delete_question**](MaterialQuestionModService.md#delete_question) | **POST** /json/sms/service/MaterialQuestionModService/deleteQuestion | 
[**update_category**](MaterialQuestionModService.md#update_category) | **POST** /json/sms/service/MaterialQuestionModService/updateCategory | 
[**update_putaway**](MaterialQuestionModService.md#update_putaway) | **POST** /json/sms/service/MaterialQuestionModService/updatePutaway | 
[**update_question**](MaterialQuestionModService.md#update_question) | **POST** /json/sms/service/MaterialQuestionModService/updateQuestion | 
[**update_rank**](MaterialQuestionModService.md#update_rank) | **POST** /json/sms/service/MaterialQuestionModService/updateRank | 


# **add_question**
> AddQuestionResponseWrapper add_question(add_question_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.add_question_response_wrapper import AddQuestionResponseWrapper
from baiduads.materialquestionmod.model.add_question_request_wrapper import AddQuestionRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    add_question_request_wrapper = AddQuestionRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionAddRequest(
            question="question_example",
            answer="answer_example",
            category_id=1,
            status=1,
            trade_id=1,
        ),
    ) # AddQuestionRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_question(add_question_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->add_question: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_question_request_wrapper** | [**AddQuestionRequestWrapper**](AddQuestionRequestWrapper.md)|  |

### Return type

[**AddQuestionResponseWrapper**](AddQuestionResponseWrapper.md)

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

# **delete_question**
> DeleteQuestionResponseWrapper delete_question(delete_question_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.delete_question_response_wrapper import DeleteQuestionResponseWrapper
from baiduads.materialquestionmod.model.delete_question_request_wrapper import DeleteQuestionRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    delete_question_request_wrapper = DeleteQuestionRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionBatchIdRequest(
            question_ids=[
                1,
            ],
        ),
    ) # DeleteQuestionRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_question(delete_question_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->delete_question: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_question_request_wrapper** | [**DeleteQuestionRequestWrapper**](DeleteQuestionRequestWrapper.md)|  |

### Return type

[**DeleteQuestionResponseWrapper**](DeleteQuestionResponseWrapper.md)

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

# **update_category**
> UpdateCategoryResponseWrapper update_category(update_category_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from baiduads.materialquestionmod.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    update_category_request_wrapper = UpdateCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionBatchUpdateCategoryRequest(
            category_id=1,
            question_ids=[
                1,
            ],
        ),
    ) # UpdateCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_category(update_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->update_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_category_request_wrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

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

# **update_putaway**
> UpdatePutawayResponseWrapper update_putaway(update_putaway_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialquestionmod.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    update_putaway_request_wrapper = UpdatePutawayRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionBatchUpdatePutawayRequest(
            status=1,
            question_ids=[
                1,
            ],
        ),
    ) # UpdatePutawayRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_putaway(update_putaway_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->update_putaway: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_putaway_request_wrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

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

# **update_question**
> UpdateQuestionResponseWrapper update_question(update_question_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.update_question_request_wrapper import UpdateQuestionRequestWrapper
from baiduads.materialquestionmod.model.update_question_response_wrapper import UpdateQuestionResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    update_question_request_wrapper = UpdateQuestionRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionUpdateRequest(
            question_id=1,
            question="question_example",
            answer="answer_example",
            category_id=1,
            status=1,
            trade_id=1,
        ),
    ) # UpdateQuestionRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_question(update_question_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->update_question: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_question_request_wrapper** | [**UpdateQuestionRequestWrapper**](UpdateQuestionRequestWrapper.md)|  |

### Return type

[**UpdateQuestionResponseWrapper**](UpdateQuestionResponseWrapper.md)

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

# **update_rank**
> UpdateRankResponseWrapper update_rank(update_rank_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionmod.api import material_question_mod_service
from baiduads.materialquestionmod.model.update_rank_response_wrapper import UpdateRankResponseWrapper
from baiduads.materialquestionmod.model.update_rank_request_wrapper import UpdateRankRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_mod_service.MaterialQuestionModService(api_client)
    update_rank_request_wrapper = UpdateRankRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionUpdateRankRequest(
            rank=1,
            question_id=1,
        ),
    ) # UpdateRankRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_rank(update_rank_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionModService->update_rank: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_rank_request_wrapper** | [**UpdateRankRequestWrapper**](UpdateRankRequestWrapper.md)|  |

### Return type

[**UpdateRankResponseWrapper**](UpdateRankResponseWrapper.md)

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

