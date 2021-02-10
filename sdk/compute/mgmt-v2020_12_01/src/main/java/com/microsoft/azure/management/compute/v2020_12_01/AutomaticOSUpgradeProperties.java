/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes automatic OS upgrade properties on the image.
 */
public class AutomaticOSUpgradeProperties {
    /**
     * Specifies whether automatic OS upgrade is supported on the image.
     */
    @JsonProperty(value = "automaticOSUpgradeSupported", required = true)
    private boolean automaticOSUpgradeSupported;

    /**
     * Get specifies whether automatic OS upgrade is supported on the image.
     *
     * @return the automaticOSUpgradeSupported value
     */
    public boolean automaticOSUpgradeSupported() {
        return this.automaticOSUpgradeSupported;
    }

    /**
     * Set specifies whether automatic OS upgrade is supported on the image.
     *
     * @param automaticOSUpgradeSupported the automaticOSUpgradeSupported value to set
     * @return the AutomaticOSUpgradeProperties object itself.
     */
    public AutomaticOSUpgradeProperties withAutomaticOSUpgradeSupported(boolean automaticOSUpgradeSupported) {
        this.automaticOSUpgradeSupported = automaticOSUpgradeSupported;
        return this;
    }

}
