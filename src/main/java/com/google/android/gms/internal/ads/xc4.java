package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
final class xc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final py0 f17172a = new py0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r01 f17173b = new r01();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de4 f17174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g62 f17175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private uc4 f17179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private uc4 f17180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private uc4 f17181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f17183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17184m;

    public xc4(de4 de4Var, g62 g62Var) {
        this.f17174c = de4Var;
        this.f17175d = g62Var;
    }

    private static tm4 A(s11 s11Var, Object obj, long j8, long j9, r01 r01Var, py0 py0Var) {
        s11Var.n(obj, py0Var);
        s11Var.e(py0Var.f13191c, r01Var, 0L);
        s11Var.a(obj);
        py0Var.b();
        s11Var.n(obj, py0Var);
        int iD = py0Var.d(j8);
        return iD == -1 ? new tm4(obj, j9, py0Var.c(j8)) : new tm4(obj, iD, py0Var.e(iD), j9);
    }

    private final void B() {
        final gb3 gb3Var = new gb3();
        for (uc4 uc4VarG = this.f17179h; uc4VarG != null; uc4VarG = uc4VarG.g()) {
            gb3Var.g(uc4VarG.f15614f.f16104a);
        }
        uc4 uc4Var = this.f17180i;
        final tm4 tm4Var = uc4Var == null ? null : uc4Var.f15614f.f16104a;
        this.f17175d.h(new Runnable() { // from class: com.google.android.gms.internal.ads.wc4
            @Override // java.lang.Runnable
            public final void run() {
                this.f16690a.m(gb3Var, tm4Var);
            }
        });
    }

    private final boolean C(s11 s11Var, tm4 tm4Var, boolean z7) {
        int iA = s11Var.a(tm4Var.f15161a);
        return !s11Var.e(s11Var.d(iA, this.f17172a, false).f13191c, this.f17173b, 0L).f13841h && s11Var.i(iA, this.f17172a, this.f17173b, this.f17177f, this.f17178g) == -1 && z7;
    }

    private final boolean a(s11 s11Var, tm4 tm4Var) {
        if (c(tm4Var)) {
            return s11Var.e(s11Var.n(tm4Var.f15161a, this.f17172a).f13191c, this.f17173b, 0L).f13848o == s11Var.a(tm4Var.f15161a);
        }
        return false;
    }

    private final boolean b(s11 s11Var) {
        uc4 uc4VarG = this.f17179h;
        if (uc4VarG == null) {
            return true;
        }
        int iA = s11Var.a(uc4VarG.f15610b);
        while (true) {
            iA = s11Var.i(iA, this.f17172a, this.f17173b, this.f17177f, this.f17178g);
            while (true) {
                uc4VarG.getClass();
                if (uc4VarG.g() == null || uc4VarG.f15614f.f16110g) {
                    break;
                }
                uc4VarG = uc4VarG.g();
            }
            uc4 uc4VarG2 = uc4VarG.g();
            if (iA == -1 || uc4VarG2 == null || s11Var.a(uc4VarG2.f15610b) != iA) {
                break;
            }
            uc4VarG = uc4VarG2;
        }
        boolean zP = p(uc4VarG);
        uc4VarG.f15614f = j(s11Var, uc4VarG.f15614f);
        return !zP;
    }

    private static final boolean c(tm4 tm4Var) {
        return !tm4Var.b() && tm4Var.f15165e == -1;
    }

    private final long v(s11 s11Var, Object obj, int i8) {
        s11Var.n(obj, this.f17172a);
        this.f17172a.i(i8);
        this.f17172a.k(i8);
        return 0L;
    }

    private final vc4 w(s11 s11Var, uc4 uc4Var, long j8) {
        int iE;
        Object obj;
        long jMax;
        long j9;
        Object obj2;
        int i8;
        long j10;
        long j11;
        vc4 vc4Var = uc4Var.f15614f;
        long jE = (uc4Var.e() + vc4Var.f16108e) - j8;
        if (vc4Var.f16110g) {
            long j12 = 0;
            int i9 = s11Var.i(s11Var.a(vc4Var.f16104a.f15161a), this.f17172a, this.f17173b, this.f17177f, this.f17178g);
            if (i9 != -1) {
                int i10 = s11Var.d(i9, this.f17172a, true).f13191c;
                Object obj3 = this.f17172a.f13190b;
                obj3.getClass();
                long j13 = vc4Var.f16104a.f15164d;
                if (s11Var.e(i10, this.f17173b, 0L).f13847n == i9) {
                    Pair pairM = s11Var.m(this.f17173b, this.f17172a, i10, -9223372036854775807L, Math.max(0L, jE));
                    if (pairM != null) {
                        obj3 = pairM.first;
                        long jLongValue = ((Long) pairM.second).longValue();
                        uc4 uc4VarG = uc4Var.g();
                        if (uc4VarG == null || !uc4VarG.f15610b.equals(obj3)) {
                            j13 = this.f17176e;
                            this.f17176e = 1 + j13;
                        } else {
                            j13 = uc4VarG.f15614f.f16104a.f15164d;
                        }
                        j11 = jLongValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                tm4 tm4VarA = A(s11Var, obj3, j11, j13, this.f17173b, this.f17172a);
                if (j12 != -9223372036854775807L && vc4Var.f16106c != -9223372036854775807L) {
                    s11Var.n(vc4Var.f16104a.f15161a, this.f17172a).b();
                    this.f17172a.g();
                }
                return x(s11Var, tm4VarA, j12, j11);
            }
        } else {
            tm4 tm4Var = vc4Var.f16104a;
            s11Var.n(tm4Var.f15161a, this.f17172a);
            if (!tm4Var.b()) {
                int i11 = tm4Var.f15165e;
                if (i11 != -1) {
                    this.f17172a.m(i11);
                }
                py0 py0Var = this.f17172a;
                int i12 = tm4Var.f15165e;
                iE = py0Var.e(i12);
                py0Var.n(i12);
                if (iE != this.f17172a.a(tm4Var.f15165e)) {
                    obj2 = tm4Var.f15161a;
                    i8 = tm4Var.f15165e;
                    j10 = vc4Var.f16108e;
                    return y(s11Var, obj2, i8, iE, j10, tm4Var.f15164d);
                }
                v(s11Var, tm4Var.f15161a, tm4Var.f15165e);
                obj = tm4Var.f15161a;
                jMax = 0;
                j9 = vc4Var.f16108e;
                return z(s11Var, obj, jMax, j9, tm4Var.f15164d);
            }
            i8 = tm4Var.f15162b;
            if (this.f17172a.a(i8) != -1) {
                iE = this.f17172a.f(i8, tm4Var.f15163c);
                if (iE < 0) {
                    obj2 = tm4Var.f15161a;
                    j10 = vc4Var.f16106c;
                    return y(s11Var, obj2, i8, iE, j10, tm4Var.f15164d);
                }
                long jLongValue2 = vc4Var.f16106c;
                if (jLongValue2 == -9223372036854775807L) {
                    r01 r01Var = this.f17173b;
                    py0 py0Var2 = this.f17172a;
                    Pair pairM2 = s11Var.m(r01Var, py0Var2, py0Var2.f13191c, -9223372036854775807L, Math.max(0L, jE));
                    if (pairM2 != null) {
                        jLongValue2 = ((Long) pairM2.second).longValue();
                    }
                }
                v(s11Var, tm4Var.f15161a, tm4Var.f15162b);
                obj = tm4Var.f15161a;
                jMax = Math.max(0L, jLongValue2);
                j9 = vc4Var.f16106c;
                return z(s11Var, obj, jMax, j9, tm4Var.f15164d);
            }
        }
        return null;
    }

    private final vc4 x(s11 s11Var, tm4 tm4Var, long j8, long j9) {
        s11Var.n(tm4Var.f15161a, this.f17172a);
        boolean zB = tm4Var.b();
        Object obj = tm4Var.f15161a;
        return zB ? y(s11Var, obj, tm4Var.f15162b, tm4Var.f15163c, j8, tm4Var.f15164d) : z(s11Var, obj, j9, j8, tm4Var.f15164d);
    }

    private final vc4 y(s11 s11Var, Object obj, int i8, int i9, long j8, long j9) {
        tm4 tm4Var = new tm4(obj, i8, i9, j9);
        Object obj2 = tm4Var.f15161a;
        long jH = s11Var.n(obj2, this.f17172a).h(tm4Var.f15162b, tm4Var.f15163c);
        if (i9 == this.f17172a.e(i8)) {
            this.f17172a.j();
        }
        this.f17172a.n(tm4Var.f15162b);
        long jMax = 0;
        if (jH != -9223372036854775807L && jH <= 0) {
            jMax = Math.max(0L, (-1) + jH);
        }
        return new vc4(tm4Var, jMax, j8, -9223372036854775807L, jH, false, false, false, false);
    }

    private final vc4 z(s11 s11Var, Object obj, long j8, long j9, long j10) {
        long j11;
        long j12;
        long j13;
        long jMax = j8;
        s11Var.n(obj, this.f17172a);
        int iC = this.f17172a.c(jMax);
        if (iC != -1) {
            this.f17172a.m(iC);
        }
        py0 py0Var = this.f17172a;
        if (iC == -1) {
            py0Var.b();
        } else {
            py0Var.n(iC);
        }
        tm4 tm4Var = new tm4(obj, j10, iC);
        boolean zC = c(tm4Var);
        boolean zA = a(s11Var, tm4Var);
        boolean zC2 = C(s11Var, tm4Var, zC);
        if (iC != -1) {
            this.f17172a.n(iC);
        }
        if (iC != -1) {
            this.f17172a.i(iC);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L) {
            j12 = 0;
            j13 = 0;
        } else {
            j12 = j11;
            j13 = this.f17172a.f13192d;
        }
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new vc4(tm4Var, jMax, j9, j12, j13, false, zC, zA, zC2);
    }

    public final uc4 d() {
        uc4 uc4Var = this.f17179h;
        if (uc4Var == null) {
            return null;
        }
        if (uc4Var == this.f17180i) {
            this.f17180i = uc4Var.g();
        }
        uc4Var.n();
        int i8 = this.f17182k - 1;
        this.f17182k = i8;
        if (i8 == 0) {
            this.f17181j = null;
            uc4 uc4Var2 = this.f17179h;
            this.f17183l = uc4Var2.f15610b;
            this.f17184m = uc4Var2.f15614f.f16104a.f15164d;
        }
        this.f17179h = this.f17179h.g();
        B();
        return this.f17179h;
    }

    public final uc4 e() {
        uc4 uc4Var = this.f17180i;
        uu1.b(uc4Var);
        this.f17180i = uc4Var.g();
        B();
        uc4 uc4Var2 = this.f17180i;
        uu1.b(uc4Var2);
        return uc4Var2;
    }

    public final uc4 f() {
        return this.f17181j;
    }

    public final uc4 g() {
        return this.f17179h;
    }

    public final uc4 h() {
        return this.f17180i;
    }

    public final vc4 i(long j8, ld4 ld4Var) {
        uc4 uc4Var = this.f17181j;
        return uc4Var == null ? x(ld4Var.f10624a, ld4Var.f10625b, ld4Var.f10626c, ld4Var.f10641r) : w(ld4Var.f10624a, uc4Var, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.vc4 j(com.google.android.gms.internal.ads.s11 r19, com.google.android.gms.internal.ads.vc4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.tm4 r3 = r2.f16104a
            boolean r12 = c(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.C(r1, r3, r12)
            com.google.android.gms.internal.ads.tm4 r4 = r2.f16104a
            java.lang.Object r4 = r4.f15161a
            com.google.android.gms.internal.ads.py0 r5 = r0.f17172a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.f15165e
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.py0 r9 = r0.f17172a
            r9.i(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.py0 r1 = r0.f17172a
            int r5 = r3.f15162b
            int r6 = r3.f15163c
            long r5 = r1.h(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.py0 r1 = r0.f17172a
            long r5 = r1.f13192d
            goto L48
        L57:
            boolean r1 = r3.b()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.py0 r1 = r0.f17172a
            int r4 = r3.f15162b
            r1.n(r4)
            goto L6e
        L65:
            int r1 = r3.f15165e
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.py0 r4 = r0.f17172a
            r4.n(r1)
        L6e:
            com.google.android.gms.internal.ads.vc4 r15 = new com.google.android.gms.internal.ads.vc4
            long r4 = r2.f16105b
            long r1 = r2.f16106c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xc4.j(com.google.android.gms.internal.ads.s11, com.google.android.gms.internal.ads.vc4):com.google.android.gms.internal.ads.vc4");
    }

    public final tm4 k(s11 s11Var, Object obj, long j8) {
        long j9;
        int iA;
        int i8 = s11Var.n(obj, this.f17172a).f13191c;
        Object obj2 = this.f17183l;
        if (obj2 == null || (iA = s11Var.a(obj2)) == -1 || s11Var.d(iA, this.f17172a, false).f13191c != i8) {
            uc4 uc4VarG = this.f17179h;
            while (true) {
                if (uc4VarG == null) {
                    uc4VarG = this.f17179h;
                    while (uc4VarG != null) {
                        int iA2 = s11Var.a(uc4VarG.f15610b);
                        if (iA2 == -1 || s11Var.d(iA2, this.f17172a, false).f13191c != i8) {
                            uc4VarG = uc4VarG.g();
                        }
                    }
                    j9 = this.f17176e;
                    this.f17176e = 1 + j9;
                    if (this.f17179h == null) {
                        this.f17183l = obj;
                        this.f17184m = j9;
                    }
                } else {
                    if (uc4VarG.f15610b.equals(obj)) {
                        break;
                    }
                    uc4VarG = uc4VarG.g();
                }
            }
            j9 = uc4VarG.f15614f.f16104a.f15164d;
        } else {
            j9 = this.f17184m;
        }
        long j10 = j9;
        s11Var.n(obj, this.f17172a);
        s11Var.e(this.f17172a.f13191c, this.f17173b, 0L);
        int iA3 = s11Var.a(obj);
        Object obj3 = obj;
        while (true) {
            r01 r01Var = this.f17173b;
            if (iA3 < r01Var.f13847n) {
                return A(s11Var, obj3, j8, j10, r01Var, this.f17172a);
            }
            s11Var.d(iA3, this.f17172a, true);
            this.f17172a.b();
            py0 py0Var = this.f17172a;
            if (py0Var.d(py0Var.f13192d) != -1) {
                obj3 = this.f17172a.f13190b;
                obj3.getClass();
            }
            iA3--;
        }
    }

    public final void l() {
        if (this.f17182k == 0) {
            return;
        }
        uc4 uc4VarG = this.f17179h;
        uu1.b(uc4VarG);
        this.f17183l = uc4VarG.f15610b;
        this.f17184m = uc4VarG.f15614f.f16104a.f15164d;
        while (uc4VarG != null) {
            uc4VarG.n();
            uc4VarG = uc4VarG.g();
        }
        this.f17179h = null;
        this.f17181j = null;
        this.f17180i = null;
        this.f17182k = 0;
        B();
    }

    final /* synthetic */ void m(gb3 gb3Var, tm4 tm4Var) {
        this.f17174c.o(gb3Var.j(), tm4Var);
    }

    public final void n(long j8) {
        uc4 uc4Var = this.f17181j;
        if (uc4Var != null) {
            uc4Var.m(j8);
        }
    }

    public final boolean o(rm4 rm4Var) {
        uc4 uc4Var = this.f17181j;
        return uc4Var != null && uc4Var.f15609a == rm4Var;
    }

    public final boolean p(uc4 uc4Var) {
        uu1.b(uc4Var);
        boolean z7 = false;
        if (uc4Var.equals(this.f17181j)) {
            return false;
        }
        this.f17181j = uc4Var;
        while (uc4Var.g() != null) {
            uc4Var = uc4Var.g();
            uc4Var.getClass();
            if (uc4Var == this.f17180i) {
                this.f17180i = this.f17179h;
                z7 = true;
            }
            uc4Var.n();
            this.f17182k--;
        }
        uc4 uc4Var2 = this.f17181j;
        uc4Var2.getClass();
        uc4Var2.o(null);
        B();
        return z7;
    }

    public final boolean q() {
        uc4 uc4Var = this.f17181j;
        if (uc4Var != null) {
            return !uc4Var.f15614f.f16112i && uc4Var.r() && this.f17181j.f15614f.f16108e != -9223372036854775807L && this.f17182k < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(com.google.android.gms.internal.ads.s11 r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.uc4 r2 = r0.f17179h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.vc4 r5 = r2.f15614f
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.vc4 r3 = r0.j(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.vc4 r9 = r0.w(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.f16105b
            long r12 = r9.f16105b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8f
            com.google.android.gms.internal.ads.tm4 r10 = r5.f16104a
            com.google.android.gms.internal.ads.tm4 r11 = r9.f16104a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.f16106c
            com.google.android.gms.internal.ads.vc4 r9 = r3.a(r9)
            r2.f15614f = r9
            long r9 = r5.f16108e
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.f16108e
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.q()
            long r7 = r3.f16108e
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.e()
            long r7 = r7 + r9
        L67:
            com.google.android.gms.internal.ads.uc4 r1 = r0.f17180i
            if (r2 != r1) goto L7b
            com.google.android.gms.internal.ads.vc4 r1 = r2.f15614f
            boolean r1 = r1.f16109f
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r2 = r0.p(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.google.android.gms.internal.ads.uc4 r3 = r2.g()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xc4.r(com.google.android.gms.internal.ads.s11, long, long):boolean");
    }

    public final boolean s(s11 s11Var, int i8) {
        this.f17177f = i8;
        return b(s11Var);
    }

    public final boolean t(s11 s11Var, boolean z7) {
        this.f17178g = z7;
        return b(s11Var);
    }

    public final uc4 u(ud4[] ud4VarArr, oq4 oq4Var, xq4 xq4Var, kd4 kd4Var, vc4 vc4Var, pq4 pq4Var) {
        uc4 uc4Var = this.f17181j;
        uc4 uc4Var2 = new uc4(ud4VarArr, uc4Var == null ? 1000000000000L : (uc4Var.e() + uc4Var.f15614f.f16108e) - vc4Var.f16105b, oq4Var, xq4Var, kd4Var, vc4Var, pq4Var);
        uc4 uc4Var3 = this.f17181j;
        if (uc4Var3 != null) {
            uc4Var3.o(uc4Var2);
        } else {
            this.f17179h = uc4Var2;
            this.f17180i = uc4Var2;
        }
        this.f17183l = null;
        this.f17181j = uc4Var2;
        this.f17182k++;
        B();
        return uc4Var2;
    }
}
