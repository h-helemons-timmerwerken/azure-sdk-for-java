/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional. Allows users to provide customer managed keys for encrypting the
 * OS and data disks in the gallery artifact.
 */
public class EncryptionImages {
    /**
     * The osDiskImage property.
     */
    @JsonProperty(value = "osDiskImage")
    private OSDiskImageEncryption osDiskImage;

    /**
     * A list of encryption specifications for data disk images.
     */
    @JsonProperty(value = "dataDiskImages")
    private List<DataDiskImageEncryption> dataDiskImages;

    /**
     * Get the osDiskImage value.
     *
     * @return the osDiskImage value
     */
    public OSDiskImageEncryption osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage value.
     *
     * @param osDiskImage the osDiskImage value to set
     * @return the EncryptionImages object itself.
     */
    public EncryptionImages withOsDiskImage(OSDiskImageEncryption osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get a list of encryption specifications for data disk images.
     *
     * @return the dataDiskImages value
     */
    public List<DataDiskImageEncryption> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set a list of encryption specifications for data disk images.
     *
     * @param dataDiskImages the dataDiskImages value to set
     * @return the EncryptionImages object itself.
     */
    public EncryptionImages withDataDiskImages(List<DataDiskImageEncryption> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

}
