package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class IdentityStrings {
    public static final String EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS = "Identifying with empty App User ID will be treated as anonymous.";
    public static final String IDENTIFYING_APP_USER_ID = "Identifying App User ID: %s";
    public static final IdentityStrings INSTANCE = new IdentityStrings();
    public static final String INVALIDATING_CACHED_CUSTOMER_INFO = "Detected unverified cached CustomerInfo but verification is enabled. Invalidating cache.";
    public static final String LOGGING_IN = "Logging in from %s -> %s";
    public static final String LOG_IN_ERROR_MISSING_APP_USER_ID = "Error logging in: appUserID can't be null, empty or blank";
    public static final String LOG_IN_SUCCESSFUL = "Logged in successfully as %s. Created: %s";
    public static final String LOG_OUT_CALLED_ON_ANONYMOUS_USER = "Called logOut but the current user is anonymous";
    public static final String LOG_OUT_SUCCESSFUL = "Logged out successfully";
    public static final String SETTING_NEW_ANON_ID = "Setting new anonymous App User ID - %s";
    public static final String SWITCHING_USER = "Switching to user %s.";
    public static final String SWITCHING_USER_SAME_APP_USER_ID = "switchUser called with the same appUserID as the current user %s. This has no effect.";

    private IdentityStrings() {
    }
}
