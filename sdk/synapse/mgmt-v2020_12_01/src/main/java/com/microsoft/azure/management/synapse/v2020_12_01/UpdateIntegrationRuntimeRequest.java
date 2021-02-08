/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update integration runtime request.
 */
public class UpdateIntegrationRuntimeRequest {
    /**
     * Enables or disables the auto-update feature of the self-hosted
     * integration runtime. See https://go.microsoft.com/fwlink/?linkid=854189.
     * Possible values include: 'On', 'Off'.
     */
    @JsonProperty(value = "autoUpdate")
    private IntegrationRuntimeAutoUpdate autoUpdate;

    /**
     * The time offset (in hours) in the day, e.g., PT03H is 3 hours. The
     * integration runtime auto update will happen on that time.
     */
    @JsonProperty(value = "updateDelayOffset")
    private String updateDelayOffset;

    /**
     * Get enables or disables the auto-update feature of the self-hosted integration runtime. See https://go.microsoft.com/fwlink/?linkid=854189. Possible values include: 'On', 'Off'.
     *
     * @return the autoUpdate value
     */
    public IntegrationRuntimeAutoUpdate autoUpdate() {
        return this.autoUpdate;
    }

    /**
     * Set enables or disables the auto-update feature of the self-hosted integration runtime. See https://go.microsoft.com/fwlink/?linkid=854189. Possible values include: 'On', 'Off'.
     *
     * @param autoUpdate the autoUpdate value to set
     * @return the UpdateIntegrationRuntimeRequest object itself.
     */
    public UpdateIntegrationRuntimeRequest withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * Get the time offset (in hours) in the day, e.g., PT03H is 3 hours. The integration runtime auto update will happen on that time.
     *
     * @return the updateDelayOffset value
     */
    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }

    /**
     * Set the time offset (in hours) in the day, e.g., PT03H is 3 hours. The integration runtime auto update will happen on that time.
     *
     * @param updateDelayOffset the updateDelayOffset value to set
     * @return the UpdateIntegrationRuntimeRequest object itself.
     */
    public UpdateIntegrationRuntimeRequest withUpdateDelayOffset(String updateDelayOffset) {
        this.updateDelayOffset = updateDelayOffset;
        return this;
    }

}
