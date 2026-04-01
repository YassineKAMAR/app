package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class kf3 extends lf3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable f10060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ mf3 f10061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kf3(mf3 mf3Var, Callable callable, Executor executor) {
        super(mf3Var, executor);
        this.f10061f = mf3Var;
        this.f10060e = callable;
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final Object a() {
        return this.f10060e.call();
    }

    @Override // com.google.android.gms.internal.ads.kg3
    final String b() {
        return this.f10060e.toString();
    }

    @Override // com.google.android.gms.internal.ads.lf3
    final void h(Object obj) {
        this.f10061f.f(obj);
    }
}
