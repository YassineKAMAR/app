package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseStrings {
    public static final String ACKNOWLEDGING_PURCHASE = "Acknowledging purchase with token %s";
    public static final String ACKNOWLEDGING_PURCHASE_ERROR = "Error acknowledging purchase. Will retry next queryPurchases. %s";
    public static final String BILLING_CLIENT_NOT_CONNECTED = "Skipping updating pending purchase queue since BillingClient is not connected yet.";
    public static final String CONSUMING_PURCHASE = "Consuming purchase with token %s";
    public static final String CONSUMING_PURCHASE_ERROR = "Error consuming purchase. Will retry next queryPurchases. %s";
    public static final String ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD = "Entitlement %s is no longer active (expired %s) and it's outside grace period window (last updated %s)";
    public static final String ERROR_FINDING_PURCHASE = "Error finding existing purchase for SKU: %s";
    public static final String FOUND_EXISTING_PURCHASE = "Found existing purchase for SKU: %s";
    public static final PurchaseStrings INSTANCE = new PurchaseStrings();
    public static final String INVALID_CALLBACK_TYPE_INTERNAL_ERROR = "Internal SDK error -- invalid callback type passed to startProductChange.";
    public static final String INVALID_PRODUCT_NO_PRICE = "Error finding a price for %s.";
    public static final String INVALID_PRODUCT_TYPE = "Invalid product type passed to %s.";
    public static final String INVALID_PURCHASE_TYPE = "Purchase for a %s purchase must be a %s.";
    public static final String INVALID_STORE_PRODUCT_TYPE = "StoreProduct for a %s purchase must be a %s.";
    public static final String NOT_RECOGNIZED_PRODUCT_TYPE = "Type of product not recognized.";
    public static final String NO_EXISTING_PURCHASE = "Couldn't find existing purchase for SKU: %s";
    public static final String NO_PENDING_PURCHASES_TO_SYNC = "No pending purchases to sync";
    public static final String OFFERING = " - offering: ";
    public static final String PRODUCT_CHANGE_STARTED = "Product change started: %s";
    public static final String PURCHASE_FINISH_TRANSACTION_FALSE = "finishTransactions is set to false and a purchase has been started. Are you sure you want to do this? More info here: https://errors.rev.cat/finishTransactions";
    public static final String PURCHASE_STARTED = "Purchase started - product: %s";
    public static final String PURCHASE_SYNCED = "Purchase %s synced";
    public static final String PURCHASE_SYNCED_USER_ID = "Purchase %s synced %s";
    public static final String PURCHASING_PRODUCT = "Purchasing product: %s";
    public static final String SKIPPING_AUTOMATIC_SYNC = "Skipping automatic synchronization.";
    public static final String SYNCED_PURCHASES_SUCCESSFULLY = "Synced purchases successfully";
    public static final String SYNCING_PURCHASES = "Syncing purchases";
    public static final String SYNCING_PURCHASES_ERROR = "Error syncing purchases. Error: %s";
    public static final String SYNCING_PURCHASES_ERROR_DETAILS = "Error syncing purchases %s. Error: %s";
    public static final String SYNCING_PURCHASE_ERROR_DETAILS_USER_ID = "Error syncing purchase %s for store user ID %s. Error: %s";
    public static final String SYNCING_PURCHASE_SKIPPING = "Skipping syncing purchase %s for store user ID %s. It has already been posted";
    public static final String SYNCING_PURCHASE_STORE_USER_ID = "Syncing purchase with token %s, for store user ID %s";
    public static final String UPDATING_PENDING_PURCHASE_QUEUE = "Updating pending purchase queue";
    public static final String UPGRADING_INVALID_TYPE = "UpgradeInfo passed to purchase for non-sub product type. No upgrade will occur. Consider using non-upgrade purchase flows for this product.";
    public static final String UPGRADING_SKU = "Moving from old SKU %s to sku %s";
    public static final String UPGRADING_SKU_ERROR = "There was an error trying to upgrade. BillingResponseCode: %s";

    private PurchaseStrings() {
    }
}
