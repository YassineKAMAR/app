package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class OfferingsFactory$getStoreProductsById$1$1$2 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ l<PurchasesError, i0> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OfferingsFactory$getStoreProductsById$1$1$2(l<? super PurchasesError, i0> lVar) {
        super(1);
        this.$onError = lVar;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError it) {
        q.f(it, "it");
        this.$onError.invoke(it);
    }
}
