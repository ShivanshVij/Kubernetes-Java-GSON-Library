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
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteOptions may be provided when deleting an API object.
 */
@ApiModel(description = "DeleteOptions may be provided when deleting an API object.")

public class IoK8sApimachineryPkgApisMetaV1DeleteOptions {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("dryRun")
  private List<String> dryRun = null;

  @SerializedName("gracePeriodSeconds")
  private Long gracePeriodSeconds = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("orphanDependents")
  private Boolean orphanDependents = null;

  @SerializedName("preconditions")
  private IoK8sApimachineryPkgApisMetaV1Preconditions preconditions = null;

  @SerializedName("propagationPolicy")
  private String propagationPolicy = null;

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions apiVersion(String apiVersion) {
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

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions dryRun(List<String> dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<String>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

   /**
   * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
   * @return dryRun
  **/
  @ApiModelProperty(value = "When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed")
  public List<String> getDryRun() {
    return dryRun;
  }

  public void setDryRun(List<String> dryRun) {
    this.dryRun = dryRun;
  }

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions gracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

   /**
   * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
   * @return gracePeriodSeconds
  **/
  @ApiModelProperty(value = "The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.")
  public Long getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }

  public void setGracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions kind(String kind) {
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

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions orphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
    return this;
  }

   /**
   * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both.
   * @return orphanDependents
  **/
  @ApiModelProperty(value = "Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.")
  public Boolean isOrphanDependents() {
    return orphanDependents;
  }

  public void setOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
  }

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions preconditions(IoK8sApimachineryPkgApisMetaV1Preconditions preconditions) {
    this.preconditions = preconditions;
    return this;
  }

   /**
   * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned.
   * @return preconditions
  **/
  @ApiModelProperty(value = "Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned.")
  public IoK8sApimachineryPkgApisMetaV1Preconditions getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(IoK8sApimachineryPkgApisMetaV1Preconditions preconditions) {
    this.preconditions = preconditions;
  }

  public IoK8sApimachineryPkgApisMetaV1DeleteOptions propagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
    return this;
  }

   /**
   * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   * @return propagationPolicy
  **/
  @ApiModelProperty(value = "Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.")
  public String getPropagationPolicy() {
    return propagationPolicy;
  }

  public void setPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1DeleteOptions ioK8sApimachineryPkgApisMetaV1DeleteOptions = (IoK8sApimachineryPkgApisMetaV1DeleteOptions) o;
    return Objects.equals(this.apiVersion, ioK8sApimachineryPkgApisMetaV1DeleteOptions.apiVersion) &&
        Objects.equals(this.dryRun, ioK8sApimachineryPkgApisMetaV1DeleteOptions.dryRun) &&
        Objects.equals(this.gracePeriodSeconds, ioK8sApimachineryPkgApisMetaV1DeleteOptions.gracePeriodSeconds) &&
        Objects.equals(this.kind, ioK8sApimachineryPkgApisMetaV1DeleteOptions.kind) &&
        Objects.equals(this.orphanDependents, ioK8sApimachineryPkgApisMetaV1DeleteOptions.orphanDependents) &&
        Objects.equals(this.preconditions, ioK8sApimachineryPkgApisMetaV1DeleteOptions.preconditions) &&
        Objects.equals(this.propagationPolicy, ioK8sApimachineryPkgApisMetaV1DeleteOptions.propagationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, dryRun, gracePeriodSeconds, kind, orphanDependents, preconditions, propagationPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1DeleteOptions {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    orphanDependents: ").append(toIndentedString(orphanDependents)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
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

