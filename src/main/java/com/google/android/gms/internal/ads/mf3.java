package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class mf3 extends xe3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private lf3 f11279p;

    mf3(eb3 eb3Var, boolean z7, Executor executor, Callable callable) {
        super(eb3Var, z7, false);
        this.f11279p = new kf3(this, callable, executor);
        R();
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void P(int i8, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void Q() {
        lf3 lf3Var = this.f11279p;
        if (lf3Var != null) {
            lf3Var.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void U(int i8) {
        super.U(i8);
        if (i8 == 1) {
            this.f11279p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void s() {
        lf3 lf3Var = this.f11279p;
        if (lf3Var != null) {
            lf3Var.g();
        }
    }
}
