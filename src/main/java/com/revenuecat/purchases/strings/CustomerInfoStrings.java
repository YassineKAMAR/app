package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfoStrings {
    public static final String COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED = "Error computing offline CustomerInfo. Will return original error. Creation error: %s";
    public static final String CUSTOMERINFO_STALE_UPDATING_BACKGROUND = "CustomerInfo cache is stale, updating from network in background.";
    public static final String CUSTOMERINFO_STALE_UPDATING_FOREGROUND = "CustomerInfo cache is stale, updating from network in foreground.";
    public static final String CUSTOMERINFO_UPDATED_FROM_NETWORK = "CustomerInfo updated from network.";
    public static final String CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES = "CustomerInfo updated from syncing pending purchases.";
    public static final String CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER = "CustomerInfo updated, sending to listener.";
    public static final String ERROR_FETCHING_CUSTOMER_INFO = "Error fetching customer data: %s.";
    public static final CustomerInfoStrings INSTANCE = new CustomerInfoStrings();
    public static final String INVALIDATING_CUSTOMERINFO_CACHE = "Invalidating CustomerInfo cache.";
    public static final String MISSING_CACHED_CUSTOMER_INFO = "Requested a cached CustomerInfo but it's not available.";
    public static final String NO_CACHED_CUSTOMERINFO = "No cached CustomerInfo, fetching from network.";
    public static final String RETRIEVING_CUSTOMER_INFO = "Retrieving customer info with policy: %s";
    public static final String SENDING_LATEST_CUSTOMERINFO_TO_LISTENER = "Sending latest CustomerInfo to listener.";
    public static final String VENDING_CACHE = "Vending CustomerInfo from cache.";

    private CustomerInfoStrings() {
    }
}
