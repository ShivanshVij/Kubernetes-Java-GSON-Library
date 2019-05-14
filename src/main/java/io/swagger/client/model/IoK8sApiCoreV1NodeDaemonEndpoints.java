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
import io.swagger.client.model.IoK8sApiCoreV1DaemonEndpoint;
import java.io.IOException;

/**
 * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 */
@ApiModel(description = "NodeDaemonEndpoints lists ports opened by daemons running on the Node.")

public class IoK8sApiCoreV1NodeDaemonEndpoints {
  @SerializedName("kubeletEndpoint")
  private IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint = null;

  public IoK8sApiCoreV1NodeDaemonEndpoints kubeletEndpoint(IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
    return this;
  }

   /**
   * Endpoint on which Kubelet is listening.
   * @return kubeletEndpoint
  **/
  @ApiModelProperty(value = "Endpoint on which Kubelet is listening.")
  public IoK8sApiCoreV1DaemonEndpoint getKubeletEndpoint() {
    return kubeletEndpoint;
  }

  public void setKubeletEndpoint(IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeDaemonEndpoints ioK8sApiCoreV1NodeDaemonEndpoints = (IoK8sApiCoreV1NodeDaemonEndpoints) o;
    return Objects.equals(this.kubeletEndpoint, ioK8sApiCoreV1NodeDaemonEndpoints.kubeletEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeDaemonEndpoints {\n");
    
    sb.append("    kubeletEndpoint: ").append(toIndentedString(kubeletEndpoint)).append("\n");
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

