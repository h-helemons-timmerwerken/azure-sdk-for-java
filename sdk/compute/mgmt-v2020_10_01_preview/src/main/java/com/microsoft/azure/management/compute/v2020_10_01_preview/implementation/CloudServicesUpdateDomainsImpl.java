/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServicesUpdateDomains;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_10_01_preview.UpdateDomain;
import rx.Completable;

class CloudServicesUpdateDomainsImpl extends WrapperImpl<CloudServicesUpdateDomainsInner> implements CloudServicesUpdateDomains {
    private final ComputeManager manager;

    CloudServicesUpdateDomainsImpl(ComputeManager manager) {
        super(manager.inner().cloudServicesUpdateDomains());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private UpdateDomainImpl wrapModel(UpdateDomainInner inner) {
        return  new UpdateDomainImpl(inner, manager());
    }

    @Override
    public Observable<UpdateDomain> listUpdateDomainsAsync(final String resourceGroupName, final String cloudServiceName) {
        CloudServicesUpdateDomainsInner client = this.inner();
        return client.listUpdateDomainsAsync(resourceGroupName, cloudServiceName)
        .flatMapIterable(new Func1<Page<UpdateDomainInner>, Iterable<UpdateDomainInner>>() {
            @Override
            public Iterable<UpdateDomainInner> call(Page<UpdateDomainInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UpdateDomainInner, UpdateDomain>() {
            @Override
            public UpdateDomain call(UpdateDomainInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<UpdateDomain> getUpdateDomainAsync(String resourceGroupName, String cloudServiceName, int updateDomain) {
        CloudServicesUpdateDomainsInner client = this.inner();
        return client.getUpdateDomainAsync(resourceGroupName, cloudServiceName, updateDomain)
        .flatMap(new Func1<UpdateDomainInner, Observable<UpdateDomain>>() {
            @Override
            public Observable<UpdateDomain> call(UpdateDomainInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((UpdateDomain)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable walkUpdateDomainAsync(String resourceGroupName, String cloudServiceName, int updateDomain) {
        CloudServicesUpdateDomainsInner client = this.inner();
        return client.walkUpdateDomainAsync(resourceGroupName, cloudServiceName, updateDomain).toCompletable();
    }

}
