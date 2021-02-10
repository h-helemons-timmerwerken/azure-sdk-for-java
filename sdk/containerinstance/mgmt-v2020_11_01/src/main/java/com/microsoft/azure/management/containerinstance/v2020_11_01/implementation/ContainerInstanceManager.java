/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerGroups;
import com.microsoft.azure.management.containerinstance.v2020_11_01.Operations;
import com.microsoft.azure.management.containerinstance.v2020_11_01.Locations;
import com.microsoft.azure.management.containerinstance.v2020_11_01.Containers;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ContainerInstance resource management.
 */
public final class ContainerInstanceManager extends ManagerCore<ContainerInstanceManager, ContainerInstanceManagementClientImpl> {
    private ContainerGroups containerGroups;
    private Operations operations;
    private Locations locations;
    private Containers containers;
    /**
    * Get a Configurable instance that can be used to create ContainerInstanceManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ContainerInstanceManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ContainerInstanceManager that exposes ContainerInstance resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ContainerInstanceManager
    */
    public static ContainerInstanceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ContainerInstanceManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ContainerInstanceManager that exposes ContainerInstance resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ContainerInstanceManager
    */
    public static ContainerInstanceManager authenticate(RestClient restClient, String subscriptionId) {
        return new ContainerInstanceManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ContainerInstanceManager that exposes ContainerInstance management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ContainerInstance management API entry points that work across subscriptions
        */
        ContainerInstanceManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ContainerGroups.
     */
    public ContainerGroups containerGroups() {
        if (this.containerGroups == null) {
            this.containerGroups = new ContainerGroupsImpl(this);
        }
        return this.containerGroups;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
     * @return Entry point to manage Containers.
     */
    public Containers containers() {
        if (this.containers == null) {
            this.containers = new ContainersImpl(this);
        }
        return this.containers;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ContainerInstanceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ContainerInstanceManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ContainerInstanceManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ContainerInstanceManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
