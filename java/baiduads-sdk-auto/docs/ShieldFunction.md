# ShieldFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIPBlackManual**](ShieldFunction.md#addIPBlackManual) | **POST** /json/sms/service/ShieldFunction/addIPBlackManual | 
[**deleteIPBlackManual**](ShieldFunction.md#deleteIPBlackManual) | **POST** /json/sms/service/ShieldFunction/deleteIPBlackManual | 
[**getHitBlackIPPolicy**](ShieldFunction.md#getHitBlackIPPolicy) | **POST** /json/sms/service/ShieldFunction/getHitBlackIPPolicy | 
[**getHitCustomerPolicy**](ShieldFunction.md#getHitCustomerPolicy) | **POST** /json/sms/service/ShieldFunction/getHitCustomerPolicy | 
[**getIPBlackManual**](ShieldFunction.md#getIPBlackManual) | **POST** /json/sms/service/ShieldFunction/getIPBlackManual | 
[**getShieldBlackIP**](ShieldFunction.md#getShieldBlackIP) | **POST** /json/sms/service/ShieldFunction/getShieldBlackIP | 
[**getShieldCustomer**](ShieldFunction.md#getShieldCustomer) | **POST** /json/sms/service/ShieldFunction/getShieldCustomer | 
[**getShieldPolicy**](ShieldFunction.md#getShieldPolicy) | **POST** /json/sms/service/ShieldFunction/getShieldPolicy | 
[**getUserDiagnoseDetail**](ShieldFunction.md#getUserDiagnoseDetail) | **POST** /json/sms/service/ShieldFunction/getUserDiagnoseDetail | 
[**getUserDiagnoseInfo**](ShieldFunction.md#getUserDiagnoseInfo) | **POST** /json/sms/service/ShieldFunction/getUserDiagnoseInfo | 
[**updateAdvIPBlackManual**](ShieldFunction.md#updateAdvIPBlackManual) | **POST** /json/sms/service/ShieldFunction/updateAdvIPBlackManual | 
[**updateIPBlackManual**](ShieldFunction.md#updateIPBlackManual) | **POST** /json/sms/service/ShieldFunction/updateIPBlackManual | 



## addIPBlackManual

> AddIPBlackManualResponseWrapper addIPBlackManual(addIPBlackManualRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        AddIPBlackManualRequestWrapper addIPBlackManualRequestWrapper = new AddIPBlackManualRequestWrapper(); // AddIPBlackManualRequestWrapper | 
        try {
            AddIPBlackManualResponseWrapper result = apiInstance.addIPBlackManual(addIPBlackManualRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#addIPBlackManual");
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
 **addIPBlackManualRequestWrapper** | [**AddIPBlackManualRequestWrapper**](AddIPBlackManualRequestWrapper.md)|  |

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
| **200** | response |  -  |


## deleteIPBlackManual

> DeleteIPBlackManualResponseWrapper deleteIPBlackManual(deleteIPBlackManualRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        DeleteIPBlackManualRequestWrapper deleteIPBlackManualRequestWrapper = new DeleteIPBlackManualRequestWrapper(); // DeleteIPBlackManualRequestWrapper | 
        try {
            DeleteIPBlackManualResponseWrapper result = apiInstance.deleteIPBlackManual(deleteIPBlackManualRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#deleteIPBlackManual");
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
 **deleteIPBlackManualRequestWrapper** | [**DeleteIPBlackManualRequestWrapper**](DeleteIPBlackManualRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getHitBlackIPPolicy

> GetHitBlackIPPolicyResponseWrapper getHitBlackIPPolicy(getHitBlackIPPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetHitBlackIPPolicyRequestWrapper getHitBlackIPPolicyRequestWrapper = new GetHitBlackIPPolicyRequestWrapper(); // GetHitBlackIPPolicyRequestWrapper | 
        try {
            GetHitBlackIPPolicyResponseWrapper result = apiInstance.getHitBlackIPPolicy(getHitBlackIPPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getHitBlackIPPolicy");
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
 **getHitBlackIPPolicyRequestWrapper** | [**GetHitBlackIPPolicyRequestWrapper**](GetHitBlackIPPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getHitCustomerPolicy

> GetHitCustomerPolicyResponseWrapper getHitCustomerPolicy(getHitCustomerPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetHitCustomerPolicyRequestWrapper getHitCustomerPolicyRequestWrapper = new GetHitCustomerPolicyRequestWrapper(); // GetHitCustomerPolicyRequestWrapper | 
        try {
            GetHitCustomerPolicyResponseWrapper result = apiInstance.getHitCustomerPolicy(getHitCustomerPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getHitCustomerPolicy");
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
 **getHitCustomerPolicyRequestWrapper** | [**GetHitCustomerPolicyRequestWrapper**](GetHitCustomerPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getIPBlackManual

> GetIPBlackManualResponseWrapper getIPBlackManual(getIPBlackManualRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetIPBlackManualRequestWrapper getIPBlackManualRequestWrapper = new GetIPBlackManualRequestWrapper(); // GetIPBlackManualRequestWrapper | 
        try {
            GetIPBlackManualResponseWrapper result = apiInstance.getIPBlackManual(getIPBlackManualRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getIPBlackManual");
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
 **getIPBlackManualRequestWrapper** | [**GetIPBlackManualRequestWrapper**](GetIPBlackManualRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getShieldBlackIP

> GetShieldBlackIPResponseWrapper getShieldBlackIP(getShieldBlackIPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetShieldBlackIPRequestWrapper getShieldBlackIPRequestWrapper = new GetShieldBlackIPRequestWrapper(); // GetShieldBlackIPRequestWrapper | 
        try {
            GetShieldBlackIPResponseWrapper result = apiInstance.getShieldBlackIP(getShieldBlackIPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getShieldBlackIP");
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
 **getShieldBlackIPRequestWrapper** | [**GetShieldBlackIPRequestWrapper**](GetShieldBlackIPRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getShieldCustomer

> GetShieldCustomerResponseWrapper getShieldCustomer(getShieldCustomerRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetShieldCustomerRequestWrapper getShieldCustomerRequestWrapper = new GetShieldCustomerRequestWrapper(); // GetShieldCustomerRequestWrapper | 
        try {
            GetShieldCustomerResponseWrapper result = apiInstance.getShieldCustomer(getShieldCustomerRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getShieldCustomer");
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
 **getShieldCustomerRequestWrapper** | [**GetShieldCustomerRequestWrapper**](GetShieldCustomerRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getShieldPolicy

> GetShieldPolicyResponseWrapper getShieldPolicy(getShieldPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetShieldPolicyRequestWrapper getShieldPolicyRequestWrapper = new GetShieldPolicyRequestWrapper(); // GetShieldPolicyRequestWrapper | 
        try {
            GetShieldPolicyResponseWrapper result = apiInstance.getShieldPolicy(getShieldPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getShieldPolicy");
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
 **getShieldPolicyRequestWrapper** | [**GetShieldPolicyRequestWrapper**](GetShieldPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getUserDiagnoseDetail

> GetUserDiagnoseDetailResponseWrapper getUserDiagnoseDetail(getUserDiagnoseDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetUserDiagnoseDetailRequestWrapper getUserDiagnoseDetailRequestWrapper = new GetUserDiagnoseDetailRequestWrapper(); // GetUserDiagnoseDetailRequestWrapper | 
        try {
            GetUserDiagnoseDetailResponseWrapper result = apiInstance.getUserDiagnoseDetail(getUserDiagnoseDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getUserDiagnoseDetail");
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
 **getUserDiagnoseDetailRequestWrapper** | [**GetUserDiagnoseDetailRequestWrapper**](GetUserDiagnoseDetailRequestWrapper.md)|  |

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
| **200** | response |  -  |


## getUserDiagnoseInfo

> GetUserDiagnoseInfoResponseWrapper getUserDiagnoseInfo(getUserDiagnoseInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        GetUserDiagnoseInfoRequestWrapper getUserDiagnoseInfoRequestWrapper = new GetUserDiagnoseInfoRequestWrapper(); // GetUserDiagnoseInfoRequestWrapper | 
        try {
            GetUserDiagnoseInfoResponseWrapper result = apiInstance.getUserDiagnoseInfo(getUserDiagnoseInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#getUserDiagnoseInfo");
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
 **getUserDiagnoseInfoRequestWrapper** | [**GetUserDiagnoseInfoRequestWrapper**](GetUserDiagnoseInfoRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updateAdvIPBlackManual

> UpdateAdvIPBlackManualResponseWrapper updateAdvIPBlackManual(updateAdvIPBlackManualRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        UpdateAdvIPBlackManualRequestWrapper updateAdvIPBlackManualRequestWrapper = new UpdateAdvIPBlackManualRequestWrapper(); // UpdateAdvIPBlackManualRequestWrapper | 
        try {
            UpdateAdvIPBlackManualResponseWrapper result = apiInstance.updateAdvIPBlackManual(updateAdvIPBlackManualRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#updateAdvIPBlackManual");
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
 **updateAdvIPBlackManualRequestWrapper** | [**UpdateAdvIPBlackManualRequestWrapper**](UpdateAdvIPBlackManualRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updateIPBlackManual

> UpdateIPBlackManualResponseWrapper updateIPBlackManual(updateIPBlackManualRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shieldfunction.api.ShieldFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldFunction apiInstance = new ShieldFunction(defaultClient);
        UpdateIPBlackManualRequestWrapper updateIPBlackManualRequestWrapper = new UpdateIPBlackManualRequestWrapper(); // UpdateIPBlackManualRequestWrapper | 
        try {
            UpdateIPBlackManualResponseWrapper result = apiInstance.updateIPBlackManual(updateIPBlackManualRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldFunction#updateIPBlackManual");
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
 **updateIPBlackManualRequestWrapper** | [**UpdateIPBlackManualRequestWrapper**](UpdateIPBlackManualRequestWrapper.md)|  |

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
| **200** | response |  -  |

