package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xl1 extends gl1 implements hc1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hc1 f17361f;

    @Override // com.google.android.gms.internal.ads.hc1
    public final synchronized void C() {
        hc1 hc1Var = this.f17361f;
        if (hc1Var != null) {
            hc1Var.C();
        }
    }

    protected final synchronized void e(h2.a aVar, ey eyVar, i2.u uVar, hy hyVar, i2.f0 f0Var, hc1 hc1Var) {
        super.a(aVar, eyVar, uVar, hyVar, f0Var);
        this.f17361f = hc1Var;
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final synchronized void f0() {
        hc1 hc1Var = this.f17361f;
        if (hc1Var != null) {
            hc1Var.f0();
        }
    }
}
