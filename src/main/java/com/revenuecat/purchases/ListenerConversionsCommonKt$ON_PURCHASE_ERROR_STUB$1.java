package com.revenuecat.purchases;

import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 extends r implements p<PurchasesError, Boolean, i0> {
    public static final ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1();

    ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
        invoke(purchasesError, bool.booleanValue());
        return i0.f21430a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z7) {
        q.f(purchasesError, "<anonymous parameter 0>");
    }
}
