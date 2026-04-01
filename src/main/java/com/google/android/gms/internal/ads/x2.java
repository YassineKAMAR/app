package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x2 implements p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w0 f17016n = new w0() { // from class: com.google.android.gms.internal.ads.w2
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new x2(0)};
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f17020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1 f17021e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private td0 f17023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c1 f17024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v2 f17027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17029m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17017a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f17018b = new dq2(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f17019c = new x0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17022f = 0;

    public x2(int i8) {
    }

    private final long a(dq2 dq2Var, boolean z7) {
        boolean zC;
        this.f17024h.getClass();
        int iL = dq2Var.l();
        while (true) {
            if (iL > dq2Var.m() - 16) {
                if (!z7) {
                    dq2Var.g(iL);
                    return -1L;
                }
                while (iL <= dq2Var.m() - this.f17025i) {
                    dq2Var.g(iL);
                    try {
                        zC = y0.c(dq2Var, this.f17024h, this.f17026j, this.f17019c);
                    } catch (IndexOutOfBoundsException unused) {
                        zC = false;
                    }
                    if (dq2Var.l() > dq2Var.m() || !zC) {
                        iL++;
                    }
                }
                dq2Var.g(dq2Var.m());
                return -1L;
            }
            dq2Var.g(iL);
            if (y0.c(dq2Var, this.f17024h, this.f17026j, this.f17019c)) {
                break;
            }
            iL++;
        }
        dq2Var.g(iL);
        return this.f17019c.f16990a;
    }

    private final void b() {
        long j8 = this.f17029m * 1000000;
        c1 c1Var = this.f17024h;
        int i8 = nz2.f12300a;
        this.f17021e.a(j8 / ((long) c1Var.f6092e), 1, this.f17028l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        if (j8 == 0) {
            this.f17022f = 0;
        } else {
            v2 v2Var = this.f17027k;
            if (v2Var != null) {
                v2Var.d(j9);
            }
        }
        this.f17029m = j9 != 0 ? -1L : 0L;
        this.f17028l = 0;
        this.f17018b.d(0);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) throws Throwable {
        boolean zN;
        q1 p1Var;
        boolean z7;
        int i8 = this.f17022f;
        if (i8 == 0) {
            q0Var.t();
            long jM = q0Var.m();
            td0 td0VarA = z0.a(q0Var, true);
            ((f0) q0Var).d((int) (q0Var.m() - jM), false);
            this.f17023g = td0VarA;
            this.f17022f = 1;
            return 0;
        }
        if (i8 == 1) {
            ((f0) q0Var).L(this.f17017a, 0, 42, false);
            q0Var.t();
            this.f17022f = 2;
            return 0;
        }
        if (i8 == 2) {
            dq2 dq2Var = new dq2(4);
            ((f0) q0Var).J(dq2Var.i(), 0, 4, false);
            if (dq2Var.C() != 1716281667) {
                throw yh0.a("Failed to read FLAC stream marker.", null);
            }
            this.f17022f = 3;
            return 0;
        }
        if (i8 == 3) {
            c1 c1VarE = this.f17024h;
            do {
                q0Var.t();
                cp2 cp2Var = new cp2(new byte[4], 4);
                f0 f0Var = (f0) q0Var;
                f0Var.L(cp2Var.f6432a, 0, 4, false);
                zN = cp2Var.n();
                int iD = cp2Var.d(7);
                int iD2 = cp2Var.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    f0Var.J(bArr, 0, 38, false);
                    c1VarE = new c1(bArr, 4);
                } else {
                    if (c1VarE == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iD == 3) {
                        dq2 dq2Var2 = new dq2(iD2);
                        f0Var.J(dq2Var2.i(), 0, iD2, false);
                        c1VarE = c1VarE.f(z0.b(dq2Var2));
                    } else if (iD == 4) {
                        dq2 dq2Var3 = new dq2(iD2);
                        f0Var.J(dq2Var3.i(), 0, iD2, false);
                        dq2Var3.h(4);
                        c1VarE = c1VarE.g(Arrays.asList(c2.c(dq2Var3, false, false).f17971b));
                    } else if (iD == 6) {
                        dq2 dq2Var4 = new dq2(iD2);
                        f0Var.J(dq2Var4.i(), 0, iD2, false);
                        dq2Var4.h(4);
                        c1VarE = c1VarE.e(jb3.A(s3.b(dq2Var4)));
                    } else {
                        f0Var.d(iD2, false);
                    }
                }
                int i9 = nz2.f12300a;
                this.f17024h = c1VarE;
            } while (!zN);
            c1VarE.getClass();
            this.f17025i = Math.max(c1VarE.f6090c, 6);
            this.f17021e.e(this.f17024h.c(this.f17017a, this.f17023g));
            this.f17022f = 4;
            return 0;
        }
        if (i8 == 4) {
            q0Var.t();
            dq2 dq2Var5 = new dq2(2);
            ((f0) q0Var).L(dq2Var5.i(), 0, 2, false);
            int iY = dq2Var5.y();
            int i10 = iY >> 2;
            q0Var.t();
            if (i10 != 16382) {
                throw yh0.a("First frame does not start with sync code.", null);
            }
            this.f17026j = iY;
            s0 s0Var = this.f17020d;
            int i11 = nz2.f12300a;
            long jN = q0Var.n();
            long jP = q0Var.p();
            c1 c1Var = this.f17024h;
            c1Var.getClass();
            if (c1Var.f6098k != null) {
                p1Var = new a1(c1Var, jN);
            } else if (jP == -1 || c1Var.f6097j <= 0) {
                p1Var = new p1(c1Var.a(), 0L);
            } else {
                v2 v2Var = new v2(c1Var, this.f17026j, jN, jP);
                this.f17027k = v2Var;
                p1Var = v2Var.b();
            }
            s0Var.r(p1Var);
            this.f17022f = 5;
            return 0;
        }
        this.f17021e.getClass();
        c1 c1Var2 = this.f17024h;
        c1Var2.getClass();
        v2 v2Var2 = this.f17027k;
        if (v2Var2 != null && v2Var2.e()) {
            return v2Var2.a(q0Var, n1Var);
        }
        if (this.f17029m == -1) {
            this.f17029m = y0.b(q0Var, c1Var2);
            return 0;
        }
        dq2 dq2Var6 = this.f17018b;
        int iM = dq2Var6.m();
        if (iM < 32768) {
            int iH = q0Var.H(dq2Var6.i(), iM, 32768 - iM);
            z7 = iH == -1;
            if (!z7) {
                this.f17018b.f(iM + iH);
            } else if (this.f17018b.j() == 0) {
                b();
                return -1;
            }
        } else {
            z7 = false;
        }
        dq2 dq2Var7 = this.f17018b;
        int iL = dq2Var7.l();
        int i12 = this.f17028l;
        int i13 = this.f17025i;
        if (i12 < i13) {
            dq2Var7.h(Math.min(i13 - i12, dq2Var7.j()));
        }
        long jA = a(this.f17018b, z7);
        dq2 dq2Var8 = this.f17018b;
        int iL2 = dq2Var8.l() - iL;
        dq2Var8.g(iL);
        u1.b(this.f17021e, this.f17018b, iL2);
        this.f17028l += iL2;
        if (jA != -1) {
            b();
            this.f17028l = 0;
            this.f17029m = jA;
        }
        dq2 dq2Var9 = this.f17018b;
        if (dq2Var9.j() >= 16) {
            return 0;
        }
        int iJ = dq2Var9.j();
        System.arraycopy(dq2Var9.i(), dq2Var9.l(), dq2Var9.i(), 0, iJ);
        this.f17018b.g(0);
        this.f17018b.f(iJ);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) throws Throwable {
        z0.a(q0Var, false);
        dq2 dq2Var = new dq2(4);
        ((f0) q0Var).L(dq2Var.i(), 0, 4, false);
        return dq2Var.C() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f17020d = s0Var;
        this.f17021e = s0Var.f(0, 1);
        s0Var.d();
    }
}
