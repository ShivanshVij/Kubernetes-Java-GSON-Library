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
import io.swagger.client.model.IoK8sApiCoreV1ResourceQuotaSpec;
import io.swagger.client.model.IoK8sApiCoreV1ResourceQuotaStatus;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import java.io.IOException;

/**
 * ResourceQuota sets aggregate quota restrictions enforced per namespace
 */
@ApiModel(description = "ResourceQuota sets aggregate quota restrictions enforced per namespace")

public class IoK8sApiCoreV1ResourceQuota {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("spec")
  private IoK8sApiCoreV1ResourceQuotaSpec spec = null;

  @SerializedName("status")
  private IoK8sApiCoreV1ResourceQuotaStatus status = null;

  public IoK8sApiCoreV1ResourceQuota apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiCoreV1ResourceQuota kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiCoreV1ResourceQuota metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiCoreV1ResourceQuota spec(IoK8sApiCoreV1ResourceQuotaSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec defines the desired quota. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @ApiModelProperty(value = "Spec defines the desired quota. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public IoK8sApiCoreV1ResourceQuotaSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiCoreV1ResourceQuotaSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiCoreV1ResourceQuota status(IoK8sApiCoreV1ResourceQuotaStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status defines the actual enforced quota and its current usage. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return status
  **/
  @ApiModelProperty(value = "Status defines the actual enforced quota and its current usage. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public IoK8sApiCoreV1ResourceQuotaStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiCoreV1ResourceQuotaStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ResourceQuota ioK8sApiCoreV1ResourceQuota = (IoK8sApiCoreV1ResourceQuota) o;
    return Objects.equals(this.apiVersion, ioK8sApiCoreV1ResourceQuota.apiVersion) &&
        Objects.equals(this.kind, ioK8sApiCoreV1ResourceQuota.kind) &&
        Objects.equals(this.metadata, ioK8sApiCoreV1ResourceQuota.metadata) &&
        Objects.equals(this.spec, ioK8sApiCoreV1ResourceQuota.spec) &&
        Objects.equals(this.status, ioK8sApiCoreV1ResourceQuota.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceQuota {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

