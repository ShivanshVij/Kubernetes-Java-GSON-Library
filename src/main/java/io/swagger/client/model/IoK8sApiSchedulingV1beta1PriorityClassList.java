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
import io.swagger.client.model.IoK8sApiSchedulingV1beta1PriorityClass;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ListMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PriorityClassList is a collection of priority classes.
 */
@ApiModel(description = "PriorityClassList is a collection of priority classes.")

public class IoK8sApiSchedulingV1beta1PriorityClassList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<IoK8sApiSchedulingV1beta1PriorityClass> items = new ArrayList<IoK8sApiSchedulingV1beta1PriorityClass>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;

  public IoK8sApiSchedulingV1beta1PriorityClassList apiVersion(String apiVersion) {
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

  public IoK8sApiSchedulingV1beta1PriorityClassList items(List<IoK8sApiSchedulingV1beta1PriorityClass> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiSchedulingV1beta1PriorityClassList addItemsItem(IoK8sApiSchedulingV1beta1PriorityClass itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items is the list of PriorityClasses
   * @return items
  **/
  @ApiModelProperty(required = true, value = "items is the list of PriorityClasses")
  public List<IoK8sApiSchedulingV1beta1PriorityClass> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiSchedulingV1beta1PriorityClass> items) {
    this.items = items;
  }

  public IoK8sApiSchedulingV1beta1PriorityClassList kind(String kind) {
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

  public IoK8sApiSchedulingV1beta1PriorityClassList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard list metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiSchedulingV1beta1PriorityClassList ioK8sApiSchedulingV1beta1PriorityClassList = (IoK8sApiSchedulingV1beta1PriorityClassList) o;
    return Objects.equals(this.apiVersion, ioK8sApiSchedulingV1beta1PriorityClassList.apiVersion) &&
        Objects.equals(this.items, ioK8sApiSchedulingV1beta1PriorityClassList.items) &&
        Objects.equals(this.kind, ioK8sApiSchedulingV1beta1PriorityClassList.kind) &&
        Objects.equals(this.metadata, ioK8sApiSchedulingV1beta1PriorityClassList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiSchedulingV1beta1PriorityClassList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

