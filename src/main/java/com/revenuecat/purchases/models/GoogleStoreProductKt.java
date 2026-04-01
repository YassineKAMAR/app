package com.revenuecat.purchases.models;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleStoreProductKt {
    public static final GoogleStoreProduct getGoogleProduct(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        if (storeProduct instanceof GoogleStoreProduct) {
            return (GoogleStoreProduct) storeProduct;
        }
        return null;
    }
}
