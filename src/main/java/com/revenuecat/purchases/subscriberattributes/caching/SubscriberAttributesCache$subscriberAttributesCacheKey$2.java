package com.revenuecat.purchases.subscriberattributes.caching;

import kotlin.jvm.internal.r;
import p6.a;

/* JADX INFO: loaded from: classes.dex */
final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends r implements a<String> {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    @Override // p6.a
    public final String invoke() {
        return this.this$0.getDeviceCache$purchases_defaultsRelease().newKey("subscriberAttributes");
    }
}
