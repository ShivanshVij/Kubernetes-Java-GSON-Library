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
import io.swagger.client.model.IoK8sApiEventsV1beta1Event;
import io.swagger.client.model.IoK8sApiEventsV1beta1EventList;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1Patch;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1Status;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsV1beta1Api
 */
@Ignore
public class EventsV1beta1ApiTest {

    private final EventsV1beta1Api api = new EventsV1beta1Api();

    
    /**
     * 
     *
     * create an Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEventsV1beta1NamespacedEventTest() throws ApiException {
        String namespace = null;
        IoK8sApiEventsV1beta1Event body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        IoK8sApiEventsV1beta1Event response = api.createEventsV1beta1NamespacedEvent(namespace, body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEventsV1beta1CollectionNamespacedEventTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteEventsV1beta1CollectionNamespacedEvent(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEventsV1beta1NamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteEventsV1beta1NamespacedEvent(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsV1beta1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getEventsV1beta1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEventsV1beta1EventForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiEventsV1beta1EventList response = api.listEventsV1beta1EventForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEventsV1beta1NamespacedEventTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiEventsV1beta1EventList response = api.listEventsV1beta1NamespacedEvent(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchEventsV1beta1NamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        IoK8sApiEventsV1beta1Event response = api.patchEventsV1beta1NamespacedEvent(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readEventsV1beta1NamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiEventsV1beta1Event response = api.readEventsV1beta1NamespacedEvent(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceEventsV1beta1NamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiEventsV1beta1Event body = null;
        String pretty = null;
        String dryRun = null;
        IoK8sApiEventsV1beta1Event response = api.replaceEventsV1beta1NamespacedEvent(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of Event. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchEventsV1beta1EventListForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchEventsV1beta1EventListForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind Event. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchEventsV1beta1NamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchEventsV1beta1NamespacedEvent(name, namespace, _continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of Event. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchEventsV1beta1NamespacedEventListTest() throws ApiException {
        String namespace = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchEventsV1beta1NamespacedEventList(namespace, _continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}
