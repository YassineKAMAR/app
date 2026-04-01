package com.revenuecat.purchases.google;

import e6.i0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class BillingWrapper$consumePurchase$2 extends o implements l<l<? super com.android.billingclient.api.b, ? extends i0>, i0> {
    BillingWrapper$consumePurchase$2(Object obj) {
        super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.b, ? extends i0> lVar) {
        invoke2((l<? super com.android.billingclient.api.b, i0>) lVar);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(l<? super com.android.billingclient.api.b, i0> p02) {
        q.f(p02, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(p02);
    }
}
