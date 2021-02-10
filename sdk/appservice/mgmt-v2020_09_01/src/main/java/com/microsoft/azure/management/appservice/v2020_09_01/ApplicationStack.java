/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application stack.
 */
public class ApplicationStack {
    /**
     * Application stack name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Application stack display name.
     */
    @JsonProperty(value = "display")
    private String display;

    /**
     * Application stack dependency.
     */
    @JsonProperty(value = "dependency")
    private String dependency;

    /**
     * List of major versions available.
     */
    @JsonProperty(value = "majorVersions")
    private List<StackMajorVersion> majorVersions;

    /**
     * List of frameworks associated with application stack.
     */
    @JsonProperty(value = "frameworks")
    private List<ApplicationStack> frameworks;

    /**
     * Get application stack name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set application stack name.
     *
     * @param name the name value to set
     * @return the ApplicationStack object itself.
     */
    public ApplicationStack withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get application stack display name.
     *
     * @return the display value
     */
    public String display() {
        return this.display;
    }

    /**
     * Set application stack display name.
     *
     * @param display the display value to set
     * @return the ApplicationStack object itself.
     */
    public ApplicationStack withDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * Get application stack dependency.
     *
     * @return the dependency value
     */
    public String dependency() {
        return this.dependency;
    }

    /**
     * Set application stack dependency.
     *
     * @param dependency the dependency value to set
     * @return the ApplicationStack object itself.
     */
    public ApplicationStack withDependency(String dependency) {
        this.dependency = dependency;
        return this;
    }

    /**
     * Get list of major versions available.
     *
     * @return the majorVersions value
     */
    public List<StackMajorVersion> majorVersions() {
        return this.majorVersions;
    }

    /**
     * Set list of major versions available.
     *
     * @param majorVersions the majorVersions value to set
     * @return the ApplicationStack object itself.
     */
    public ApplicationStack withMajorVersions(List<StackMajorVersion> majorVersions) {
        this.majorVersions = majorVersions;
        return this;
    }

    /**
     * Get list of frameworks associated with application stack.
     *
     * @return the frameworks value
     */
    public List<ApplicationStack> frameworks() {
        return this.frameworks;
    }

    /**
     * Set list of frameworks associated with application stack.
     *
     * @param frameworks the frameworks value to set
     * @return the ApplicationStack object itself.
     */
    public ApplicationStack withFrameworks(List<ApplicationStack> frameworks) {
        this.frameworks = frameworks;
        return this;
    }

}
