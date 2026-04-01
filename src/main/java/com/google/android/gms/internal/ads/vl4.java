package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vl4 implements ln4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f16350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p0 f16351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q0 f16352c;

    public vl4(w0 w0Var) {
        this.f16350a = w0Var;
    }

    @Override // com.google.android.gms.internal.ads.ln4
    public final int a(n1 n1Var) {
        p0 p0Var = this.f16351b;
        p0Var.getClass();
        q0 q0Var = this.f16352c;
        q0Var.getClass();
        return p0Var.f(q0Var, n1Var);
    }

    @Override // com.google.android.gms.internal.ads.ln4
    public final void b(long j8, long j9) {
        p0 p0Var = this.f16351b;
        p0Var.getClass();
        p0Var.e(j8, j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.ln4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.wl4 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.s0 r15) throws com.google.android.gms.internal.ads.uo4 {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.f0 r6 = new com.google.android.gms.internal.ads.f0
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f16352c = r6
            com.google.android.gms.internal.ads.p0 r8 = r7.f16351b
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.w0 r8 = r7.f16350a
            com.google.android.gms.internal.ads.p0[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.f16351b = r8
            goto Lb6
        L21:
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.g(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f16351b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.gms.internal.ads.uu1.f(r14)
            r6.t()
            goto L71
        L35:
            com.google.android.gms.internal.ads.p0 r1 = r7.f16351b
            if (r1 != 0) goto L67
            long r1 = r6.n()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            com.google.android.gms.internal.ads.p0 r9 = r7.f16351b
            if (r9 != 0) goto L4f
            long r9 = r6.n()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            com.google.android.gms.internal.ads.uu1.f(r13)
            r6.t()
            throw r8
        L57:
            com.google.android.gms.internal.ads.p0 r1 = r7.f16351b
            if (r1 != 0) goto L67
            long r1 = r6.n()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            com.google.android.gms.internal.ads.uu1.f(r1)
            r6.t()
            int r0 = r0 + 1
            goto L22
        L71:
            com.google.android.gms.internal.ads.p0 r10 = r7.f16351b
            if (r10 != 0) goto Lb6
            com.google.android.gms.internal.ads.uo4 r10 = new com.google.android.gms.internal.ads.uo4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L7c:
            int r12 = r8.length
            if (r13 >= r12) goto L98
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r11.append(r14)
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L95
            java.lang.String r12 = ", "
            r11.append(r12)
        L95:
            int r13 = r13 + 1
            goto L7c
        L98:
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        Lb6:
            com.google.android.gms.internal.ads.p0 r8 = r7.f16351b
            r8.h(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vl4.c(com.google.android.gms.internal.ads.wl4, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.s0):void");
    }

    @Override // com.google.android.gms.internal.ads.ln4
    public final long k() {
        q0 q0Var = this.f16352c;
        if (q0Var != null) {
            return q0Var.n();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ln4
    public final void l() {
        p0 p0Var = this.f16351b;
        if (p0Var != null && (p0Var instanceof z5)) {
            ((z5) p0Var).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ln4
    public final void m() {
        if (this.f16351b != null) {
            this.f16351b = null;
        }
        this.f16352c = null;
    }
}
