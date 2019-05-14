# ApiextensionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiextensionsAPIGroup**](ApiextensionsApi.md#getApiextensionsAPIGroup) | **GET** /apis/apiextensions.k8s.io/ | 


<a name="getApiextensionsAPIGroup"></a>
# **getApiextensionsAPIGroup**
> IoK8sApimachineryPkgApisMetaV1APIGroup getApiextensionsAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiextensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApiextensionsApi apiInstance = new ApiextensionsApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroup result = apiInstance.getApiextensionsAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiextensionsApi#getApiextensionsAPIGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIGroup**](IoK8sApimachineryPkgApisMetaV1APIGroup.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

