package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g8 implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f8252d = new w0() { // from class: com.google.android.gms.internal.ads.f8
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new g8()};
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8 f8253a = new h8(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f8254b = new dq2(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8255c;

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f8255c = false;
        this.f8253a.m();
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) {
        int iH = q0Var.H(this.f8254b.i(), 0, 16384);
        if (iH == -1) {
            return -1;
        }
        this.f8254b.g(0);
        this.f8254b.f(iH);
        if (!this.f8255c) {
            this.f8253a.d(0L, 4);
            this.f8255c = true;
        }
        this.f8253a.a(this.f8254b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r16.t();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if ((r5 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.ads.q0 r16) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.dq2 r0 = new com.google.android.gms.internal.ads.dq2
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.i()
            r5 = r16
            com.google.android.gms.internal.ads.f0 r5 = (com.google.android.gms.internal.ads.f0) r5
            r5.L(r4, r2, r1, r2)
            r0.g(r2)
            int r4 = r0.w()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.t()
            r4 = r16
            com.google.android.gms.internal.ads.f0 r4 = (com.google.android.gms.internal.ads.f0) r4
            r4.c(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.i()
            r8 = 7
            r4.L(r6, r2, r8, r2)
            r0.g(r2)
            int r6 = r0.y()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.t()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L55
            r4.c(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.i()
            int r12 = com.google.android.gms.internal.ads.s.f14398b
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.c(r12, r2)
            goto L2d
        L9e:
            r0.h(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.c(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g8.g(com.google.android.gms.internal.ads.q0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f8253a.c(s0Var, new ca(Integer.MIN_VALUE, 0, 1));
        s0Var.d();
        s0Var.r(new p1(-9223372036854775807L, 0L));
    }
}
