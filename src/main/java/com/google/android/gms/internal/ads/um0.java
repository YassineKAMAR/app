package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class um0 extends FrameLayout implements fm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f15768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ri0 f15769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f15770c;

    /* JADX WARN: Multi-variable type inference failed */
    public um0(fm0 fm0Var) {
        super(fm0Var.getContext());
        this.f15770c = new AtomicBoolean();
        this.f15768a = fm0Var;
        this.f15769b = new ri0(fm0Var.N(), this, this);
        addView((View) fm0Var);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void A(int i8) {
        this.f15769b.g(i8);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String B() {
        return this.f15768a.B();
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
        fm0 fm0Var = this.f15768a;
        if (fm0Var != null) {
            fm0Var.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void E() {
        this.f15768a.E();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void E0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(g2.t.t().e()));
        map.put("app_volume", String.valueOf(g2.t.t().a()));
        ym0 ym0Var = (ym0) this.f15768a;
        map.put("device_volume", String.valueOf(j2.d.b(ym0Var.getContext())));
        ym0Var.U("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final qz2 F0() {
        return this.f15768a.F0();
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void G(boolean z7, int i8, String str, boolean z8, boolean z9) {
        this.f15768a.G(z7, i8, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void G0(boolean z7) {
        this.f15768a.G0(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final tn0 H() {
        return ((ym0) this.f15768a).A0();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void H0(vn0 vn0Var) {
        this.f15768a.H0(vn0Var);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.nn0
    public final vn0 I() {
        return this.f15768a.I();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void I0(i2.s sVar) {
        this.f15768a.I0(sVar);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void J() {
        this.f15768a.J();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean J0() {
        return this.f15768a.J0();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void K(int i8) {
        this.f15768a.K(i8);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void K0(boolean z7) {
        this.f15768a.K0(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final i2.s L() {
        return this.f15768a.L();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void L0(hv hvVar) {
        this.f15768a.L0(hvVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final i2.s M() {
        return this.f15768a.M();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void M0(kv kvVar) {
        this.f15768a.M0(kvVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final Context N() {
        return this.f15768a.N();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean N0(boolean z7, int i8) {
        if (!this.f15770c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) h2.y.c().b(ns.K0)).booleanValue()) {
            return false;
        }
        if (this.f15768a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f15768a.getParent()).removeView((View) this.f15768a);
        }
        this.f15768a.N0(z7, i8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean O0() {
        return this.f15768a.O0();
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.cn0
    public final as2 P() {
        return this.f15768a.P();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void P0(boolean z7) {
        this.f15768a.P0(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.on0
    public final gh Q() {
        return this.f15768a.Q();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void Q0(im imVar) {
        this.f15768a.Q0(imVar);
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void R(String str, String str2, int i8) {
        this.f15768a.R(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void R0() {
        this.f15768a.R0();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean S0() {
        return this.f15768a.S0();
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.qn0
    public final View T() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void T0(boolean z7) {
        this.f15768a.T0(z7);
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final void U(String str, Map map) {
        this.f15768a.U(str, map);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void U0(i2.s sVar) {
        this.f15768a.U0(sVar);
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void V(i2.i iVar, boolean z7) {
        this.f15768a.V(iVar, z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void V0(Context context) {
        this.f15768a.V0(context);
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void W(boolean z7, int i8, String str, String str2, boolean z8) {
        this.f15768a.W(z7, i8, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void W0(int i8) {
        this.f15768a.W0(i8);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final WebView X() {
        return (WebView) this.f15768a;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean X0() {
        return this.f15768a.X0();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String Y() {
        return this.f15768a.Y();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void Y0(qz2 qz2Var) {
        this.f15768a.Y0(qz2Var);
    }

    @Override // h2.a
    public final void Z() {
        fm0 fm0Var = this.f15768a;
        if (fm0Var != null) {
            fm0Var.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final String Z0() {
        return this.f15768a.Z0();
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void a(String str) {
        ((ym0) this.f15768a).k1(str);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void a1(boolean z7) {
        this.f15768a.a1(z7);
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void b(String str, String str2) {
        this.f15768a.b("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        this.f15768a.b0(skVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void b1(String str, e3.n nVar) {
        this.f15768a.b1(str, nVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final x3.d c() {
        return this.f15768a.c();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final pk0 c0(String str) {
        return this.f15768a.c0(str);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean c1() {
        return this.f15770c.get();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean canGoBack() {
        return this.f15768a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.vl0
    public final wr2 d() {
        return this.f15768a.d();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void d1(wr2 wr2Var, as2 as2Var) {
        this.f15768a.d1(wr2Var, as2Var);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void destroy() {
        final qz2 qz2VarF0 = F0();
        if (qz2VarF0 == null) {
            this.f15768a.destroy();
            return;
        }
        e53 e53Var = j2.k2.f23991k;
        e53Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sm0
            @Override // java.lang.Runnable
            public final void run() {
                g2.t.a().e(qz2VarF0);
            }
        });
        final fm0 fm0Var = this.f15768a;
        fm0Var.getClass();
        e53Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.tm0
            @Override // java.lang.Runnable
            public final void run() {
                fm0Var.destroy();
            }
        }, ((Integer) h2.y.c().b(ns.T4)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final void e(String str, JSONObject jSONObject) {
        this.f15768a.e(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void e1(String str, qz qzVar) {
        this.f15768a.e1(str, qzVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void f() {
        this.f15768a.f();
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        fm0 fm0Var = this.f15768a;
        if (fm0Var != null) {
            fm0Var.f0();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void f1(String str, qz qzVar) {
        this.f15768a.f1(str, qzVar);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final void g(bn0 bn0Var) {
        this.f15768a.g(bn0Var);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void g1(String str, String str2, String str3) {
        this.f15768a.g1(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void goBack() {
        this.f15768a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void h(boolean z7) {
        this.f15768a.h(false);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final WebViewClient h0() {
        return this.f15768a.h0();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void h1(boolean z7) {
        this.f15768a.h1(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean i() {
        return this.f15768a.i();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void i1(int i8) {
        this.f15768a.i1(i8);
    }

    @Override // g2.l
    public final void j() {
        this.f15768a.j();
    }

    @Override // g2.l
    public final void k() {
        this.f15768a.k();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void k0(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void l0() {
        this.f15768a.l0();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void loadData(String str, String str2, String str3) {
        this.f15768a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f15768a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void loadUrl(String str) {
        this.f15768a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void m0() {
        TextView textView = new TextView(getContext());
        g2.t.r();
        textView.setText(j2.k2.Y());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final int n() {
        return this.f15768a.n();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void n0() {
        this.f15769b.e();
        this.f15768a.n0();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final int o() {
        return ((Boolean) h2.y.c().b(ns.H3)).booleanValue() ? this.f15768a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final im o0() {
        return this.f15768a.o0();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void onPause() {
        this.f15769b.f();
        this.f15768a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void onResume() {
        this.f15768a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final kv p0() {
        return this.f15768a.p0();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final int q() {
        return ((Boolean) h2.y.c().b(ns.H3)).booleanValue() ? this.f15768a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void q0() {
        setBackgroundColor(0);
        this.f15768a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.dj0
    public final Activity r() {
        return this.f15768a.r();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void r0() {
        this.f15768a.r0();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ct s() {
        return this.f15768a.s();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.fm0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15768a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.fm0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f15768a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f15768a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f15768a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final g2.a t() {
        return this.f15768a.t();
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void u0(boolean z7, int i8, boolean z8) {
        this.f15768a.u0(z7, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.pn0, com.google.android.gms.internal.ads.dj0
    public final wg0 v() {
        return this.f15768a.v();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void v0(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ri0 w() {
        return this.f15769b;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void w0(boolean z7, long j8) {
        this.f15768a.w0(z7, j8);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final dt x() {
        return this.f15768a.x();
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void x0(String str, JSONObject jSONObject) {
        ((ym0) this.f15768a).b(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final void y(String str, pk0 pk0Var) {
        this.f15768a.y(str, pk0Var);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final bn0 z() {
        return this.f15768a.z();
    }
}
