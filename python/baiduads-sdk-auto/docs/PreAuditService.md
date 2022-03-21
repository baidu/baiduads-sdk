# baiduads.PreAuditService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**material_pre_audit**](PreAuditService.md#material_pre_audit) | **POST** /json/sms/service/PreAuditService/materialPreAudit | 


# **material_pre_audit**
> MaterialPreAuditResponseWrapper material_pre_audit(material_pre_audit_request_wrapper)



### Example


```python
import time
import baiduads
from preaudit.api import pre_audit_service
from baiduads.preaudit.model.material_pre_audit_response_wrapper import MaterialPreAuditResponseWrapper
from baiduads.preaudit.model.material_pre_audit_request_wrapper import MaterialPreAuditRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pre_audit_service.PreAuditService(api_client)
    material_pre_audit_request_wrapper = MaterialPreAuditRequestWrapper(
        header=ApiRequestHeader(),
        body=AdPreAuditRequest(
            ad_elems=[
                AdElemType(
                    type=1,
                    ad_conts=[
                        AdContItemType(
                            index=1,
                            cont="cont_example",
                        ),
                    ],
                ),
            ],
        ),
    ) # MaterialPreAuditRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.material_pre_audit(material_pre_audit_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PreAuditService->material_pre_audit: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **material_pre_audit_request_wrapper** | [**MaterialPreAuditRequestWrapper**](MaterialPreAuditRequestWrapper.md)|  |

### Return type

[**MaterialPreAuditResponseWrapper**](MaterialPreAuditResponseWrapper.md)

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

