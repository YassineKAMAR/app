package com.revenuecat.purchases;

import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$lifecycleHandler$2 extends r implements p6.a<AppLifecycleHandler> {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$lifecycleHandler$2(PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.this$0 = purchasesOrchestrator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p6.a
    public final AppLifecycleHandler invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}
