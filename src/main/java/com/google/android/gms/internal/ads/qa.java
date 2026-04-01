package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class qa implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f13367a = new dq2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s1 f13368b = new s1();

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f13368b.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) {
        return this.f13368b.a(q0Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) throws EOFException, InterruptedIOException {
        this.f13367a.d(4);
        f0 f0Var = (f0) q0Var;
        f0Var.L(this.f13367a.i(), 0, 4, false);
        if (this.f13367a.C() == 1380533830) {
            f0Var.c(4, false);
            this.f13367a.d(4);
            f0Var.L(this.f13367a.i(), 0, 4, false);
            if (this.f13367a.C() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f13368b.b(s0Var, "image/webp");
    }
}
