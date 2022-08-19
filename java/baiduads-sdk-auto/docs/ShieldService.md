# ShieldService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccountExcludeIp**](ShieldService.md#addAccountExcludeIp) | **POST** /json/sms/service/ShieldService/addAccountExcludeIp | 
[**addBShieldPolicy**](ShieldService.md#addBShieldPolicy) | **POST** /json/sms/service/ShieldService/addBShieldPolicy | 
[**delAccountExcludeIp**](ShieldService.md#delAccountExcludeIp) | **POST** /json/sms/service/ShieldService/delAccountExcludeIp | 
[**deleteBShieldBlackIP**](ShieldService.md#deleteBShieldBlackIP) | **POST** /json/sms/service/ShieldService/deleteBShieldBlackIP | 
[**deleteBShieldCustomer**](ShieldService.md#deleteBShieldCustomer) | **POST** /json/sms/service/ShieldService/deleteBShieldCustomer | 
[**deleteBShieldPolicy**](ShieldService.md#deleteBShieldPolicy) | **POST** /json/sms/service/ShieldService/deleteBShieldPolicy | 
[**updateBShieldBlackIP**](ShieldService.md#updateBShieldBlackIP) | **POST** /json/sms/service/ShieldService/updateBShieldBlackIP | 
[**updateBShieldCustomer**](ShieldService.md#updateBShieldCustomer) | **POST** /json/sms/service/ShieldService/updateBShieldCustomer | 
[**updatePolicyIPToBlackIP**](ShieldService.md#updatePolicyIPToBlackIP) | **POST** /json/sms/service/ShieldService/updatePolicyIPToBlackIP | 
[**updateShieldPolicy**](ShieldService.md#updateShieldPolicy) | **POST** /json/sms/service/ShieldService/updateShieldPolicy | 



## addAccountExcludeIp

> AddAccountExcludeIpResponseWrapper addAccountExcludeIp(addAccountExcludeIpRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        AddAccountExcludeIpRequestWrapper addAccountExcludeIpRequestWrapper = new AddAccountExcludeIpRequestWrapper(); // AddAccountExcludeIpRequestWrapper | 
        try {
            AddAccountExcludeIpResponseWrapper result = apiInstance.addAccountExcludeIp(addAccountExcludeIpRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#addAccountExcludeIp");
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
 **addAccountExcludeIpRequestWrapper** | [**AddAccountExcludeIpRequestWrapper**](AddAccountExcludeIpRequestWrapper.md)|  |

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
| **200** | response |  -  |


## addBShieldPolicy

> AddBShieldPolicyResponseWrapper addBShieldPolicy(addBShieldPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        AddBShieldPolicyRequestWrapper addBShieldPolicyRequestWrapper = new AddBShieldPolicyRequestWrapper(); // AddBShieldPolicyRequestWrapper | 
        try {
            AddBShieldPolicyResponseWrapper result = apiInstance.addBShieldPolicy(addBShieldPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#addBShieldPolicy");
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
 **addBShieldPolicyRequestWrapper** | [**AddBShieldPolicyRequestWrapper**](AddBShieldPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |


## delAccountExcludeIp

> DelAccountExcludeIpResponseWrapper delAccountExcludeIp(delAccountExcludeIpRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        DelAccountExcludeIpRequestWrapper delAccountExcludeIpRequestWrapper = new DelAccountExcludeIpRequestWrapper(); // DelAccountExcludeIpRequestWrapper | 
        try {
            DelAccountExcludeIpResponseWrapper result = apiInstance.delAccountExcludeIp(delAccountExcludeIpRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#delAccountExcludeIp");
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
 **delAccountExcludeIpRequestWrapper** | [**DelAccountExcludeIpRequestWrapper**](DelAccountExcludeIpRequestWrapper.md)|  |

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
| **200** | response |  -  |


## deleteBShieldBlackIP

> DeleteBShieldBlackIPResponseWrapper deleteBShieldBlackIP(deleteBShieldBlackIPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        DeleteBShieldBlackIPRequestWrapper deleteBShieldBlackIPRequestWrapper = new DeleteBShieldBlackIPRequestWrapper(); // DeleteBShieldBlackIPRequestWrapper | 
        try {
            DeleteBShieldBlackIPResponseWrapper result = apiInstance.deleteBShieldBlackIP(deleteBShieldBlackIPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#deleteBShieldBlackIP");
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
 **deleteBShieldBlackIPRequestWrapper** | [**DeleteBShieldBlackIPRequestWrapper**](DeleteBShieldBlackIPRequestWrapper.md)|  |

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
| **200** | response |  -  |


## deleteBShieldCustomer

> DeleteBShieldCustomerResponseWrapper deleteBShieldCustomer(deleteBShieldCustomerRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        DeleteBShieldCustomerRequestWrapper deleteBShieldCustomerRequestWrapper = new DeleteBShieldCustomerRequestWrapper(); // DeleteBShieldCustomerRequestWrapper | 
        try {
            DeleteBShieldCustomerResponseWrapper result = apiInstance.deleteBShieldCustomer(deleteBShieldCustomerRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#deleteBShieldCustomer");
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
 **deleteBShieldCustomerRequestWrapper** | [**DeleteBShieldCustomerRequestWrapper**](DeleteBShieldCustomerRequestWrapper.md)|  |

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
| **200** | response |  -  |


## deleteBShieldPolicy

> DeleteBShieldPolicyResponseWrapper deleteBShieldPolicy(deleteBShieldPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        DeleteBShieldPolicyRequestWrapper deleteBShieldPolicyRequestWrapper = new DeleteBShieldPolicyRequestWrapper(); // DeleteBShieldPolicyRequestWrapper | 
        try {
            DeleteBShieldPolicyResponseWrapper result = apiInstance.deleteBShieldPolicy(deleteBShieldPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#deleteBShieldPolicy");
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
 **deleteBShieldPolicyRequestWrapper** | [**DeleteBShieldPolicyRequestWrapper**](DeleteBShieldPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updateBShieldBlackIP

> UpdateBShieldBlackIPResponseWrapper updateBShieldBlackIP(updateBShieldBlackIPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        UpdateBShieldBlackIPRequestWrapper updateBShieldBlackIPRequestWrapper = new UpdateBShieldBlackIPRequestWrapper(); // UpdateBShieldBlackIPRequestWrapper | 
        try {
            UpdateBShieldBlackIPResponseWrapper result = apiInstance.updateBShieldBlackIP(updateBShieldBlackIPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#updateBShieldBlackIP");
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
 **updateBShieldBlackIPRequestWrapper** | [**UpdateBShieldBlackIPRequestWrapper**](UpdateBShieldBlackIPRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updateBShieldCustomer

> UpdateBShieldCustomerResponseWrapper updateBShieldCustomer(updateBShieldCustomerRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        UpdateBShieldCustomerRequestWrapper updateBShieldCustomerRequestWrapper = new UpdateBShieldCustomerRequestWrapper(); // UpdateBShieldCustomerRequestWrapper | 
        try {
            UpdateBShieldCustomerResponseWrapper result = apiInstance.updateBShieldCustomer(updateBShieldCustomerRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#updateBShieldCustomer");
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
 **updateBShieldCustomerRequestWrapper** | [**UpdateBShieldCustomerRequestWrapper**](UpdateBShieldCustomerRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updatePolicyIPToBlackIP

> UpdatePolicyIPToBlackIPResponseWrapper updatePolicyIPToBlackIP(updatePolicyIPToBlackIPRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        UpdatePolicyIPToBlackIPRequestWrapper updatePolicyIPToBlackIPRequestWrapper = new UpdatePolicyIPToBlackIPRequestWrapper(); // UpdatePolicyIPToBlackIPRequestWrapper | 
        try {
            UpdatePolicyIPToBlackIPResponseWrapper result = apiInstance.updatePolicyIPToBlackIP(updatePolicyIPToBlackIPRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#updatePolicyIPToBlackIP");
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
 **updatePolicyIPToBlackIPRequestWrapper** | [**UpdatePolicyIPToBlackIPRequestWrapper**](UpdatePolicyIPToBlackIPRequestWrapper.md)|  |

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
| **200** | response |  -  |


## updateShieldPolicy

> UpdateShieldPolicyResponseWrapper updateShieldPolicy(updateShieldPolicyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.shield.api.ShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ShieldService apiInstance = new ShieldService(defaultClient);
        UpdateShieldPolicyRequestWrapper updateShieldPolicyRequestWrapper = new UpdateShieldPolicyRequestWrapper(); // UpdateShieldPolicyRequestWrapper | 
        try {
            UpdateShieldPolicyResponseWrapper result = apiInstance.updateShieldPolicy(updateShieldPolicyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShieldService#updateShieldPolicy");
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
 **updateShieldPolicyRequestWrapper** | [**UpdateShieldPolicyRequestWrapper**](UpdateShieldPolicyRequestWrapper.md)|  |

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
| **200** | response |  -  |

