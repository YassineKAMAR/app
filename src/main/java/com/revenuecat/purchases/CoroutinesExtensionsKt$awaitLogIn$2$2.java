package com.revenuecat.purchases;

import com.revenuecat.purchases.data.LogInResult;
import e6.i0;
import e6.s;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends r implements p<CustomerInfo, Boolean, i0> {
    final /* synthetic */ h6.d<LogInResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsKt$awaitLogIn$2$2(h6.d<? super LogInResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // p6.p
    public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
        invoke(customerInfo, bool.booleanValue());
        return i0.f21430a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z7) {
        q.f(customerInfo, "customerInfo");
        h6.d<LogInResult> dVar = this.$continuation;
        s.a aVar = s.f21442b;
        dVar.resumeWith(s.b(new LogInResult(customerInfo, z7)));
    }
}
