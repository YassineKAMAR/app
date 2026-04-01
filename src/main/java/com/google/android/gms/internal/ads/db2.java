package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class db2 extends h2.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2.w4 f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xp2 f6657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wg0 f6659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final va2 f6660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final yq2 f6661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gh f6662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final eq1 f6663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ad1 f6664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6665k = ((Boolean) h2.y.c().b(ns.C0)).booleanValue();

    public db2(Context context, h2.w4 w4Var, String str, xp2 xp2Var, va2 va2Var, yq2 yq2Var, wg0 wg0Var, gh ghVar, eq1 eq1Var) {
        this.f6655a = w4Var;
        this.f6658d = str;
        this.f6656b = context;
        this.f6657c = xp2Var;
        this.f6660f = va2Var;
        this.f6661g = yq2Var;
        this.f6659e = wg0Var;
        this.f6662h = ghVar;
        this.f6663i = eq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean Q5() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ad1 r0 = r1.f6664j     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db2.Q5():boolean");
    }

    @Override // h2.s0
    public final synchronized String B() {
        return this.f6658d;
    }

    @Override // h2.s0
    public final synchronized String C() {
        ad1 ad1Var = this.f6664j;
        if (ad1Var == null || ad1Var.c() == null) {
            return null;
        }
        return ad1Var.c().q();
    }

    @Override // h2.s0
    public final synchronized void D() {
        a3.o.e("destroy must be called on the main UI thread.");
        ad1 ad1Var = this.f6664j;
        if (ad1Var != null) {
            ad1Var.d().A0(null);
        }
    }

    @Override // h2.s0
    public final synchronized boolean E0() {
        return this.f6657c.j();
    }

    @Override // h2.s0
    public final synchronized String G() {
        ad1 ad1Var = this.f6664j;
        if (ad1Var == null || ad1Var.c() == null) {
            return null;
        }
        return ad1Var.c().q();
    }

    @Override // h2.s0
    public final void H5(boolean z7) {
    }

    @Override // h2.s0
    public final void I2(h2.a1 a1Var) {
        a3.o.e("setAppEventListener must be called on the main UI thread.");
        this.f6660f.G(a1Var);
    }

    @Override // h2.s0
    public final synchronized void I4(boolean z7) {
        a3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f6665k = z7;
    }

    @Override // h2.s0
    public final void K5(d90 d90Var, String str) {
    }

    @Override // h2.s0
    public final void O1(vb0 vb0Var) {
        this.f6661g.G(vb0Var);
    }

    @Override // h2.s0
    public final void O3(h2.t2 t2Var) {
    }

    @Override // h2.s0
    public final void P1(h2.k4 k4Var) {
    }

    @Override // h2.s0
    public final void R() {
    }

    @Override // h2.s0
    public final void R0(String str) {
    }

    @Override // h2.s0
    public final void S1(h2.f0 f0Var) {
        a3.o.e("setAdListener must be called on the main UI thread.");
        this.f6660f.q(f0Var);
    }

    @Override // h2.s0
    public final void S3(a90 a90Var) {
    }

    @Override // h2.s0
    public final void T3(h2.r4 r4Var, h2.i0 i0Var) {
        this.f6660f.D(i0Var);
        v2(r4Var);
    }

    @Override // h2.s0
    public final synchronized void W() {
        a3.o.e("pause must be called on the main UI thread.");
        ad1 ad1Var = this.f6664j;
        if (ad1Var != null) {
            ad1Var.d().B0(null);
        }
    }

    @Override // h2.s0
    public final void W1(h2.e1 e1Var) {
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
    }

    @Override // h2.s0
    public final void a5(h2.w4 w4Var) {
    }

    @Override // h2.s0
    public final void c5(h2.c5 c5Var) {
    }

    @Override // h2.s0
    public final void d1(h2.w0 w0Var) {
        a3.o.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final synchronized void f0() {
        a3.o.e("resume must be called on the main UI thread.");
        ad1 ad1Var = this.f6664j;
        if (ad1Var != null) {
            ad1Var.d().C0(null);
        }
    }

    @Override // h2.s0
    public final void g4(h2.c0 c0Var) {
    }

    @Override // h2.s0
    public final void h2(String str) {
    }

    @Override // h2.s0
    public final synchronized void l0() {
        a3.o.e("showInterstitial must be called on the main UI thread.");
        if (this.f6664j == null) {
            qg0.g("Interstitial can not be shown before loaded.");
            this.f6660f.e(vt2.d(9, null, null));
        } else {
            if (((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue()) {
                this.f6662h.c().b(new Throwable().getStackTrace());
            }
            this.f6664j.i(this.f6665k, null);
        }
    }

    @Override // h2.s0
    public final void m4(h2.f2 f2Var) {
        a3.o.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!f2Var.n()) {
                this.f6663i.e();
            }
        } catch (RemoteException e8) {
            qg0.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f6660f.E(f2Var);
    }

    @Override // h2.s0
    public final Bundle p() {
        a3.o.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // h2.s0
    public final synchronized boolean p5() {
        a3.o.e("isLoaded must be called on the main UI thread.");
        return Q5();
    }

    @Override // h2.s0
    public final h2.w4 q() {
        return null;
    }

    @Override // h2.s0
    public final h2.f0 r() {
        return this.f6660f.h();
    }

    @Override // h2.s0
    public final void r4(h2.h1 h1Var) {
        this.f6660f.J(h1Var);
    }

    @Override // h2.s0
    public final synchronized h2.m2 s() {
        if (!((Boolean) h2.y.c().b(ns.J6)).booleanValue()) {
            return null;
        }
        ad1 ad1Var = this.f6664j;
        if (ad1Var == null) {
            return null;
        }
        return ad1Var.c();
    }

    @Override // h2.s0
    public final synchronized void s4(g3.a aVar) {
        if (this.f6664j == null) {
            qg0.g("Interstitial can not be shown before loaded.");
            this.f6660f.e(vt2.d(9, null, null));
            return;
        }
        if (((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue()) {
            this.f6662h.c().b(new Throwable().getStackTrace());
        }
        this.f6664j.i(this.f6665k, (Activity) g3.b.H0(aVar));
    }

    @Override // h2.s0
    public final h2.a1 t() {
        return this.f6660f.o();
    }

    @Override // h2.s0
    public final synchronized void t2(nt ntVar) {
        a3.o.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f6657c.h(ntVar);
    }

    @Override // h2.s0
    public final h2.p2 u() {
        return null;
    }

    @Override // h2.s0
    public final g3.a v() {
        return null;
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
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8503i     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ma     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.wg0 r2 = r5.f6659e     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.f16725c     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.fs r3 = com.google.android.gms.internal.ads.ns.na     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.ls r4 = h2.y.c()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            g2.t.r()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.f6656b     // Catch: java.lang.Throwable -> L8c
            boolean r0 = j2.k2.g(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            h2.y0 r0 = r6.f22270s     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.qg0.d(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.va2 r6 = r5.f6660f     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L63
            r0 = 4
            h2.z2 r0 = com.google.android.gms.internal.ads.vt2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.A(r0)     // Catch: java.lang.Throwable -> L8c
        L63:
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.Q5()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            android.content.Context r0 = r5.f6656b     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.f22257f     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.pt2.a(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.f6664j = r2     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.xp2 r0 = r5.f6657c     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.f6658d     // Catch: java.lang.Throwable -> L8c
            h2.w4 r2 = r5.f6655a     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.qp2 r3 = new com.google.android.gms.internal.ads.qp2     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.cb2 r2 = new com.google.android.gms.internal.ads.cb2     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db2.v2(h2.r4):boolean");
    }
}
