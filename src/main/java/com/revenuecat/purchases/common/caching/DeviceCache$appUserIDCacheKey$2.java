package com.revenuecat.purchases.common.caching;

import kotlin.jvm.internal.r;
import p6.a;

/* JADX INFO: loaded from: classes.dex */
final class DeviceCache$appUserIDCacheKey$2 extends r implements a<String> {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceCache$appUserIDCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override // p6.a
    public final String invoke() {
        return this.this$0.getApiKeyPrefix() + ".new";
    }
}
