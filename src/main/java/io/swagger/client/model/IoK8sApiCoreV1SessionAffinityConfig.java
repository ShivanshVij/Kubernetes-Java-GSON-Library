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
import io.swagger.client.model.IoK8sApiCoreV1ClientIPConfig;
import java.io.IOException;

/**
 * SessionAffinityConfig represents the configurations of session affinity.
 */
@ApiModel(description = "SessionAffinityConfig represents the configurations of session affinity.")

public class IoK8sApiCoreV1SessionAffinityConfig {
  @SerializedName("clientIP")
  private IoK8sApiCoreV1ClientIPConfig clientIP = null;

  public IoK8sApiCoreV1SessionAffinityConfig clientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
    return this;
  }

   /**
   * clientIP contains the configurations of Client IP based session affinity.
   * @return clientIP
  **/
  @ApiModelProperty(value = "clientIP contains the configurations of Client IP based session affinity.")
  public IoK8sApiCoreV1ClientIPConfig getClientIP() {
    return clientIP;
  }

  public void setClientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1SessionAffinityConfig ioK8sApiCoreV1SessionAffinityConfig = (IoK8sApiCoreV1SessionAffinityConfig) o;
    return Objects.equals(this.clientIP, ioK8sApiCoreV1SessionAffinityConfig.clientIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SessionAffinityConfig {\n");
    
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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

