# baiduads.StreamApiUploadService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**upload_id_stream**](StreamApiUploadService.md#upload_id_stream) | **POST** /json/sms/service/StreamApiUploadService/uploadIdStream | 


# **upload_id_stream**
> UploadIdStreamResponseWrapper upload_id_stream(upload_id_stream_request_wrapper)



### Example


```python
import time
import baiduads
from streamapiupload.api import stream_api_upload_service
from baiduads.streamapiupload.model.upload_id_stream_request_wrapper import UploadIdStreamRequestWrapper
from baiduads.streamapiupload.model.upload_id_stream_response_wrapper import UploadIdStreamResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = stream_api_upload_service.StreamApiUploadService(api_client)
    upload_id_stream_request_wrapper = UploadIdStreamRequestWrapper(
        header=ApiRequestHeader(),
        body=StreamApiUploadRequest(
            asset_id=1,
            asset_records=[
                AssetRecord(
                    ext_tags={},
                    id="id_example",
                    id_type="id_type_example",
                    time=1,
                ),
            ],
            op_type=1,
        ),
    ) # UploadIdStreamRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.upload_id_stream(upload_id_stream_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling StreamApiUploadService->upload_id_stream: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id_stream_request_wrapper** | [**UploadIdStreamRequestWrapper**](UploadIdStreamRequestWrapper.md)|  |

### Return type

[**UploadIdStreamResponseWrapper**](UploadIdStreamResponseWrapper.md)

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

