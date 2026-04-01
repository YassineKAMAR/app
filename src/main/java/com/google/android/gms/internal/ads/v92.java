package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class v92 extends h2.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.f0 f16071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts2 f16072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jx0 f16073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f16074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final eq1 f16075f;

    public v92(Context context, h2.f0 f0Var, ts2 ts2Var, jx0 jx0Var, eq1 eq1Var) {
        this.f16070a = context;
        this.f16071b = f0Var;
        this.f16072c = ts2Var;
        this.f16073d = jx0Var;
        this.f16075f = eq1Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewI = jx0Var.i();
        g2.t.r();
        frameLayout.addView(viewI, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(q().f22353c);
        frameLayout.setMinimumWidth(q().f22356f);
        this.f16074e = frameLayout;
    }

    @Override // h2.s0
    public final String B() {
        return this.f16072c.f15304f;
    }

    @Override // h2.s0
    public final String C() {
        if (this.f16073d.c() != null) {
            return this.f16073d.c().q();
        }
        return null;
    }

    @Override // h2.s0
    public final void D() {
        a3.o.e("destroy must be called on the main UI thread.");
        this.f16073d.a();
    }

    @Override // h2.s0
    public final boolean E0() {
        return false;
    }

    @Override // h2.s0
    public final String G() {
        if (this.f16073d.c() != null) {
            return this.f16073d.c().q();
        }
        return null;
    }

    @Override // h2.s0
    public final void H5(boolean z7) {
        qg0.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void I2(h2.a1 a1Var) {
        va2 va2Var = this.f16072c.f15301c;
        if (va2Var != null) {
            va2Var.G(a1Var);
        }
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
    public final void P1(h2.k4 k4Var) {
        qg0.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void R() {
        this.f16073d.m();
    }

    @Override // h2.s0
    public final void R0(String str) {
    }

    @Override // h2.s0
    public final void S1(h2.f0 f0Var) {
        qg0.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void S3(a90 a90Var) {
    }

    @Override // h2.s0
    public final void T3(h2.r4 r4Var, h2.i0 i0Var) {
    }

    @Override // h2.s0
    public final void W() {
        a3.o.e("destroy must be called on the main UI thread.");
        this.f16073d.d().B0(null);
    }

    @Override // h2.s0
    public final void W1(h2.e1 e1Var) {
        qg0.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
    }

    @Override // h2.s0
    public final void a5(h2.w4 w4Var) {
        a3.o.e("setAdSize must be called on the main UI thread.");
        jx0 jx0Var = this.f16073d;
        if (jx0Var != null) {
            jx0Var.n(this.f16074e, w4Var);
        }
    }

    @Override // h2.s0
    public final void c5(h2.c5 c5Var) {
    }

    @Override // h2.s0
    public final void d1(h2.w0 w0Var) {
        qg0.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void f0() {
        a3.o.e("destroy must be called on the main UI thread.");
        this.f16073d.d().C0(null);
    }

    @Override // h2.s0
    public final void g4(h2.c0 c0Var) {
        qg0.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final void h2(String str) {
    }

    @Override // h2.s0
    public final void l0() {
    }

    @Override // h2.s0
    public final void m4(h2.f2 f2Var) {
        if (!((Boolean) h2.y.c().b(ns.Ca)).booleanValue()) {
            qg0.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        va2 va2Var = this.f16072c.f15301c;
        if (va2Var != null) {
            try {
                if (!f2Var.n()) {
                    this.f16075f.e();
                }
            } catch (RemoteException e8) {
                qg0.c("Error in making CSI ping for reporting paid event callback", e8);
            }
            va2Var.E(f2Var);
        }
    }

    @Override // h2.s0
    public final Bundle p() {
        qg0.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // h2.s0
    public final boolean p5() {
        return false;
    }

    @Override // h2.s0
    public final h2.w4 q() {
        a3.o.e("getAdSize must be called on the main UI thread.");
        return xs2.a(this.f16070a, Collections.singletonList(this.f16073d.k()));
    }

    @Override // h2.s0
    public final h2.f0 r() {
        return this.f16071b;
    }

    @Override // h2.s0
    public final void r4(h2.h1 h1Var) {
    }

    @Override // h2.s0
    public final h2.m2 s() {
        return this.f16073d.c();
    }

    @Override // h2.s0
    public final void s4(g3.a aVar) {
    }

    @Override // h2.s0
    public final h2.a1 t() {
        return this.f16072c.f15312n;
    }

    @Override // h2.s0
    public final void t2(nt ntVar) {
        qg0.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // h2.s0
    public final h2.p2 u() {
        return this.f16073d.j();
    }

    @Override // h2.s0
    public final g3.a v() {
        return g3.b.k3(this.f16074e);
    }

    @Override // h2.s0
    public final boolean v2(h2.r4 r4Var) {
        qg0.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }
}
