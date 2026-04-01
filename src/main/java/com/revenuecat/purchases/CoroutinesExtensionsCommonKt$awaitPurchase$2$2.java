package com.revenuecat.purchases;

import e6.i0;
import e6.s;
import e6.t;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends r implements p<PurchasesError, Boolean, i0> {
    final /* synthetic */ h6.d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$2(h6.d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
        invoke(purchasesError, bool.booleanValue());
        return i0.f21430a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z7) {
        q.f(purchasesError, "purchasesError");
        h6.d<PurchaseResult> dVar = this.$continuation;
        s.a aVar = s.f21442b;
        dVar.resumeWith(s.b(t.a(new PurchasesTransactionException(purchasesError, z7))));
    }
}
