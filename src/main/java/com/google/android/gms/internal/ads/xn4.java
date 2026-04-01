package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class xn4 implements rm4, s0, dr4, ir4, jo4 {
    private static final Map Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final nb f17381a0;
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private long E;
    private long F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean W;
    private final cr4 X;
    private final xq4 Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f17382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final po3 f17383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sj4 f17384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dn4 f17385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lj4 f17386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sn4 f17387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final lr4 f17389h = new lr4("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ln4 f17390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final yx1 f17391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f17392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f17393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f17394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f17395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private qm4 f17396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w3 f17397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ko4[] f17398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private un4[] f17399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private vn4 f17403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private q1 f17404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f17405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17407z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        Z = Collections.unmodifiableMap(map);
        l9 l9Var = new l9();
        l9Var.j("icy");
        l9Var.u("application/x-icy");
        f17381a0 = l9Var.D();
    }

    public xn4(Uri uri, po3 po3Var, ln4 ln4Var, sj4 sj4Var, lj4 lj4Var, cr4 cr4Var, dn4 dn4Var, sn4 sn4Var, xq4 xq4Var, String str, int i8, long j8) {
        this.f17382a = uri;
        this.f17383b = po3Var;
        this.f17384c = sj4Var;
        this.f17386e = lj4Var;
        this.X = cr4Var;
        this.f17385d = dn4Var;
        this.f17387f = sn4Var;
        this.Y = xq4Var;
        this.f17388g = i8;
        this.f17390i = ln4Var;
        this.f17405x = j8;
        this.f17395n = j8 != -9223372036854775807L;
        this.f17391j = new yx1(vv1.f16482a);
        this.f17392k = new Runnable() { // from class: com.google.android.gms.internal.ads.nn4
            @Override // java.lang.Runnable
            public final void run() {
                this.f11929a.I();
            }
        };
        this.f17393l = new Runnable() { // from class: com.google.android.gms.internal.ads.on4
            @Override // java.lang.Runnable
            public final void run() {
                this.f12572a.w();
            }
        };
        this.f17394m = nz2.H(null);
        this.f17399r = new un4[0];
        this.f17398q = new ko4[0];
        this.F = -9223372036854775807L;
        this.f17407z = 1;
    }

    private final int E() {
        int iX = 0;
        for (ko4 ko4Var : this.f17398q) {
            iX += ko4Var.x();
        }
        return iX;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long F(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.ko4[] r3 = r5.f17398q
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.vn4 r4 = r5.f17403v
            r4.getClass()
            boolean[] r4 = r4.f16386c
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.z()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xn4.F(boolean):long");
    }

    private final w1 G(un4 un4Var) {
        int length = this.f17398q.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (un4Var.equals(this.f17399r[i8])) {
                return this.f17398q[i8];
            }
        }
        ko4 ko4Var = new ko4(this.Y, this.f17384c, this.f17386e);
        ko4Var.J(this);
        int i9 = length + 1;
        un4[] un4VarArr = (un4[]) Arrays.copyOf(this.f17399r, i9);
        un4VarArr[length] = un4Var;
        int i10 = nz2.f12300a;
        this.f17399r = un4VarArr;
        ko4[] ko4VarArr = (ko4[]) Arrays.copyOf(this.f17398q, i9);
        ko4VarArr[length] = ko4Var;
        this.f17398q = ko4VarArr;
        return ko4Var;
    }

    private final void H() {
        uu1.f(this.f17401t);
        this.f17403v.getClass();
        this.f17404w.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        int i8;
        if (this.W || this.f17401t || !this.f17400s || this.f17404w == null) {
            return;
        }
        for (ko4 ko4Var : this.f17398q) {
            if (ko4Var.A() == null) {
                return;
            }
        }
        this.f17391j.c();
        int length = this.f17398q.length;
        u31[] u31VarArr = new u31[length];
        boolean[] zArr = new boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            nb nbVarA = this.f17398q[i9].A();
            nbVarA.getClass();
            String str = nbVarA.f11793l;
            boolean zF = xg0.f(str);
            boolean z7 = zF || xg0.g(str);
            zArr[i9] = z7;
            this.f17402u = z7 | this.f17402u;
            w3 w3Var = this.f17397p;
            if (w3Var != null) {
                if (zF || this.f17399r[i9].f15782b) {
                    td0 td0Var = nbVarA.f11791j;
                    td0 td0Var2 = td0Var == null ? new td0(-9223372036854775807L, w3Var) : td0Var.d(w3Var);
                    l9 l9VarB = nbVarA.b();
                    l9VarB.o(td0Var2);
                    nbVarA = l9VarB.D();
                }
                if (zF && nbVarA.f11787f == -1 && nbVarA.f11788g == -1 && (i8 = w3Var.f16602a) != -1) {
                    l9 l9VarB2 = nbVarA.b();
                    l9VarB2.j0(i8);
                    nbVarA = l9VarB2.D();
                }
            }
            u31VarArr[i9] = new u31(Integer.toString(i9), nbVarA.c(this.f17384c.b(nbVarA)));
        }
        this.f17403v = new vn4(new to4(u31VarArr), zArr);
        this.f17401t = true;
        qm4 qm4Var = this.f17396o;
        qm4Var.getClass();
        qm4Var.d(this);
    }

    private final void J(int i8) {
        H();
        vn4 vn4Var = this.f17403v;
        boolean[] zArr = vn4Var.f16387d;
        if (zArr[i8]) {
            return;
        }
        nb nbVarB = vn4Var.f16384a.b(i8).b(0);
        this.f17385d.c(new pm4(1, xg0.b(nbVarB.f11793l), nbVarB, 0, null, nz2.E(this.E), -9223372036854775807L));
        zArr[i8] = true;
    }

    private final void K(int i8) {
        H();
        boolean[] zArr = this.f17403v.f16385b;
        if (this.G && zArr[i8] && !this.f17398q[i8].M(false)) {
            this.F = 0L;
            this.G = false;
            this.B = true;
            this.E = 0L;
            this.H = 0;
            for (ko4 ko4Var : this.f17398q) {
                ko4Var.H(false);
            }
            qm4 qm4Var = this.f17396o;
            qm4Var.getClass();
            qm4Var.e(this);
        }
    }

    private final void M() {
        rn4 rn4Var = new rn4(this, this.f17382a, this.f17383b, this.f17390i, this, this.f17391j);
        if (this.f17401t) {
            uu1.f(N());
            long j8 = this.f17405x;
            if (j8 != -9223372036854775807L && this.F > j8) {
                this.I = true;
                this.F = -9223372036854775807L;
                return;
            }
            q1 q1Var = this.f17404w;
            q1Var.getClass();
            rn4.f(rn4Var, q1Var.p(this.F).f12324a.f13857b, this.F);
            for (ko4 ko4Var : this.f17398q) {
                ko4Var.I(this.F);
            }
            this.F = -9223372036854775807L;
        }
        this.H = E();
        long jA = this.f17389h.a(rn4Var, this, cr4.a(this.f17407z));
        ut3 ut3Var = rn4Var.f14249k;
        this.f17385d.g(new km4(rn4Var.f14239a, ut3Var, ut3Var.f15867a, Collections.emptyMap(), jA, 0L, 0L), new pm4(1, -1, null, 0, null, nz2.E(rn4Var.f14248j), nz2.E(this.f17405x)));
    }

    private final boolean N() {
        return this.F != -9223372036854775807L;
    }

    private final boolean O() {
        return this.B || N();
    }

    static /* bridge */ /* synthetic */ long T(xn4 xn4Var, boolean z7) {
        return xn4Var.F(true);
    }

    static /* bridge */ /* synthetic */ void v(final xn4 xn4Var) {
        xn4Var.f17394m.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mn4
            @Override // java.lang.Runnable
            public final void run() {
                this.f11424a.x();
            }
        });
    }

    final void A() throws IOException {
        this.f17389h.i(cr4.a(this.f17407z));
    }

    final void B(int i8) {
        this.f17398q[i8].E();
        A();
    }

    public final void C() {
        if (this.f17401t) {
            for (ko4 ko4Var : this.f17398q) {
                ko4Var.F();
            }
        }
        this.f17389h.j(this);
        this.f17394m.removeCallbacksAndMessages(null);
        this.f17396o = null;
        this.W = true;
    }

    final boolean D(int i8) {
        return !O() && this.f17398q[i8].M(this.I);
    }

    @Override // com.google.android.gms.internal.ads.ir4
    public final void L() {
        for (ko4 ko4Var : this.f17398q) {
            ko4Var.G();
        }
        this.f17390i.m();
    }

    final int P(int i8, nc4 nc4Var, q94 q94Var, int i9) {
        if (O()) {
            return -3;
        }
        J(i8);
        int iY = this.f17398q[i8].y(nc4Var, q94Var, i9, this.I);
        if (iY == -3) {
            K(i8);
        }
        return iY;
    }

    final int Q(int i8, long j8) {
        if (O()) {
            return 0;
        }
        J(i8);
        ko4 ko4Var = this.f17398q[i8];
        int iW = ko4Var.w(j8, this.I);
        ko4Var.K(iW);
        if (iW != 0) {
            return iW;
        }
        K(i8);
        return 0;
    }

    final w1 W() {
        return G(new un4(0, true));
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long b(long j8) {
        H();
        boolean[] zArr = this.f17403v.f16385b;
        if (true != this.f17404w.o()) {
            j8 = 0;
        }
        this.B = false;
        this.E = j8;
        if (N()) {
            this.F = j8;
            return j8;
        }
        if (this.f17407z != 7) {
            int length = this.f17398q.length;
            for (int i8 = 0; i8 < length; i8++) {
                ko4 ko4Var = this.f17398q[i8];
                if ((this.f17395n ? ko4Var.N(ko4Var.u()) : ko4Var.g(j8, false)) || (!zArr[i8] && this.f17402u)) {
                }
            }
            return j8;
        }
        this.G = false;
        this.F = j8;
        this.I = false;
        lr4 lr4Var = this.f17389h;
        if (lr4Var.l()) {
            for (ko4 ko4Var2 : this.f17398q) {
                ko4Var2.C();
            }
            this.f17389h.g();
        } else {
            lr4Var.h();
            for (ko4 ko4Var3 : this.f17398q) {
                ko4Var3.H(false);
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        if (this.I) {
            return false;
        }
        lr4 lr4Var = this.f17389h;
        if (lr4Var.k() || this.G) {
            return false;
        }
        if (this.f17401t && this.C == 0) {
            return false;
        }
        boolean zE = this.f17391j.e();
        if (lr4Var.l()) {
            return zE;
        }
        M();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void d() {
        this.f17400s = true;
        this.f17394m.post(this.f17392k);
    }

    @Override // com.google.android.gms.internal.ads.dr4
    public final /* bridge */ /* synthetic */ void e(hr4 hr4Var, long j8, long j9, boolean z7) {
        rn4 rn4Var = (rn4) hr4Var;
        f94 f94Var = rn4Var.f14241c;
        km4 km4Var = new km4(rn4Var.f14239a, rn4Var.f14249k, f94Var.d(), f94Var.e(), j8, j9, f94Var.c());
        long unused = rn4Var.f14239a;
        this.f17385d.d(km4Var, new pm4(1, -1, null, 0, null, nz2.E(rn4Var.f14248j), nz2.E(this.f17405x)));
        if (z7) {
            return;
        }
        for (ko4 ko4Var : this.f17398q) {
            ko4Var.H(false);
        }
        if (this.C > 0) {
            qm4 qm4Var = this.f17396o;
            qm4Var.getClass();
            qm4Var.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final w1 f(int i8, int i9) {
        return G(new un4(i8, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[PHI: r12
  0x004a: PHI (r12v1 long) = (r12v0 long), (r12v5 long), (r12v0 long) binds: [B:14:0x003a, B:22:0x0049, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.rm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(com.google.android.gms.internal.ads.iq4[] r8, boolean[] r9, com.google.android.gms.internal.ads.lo4[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xn4.g(com.google.android.gms.internal.ads.iq4[], boolean[], com.google.android.gms.internal.ads.lo4[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void h(long j8, boolean z7) {
        if (this.f17395n) {
            return;
        }
        H();
        if (N()) {
            return;
        }
        boolean[] zArr = this.f17403v.f16386c;
        int length = this.f17398q.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f17398q[i8].B(j8, false, zArr[i8]);
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void i(qm4 qm4Var, long j8) {
        this.f17396o = qm4Var;
        this.f17391j.e();
        M();
    }

    @Override // com.google.android.gms.internal.ads.dr4
    public final /* bridge */ /* synthetic */ void j(hr4 hr4Var, long j8, long j9) {
        q1 q1Var;
        if (this.f17405x == -9223372036854775807L && (q1Var = this.f17404w) != null) {
            boolean zO = q1Var.o();
            long jF = F(true);
            long j10 = jF == Long.MIN_VALUE ? 0L : jF + 10000;
            this.f17405x = j10;
            this.f17387f.a(j10, zO, this.f17406y);
        }
        rn4 rn4Var = (rn4) hr4Var;
        f94 f94Var = rn4Var.f14241c;
        km4 km4Var = new km4(rn4Var.f14239a, rn4Var.f14249k, f94Var.d(), f94Var.e(), j8, j9, f94Var.c());
        long unused = rn4Var.f14239a;
        this.f17385d.e(km4Var, new pm4(1, -1, null, 0, null, nz2.E(rn4Var.f14248j), nz2.E(this.f17405x)));
        this.I = true;
        qm4 qm4Var = this.f17396o;
        qm4Var.getClass();
        qm4Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long k() {
        long jF;
        H();
        if (this.I || this.C == 0) {
            return Long.MIN_VALUE;
        }
        if (N()) {
            return this.F;
        }
        if (this.f17402u) {
            int length = this.f17398q.length;
            jF = Long.MAX_VALUE;
            for (int i8 = 0; i8 < length; i8++) {
                vn4 vn4Var = this.f17403v;
                if (vn4Var.f16385b[i8] && vn4Var.f16386c[i8] && !this.f17398q[i8].L()) {
                    jF = Math.min(jF, this.f17398q[i8].z());
                }
            }
        } else {
            jF = Long.MAX_VALUE;
        }
        if (jF == Long.MAX_VALUE) {
            jF = F(false);
        }
        return jF == Long.MIN_VALUE ? this.E : jF;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long l() {
        return k();
    }

    @Override // com.google.android.gms.internal.ads.dr4
    public final /* bridge */ /* synthetic */ fr4 m(hr4 hr4Var, long j8, long j9, IOException iOException, int i8) {
        long jMin;
        fr4 fr4VarB;
        q1 q1Var;
        rn4 rn4Var = (rn4) hr4Var;
        f94 f94Var = rn4Var.f14241c;
        km4 km4Var = new km4(rn4Var.f14239a, rn4Var.f14249k, f94Var.d(), f94Var.e(), j8, j9, f94Var.c());
        long unused = rn4Var.f14248j;
        int i9 = nz2.f12300a;
        if ((iOException instanceof yh0) || (iOException instanceof FileNotFoundException) || (iOException instanceof f74) || (iOException instanceof kr4)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof qp3) && ((qp3) cause).f13586a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i8 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            fr4VarB = lr4.f11023g;
        } else {
            int iE = E();
            boolean z7 = iE > this.H;
            if (this.D || !((q1Var = this.f17404w) == null || q1Var.j() == -9223372036854775807L)) {
                this.H = iE;
            } else {
                boolean z8 = this.f17401t;
                if (!z8 || O()) {
                    this.B = z8;
                    this.E = 0L;
                    this.H = 0;
                    for (ko4 ko4Var : this.f17398q) {
                        ko4Var.H(false);
                    }
                    rn4.f(rn4Var, 0L, 0L);
                } else {
                    this.G = true;
                    fr4VarB = lr4.f11022f;
                }
            }
            fr4VarB = lr4.b(z7, jMin);
        }
        boolean zC = true ^ fr4VarB.c();
        this.f17385d.f(km4Var, new pm4(1, -1, null, 0, null, nz2.E(rn4Var.f14248j), nz2.E(this.f17405x)), iOException, zC);
        if (zC) {
            long unused2 = rn4Var.f14239a;
        }
        return fr4VarB;
    }

    @Override // com.google.android.gms.internal.ads.jo4
    public final void n(nb nbVar) {
        this.f17394m.post(this.f17392k);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final to4 o() {
        H();
        return this.f17403v.f16384a;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long p() {
        if (!this.B) {
            return -9223372036854775807L;
        }
        if (!this.I && E() <= this.H) {
            return -9223372036854775807L;
        }
        this.B = false;
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long q(long j8, wd4 wd4Var) {
        H();
        if (!this.f17404w.o()) {
            return 0L;
        }
        o1 o1VarP = this.f17404w.p(j8);
        r1 r1Var = o1VarP.f12324a;
        r1 r1Var2 = o1VarP.f12325b;
        long j9 = wd4Var.f16700a;
        if (j9 == 0) {
            if (wd4Var.f16701b == 0) {
                return j8;
            }
            j9 = 0;
        }
        long j10 = r1Var.f13856a;
        int i8 = nz2.f12300a;
        long j11 = j8 - j9;
        long j12 = wd4Var.f16701b;
        long j13 = j8 + j12;
        long j14 = j8 ^ j13;
        long j15 = j12 ^ j13;
        if (((j8 ^ j9) & (j8 ^ j11)) < 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((j14 & j15) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z7 = j11 <= j10 && j10 <= j13;
        long j16 = r1Var2.f13856a;
        boolean z8 = j11 <= j16 && j16 <= j13;
        if (z7 && z8) {
            if (Math.abs(j10 - j8) > Math.abs(j16 - j8)) {
                return j16;
            }
        } else if (!z7) {
            return z8 ? j16 : j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void r(final q1 q1Var) {
        this.f17394m.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pn4
            @Override // java.lang.Runnable
            public final void run() {
                this.f12953a.z(q1Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void s() throws IOException {
        A();
        if (this.I && !this.f17401t) {
            throw yh0.a("Loading finished before preparation is complete.", null);
        }
    }

    final /* synthetic */ void w() {
        if (this.W) {
            return;
        }
        qm4 qm4Var = this.f17396o;
        qm4Var.getClass();
        qm4Var.e(this);
    }

    final /* synthetic */ void x() {
        this.D = true;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean y() {
        return this.f17389h.l() && this.f17391j.d();
    }

    final /* synthetic */ void z(q1 q1Var) {
        this.f17404w = this.f17397p == null ? q1Var : new p1(-9223372036854775807L, 0L);
        if (q1Var.j() == -9223372036854775807L && this.f17405x != -9223372036854775807L) {
            this.f17404w = new qn4(this, this.f17404w);
        }
        this.f17405x = this.f17404w.j();
        boolean z7 = false;
        if (!this.D && q1Var.j() == -9223372036854775807L) {
            z7 = true;
        }
        this.f17406y = z7;
        this.f17407z = true == z7 ? 7 : 1;
        this.f17387f.a(this.f17405x, q1Var.o(), this.f17406y);
        if (this.f17401t) {
            return;
        }
        I();
    }
}
