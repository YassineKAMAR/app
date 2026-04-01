package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class s6 implements Callable<List<jb>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f20479b;

    s6(a6 a6Var, String str) {
        this.f20479b = a6Var;
        this.f20478a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        this.f20479b.f19787a.o0();
        return this.f20479b.f19787a.e0().M0(this.f20478a);
    }
}
