package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n00 f10247a;

    kr1(n00 n00Var) {
        this.f10247a = n00Var;
    }

    private final void s(jr1 jr1Var) {
        String strA = jr1.a(jr1Var);
        qg0.f("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f10247a.c(strA);
    }

    public final void a() {
        s(new jr1("initialize", null));
    }

    public final void b(long j8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdClicked";
        this.f10247a.c(jr1.a(jr1Var));
    }

    public final void c(long j8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdClosed";
        s(jr1Var);
    }

    public final void d(long j8, int i8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdFailedToLoad";
        jr1Var.f9760d = Integer.valueOf(i8);
        s(jr1Var);
    }

    public final void e(long j8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdLoaded";
        s(jr1Var);
    }

    public final void f(long j8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onNativeAdObjectNotAvailable";
        s(jr1Var);
    }

    public final void g(long j8) {
        jr1 jr1Var = new jr1("interstitial", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdOpened";
        s(jr1Var);
    }

    public final void h(long j8) {
        jr1 jr1Var = new jr1("creation", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "nativeObjectCreated";
        s(jr1Var);
    }

    public final void i(long j8) {
        jr1 jr1Var = new jr1("creation", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "nativeObjectNotCreated";
        s(jr1Var);
    }

    public final void j(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdClicked";
        s(jr1Var);
    }

    public final void k(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onRewardedAdClosed";
        s(jr1Var);
    }

    public final void l(long j8, fc0 fc0Var) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onUserEarnedReward";
        jr1Var.f9761e = fc0Var.n();
        jr1Var.f9762f = Integer.valueOf(fc0Var.m());
        s(jr1Var);
    }

    public final void m(long j8, int i8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onRewardedAdFailedToLoad";
        jr1Var.f9760d = Integer.valueOf(i8);
        s(jr1Var);
    }

    public final void n(long j8, int i8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onRewardedAdFailedToShow";
        jr1Var.f9760d = Integer.valueOf(i8);
        s(jr1Var);
    }

    public final void o(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onAdImpression";
        s(jr1Var);
    }

    public final void p(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onRewardedAdLoaded";
        s(jr1Var);
    }

    public final void q(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onNativeAdObjectNotAvailable";
        s(jr1Var);
    }

    public final void r(long j8) {
        jr1 jr1Var = new jr1("rewarded", null);
        jr1Var.f9757a = Long.valueOf(j8);
        jr1Var.f9759c = "onRewardedAdOpened";
        s(jr1Var);
    }
}
