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
import io.swagger.client.model.IoK8sApiAutoscalingV2beta1CrossVersionObjectReference;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
import java.io.IOException;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")

public class IoK8sApiAutoscalingV2beta1ObjectMetricSource {
  @SerializedName("averageValue")
  private String averageValue = null;

  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("selector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @SerializedName("target")
  private IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target = null;

  @SerializedName("targetValue")
  private String targetValue = null;

  public IoK8sApiAutoscalingV2beta1ObjectMetricSource averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

   /**
   * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
   * @return averageValue
  **/
  @ApiModelProperty(value = "averageValue is the target value of the average of the metric across all relevant pods (as a quantity)")
  public String getAverageValue() {
    return averageValue;
  }

  public void setAverageValue(String averageValue) {
    this.averageValue = averageValue;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricSource metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question.
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricSource selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricSource target(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target) {
    this.target = target;
    return this;
  }

   /**
   * target is the described Kubernetes object.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "target is the described Kubernetes object.")
  public IoK8sApiAutoscalingV2beta1CrossVersionObjectReference getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target) {
    this.target = target;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricSource targetValue(String targetValue) {
    this.targetValue = targetValue;
    return this;
  }

   /**
   * targetValue is the target value of the metric (as a quantity).
   * @return targetValue
  **/
  @ApiModelProperty(required = true, value = "targetValue is the target value of the metric (as a quantity).")
  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta1ObjectMetricSource ioK8sApiAutoscalingV2beta1ObjectMetricSource = (IoK8sApiAutoscalingV2beta1ObjectMetricSource) o;
    return Objects.equals(this.averageValue, ioK8sApiAutoscalingV2beta1ObjectMetricSource.averageValue) &&
        Objects.equals(this.metricName, ioK8sApiAutoscalingV2beta1ObjectMetricSource.metricName) &&
        Objects.equals(this.selector, ioK8sApiAutoscalingV2beta1ObjectMetricSource.selector) &&
        Objects.equals(this.target, ioK8sApiAutoscalingV2beta1ObjectMetricSource.target) &&
        Objects.equals(this.targetValue, ioK8sApiAutoscalingV2beta1ObjectMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageValue, metricName, selector, target, targetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ObjectMetricSource {\n");
    
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
