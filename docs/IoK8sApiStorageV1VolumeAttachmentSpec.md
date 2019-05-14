
# IoK8sApiStorageV1VolumeAttachmentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attacher** | **String** | Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName(). | 
**nodeName** | **String** | The node that the volume should be attached to. | 
**source** | [**IoK8sApiStorageV1VolumeAttachmentSource**](IoK8sApiStorageV1VolumeAttachmentSource.md) | Source represents the volume that should be attached. | 



