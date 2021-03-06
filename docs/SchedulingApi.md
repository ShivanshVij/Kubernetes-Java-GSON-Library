# SchedulingApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchedulingAPIGroup**](SchedulingApi.md#getSchedulingAPIGroup) | **GET** /apis/scheduling.k8s.io/ | 


<a name="getSchedulingAPIGroup"></a>
# **getSchedulingAPIGroup**
> IoK8sApimachineryPkgApisMetaV1APIGroup getSchedulingAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SchedulingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

SchedulingApi apiInstance = new SchedulingApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroup result = apiInstance.getSchedulingAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#getSchedulingAPIGroup");
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

