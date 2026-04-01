package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class PurchasesOrchestrator$1$onConnected$2 extends r implements l<PurchasesError, i0> {
    public static final PurchasesOrchestrator$1$onConnected$2 INSTANCE = new PurchasesOrchestrator$1$onConnected$2();

    PurchasesOrchestrator$1$onConnected$2() {
        super(1);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError error) {
        q.f(error, "error");
        LogUtilsKt.errorLog(error);
    }
}
