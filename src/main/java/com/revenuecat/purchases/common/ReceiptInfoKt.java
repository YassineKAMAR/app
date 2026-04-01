package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class ReceiptInfoKt {
    public static final PlatformProductId platformProductId(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        return new PlatformProductId(storeProduct.getId());
    }

    public static final PlatformProductId platformProductId(SubscriptionOption subscriptionOption) {
        q.f(subscriptionOption, "<this>");
        if (!(subscriptionOption instanceof GoogleSubscriptionOption)) {
            return null;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) subscriptionOption;
        return new GooglePlatformProductId(googleSubscriptionOption.getProductId(), googleSubscriptionOption.getBasePlanId(), googleSubscriptionOption.getOfferId());
    }
}
