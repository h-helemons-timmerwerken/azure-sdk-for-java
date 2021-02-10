/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.IpFirewallRules;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2020_12_01.IpFirewallRuleInfo;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.synapse.v2020_12_01.ReplaceAllFirewallRulesOperationResponse;

class IpFirewallRulesImpl extends WrapperImpl<IpFirewallRulesInner> implements IpFirewallRules {
    private final SynapseManager manager;

    IpFirewallRulesImpl(SynapseManager manager) {
        super(manager.inner().ipFirewallRules());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public IpFirewallRuleInfoImpl defineFirewallRule(String name) {
        return wrapFirewallRuleModel(name);
    }

    private IpFirewallRuleInfoImpl wrapFirewallRuleModel(String name) {
        return new IpFirewallRuleInfoImpl(name, this.manager());
    }

    private IpFirewallRuleInfoImpl wrapIpFirewallRuleInfoModel(IpFirewallRuleInfoInner inner) {
        return  new IpFirewallRuleInfoImpl(inner, manager());
    }

    private Observable<IpFirewallRuleInfoInner> getIpFirewallRuleInfoInnerUsingIpFirewallRulesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String workspaceName = IdParsingUtils.getValueFromIdByName(id, "workspaces");
        String ruleName = IdParsingUtils.getValueFromIdByName(id, "firewallRules");
        IpFirewallRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, ruleName);
    }

    @Override
    public Observable<IpFirewallRuleInfo> getAsync(String resourceGroupName, String workspaceName, String ruleName) {
        IpFirewallRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, ruleName)
        .flatMap(new Func1<IpFirewallRuleInfoInner, Observable<IpFirewallRuleInfo>>() {
            @Override
            public Observable<IpFirewallRuleInfo> call(IpFirewallRuleInfoInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((IpFirewallRuleInfo)wrapIpFirewallRuleInfoModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<IpFirewallRuleInfo> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        IpFirewallRulesInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<IpFirewallRuleInfoInner>, Iterable<IpFirewallRuleInfoInner>>() {
            @Override
            public Iterable<IpFirewallRuleInfoInner> call(Page<IpFirewallRuleInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IpFirewallRuleInfoInner, IpFirewallRuleInfo>() {
            @Override
            public IpFirewallRuleInfo call(IpFirewallRuleInfoInner inner) {
                return wrapIpFirewallRuleInfoModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String ruleName) {
        IpFirewallRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, ruleName).toCompletable();
    }

    @Override
    public Observable<ReplaceAllFirewallRulesOperationResponse> replaceAllAsync(String resourceGroupName, String workspaceName) {
        IpFirewallRulesInner client = this.inner();
        return client.replaceAllAsync(resourceGroupName, workspaceName)
        .map(new Func1<ReplaceAllFirewallRulesOperationResponseInner, ReplaceAllFirewallRulesOperationResponse>() {
            @Override
            public ReplaceAllFirewallRulesOperationResponse call(ReplaceAllFirewallRulesOperationResponseInner inner) {
                return new ReplaceAllFirewallRulesOperationResponseImpl(inner, manager());
            }
        });
    }

}
