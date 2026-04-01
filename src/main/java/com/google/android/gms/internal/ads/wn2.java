package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 extends h2.r0 implements i2.u, im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f16826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16827b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qn2 f16830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final on2 f16831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wg0 f16832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final eq1 f16833h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rw0 f16835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected dx0 f16836k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f16828c = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16834i = -1;

    public wn2(bo0 bo0Var, Context context, String str, qn2 qn2Var, on2 on2Var, wg0 wg0Var, eq1 eq1Var) {
        this.f16826a = bo0Var;
        this.f16827b = context;
        this.f16829d = str;
        this.f16830e = qn2Var;
        this.f16831f = on2Var;
        this.f16832g = wg0Var;
        this.f16833h = eq1Var;
        on2Var.k(this);
    }

    private final synchronized void Q5(int i8) {
        if (this.f16828c.compareAndSet(false, true)) {
            this.f16831f.h();
            rw0 rw0Var = this.f16835j;
            if (rw0Var != null) {
                g2.t.d().e(rw0Var);
            }
            if (this.f16836k != null) {
                long jB = -1;
                if (this.f16834i != -1) {
                    jB = g2.t.b().b() - this.f16834i;
                }
                this.f16836k.k(jB, i8);
            }
            D();
        }
    }

    @Override // h2.s0
    public final synchronized String B() {
        return this.f16829d;
    }

    @Override // h2.s0
    public final synchronized String C() {
        return null;
    }

    @Override // h2.s0
    public final synchronized void D() {
        a3.o.e("destroy must be called on the main UI thread.");
        dx0 dx0Var = this.f16836k;
        if (dx0Var != null) {
            dx0Var.a();
        }
    }

    @Override // h2.s0
    public final synchronized boolean E0() {
        return this.f16830e.j();
    }

    @Override // h2.s0
    public final synchronized String G() {
        return null;
    }

    @Override // i2.u
    public final synchronized void G5() {
        if (this.f16836k == null) {
            return;
        }
        this.f16834i = g2.t.b().b();
        int iH = this.f16836k.h();
        if (iH <= 0) {
            return;
        }
        rw0 rw0Var = new rw0(this.f16826a.d(), g2.t.b());
        this.f16835j = rw0Var;
        rw0Var.d(iH, new Runnable() { // from class: com.google.android.gms.internal.ads.tn2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15175a.y();
            }
        });
    }

    @Override // h2.s0
    public final synchronized void H5(boolean z7) {
    }

    @Override // h2.s0
    public final void I2(h2.a1 a1Var) {
    }

    @Override // h2.s0
    public final void I4(boolean z7) {
    }

    @Override // h2.s0
    public final void K5(d90 d90Var, String str) {
    }

    @Override // h2.s0
    public final void O1(vb0 vb0Var) {
    }

    @Override // h2.s0
    public final void O3(h2.t2 t2Var) {
    }

    @Override // h2.s0
    public final synchronized void P1(h2.k4 k4Var) {
    }

    @Override // h2.s0
    public final synchronized void R() {
    }

    @Override // h2.s0
    public final void R0(String str) {
    }

    @Override // h2.s0
    public final void S1(h2.f0 f0Var) {
    }

    @Override // h2.s0
    public final void S3(a90 a90Var) {
    }

    @Override // h2.s0
    public final void T3(h2.r4 r4Var, h2.i0 i0Var) {
    }

    @Override // h2.s0
    public final synchronized void W() {
        a3.o.e("pause must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final synchronized void W1(h2.e1 e1Var) {
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
        this.f16831f.m(rmVar);
    }

    @Override // h2.s0
    public final synchronized void a5(h2.w4 w4Var) {
        a3.o.e("setAdSize must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final void c5(h2.c5 c5Var) {
        this.f16830e.l(c5Var);
    }

    @Override // h2.s0
    public final void d1(h2.w0 w0Var) {
    }

    @Override // h2.s0
    public final synchronized void f0() {
        a3.o.e("resume must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final void g4(h2.c0 c0Var) {
    }

    @Override // h2.s0
    public final void h2(String str) {
    }

    @Override // i2.u
    public final void h5() {
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void j() {
        Q5(3);
    }

    @Override // i2.u
    public final void k0() {
    }

    @Override // h2.s0
    public final synchronized void l0() {
    }

    @Override // h2.s0
    public final void m4(h2.f2 f2Var) {
    }

    @Override // h2.s0
    public final Bundle p() {
        return new Bundle();
    }

    @Override // h2.s0
    public final boolean p5() {
        return false;
    }

    @Override // h2.s0
    public final synchronized h2.w4 q() {
        return null;
    }

    @Override // i2.u
    public final void q3() {
    }

    @Override // h2.s0
    public final h2.f0 r() {
        return null;
    }

    @Override // h2.s0
    public final void r4(h2.h1 h1Var) {
    }

    @Override // h2.s0
    public final synchronized h2.m2 s() {
        return null;
    }

    @Override // h2.s0
    public final void s4(g3.a aVar) {
    }

    @Override // h2.s0
    public final h2.a1 t() {
        return null;
    }

    @Override // h2.s0
    public final synchronized void t2(nt ntVar) {
    }

    @Override // h2.s0
    public final synchronized h2.p2 u() {
        return null;
    }

    @Override // h2.s0
    public final g3.a v() {
        return null;
    }

    @Override // i2.u
    public final void v0(int i8) {
        if (i8 == 0) {
            throw null;
        }
        int i9 = i8 - 1;
        if (i9 != 0) {
            Q5(i9 != 1 ? i9 != 2 ? 6 : 3 : 4);
        } else {
            Q5(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // h2.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean v2(h2.r4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8498d     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ma     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.wg0 r2 = r5.f16832g     // Catch: java.lang.Throwable -> L87
            int r2 = r2.f16725c     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.fs r3 = com.google.android.gms.internal.ads.ns.na     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.ls r4 = h2.y.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            g2.t.r()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.f16827b     // Catch: java.lang.Throwable -> L87
            boolean r0 = j2.k2.g(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            h2.y0 r0 = r6.f22270s     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.qg0.d(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.on2 r6 = r5.f16831f     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            h2.z2 r0 = com.google.android.gms.internal.ads.vt2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.A(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.E0()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.f16828c = r0     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.un2 r0 = new com.google.android.gms.internal.ads.un2     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.qn2 r1 = r5.f16830e     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.f16829d     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.vn2 r3 = new com.google.android.gms.internal.ads.vn2     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wn2.v2(h2.r4):boolean");
    }

    final /* synthetic */ void w() {
        Q5(5);
    }

    public final void y() {
        this.f16826a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sn2
            @Override // java.lang.Runnable
            public final void run() {
                this.f14773a.w();
            }
        });
    }

    @Override // i2.u
    public final synchronized void y4() {
        dx0 dx0Var = this.f16836k;
        if (dx0Var != null) {
            dx0Var.k(g2.t.b().b() - this.f16834i, 1);
        }
    }
}
