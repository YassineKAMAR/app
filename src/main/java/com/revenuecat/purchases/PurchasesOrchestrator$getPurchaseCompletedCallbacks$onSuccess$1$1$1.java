package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1 extends r implements p6.a<i0> {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ PurchaseCallback $purchaseCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1(PurchaseCallback purchaseCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$purchaseCallback = purchaseCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    @Override // p6.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$purchaseCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
