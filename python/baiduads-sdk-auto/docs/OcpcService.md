# baiduads.OcpcService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_target_package**](OcpcService.md#add_target_package) | **POST** /json/sms/service/OcpcService/addTargetPackage | 
[**delete_target_package**](OcpcService.md#delete_target_package) | **POST** /json/sms/service/OcpcService/deleteTargetPackage | 
[**get_hint_audit_time**](OcpcService.md#get_hint_audit_time) | **POST** /json/sms/service/OcpcService/getHintAuditTime | 
[**get_target_package_list**](OcpcService.md#get_target_package_list) | **POST** /json/sms/service/OcpcService/getTargetPackageList | 
[**update_target_package**](OcpcService.md#update_target_package) | **POST** /json/sms/service/OcpcService/updateTargetPackage | 


# **add_target_package**
> AddTargetPackageResponseWrapper add_target_package(add_target_package_request_wrapper)



### Example


```python
import time
import baiduads
from ocpc.api import ocpc_service
from baiduads.ocpc.model.add_target_package_request_wrapper import AddTargetPackageRequestWrapper
from baiduads.ocpc.model.add_target_package_response_wrapper import AddTargetPackageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_service.OcpcService(api_client)
    add_target_package_request_wrapper = AddTargetPackageRequestWrapper(
        header=ApiRequestHeader(),
        body=ModPackageRequest(
            target_package_type=[
                TargetPackageType(
                    target_package_id=1,
                    target_package_name="target_package_name_example",
                    ocpc_bid_type=1,
                    equipment_type=1,
                    ocpc_bid=3.14,
                    ecpc_max_bid_ratio=3.14,
                    scope=[
                        TargetPackageBindInfo(
                            level_id=1,
                            level=1,
                        ),
                    ],
                    data_flow_data=[
                        TargetPackageDataflowInfo(
                            data_flow=1,
                            trans_type=[
                                1,
                            ],
                        ),
                    ],
                    ocpc_stage=1,
                    adopt_no_threshold=1,
                    astat=1,
                    adopt_ocpc_bid=1,
                    wise_audit_time="wise_audit_time_example",
                    assist_trans_types=[
                        1,
                    ],
                    package_status=1,
                    ocpc_deep_cpa=3.14,
                    deep_type_stat=1,
                    deep_trans_type_mode=1,
                    cv_sources=[
                        1,
                    ],
                    trans_types=[
                        1,
                    ],
                    cv_sources_shadow=[
                        1,
                    ],
                    trans_types_shadow=[
                        1,
                    ],
                    ocpc_deep_bid=3.14,
                    shared_budget=3.14,
                    unbind_shared_budget_info=[
                        UnbindSharedBudgetInfo(
                            campaign_id=1,
                            budget=3.14,
                        ),
                    ],
                    shared_budget_id=1,
                    use_shared_budget=1,
                    trans_id=1,
                    target_roi_ratio=3.14,
                    trans_asset=1,
                    asset_type=[
                        1,
                    ],
                    trans_asset_id=1,
                    trans_asset_info=TransAssetInfo(
                        asset_type=1,
                        trans_asset_id=1,
                        cv_source={},
                        trans_name="trans_name_example",
                        trans_type={},
                        trace_type_config={},
                    ),
                ),
            ],
        ),
    ) # AddTargetPackageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_target_package(add_target_package_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcService->add_target_package: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_target_package_request_wrapper** | [**AddTargetPackageRequestWrapper**](AddTargetPackageRequestWrapper.md)|  |

### Return type

[**AddTargetPackageResponseWrapper**](AddTargetPackageResponseWrapper.md)

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

# **delete_target_package**
> DeleteTargetPackageResponseWrapper delete_target_package(delete_target_package_request_wrapper)



### Example


```python
import time
import baiduads
from ocpc.api import ocpc_service
from baiduads.ocpc.model.delete_target_package_request_wrapper import DeleteTargetPackageRequestWrapper
from baiduads.ocpc.model.delete_target_package_response_wrapper import DeleteTargetPackageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_service.OcpcService(api_client)
    delete_target_package_request_wrapper = DeleteTargetPackageRequestWrapper(
        header=ApiRequestHeader(),
        body=DelPackageRequest(
            target_package_ids=[
                1,
            ],
        ),
    ) # DeleteTargetPackageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_target_package(delete_target_package_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcService->delete_target_package: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_target_package_request_wrapper** | [**DeleteTargetPackageRequestWrapper**](DeleteTargetPackageRequestWrapper.md)|  |

### Return type

[**DeleteTargetPackageResponseWrapper**](DeleteTargetPackageResponseWrapper.md)

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

# **get_hint_audit_time**
> GetHintAuditTimeResponseWrapper get_hint_audit_time(get_hint_audit_time_request_wrapper)



### Example


```python
import time
import baiduads
from ocpc.api import ocpc_service
from baiduads.ocpc.model.get_hint_audit_time_response_wrapper import GetHintAuditTimeResponseWrapper
from baiduads.ocpc.model.get_hint_audit_time_request_wrapper import GetHintAuditTimeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_service.OcpcService(api_client)
    get_hint_audit_time_request_wrapper = GetHintAuditTimeRequestWrapper(
        header=ApiRequestHeader(),
        body=HintAuditTimeRequest(
            target_package_ids=[
                1,
            ],
        ),
    ) # GetHintAuditTimeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_hint_audit_time(get_hint_audit_time_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcService->get_hint_audit_time: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_hint_audit_time_request_wrapper** | [**GetHintAuditTimeRequestWrapper**](GetHintAuditTimeRequestWrapper.md)|  |

### Return type

[**GetHintAuditTimeResponseWrapper**](GetHintAuditTimeResponseWrapper.md)

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

# **get_target_package_list**
> GetTargetPackageListResponseWrapper get_target_package_list(get_target_package_list_request_wrapper)



### Example


```python
import time
import baiduads
from ocpc.api import ocpc_service
from baiduads.ocpc.model.get_target_package_list_response_wrapper import GetTargetPackageListResponseWrapper
from baiduads.ocpc.model.get_target_package_list_request_wrapper import GetTargetPackageListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_service.OcpcService(api_client)
    get_target_package_list_request_wrapper = GetTargetPackageListRequestWrapper(
        header=ApiRequestHeader(),
        body=PackageQueryRequest(
            target_package_type_fields=[
                "target_package_type_fields_example",
            ],
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        {},
                    ],
                ),
            ],
            sort_field="sort_field_example",
            sort_order="sort_order_example",
            ids=[
                1,
            ],
            level=1,
        ),
    ) # GetTargetPackageListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_target_package_list(get_target_package_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcService->get_target_package_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_target_package_list_request_wrapper** | [**GetTargetPackageListRequestWrapper**](GetTargetPackageListRequestWrapper.md)|  |

### Return type

[**GetTargetPackageListResponseWrapper**](GetTargetPackageListResponseWrapper.md)

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

# **update_target_package**
> UpdateTargetPackageResponseWrapper update_target_package(update_target_package_request_wrapper)



### Example


```python
import time
import baiduads
from ocpc.api import ocpc_service
from baiduads.ocpc.model.update_target_package_response_wrapper import UpdateTargetPackageResponseWrapper
from baiduads.ocpc.model.update_target_package_request_wrapper import UpdateTargetPackageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ocpc_service.OcpcService(api_client)
    update_target_package_request_wrapper = UpdateTargetPackageRequestWrapper(
        header=ApiRequestHeader(),
        body=ModPackageRequest(
            target_package_type=[
                TargetPackageType(
                    target_package_id=1,
                    target_package_name="target_package_name_example",
                    ocpc_bid_type=1,
                    equipment_type=1,
                    ocpc_bid=3.14,
                    ecpc_max_bid_ratio=3.14,
                    scope=[
                        TargetPackageBindInfo(
                            level_id=1,
                            level=1,
                        ),
                    ],
                    data_flow_data=[
                        TargetPackageDataflowInfo(
                            data_flow=1,
                            trans_type=[
                                1,
                            ],
                        ),
                    ],
                    ocpc_stage=1,
                    adopt_no_threshold=1,
                    astat=1,
                    adopt_ocpc_bid=1,
                    wise_audit_time="wise_audit_time_example",
                    assist_trans_types=[
                        1,
                    ],
                    package_status=1,
                    ocpc_deep_cpa=3.14,
                    deep_type_stat=1,
                    deep_trans_type_mode=1,
                    cv_sources=[
                        1,
                    ],
                    trans_types=[
                        1,
                    ],
                    cv_sources_shadow=[
                        1,
                    ],
                    trans_types_shadow=[
                        1,
                    ],
                    ocpc_deep_bid=3.14,
                    shared_budget=3.14,
                    unbind_shared_budget_info=[
                        UnbindSharedBudgetInfo(
                            campaign_id=1,
                            budget=3.14,
                        ),
                    ],
                    shared_budget_id=1,
                    use_shared_budget=1,
                    trans_id=1,
                    target_roi_ratio=3.14,
                    trans_asset=1,
                    asset_type=[
                        1,
                    ],
                    trans_asset_id=1,
                    trans_asset_info=TransAssetInfo(
                        asset_type=1,
                        trans_asset_id=1,
                        cv_source={},
                        trans_name="trans_name_example",
                        trans_type={},
                        trace_type_config={},
                    ),
                ),
            ],
        ),
    ) # UpdateTargetPackageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_target_package(update_target_package_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OcpcService->update_target_package: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_target_package_request_wrapper** | [**UpdateTargetPackageRequestWrapper**](UpdateTargetPackageRequestWrapper.md)|  |

### Return type

[**UpdateTargetPackageResponseWrapper**](UpdateTargetPackageResponseWrapper.md)

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

