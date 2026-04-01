package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ha4 implements tc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd4 f8703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ga4 f8704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sd4 f8705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tc4 f8706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8707e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8708f;

    public ha4(ga4 ga4Var, vv1 vv1Var) {
        this.f8704b = ga4Var;
        this.f8703a = new zd4(vv1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.sd4 r0 = r5.f8705c
            if (r0 == 0) goto L66
            boolean r0 = r0.i()
            if (r0 != 0) goto L66
            com.google.android.gms.internal.ads.sd4 r0 = r5.f8705c
            boolean r0 = r0.n0()
            if (r0 != 0) goto L1d
            if (r6 != 0) goto L66
            com.google.android.gms.internal.ads.sd4 r6 = r5.f8705c
            boolean r6 = r6.H()
            if (r6 == 0) goto L1d
            goto L66
        L1d:
            com.google.android.gms.internal.ads.tc4 r6 = r5.f8706d
            r6.getClass()
            long r0 = r6.j()
            boolean r2 = r5.f8707e
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.zd4 r2 = r5.f8703a
            long r2 = r2.j()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            com.google.android.gms.internal.ads.zd4 r6 = r5.f8703a
            r6.c()
            goto L72
        L3a:
            r2 = 0
            r5.f8707e = r2
            boolean r2 = r5.f8708f
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.zd4 r2 = r5.f8703a
            r2.b()
        L46:
            com.google.android.gms.internal.ads.zd4 r2 = r5.f8703a
            r2.a(r0)
            com.google.android.gms.internal.ads.dm0 r6 = r6.l()
            com.google.android.gms.internal.ads.zd4 r0 = r5.f8703a
            com.google.android.gms.internal.ads.dm0 r0 = r0.l()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L72
            com.google.android.gms.internal.ads.zd4 r0 = r5.f8703a
            r0.d(r6)
            com.google.android.gms.internal.ads.ga4 r0 = r5.f8704b
            r0.b(r6)
            goto L72
        L66:
            r6 = 1
            r5.f8707e = r6
            boolean r6 = r5.f8708f
            if (r6 == 0) goto L72
            com.google.android.gms.internal.ads.zd4 r6 = r5.f8703a
            r6.b()
        L72:
            boolean r6 = r5.f8707e
            if (r6 == 0) goto L7d
            com.google.android.gms.internal.ads.zd4 r6 = r5.f8703a
            long r0 = r6.j()
            goto L86
        L7d:
            com.google.android.gms.internal.ads.tc4 r6 = r5.f8706d
            r6.getClass()
            long r0 = r6.j()
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha4.a(boolean):long");
    }

    public final void b(sd4 sd4Var) {
        if (sd4Var == this.f8705c) {
            this.f8706d = null;
            this.f8705c = null;
            this.f8707e = true;
        }
    }

    public final void c(sd4 sd4Var) throws ja4 {
        tc4 tc4Var;
        tc4 tc4VarS = sd4Var.s();
        if (tc4VarS == null || tc4VarS == (tc4Var = this.f8706d)) {
            return;
        }
        if (tc4Var != null) {
            throw ja4.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f8706d = tc4VarS;
        this.f8705c = sd4Var;
        tc4VarS.d(this.f8703a.l());
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final void d(dm0 dm0Var) {
        tc4 tc4Var = this.f8706d;
        if (tc4Var != null) {
            tc4Var.d(dm0Var);
            dm0Var = this.f8706d.l();
        }
        this.f8703a.d(dm0Var);
    }

    public final void e(long j8) {
        this.f8703a.a(j8);
    }

    public final void f() {
        this.f8708f = true;
        this.f8703a.b();
    }

    public final void g() {
        this.f8708f = false;
        this.f8703a.c();
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final long j() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final dm0 l() {
        tc4 tc4Var = this.f8706d;
        return tc4Var != null ? tc4Var.l() : this.f8703a.l();
    }
}
