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
import io.swagger.client.model.IoK8sApiNetworkingV1NetworkPolicyPeer;
import io.swagger.client.model.IoK8sApiNetworkingV1NetworkPolicyPort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 */
@ApiModel(description = "NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8")

public class IoK8sApiNetworkingV1NetworkPolicyEgressRule {
  @SerializedName("ports")
  private List<IoK8sApiNetworkingV1NetworkPolicyPort> ports = null;

  @SerializedName("to")
  private List<IoK8sApiNetworkingV1NetworkPolicyPeer> to = null;

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule ports(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule addPortsItem(IoK8sApiNetworkingV1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<IoK8sApiNetworkingV1NetworkPolicyPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @ApiModelProperty(value = "List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<IoK8sApiNetworkingV1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule to(List<IoK8sApiNetworkingV1NetworkPolicyPeer> to) {
    this.to = to;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule addToItem(IoK8sApiNetworkingV1NetworkPolicyPeer toItem) {
    if (this.to == null) {
      this.to = new ArrayList<IoK8sApiNetworkingV1NetworkPolicyPeer>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
   * @return to
  **/
  @ApiModelProperty(value = "List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.")
  public List<IoK8sApiNetworkingV1NetworkPolicyPeer> getTo() {
    return to;
  }

  public void setTo(List<IoK8sApiNetworkingV1NetworkPolicyPeer> to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiNetworkingV1NetworkPolicyEgressRule ioK8sApiNetworkingV1NetworkPolicyEgressRule = (IoK8sApiNetworkingV1NetworkPolicyEgressRule) o;
    return Objects.equals(this.ports, ioK8sApiNetworkingV1NetworkPolicyEgressRule.ports) &&
        Objects.equals(this.to, ioK8sApiNetworkingV1NetworkPolicyEgressRule.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyEgressRule {\n");
    
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

