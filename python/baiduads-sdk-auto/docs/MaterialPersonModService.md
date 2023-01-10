# baiduads.MaterialPersonModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_person**](MaterialPersonModService.md#add_person) | **POST** /json/sms/service/MaterialPersonModService/addPerson | 
[**delete_person**](MaterialPersonModService.md#delete_person) | **POST** /json/sms/service/MaterialPersonModService/deletePerson | 
[**update_category**](MaterialPersonModService.md#update_category) | **POST** /json/sms/service/MaterialPersonModService/updateCategory | 
[**update_person**](MaterialPersonModService.md#update_person) | **POST** /json/sms/service/MaterialPersonModService/updatePerson | 
[**update_putaway**](MaterialPersonModService.md#update_putaway) | **POST** /json/sms/service/MaterialPersonModService/updatePutaway | 
[**update_rank**](MaterialPersonModService.md#update_rank) | **POST** /json/sms/service/MaterialPersonModService/updateRank | 


# **add_person**
> AddPersonResponseWrapper add_person(add_person_request_wrapper)



### Example


```python
import time
import baiduads
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.add_person_request_wrapper import AddPersonRequestWrapper
from baiduads.materialpersonmod.model.add_person_response_wrapper import AddPersonResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    add_person_request_wrapper = AddPersonRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonAddRequest(
            name="name_example",
            profile_image="profile_image_example",
            job="job_example",
            working_years=1,
            good_at="good_at_example",
            education="education_example",
            education_background="education_background_example",
            introduction="introduction_example",
            qualification="qualification_example",
            category_id=1,
            status=1,
            trade_id=1,
            role_type=1,
            person_ext=PersonExtDto(
                represent_work="represent_work_example",
                design_concept="design_concept_example",
                construction_experience="construction_experience_example",
                prac_hospital="prac_hospital_example",
                department="department_example",
            ),
            honour="honour_example",
            gender=1,
            id_number="id_number_example",
            location="location_example",
        ),
    ) # AddPersonRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_person(add_person_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->add_person: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_person_request_wrapper** | [**AddPersonRequestWrapper**](AddPersonRequestWrapper.md)|  |

### Return type

[**AddPersonResponseWrapper**](AddPersonResponseWrapper.md)

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

# **delete_person**
> DeletePersonResponseWrapper delete_person(delete_person_request_wrapper)



### Example


```python
import time
import baiduads
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.delete_person_request_wrapper import DeletePersonRequestWrapper
from baiduads.materialpersonmod.model.delete_person_response_wrapper import DeletePersonResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    delete_person_request_wrapper = DeletePersonRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonBatchIdRequest(
            person_ids=[
                1,
            ],
        ),
    ) # DeletePersonRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_person(delete_person_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->delete_person: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_person_request_wrapper** | [**DeletePersonRequestWrapper**](DeletePersonRequestWrapper.md)|  |

### Return type

[**DeletePersonResponseWrapper**](DeletePersonResponseWrapper.md)

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
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from baiduads.materialpersonmod.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    update_category_request_wrapper = UpdateCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonBatchUpdateCategoryRequest(
            category_id=1,
            person_ids=[
                1,
            ],
        ),
    ) # UpdateCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_category(update_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->update_category: %s\n" % e)
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

# **update_person**
> UpdatePersonResponseWrapper update_person(update_person_request_wrapper)



### Example


```python
import time
import baiduads
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.update_person_response_wrapper import UpdatePersonResponseWrapper
from baiduads.materialpersonmod.model.update_person_request_wrapper import UpdatePersonRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    update_person_request_wrapper = UpdatePersonRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonUpdateRequest(
            person_id=1,
            name="name_example",
            profile_image="profile_image_example",
            job="job_example",
            working_years=1,
            good_at="good_at_example",
            education="education_example",
            education_background="education_background_example",
            introduction="introduction_example",
            qualification="qualification_example",
            category_id=1,
            status=1,
            trade_id=1,
            role_type=1,
            person_ext=PersonExtDto(
                represent_work="represent_work_example",
                design_concept="design_concept_example",
                construction_experience="construction_experience_example",
                prac_hospital="prac_hospital_example",
                department="department_example",
            ),
            honour="honour_example",
            gender=1,
            id_number="id_number_example",
            location="location_example",
        ),
    ) # UpdatePersonRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_person(update_person_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->update_person: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_person_request_wrapper** | [**UpdatePersonRequestWrapper**](UpdatePersonRequestWrapper.md)|  |

### Return type

[**UpdatePersonResponseWrapper**](UpdatePersonResponseWrapper.md)

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
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialpersonmod.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    update_putaway_request_wrapper = UpdatePutawayRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonBatchUpdatePutawayRequest(
            status=1,
            person_ids=[
                1,
            ],
        ),
    ) # UpdatePutawayRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_putaway(update_putaway_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->update_putaway: %s\n" % e)
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

# **update_rank**
> UpdateRankResponseWrapper update_rank(update_rank_request_wrapper)



### Example


```python
import time
import baiduads
from materialpersonmod.api import material_person_mod_service
from baiduads.materialpersonmod.model.update_rank_response_wrapper import UpdateRankResponseWrapper
from baiduads.materialpersonmod.model.update_rank_request_wrapper import UpdateRankRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_person_mod_service.MaterialPersonModService(api_client)
    update_rank_request_wrapper = UpdateRankRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaPersonUpdateRankRequest(
            rank=1,
            person_id=1,
        ),
    ) # UpdateRankRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_rank(update_rank_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialPersonModService->update_rank: %s\n" % e)
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

