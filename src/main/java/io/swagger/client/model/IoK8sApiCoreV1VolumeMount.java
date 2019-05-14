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
 * VolumeMount describes a mounting of a Volume within a container.
 */
@ApiModel(description = "VolumeMount describes a mounting of a Volume within a container.")

public class IoK8sApiCoreV1VolumeMount {
  @SerializedName("mountPath")
  private String mountPath = null;

  @SerializedName("mountPropagation")
  private String mountPropagation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("subPath")
  private String subPath = null;

  public IoK8sApiCoreV1VolumeMount mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

   /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
  **/
  @ApiModelProperty(required = true, value = "Path within the container at which the volume should be mounted.  Must not contain ':'.")
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  public IoK8sApiCoreV1VolumeMount mountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return this;
  }

   /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
   * @return mountPropagation
  **/
  @ApiModelProperty(value = "mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.")
  public String getMountPropagation() {
    return mountPropagation;
  }

  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }

  public IoK8sApiCoreV1VolumeMount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This must match the Name of a Volume.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1VolumeMount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1VolumeMount subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }

   /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
  **/
  @ApiModelProperty(value = "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VolumeMount ioK8sApiCoreV1VolumeMount = (IoK8sApiCoreV1VolumeMount) o;
    return Objects.equals(this.mountPath, ioK8sApiCoreV1VolumeMount.mountPath) &&
        Objects.equals(this.mountPropagation, ioK8sApiCoreV1VolumeMount.mountPropagation) &&
        Objects.equals(this.name, ioK8sApiCoreV1VolumeMount.name) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1VolumeMount.readOnly) &&
        Objects.equals(this.subPath, ioK8sApiCoreV1VolumeMount.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, subPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeMount {\n");
    
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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

