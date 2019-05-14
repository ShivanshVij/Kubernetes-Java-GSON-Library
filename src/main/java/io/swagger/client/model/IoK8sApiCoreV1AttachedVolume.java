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
 * AttachedVolume describes a volume attached to a node
 */
@ApiModel(description = "AttachedVolume describes a volume attached to a node")

public class IoK8sApiCoreV1AttachedVolume {
  @SerializedName("devicePath")
  private String devicePath = null;

  @SerializedName("name")
  private String name = null;

  public IoK8sApiCoreV1AttachedVolume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

   /**
   * DevicePath represents the device path where the volume should be available
   * @return devicePath
  **/
  @ApiModelProperty(required = true, value = "DevicePath represents the device path where the volume should be available")
  public String getDevicePath() {
    return devicePath;
  }

  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  public IoK8sApiCoreV1AttachedVolume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the attached volume
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the attached volume")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1AttachedVolume ioK8sApiCoreV1AttachedVolume = (IoK8sApiCoreV1AttachedVolume) o;
    return Objects.equals(this.devicePath, ioK8sApiCoreV1AttachedVolume.devicePath) &&
        Objects.equals(this.name, ioK8sApiCoreV1AttachedVolume.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AttachedVolume {\n");
    
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

