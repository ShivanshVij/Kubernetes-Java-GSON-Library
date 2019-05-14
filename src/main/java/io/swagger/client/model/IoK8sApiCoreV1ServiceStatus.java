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
import io.swagger.client.model.IoK8sApiCoreV1LoadBalancerStatus;
import java.io.IOException;

/**
 * ServiceStatus represents the current status of a service.
 */
@ApiModel(description = "ServiceStatus represents the current status of a service.")

public class IoK8sApiCoreV1ServiceStatus {
  @SerializedName("loadBalancer")
  private IoK8sApiCoreV1LoadBalancerStatus loadBalancer = null;

  public IoK8sApiCoreV1ServiceStatus loadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

   /**
   * LoadBalancer contains the current status of the load-balancer, if one is present.
   * @return loadBalancer
  **/
  @ApiModelProperty(value = "LoadBalancer contains the current status of the load-balancer, if one is present.")
  public IoK8sApiCoreV1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ServiceStatus ioK8sApiCoreV1ServiceStatus = (IoK8sApiCoreV1ServiceStatus) o;
    return Objects.equals(this.loadBalancer, ioK8sApiCoreV1ServiceStatus.loadBalancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServiceStatus {\n");
    
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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
