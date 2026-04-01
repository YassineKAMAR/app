package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import e6.s;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class CoroutinesExtensionsCommonKt$awaitPurchase$2$1 extends r implements p<StoreTransaction, CustomerInfo, i0> {
    final /* synthetic */ h6.d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$1(h6.d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        invoke2(storeTransaction, customerInfo);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        q.f(storeTransaction, "storeTransaction");
        q.f(customerInfo, "customerInfo");
        h6.d<PurchaseResult> dVar = this.$continuation;
        s.a aVar = s.f21442b;
        dVar.resumeWith(s.b(new PurchaseResult(storeTransaction, customerInfo)));
    }
}
