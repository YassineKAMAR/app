package com.revenuecat.purchases.amazon;

import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class AmazonCache$amazonPostedTokensKey$2 extends r implements p6.a<String> {
    final /* synthetic */ AmazonCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmazonCache$amazonPostedTokensKey$2(AmazonCache amazonCache) {
        super(0);
        this.this$0 = amazonCache;
    }

    @Override // p6.a
    public final String invoke() {
        return this.this$0.deviceCache.newKey("amazon.tokens");
    }
}
