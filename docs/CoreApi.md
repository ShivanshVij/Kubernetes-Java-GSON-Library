# CoreApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoreAPIVersions**](CoreApi.md#getCoreAPIVersions) | **GET** /api/ | 


<a name="getCoreAPIVersions"></a>
# **getCoreAPIVersions**
> IoK8sApimachineryPkgApisMetaV1APIVersions getCoreAPIVersions()



get available API versions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CoreApi apiInstance = new CoreApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIVersions result = apiInstance.getCoreAPIVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getCoreAPIVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIVersions**](IoK8sApimachineryPkgApisMetaV1APIVersions.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

