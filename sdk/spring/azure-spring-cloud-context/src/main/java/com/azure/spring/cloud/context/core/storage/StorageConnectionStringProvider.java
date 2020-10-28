// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.context.core.storage;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.management.storage.StorageAccount;

/**
 * Get connection string from the Azure environment for the storage account.
 */
public class StorageConnectionStringProvider {

    public static String getConnectionString(StorageAccount storageAccount, AzureEnvironment environment,
        boolean isSecureTransfer) {
        return buildConnectionString(storageAccount, environment, isSecureTransfer);
    }

    public static String getConnectionString(StorageAccount storageAccount, AzureEnvironment environment) {
        return getConnectionString(storageAccount, environment, true);
    }

    public static String getConnectionString(String storageAccount, String accessKey, AzureEnvironment environment) {
        return getConnectionString(storageAccount, accessKey, environment, true);
    }

    public static String getConnectionString(String storageAccount, String accessKey, AzureEnvironment environment,
        boolean isSecureTransfer) {
        return StorageConnectionStringBuilder.build(storageAccount, accessKey, environment, isSecureTransfer);
    }

    private static String buildConnectionString(StorageAccount storageAccount, AzureEnvironment environment,
        boolean isSecureTransfer) {
        return storageAccount.getKeys().stream().findFirst().map(key -> StorageConnectionStringBuilder
            .build(storageAccount.name(), key.value(), environment, isSecureTransfer))
            .orElseThrow(() -> new RuntimeException("Storage account key is empty."));
    }
}
