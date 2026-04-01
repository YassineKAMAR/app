package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class q6 implements Callable<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f20405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f20407c;

    q6(a6 a6Var, d0 d0Var, String str) {
        this.f20407c = a6Var;
        this.f20405a = d0Var;
        this.f20406b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f20407c.f19787a.o0();
        return this.f20407c.f19787a.j0().y(this.f20405a, this.f20406b);
    }
}
