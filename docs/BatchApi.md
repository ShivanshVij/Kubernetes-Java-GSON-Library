# BatchApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchAPIGroup**](BatchApi.md#getBatchAPIGroup) | **GET** /apis/batch/ | 


<a name="getBatchAPIGroup"></a>
# **getBatchAPIGroup**
> IoK8sApimachineryPkgApisMetaV1APIGroup getBatchAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

BatchApi apiInstance = new BatchApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroup result = apiInstance.getBatchAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#getBatchAPIGroup");
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

