package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class uc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm4 f15609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lo4[] f15611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vc4 f15614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f15616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ud4[] f15617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final oq4 f15618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kd4 f15619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private uc4 f15620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private to4 f15621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private pq4 f15622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f15623o;

    public uc4(ud4[] ud4VarArr, long j8, oq4 oq4Var, xq4 xq4Var, kd4 kd4Var, vc4 vc4Var, pq4 pq4Var) {
        this.f15617i = ud4VarArr;
        this.f15623o = j8;
        this.f15618j = oq4Var;
        this.f15619k = kd4Var;
        tm4 tm4Var = vc4Var.f16104a;
        this.f15610b = tm4Var.f15161a;
        this.f15614f = vc4Var;
        this.f15621m = to4.f15200d;
        this.f15622n = pq4Var;
        this.f15611c = new lo4[2];
        this.f15616h = new boolean[2];
        long j9 = vc4Var.f16105b;
        long j10 = vc4Var.f16107d;
        rm4 rm4VarP = kd4Var.p(tm4Var, xq4Var, j9);
        this.f15609a = j10 != -9223372036854775807L ? new yl4(rm4VarP, true, 0L, j10) : rm4VarP;
    }

    private final void s() {
        if (!u()) {
            return;
        }
        int i8 = 0;
        while (true) {
            pq4 pq4Var = this.f15622n;
            if (i8 >= pq4Var.f12995a) {
                return;
            }
            pq4Var.b(i8);
            iq4 iq4Var = this.f15622n.f12997c[i8];
            i8++;
        }
    }

    private final void t() {
        if (!u()) {
            return;
        }
        int i8 = 0;
        while (true) {
            pq4 pq4Var = this.f15622n;
            if (i8 >= pq4Var.f12995a) {
                return;
            }
            pq4Var.b(i8);
            iq4 iq4Var = this.f15622n.f12997c[i8];
            i8++;
        }
    }

    private final boolean u() {
        return this.f15620l == null;
    }

    public final long a(pq4 pq4Var, long j8, boolean z7) {
        return b(pq4Var, j8, false, new boolean[2]);
    }

    public final long b(pq4 pq4Var, long j8, boolean z7, boolean[] zArr) {
        int i8 = 0;
        while (true) {
            boolean z8 = true;
            if (i8 >= pq4Var.f12995a) {
                break;
            }
            boolean[] zArr2 = this.f15616h;
            if (z7 || !pq4Var.a(this.f15622n, i8)) {
                z8 = false;
            }
            zArr2[i8] = z8;
            i8++;
        }
        int i9 = 0;
        while (true) {
            ud4[] ud4VarArr = this.f15617i;
            if (i9 >= 2) {
                break;
            }
            ud4VarArr[i9].k();
            i9++;
        }
        s();
        this.f15622n = pq4Var;
        t();
        long jG = this.f15609a.g(pq4Var.f12997c, this.f15616h, this.f15611c, zArr, j8);
        int i10 = 0;
        while (true) {
            ud4[] ud4VarArr2 = this.f15617i;
            if (i10 >= 2) {
                break;
            }
            ud4VarArr2[i10].k();
            i10++;
        }
        this.f15613e = false;
        int i11 = 0;
        while (true) {
            lo4[] lo4VarArr = this.f15611c;
            if (i11 >= 2) {
                return jG;
            }
            if (lo4VarArr[i11] != null) {
                uu1.f(pq4Var.b(i11));
                this.f15617i[i11].k();
                this.f15613e = true;
            } else {
                uu1.f(pq4Var.f12997c[i11] == null);
            }
            i11++;
        }
    }

    public final long c() {
        if (!this.f15612d) {
            return this.f15614f.f16105b;
        }
        long jK = this.f15613e ? this.f15609a.k() : Long.MIN_VALUE;
        return jK == Long.MIN_VALUE ? this.f15614f.f16108e : jK;
    }

    public final long d() {
        if (this.f15612d) {
            return this.f15609a.l();
        }
        return 0L;
    }

    public final long e() {
        return this.f15623o;
    }

    public final long f() {
        return this.f15614f.f16105b + this.f15623o;
    }

    public final uc4 g() {
        return this.f15620l;
    }

    public final to4 h() {
        return this.f15621m;
    }

    public final pq4 i() {
        return this.f15622n;
    }

    public final pq4 j(float f8, s11 s11Var) {
        pq4 pq4VarE = this.f15618j.e(this.f15617i, this.f15621m, this.f15614f.f16104a, s11Var);
        for (iq4 iq4Var : pq4VarE.f12997c) {
        }
        return pq4VarE;
    }

    public final void k(long j8, float f8, long j9) {
        uu1.f(u());
        long j10 = j8 - this.f15623o;
        qc4 qc4Var = new qc4();
        qc4Var.e(j10);
        qc4Var.f(f8);
        qc4Var.d(j9);
        this.f15609a.c(new sc4(qc4Var, null));
    }

    public final void l(float f8, s11 s11Var) {
        this.f15612d = true;
        this.f15621m = this.f15609a.o();
        pq4 pq4VarJ = j(f8, s11Var);
        vc4 vc4Var = this.f15614f;
        long jMax = vc4Var.f16105b;
        long j8 = vc4Var.f16108e;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jA = a(pq4VarJ, jMax, false);
        long j9 = this.f15623o;
        vc4 vc4Var2 = this.f15614f;
        this.f15623o = j9 + (vc4Var2.f16105b - jA);
        this.f15614f = vc4Var2.b(jA);
    }

    public final void m(long j8) {
        uu1.f(u());
        if (this.f15612d) {
            this.f15609a.a(j8 - this.f15623o);
        }
    }

    public final void n() {
        s();
        rm4 rm4Var = this.f15609a;
        try {
            boolean z7 = rm4Var instanceof yl4;
            kd4 kd4Var = this.f15619k;
            if (z7) {
                kd4Var.i(((yl4) rm4Var).f17810a);
            } else {
                kd4Var.i(rm4Var);
            }
        } catch (RuntimeException e8) {
            pf2.d("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public final void o(uc4 uc4Var) {
        if (uc4Var == this.f15620l) {
            return;
        }
        s();
        this.f15620l = uc4Var;
        t();
    }

    public final void p(long j8) {
        this.f15623o = 1000000000000L;
    }

    public final void q() {
        rm4 rm4Var = this.f15609a;
        if (rm4Var instanceof yl4) {
            long j8 = this.f15614f.f16107d;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            ((yl4) rm4Var).f(0L, j8);
        }
    }

    public final boolean r() {
        return this.f15612d && (!this.f15613e || this.f15609a.k() == Long.MIN_VALUE);
    }
}
