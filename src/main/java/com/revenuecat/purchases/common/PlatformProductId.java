package com.revenuecat.purchases.common;

import e6.x;
import f6.j0;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public class PlatformProductId {
    private final String productId;

    public PlatformProductId(String productId) {
        q.f(productId, "productId");
        this.productId = productId;
    }

    public Map<String, String> getAsMap() {
        return j0.c(x.a("product_id", getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}
