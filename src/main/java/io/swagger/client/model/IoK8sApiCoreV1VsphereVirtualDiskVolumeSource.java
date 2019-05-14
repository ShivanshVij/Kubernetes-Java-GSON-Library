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
import java.io.IOException;

/**
 * Represents a vSphere volume resource.
 */
@ApiModel(description = "Represents a vSphere volume resource.")

public class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("storagePolicyID")
  private String storagePolicyID = null;

  @SerializedName("storagePolicyName")
  private String storagePolicyName = null;

  @SerializedName("volumePath")
  private String volumePath = null;

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource fsType(String fsType) {
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

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   * @return storagePolicyID
  **/
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }

  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile name.
   * @return storagePolicyName
  **/
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

   /**
   * Path that identifies vSphere volume vmdk
   * @return volumePath
  **/
  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")
  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VsphereVirtualDiskVolumeSource ioK8sApiCoreV1VsphereVirtualDiskVolumeSource = (IoK8sApiCoreV1VsphereVirtualDiskVolumeSource) o;
    return Objects.equals(this.fsType, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.fsType) &&
        Objects.equals(this.storagePolicyID, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.storagePolicyID) &&
        Objects.equals(this.storagePolicyName, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.storagePolicyName) &&
        Objects.equals(this.volumePath, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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

