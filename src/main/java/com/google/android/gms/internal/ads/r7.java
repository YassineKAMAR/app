package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f13961f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dq2 f13962g = new dq2(255);

    r7() {
    }

    public final void a() {
        this.f13956a = 0;
        this.f13957b = 0L;
        this.f13958c = 0;
        this.f13959d = 0;
        this.f13960e = 0;
    }

    public final boolean b(q0 q0Var, boolean z7) throws yh0 {
        a();
        this.f13962g.d(27);
        if (t0.c(q0Var, this.f13962g.i(), 0, 27, z7) && this.f13962g.C() == 1332176723) {
            if (this.f13962g.u() != 0) {
                if (z7) {
                    return false;
                }
                throw yh0.c("unsupported bit stream revision");
            }
            this.f13956a = this.f13962g.u();
            this.f13957b = this.f13962g.z();
            this.f13962g.A();
            this.f13962g.A();
            this.f13962g.A();
            int iU = this.f13962g.u();
            this.f13958c = iU;
            this.f13959d = iU + 27;
            this.f13962g.d(iU);
            if (t0.c(q0Var, this.f13962g.i(), 0, this.f13958c, z7)) {
                for (int i8 = 0; i8 < this.f13958c; i8++) {
                    this.f13961f[i8] = this.f13962g.u();
                    this.f13960e += this.f13961f[i8];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.n() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9.G(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.q0 r9, long r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            long r0 = r9.n()
            long r2 = r9.m()
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.internal.ads.uu1.d(r0)
            com.google.android.gms.internal.ads.dq2 r0 = r8.f13962g
            r1 = 4
            r0.d(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r2 = r9.n()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L2c
            goto L55
        L2c:
            com.google.android.gms.internal.ads.dq2 r2 = r8.f13962g
            byte[] r2 = r2.i()
            boolean r2 = com.google.android.gms.internal.ads.t0.c(r9, r2, r5, r1, r4)
            if (r2 == 0) goto L55
            com.google.android.gms.internal.ads.dq2 r0 = r8.f13962g
            r0.g(r5)
            com.google.android.gms.internal.ads.dq2 r0 = r8.f13962g
            long r2 = r0.C()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r0 = r9
            com.google.android.gms.internal.ads.f0 r0 = (com.google.android.gms.internal.ads.f0) r0
            r0.d(r4, r5)
            goto L1a
        L51:
            r9.t()
            return r4
        L55:
            if (r0 == 0) goto L5f
            long r1 = r9.n()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L66
        L5f:
            int r1 = r9.G(r4)
            r2 = -1
            if (r1 != r2) goto L55
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r7.c(com.google.android.gms.internal.ads.q0, long):boolean");
    }
}
