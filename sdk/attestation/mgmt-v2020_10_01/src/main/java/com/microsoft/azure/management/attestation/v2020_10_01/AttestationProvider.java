/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.attestation.v2020_10_01.implementation.AttestationManager;
import java.util.List;
import com.microsoft.azure.management.attestation.v2020_10_01.implementation.AttestationProviderInner;

/**
 * Type representing AttestationProvider.
 */
public interface AttestationProvider extends HasInner<AttestationProviderInner>, Resource, GroupableResourceCore<AttestationManager, AttestationProviderInner>, HasResourceGroup, Refreshable<AttestationProvider>, Updatable<AttestationProvider.Update>, HasManager<AttestationManager> {
    /**
     * @return the attestUri value.
     */
    String attestUri();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the status value.
     */
    AttestationServiceStatus status();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the trustModel value.
     */
    String trustModel();

    /**
     * The entirety of the AttestationProvider definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AttestationProvider definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AttestationProvider definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AttestationProvider definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProperties> {
        }

        /**
         * The stage of the attestationprovider definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the attestation provider
            * @return the next definition stage
*/
            WithCreate withProperties(AttestationServiceCreationSpecificParams properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AttestationProvider>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a AttestationProvider update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AttestationProvider>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of AttestationProvider update stages.
     */
    interface UpdateStages {
    }
}
