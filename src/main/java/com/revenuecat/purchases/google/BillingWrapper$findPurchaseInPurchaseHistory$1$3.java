package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import e6.i0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$1$3 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
    BillingWrapper$findPurchaseInPurchaseHistory$1$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(Long l8, l<? super PurchasesError, ? extends i0> lVar) {
        invoke2(l8, (l<? super PurchasesError, i0>) lVar);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l8, l<? super PurchasesError, i0> p12) {
        q.f(p12, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p12);
    }
}
