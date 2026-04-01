package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l3 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f10441b;

    public l3(long j8, s0 s0Var) {
        this.f10440a = j8;
        this.f10441b = s0Var;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void d() {
        this.f10441b.d();
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final w1 f(int i8, int i9) {
        return this.f10441b.f(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void r(q1 q1Var) {
        this.f10441b.r(new k3(this, q1Var, q1Var));
    }
}
