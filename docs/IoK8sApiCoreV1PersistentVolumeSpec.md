
# IoK8sApiCoreV1PersistentVolumeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes |  [optional]
**awsElasticBlockStore** | [**IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource**](IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource.md) | AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore |  [optional]
**azureDisk** | [**IoK8sApiCoreV1AzureDiskVolumeSource**](IoK8sApiCoreV1AzureDiskVolumeSource.md) | AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. |  [optional]
**azureFile** | [**IoK8sApiCoreV1AzureFilePersistentVolumeSource**](IoK8sApiCoreV1AzureFilePersistentVolumeSource.md) | AzureFile represents an Azure File Service mount on the host and bind mount to the pod. |  [optional]
**capacity** | **Map&lt;String, String&gt;** | A description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional]
**cephfs** | [**IoK8sApiCoreV1CephFSPersistentVolumeSource**](IoK8sApiCoreV1CephFSPersistentVolumeSource.md) | CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime |  [optional]
**cinder** | [**IoK8sApiCoreV1CinderPersistentVolumeSource**](IoK8sApiCoreV1CinderPersistentVolumeSource.md) | Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md |  [optional]
**claimRef** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding |  [optional]
**csi** | [**IoK8sApiCoreV1CSIPersistentVolumeSource**](IoK8sApiCoreV1CSIPersistentVolumeSource.md) | CSI represents storage that handled by an external CSI driver (Beta feature). |  [optional]
**fc** | [**IoK8sApiCoreV1FCVolumeSource**](IoK8sApiCoreV1FCVolumeSource.md) | FC represents a Fibre Channel resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. |  [optional]
**flexVolume** | [**IoK8sApiCoreV1FlexPersistentVolumeSource**](IoK8sApiCoreV1FlexPersistentVolumeSource.md) | FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. |  [optional]
**flocker** | [**IoK8sApiCoreV1FlockerVolumeSource**](IoK8sApiCoreV1FlockerVolumeSource.md) | Flocker represents a Flocker volume attached to a kubelet&#39;s host machine and exposed to the pod for its usage. This depends on the Flocker control service being running |  [optional]
**gcePersistentDisk** | [**IoK8sApiCoreV1GCEPersistentDiskVolumeSource**](IoK8sApiCoreV1GCEPersistentDiskVolumeSource.md) | GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk |  [optional]
**glusterfs** | [**IoK8sApiCoreV1GlusterfsPersistentVolumeSource**](IoK8sApiCoreV1GlusterfsPersistentVolumeSource.md) | Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md |  [optional]
**hostPath** | [**IoK8sApiCoreV1HostPathVolumeSource**](IoK8sApiCoreV1HostPathVolumeSource.md) | HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath |  [optional]
**iscsi** | [**IoK8sApiCoreV1ISCSIPersistentVolumeSource**](IoK8sApiCoreV1ISCSIPersistentVolumeSource.md) | ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin. |  [optional]
**local** | [**IoK8sApiCoreV1LocalVolumeSource**](IoK8sApiCoreV1LocalVolumeSource.md) | Local represents directly-attached storage with node affinity |  [optional]
**mountOptions** | **List&lt;String&gt;** | A list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options |  [optional]
**nfs** | [**IoK8sApiCoreV1NFSVolumeSource**](IoK8sApiCoreV1NFSVolumeSource.md) | NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs |  [optional]
**nodeAffinity** | [**IoK8sApiCoreV1VolumeNodeAffinity**](IoK8sApiCoreV1VolumeNodeAffinity.md) | NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume. |  [optional]
**persistentVolumeReclaimPolicy** | **String** | What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming |  [optional]
**photonPersistentDisk** | [**IoK8sApiCoreV1PhotonPersistentDiskVolumeSource**](IoK8sApiCoreV1PhotonPersistentDiskVolumeSource.md) | PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine |  [optional]
**portworxVolume** | [**IoK8sApiCoreV1PortworxVolumeSource**](IoK8sApiCoreV1PortworxVolumeSource.md) | PortworxVolume represents a portworx volume attached and mounted on kubelets host machine |  [optional]
**quobyte** | [**IoK8sApiCoreV1QuobyteVolumeSource**](IoK8sApiCoreV1QuobyteVolumeSource.md) | Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime |  [optional]
**rbd** | [**IoK8sApiCoreV1RBDPersistentVolumeSource**](IoK8sApiCoreV1RBDPersistentVolumeSource.md) | RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md |  [optional]
**scaleIO** | [**IoK8sApiCoreV1ScaleIOPersistentVolumeSource**](IoK8sApiCoreV1ScaleIOPersistentVolumeSource.md) | ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. |  [optional]
**storageClassName** | **String** | Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass. |  [optional]
**storageos** | [**IoK8sApiCoreV1StorageOSPersistentVolumeSource**](IoK8sApiCoreV1StorageOSPersistentVolumeSource.md) | StorageOS represents a StorageOS volume that is attached to the kubelet&#39;s host machine and mounted into the pod More info: https://releases.k8s.io/HEAD/examples/volumes/storageos/README.md |  [optional]
**volumeMode** | **String** | volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature. |  [optional]
**vsphereVolume** | [**IoK8sApiCoreV1VsphereVirtualDiskVolumeSource**](IoK8sApiCoreV1VsphereVirtualDiskVolumeSource.md) | VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine |  [optional]


