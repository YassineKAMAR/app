package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class aa2 extends h2.r0 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final do2 f5162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final va2 f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h2.w4 f5165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rs2 f5166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wg0 f5167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final eq1 f5168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jx0 f5169i;

    public aa2(Context context, h2.w4 w4Var, String str, do2 do2Var, va2 va2Var, wg0 wg0Var, eq1 eq1Var) {
        this.f5161a = context;
        this.f5162b = do2Var;
        this.f5165e = w4Var;
        this.f5163c = str;
        this.f5164d = va2Var;
        this.f5166f = do2Var.h();
        this.f5167g = wg0Var;
        this.f5168h = eq1Var;
        do2Var.p(this);
    }

    private final synchronized void Q5(h2.w4 w4Var) {
        this.f5166f.I(w4Var);
        this.f5166f.N(this.f5165e.f22364n);
    }

    private final synchronized boolean R5(h2.r4 r4Var) {
        if (S5()) {
            a3.o.e("loadAd must be called on the main UI thread.");
        }
        g2.t.r();
        if (!j2.k2.g(this.f5161a) || r4Var.f22270s != null) {
            pt2.a(this.f5161a, r4Var.f22257f);
            return this.f5162b.a(r4Var, this.f5163c, null, new z92(this));
        }
        qg0.d("Failed to load the ad because app ID is missing.");
        va2 va2Var = this.f5164d;
        if (va2Var != null) {
            va2Var.A(vt2.d(4, null, null));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean S5() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8500f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ma
            com.google.android.gms.internal.ads.ls r3 = h2.y.c()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.wg0 r3 = r6.f5167g
            int r3 = r3.f16725c
            com.google.android.gms.internal.ads.fs r4 = com.google.android.gms.internal.ads.ns.na
            com.google.android.gms.internal.ads.ls r5 = h2.y.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa2.S5():boolean");
    }

    @Override // h2.s0
    public final synchronized String B() {
        return this.f5163c;
    }

    @Override // h2.s0
    public final synchronized String C() {
        jx0 jx0Var = this.f5169i;
        if (jx0Var == null || jx0Var.c() == null) {
            return null;
        }
        return jx0Var.c().q();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // h2.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void D() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8499e     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ja     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.wg0 r0 = r3.f5167g     // Catch: java.lang.Throwable -> L47
            int r0 = r0.f16725c     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.oa     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.jx0 r0 = r3.f5169i     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.a()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa2.D():void");
    }

    @Override // h2.s0
    public final synchronized boolean E0() {
        return this.f5162b.j();
    }

    @Override // h2.s0
    public final synchronized String G() {
        jx0 jx0Var = this.f5169i;
        if (jx0Var == null || jx0Var.c() == null) {
            return null;
        }
        return jx0Var.c().q();
    }

    @Override // h2.s0
    public final synchronized void H5(boolean z7) {
        if (S5()) {
            a3.o.e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.f5166f.P(z7);
    }

    @Override // h2.s0
    public final void I2(h2.a1 a1Var) {
        if (S5()) {
            a3.o.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f5164d.G(a1Var);
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
        if (S5()) {
            a3.o.e("setVideoOptions must be called on the main UI thread.");
        }
        this.f5166f.f(k4Var);
    }

    @Override // h2.s0
    public final synchronized void R() {
        a3.o.e("recordManualImpression must be called on the main UI thread.");
        jx0 jx0Var = this.f5169i;
        if (jx0Var != null) {
            jx0Var.m();
        }
    }

    @Override // h2.s0
    public final void R0(String str) {
    }

    @Override // h2.s0
    public final void S1(h2.f0 f0Var) {
        if (S5()) {
            a3.o.e("setAdListener must be called on the main UI thread.");
        }
        this.f5164d.q(f0Var);
    }

    @Override // h2.s0
    public final void S3(a90 a90Var) {
    }

    @Override // h2.s0
    public final void T3(h2.r4 r4Var, h2.i0 i0Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // h2.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void W() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8501g     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ka     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.wg0 r0 = r3.f5167g     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.f16725c     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.oa     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.jx0 r0 = r3.f5169i     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.g51 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.B0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa2.W():void");
    }

    @Override // h2.s0
    public final synchronized void W1(h2.e1 e1Var) {
        a3.o.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f5166f.q(e1Var);
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
    }

    @Override // h2.s0
    public final synchronized void a5(h2.w4 w4Var) {
        a3.o.e("setAdSize must be called on the main UI thread.");
        this.f5166f.I(w4Var);
        this.f5165e = w4Var;
        jx0 jx0Var = this.f5169i;
        if (jx0Var != null) {
            jx0Var.n(this.f5162b.c(), w4Var);
        }
    }

    @Override // h2.s0
    public final void c5(h2.c5 c5Var) {
    }

    @Override // h2.s0
    public final void d1(h2.w0 w0Var) {
        a3.o.e("setAdMetadataListener must be called on the main UI thread.");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // h2.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f0() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ut r0 = com.google.android.gms.internal.ads.gu.f8502h     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.ia     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.wg0 r0 = r3.f5167g     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.f16725c     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.oa     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.jx0 r0 = r3.f5169i     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.g51 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.C0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa2.f0():void");
    }

    @Override // h2.s0
    public final void g4(h2.c0 c0Var) {
        if (S5()) {
            a3.o.e("setAdListener must be called on the main UI thread.");
        }
        this.f5162b.o(c0Var);
    }

    @Override // h2.s0
    public final void h2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.a71
    public final synchronized void j() {
        if (!this.f5162b.r()) {
            this.f5162b.n();
            return;
        }
        h2.w4 w4VarX = this.f5166f.x();
        jx0 jx0Var = this.f5169i;
        if (jx0Var != null && jx0Var.l() != null && this.f5166f.o()) {
            w4VarX = xs2.a(this.f5161a, Collections.singletonList(this.f5169i.l()));
        }
        Q5(w4VarX);
        try {
            R5(this.f5166f.v());
        } catch (RemoteException unused) {
            qg0.g("Failed to refresh the banner ad.");
        }
    }

    @Override // h2.s0
    public final void l0() {
    }

    @Override // h2.s0
    public final void m4(h2.f2 f2Var) {
        if (S5()) {
            a3.o.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!f2Var.n()) {
                this.f5168h.e();
            }
        } catch (RemoteException e8) {
            qg0.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f5164d.E(f2Var);
    }

    @Override // h2.s0
    public final Bundle p() {
        a3.o.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // h2.s0
    public final boolean p5() {
        return false;
    }

    @Override // h2.s0
    public final synchronized h2.w4 q() {
        a3.o.e("getAdSize must be called on the main UI thread.");
        jx0 jx0Var = this.f5169i;
        if (jx0Var != null) {
            return xs2.a(this.f5161a, Collections.singletonList(jx0Var.k()));
        }
        return this.f5166f.x();
    }

    @Override // h2.s0
    public final h2.f0 r() {
        return this.f5164d.h();
    }

    @Override // h2.s0
    public final void r4(h2.h1 h1Var) {
    }

    @Override // h2.s0
    public final synchronized h2.m2 s() {
        if (!((Boolean) h2.y.c().b(ns.J6)).booleanValue()) {
            return null;
        }
        jx0 jx0Var = this.f5169i;
        if (jx0Var == null) {
            return null;
        }
        return jx0Var.c();
    }

    @Override // h2.s0
    public final void s4(g3.a aVar) {
    }

    @Override // h2.s0
    public final h2.a1 t() {
        return this.f5164d.o();
    }

    @Override // h2.s0
    public final synchronized void t2(nt ntVar) {
        a3.o.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5162b.q(ntVar);
    }

    @Override // h2.s0
    public final synchronized h2.p2 u() {
        a3.o.e("getVideoController must be called from the main thread.");
        jx0 jx0Var = this.f5169i;
        if (jx0Var == null) {
            return null;
        }
        return jx0Var.j();
    }

    @Override // h2.s0
    public final g3.a v() {
        if (S5()) {
            a3.o.e("getAdFrame must be called on the main UI thread.");
        }
        return g3.b.k3(this.f5162b.c());
    }

    @Override // h2.s0
    public final synchronized boolean v2(h2.r4 r4Var) {
        Q5(this.f5165e);
        return R5(r4Var);
    }
}
