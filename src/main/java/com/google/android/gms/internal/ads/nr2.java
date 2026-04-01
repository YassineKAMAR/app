package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class nr2 extends hc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jr2 f12010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yq2 f12011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ls2 f12013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f12014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f12015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gh f12016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final eq1 f12017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jm1 f12018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12019j = ((Boolean) h2.y.c().b(ns.C0)).booleanValue();

    public nr2(String str, jr2 jr2Var, Context context, yq2 yq2Var, ls2 ls2Var, wg0 wg0Var, gh ghVar, eq1 eq1Var) {
        this.f12012c = str;
        this.f12010a = jr2Var;
        this.f12011b = yq2Var;
        this.f12013d = ls2Var;
        this.f12014e = context;
        this.f12015f = wg0Var;
        this.f12016g = ghVar;
        this.f12017h = eq1Var;
    }

    private final synchronized void S5(h2.r4 r4Var, pc0 pc0Var, int i8) {
        boolean z7 = false;
        if (((Boolean) gu.f8506l.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ma)).booleanValue()) {
                z7 = true;
            }
        }
        if (this.f12015f.f16725c < ((Integer) h2.y.c().b(ns.na)).intValue() || !z7) {
            a3.o.e("#008 Must be called on the main UI thread.");
        }
        this.f12011b.E(pc0Var);
        g2.t.r();
        if (j2.k2.g(this.f12014e) && r4Var.f22270s == null) {
            qg0.d("Failed to load the ad because app ID is missing.");
            this.f12011b.A(vt2.d(4, null, null));
            return;
        }
        if (this.f12018i != null) {
            return;
        }
        ar2 ar2Var = new ar2(null);
        this.f12010a.i(i8);
        this.f12010a.a(r4Var, this.f12012c, ar2Var, new mr2(this));
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void J0(h2.c2 c2Var) {
        if (c2Var == null) {
            this.f12011b.q(null);
        } else {
            this.f12011b.q(new lr2(this, c2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void Q2(xc0 xc0Var) {
        a3.o.e("#008 Must be called on the main UI thread.");
        ls2 ls2Var = this.f12013d;
        ls2Var.f11037a = xc0Var.f17166a;
        ls2Var.f11038b = xc0Var.f17167b;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void Q3(h2.f2 f2Var) {
        a3.o.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!f2Var.n()) {
                this.f12017h.e();
            }
        } catch (RemoteException e8) {
            qg0.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f12011b.w(f2Var);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void S2(lc0 lc0Var) {
        a3.o.e("#008 Must be called on the main UI thread.");
        this.f12011b.D(lc0Var);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void U2(h2.r4 r4Var, pc0 pc0Var) {
        S5(r4Var, pc0Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void j0(g3.a aVar) {
        u2(aVar, this.f12019j);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final Bundle k() {
        a3.o.e("#008 Must be called on the main UI thread.");
        jm1 jm1Var = this.f12018i;
        return jm1Var != null ? jm1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final h2.m2 l() {
        jm1 jm1Var;
        if (((Boolean) h2.y.c().b(ns.J6)).booleanValue() && (jm1Var = this.f12018i) != null) {
            return jm1Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized String m() {
        jm1 jm1Var = this.f12018i;
        if (jm1Var == null || jm1Var.c() == null) {
            return null;
        }
        return jm1Var.c().q();
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void n2(qc0 qc0Var) {
        a3.o.e("#008 Must be called on the main UI thread.");
        this.f12011b.K(qc0Var);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final fc0 p() {
        a3.o.e("#008 Must be called on the main UI thread.");
        jm1 jm1Var = this.f12018i;
        if (jm1Var != null) {
            return jm1Var.i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void u2(g3.a aVar, boolean z7) {
        a3.o.e("#008 Must be called on the main UI thread.");
        if (this.f12018i == null) {
            qg0.g("Rewarded can not be shown before loaded");
            this.f12011b.e(vt2.d(9, null, null));
            return;
        }
        if (((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue()) {
            this.f12016g.c().b(new Throwable().getStackTrace());
        }
        this.f12018i.n(z7, (Activity) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final boolean w() {
        a3.o.e("#008 Must be called on the main UI thread.");
        jm1 jm1Var = this.f12018i;
        return (jm1Var == null || jm1Var.l()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void x2(h2.r4 r4Var, pc0 pc0Var) {
        S5(r4Var, pc0Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final synchronized void x3(boolean z7) {
        a3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f12019j = z7;
    }
}
