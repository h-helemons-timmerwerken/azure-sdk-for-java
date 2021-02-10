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
 * Describes virtual machine scale set operating system disk Update Object.
 * This should be used for Updating VMSS OS Disk.
 */
public class VirtualMachineScaleSetUpdateOSDisk {
    /**
     * The caching type. Possible values include: 'None', 'ReadOnly',
     * 'ReadWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /**
     * Specifies the size of the operating system disk in gigabytes. This
     * element can be used to overwrite the size of the disk in a virtual
     * machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /**
     * The Source User Image VirtualHardDisk. This VirtualHardDisk will be
     * copied before using it to attach to the Virtual Machine. If SourceImage
     * is provided, the destination VirtualHardDisk should not exist.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /**
     * The list of virtual hard disk container uris.
     */
    @JsonProperty(value = "vhdContainers")
    private List<String> vhdContainers;

    /**
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /**
     * Get the caching type. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @return the caching value
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching type. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @param caching the caching value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get specifies whether writeAccelerator should be enabled or disabled on the disk.
     *
     * @return the writeAcceleratorEnabled value
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set specifies whether writeAccelerator should be enabled or disabled on the disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not exist.
     *
     * @return the image value
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the Source User Image VirtualHardDisk. This VirtualHardDisk will be copied before using it to attach to the Virtual Machine. If SourceImage is provided, the destination VirtualHardDisk should not exist.
     *
     * @param image the image value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the list of virtual hard disk container uris.
     *
     * @return the vhdContainers value
     */
    public List<String> vhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the list of virtual hard disk container uris.
     *
     * @param vhdContainers the vhdContainers value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
        return this;
    }

    /**
     * Get the managed disk parameters.
     *
     * @return the managedDisk value
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

}
