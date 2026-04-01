package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class l6 implements Callable<p3.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f20195b;

    l6(a6 a6Var, lb lbVar) {
        this.f20195b = a6Var;
        this.f20194a = lbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ p3.c call() {
        this.f20195b.f19787a.o0();
        return new p3.c(this.f20195b.f19787a.b(this.f20194a.f20210a));
    }
}
