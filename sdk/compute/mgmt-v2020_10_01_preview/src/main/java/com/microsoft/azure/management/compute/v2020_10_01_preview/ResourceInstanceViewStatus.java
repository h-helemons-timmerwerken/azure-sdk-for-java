/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Instance view status.
 */
public class ResourceInstanceViewStatus {
    /**
     * The status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String displayStatus;

    /**
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The time of the status.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime time;

    /**
     * The level code. Possible values include: 'Info', 'Warning', 'Error'.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /**
     * Get the status code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the short localizable label for the status.
     *
     * @return the displayStatus value
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the detailed status message, including for alerts and error messages.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the time of the status.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Get the level code. Possible values include: 'Info', 'Warning', 'Error'.
     *
     * @return the level value
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set the level code. Possible values include: 'Info', 'Warning', 'Error'.
     *
     * @param level the level value to set
     * @return the ResourceInstanceViewStatus object itself.
     */
    public ResourceInstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

}
