# AuthorizationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorizationV1beta1NamespacedLocalSubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1NamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createAuthorizationV1beta1SelfSubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1SelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
[**createAuthorizationV1beta1SelfSubjectRulesReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1SelfSubjectRulesReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectrulesreviews | 
[**createAuthorizationV1beta1SubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1SubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
[**getAuthorizationV1beta1APIResources**](AuthorizationV1beta1Api.md#getAuthorizationV1beta1APIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 


<a name="createAuthorizationV1beta1NamespacedLocalSubjectAccessReview"></a>
# **createAuthorizationV1beta1NamespacedLocalSubjectAccessReview**
> IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview body = new IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview(); // IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview result = apiInstance.createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1NamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview**](IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview**](IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1beta1SelfSubjectAccessReview"></a>
# **createAuthorizationV1beta1SelfSubjectAccessReview**
> IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview createAuthorizationV1beta1SelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview body = new IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview(); // IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview result = apiInstance.createAuthorizationV1beta1SelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1SelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview**](IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview**](IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1beta1SelfSubjectRulesReview"></a>
# **createAuthorizationV1beta1SelfSubjectRulesReview**
> IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview createAuthorizationV1beta1SelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectRulesReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview body = new IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview(); // IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview result = apiInstance.createAuthorizationV1beta1SelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1SelfSubjectRulesReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview**](IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview**](IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1beta1SubjectAccessReview"></a>
# **createAuthorizationV1beta1SubjectAccessReview**
> IoK8sApiAuthorizationV1beta1SubjectAccessReview createAuthorizationV1beta1SubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
IoK8sApiAuthorizationV1beta1SubjectAccessReview body = new IoK8sApiAuthorizationV1beta1SubjectAccessReview(); // IoK8sApiAuthorizationV1beta1SubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1beta1SubjectAccessReview result = apiInstance.createAuthorizationV1beta1SubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1SubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1beta1SubjectAccessReview**](IoK8sApiAuthorizationV1beta1SubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1beta1SubjectAccessReview**](IoK8sApiAuthorizationV1beta1SubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthorizationV1beta1APIResources"></a>
# **getAuthorizationV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthorizationV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthorizationV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#getAuthorizationV1beta1APIResources");
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

