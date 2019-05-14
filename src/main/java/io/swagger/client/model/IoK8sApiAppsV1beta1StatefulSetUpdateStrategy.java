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
import io.swagger.client.model.IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy;
import java.io.IOException;

/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 */
@ApiModel(description = "StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")

public class IoK8sApiAppsV1beta1StatefulSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiAppsV1beta1StatefulSetUpdateStrategy rollingUpdate(IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.")
  public IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public IoK8sApiAppsV1beta1StatefulSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates the type of the StatefulSetUpdateStrategy.
   * @return type
  **/
  @ApiModelProperty(value = "Type indicates the type of the StatefulSetUpdateStrategy.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAppsV1beta1StatefulSetUpdateStrategy ioK8sApiAppsV1beta1StatefulSetUpdateStrategy = (IoK8sApiAppsV1beta1StatefulSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, ioK8sApiAppsV1beta1StatefulSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, ioK8sApiAppsV1beta1StatefulSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1beta1StatefulSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
