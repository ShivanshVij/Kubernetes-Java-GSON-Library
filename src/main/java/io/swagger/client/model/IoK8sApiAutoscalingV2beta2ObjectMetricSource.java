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
import io.swagger.client.model.IoK8sApiAutoscalingV2beta2CrossVersionObjectReference;
import io.swagger.client.model.IoK8sApiAutoscalingV2beta2MetricIdentifier;
import io.swagger.client.model.IoK8sApiAutoscalingV2beta2MetricTarget;
import java.io.IOException;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")

public class IoK8sApiAutoscalingV2beta2ObjectMetricSource {
  @SerializedName("describedObject")
  private IoK8sApiAutoscalingV2beta2CrossVersionObjectReference describedObject = null;

  @SerializedName("metric")
  private IoK8sApiAutoscalingV2beta2MetricIdentifier metric = null;

  @SerializedName("target")
  private IoK8sApiAutoscalingV2beta2MetricTarget target = null;

  public IoK8sApiAutoscalingV2beta2ObjectMetricSource describedObject(IoK8sApiAutoscalingV2beta2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
    return this;
  }

   /**
   * Get describedObject
   * @return describedObject
  **/
  @ApiModelProperty(required = true, value = "")
  public IoK8sApiAutoscalingV2beta2CrossVersionObjectReference getDescribedObject() {
    return describedObject;
  }

  public void setDescribedObject(IoK8sApiAutoscalingV2beta2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
  }

  public IoK8sApiAutoscalingV2beta2ObjectMetricSource metric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

   /**
   * metric identifies the target metric by name and selector
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "metric identifies the target metric by name and selector")
  public IoK8sApiAutoscalingV2beta2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
  }

  public IoK8sApiAutoscalingV2beta2ObjectMetricSource target(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
    return this;
  }

   /**
   * target specifies the target value for the given metric
   * @return target
  **/
  @ApiModelProperty(required = true, value = "target specifies the target value for the given metric")
  public IoK8sApiAutoscalingV2beta2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta2ObjectMetricSource ioK8sApiAutoscalingV2beta2ObjectMetricSource = (IoK8sApiAutoscalingV2beta2ObjectMetricSource) o;
    return Objects.equals(this.describedObject, ioK8sApiAutoscalingV2beta2ObjectMetricSource.describedObject) &&
        Objects.equals(this.metric, ioK8sApiAutoscalingV2beta2ObjectMetricSource.metric) &&
        Objects.equals(this.target, ioK8sApiAutoscalingV2beta2ObjectMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describedObject, metric, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2ObjectMetricSource {\n");
    
    sb.append("    describedObject: ").append(toIndentedString(describedObject)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
