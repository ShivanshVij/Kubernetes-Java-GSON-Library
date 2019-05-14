/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IoK8sApiCoreV1LocalObjectReference;
import java.io.IOException;

/**
 * Represents a StorageOS persistent volume resource.
 */
@ApiModel(description = "Represents a StorageOS persistent volume resource.")

public class IoK8sApiCoreV1StorageOSVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private IoK8sApiCoreV1LocalObjectReference secretRef = null;

  @SerializedName("volumeName")
  private String volumeName = null;

  @SerializedName("volumeNamespace")
  private String volumeNamespace = null;

  public IoK8sApiCoreV1StorageOSVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1StorageOSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1StorageOSVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
   * @return secretRef
  **/
  @ApiModelProperty(value = "SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1StorageOSVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   * @return volumeName
  **/
  @ApiModelProperty(value = "VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public IoK8sApiCoreV1StorageOSVolumeSource volumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }

   /**
   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   * @return volumeNamespace
  **/
  @ApiModelProperty(value = "VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
  public String getVolumeNamespace() {
    return volumeNamespace;
  }

  public void setVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1StorageOSVolumeSource ioK8sApiCoreV1StorageOSVolumeSource = (IoK8sApiCoreV1StorageOSVolumeSource) o;
    return Objects.equals(this.fsType, ioK8sApiCoreV1StorageOSVolumeSource.fsType) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1StorageOSVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, ioK8sApiCoreV1StorageOSVolumeSource.secretRef) &&
        Objects.equals(this.volumeName, ioK8sApiCoreV1StorageOSVolumeSource.volumeName) &&
        Objects.equals(this.volumeNamespace, ioK8sApiCoreV1StorageOSVolumeSource.volumeNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1StorageOSVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

