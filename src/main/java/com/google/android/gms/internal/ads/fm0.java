package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public interface fm0 extends h2.a, hc1, vl0, d20, cn0, hn0, q20, tk, ln0, g2.l, on0, pn0, dj0, qn0 {
    void E0();

    qz2 F0();

    void G0(boolean z7);

    tn0 H();

    void H0(vn0 vn0Var);

    @Override // com.google.android.gms.internal.ads.nn0
    vn0 I();

    void I0(i2.s sVar);

    boolean J0();

    void K0(boolean z7);

    i2.s L();

    void L0(hv hvVar);

    i2.s M();

    void M0(kv kvVar);

    Context N();

    boolean N0(boolean z7, int i8);

    boolean O0();

    @Override // com.google.android.gms.internal.ads.cn0
    as2 P();

    void P0(boolean z7);

    @Override // com.google.android.gms.internal.ads.on0
    gh Q();

    void Q0(im imVar);

    void R0();

    boolean S0();

    @Override // com.google.android.gms.internal.ads.qn0
    View T();

    void T0(boolean z7);

    void U0(i2.s sVar);

    void V0(Context context);

    void W0(int i8);

    WebView X();

    boolean X0();

    void Y0(qz2 qz2Var);

    String Z0();

    void a1(boolean z7);

    void b1(String str, e3.n nVar);

    x3.d c();

    boolean c1();

    boolean canGoBack();

    @Override // com.google.android.gms.internal.ads.vl0
    wr2 d();

    void d1(wr2 wr2Var, as2 as2Var);

    void destroy();

    void e1(String str, qz qzVar);

    void f();

    void f1(String str, qz qzVar);

    @Override // com.google.android.gms.internal.ads.dj0
    void g(bn0 bn0Var);

    void g1(String str, String str2, String str3);

    @Override // com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.dj0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    WebViewClient h0();

    void h1(boolean z7);

    boolean i();

    void i1(int i8);

    void l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0();

    void measure(int i8, int i9);

    void n0();

    im o0();

    void onPause();

    void onResume();

    kv p0();

    void q0();

    @Override // com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.dj0
    Activity r();

    void r0();

    @Override // com.google.android.gms.internal.ads.dj0
    void setBackgroundColor(int i8);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.dj0
    g2.a t();

    @Override // com.google.android.gms.internal.ads.pn0, com.google.android.gms.internal.ads.dj0
    wg0 v();

    @Override // com.google.android.gms.internal.ads.dj0
    dt x();

    @Override // com.google.android.gms.internal.ads.dj0
    void y(String str, pk0 pk0Var);

    @Override // com.google.android.gms.internal.ads.dj0
    bn0 z();
}
