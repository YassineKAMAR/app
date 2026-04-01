package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineEntitlementsStrings {
    public static final String ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO = "Already calculating offline customer info for %s.";
    public static final String ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING = "Error parsing cached product entitlement mapping: %s";
    public static final String ERROR_UPDATING_PRODUCT_ENTITLEMENTS = "Error updating product entitlement mappings. Error: %s.";
    public static final OfflineEntitlementsStrings INSTANCE = new OfflineEntitlementsStrings();
    public static final String OFFLINE_ENTITLEMENTS_NOT_ENABLED = "Offline entitlements not enabled in this version.";
    public static final String OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES = "Offline entitlements are not supported for active inapp purchases. Found active inapp purchases.";
    public static final String PRODUCT_ENTITLEMENT_MAPPING_REQUIRED = "Product entitlement mapping is required for offline entitlements. Skipping offline customer info calculation.";
    public static final String RESETTING_OFFLINE_CUSTOMER_INFO_CACHE = "Resetting offline customer info cache.";
    public static final String SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS = "Successfully updated product entitlement mappings.";
    public static final String UPDATING_PRODUCT_ENTITLEMENT_MAPPING = "Product entitlement mappings are stale. Updating.";
    public static final String USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO = "Using offline computed customer info. In this state EntitlementInfo's isSandbox will always be false. Additionally, the expiration date may be inaccurate. Once the transactions are synced with our backend, these values will be automatically corrected.";

    private OfflineEntitlementsStrings() {
    }
}
