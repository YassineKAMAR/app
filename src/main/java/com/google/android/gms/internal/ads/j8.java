package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j8 implements p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w0 f9514j = new w0() { // from class: com.google.android.gms.internal.ads.i8
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new j8(0)};
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f9517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cp2 f9518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s0 f9519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9520f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9523i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8 f9515a = new l8(true, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f9516b = new dq2(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9521g = -1;

    public j8(int i8) {
        dq2 dq2Var = new dq2(10);
        this.f9517c = dq2Var;
        byte[] bArrI = dq2Var.i();
        this.f9518d = new cp2(bArrI, bArrI.length);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f9522h = false;
        this.f9515a.m();
        this.f9520f = j9;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) {
        uu1.b(this.f9519e);
        int iH = q0Var.H(this.f9516b.i(), 0, 2048);
        if (!this.f9523i) {
            this.f9519e.r(new p1(-9223372036854775807L, 0L));
            this.f9523i = true;
        }
        if (iH == -1) {
            return -1;
        }
        this.f9516b.g(0);
        this.f9516b.f(iH);
        if (!this.f9522h) {
            this.f9515a.d(this.f9520f, 4);
            this.f9522h = true;
        }
        this.f9515a.a(this.f9516b);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.ads.q0 r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.dq2 r2 = r9.f9517c
            byte[] r2 = r2.i()
            r3 = r10
            com.google.android.gms.internal.ads.f0 r3 = (com.google.android.gms.internal.ads.f0) r3
            r4 = 10
            r3.L(r2, r0, r4, r0)
            com.google.android.gms.internal.ads.dq2 r2 = r9.f9517c
            r2.g(r0)
            com.google.android.gms.internal.ads.dq2 r2 = r9.f9517c
            int r2 = r2.w()
            r4 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r4) goto L91
            r10.t()
            r2 = r10
            com.google.android.gms.internal.ads.f0 r2 = (com.google.android.gms.internal.ads.f0) r2
            r2.c(r1, r0)
            long r3 = r9.f9521g
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            long r3 = (long) r1
            r9.f9521g = r3
        L34:
            r4 = r1
            r3 = 0
            r5 = 0
        L37:
            com.google.android.gms.internal.ads.dq2 r6 = r9.f9517c
            byte[] r6 = r6.i()
            r7 = 2
            r2.L(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.dq2 r6 = r9.f9517c
            r6.g(r0)
            com.google.android.gms.internal.ads.dq2 r6 = r9.f9517c
            int r6 = r6.y()
            boolean r6 = com.google.android.gms.internal.ads.l8.e(r6)
            if (r6 != 0) goto L5d
        L52:
            int r4 = r4 + 1
            r10.t()
            r2.c(r4, r0)
            r3 = 0
            r5 = 0
            goto L8a
        L5d:
            r6 = 1
            int r3 = r3 + r6
            r7 = 4
            if (r3 < r7) goto L68
            r8 = 188(0xbc, float:2.63E-43)
            if (r5 > r8) goto L67
            goto L68
        L67:
            return r6
        L68:
            com.google.android.gms.internal.ads.dq2 r6 = r9.f9517c
            byte[] r6 = r6.i()
            r2.L(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.cp2 r6 = r9.f9518d
            r7 = 14
            r6.j(r7)
            com.google.android.gms.internal.ads.cp2 r6 = r9.f9518d
            r7 = 13
            int r6 = r6.d(r7)
            r7 = 6
            if (r6 > r7) goto L84
            goto L52
        L84:
            int r7 = r6 + (-6)
            r2.c(r7, r0)
            int r5 = r5 + r6
        L8a:
            int r6 = r4 - r1
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r6 < r7) goto L37
            return r0
        L91:
            com.google.android.gms.internal.ads.dq2 r2 = r9.f9517c
            r4 = 3
            r2.h(r4)
            com.google.android.gms.internal.ads.dq2 r2 = r9.f9517c
            int r2 = r2.t()
            int r4 = r2 + 10
            int r1 = r1 + r4
            r3.c(r2, r0)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.g(com.google.android.gms.internal.ads.q0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f9519e = s0Var;
        this.f9515a.c(s0Var, new ca(Integer.MIN_VALUE, 0, 1));
        s0Var.d();
    }
}
