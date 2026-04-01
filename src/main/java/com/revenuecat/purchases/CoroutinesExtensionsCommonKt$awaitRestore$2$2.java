package com.revenuecat.purchases;

import e6.i0;
import e6.s;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class CoroutinesExtensionsCommonKt$awaitRestore$2$2 extends r implements l<CustomerInfo, i0> {
    final /* synthetic */ h6.d<CustomerInfo> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitRestore$2$2(h6.d<? super CustomerInfo> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
        invoke2(customerInfo);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerInfo it) {
        q.f(it, "it");
        this.$continuation.resumeWith(s.b(it));
    }
}
