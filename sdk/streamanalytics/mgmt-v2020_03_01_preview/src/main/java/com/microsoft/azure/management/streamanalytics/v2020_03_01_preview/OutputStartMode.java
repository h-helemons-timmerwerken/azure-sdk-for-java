/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OutputStartMode.
 */
public final class OutputStartMode extends ExpandableStringEnum<OutputStartMode> {
    /** Static value JobStartTime for OutputStartMode. */
    public static final OutputStartMode JOB_START_TIME = fromString("JobStartTime");

    /** Static value CustomTime for OutputStartMode. */
    public static final OutputStartMode CUSTOM_TIME = fromString("CustomTime");

    /** Static value LastOutputEventTime for OutputStartMode. */
    public static final OutputStartMode LAST_OUTPUT_EVENT_TIME = fromString("LastOutputEventTime");

    /**
     * Creates or finds a OutputStartMode from its string representation.
     * @param name a name to look for
     * @return the corresponding OutputStartMode
     */
    @JsonCreator
    public static OutputStartMode fromString(String name) {
        return fromString(name, OutputStartMode.class);
    }

    /**
     * @return known OutputStartMode values
     */
    public static Collection<OutputStartMode> values() {
        return values(OutputStartMode.class);
    }
}
