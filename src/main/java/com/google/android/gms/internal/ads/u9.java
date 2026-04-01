package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class u9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15572e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx2 f15568a = new kx2(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15573f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15574g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15575h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f15569b = new dq2();

    u9(int i8) {
    }

    private final int e(q0 q0Var) {
        byte[] bArr = nz2.f12305f;
        int length = bArr.length;
        this.f15569b.e(bArr, 0);
        this.f15570c = true;
        q0Var.t();
        return 0;
    }

    public final int a(q0 q0Var, n1 n1Var, int i8) {
        if (i8 <= 0) {
            e(q0Var);
            return 0;
        }
        long j8 = -9223372036854775807L;
        if (!this.f15572e) {
            long jP = q0Var.p();
            int iMin = (int) Math.min(112800L, jP);
            long j9 = jP - ((long) iMin);
            if (q0Var.n() != j9) {
                n1Var.f11591a = j9;
                return 1;
            }
            this.f15569b.d(iMin);
            q0Var.t();
            ((f0) q0Var).L(this.f15569b.i(), 0, iMin, false);
            dq2 dq2Var = this.f15569b;
            int iL = dq2Var.l();
            int iM = dq2Var.m();
            int i9 = iM - 188;
            while (true) {
                if (i9 < iL) {
                    break;
                }
                byte[] bArrI = dq2Var.i();
                int i10 = -4;
                int i11 = 0;
                while (true) {
                    if (i10 > 4) {
                        break;
                    }
                    int i12 = (i10 * 188) + i9;
                    if (i12 < iL || i12 >= iM || bArrI[i12] != 71) {
                        i11 = 0;
                    } else {
                        i11++;
                        if (i11 == 5) {
                            long jB = ea.b(dq2Var, i9, i8);
                            if (jB != -9223372036854775807L) {
                                j8 = jB;
                                break;
                            }
                        }
                    }
                    i10++;
                }
                i9--;
            }
            this.f15574g = j8;
            this.f15572e = true;
            return 0;
        }
        if (this.f15574g == -9223372036854775807L) {
            e(q0Var);
            return 0;
        }
        if (this.f15571d) {
            long j10 = this.f15573f;
            if (j10 == -9223372036854775807L) {
                e(q0Var);
                return 0;
            }
            kx2 kx2Var = this.f15568a;
            long jB2 = kx2Var.b(this.f15574g) - kx2Var.b(j10);
            this.f15575h = jB2;
            if (jB2 < 0) {
                pf2.f("TsDurationReader", "Invalid duration: " + jB2 + ". Using TIME_UNSET instead.");
                this.f15575h = -9223372036854775807L;
            }
            e(q0Var);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, q0Var.p());
        if (q0Var.n() != 0) {
            n1Var.f11591a = 0L;
            return 1;
        }
        this.f15569b.d(iMin2);
        q0Var.t();
        ((f0) q0Var).L(this.f15569b.i(), 0, iMin2, false);
        dq2 dq2Var2 = this.f15569b;
        int iL2 = dq2Var2.l();
        int iM2 = dq2Var2.m();
        while (true) {
            if (iL2 >= iM2) {
                break;
            }
            if (dq2Var2.i()[iL2] == 71) {
                long jB3 = ea.b(dq2Var2, iL2, i8);
                if (jB3 != -9223372036854775807L) {
                    j8 = jB3;
                    break;
                }
            }
            iL2++;
        }
        this.f15573f = j8;
        this.f15571d = true;
        return 0;
    }

    public final long b() {
        return this.f15575h;
    }

    public final kx2 c() {
        return this.f15568a;
    }

    public final boolean d() {
        return this.f15570c;
    }
}
