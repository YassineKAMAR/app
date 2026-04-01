package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionStrings {
    public static final String AMAZON_COULD_NOT_GET_ADID = "Couldn't get Amazon advertising identifier. Message: %s";
    public static final String ATTRIBUTES_SYNC_ERROR = "Error when syncing subscriber attributes. App User ID: %s, Error: %s";
    public static final String ATTRIBUTES_SYNC_SUCCESS = "Subscriber attributes synced successfully for App User ID: %s";
    public static final String COPYING_ATTRIBUTES_FROM_TO_USER = "Copying unsynced subscriber attributes from user %s to user %s";
    public static final String DELETING_ATTRIBUTES = "Deleting subscriber attributes for %s from cache";
    public static final String DELETING_ATTRIBUTES_OTHER_USERS = "Deleting old synced subscriber attributes that don't belong to %s";
    public static final String GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE = "Google Advertising ID is all zeros, ignoring. Make sure you've added the 'com.google.android.gms.permission.AD_ID' permission in your AndroidManifest file.";
    public static final String GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER = "GooglePlayServices is not installed. Couldn't get advertising identifier. Message: %s";
    public static final String GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER = "GooglePlayServicesRepairableException when getting advertising identifier. Message: %s";
    public static final AttributionStrings INSTANCE = new AttributionStrings();
    public static final String IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER = "IOException when getting advertising identifier. Message: %s";
    public static final String MARKING_ATTRIBUTES_SYNCED = "Marking the following attributes as synced for App User ID: %s";
    public static final String METHOD_CALLED = "%s called";
    public static final String NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE = "No subscriber attributes to synchronize.";
    public static final String NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER = "NullPointerException when getting advertising identifier. Message: %s";
    public static final String SUBSCRIBER_ATTRIBUTES_ERROR = "There were some subscriber attributes errors: %s";
    public static final String TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER = "TimeoutException when getting advertising identifier. Message: %s";
    public static final String UNSYNCED_ATTRIBUTES_COUNT = "Found %d unsynced attributes for App User ID: %s";

    private AttributionStrings() {
    }
}
