package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class xl4 implements lo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo4 f17363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yl4 f17365c;

    public xl4(yl4 yl4Var, lo4 lo4Var) {
        this.f17365c = yl4Var;
        this.f17363a = lo4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.lo4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.android.gms.internal.ads.nc4 r13, com.google.android.gms.internal.ads.q94 r14, int r15) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.yl4 r0 = r12.f17365c
            boolean r1 = r0.j()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.f17364b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.c(r3)
            return r4
        L14:
            long r0 = r0.k()
            com.google.android.gms.internal.ads.lo4 r5 = r12.f17363a
            int r15 = r5.a(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.google.android.gms.internal.ads.nb r14 = r13.f11825a
            r14.getClass()
            int r15 = r14.B
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.C
            if (r15 == 0) goto L4d
            r15 = 0
        L32:
            com.google.android.gms.internal.ads.yl4 r1 = r12.f17365c
            long r1 = r1.f17814e
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.C
        L3d:
            com.google.android.gms.internal.ads.l9 r14 = r14.b()
            r14.e(r15)
            r14.f(r0)
            com.google.android.gms.internal.ads.nb r14 = r14.D()
            r13.f11825a = r14
        L4d:
            return r5
        L4e:
            com.google.android.gms.internal.ads.yl4 r13 = r12.f17365c
            long r8 = r13.f17814e
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.f13364f
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.f13363e
            if (r13 != 0) goto L72
        L68:
            r14.b()
            r14.c(r3)
            r13 = 1
            r12.f17364b = r13
            return r4
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl4.a(com.google.android.gms.internal.ads.nc4, com.google.android.gms.internal.ads.q94, int):int");
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final int b(long j8) {
        if (this.f17365c.j()) {
            return -3;
        }
        return this.f17363a.b(j8);
    }

    public final void c() {
        this.f17364b = false;
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final boolean m() {
        return !this.f17365c.j() && this.f17363a.m();
    }

    @Override // com.google.android.gms.internal.ads.lo4
    public final void p() {
        this.f17363a.p();
    }
}
