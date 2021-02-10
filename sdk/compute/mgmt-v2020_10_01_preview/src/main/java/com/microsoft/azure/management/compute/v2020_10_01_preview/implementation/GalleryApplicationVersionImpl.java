/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryApplicationVersion;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryApplicationVersionUpdate;
import java.util.Map;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryApplicationVersionPublishingProfile;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ReplicationStatus;
import rx.functions.Func1;

class GalleryApplicationVersionImpl extends CreatableUpdatableImpl<GalleryApplicationVersion, GalleryApplicationVersionInner, GalleryApplicationVersionImpl> implements GalleryApplicationVersion, GalleryApplicationVersion.Definition, GalleryApplicationVersion.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String galleryName;
    private String galleryApplicationName;
    private String galleryApplicationVersionName;
    private GalleryApplicationVersionUpdate updateParameter;

    GalleryApplicationVersionImpl(String name, ComputeManager manager) {
        super(name, new GalleryApplicationVersionInner());
        this.manager = manager;
        // Set resource name
        this.galleryApplicationVersionName = name;
        //
        this.updateParameter = new GalleryApplicationVersionUpdate();
    }

    GalleryApplicationVersionImpl(GalleryApplicationVersionInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.galleryApplicationVersionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.galleryName = IdParsingUtils.getValueFromIdByName(inner.id(), "galleries");
        this.galleryApplicationName = IdParsingUtils.getValueFromIdByName(inner.id(), "applications");
        this.galleryApplicationVersionName = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
        //
        this.updateParameter = new GalleryApplicationVersionUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GalleryApplicationVersion> createResourceAsync() {
        GalleryApplicationVersionsInner client = this.manager().inner().galleryApplicationVersions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName, this.galleryApplicationVersionName, this.inner())
            .map(new Func1<GalleryApplicationVersionInner, GalleryApplicationVersionInner>() {
               @Override
               public GalleryApplicationVersionInner call(GalleryApplicationVersionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GalleryApplicationVersion> updateResourceAsync() {
        GalleryApplicationVersionsInner client = this.manager().inner().galleryApplicationVersions();
        return client.updateAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName, this.galleryApplicationVersionName, this.updateParameter)
            .map(new Func1<GalleryApplicationVersionInner, GalleryApplicationVersionInner>() {
               @Override
               public GalleryApplicationVersionInner call(GalleryApplicationVersionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryApplicationVersionInner> getInnerAsync() {
        GalleryApplicationVersionsInner client = this.manager().inner().galleryApplicationVersions();
        return client.getAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName, this.galleryApplicationVersionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new GalleryApplicationVersionUpdate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.inner().publishingProfile();
    }

    @Override
    public ReplicationStatus replicationStatus() {
        return this.inner().replicationStatus();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GalleryApplicationVersionImpl withExistingApplication(String resourceGroupName, String galleryName, String galleryApplicationName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        this.galleryApplicationName = galleryApplicationName;
        return this;
    }

    @Override
    public GalleryApplicationVersionImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public GalleryApplicationVersionImpl withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile) {
        this.inner().withPublishingProfile(publishingProfile);
        return this;
    }

    @Override
    public GalleryApplicationVersionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
