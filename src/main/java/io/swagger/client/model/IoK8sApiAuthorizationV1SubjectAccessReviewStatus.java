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
 * SubjectAccessReviewStatus
 */
@ApiModel(description = "SubjectAccessReviewStatus")

public class IoK8sApiAuthorizationV1SubjectAccessReviewStatus {
  @SerializedName("allowed")
  private Boolean allowed = null;

  @SerializedName("denied")
  private Boolean denied = null;

  @SerializedName("evaluationError")
  private String evaluationError = null;

  @SerializedName("reason")
  private String reason = null;

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Allowed is required. True if the action would be allowed, false otherwise.
   * @return allowed
  **/
  @ApiModelProperty(required = true, value = "Allowed is required. True if the action would be allowed, false otherwise.")
  public Boolean isAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus denied(Boolean denied) {
    this.denied = denied;
    return this;
  }

   /**
   * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
   * @return denied
  **/
  @ApiModelProperty(value = "Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.")
  public Boolean isDenied() {
    return denied;
  }

  public void setDenied(Boolean denied) {
    this.denied = denied;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

   /**
   * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
   * @return evaluationError
  **/
  @ApiModelProperty(value = "EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.")
  public String getEvaluationError() {
    return evaluationError;
  }

  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason is optional.  It indicates why a request was allowed or denied.
   * @return reason
  **/
  @ApiModelProperty(value = "Reason is optional.  It indicates why a request was allowed or denied.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAuthorizationV1SubjectAccessReviewStatus ioK8sApiAuthorizationV1SubjectAccessReviewStatus = (IoK8sApiAuthorizationV1SubjectAccessReviewStatus) o;
    return Objects.equals(this.allowed, ioK8sApiAuthorizationV1SubjectAccessReviewStatus.allowed) &&
        Objects.equals(this.denied, ioK8sApiAuthorizationV1SubjectAccessReviewStatus.denied) &&
        Objects.equals(this.evaluationError, ioK8sApiAuthorizationV1SubjectAccessReviewStatus.evaluationError) &&
        Objects.equals(this.reason, ioK8sApiAuthorizationV1SubjectAccessReviewStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, denied, evaluationError, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SubjectAccessReviewStatus {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

