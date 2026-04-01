package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonStoreProductKt {
    public static final AmazonStoreProduct getAmazonProduct(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            return (AmazonStoreProduct) storeProduct;
        }
        return null;
    }
}
