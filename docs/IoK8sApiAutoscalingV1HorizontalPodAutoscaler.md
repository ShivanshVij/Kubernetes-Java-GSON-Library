
# IoK8sApiAutoscalingV1HorizontalPodAutoscaler

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) | Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata |  [optional]
**spec** | [**IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec**](IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec.md) | behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status. |  [optional]
**status** | [**IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus**](IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus.md) | current information about the autoscaler. |  [optional]



