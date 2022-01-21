# NewCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCreativeGroup**](NewCreativeService.md#addCreativeGroup) | **POST** /json/sms/service/NewCreativeService/addCreativeGroup | 
[**addCreatives**](NewCreativeService.md#addCreatives) | **POST** /json/sms/service/NewCreativeService/addCreatives | 
[**addDpaCreative**](NewCreativeService.md#addDpaCreative) | **POST** /json/sms/service/NewCreativeService/addDpaCreative | 
[**batSetRange**](NewCreativeService.md#batSetRange) | **POST** /json/sms/service/NewCreativeService/batSetRange | 
[**deleteCreativeGroup**](NewCreativeService.md#deleteCreativeGroup) | **POST** /json/sms/service/NewCreativeService/deleteCreativeGroup | 
[**deleteCreatives**](NewCreativeService.md#deleteCreatives) | **POST** /json/sms/service/NewCreativeService/deleteCreatives | 
[**deleteDpaCreative**](NewCreativeService.md#deleteDpaCreative) | **POST** /json/sms/service/NewCreativeService/deleteDpaCreative | 
[**getCreativeGroup**](NewCreativeService.md#getCreativeGroup) | **POST** /json/sms/service/NewCreativeService/getCreativeGroup | 
[**getCreatives**](NewCreativeService.md#getCreatives) | **POST** /json/sms/service/NewCreativeService/getCreatives | 
[**getDpaCreative**](NewCreativeService.md#getDpaCreative) | **POST** /json/sms/service/NewCreativeService/getDpaCreative | 
[**getDpaMaterialTypes**](NewCreativeService.md#getDpaMaterialTypes) | **POST** /json/sms/service/NewCreativeService/getDpaMaterialTypes | 
[**getFormatTemplates**](NewCreativeService.md#getFormatTemplates) | **POST** /json/sms/service/NewCreativeService/getFormatTemplates | 
[**updateCreativeGroup**](NewCreativeService.md#updateCreativeGroup) | **POST** /json/sms/service/NewCreativeService/updateCreativeGroup | 
[**updateCreatives**](NewCreativeService.md#updateCreatives) | **POST** /json/sms/service/NewCreativeService/updateCreatives | 
[**updateDpaCreative**](NewCreativeService.md#updateDpaCreative) | **POST** /json/sms/service/NewCreativeService/updateDpaCreative | 



## addCreativeGroup

> AddCreativeGroupResponseWrapper addCreativeGroup(addCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        AddCreativeGroupRequestWrapper addCreativeGroupRequestWrapper = new AddCreativeGroupRequestWrapper(); // AddCreativeGroupRequestWrapper | 
        try {
            AddCreativeGroupResponseWrapper result = apiInstance.addCreativeGroup(addCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#addCreativeGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCreativeGroupRequestWrapper** | [**AddCreativeGroupRequestWrapper**](AddCreativeGroupRequestWrapper.md)|  |

### Return type

[**AddCreativeGroupResponseWrapper**](AddCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## addCreatives

> AddCreativesResponseWrapper addCreatives(addCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        AddCreativesRequestWrapper addCreativesRequestWrapper = new AddCreativesRequestWrapper(); // AddCreativesRequestWrapper | 
        try {
            AddCreativesResponseWrapper result = apiInstance.addCreatives(addCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#addCreatives");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCreativesRequestWrapper** | [**AddCreativesRequestWrapper**](AddCreativesRequestWrapper.md)|  |

### Return type

[**AddCreativesResponseWrapper**](AddCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## addDpaCreative

> AddDpaCreativeResponseWrapper addDpaCreative(addDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        AddDpaCreativeRequestWrapper addDpaCreativeRequestWrapper = new AddDpaCreativeRequestWrapper(); // AddDpaCreativeRequestWrapper | 
        try {
            AddDpaCreativeResponseWrapper result = apiInstance.addDpaCreative(addDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#addDpaCreative");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addDpaCreativeRequestWrapper** | [**AddDpaCreativeRequestWrapper**](AddDpaCreativeRequestWrapper.md)|  |

### Return type

[**AddDpaCreativeResponseWrapper**](AddDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## batSetRange

> BatSetRangeResponseWrapper batSetRange(batSetRangeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        BatSetRangeRequestWrapper batSetRangeRequestWrapper = new BatSetRangeRequestWrapper(); // BatSetRangeRequestWrapper | 
        try {
            BatSetRangeResponseWrapper result = apiInstance.batSetRange(batSetRangeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#batSetRange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batSetRangeRequestWrapper** | [**BatSetRangeRequestWrapper**](BatSetRangeRequestWrapper.md)|  |

### Return type

[**BatSetRangeResponseWrapper**](BatSetRangeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreativeGroup

> DeleteCreativeGroupResponseWrapper deleteCreativeGroup(deleteCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        DeleteCreativeGroupRequestWrapper deleteCreativeGroupRequestWrapper = new DeleteCreativeGroupRequestWrapper(); // DeleteCreativeGroupRequestWrapper | 
        try {
            DeleteCreativeGroupResponseWrapper result = apiInstance.deleteCreativeGroup(deleteCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#deleteCreativeGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteCreativeGroupRequestWrapper** | [**DeleteCreativeGroupRequestWrapper**](DeleteCreativeGroupRequestWrapper.md)|  |

### Return type

[**DeleteCreativeGroupResponseWrapper**](DeleteCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreatives

> DeleteCreativesResponseWrapper deleteCreatives(deleteCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        DeleteCreativesRequestWrapper deleteCreativesRequestWrapper = new DeleteCreativesRequestWrapper(); // DeleteCreativesRequestWrapper | 
        try {
            DeleteCreativesResponseWrapper result = apiInstance.deleteCreatives(deleteCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#deleteCreatives");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteCreativesRequestWrapper** | [**DeleteCreativesRequestWrapper**](DeleteCreativesRequestWrapper.md)|  |

### Return type

[**DeleteCreativesResponseWrapper**](DeleteCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteDpaCreative

> DeleteDpaCreativeResponseWrapper deleteDpaCreative(deleteDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        DeleteDpaCreativeRequestWrapper deleteDpaCreativeRequestWrapper = new DeleteDpaCreativeRequestWrapper(); // DeleteDpaCreativeRequestWrapper | 
        try {
            DeleteDpaCreativeResponseWrapper result = apiInstance.deleteDpaCreative(deleteDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#deleteDpaCreative");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteDpaCreativeRequestWrapper** | [**DeleteDpaCreativeRequestWrapper**](DeleteDpaCreativeRequestWrapper.md)|  |

### Return type

[**DeleteDpaCreativeResponseWrapper**](DeleteDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeGroup

> GetCreativeGroupResponseWrapper getCreativeGroup(getCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        GetCreativeGroupRequestWrapper getCreativeGroupRequestWrapper = new GetCreativeGroupRequestWrapper(); // GetCreativeGroupRequestWrapper | 
        try {
            GetCreativeGroupResponseWrapper result = apiInstance.getCreativeGroup(getCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#getCreativeGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCreativeGroupRequestWrapper** | [**GetCreativeGroupRequestWrapper**](GetCreativeGroupRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupResponseWrapper**](GetCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreatives

> GetCreativesResponseWrapper getCreatives(getCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        GetCreativesRequestWrapper getCreativesRequestWrapper = new GetCreativesRequestWrapper(); // GetCreativesRequestWrapper | 
        try {
            GetCreativesResponseWrapper result = apiInstance.getCreatives(getCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#getCreatives");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCreativesRequestWrapper** | [**GetCreativesRequestWrapper**](GetCreativesRequestWrapper.md)|  |

### Return type

[**GetCreativesResponseWrapper**](GetCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDpaCreative

> GetDpaCreativeResponseWrapper getDpaCreative(getDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        GetDpaCreativeRequestWrapper getDpaCreativeRequestWrapper = new GetDpaCreativeRequestWrapper(); // GetDpaCreativeRequestWrapper | 
        try {
            GetDpaCreativeResponseWrapper result = apiInstance.getDpaCreative(getDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#getDpaCreative");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDpaCreativeRequestWrapper** | [**GetDpaCreativeRequestWrapper**](GetDpaCreativeRequestWrapper.md)|  |

### Return type

[**GetDpaCreativeResponseWrapper**](GetDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDpaMaterialTypes

> GetDpaMaterialTypesResponseWrapper getDpaMaterialTypes(getDpaMaterialTypesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        GetDpaMaterialTypesRequestWrapper getDpaMaterialTypesRequestWrapper = new GetDpaMaterialTypesRequestWrapper(); // GetDpaMaterialTypesRequestWrapper | 
        try {
            GetDpaMaterialTypesResponseWrapper result = apiInstance.getDpaMaterialTypes(getDpaMaterialTypesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#getDpaMaterialTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDpaMaterialTypesRequestWrapper** | [**GetDpaMaterialTypesRequestWrapper**](GetDpaMaterialTypesRequestWrapper.md)|  |

### Return type

[**GetDpaMaterialTypesResponseWrapper**](GetDpaMaterialTypesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getFormatTemplates

> GetFormatTemplatesResponseWrapper getFormatTemplates(getFormatTemplatesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        GetFormatTemplatesRequestWrapper getFormatTemplatesRequestWrapper = new GetFormatTemplatesRequestWrapper(); // GetFormatTemplatesRequestWrapper | 
        try {
            GetFormatTemplatesResponseWrapper result = apiInstance.getFormatTemplates(getFormatTemplatesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#getFormatTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getFormatTemplatesRequestWrapper** | [**GetFormatTemplatesRequestWrapper**](GetFormatTemplatesRequestWrapper.md)|  |

### Return type

[**GetFormatTemplatesResponseWrapper**](GetFormatTemplatesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreativeGroup

> UpdateCreativeGroupResponseWrapper updateCreativeGroup(updateCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        UpdateCreativeGroupRequestWrapper updateCreativeGroupRequestWrapper = new UpdateCreativeGroupRequestWrapper(); // UpdateCreativeGroupRequestWrapper | 
        try {
            UpdateCreativeGroupResponseWrapper result = apiInstance.updateCreativeGroup(updateCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#updateCreativeGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCreativeGroupRequestWrapper** | [**UpdateCreativeGroupRequestWrapper**](UpdateCreativeGroupRequestWrapper.md)|  |

### Return type

[**UpdateCreativeGroupResponseWrapper**](UpdateCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreatives

> UpdateCreativesResponseWrapper updateCreatives(updateCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        UpdateCreativesRequestWrapper updateCreativesRequestWrapper = new UpdateCreativesRequestWrapper(); // UpdateCreativesRequestWrapper | 
        try {
            UpdateCreativesResponseWrapper result = apiInstance.updateCreatives(updateCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#updateCreatives");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCreativesRequestWrapper** | [**UpdateCreativesRequestWrapper**](UpdateCreativesRequestWrapper.md)|  |

### Return type

[**UpdateCreativesResponseWrapper**](UpdateCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateDpaCreative

> UpdateDpaCreativeResponseWrapper updateDpaCreative(updateDpaCreativeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.newcreative.api.NewCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        NewCreativeService apiInstance = new NewCreativeService(defaultClient);
        UpdateDpaCreativeRequestWrapper updateDpaCreativeRequestWrapper = new UpdateDpaCreativeRequestWrapper(); // UpdateDpaCreativeRequestWrapper | 
        try {
            UpdateDpaCreativeResponseWrapper result = apiInstance.updateDpaCreative(updateDpaCreativeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewCreativeService#updateDpaCreative");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDpaCreativeRequestWrapper** | [**UpdateDpaCreativeRequestWrapper**](UpdateDpaCreativeRequestWrapper.md)|  |

### Return type

[**UpdateDpaCreativeResponseWrapper**](UpdateDpaCreativeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

