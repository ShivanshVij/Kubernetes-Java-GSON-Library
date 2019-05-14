
# IoK8sApiAutoscalingV2beta1PodsMetricStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentAverageValue** | **String** | currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity) | 
**metricName** | **String** | metricName is the name of the metric in question | 
**selector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics. |  [optional]



