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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIGroup;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RbacAuthorizationApi
 */
@Ignore
public class RbacAuthorizationApiTest {

    private final RbacAuthorizationApi api = new RbacAuthorizationApi();

    
    /**
     * 
     *
     * get information of a group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRbacAuthorizationAPIGroupTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIGroup response = api.getRbacAuthorizationAPIGroup();

        // TODO: test validations
    }
    
}