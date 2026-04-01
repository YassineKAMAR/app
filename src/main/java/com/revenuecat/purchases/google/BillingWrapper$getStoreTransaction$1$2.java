package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class BillingWrapper$getStoreTransaction$1$2 extends r implements l<ProductType, i0> {
    final /* synthetic */ l<StoreTransaction, i0> $completion;
    final /* synthetic */ PurchaseContext $context;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$getStoreTransaction$1$2(l<? super StoreTransaction, i0> lVar, Purchase purchase, PurchaseContext purchaseContext) {
        super(1);
        this.$completion = lVar;
        this.$purchase = purchase;
        this.$context = purchaseContext;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(ProductType productType) {
        invoke2(productType);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductType type) {
        q.f(type, "type");
        l<StoreTransaction, i0> lVar = this.$completion;
        Purchase purchase = this.$purchase;
        PurchaseContext purchaseContext = this.$context;
        lVar.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(purchase, type, purchaseContext != null ? purchaseContext.getPresentedOfferingId() : null, null, null, 12, null));
    }
}
