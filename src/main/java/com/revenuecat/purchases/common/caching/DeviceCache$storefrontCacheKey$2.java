package com.revenuecat.purchases.common.caching;

import kotlin.jvm.internal.r;
import p6.a;

/* JADX INFO: loaded from: classes.dex */
final class DeviceCache$storefrontCacheKey$2 extends r implements a<String> {
    public static final DeviceCache$storefrontCacheKey$2 INSTANCE = new DeviceCache$storefrontCacheKey$2();

    DeviceCache$storefrontCacheKey$2() {
        super(0);
    }

    @Override // p6.a
    public final String invoke() {
        return "storefrontCacheKey";
    }
}
