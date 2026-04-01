package com.revenuecat.purchases.common.caching;

import x6.a;
import x6.c;
import x6.d;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    private static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";

    static {
        a.C0190a c0190a = a.f27324b;
        PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = c.s(25, d.f27336g);
    }
}
