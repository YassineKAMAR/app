package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class m7 implements s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f11191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b1 f11192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11193c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11194d = -1;

    public m7(c1 c1Var, b1 b1Var) {
        this.f11191a = c1Var;
        this.f11192b = b1Var;
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final long a(q0 q0Var) {
        long j8 = this.f11194d;
        if (j8 < 0) {
            return -1L;
        }
        this.f11194d = -1L;
        return -(j8 + 2);
    }

    public final void b(long j8) {
        this.f11193c = j8;
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final q1 m() {
        uu1.f(this.f11193c != -1);
        return new a1(this.f11191a, this.f11193c);
    }

    @Override // com.google.android.gms.internal.ads.s7
    public final void p(long j8) {
        long[] jArr = this.f11192b.f5553a;
        this.f11194d = jArr[nz2.o(jArr, j8, true, true)];
    }
}
