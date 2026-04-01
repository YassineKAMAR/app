package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class us4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr4 f15841a = new wr4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qs4 f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts4 f15843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f15845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f15846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f15847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f15848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f15849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f15851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f15852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f15853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f15854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f15855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f15856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f15857q;

    public us4(Context context) {
        qs4 qs4VarB;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i8 = nz2.f12300a;
            qs4VarB = ss4.b(applicationContext);
            if (qs4VarB == null) {
                qs4VarB = rs4.b(applicationContext);
            }
        } else {
            qs4VarB = null;
        }
        this.f15842b = qs4VarB;
        this.f15843c = qs4VarB != null ? ts4.a() : null;
        this.f15851k = -9223372036854775807L;
        this.f15852l = -9223372036854775807L;
        this.f15846f = -1.0f;
        this.f15849i = 1.0f;
        this.f15850j = 0;
    }

    public static /* synthetic */ void b(us4 us4Var, Display display) {
        long j8;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            us4Var.f15851k = refreshRate;
            j8 = (refreshRate * 80) / 100;
        } else {
            pf2.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j8 = -9223372036854775807L;
            us4Var.f15851k = -9223372036854775807L;
        }
        us4Var.f15852l = j8;
    }

    private final void k() {
        Surface surface;
        if (nz2.f12300a < 30 || (surface = this.f15845e) == null || this.f15850j == Integer.MIN_VALUE || this.f15848h == 0.0f) {
            return;
        }
        this.f15848h = 0.0f;
        ps4.a(surface, 0.0f);
    }

    private final void l() {
        this.f15853m = 0L;
        this.f15856p = -1L;
        this.f15854n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.nz2.f12300a
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r10.f15845e
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.wr4 r0 = r10.f15841a
            boolean r0 = r0.g()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.wr4 r0 = r10.f15841a
            float r0 = r0.a()
            goto L1c
        L1a:
            float r0 = r10.f15846f
        L1c:
            float r2 = r10.f15847g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.wr4 r1 = r10.f15841a
            boolean r1 = r1.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.wr4 r1 = r10.f15841a
            long r6 = r1.d()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r10.f15847g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r6 != 0) goto L68
            com.google.android.gms.internal.ads.wr4 r2 = r10.f15841a
            int r2 = r2.b()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.f15847g = r0
            r10.n(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.us4.m():void");
    }

    private final void n(boolean z7) {
        Surface surface;
        if (nz2.f12300a < 30 || (surface = this.f15845e) == null || this.f15850j == Integer.MIN_VALUE) {
            return;
        }
        float f8 = 0.0f;
        if (this.f15844d) {
            float f9 = this.f15847g;
            if (f9 != -1.0f) {
                f8 = this.f15849i * f9;
            }
        }
        if (z7 || this.f15848h != f8) {
            this.f15848h = f8;
            ps4.a(surface, f8);
        }
    }

    public final long a(long j8) {
        long j9;
        if (this.f15856p != -1 && this.f15841a.g()) {
            long jC = this.f15841a.c();
            long j10 = this.f15857q + ((long) ((jC * (this.f15853m - this.f15856p)) / this.f15849i));
            if (Math.abs(j8 - j10) > 20000000) {
                l();
            } else {
                j8 = j10;
            }
        }
        this.f15854n = this.f15853m;
        this.f15855o = j8;
        ts4 ts4Var = this.f15843c;
        if (ts4Var == null || this.f15851k == -9223372036854775807L) {
            return j8;
        }
        long j11 = ts4Var.f15318a;
        if (j11 == -9223372036854775807L) {
            return j8;
        }
        long j12 = this.f15851k;
        long j13 = j11 + (((j8 - j11) / j12) * j12);
        if (j8 <= j13) {
            j9 = j13 - j12;
        } else {
            j13 = j12 + j13;
            j9 = j13;
        }
        long j14 = this.f15852l;
        if (j13 - j8 >= j8 - j9) {
            j13 = j9;
        }
        return j13 - j14;
    }

    public final void c(float f8) {
        this.f15846f = f8;
        this.f15841a.f();
        m();
    }

    public final void d(long j8) {
        long j9 = this.f15854n;
        if (j9 != -1) {
            this.f15856p = j9;
            this.f15857q = this.f15855o;
        }
        this.f15853m++;
        this.f15841a.e(j8 * 1000);
        m();
    }

    public final void e(float f8) {
        this.f15849i = f8;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.f15844d = true;
        l();
        if (this.f15842b != null) {
            ts4 ts4Var = this.f15843c;
            ts4Var.getClass();
            ts4Var.b();
            this.f15842b.a(new ms4(this));
        }
        n(false);
    }

    public final void h() {
        this.f15844d = false;
        qs4 qs4Var = this.f15842b;
        if (qs4Var != null) {
            qs4Var.j();
            ts4 ts4Var = this.f15843c;
            ts4Var.getClass();
            ts4Var.c();
        }
        k();
    }

    public final void i(Surface surface) {
        int i8 = nz2.f12300a;
        boolean zA = ns4.a(surface);
        Surface surface2 = this.f15845e;
        if (true == zA) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        k();
        this.f15845e = surface;
        n(true);
    }

    public final void j(int i8) {
        if (this.f15850j == i8) {
            return;
        }
        this.f15850j = i8;
        n(true);
    }
}
