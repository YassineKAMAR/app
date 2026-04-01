package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements a2.e, f71, h2.a, g41, b51, c51, v51, j41, cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rq1 f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6874c;

    public dr1(rq1 rq1Var, bo0 bo0Var) {
        this.f6873b = rq1Var;
        this.f6872a = Collections.singletonList(bo0Var);
    }

    private final void E(Class cls, String str, Object... objArr) {
        this.f6873b.a(this.f6872a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        E(j41.class, "onAdFailedToLoad", Integer.valueOf(z2Var.f22383a), z2Var.f22384b, z2Var.f22385c);
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        j2.v1.k("Ad Request Latency : " + (g2.t.b().b() - this.f6874c));
        E(v51.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void C(vw2 vw2Var, String str) {
        E(uw2.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void D(Context context) {
        E(c51.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
    }

    @Override // h2.a
    public final void Z() {
        E(h2.a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(ob0 ob0Var, String str, String str2) {
        E(g41.class, "onRewarded", ob0Var, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void b(Context context) {
        E(c51.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void e(vw2 vw2Var, String str) {
        E(uw2.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
        this.f6874c = g2.t.b().b();
        E(f71.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void h(vw2 vw2Var, String str) {
        E(uw2.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
        E(g41.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
        E(g41.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
        E(g41.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
        E(g41.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
        E(g41.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void o(vw2 vw2Var, String str, Throwable th) {
        E(uw2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void q(Context context) {
        E(c51.class, "onDestroy", context);
    }

    @Override // a2.e
    public final void w(String str, String str2) {
        E(a2.e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        E(b51.class, "onAdImpression", new Object[0]);
    }
}
