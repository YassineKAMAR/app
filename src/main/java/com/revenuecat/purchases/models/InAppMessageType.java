package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes.dex */
public enum InAppMessageType {
    BILLING_ISSUES(2);

    private final int inAppMessageCategoryId;

    InAppMessageType(int i8) {
        this.inAppMessageCategoryId = i8;
    }

    public final int getInAppMessageCategoryId$purchases_defaultsRelease() {
        return this.inAppMessageCategoryId;
    }
}
