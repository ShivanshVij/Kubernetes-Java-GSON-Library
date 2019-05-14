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
 * CustomResourceColumnDefinition specifies a column for server side printing.
 */
@ApiModel(description = "CustomResourceColumnDefinition specifies a column for server side printing.")

public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition {
  @SerializedName("JSONPath")
  private String jsONPath = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition jsONPath(String jsONPath) {
    this.jsONPath = jsONPath;
    return this;
  }

   /**
   * JSONPath is a simple JSON path, i.e. with array notation.
   * @return jsONPath
  **/
  @ApiModelProperty(required = true, value = "JSONPath is a simple JSON path, i.e. with array notation.")
  public String getJsONPath() {
    return jsONPath;
  }

  public void setJsONPath(String jsONPath) {
    this.jsONPath = jsONPath;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description is a human readable description of this column.
   * @return description
  **/
  @ApiModelProperty(value = "description is a human readable description of this column.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition format(String format) {
    this.format = format;
    return this;
  }

   /**
   * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more.
   * @return format
  **/
  @ApiModelProperty(value = "format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is a human readable name for the column.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is a human readable name for the column.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a higher priority.
   * @return priority
  **/
  @ApiModelProperty(value = "priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a higher priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition = (IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition) o;
    return Objects.equals(this.jsONPath, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.jsONPath) &&
        Objects.equals(this.description, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.description) &&
        Objects.equals(this.format, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.format) &&
        Objects.equals(this.name, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.name) &&
        Objects.equals(this.priority, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.priority) &&
        Objects.equals(this.type, ioK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsONPath, description, format, name, priority, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition {\n");
    
    sb.append("    jsONPath: ").append(toIndentedString(jsONPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

