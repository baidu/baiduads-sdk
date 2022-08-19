# baiduads.ShieldFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_ip_black_manual**](ShieldFunction.md#add_ip_black_manual) | **POST** /json/sms/service/ShieldFunction/addIPBlackManual | 
[**delete_ip_black_manual**](ShieldFunction.md#delete_ip_black_manual) | **POST** /json/sms/service/ShieldFunction/deleteIPBlackManual | 
[**get_hit_black_ip_policy**](ShieldFunction.md#get_hit_black_ip_policy) | **POST** /json/sms/service/ShieldFunction/getHitBlackIPPolicy | 
[**get_hit_customer_policy**](ShieldFunction.md#get_hit_customer_policy) | **POST** /json/sms/service/ShieldFunction/getHitCustomerPolicy | 
[**get_ip_black_manual**](ShieldFunction.md#get_ip_black_manual) | **POST** /json/sms/service/ShieldFunction/getIPBlackManual | 
[**get_shield_black_ip**](ShieldFunction.md#get_shield_black_ip) | **POST** /json/sms/service/ShieldFunction/getShieldBlackIP | 
[**get_shield_customer**](ShieldFunction.md#get_shield_customer) | **POST** /json/sms/service/ShieldFunction/getShieldCustomer | 
[**get_shield_policy**](ShieldFunction.md#get_shield_policy) | **POST** /json/sms/service/ShieldFunction/getShieldPolicy | 
[**get_user_diagnose_detail**](ShieldFunction.md#get_user_diagnose_detail) | **POST** /json/sms/service/ShieldFunction/getUserDiagnoseDetail | 
[**get_user_diagnose_info**](ShieldFunction.md#get_user_diagnose_info) | **POST** /json/sms/service/ShieldFunction/getUserDiagnoseInfo | 
[**update_adv_ip_black_manual**](ShieldFunction.md#update_adv_ip_black_manual) | **POST** /json/sms/service/ShieldFunction/updateAdvIPBlackManual | 
[**update_ip_black_manual**](ShieldFunction.md#update_ip_black_manual) | **POST** /json/sms/service/ShieldFunction/updateIPBlackManual | 


# **add_ip_black_manual**
> AddIPBlackManualResponseWrapper add_ip_black_manual(add_ip_black_manual_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.add_ip_black_manual_response_wrapper import AddIPBlackManualResponseWrapper
from baiduads.shieldfunction.model.add_ip_black_manual_request_wrapper import AddIPBlackManualRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    add_ip_black_manual_request_wrapper = AddIPBlackManualRequestWrapper(
        header=ApiRequestHeader(),
        body=AddIPBlackManualRequest(
            ip_black=[
                "ip_black_example",
            ],
        ),
    ) # AddIPBlackManualRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_ip_black_manual(add_ip_black_manual_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->add_ip_black_manual: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_ip_black_manual_request_wrapper** | [**AddIPBlackManualRequestWrapper**](AddIPBlackManualRequestWrapper.md)|  |

### Return type

[**AddIPBlackManualResponseWrapper**](AddIPBlackManualResponseWrapper.md)

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

# **delete_ip_black_manual**
> DeleteIPBlackManualResponseWrapper delete_ip_black_manual(delete_ip_black_manual_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.delete_ip_black_manual_response_wrapper import DeleteIPBlackManualResponseWrapper
from baiduads.shieldfunction.model.delete_ip_black_manual_request_wrapper import DeleteIPBlackManualRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    delete_ip_black_manual_request_wrapper = DeleteIPBlackManualRequestWrapper(
        header=ApiRequestHeader(),
        body=DelIPBlackManualRequest(
            ip_black=[
                "ip_black_example",
            ],
        ),
    ) # DeleteIPBlackManualRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_ip_black_manual(delete_ip_black_manual_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->delete_ip_black_manual: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_ip_black_manual_request_wrapper** | [**DeleteIPBlackManualRequestWrapper**](DeleteIPBlackManualRequestWrapper.md)|  |

### Return type

[**DeleteIPBlackManualResponseWrapper**](DeleteIPBlackManualResponseWrapper.md)

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

# **get_hit_black_ip_policy**
> GetHitBlackIPPolicyResponseWrapper get_hit_black_ip_policy(get_hit_black_ip_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_hit_black_ip_policy_request_wrapper import GetHitBlackIPPolicyRequestWrapper
from baiduads.shieldfunction.model.get_hit_black_ip_policy_response_wrapper import GetHitBlackIPPolicyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_hit_black_ip_policy_request_wrapper = GetHitBlackIPPolicyRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetHitBlackIPPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_hit_black_ip_policy(get_hit_black_ip_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_hit_black_ip_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_hit_black_ip_policy_request_wrapper** | [**GetHitBlackIPPolicyRequestWrapper**](GetHitBlackIPPolicyRequestWrapper.md)|  |

### Return type

[**GetHitBlackIPPolicyResponseWrapper**](GetHitBlackIPPolicyResponseWrapper.md)

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

# **get_hit_customer_policy**
> GetHitCustomerPolicyResponseWrapper get_hit_customer_policy(get_hit_customer_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_hit_customer_policy_request_wrapper import GetHitCustomerPolicyRequestWrapper
from baiduads.shieldfunction.model.get_hit_customer_policy_response_wrapper import GetHitCustomerPolicyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_hit_customer_policy_request_wrapper = GetHitCustomerPolicyRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetHitCustomerPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_hit_customer_policy(get_hit_customer_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_hit_customer_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_hit_customer_policy_request_wrapper** | [**GetHitCustomerPolicyRequestWrapper**](GetHitCustomerPolicyRequestWrapper.md)|  |

### Return type

[**GetHitCustomerPolicyResponseWrapper**](GetHitCustomerPolicyResponseWrapper.md)

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

# **get_ip_black_manual**
> GetIPBlackManualResponseWrapper get_ip_black_manual(get_ip_black_manual_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_ip_black_manual_request_wrapper import GetIPBlackManualRequestWrapper
from baiduads.shieldfunction.model.get_ip_black_manual_response_wrapper import GetIPBlackManualResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_ip_black_manual_request_wrapper = GetIPBlackManualRequestWrapper(
        header=ApiRequestHeader(),
        body=GetIPBlackManualRequest(
            sort_field="sort_field_example",
            is_desc=True,
            condition=IPBlackManualCondition(
                iplike="iplike_example",
            ),
            limit=[
                1,
            ],
        ),
    ) # GetIPBlackManualRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_ip_black_manual(get_ip_black_manual_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_ip_black_manual: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_ip_black_manual_request_wrapper** | [**GetIPBlackManualRequestWrapper**](GetIPBlackManualRequestWrapper.md)|  |

### Return type

[**GetIPBlackManualResponseWrapper**](GetIPBlackManualResponseWrapper.md)

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

# **get_shield_black_ip**
> GetShieldBlackIPResponseWrapper get_shield_black_ip(get_shield_black_ip_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_shield_black_ip_response_wrapper import GetShieldBlackIPResponseWrapper
from baiduads.shieldfunction.model.get_shield_black_ip_request_wrapper import GetShieldBlackIPRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_shield_black_ip_request_wrapper = GetShieldBlackIPRequestWrapper(
        header=ApiRequestHeader(),
        body=GetShieldBlackIPRequest(
            sort_field="sort_field_example",
            is_desc=True,
            condition=ShieldCondition(
                policy_ids=[
                    1,
                ],
                policy_name="policy_name_example",
                is_del=True,
                policy_type=1,
                iplike="iplike_example",
            ),
            limit=[
                1,
            ],
        ),
    ) # GetShieldBlackIPRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_shield_black_ip(get_shield_black_ip_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_shield_black_ip: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_shield_black_ip_request_wrapper** | [**GetShieldBlackIPRequestWrapper**](GetShieldBlackIPRequestWrapper.md)|  |

### Return type

[**GetShieldBlackIPResponseWrapper**](GetShieldBlackIPResponseWrapper.md)

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

# **get_shield_customer**
> GetShieldCustomerResponseWrapper get_shield_customer(get_shield_customer_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_shield_customer_request_wrapper import GetShieldCustomerRequestWrapper
from baiduads.shieldfunction.model.get_shield_customer_response_wrapper import GetShieldCustomerResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_shield_customer_request_wrapper = GetShieldCustomerRequestWrapper(
        header=ApiRequestHeader(),
        body=GetShieldCustomerRequest(
            sort_field="sort_field_example",
            is_desc=True,
            condition=ShieldCondition(
                policy_ids=[
                    1,
                ],
                policy_name="policy_name_example",
                is_del=True,
                policy_type=1,
                iplike="iplike_example",
            ),
            limit=[
                1,
            ],
        ),
    ) # GetShieldCustomerRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_shield_customer(get_shield_customer_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_shield_customer: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_shield_customer_request_wrapper** | [**GetShieldCustomerRequestWrapper**](GetShieldCustomerRequestWrapper.md)|  |

### Return type

[**GetShieldCustomerResponseWrapper**](GetShieldCustomerResponseWrapper.md)

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

# **get_shield_policy**
> GetShieldPolicyResponseWrapper get_shield_policy(get_shield_policy_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_shield_policy_response_wrapper import GetShieldPolicyResponseWrapper
from baiduads.shieldfunction.model.get_shield_policy_request_wrapper import GetShieldPolicyRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_shield_policy_request_wrapper = GetShieldPolicyRequestWrapper(
        header=ApiRequestHeader(),
        body=GetShieldPolicyRequest(
            sort_field="sort_field_example",
            is_desc=True,
            condition=ShieldCondition(
                policy_ids=[
                    1,
                ],
                policy_name="policy_name_example",
                is_del=True,
                policy_type=1,
                iplike="iplike_example",
            ),
            limit=[
                1,
            ],
        ),
    ) # GetShieldPolicyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_shield_policy(get_shield_policy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_shield_policy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_shield_policy_request_wrapper** | [**GetShieldPolicyRequestWrapper**](GetShieldPolicyRequestWrapper.md)|  |

### Return type

[**GetShieldPolicyResponseWrapper**](GetShieldPolicyResponseWrapper.md)

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

# **get_user_diagnose_detail**
> GetUserDiagnoseDetailResponseWrapper get_user_diagnose_detail(get_user_diagnose_detail_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_user_diagnose_detail_response_wrapper import GetUserDiagnoseDetailResponseWrapper
from baiduads.shieldfunction.model.get_user_diagnose_detail_request_wrapper import GetUserDiagnoseDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_user_diagnose_detail_request_wrapper = GetUserDiagnoseDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=DiagnoseDetailRequest(
            type=1,
        ),
    ) # GetUserDiagnoseDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_user_diagnose_detail(get_user_diagnose_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_user_diagnose_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_user_diagnose_detail_request_wrapper** | [**GetUserDiagnoseDetailRequestWrapper**](GetUserDiagnoseDetailRequestWrapper.md)|  |

### Return type

[**GetUserDiagnoseDetailResponseWrapper**](GetUserDiagnoseDetailResponseWrapper.md)

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

# **get_user_diagnose_info**
> GetUserDiagnoseInfoResponseWrapper get_user_diagnose_info(get_user_diagnose_info_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.get_user_diagnose_info_response_wrapper import GetUserDiagnoseInfoResponseWrapper
from baiduads.shieldfunction.model.get_user_diagnose_info_request_wrapper import GetUserDiagnoseInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    get_user_diagnose_info_request_wrapper = GetUserDiagnoseInfoRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetUserDiagnoseInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_user_diagnose_info(get_user_diagnose_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->get_user_diagnose_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_user_diagnose_info_request_wrapper** | [**GetUserDiagnoseInfoRequestWrapper**](GetUserDiagnoseInfoRequestWrapper.md)|  |

### Return type

[**GetUserDiagnoseInfoResponseWrapper**](GetUserDiagnoseInfoResponseWrapper.md)

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

# **update_adv_ip_black_manual**
> UpdateAdvIPBlackManualResponseWrapper update_adv_ip_black_manual(update_adv_ip_black_manual_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.update_adv_ip_black_manual_response_wrapper import UpdateAdvIPBlackManualResponseWrapper
from baiduads.shieldfunction.model.update_adv_ip_black_manual_request_wrapper import UpdateAdvIPBlackManualRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    update_adv_ip_black_manual_request_wrapper = UpdateAdvIPBlackManualRequestWrapper(
        header=ApiRequestHeader(),
        body=AddIPBlackManualRequest(
            ip_black=[
                "ip_black_example",
            ],
        ),
    ) # UpdateAdvIPBlackManualRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adv_ip_black_manual(update_adv_ip_black_manual_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->update_adv_ip_black_manual: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_adv_ip_black_manual_request_wrapper** | [**UpdateAdvIPBlackManualRequestWrapper**](UpdateAdvIPBlackManualRequestWrapper.md)|  |

### Return type

[**UpdateAdvIPBlackManualResponseWrapper**](UpdateAdvIPBlackManualResponseWrapper.md)

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

# **update_ip_black_manual**
> UpdateIPBlackManualResponseWrapper update_ip_black_manual(update_ip_black_manual_request_wrapper)



### Example


```python
import time
import baiduads
from shieldfunction.api import shield_function
from baiduads.shieldfunction.model.update_ip_black_manual_response_wrapper import UpdateIPBlackManualResponseWrapper
from baiduads.shieldfunction.model.update_ip_black_manual_request_wrapper import UpdateIPBlackManualRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = shield_function.ShieldFunction(api_client)
    update_ip_black_manual_request_wrapper = UpdateIPBlackManualRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateIPBlackManualRequest(
            ip="ip_example",
            new_ip="new_ip_example",
            identity_user="identity_user_example",
        ),
    ) # UpdateIPBlackManualRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_ip_black_manual(update_ip_black_manual_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShieldFunction->update_ip_black_manual: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_ip_black_manual_request_wrapper** | [**UpdateIPBlackManualRequestWrapper**](UpdateIPBlackManualRequestWrapper.md)|  |

### Return type

[**UpdateIPBlackManualResponseWrapper**](UpdateIPBlackManualResponseWrapper.md)

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

