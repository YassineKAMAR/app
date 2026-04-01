package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w0 f7582n = new w0() { // from class: com.google.android.gms.internal.ads.d2
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new f2(0)};
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f7583o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f7584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f7585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f7586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f7587s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7593f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f7596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f7597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w1 f7598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q1 f7599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7600m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f7588a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7594g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f7584p = iArr;
        int i8 = nz2.f12300a;
        Charset charset = x73.f17098c;
        f7585q = "#!AMR\n".getBytes(charset);
        f7586r = "#!AMR-WB\n".getBytes(charset);
        f7587s = iArr[8];
    }

    public f2(int i8) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(com.google.android.gms.internal.ads.q0 r12) throws com.google.android.gms.internal.ads.yh0 {
        /*
            r11 = this;
            int r0 = r11.f7592e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.t()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f7588a     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.google.android.gms.internal.ads.f0 r4 = (com.google.android.gms.internal.ads.f0) r4     // Catch: java.io.EOFException -> Lb5
            r4.L(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f7588a     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.f7589b     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.f2.f7584p     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.f2.f7583o     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.f7591d = r0     // Catch: java.io.EOFException -> Lb5
            r11.f7592e = r0
            int r4 = r11.f7594g
            if (r4 != r1) goto L4e
            r11.f7594g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.f7595h
            int r4 = r4 + r2
            r11.f7595h = r4
        L55:
            com.google.android.gms.internal.ads.w1 r4 = r11.f7598k
            int r12 = com.google.android.gms.internal.ads.u1.a(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.f7592e
            int r0 = r0 - r12
            r11.f7592e = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.w1 r4 = r11.f7598k
            long r5 = r11.f7590c
            r7 = 1
            int r8 = r11.f7591d
            r9 = 0
            r10 = 0
            r4.a(r5, r7, r8, r9, r10)
            long r0 = r11.f7590c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f7590c = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.yh0 r12 = com.google.android.gms.internal.ads.yh0.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.yh0 r12 = com.google.android.gms.internal.ads.yh0.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f2.a(com.google.android.gms.internal.ads.q0):int");
    }

    private static boolean b(q0 q0Var, byte[] bArr) {
        q0Var.t();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((f0) q0Var).L(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(q0 q0Var) throws EOFException, InterruptedIOException {
        int length;
        byte[] bArr = f7585q;
        if (b(q0Var, bArr)) {
            this.f7589b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f7586r;
            if (!b(q0Var, bArr2)) {
                return false;
            }
            this.f7589b = true;
            length = bArr2.length;
        }
        ((f0) q0Var).d(length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        this.f7590c = 0L;
        this.f7591d = 0;
        this.f7592e = 0;
        this.f7596i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final int f(q0 q0Var, n1 n1Var) throws yh0 {
        uu1.b(this.f7598k);
        int i8 = nz2.f12300a;
        if (q0Var.n() == 0 && !c(q0Var)) {
            throw yh0.a("Could not find AMR header.", null);
        }
        if (!this.f7600m) {
            this.f7600m = true;
            boolean z7 = this.f7589b;
            String str = true != z7 ? "audio/3gpp" : "audio/amr-wb";
            int i9 = true != z7 ? 8000 : 16000;
            w1 w1Var = this.f7598k;
            l9 l9Var = new l9();
            l9Var.u(str);
            l9Var.n(f7587s);
            l9Var.k0(1);
            l9Var.v(i9);
            w1Var.e(l9Var.D());
        }
        int iA = a(q0Var);
        if (this.f7593f) {
            return iA;
        }
        p1 p1Var = new p1(-9223372036854775807L, 0L);
        this.f7599l = p1Var;
        this.f7597j.r(p1Var);
        this.f7593f = true;
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) {
        return c(q0Var);
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f7597j = s0Var;
        this.f7598k = s0Var.f(0, 1);
        s0Var.d();
    }
}
