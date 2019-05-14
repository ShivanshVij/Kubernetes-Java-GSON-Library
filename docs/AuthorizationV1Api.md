# AuthorizationV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorizationV1NamespacedLocalSubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1NamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createAuthorizationV1SelfSubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1SelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectaccessreviews | 
[**createAuthorizationV1SelfSubjectRulesReview**](AuthorizationV1Api.md#createAuthorizationV1SelfSubjectRulesReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectrulesreviews | 
[**createAuthorizationV1SubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1SubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/subjectaccessreviews | 
[**getAuthorizationV1APIResources**](AuthorizationV1Api.md#getAuthorizationV1APIResources) | **GET** /apis/authorization.k8s.io/v1/ | 


<a name="createAuthorizationV1NamespacedLocalSubjectAccessReview"></a>
# **createAuthorizationV1NamespacedLocalSubjectAccessReview**
> IoK8sApiAuthorizationV1LocalSubjectAccessReview createAuthorizationV1NamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApiAuthorizationV1LocalSubjectAccessReview body = new IoK8sApiAuthorizationV1LocalSubjectAccessReview(); // IoK8sApiAuthorizationV1LocalSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1LocalSubjectAccessReview result = apiInstance.createAuthorizationV1NamespacedLocalSubjectAccessReview(namespace, body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1NamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApiAuthorizationV1LocalSubjectAccessReview**](IoK8sApiAuthorizationV1LocalSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1LocalSubjectAccessReview**](IoK8sApiAuthorizationV1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1SelfSubjectAccessReview"></a>
# **createAuthorizationV1SelfSubjectAccessReview**
> IoK8sApiAuthorizationV1SelfSubjectAccessReview createAuthorizationV1SelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
IoK8sApiAuthorizationV1SelfSubjectAccessReview body = new IoK8sApiAuthorizationV1SelfSubjectAccessReview(); // IoK8sApiAuthorizationV1SelfSubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1SelfSubjectAccessReview result = apiInstance.createAuthorizationV1SelfSubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1SelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1SelfSubjectAccessReview**](IoK8sApiAuthorizationV1SelfSubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1SelfSubjectAccessReview**](IoK8sApiAuthorizationV1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1SelfSubjectRulesReview"></a>
# **createAuthorizationV1SelfSubjectRulesReview**
> IoK8sApiAuthorizationV1SelfSubjectRulesReview createAuthorizationV1SelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty)



create a SelfSubjectRulesReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
IoK8sApiAuthorizationV1SelfSubjectRulesReview body = new IoK8sApiAuthorizationV1SelfSubjectRulesReview(); // IoK8sApiAuthorizationV1SelfSubjectRulesReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1SelfSubjectRulesReview result = apiInstance.createAuthorizationV1SelfSubjectRulesReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1SelfSubjectRulesReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1SelfSubjectRulesReview**](IoK8sApiAuthorizationV1SelfSubjectRulesReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1SelfSubjectRulesReview**](IoK8sApiAuthorizationV1SelfSubjectRulesReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1SubjectAccessReview"></a>
# **createAuthorizationV1SubjectAccessReview**
> IoK8sApiAuthorizationV1SubjectAccessReview createAuthorizationV1SubjectAccessReview(body, dryRun, includeUninitialized, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
IoK8sApiAuthorizationV1SubjectAccessReview body = new IoK8sApiAuthorizationV1SubjectAccessReview(); // IoK8sApiAuthorizationV1SubjectAccessReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Boolean includeUninitialized = true; // Boolean | If IncludeUninitialized is specified, the object may be returned without completing initialization.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthorizationV1SubjectAccessReview result = apiInstance.createAuthorizationV1SubjectAccessReview(body, dryRun, includeUninitialized, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1SubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthorizationV1SubjectAccessReview**](IoK8sApiAuthorizationV1SubjectAccessReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **includeUninitialized** | **Boolean**| If IncludeUninitialized is specified, the object may be returned without completing initialization. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthorizationV1SubjectAccessReview**](IoK8sApiAuthorizationV1SubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthorizationV1APIResources"></a>
# **getAuthorizationV1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthorizationV1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorizationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthorizationV1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#getAuthorizationV1APIResources");
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

