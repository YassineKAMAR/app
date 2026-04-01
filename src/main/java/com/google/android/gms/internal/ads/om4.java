package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class om4 extends vo4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r01 f12556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final py0 f12557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private mm4 f12558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private lm4 f12559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12562s;

    public om4(vm4 vm4Var, boolean z7) {
        boolean z8;
        super(vm4Var);
        if (z7) {
            vm4Var.A();
            z8 = true;
        } else {
            z8 = false;
        }
        this.f12555l = z8;
        this.f12556m = new r01();
        this.f12557n = new py0();
        vm4Var.M();
        this.f12558o = mm4.q(vm4Var.o0());
    }

    private final Object w(Object obj) {
        return (this.f12558o.f11415h == null || !obj.equals(mm4.f11413i)) ? obj : this.f12558o.f11415h;
    }

    private final void x(long j8) {
        lm4 lm4Var = this.f12559p;
        int iA = this.f12558o.a(lm4Var.f10779a.f15161a);
        if (iA == -1) {
            return;
        }
        mm4 mm4Var = this.f12558o;
        py0 py0Var = this.f12557n;
        mm4Var.d(iA, py0Var, false);
        long j9 = py0Var.f13192d;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - 1);
        }
        lm4Var.n(j8);
    }

    @Override // com.google.android.gms.internal.ads.cm4, com.google.android.gms.internal.ads.vm4
    public final void W() {
    }

    @Override // com.google.android.gms.internal.ads.vo4, com.google.android.gms.internal.ads.vm4
    public final void Y(rm4 rm4Var) {
        ((lm4) rm4Var).r();
        if (rm4Var == this.f12559p) {
            this.f12559p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ul4, com.google.android.gms.internal.ads.vm4
    public final void d0(c50 c50Var) {
        this.f12558o = this.f12562s ? this.f12558o.p(new ro4(this.f12558o.f8831f, c50Var)) : mm4.q(c50Var);
        this.f16393k.d0(c50Var);
    }

    @Override // com.google.android.gms.internal.ads.cm4, com.google.android.gms.internal.ads.ul4
    public final void k() {
        this.f12561r = false;
        this.f12560q = false;
        super.k();
    }

    @Override // com.google.android.gms.internal.ads.vo4
    protected final tm4 r(tm4 tm4Var) {
        Object obj = this.f12558o.f11415h;
        Object obj2 = tm4Var.f15161a;
        if (obj != null && this.f12558o.f11415h.equals(obj2)) {
            obj2 = mm4.f11413i;
        }
        return tm4Var.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.vo4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void s(com.google.android.gms.internal.ads.s11 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f12561r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.mm4 r0 = r14.f12558o
            com.google.android.gms.internal.ads.mm4 r15 = r0.p(r15)
            r14.f12558o = r15
            com.google.android.gms.internal.ads.lm4 r15 = r14.f12559p
            if (r15 == 0) goto L9b
            long r2 = r15.f()
            r14.x(r2)
            goto L9b
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.f12562s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.mm4 r0 = r14.f12558o
            com.google.android.gms.internal.ads.mm4 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.r01.f13823p
            java.lang.Object r2 = com.google.android.gms.internal.ads.mm4.f11413i
            com.google.android.gms.internal.ads.mm4 r15 = com.google.android.gms.internal.ads.mm4.r(r15, r0, r2)
        L33:
            r14.f12558o = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.r01 r0 = r14.f12556m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.google.android.gms.internal.ads.r01 r0 = r14.f12556m
            java.lang.Object r0 = r0.f13834a
            com.google.android.gms.internal.ads.lm4 r5 = r14.f12559p
            if (r5 == 0) goto L62
            long r6 = r5.j()
            com.google.android.gms.internal.ads.mm4 r8 = r14.f12558o
            com.google.android.gms.internal.ads.py0 r9 = r14.f12557n
            com.google.android.gms.internal.ads.tm4 r5 = r5.f10779a
            java.lang.Object r5 = r5.f15161a
            r8.n(r5, r9)
            com.google.android.gms.internal.ads.mm4 r5 = r14.f12558o
            com.google.android.gms.internal.ads.r01 r8 = r14.f12556m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.r01 r9 = r14.f12556m
            com.google.android.gms.internal.ads.py0 r10 = r14.f12557n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.f12562s
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.mm4 r0 = r14.f12558o
            com.google.android.gms.internal.ads.mm4 r15 = r0.p(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.mm4 r15 = com.google.android.gms.internal.ads.mm4.r(r15, r0, r3)
        L86:
            r14.f12558o = r15
            com.google.android.gms.internal.ads.lm4 r15 = r14.f12559p
            if (r15 == 0) goto L9b
            r14.x(r4)
            com.google.android.gms.internal.ads.tm4 r15 = r15.f10779a
            java.lang.Object r0 = r15.f15161a
            java.lang.Object r0 = r14.w(r0)
            com.google.android.gms.internal.ads.tm4 r1 = r15.a(r0)
        L9b:
            r15 = 1
            r14.f12562s = r15
            r14.f12561r = r15
            com.google.android.gms.internal.ads.mm4 r15 = r14.f12558o
            r14.j(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.lm4 r15 = r14.f12559p
            r15.getClass()
            r15.m(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.om4.s(com.google.android.gms.internal.ads.s11):void");
    }

    @Override // com.google.android.gms.internal.ads.vo4
    public final void t() {
        if (this.f12555l) {
            return;
        }
        this.f12560q = true;
        n(null, this.f16393k);
    }

    public final s11 u() {
        return this.f12558o;
    }

    @Override // com.google.android.gms.internal.ads.vm4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final lm4 Z(tm4 tm4Var, xq4 xq4Var, long j8) {
        lm4 lm4Var = new lm4(tm4Var, xq4Var, j8);
        lm4Var.t(this.f16393k);
        if (this.f12561r) {
            lm4Var.m(tm4Var.a(w(tm4Var.f15161a)));
        } else {
            this.f12559p = lm4Var;
            if (!this.f12560q) {
                this.f12560q = true;
                n(null, this.f16393k);
            }
        }
        return lm4Var;
    }
}
