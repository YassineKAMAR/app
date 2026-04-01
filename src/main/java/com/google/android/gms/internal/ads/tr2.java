package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class tr2 extends qb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jr2 f15251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yq2 f15252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ls2 f15253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private jm1 f15254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15255e = false;

    public tr2(jr2 jr2Var, yq2 yq2Var, ls2 ls2Var) {
        this.f15251a = jr2Var;
        this.f15252b = yq2Var;
        this.f15253c = ls2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean R5() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.jm1 r0 = r1.f15254d     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.k()     // Catch: java.lang.Throwable -> L10
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tr2.R5():boolean");
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void B3(h2.w0 w0Var) {
        a3.o.e("setAdMetadataListener can only be called from the UI thread.");
        if (w0Var == null) {
            this.f15252b.q(null);
        } else {
            this.f15252b.q(new sr2(this, w0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final boolean C() {
        a3.o.e("isLoaded must be called on the main UI thread.");
        return R5();
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void D5(vb0 vb0Var) {
        a3.o.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f15252b.G(vb0Var);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final boolean G() {
        jm1 jm1Var = this.f15254d;
        return jm1Var != null && jm1Var.m();
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void G0(g3.a aVar) {
        a3.o.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f15252b.q(null);
        if (this.f15254d != null) {
            if (aVar != null) {
                context = (Context) g3.b.H0(aVar);
            }
            this.f15254d.d().A0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void Y(boolean z7) {
        a3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f15255e = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.rb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void Z3(com.google.android.gms.internal.ads.wb0 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            a3.o.e(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r5.f16676b     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.f12135m5     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L2b
            if (r0 != 0) goto L19
            goto L2b
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L21 java.lang.Throwable -> L63
            if (r0 == 0) goto L2b
            monitor-exit(r4)
            return
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zf0 r2 = g2.t.q()     // Catch: java.lang.Throwable -> L63
            r2.u(r0, r1)     // Catch: java.lang.Throwable -> L63
        L2b:
            boolean r0 = r4.R5()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12153o5     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L45
            monitor-exit(r4)
            return
        L45:
            com.google.android.gms.internal.ads.ar2 r0 = new com.google.android.gms.internal.ads.ar2     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r4.f15254d = r1     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.jr2 r1 = r4.f15251a     // Catch: java.lang.Throwable -> L63
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.jr2 r1 = r4.f15251a     // Catch: java.lang.Throwable -> L63
            h2.r4 r2 = r5.f16675a     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.f16676b     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.rr2 r3 = new com.google.android.gms.internal.ads.rr2     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r4)
            return
        L63:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tr2.Z3(com.google.android.gms.internal.ads.wb0):void");
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void a0(g3.a aVar) {
        a3.o.e("showAd must be called on the main UI thread.");
        if (this.f15254d != null) {
            Activity activity = null;
            if (aVar != null) {
                Object objH0 = g3.b.H0(aVar);
                if (objH0 instanceof Activity) {
                    activity = (Activity) objH0;
                }
            }
            this.f15254d.n(this.f15255e, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void c0(String str) {
        a3.o.e("setUserId must be called on the main UI thread.");
        this.f15253c.f11037a = str;
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void d2(pb0 pb0Var) {
        a3.o.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f15252b.J(pb0Var);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void e0(g3.a aVar) {
        a3.o.e("pause must be called on the main UI thread.");
        if (this.f15254d != null) {
            this.f15254d.d().B0(aVar == null ? null : (Context) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void i3(String str) {
        a3.o.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f15253c.f11038b = str;
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final Bundle k() {
        a3.o.e("getAdMetadata can only be called from the UI thread.");
        jm1 jm1Var = this.f15254d;
        return jm1Var != null ? jm1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized h2.m2 l() {
        if (!((Boolean) h2.y.c().b(ns.J6)).booleanValue()) {
            return null;
        }
        jm1 jm1Var = this.f15254d;
        if (jm1Var == null) {
            return null;
        }
        return jm1Var.c();
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void m() {
        G0(null);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void o() {
        e0(null);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized String p() {
        jm1 jm1Var = this.f15254d;
        if (jm1Var == null || jm1Var.c() == null) {
            return null;
        }
        return jm1Var.c().q();
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void p0(g3.a aVar) {
        a3.o.e("resume must be called on the main UI thread.");
        if (this.f15254d != null) {
            this.f15254d.d().C0(aVar == null ? null : (Context) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void t() {
        p0(null);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final synchronized void z() {
        a0(null);
    }
}
