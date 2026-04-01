package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lm4 implements rm4, qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm4 f10779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vm4 f10781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private rm4 f10782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qm4 f10783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10784f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xq4 f10785g;

    public lm4(tm4 tm4Var, xq4 xq4Var, long j8) {
        this.f10779a = tm4Var;
        this.f10785g = xq4Var;
        this.f10780b = j8;
    }

    private final long u(long j8) {
        long j9 = this.f10784f;
        return j9 != -9223372036854775807L ? j9 : j8;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        rm4Var.a(j8);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long b(long j8) {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.b(j8);
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        rm4 rm4Var = this.f10782d;
        return rm4Var != null && rm4Var.c(sc4Var);
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final void d(rm4 rm4Var) {
        qm4 qm4Var = this.f10783e;
        int i8 = nz2.f12300a;
        qm4Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.mo4
    public final /* bridge */ /* synthetic */ void e(no4 no4Var) {
        qm4 qm4Var = this.f10783e;
        int i8 = nz2.f12300a;
        qm4Var.e(this);
    }

    public final long f() {
        return this.f10784f;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long g(iq4[] iq4VarArr, boolean[] zArr, lo4[] lo4VarArr, boolean[] zArr2, long j8) {
        long j9;
        long j10 = this.f10784f;
        if (j10 == -9223372036854775807L || j8 != this.f10780b) {
            j9 = j8;
        } else {
            this.f10784f = -9223372036854775807L;
            j9 = j10;
        }
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.g(iq4VarArr, zArr, lo4VarArr, zArr2, j9);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void h(long j8, boolean z7) {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        rm4Var.h(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void i(qm4 qm4Var, long j8) {
        this.f10783e = qm4Var;
        rm4 rm4Var = this.f10782d;
        if (rm4Var != null) {
            rm4Var.i(this, u(this.f10780b));
        }
    }

    public final long j() {
        return this.f10780b;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long k() {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.k();
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long l() {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.l();
    }

    public final void m(tm4 tm4Var) {
        long jU = u(this.f10780b);
        vm4 vm4Var = this.f10781c;
        vm4Var.getClass();
        rm4 rm4VarZ = vm4Var.Z(tm4Var, this.f10785g, jU);
        this.f10782d = rm4VarZ;
        if (this.f10783e != null) {
            rm4VarZ.i(this, jU);
        }
    }

    public final void n(long j8) {
        this.f10784f = j8;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final to4 o() {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.o();
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long p() {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.p();
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long q(long j8, wd4 wd4Var) {
        rm4 rm4Var = this.f10782d;
        int i8 = nz2.f12300a;
        return rm4Var.q(j8, wd4Var);
    }

    public final void r() {
        rm4 rm4Var = this.f10782d;
        if (rm4Var != null) {
            vm4 vm4Var = this.f10781c;
            vm4Var.getClass();
            vm4Var.Y(rm4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void s() throws IOException {
        try {
            rm4 rm4Var = this.f10782d;
            if (rm4Var != null) {
                rm4Var.s();
                return;
            }
            vm4 vm4Var = this.f10781c;
            if (vm4Var != null) {
                vm4Var.W();
            }
        } catch (IOException e8) {
            throw e8;
        }
    }

    public final void t(vm4 vm4Var) {
        uu1.f(this.f10781c == null);
        this.f10781c = vm4Var;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean y() {
        rm4 rm4Var = this.f10782d;
        return rm4Var != null && rm4Var.y();
    }
}
