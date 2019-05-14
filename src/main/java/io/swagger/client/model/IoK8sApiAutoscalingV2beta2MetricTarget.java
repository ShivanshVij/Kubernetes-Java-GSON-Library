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
 * MetricTarget defines the target value, average value, or average utilization of a specific metric
 */
@ApiModel(description = "MetricTarget defines the target value, average value, or average utilization of a specific metric")

public class IoK8sApiAutoscalingV2beta2MetricTarget {
  @SerializedName("averageUtilization")
  private Integer averageUtilization = null;

  @SerializedName("averageValue")
  private String averageValue = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  public IoK8sApiAutoscalingV2beta2MetricTarget averageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return this;
  }

   /**
   * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
   * @return averageUtilization
  **/
  @ApiModelProperty(value = "averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type")
  public Integer getAverageUtilization() {
    return averageUtilization;
  }

  public void setAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
  }

  public IoK8sApiAutoscalingV2beta2MetricTarget averageValue(String averageValue) {
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

  public IoK8sApiAutoscalingV2beta2MetricTarget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type represents whether the metric type is Utilization, Value, or AverageValue
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type represents whether the metric type is Utilization, Value, or AverageValue")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAutoscalingV2beta2MetricTarget value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value is the target value of the metric (as a quantity).
   * @return value
  **/
  @ApiModelProperty(value = "value is the target value of the metric (as a quantity).")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta2MetricTarget ioK8sApiAutoscalingV2beta2MetricTarget = (IoK8sApiAutoscalingV2beta2MetricTarget) o;
    return Objects.equals(this.averageUtilization, ioK8sApiAutoscalingV2beta2MetricTarget.averageUtilization) &&
        Objects.equals(this.averageValue, ioK8sApiAutoscalingV2beta2MetricTarget.averageValue) &&
        Objects.equals(this.type, ioK8sApiAutoscalingV2beta2MetricTarget.type) &&
        Objects.equals(this.value, ioK8sApiAutoscalingV2beta2MetricTarget.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageUtilization, averageValue, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2MetricTarget {\n");
    
    sb.append("    averageUtilization: ").append(toIndentedString(averageUtilization)).append("\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

