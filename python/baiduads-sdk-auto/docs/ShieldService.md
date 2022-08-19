# baiduads.ShieldService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_account_exclude_ip**](ShieldService.md#add_account_exclude_ip) | **POST** /json/sms/service/ShieldService/addAccountExcludeIp | 
[**add_b_shield_policy**](ShieldService.md#add_b_shield_policy) | **POST** /json/sms/service/ShieldService/addBShieldPolicy | 
[**del_account_exclude_ip**](ShieldService.md#del_account_exclude_ip) | **POST** /json/sms/service/ShieldService/delAccountExcludeIp | 
[**delete_b_shield_black_ip**](ShieldService.md#delete_b_shield_black_ip) | **POST** /json/sms/service/ShieldService/deleteBShieldBlackIP | 
[**delete_b_shield_customer**](ShieldService.md#delete_b_shield_customer) | **POST** /json/sms/service/ShieldService/deleteBShieldCustomer | 
[**delete_b_shield_policy**](ShieldService.md#delete_b_shield_policy) | **POST** /json/sms/service/ShieldService/deleteBShieldPolicy | 
[**update_b_shield_black_ip**](ShieldService.md#update_b_shield_black_ip) | **POST** /json/sms/service/ShieldService/updateBShieldBlackIP | 
[**update_b_shield_customer**](ShieldService.md#update_b_shield_customer) | **POST** /json/sms/service/ShieldService/updateBShieldCustomer | 
[**update_policy_ipto_black_ip**](ShieldService.md#update_policy_ipto_black_ip) | **POST** /json/sms/service/ShieldService/updatePolicyIPToBlackIP | 
[**update_shield_policy**](ShieldService.md#update_shield_policy) | **POST** /json/sms/service/ShieldService/updateShieldPolicy | 


# **add_account_exclude_ip**
> AddAccountExcludeIpResponseWrapper add_account_exclude_ip(add_account_exclude_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.add_account_exclude_ip_request_wrapper import AddAccountExcludeIpRequestWrapper
from baiduads.shield.model.add_account_exclude_ip_response_wrapper import AddAccountExcludeIpResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    add_account_exclude_ip_request_wrapper = AddAccountExcludeIpRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldModRequest(
            item=ShieldType(
                user_id=1,
                click_ids=[
                    ShieldClickIdType(
                        click_id="click_id_example",
                        click_ip="click_ip_example",
                        add_time="add_time_example",
                    ),
                ],
                update_type=1,
            ),
        ),
    ) # AddAccountExcludeIpRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_account_exclude_ip(add_account_exclude_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->add_account_exclude_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_account_exclude_ip_request_wrapper** | [**AddAccountExcludeIpRequestWrapper**](AddAccountExcludeIpRequestWrapper.md)|  |

### Return type

[**AddAccountExcludeIpResponseWrapper**](AddAccountExcludeIpResponseWrapper.md)

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

# **add_b_shield_policy**
> AddBShieldPolicyResponseWrapper add_b_shield_policy(add_b_shield_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.add_b_shield_policy_response_wrapper import AddBShieldPolicyResponseWrapper
from baiduads.shield.model.add_b_shield_policy_request_wrapper import AddBShieldPolicyRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    add_b_shield_policy_request_wrapper = AddBShieldPolicyRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldPolicyModRequest(
            policy_types=[
                ShieldPolicyType(
                    policy_id=1,
                    user_id=1,
                    policy_name="policy_name_example",
                    time_slot=1,
                    threshold=1,
                    campaign_ids=[
                        1,
                    ],
                    bind_type=1,
                    policy_type=1,
                    is_del=1,
                    is_pause=1,
                    suggestion=1,
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                    anti_policy_id=1,
                ),
            ],
        ),
    ) # AddBShieldPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_b_shield_policy(add_b_shield_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->add_b_shield_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_b_shield_policy_request_wrapper** | [**AddBShieldPolicyRequestWrapper**](AddBShieldPolicyRequestWrapper.md)|  |

### Return type

[**AddBShieldPolicyResponseWrapper**](AddBShieldPolicyResponseWrapper.md)

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

# **del_account_exclude_ip**
> DelAccountExcludeIpResponseWrapper del_account_exclude_ip(del_account_exclude_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.del_account_exclude_ip_request_wrapper import DelAccountExcludeIpRequestWrapper
from baiduads.shield.model.del_account_exclude_ip_response_wrapper import DelAccountExcludeIpResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    del_account_exclude_ip_request_wrapper = DelAccountExcludeIpRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldModRequest(
            item=ShieldType(
                user_id=1,
                click_ids=[
                    ShieldClickIdType(
                        click_id="click_id_example",
                        click_ip="click_ip_example",
                        add_time="add_time_example",
                    ),
                ],
                update_type=1,
            ),
        ),
    ) # DelAccountExcludeIpRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.del_account_exclude_ip(del_account_exclude_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->del_account_exclude_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **del_account_exclude_ip_request_wrapper** | [**DelAccountExcludeIpRequestWrapper**](DelAccountExcludeIpRequestWrapper.md)|  |

### Return type

[**DelAccountExcludeIpResponseWrapper**](DelAccountExcludeIpResponseWrapper.md)

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

# **delete_b_shield_black_ip**
> DeleteBShieldBlackIPResponseWrapper delete_b_shield_black_ip(delete_b_shield_black_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.delete_b_shield_black_ip_request_wrapper import DeleteBShieldBlackIPRequestWrapper
from baiduads.shield.model.delete_b_shield_black_ip_response_wrapper import DeleteBShieldBlackIPResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    delete_b_shield_black_ip_request_wrapper = DeleteBShieldBlackIPRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldIPDelRequest(
            ids=[
                1,
            ],
            black_ips=[
                "black_ips_example",
            ],
        ),
    ) # DeleteBShieldBlackIPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_b_shield_black_ip(delete_b_shield_black_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->delete_b_shield_black_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_b_shield_black_ip_request_wrapper** | [**DeleteBShieldBlackIPRequestWrapper**](DeleteBShieldBlackIPRequestWrapper.md)|  |

### Return type

[**DeleteBShieldBlackIPResponseWrapper**](DeleteBShieldBlackIPResponseWrapper.md)

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

# **delete_b_shield_customer**
> DeleteBShieldCustomerResponseWrapper delete_b_shield_customer(delete_b_shield_customer_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.delete_b_shield_customer_response_wrapper import DeleteBShieldCustomerResponseWrapper
from baiduads.shield.model.delete_b_shield_customer_request_wrapper import DeleteBShieldCustomerRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    delete_b_shield_customer_request_wrapper = DeleteBShieldCustomerRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldCustomerDelRequest(
            ids=[
                1,
            ],
            custom_ids=[
                "custom_ids_example",
            ],
        ),
    ) # DeleteBShieldCustomerRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_b_shield_customer(delete_b_shield_customer_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->delete_b_shield_customer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_b_shield_customer_request_wrapper** | [**DeleteBShieldCustomerRequestWrapper**](DeleteBShieldCustomerRequestWrapper.md)|  |

### Return type

[**DeleteBShieldCustomerResponseWrapper**](DeleteBShieldCustomerResponseWrapper.md)

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

# **delete_b_shield_policy**
> DeleteBShieldPolicyResponseWrapper delete_b_shield_policy(delete_b_shield_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.delete_b_shield_policy_response_wrapper import DeleteBShieldPolicyResponseWrapper
from baiduads.shield.model.delete_b_shield_policy_request_wrapper import DeleteBShieldPolicyRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    delete_b_shield_policy_request_wrapper = DeleteBShieldPolicyRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldPolicyDelRequest(
            policy_ids=[
                1,
            ],
        ),
    ) # DeleteBShieldPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_b_shield_policy(delete_b_shield_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->delete_b_shield_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_b_shield_policy_request_wrapper** | [**DeleteBShieldPolicyRequestWrapper**](DeleteBShieldPolicyRequestWrapper.md)|  |

### Return type

[**DeleteBShieldPolicyResponseWrapper**](DeleteBShieldPolicyResponseWrapper.md)

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

# **update_b_shield_black_ip**
> UpdateBShieldBlackIPResponseWrapper update_b_shield_black_ip(update_b_shield_black_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.update_b_shield_black_ip_response_wrapper import UpdateBShieldBlackIPResponseWrapper
from baiduads.shield.model.update_b_shield_black_ip_request_wrapper import UpdateBShieldBlackIPRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    update_b_shield_black_ip_request_wrapper = UpdateBShieldBlackIPRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldIPModRequest(
            black_ip_types=[
                ShieldBlackIPType(
                    id=1,
                    user_id=1,
                    ip="ip_example",
                    hit_policy="hit_policy_example",
                    shield_type=1,
                    shield_num=1,
                    identity_user="identity_user_example",
                    identity_system="identity_system_example",
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                ),
            ],
        ),
    ) # UpdateBShieldBlackIPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_b_shield_black_ip(update_b_shield_black_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->update_b_shield_black_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_b_shield_black_ip_request_wrapper** | [**UpdateBShieldBlackIPRequestWrapper**](UpdateBShieldBlackIPRequestWrapper.md)|  |

### Return type

[**UpdateBShieldBlackIPResponseWrapper**](UpdateBShieldBlackIPResponseWrapper.md)

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

# **update_b_shield_customer**
> UpdateBShieldCustomerResponseWrapper update_b_shield_customer(update_b_shield_customer_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.update_b_shield_customer_response_wrapper import UpdateBShieldCustomerResponseWrapper
from baiduads.shield.model.update_b_shield_customer_request_wrapper import UpdateBShieldCustomerRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    update_b_shield_customer_request_wrapper = UpdateBShieldCustomerRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldCustomerModRequest(
            customer_types=[
                ShieldCustomerType(
                    id=1,
                    user_id=1,
                    custom_id="custom_id_example",
                    hit_policy="hit_policy_example",
                    ip_list="ip_list_example",
                    device_type=1,
                    shield_type=1,
                    shield_num=1,
                    identity_user="identity_user_example",
                    identity_system="identity_system_example",
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                ),
            ],
        ),
    ) # UpdateBShieldCustomerRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_b_shield_customer(update_b_shield_customer_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->update_b_shield_customer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_b_shield_customer_request_wrapper** | [**UpdateBShieldCustomerRequestWrapper**](UpdateBShieldCustomerRequestWrapper.md)|  |

### Return type

[**UpdateBShieldCustomerResponseWrapper**](UpdateBShieldCustomerResponseWrapper.md)

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

# **update_policy_ipto_black_ip**
> UpdatePolicyIPToBlackIPResponseWrapper update_policy_ipto_black_ip(update_policy_ipto_black_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.update_policy_ipto_black_ip_request_wrapper import UpdatePolicyIPToBlackIPRequestWrapper
from baiduads.shield.model.update_policy_ipto_black_ip_response_wrapper import UpdatePolicyIPToBlackIPResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    update_policy_ipto_black_ip_request_wrapper = UpdatePolicyIPToBlackIPRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldIPModRequest(
            black_ip_types=[
                ShieldBlackIPType(
                    id=1,
                    user_id=1,
                    ip="ip_example",
                    hit_policy="hit_policy_example",
                    shield_type=1,
                    shield_num=1,
                    identity_user="identity_user_example",
                    identity_system="identity_system_example",
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                ),
            ],
        ),
    ) # UpdatePolicyIPToBlackIPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_policy_ipto_black_ip(update_policy_ipto_black_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->update_policy_ipto_black_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_policy_ipto_black_ip_request_wrapper** | [**UpdatePolicyIPToBlackIPRequestWrapper**](UpdatePolicyIPToBlackIPRequestWrapper.md)|  |

### Return type

[**UpdatePolicyIPToBlackIPResponseWrapper**](UpdatePolicyIPToBlackIPResponseWrapper.md)

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

# **update_shield_policy**
> UpdateShieldPolicyResponseWrapper update_shield_policy(update_shield_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shield.api import shield_service
from baiduads.shield.model.update_shield_policy_request_wrapper import UpdateShieldPolicyRequestWrapper
from baiduads.shield.model.update_shield_policy_response_wrapper import UpdateShieldPolicyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_service.ShieldService(api_client)
    update_shield_policy_request_wrapper = UpdateShieldPolicyRequestWrapper(
        header=ApiRequestHeader(),
        body=ShieldPolicyModRequest(
            policy_types=[
                ShieldPolicyType(
                    policy_id=1,
                    user_id=1,
                    policy_name="policy_name_example",
                    time_slot=1,
                    threshold=1,
                    campaign_ids=[
                        1,
                    ],
                    bind_type=1,
                    policy_type=1,
                    is_del=1,
                    is_pause=1,
                    suggestion=1,
                    add_time="add_time_example",
                    mod_time="mod_time_example",
                    anti_policy_id=1,
                ),
            ],
        ),
    ) # UpdateShieldPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_shield_policy(update_shield_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldService->update_shield_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_shield_policy_request_wrapper** | [**UpdateShieldPolicyRequestWrapper**](UpdateShieldPolicyRequestWrapper.md)|  |

### Return type

[**UpdateShieldPolicyResponseWrapper**](UpdateShieldPolicyResponseWrapper.md)

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

