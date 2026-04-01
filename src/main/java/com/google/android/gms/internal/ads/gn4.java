package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class gn4 implements rm4, qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm4 f8432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qm4 f8434c;

    public gn4(rm4 rm4Var, long j8) {
        this.f8432a = rm4Var;
        this.f8433b = j8;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
        this.f8432a.a(j8 - this.f8433b);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long b(long j8) {
        long j9 = this.f8433b;
        return this.f8432a.b(j8 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        long j8 = sc4Var.f14605a;
        long j9 = this.f8433b;
        qc4 qc4VarA = sc4Var.a();
        qc4VarA.e(j8 - j9);
        return this.f8432a.c(qc4VarA.g());
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final void d(rm4 rm4Var) {
        qm4 qm4Var = this.f8434c;
        qm4Var.getClass();
        qm4Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.mo4
    public final /* bridge */ /* synthetic */ void e(no4 no4Var) {
        qm4 qm4Var = this.f8434c;
        qm4Var.getClass();
        qm4Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long g(iq4[] iq4VarArr, boolean[] zArr, lo4[] lo4VarArr, boolean[] zArr2, long j8) {
        lo4[] lo4VarArr2 = new lo4[lo4VarArr.length];
        int i8 = 0;
        while (true) {
            lo4 lo4VarC = null;
            if (i8 >= lo4VarArr.length) {
                break;
            }
            hn4 hn4Var = (hn4) lo4VarArr[i8];
            if (hn4Var != null) {
                lo4VarC = hn4Var.c();
            }
            lo4VarArr2[i8] = lo4VarC;
            i8++;
        }
        long jG = this.f8432a.g(iq4VarArr, zArr, lo4VarArr2, zArr2, j8 - this.f8433b);
        for (int i9 = 0; i9 < lo4VarArr.length; i9++) {
            lo4 lo4Var = lo4VarArr2[i9];
            if (lo4Var == null) {
                lo4VarArr[i9] = null;
            } else {
                lo4 lo4Var2 = lo4VarArr[i9];
                if (lo4Var2 == null || ((hn4) lo4Var2).c() != lo4Var) {
                    lo4VarArr[i9] = new hn4(lo4Var, this.f8433b);
                }
            }
        }
        return jG + this.f8433b;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void h(long j8, boolean z7) {
        this.f8432a.h(j8 - this.f8433b, false);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void i(qm4 qm4Var, long j8) {
        this.f8434c = qm4Var;
        this.f8432a.i(this, j8 - this.f8433b);
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long k() {
        long jK = this.f8432a.k();
        if (jK == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jK + this.f8433b;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long l() {
        long jL = this.f8432a.l();
        if (jL == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jL + this.f8433b;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final to4 o() {
        return this.f8432a.o();
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long p() {
        long jP = this.f8432a.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jP + this.f8433b;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long q(long j8, wd4 wd4Var) {
        long j9 = this.f8433b;
        return this.f8432a.q(j8 - j9, wd4Var) + j9;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void s() {
        this.f8432a.s();
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean y() {
        return this.f8432a.y();
    }
}
