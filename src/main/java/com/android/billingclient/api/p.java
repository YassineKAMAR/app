package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j1.m f4611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f4612c;

    p(c cVar, String str, j1.m mVar) {
        this.f4612c = cVar;
        this.f4610a = str;
        this.f4611b = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        j1.o0 o0VarI = c.I(this.f4612c, this.f4610a, 9);
        if (o0VarI.b() != null) {
            this.f4611b.a(o0VarI.a(), o0VarI.b());
            return null;
        }
        this.f4611b.a(o0VarI.a(), com.google.android.gms.internal.play_billing.g.y());
        return null;
    }
}
