/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerPort;
import com.microsoft.azure.management.containerinstance.v2020_11_01.EnvironmentVariable;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerPropertiesInstanceView;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ResourceRequirements;
import com.microsoft.azure.management.containerinstance.v2020_11_01.VolumeMount;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerProbe;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A container instance.
 */
@JsonFlatten
public class ContainerInner {
    /**
     * The user-provided name of the container instance.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The name of the image used to create the container instance.
     */
    @JsonProperty(value = "properties.image", required = true)
    private String image;

    /**
     * The commands to execute within the container instance in exec form.
     */
    @JsonProperty(value = "properties.command")
    private List<String> command;

    /**
     * The exposed ports on the container instance.
     */
    @JsonProperty(value = "properties.ports")
    private List<ContainerPort> ports;

    /**
     * The environment variables to set in the container instance.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /**
     * The instance view of the container instance. Only valid in response.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerPropertiesInstanceView instanceView;

    /**
     * The resource requirements of the container instance.
     */
    @JsonProperty(value = "properties.resources", required = true)
    private ResourceRequirements resources;

    /**
     * The volume mounts available to the container instance.
     */
    @JsonProperty(value = "properties.volumeMounts")
    private List<VolumeMount> volumeMounts;

    /**
     * The liveness probe.
     */
    @JsonProperty(value = "properties.livenessProbe")
    private ContainerProbe livenessProbe;

    /**
     * The readiness probe.
     */
    @JsonProperty(value = "properties.readinessProbe")
    private ContainerProbe readinessProbe;

    /**
     * Get the user-provided name of the container instance.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the user-provided name of the container instance.
     *
     * @param name the name value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the image used to create the container instance.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the name of the image used to create the container instance.
     *
     * @param image the image value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the commands to execute within the container instance in exec form.
     *
     * @return the command value
     */
    public List<String> command() {
        return this.command;
    }

    /**
     * Set the commands to execute within the container instance in exec form.
     *
     * @param command the command value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * Get the exposed ports on the container instance.
     *
     * @return the ports value
     */
    public List<ContainerPort> ports() {
        return this.ports;
    }

    /**
     * Set the exposed ports on the container instance.
     *
     * @param ports the ports value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withPorts(List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get the environment variables to set in the container instance.
     *
     * @return the environmentVariables value
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environment variables to set in the container instance.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the instance view of the container instance. Only valid in response.
     *
     * @return the instanceView value
     */
    public ContainerPropertiesInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the resource requirements of the container instance.
     *
     * @return the resources value
     */
    public ResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resource requirements of the container instance.
     *
     * @param resources the resources value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the volume mounts available to the container instance.
     *
     * @return the volumeMounts value
     */
    public List<VolumeMount> volumeMounts() {
        return this.volumeMounts;
    }

    /**
     * Set the volume mounts available to the container instance.
     *
     * @param volumeMounts the volumeMounts value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * Get the liveness probe.
     *
     * @return the livenessProbe value
     */
    public ContainerProbe livenessProbe() {
        return this.livenessProbe;
    }

    /**
     * Set the liveness probe.
     *
     * @param livenessProbe the livenessProbe value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withLivenessProbe(ContainerProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * Get the readiness probe.
     *
     * @return the readinessProbe value
     */
    public ContainerProbe readinessProbe() {
        return this.readinessProbe;
    }

    /**
     * Set the readiness probe.
     *
     * @param readinessProbe the readinessProbe value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withReadinessProbe(ContainerProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

}
