
# IoK8sApiCoreV1Handler

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**IoK8sApiCoreV1ExecAction**](IoK8sApiCoreV1ExecAction.md) | One and only one of the following should be specified. Exec specifies the action to take. |  [optional]
**httpGet** | [**IoK8sApiCoreV1HTTPGetAction**](IoK8sApiCoreV1HTTPGetAction.md) | HTTPGet specifies the http request to perform. |  [optional]
**tcpSocket** | [**IoK8sApiCoreV1TCPSocketAction**](IoK8sApiCoreV1TCPSocketAction.md) | TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported |  [optional]



