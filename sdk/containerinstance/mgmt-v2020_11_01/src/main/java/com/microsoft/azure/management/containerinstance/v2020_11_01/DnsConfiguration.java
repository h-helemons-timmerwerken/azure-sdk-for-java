/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DNS configuration for the container group.
 */
public class DnsConfiguration {
    /**
     * The DNS servers for the container group.
     */
    @JsonProperty(value = "nameServers", required = true)
    private List<String> nameServers;

    /**
     * The DNS search domains for hostname lookup in the container group.
     */
    @JsonProperty(value = "searchDomains")
    private String searchDomains;

    /**
     * The DNS options for the container group.
     */
    @JsonProperty(value = "options")
    private String options;

    /**
     * Get the DNS servers for the container group.
     *
     * @return the nameServers value
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Set the DNS servers for the container group.
     *
     * @param nameServers the nameServers value to set
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withNameServers(List<String> nameServers) {
        this.nameServers = nameServers;
        return this;
    }

    /**
     * Get the DNS search domains for hostname lookup in the container group.
     *
     * @return the searchDomains value
     */
    public String searchDomains() {
        return this.searchDomains;
    }

    /**
     * Set the DNS search domains for hostname lookup in the container group.
     *
     * @param searchDomains the searchDomains value to set
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withSearchDomains(String searchDomains) {
        this.searchDomains = searchDomains;
        return this;
    }

    /**
     * Get the DNS options for the container group.
     *
     * @return the options value
     */
    public String options() {
        return this.options;
    }

    /**
     * Set the DNS options for the container group.
     *
     * @param options the options value to set
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withOptions(String options) {
        this.options = options;
        return this;
    }

}
