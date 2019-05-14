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
import io.swagger.client.model.IoK8sApiNetworkingV1NetworkPolicyEgressRule;
import io.swagger.client.model.IoK8sApiNetworkingV1NetworkPolicyIngressRule;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkPolicySpec provides the specification of a NetworkPolicy
 */
@ApiModel(description = "NetworkPolicySpec provides the specification of a NetworkPolicy")

public class IoK8sApiNetworkingV1NetworkPolicySpec {
  @SerializedName("egress")
  private List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress = null;

  @SerializedName("ingress")
  private List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress = null;

  @SerializedName("podSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector = null;

  @SerializedName("policyTypes")
  private List<String> policyTypes = null;

  public IoK8sApiNetworkingV1NetworkPolicySpec egress(List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress) {
    this.egress = egress;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addEgressItem(IoK8sApiNetworkingV1NetworkPolicyEgressRule egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<IoK8sApiNetworkingV1NetworkPolicyEgressRule>();
    }
    this.egress.add(egressItem);
    return this;
  }

   /**
   * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
   * @return egress
  **/
  @ApiModelProperty(value = "List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8")
  public List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> getEgress() {
    return egress;
  }

  public void setEgress(List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress) {
    this.egress = egress;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec ingress(List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addIngressItem(IoK8sApiNetworkingV1NetworkPolicyIngressRule ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<IoK8sApiNetworkingV1NetworkPolicyIngressRule>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
   * @return ingress
  **/
  @ApiModelProperty(value = "List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)")
  public List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> getIngress() {
    return ingress;
  }

  public void setIngress(List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec podSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

   /**
   * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
   * @return podSelector
  **/
  @ApiModelProperty(required = true, value = "Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec policyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addPolicyTypesItem(String policyTypesItem) {
    if (this.policyTypes == null) {
      this.policyTypes = new ArrayList<String>();
    }
    this.policyTypes.add(policyTypesItem);
    return this;
  }

   /**
   * List of rule types that the NetworkPolicy relates to. Valid options are Ingress, Egress, or Ingress,Egress. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \&quot;Egress\&quot; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \&quot;Egress\&quot; (since such a policy would not include an Egress section and would otherwise default to just [ \&quot;Ingress\&quot; ]). This field is beta-level in 1.8
   * @return policyTypes
  **/
  @ApiModelProperty(value = "List of rule types that the NetworkPolicy relates to. Valid options are Ingress, Egress, or Ingress,Egress. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \"Egress\" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \"Egress\" (since such a policy would not include an Egress section and would otherwise default to just [ \"Ingress\" ]). This field is beta-level in 1.8")
  public List<String> getPolicyTypes() {
    return policyTypes;
  }

  public void setPolicyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiNetworkingV1NetworkPolicySpec ioK8sApiNetworkingV1NetworkPolicySpec = (IoK8sApiNetworkingV1NetworkPolicySpec) o;
    return Objects.equals(this.egress, ioK8sApiNetworkingV1NetworkPolicySpec.egress) &&
        Objects.equals(this.ingress, ioK8sApiNetworkingV1NetworkPolicySpec.ingress) &&
        Objects.equals(this.podSelector, ioK8sApiNetworkingV1NetworkPolicySpec.podSelector) &&
        Objects.equals(this.policyTypes, ioK8sApiNetworkingV1NetworkPolicySpec.policyTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egress, ingress, podSelector, policyTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicySpec {\n");
    
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
    sb.append("    policyTypes: ").append(toIndentedString(policyTypes)).append("\n");
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

