package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseContext {
    private final String presentedOfferingId;
    private final ProductType productType;
    private final GoogleReplacementMode replacementMode;
    private final String selectedSubscriptionOptionId;

    public PurchaseContext(ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode) {
        q.f(productType, "productType");
        this.productType = productType;
        this.presentedOfferingId = str;
        this.selectedSubscriptionOptionId = str2;
        this.replacementMode = googleReplacementMode;
    }

    public final String getPresentedOfferingId() {
        return this.presentedOfferingId;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final GoogleReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSelectedSubscriptionOptionId() {
        return this.selectedSubscriptionOptionId;
    }
}
