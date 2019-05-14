# AuthenticationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationV1beta1TokenReview**](AuthenticationV1beta1Api.md#createAuthenticationV1beta1TokenReview) | **POST** /apis/authentication.k8s.io/v1beta1/tokenreviews | 
[**getAuthenticationV1beta1APIResources**](AuthenticationV1beta1Api.md#getAuthenticationV1beta1APIResources) | **GET** /apis/authentication.k8s.io/v1beta1/ | 


<a name="createAuthenticationV1beta1TokenReview"></a>
# **createAuthenticationV1beta1TokenReview**
> IoK8sApiAuthenticationV1beta1TokenReview createAuthenticationV1beta1TokenReview(body, dryRun, includeUninitialized, pretty)



create a TokenReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthenticationV1beta1Api apiInstance = new AuthenticationV1beta1Api();
IoK8sApiAuthenticationV1beta1TokenReview body = new IoK8sApiAuthenticationV1beta1TokenReview(); // IoK8sApiAuthenticationV1beta1TokenReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthenticationV1beta1TokenReview result = apiInstance.createAuthenticationV1beta1TokenReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1beta1Api#createAuthenticationV1beta1TokenReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthenticationV1beta1TokenReview**](IoK8sApiAuthenticationV1beta1TokenReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthenticationV1beta1TokenReview**](IoK8sApiAuthenticationV1beta1TokenReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthenticationV1beta1APIResources"></a>
# **getAuthenticationV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthenticationV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthenticationV1beta1Api apiInstance = new AuthenticationV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthenticationV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1beta1Api#getAuthenticationV1beta1APIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIResourceList**](IoK8sApimachineryPkgApisMetaV1APIResourceList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

