package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d8 implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f6606d = new w0() { // from class: com.google.android.gms.internal.ads.c8
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new d8()};
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e8 f6607a = new e8(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f6608b = new dq2(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6609c;

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f6609c = false;
        this.f6607a.m();
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) {
        int iH = q0Var.H(this.f6608b.i(), 0, 2786);
        if (iH == -1) {
            return -1;
        }
        this.f6608b.g(0);
        this.f6608b.f(iH);
        if (!this.f6609c) {
            this.f6607a.d(0L, 4);
            this.f6609c = true;
        }
        this.f6607a.a(this.f6608b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r5 - r3) >= 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r9.t();
        r5 = r5 + 1;
     */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.ads.q0 r9) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.dq2 r0 = new com.google.android.gms.internal.ads.dq2
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.i()
            r5 = r9
            com.google.android.gms.internal.ads.f0 r5 = (com.google.android.gms.internal.ads.f0) r5
            r5.L(r4, r2, r1, r2)
            r0.g(r2)
            int r4 = r0.w()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.t()
            r4 = r9
            com.google.android.gms.internal.ads.f0 r4 = (com.google.android.gms.internal.ads.f0) r4
            r4.c(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.i()
            r7 = 6
            r4.L(r6, r2, r7, r2)
            r0.g(r2)
            int r6 = r0.y()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.t()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L4c
            r4.c(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.i()
            int r6 = com.google.android.gms.internal.ads.p.b(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.c(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.h(r4)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.c(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d8.g(com.google.android.gms.internal.ads.q0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f6607a.c(s0Var, new ca(Integer.MIN_VALUE, 0, 1));
        s0Var.d();
        s0Var.r(new p1(-9223372036854775807L, 0L));
    }
}
