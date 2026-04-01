package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import e6.s;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends o implements l<List<? extends StoreProduct>, i0> {
    CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, obj, h6.f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> p02) {
        q.f(p02, "p0");
        ((h6.d) this.receiver).resumeWith(s.b(p02));
    }
}
