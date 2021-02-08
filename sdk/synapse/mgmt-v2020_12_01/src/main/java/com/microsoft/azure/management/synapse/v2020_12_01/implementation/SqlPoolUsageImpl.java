/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class SqlPoolUsageImpl extends WrapperImpl<SqlPoolUsageInner> implements SqlPoolUsage {
    private final SynapseManager manager;

    SqlPoolUsageImpl(SqlPoolUsageInner inner,  SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }



    @Override
    public Double currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public Double limit() {
        return this.inner().limit();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime nextResetTime() {
        return this.inner().nextResetTime();
    }

    @Override
    public String resourceName() {
        return this.inner().resourceName();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
