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
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 */
@ApiModel(description = "VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.")

public class IoK8sApiStorageV1VolumeAttachmentSource {
  @SerializedName("persistentVolumeName")
  private String persistentVolumeName = null;

  public IoK8sApiStorageV1VolumeAttachmentSource persistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return this;
  }

   /**
   * Name of the persistent volume to attach.
   * @return persistentVolumeName
  **/
  @ApiModelProperty(value = "Name of the persistent volume to attach.")
  public String getPersistentVolumeName() {
    return persistentVolumeName;
  }

  public void setPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiStorageV1VolumeAttachmentSource ioK8sApiStorageV1VolumeAttachmentSource = (IoK8sApiStorageV1VolumeAttachmentSource) o;
    return Objects.equals(this.persistentVolumeName, ioK8sApiStorageV1VolumeAttachmentSource.persistentVolumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentVolumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1VolumeAttachmentSource {\n");
    
    sb.append("    persistentVolumeName: ").append(toIndentedString(persistentVolumeName)).append("\n");
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

