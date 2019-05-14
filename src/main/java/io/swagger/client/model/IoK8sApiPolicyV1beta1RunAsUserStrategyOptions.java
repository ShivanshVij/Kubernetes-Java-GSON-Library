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
import io.swagger.client.model.IoK8sApiPolicyV1beta1IDRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@ApiModel(description = "RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.")

public class IoK8sApiPolicyV1beta1RunAsUserStrategyOptions {
  @SerializedName("ranges")
  private List<IoK8sApiPolicyV1beta1IDRange> ranges = null;

  @SerializedName("rule")
  private String rule = null;

  public IoK8sApiPolicyV1beta1RunAsUserStrategyOptions ranges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public IoK8sApiPolicyV1beta1RunAsUserStrategyOptions addRangesItem(IoK8sApiPolicyV1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IoK8sApiPolicyV1beta1IDRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @ApiModelProperty(value = "ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.")
  public List<IoK8sApiPolicyV1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public IoK8sApiPolicyV1beta1RunAsUserStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "rule is the strategy that will dictate the allowable RunAsUser values that may be set.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiPolicyV1beta1RunAsUserStrategyOptions ioK8sApiPolicyV1beta1RunAsUserStrategyOptions = (IoK8sApiPolicyV1beta1RunAsUserStrategyOptions) o;
    return Objects.equals(this.ranges, ioK8sApiPolicyV1beta1RunAsUserStrategyOptions.ranges) &&
        Objects.equals(this.rule, ioK8sApiPolicyV1beta1RunAsUserStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1RunAsUserStrategyOptions {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

