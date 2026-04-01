package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class sh4 {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private vv1 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rh4 f14677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f14678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f14679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private qh4 f14682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f14685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f14686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f14688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f14689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f14690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f14691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f14694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f14695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f14696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f14697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f14698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f14701y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f14702z;

    public sh4(rh4 rh4Var) {
        this.f14677a = rh4Var;
        int i8 = nz2.f12300a;
        try {
            this.f14690n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14678b = new long[10];
        this.J = vv1.f16482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.f14701y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2c
            long r0 = com.google.android.gms.internal.ads.nz2.C(r0)
            long r2 = r12.f14701y
            long r0 = r0 - r2
            float r2 = r12.f14686j
            long r0 = com.google.android.gms.internal.ads.nz2.A(r0, r2)
            int r2 = r12.f14683g
            long r0 = com.google.android.gms.internal.ads.nz2.z(r0, r2)
            long r2 = r12.B
            long r4 = r12.A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2c:
            long r2 = r12.f14695s
            long r2 = r0 - r2
            r6 = 5
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L94
            android.media.AudioTrack r2 = r12.f14679c
            r2.getClass()
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L43
            goto L92
        L43:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            boolean r2 = r12.f14684h
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 0
            if (r2 == 0) goto L63
            r2 = 2
            if (r3 != r2) goto L60
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L5f
            long r10 = r12.f14696t
            r12.f14698v = r10
        L5f:
            r3 = 2
        L60:
            long r10 = r12.f14698v
            long r6 = r6 + r10
        L63:
            int r2 = com.google.android.gms.internal.ads.nz2.f12300a
            r10 = 29
            if (r2 > r10) goto L83
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L7f
            long r6 = r12.f14696t
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L80
            r2 = 3
            if (r3 != r2) goto L80
            long r2 = r12.f14702z
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L92
            r12.f14702z = r0
            goto L92
        L7f:
            r8 = r6
        L80:
            r12.f14702z = r4
            r6 = r8
        L83:
            long r2 = r12.f14696t
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L90
            long r2 = r12.f14697u
            r4 = 1
            long r2 = r2 + r4
            r12.f14697u = r2
        L90:
            r12.f14696t = r6
        L92:
            r12.f14695s = r0
        L94:
            long r0 = r12.f14696t
            long r2 = r12.I
            long r0 = r0 + r2
            long r2 = r12.f14697u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sh4.m():long");
    }

    private final long n() {
        long jM = m();
        int i8 = this.f14683g;
        int i9 = nz2.f12300a;
        return (jM * 1000000) / ((long) i8);
    }

    private final void o() {
        this.f14688l = 0L;
        this.f14700x = 0;
        this.f14699w = 0;
        this.f14689m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f14687k = false;
    }

    public final int a(long j8) {
        return this.f14681e - ((int) (j8 - (m() * ((long) this.f14680d))));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(boolean r26) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sh4.b(boolean):long");
    }

    public final void c(long j8) {
        this.A = m();
        this.f14701y = nz2.C(SystemClock.elapsedRealtime());
        this.B = j8;
    }

    public final void d() {
        o();
        this.f14679c = null;
        this.f14682f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.media.AudioTrack r7, boolean r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            r6.f14679c = r7
            r6.f14680d = r10
            r6.f14681e = r11
            com.google.android.gms.internal.ads.qh4 r0 = new com.google.android.gms.internal.ads.qh4
            r0.<init>(r7)
            r6.f14682f = r0
            int r7 = r7.getSampleRate()
            r6.f14683g = r7
            r7 = 6
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L25
            int r8 = com.google.android.gms.internal.ads.nz2.f12300a
            r2 = 23
            if (r8 >= r2) goto L25
            r8 = 5
            if (r9 == r8) goto L26
            if (r9 != r7) goto L25
            r9 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r6.f14684h = r0
            boolean r7 = com.google.android.gms.internal.ads.nz2.f(r9)
            r6.f14693q = r7
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L41
            int r11 = r11 / r10
            long r10 = (long) r11
            int r7 = r6.f14683g
            long r2 = (long) r7
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r4
            long r10 = r10 / r2
            goto L42
        L41:
            r10 = r8
        L42:
            r6.f14685i = r10
            r10 = 0
            r6.f14696t = r10
            r6.f14697u = r10
            r6.H = r1
            r6.I = r10
            r6.f14698v = r10
            r6.f14692p = r1
            r6.f14701y = r8
            r6.f14702z = r8
            r6.f14694r = r10
            r6.f14691o = r10
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.f14686j = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sh4.e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f(vv1 vv1Var) {
        this.J = vv1Var;
    }

    public final void g() {
        qh4 qh4Var = this.f14682f;
        qh4Var.getClass();
        qh4Var.e();
    }

    public final boolean h(long j8) {
        if (j8 > nz2.z(b(false), this.f14683g)) {
            return true;
        }
        if (this.f14684h) {
            AudioTrack audioTrack = this.f14679c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        AudioTrack audioTrack = this.f14679c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean j(long j8) {
        return this.f14702z != -9223372036854775807L && j8 > 0 && SystemClock.elapsedRealtime() - this.f14702z >= 200;
    }

    public final boolean k(long j8) {
        AudioTrack audioTrack = this.f14679c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f14684h) {
            if (playState == 2) {
                this.f14692p = false;
                return false;
            }
            if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z7 = this.f14692p;
        boolean zH = h(j8);
        this.f14692p = zH;
        if (z7 && !zH && playState != 1) {
            rh4 rh4Var = this.f14677a;
            int i8 = this.f14681e;
            long jE = nz2.E(this.f14685i);
            pi4 pi4Var = (pi4) rh4Var;
            xi4 xi4Var = pi4Var.f12904a;
            if (xi4Var.f17257m != null) {
                ((cj4) pi4Var.f12904a.f17257m).f6382a.P0.t(i8, jE, SystemClock.elapsedRealtime() - xi4Var.S);
            }
        }
        return true;
    }

    public final boolean l() {
        o();
        if (this.f14701y != -9223372036854775807L) {
            return false;
        }
        qh4 qh4Var = this.f14682f;
        qh4Var.getClass();
        qh4Var.e();
        return true;
    }
}
