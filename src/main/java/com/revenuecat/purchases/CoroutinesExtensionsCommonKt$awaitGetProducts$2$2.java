package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import e6.s;
import e6.t;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class CoroutinesExtensionsCommonKt$awaitGetProducts$2$2 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ h6.d<List<? extends StoreProduct>> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(h6.d<? super List<? extends StoreProduct>> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError it) {
        q.f(it, "it");
        h6.d<List<? extends StoreProduct>> dVar = this.$continuation;
        s.a aVar = s.f21442b;
        dVar.resumeWith(s.b(t.a(new PurchasesException(it))));
    }
}
