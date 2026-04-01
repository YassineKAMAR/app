package com.revenuecat.purchases.models;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;

/* JADX INFO: loaded from: classes.dex */
public enum BillingFeature {
    SUBSCRIPTIONS(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");

    private final String playBillingClientName;

    BillingFeature(String str) {
        this.playBillingClientName = str;
    }

    public final String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}
