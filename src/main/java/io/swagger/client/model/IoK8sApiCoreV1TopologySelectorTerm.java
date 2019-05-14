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
import io.swagger.client.model.IoK8sApiCoreV1TopologySelectorLabelRequirement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
@ApiModel(description = "A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.")

public class IoK8sApiCoreV1TopologySelectorTerm {
  @SerializedName("matchLabelExpressions")
  private List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions = null;

  public IoK8sApiCoreV1TopologySelectorTerm matchLabelExpressions(List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }

  public IoK8sApiCoreV1TopologySelectorTerm addMatchLabelExpressionsItem(IoK8sApiCoreV1TopologySelectorLabelRequirement matchLabelExpressionsItem) {
    if (this.matchLabelExpressions == null) {
      this.matchLabelExpressions = new ArrayList<IoK8sApiCoreV1TopologySelectorLabelRequirement>();
    }
    this.matchLabelExpressions.add(matchLabelExpressionsItem);
    return this;
  }

   /**
   * A list of topology selector requirements by labels.
   * @return matchLabelExpressions
  **/
  @ApiModelProperty(value = "A list of topology selector requirements by labels.")
  public List<IoK8sApiCoreV1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions;
  }

  public void setMatchLabelExpressions(List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1TopologySelectorTerm ioK8sApiCoreV1TopologySelectorTerm = (IoK8sApiCoreV1TopologySelectorTerm) o;
    return Objects.equals(this.matchLabelExpressions, ioK8sApiCoreV1TopologySelectorTerm.matchLabelExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchLabelExpressions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TopologySelectorTerm {\n");
    
    sb.append("    matchLabelExpressions: ").append(toIndentedString(matchLabelExpressions)).append("\n");
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
