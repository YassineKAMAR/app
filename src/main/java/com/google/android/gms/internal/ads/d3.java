package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final w1 f6549a;

    protected d3(w1 w1Var) {
        this.f6549a = w1Var;
    }

    protected abstract boolean a(dq2 dq2Var);

    protected abstract boolean b(dq2 dq2Var, long j8);

    public final boolean c(dq2 dq2Var, long j8) {
        return a(dq2Var) && b(dq2Var, j8);
    }
}
