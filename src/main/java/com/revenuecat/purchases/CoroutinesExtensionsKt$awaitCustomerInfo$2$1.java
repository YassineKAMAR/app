package com.revenuecat.purchases;

import e6.i0;
import e6.s;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class CoroutinesExtensionsKt$awaitCustomerInfo$2$1 extends o implements l<CustomerInfo, i0> {
    CoroutinesExtensionsKt$awaitCustomerInfo$2$1(Object obj) {
        super(1, obj, h6.f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
        invoke2(customerInfo);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerInfo p02) {
        q.f(p02, "p0");
        ((h6.d) this.receiver).resumeWith(s.b(p02));
    }
}
