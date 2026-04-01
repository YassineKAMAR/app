package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yl4 implements rm4, qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm4 f17810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qm4 f17811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xl4[] f17812c = new xl4[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17813d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f17814e;

    public yl4(rm4 rm4Var, boolean z7, long j8, long j9) {
        this.f17810a = rm4Var;
        this.f17814e = j9;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
        this.f17810a.a(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.rm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f17813d = r0
            com.google.android.gms.internal.ads.xl4[] r0 = r7.f17812c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.rm4 r0 = r7.f17810a
            long r0 = r0.b(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.f17814e
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.android.gms.internal.ads.uu1.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yl4.b(long):long");
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        return this.f17810a.c(sc4Var);
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final void d(rm4 rm4Var) {
        qm4 qm4Var = this.f17811b;
        qm4Var.getClass();
        qm4Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.mo4
    public final /* bridge */ /* synthetic */ void e(no4 no4Var) {
        qm4 qm4Var = this.f17811b;
        qm4Var.getClass();
        qm4Var.e(this);
    }

    public final void f(long j8, long j9) {
        this.f17814e = j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.rm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(com.google.android.gms.internal.ads.iq4[] r15, boolean[] r16, com.google.android.gms.internal.ads.lo4[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.xl4[] r3 = new com.google.android.gms.internal.ads.xl4[r2]
            r0.f17812c = r3
            com.google.android.gms.internal.ads.lo4[] r2 = new com.google.android.gms.internal.ads.lo4[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.xl4[] r5 = r0.f17812c
            r6 = r1[r4]
            com.google.android.gms.internal.ads.xl4 r6 = (com.google.android.gms.internal.ads.xl4) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.lo4 r11 = r6.f17363a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.rm4 r4 = r0.f17810a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.g(r5, r6, r7, r8, r9)
            boolean r6 = r14.j()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f17813d = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.f17814e
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.android.gms.internal.ads.uu1.f(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.xl4[] r6 = r0.f17812c
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.xl4[] r7 = r0.f17812c
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.lo4 r8 = r8.f17363a
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.xl4 r8 = new com.google.android.gms.internal.ads.xl4
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.xl4[] r6 = r0.f17812c
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yl4.g(com.google.android.gms.internal.ads.iq4[], boolean[], com.google.android.gms.internal.ads.lo4[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void h(long j8, boolean z7) {
        this.f17810a.h(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void i(qm4 qm4Var, long j8) {
        this.f17811b = qm4Var;
        this.f17810a.i(this, j8);
    }

    final boolean j() {
        return this.f17813d != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long k() {
        long jK = this.f17810a.k();
        if (jK != Long.MIN_VALUE) {
            long j8 = this.f17814e;
            if (j8 == Long.MIN_VALUE || jK < j8) {
                return jK;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long l() {
        long jL = this.f17810a.l();
        if (jL != Long.MIN_VALUE) {
            long j8 = this.f17814e;
            if (j8 == Long.MIN_VALUE || jL < j8) {
                return jL;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final to4 o() {
        return this.f17810a.o();
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long p() {
        if (j()) {
            long j8 = this.f17813d;
            this.f17813d = -9223372036854775807L;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j8;
        }
        long jP2 = this.f17810a.p();
        if (jP2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        uu1.f(jP2 >= 0);
        long j9 = this.f17814e;
        uu1.f(j9 == Long.MIN_VALUE || jP2 <= j9);
        return jP2;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long q(long j8, wd4 wd4Var) {
        if (j8 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(wd4Var.f16700a, j8));
        long j9 = wd4Var.f16701b;
        long j10 = this.f17814e;
        long jMax2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j8));
        if (jMax != wd4Var.f16700a || jMax2 != wd4Var.f16701b) {
            wd4Var = new wd4(jMax, jMax2);
        }
        return this.f17810a.q(j8, wd4Var);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void s() {
        this.f17810a.s();
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean y() {
        return this.f17810a.y();
    }
}
