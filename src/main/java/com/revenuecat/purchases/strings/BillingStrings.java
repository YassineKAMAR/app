package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class BillingStrings {
    public static final String BILLING_AMAZON_ERROR_STOREFRONT = "Error obtaining storefront in Amazon: %s";
    public static final String BILLING_CLIENT_DISCONNECTED = "Billing is disconnected and purchase methods won't work. Stacktrace: %s";
    public static final String BILLING_CLIENT_ENDING = "Ending connection for %s";
    public static final String BILLING_CLIENT_ERROR = "Billing Service Setup finished with error code: %s";
    public static final String BILLING_CLIENT_RETRY = "Retrying BillingClient connection after backoff of %s milliseconds.";
    public static final String BILLING_CLIENT_RETRY_ALREADY_SCHEDULED = "BillingClient connection retry already scheduled. Ignoring";
    public static final String BILLING_CLIENT_STARTING = "Starting connection for %s";
    public static final String BILLING_CONFIG_NULL_ON_SUCCESS = "Billing config is null even though Google return OK result";
    public static final String BILLING_CONNECTION_ERROR_INAPP_MESSAGES = "Error connecting to billing client to display in-app messages: %s";
    public static final String BILLING_CONNECTION_ERROR_STORE_COUNTRY = "Error connecting to billing client to get store country: %s";
    public static final String BILLING_COUNTRY_CODE = "Billing connected with country code: %s";
    public static final String BILLING_INAPP_MESSAGE_NONE = "No Google Play in-app message was available.";
    public static final String BILLING_INAPP_MESSAGE_UNEXPECTED_CODE = "Unexpected billing code: %s";
    public static final String BILLING_INAPP_MESSAGE_UPDATE = "Subscription status was updated from in-app message.";
    public static final String BILLING_INITIATE_GETTING_COUNTRY_CODE = "Billing client: Initiating getting country code.";
    public static final String BILLING_INTENT_FAILED = "Failed to launch billing intent. %s";
    public static final String BILLING_PURCHASE_HISTORY_RECORD_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_PURCHASE_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_SERVICE_DISCONNECTED = "Billing Service disconnected";
    public static final String BILLING_SERVICE_DISCONNECTED_INSTANCE = "Billing Service disconnected for %s";
    public static final String BILLING_SERVICE_SETUP_FINISHED = "Billing Service Setup finished for %s";
    public static final String BILLING_SERVICE_UNAVAILABLE_BACKGROUND = "Billing is unavailable. App is in background, will retry withbackoff.";
    public static final String BILLING_SERVICE_UNAVAILABLE_FOREGROUND = "Billing is unavailable. App is in foreground. Won't retry.";
    public static final String BILLING_STOREFRONT_CACHING = "Setting storefront cache to %s";
    public static final String BILLING_STOREFRONT_NULL_FROM_CACHE = "Getting storefront from cache was null.";
    public static final String BILLING_UNAVAILABLE = "Billing is not available in this device. %s";
    public static final String BILLING_UNAVAILABLE_LESS_THAN_3 = "Billing is not available in this device. Make sure there's an account configured in Play Store. Reopen the Play Store or clean its caches if this keeps happening. Original error message: %s";
    public static final String BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES = "Tried to show in-app messages without specifying any types. Please add what types of in-app message you want to display.";
    public static final String BILLING_WRAPPER_PURCHASES_ERROR = "BillingWrapper purchases failed to update: %s";
    public static final String BILLING_WRAPPER_PURCHASES_UPDATED = "BillingWrapper purchases updated: %s";
    public static final String CANNOT_CALL_CAN_MAKE_PAYMENTS = "canMakePayments requires the Google Play Store. Skipping any checks and returning true.";
    public static final String ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING = "There was an IllegalStateException when connecting to BillingClient. This has been reported to occur on Samsung devices on unknown circumstances.\nException: %s";
    public static final BillingStrings INSTANCE = new BillingStrings();
    public static final String NULL_ACTIVITY_INTENT = "Activity passed into launchBillingFlow has a null intent, which may cause a crash. See https://github.com/RevenueCat/purchases-android/issues/381 for more information.";

    private BillingStrings() {
    }
}
