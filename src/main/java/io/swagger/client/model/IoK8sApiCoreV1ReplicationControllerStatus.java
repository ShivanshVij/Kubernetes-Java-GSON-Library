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
import io.swagger.client.model.IoK8sApiCoreV1ReplicationControllerCondition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReplicationControllerStatus represents the current status of a replication controller.
 */
@ApiModel(description = "ReplicationControllerStatus represents the current status of a replication controller.")

public class IoK8sApiCoreV1ReplicationControllerStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("conditions")
  private List<IoK8sApiCoreV1ReplicationControllerCondition> conditions = null;

  @SerializedName("fullyLabeledReplicas")
  private Integer fullyLabeledReplicas = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  public IoK8sApiCoreV1ReplicationControllerStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
   * @return availableReplicas
  **/
  @ApiModelProperty(value = "The number of available replicas (ready for at least minReadySeconds) for this replication controller.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus conditions(List<IoK8sApiCoreV1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus addConditionsItem(IoK8sApiCoreV1ReplicationControllerCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<IoK8sApiCoreV1ReplicationControllerCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a replication controller&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Represents the latest available observations of a replication controller's current state.")
  public List<IoK8sApiCoreV1ReplicationControllerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

   /**
   * The number of pods that have labels matching the labels of the pod template of the replication controller.
   * @return fullyLabeledReplicas
  **/
  @ApiModelProperty(value = "The number of pods that have labels matching the labels of the pod template of the replication controller.")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration reflects the generation of the most recently observed replication controller.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed replication controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * The number of ready replicas for this replication controller.
   * @return readyReplicas
  **/
  @ApiModelProperty(value = "The number of ready replicas for this replication controller.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ReplicationControllerStatus ioK8sApiCoreV1ReplicationControllerStatus = (IoK8sApiCoreV1ReplicationControllerStatus) o;
    return Objects.equals(this.availableReplicas, ioK8sApiCoreV1ReplicationControllerStatus.availableReplicas) &&
        Objects.equals(this.conditions, ioK8sApiCoreV1ReplicationControllerStatus.conditions) &&
        Objects.equals(this.fullyLabeledReplicas, ioK8sApiCoreV1ReplicationControllerStatus.fullyLabeledReplicas) &&
        Objects.equals(this.observedGeneration, ioK8sApiCoreV1ReplicationControllerStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, ioK8sApiCoreV1ReplicationControllerStatus.readyReplicas) &&
        Objects.equals(this.replicas, ioK8sApiCoreV1ReplicationControllerStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ReplicationControllerStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

