package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class k9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9992e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx2 f9988a = new kx2(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9993f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9994g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9995h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f9989b = new dq2();

    k9() {
    }

    public static long c(dq2 dq2Var) {
        int iL = dq2Var.l();
        if (dq2Var.j() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dq2Var.c(bArr, 0, 9);
        dq2Var.g(iL);
        byte b8 = bArr[0];
        if ((b8 & 196) == 68) {
            byte b9 = bArr[2];
            if ((b9 & 4) == 4) {
                byte b10 = bArr[4];
                if ((b10 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j8 = b8;
                    long j9 = b9;
                    return ((j9 & 3) << 13) | ((j8 & 3) << 28) | (((56 & j8) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j9 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b10) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int f(q0 q0Var) {
        byte[] bArr = nz2.f12305f;
        int length = bArr.length;
        this.f9989b.e(bArr, 0);
        this.f9990c = true;
        q0Var.t();
        return 0;
    }

    private static final int g(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    public final int a(q0 q0Var, n1 n1Var) {
        long j8 = -9223372036854775807L;
        if (!this.f9992e) {
            long jP = q0Var.p();
            int iMin = (int) Math.min(20000L, jP);
            long j9 = jP - ((long) iMin);
            if (q0Var.n() != j9) {
                n1Var.f11591a = j9;
                return 1;
            }
            this.f9989b.d(iMin);
            q0Var.t();
            ((f0) q0Var).L(this.f9989b.i(), 0, iMin, false);
            dq2 dq2Var = this.f9989b;
            int iL = dq2Var.l();
            int iM = dq2Var.m() - 4;
            while (true) {
                if (iM < iL) {
                    break;
                }
                if (g(dq2Var.i(), iM) == 442) {
                    dq2Var.g(iM + 4);
                    long jC = c(dq2Var);
                    if (jC != -9223372036854775807L) {
                        j8 = jC;
                        break;
                    }
                }
                iM--;
            }
            this.f9994g = j8;
            this.f9992e = true;
            return 0;
        }
        if (this.f9994g == -9223372036854775807L) {
            f(q0Var);
            return 0;
        }
        if (this.f9991d) {
            long j10 = this.f9993f;
            if (j10 == -9223372036854775807L) {
                f(q0Var);
                return 0;
            }
            kx2 kx2Var = this.f9988a;
            long jB = kx2Var.b(this.f9994g) - kx2Var.b(j10);
            this.f9995h = jB;
            if (jB < 0) {
                pf2.f("PsDurationReader", "Invalid duration: " + jB + ". Using TIME_UNSET instead.");
                this.f9995h = -9223372036854775807L;
            }
            f(q0Var);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, q0Var.p());
        if (q0Var.n() != 0) {
            n1Var.f11591a = 0L;
            return 1;
        }
        this.f9989b.d(iMin2);
        q0Var.t();
        ((f0) q0Var).L(this.f9989b.i(), 0, iMin2, false);
        dq2 dq2Var2 = this.f9989b;
        int iL2 = dq2Var2.l();
        int iM2 = dq2Var2.m();
        while (true) {
            if (iL2 >= iM2 - 3) {
                break;
            }
            if (g(dq2Var2.i(), iL2) == 442) {
                dq2Var2.g(iL2 + 4);
                long jC2 = c(dq2Var2);
                if (jC2 != -9223372036854775807L) {
                    j8 = jC2;
                    break;
                }
            }
            iL2++;
        }
        this.f9993f = j8;
        this.f9991d = true;
        return 0;
    }

    public final long b() {
        return this.f9995h;
    }

    public final kx2 d() {
        return this.f9988a;
    }

    public final boolean e() {
        return this.f9990c;
    }
}
