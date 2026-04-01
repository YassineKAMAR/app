package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes.dex */
public final class RCHTTPStatusCodes {
    public static final int BAD_REQUEST = 400;
    public static final int CREATED = 201;
    public static final int ERROR = 500;
    public static final RCHTTPStatusCodes INSTANCE = new RCHTTPStatusCodes();
    public static final int NOT_FOUND = 404;
    public static final int NOT_MODIFIED = 304;
    public static final int SUCCESS = 200;
    public static final int UNSUCCESSFUL = 300;

    private RCHTTPStatusCodes() {
    }

    public final boolean isServerError(int i8) {
        return i8 >= 500;
    }

    public final boolean isSuccessful(int i8) {
        return i8 < 400;
    }

    public final boolean isSynced(int i8) {
        return isSuccessful(i8) || !(isServerError(i8) || i8 == 404);
    }
}
