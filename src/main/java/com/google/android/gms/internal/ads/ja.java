package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ja implements ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final la f9532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nb f9533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9537h;

    public ja(s0 s0Var, w1 w1Var, la laVar, String str, int i8) throws yh0 {
        this.f9530a = s0Var;
        this.f9531b = w1Var;
        this.f9532c = laVar;
        int i9 = laVar.f10557b * laVar.f10560e;
        int i10 = laVar.f10559d;
        int i11 = i9 / 8;
        if (i10 != i11) {
            throw yh0.a("Expected block size: " + i11 + "; got: " + i10, null);
        }
        int i12 = laVar.f10558c * i11;
        int i13 = i12 * 8;
        int iMax = Math.max(i11, i12 / 10);
        this.f9534e = iMax;
        l9 l9Var = new l9();
        l9Var.u(str);
        l9Var.j0(i13);
        l9Var.q(i13);
        l9Var.n(iMax);
        l9Var.k0(laVar.f10557b);
        l9Var.v(laVar.f10558c);
        l9Var.p(i8);
        this.f9533d = l9Var.D();
    }

    @Override // com.google.android.gms.internal.ads.ia
    public final void b(long j8) {
        this.f9535f = j8;
        this.f9536g = 0;
        this.f9537h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.ia
    public final void c(int i8, long j8) {
        this.f9530a.r(new pa(this.f9532c, 1, i8, j8));
        this.f9531b.e(this.f9533d);
    }

    @Override // com.google.android.gms.internal.ads.ia
    public final boolean d(q0 q0Var, long j8) {
        int i8;
        int i9;
        long j9 = j8;
        while (j9 > 0 && (i8 = this.f9536g) < (i9 = this.f9534e)) {
            int iA = u1.a(this.f9531b, q0Var, (int) Math.min(i9 - i8, j9), true);
            if (iA == -1) {
                j9 = 0;
            } else {
                this.f9536g += iA;
                j9 -= (long) iA;
            }
        }
        la laVar = this.f9532c;
        int i10 = this.f9536g;
        int i11 = laVar.f10559d;
        int i12 = i10 / i11;
        if (i12 > 0) {
            long jD = this.f9535f + nz2.D(this.f9537h, 1000000L, laVar.f10558c);
            int i13 = i12 * i11;
            int i14 = this.f9536g - i13;
            this.f9531b.a(jD, 1, i13, i14, null);
            this.f9537h += (long) i12;
            this.f9536g = i14;
        }
        return j9 <= 0;
    }
}
