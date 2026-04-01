package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class RestoreStrings {
    public static final String EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE = "BillingClient queryPurchaseHistory has returned more than once, with result: %s. More info here: https://rev.cat/google-duplicated-listener-timeouts";
    public static final RestoreStrings INSTANCE = new RestoreStrings();
    public static final String PURCHASE_HISTORY_EMPTY = "Purchase history is empty.";
    public static final String PURCHASE_HISTORY_RETRIEVED = "Purchase history retrieved %s";
    public static final String PURCHASE_RESTORED = "Purchase %s restored";
    public static final String QUERYING_INAPP_ERROR = "Error when querying inapps. %s";
    public static final String QUERYING_PURCHASE = "Querying purchases";
    public static final String QUERYING_PURCHASE_HISTORY = "Querying purchase history for type %s";
    public static final String QUERYING_PURCHASE_WITH_HASH = "Purchase of type %s with hash %s";
    public static final String QUERYING_PURCHASE_WITH_TYPE = "Querying Purchase with %s and type %s";
    public static final String QUERYING_SUBS_ERROR = "Error when querying subscriptions. %s";
    public static final String RESTORING_PURCHASE = "Restoring purchases";
    public static final String RESTORING_PURCHASE_ERROR = "Error restoring purchase: %s. Error: %s";
    public static final String SHARING_ACC_RESTORE_FALSE = "allowSharingPlayStoreAccount is set to false and restorePurchases has been called. This will 'alias' any app user id's sharing the same receipt. Are you sure you want to do this? More info here: https://errors.rev.cat/allowsSharingPlayStoreAccount";

    private RestoreStrings() {
    }
}
