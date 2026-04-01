package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PostReceiptInitiationSource;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class ConsumePurchaseUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final PostReceiptInitiationSource initiationSource;
    private final String purchaseToken;

    public ConsumePurchaseUseCaseParams(String purchaseToken, PostReceiptInitiationSource initiationSource, boolean z7) {
        q.f(purchaseToken, "purchaseToken");
        q.f(initiationSource, "initiationSource");
        this.purchaseToken = purchaseToken;
        this.initiationSource = initiationSource;
        this.appInBackground = z7;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final PostReceiptInitiationSource getInitiationSource() {
        return this.initiationSource;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }
}
