package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends r implements p<StoreTransaction, CustomerInfo, i0> {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        invoke2(storeTransaction, customerInfo);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, CustomerInfo info) {
        q.f(storeTransaction, "storeTransaction");
        q.f(info, "info");
        PurchaseCallback purchaseCallback = this.this$0.getPurchaseCallback(storeTransaction.getProductIds().get(0));
        if (purchaseCallback != null) {
            this.this$0.dispatch(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1(purchaseCallback, storeTransaction, info));
        }
    }
}
