package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.e53;
import com.google.android.gms.internal.ads.ns;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
final class ym0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, fm0 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f17816l0 = 0;
    private boolean A;
    private kv B;
    private hv C;
    private im D;
    private int E;
    private int F;
    private ct G;
    private final ct H;
    private ct I;
    private final dt W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final un0 f17817a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f17818a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gh f17819b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private i2.s f17820b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt f17821c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f17822c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f17823d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final j2.t1 f17824d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g2.l f17825e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f17826e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g2.a f17827f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f17828f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DisplayMetrics f17829g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f17830g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f17831h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f17832h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private wr2 f17833i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map f17834i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private as2 f17835j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final WindowManager f17836j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17837k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final vn f17838k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mm0 f17840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i2.s f17841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private qz2 f17842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private vn0 f17843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f17844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f17849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f17851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private bn0 f17852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17853z;

    protected ym0(un0 un0Var, vn0 vn0Var, String str, boolean z7, boolean z8, gh ghVar, rt rtVar, wg0 wg0Var, gt gtVar, g2.l lVar, g2.a aVar, vn vnVar, wr2 wr2Var, as2 as2Var) {
        as2 as2Var2;
        super(un0Var);
        this.f17837k = false;
        this.f17839l = false;
        this.f17850w = true;
        this.f17851x = "";
        this.f17826e0 = -1;
        this.f17828f0 = -1;
        this.f17830g0 = -1;
        this.f17832h0 = -1;
        this.f17817a = un0Var;
        this.f17843p = vn0Var;
        this.f17844q = str;
        this.f17847t = z7;
        this.f17819b = ghVar;
        this.f17821c = rtVar;
        this.f17823d = wg0Var;
        this.f17825e = lVar;
        this.f17827f = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f17836j0 = windowManager;
        g2.t.r();
        DisplayMetrics displayMetricsT = j2.k2.T(windowManager);
        this.f17829g = displayMetricsT;
        this.f17831h = displayMetricsT.density;
        this.f17838k0 = vnVar;
        this.f17833i = wr2Var;
        this.f17835j = as2Var;
        this.f17824d0 = new j2.t1(un0Var.a(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e8) {
            qg0.e("Unable to enable Javascript.", e8);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) h2.y.c().b(ns.Da)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(g2.t.r().D(un0Var, wg0Var.f16723a));
        g2.t.r();
        final Context context = getContext();
        j2.k1.a(context, new Callable() { // from class: j2.b2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e53 e53Var = k2.f23991k;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) h2.y.c().b(ns.J0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        o1();
        addJavascriptInterface(new gn0(this, new fn0(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        w1();
        dt dtVar = new dt(new gt(true, "make_wv", this.f17844q));
        this.W = dtVar;
        dtVar.a().c(null);
        if (((Boolean) h2.y.c().b(ns.O1)).booleanValue() && (as2Var2 = this.f17835j) != null && as2Var2.f5462b != null) {
            dtVar.a().d("gqi", this.f17835j.f5462b);
        }
        dtVar.a();
        ct ctVarF = gt.f();
        this.H = ctVarF;
        dtVar.b("native:view_create", ctVarF);
        this.I = null;
        this.G = null;
        j2.n1.a().b(un0Var);
        g2.t.q().r();
    }

    private final synchronized void o1() {
        wr2 wr2Var = this.f17833i;
        if (wr2Var != null && wr2Var.f16894o0) {
            qg0.b("Disabling hardware acceleration on an overlay.");
            q1();
            return;
        }
        if (!this.f17847t && !this.f17843p.i()) {
            qg0.b("Enabling hardware acceleration on an AdView.");
            s1();
            return;
        }
        qg0.b("Enabling hardware acceleration on an overlay.");
        s1();
    }

    private final synchronized void p1() {
        if (this.f17822c0) {
            return;
        }
        this.f17822c0 = true;
        g2.t.q().q();
    }

    private final synchronized void q1() {
        if (!this.f17848u) {
            setLayerType(1, null);
        }
        this.f17848u = true;
    }

    private final void r1(boolean z7) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z7 ? "0" : "1");
        U("onAdVisibilityChanged", map);
    }

    private final synchronized void s1() {
        if (this.f17848u) {
            setLayerType(0, null);
        }
        this.f17848u = false;
    }

    private final synchronized void t1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            g2.t.q().u(th, "AdWebViewImpl.loadUrlUnsafe");
            qg0.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void u1() {
        xs.a(this.W.a(), this.H, "aeh2");
    }

    private final synchronized void v1() {
        Map map = this.f17834i0;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((pk0) it.next()).release();
            }
        }
        this.f17834i0 = null;
    }

    private final void w1() {
        dt dtVar = this.W;
        if (dtVar == null) {
            return;
        }
        gt gtVarA = dtVar.a();
        vs vsVarF = g2.t.q().f();
        if (vsVarF != null) {
            vsVarF.f(gtVarA);
        }
    }

    private final synchronized void x1() {
        Boolean boolK = g2.t.q().k();
        this.f17849v = boolK;
        if (boolK == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m1(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void A(int i8) {
    }

    public final mm0 A0() {
        return this.f17840m;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized String B() {
        as2 as2Var = this.f17835j;
        if (as2Var == null) {
            return null;
        }
        return as2Var.f5462b;
    }

    final synchronized Boolean B0() {
        return this.f17849v;
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void E() {
        i2.s sVarL = L();
        if (sVarL != null) {
            sVarL.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void E0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized qz2 F0() {
        return this.f17842o;
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void G(boolean z7, int i8, String str, boolean z8, boolean z9) {
        this.f17840m.d0(z7, i8, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void G0(boolean z7) {
        i2.s sVar = this.f17841n;
        if (sVar != null) {
            sVar.Y5(this.f17840m.p0(), z7);
        } else {
            this.f17845r = z7;
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final /* synthetic */ tn0 H() {
        return this.f17840m;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void H0(vn0 vn0Var) {
        this.f17843p = vn0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.nn0
    public final synchronized vn0 I() {
        return this.f17843p;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void I0(i2.s sVar) {
        this.f17841n = sVar;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized void J() {
        hv hvVar = this.C;
        if (hvVar != null) {
            final uk1 uk1Var = (uk1) hvVar;
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sk1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        uk1Var.p();
                    } catch (RemoteException e8) {
                        qg0.i("#007 Could not call remote method.", e8);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized boolean J0() {
        return this.E > 0;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized void K(int i8) {
        this.f17818a0 = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.fm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void K0(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            i2.s r0 = r1.f17841n     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.Q5(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym0.K0(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized i2.s L() {
        return this.f17841n;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void L0(hv hvVar) {
        this.C = hvVar;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized i2.s M() {
        return this.f17820b0;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void M0(kv kvVar) {
        this.B = kvVar;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final Context N() {
        return this.f17817a.b();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean N0(final boolean z7, final int i8) {
        destroy();
        this.f17838k0.b(new un() { // from class: com.google.android.gms.internal.ads.vm0
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                int i9 = ym0.f17816l0;
                tr trVarM = ur.M();
                boolean zW = trVarM.w();
                boolean z8 = z7;
                if (zW != z8) {
                    trVarM.u(z8);
                }
                trVarM.v(i8);
                lpVar.D((ur) trVarM.q());
            }
        });
        this.f17838k0.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized boolean O0() {
        return this.f17850w;
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.cn0
    public final as2 P() {
        return this.f17835j;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void P0(boolean z7) {
        this.f17840m.O(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.on0
    public final gh Q() {
        return this.f17819b;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void Q0(im imVar) {
        this.D = imVar;
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void R(String str, String str2, int i8) {
        this.f17840m.W(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void R0() {
        u1();
        HashMap map = new HashMap(1);
        map.put("version", this.f17823d.f16723a);
        U("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized boolean S0() {
        return this.f17845r;
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.qn0
    public final View T() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void T0(boolean z7) {
        i2.s sVar;
        int i8 = this.E + (true != z7 ? -1 : 1);
        this.E = i8;
        if (i8 > 0 || (sVar = this.f17841n) == null) {
            return;
        }
        sVar.N();
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final void U(String str, Map map) {
        try {
            e(str, h2.v.b().m(map));
        } catch (JSONException unused) {
            qg0.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void U0(i2.s sVar) {
        this.f17820b0 = sVar;
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void V(i2.i iVar, boolean z7) {
        this.f17840m.V(iVar, z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void V0(Context context) {
        this.f17817a.setBaseContext(context);
        this.f17824d0.e(this.f17817a.a());
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void W(boolean z7, int i8, String str, String str2, boolean z8) {
        this.f17840m.c0(z7, i8, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void W0(int i8) {
        i2.s sVar = this.f17841n;
        if (sVar != null) {
            sVar.P5(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final WebView X() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized boolean X0() {
        return this.f17847t;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized String Y() {
        return this.f17851x;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void Y0(qz2 qz2Var) {
        this.f17842o = qz2Var;
    }

    @Override // h2.a
    public final void Z() {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized String Z0() {
        return this.f17844q;
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void a(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void a1(boolean z7) {
        this.f17850w = z7;
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void b(String str, String str2) {
        k1(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        boolean z7;
        synchronized (this) {
            z7 = skVar.f14729j;
            this.f17853z = z7;
        }
        r1(z7);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void b1(String str, e3.n nVar) {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.e(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final x3.d c() {
        rt rtVar = this.f17821c;
        return rtVar == null ? zf3.h(null) : rtVar.a();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized pk0 c0(String str) {
        Map map = this.f17834i0;
        if (map == null) {
            return null;
        }
        return (pk0) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final boolean c1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.vl0
    public final wr2 d() {
        return this.f17833i;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void d1(wr2 wr2Var, as2 as2Var) {
        this.f17833i = wr2Var;
        this.f17835j = as2Var;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final synchronized void destroy() {
        w1();
        this.f17824d0.a();
        i2.s sVar = this.f17841n;
        if (sVar != null) {
            sVar.k();
            this.f17841n.x();
            this.f17841n = null;
        }
        this.f17842o = null;
        this.f17840m.K();
        this.D = null;
        this.f17825e = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.f17846s) {
            return;
        }
        g2.t.A().i(this);
        v1();
        this.f17846s = true;
        if (!((Boolean) h2.y.c().b(ns.V9)).booleanValue()) {
            j2.v1.k("Destroying the WebView immediately...");
            n0();
        } else {
            j2.v1.k("Initiating WebView self destruct sequence in 3...");
            j2.v1.k("Loading blank page in WebView, 2...");
            t1("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        qg0.b("Dispatching AFMA event: ".concat(sb.toString()));
        k1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void e1(String str, qz qzVar) {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.b(str, qzVar);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!i()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        qg0.i("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void f() {
        if (this.I == null) {
            this.W.a();
            ct ctVarF = gt.f();
            this.I = ctVarF;
            this.W.b("native:view_load", ctVarF);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.f0();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void f1(String str, qz qzVar) {
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null) {
            mm0Var.e0(str, qzVar);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f17846s) {
                    this.f17840m.K();
                    g2.t.A().i(this);
                    v1();
                    p1();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final synchronized void g(bn0 bn0Var) {
        if (this.f17852y != null) {
            qg0.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f17852y = bn0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void g1(String str, String str2, String str3) {
        String str4;
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) h2.y.c().b(ns.P);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put(com.amazon.a.a.o.b.I, "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e8) {
            qg0.h("Unable to build MRAID_ENV", e8);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, mn0.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void h(boolean z7) {
        this.f17840m.a(false);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final WebViewClient h0() {
        return this.f17840m;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void h1(boolean z7) {
        boolean z8 = this.f17847t;
        this.f17847t = z7;
        o1();
        if (z7 != z8) {
            if (!((Boolean) h2.y.c().b(ns.Q)).booleanValue() || !this.f17843p.i()) {
                new a80(this, "").g(true != z7 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized boolean i() {
        return this.f17846s;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void i1(int i8) {
        if (i8 == 0) {
            dt dtVar = this.W;
            xs.a(dtVar.a(), this.H, "aebb2");
        }
        u1();
        this.W.a();
        this.W.a().d("close_type", String.valueOf(i8));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i8));
        map.put("version", this.f17823d.f16723a);
        U("onhide", map);
    }

    @Override // g2.l
    public final synchronized void j() {
        g2.l lVar = this.f17825e;
        if (lVar != null) {
            lVar.j();
        }
    }

    protected final synchronized void j1(String str, ValueCallback valueCallback) {
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // g2.l
    public final synchronized void k() {
        g2.l lVar = this.f17825e;
        if (lVar != null) {
            lVar.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void k0(int i8) {
    }

    protected final void k1(String str) {
        if (!e3.m.d()) {
            l1("javascript:".concat(str));
            return;
        }
        if (B0() == null) {
            x1();
        }
        if (B0().booleanValue()) {
            j1(str, null);
        } else {
            l1("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void l0() {
        if (this.G == null) {
            dt dtVar = this.W;
            xs.a(dtVar.a(), this.H, "aes2");
            this.W.a();
            ct ctVarF = gt.f();
            this.G = ctVarF;
            this.W.b("native:view_show", ctVarF);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f17823d.f16723a);
        U("onshow", map);
    }

    protected final synchronized void l1(String str) {
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final synchronized void loadUrl(String str) {
        if (i()) {
            qg0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            g2.t.q().u(th, "AdWebViewImpl.loadUrl");
            qg0.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void m0() {
        throw null;
    }

    final void m1(Boolean bool) {
        synchronized (this) {
            this.f17849v = bool;
        }
        g2.t.q().v(bool);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final synchronized int n() {
        return this.f17818a0;
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized void n0() {
        j2.v1.k("Destroying WebView!");
        p1();
        j2.k2.f23991k.post(new xm0(this));
    }

    public final boolean n1() {
        int i8;
        int iZ;
        if (!this.f17840m.p0() && !this.f17840m.j()) {
            return false;
        }
        h2.v.b();
        DisplayMetrics displayMetrics = this.f17829g;
        int iZ2 = jg0.z(displayMetrics, displayMetrics.widthPixels);
        h2.v.b();
        DisplayMetrics displayMetrics2 = this.f17829g;
        int iZ3 = jg0.z(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityA = this.f17817a.a();
        if (activityA == null || activityA.getWindow() == null) {
            i8 = iZ2;
            iZ = iZ3;
        } else {
            g2.t.r();
            int[] iArrP = j2.k2.p(activityA);
            h2.v.b();
            int iZ4 = jg0.z(this.f17829g, iArrP[0]);
            h2.v.b();
            iZ = jg0.z(this.f17829g, iArrP[1]);
            i8 = iZ4;
        }
        int i9 = this.f17828f0;
        if (i9 == iZ2 && this.f17826e0 == iZ3 && this.f17830g0 == i8 && this.f17832h0 == iZ) {
            return false;
        }
        boolean z7 = (i9 == iZ2 && this.f17826e0 == iZ3) ? false : true;
        this.f17828f0 = iZ2;
        this.f17826e0 = iZ3;
        this.f17830g0 = i8;
        this.f17832h0 = iZ;
        new a80(this, "").e(iZ2, iZ3, i8, iZ, this.f17829g.density, this.f17836j0.getDefaultDisplay().getRotation());
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final int o() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized im o0() {
        return this.D;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!i()) {
            this.f17824d0.c();
        }
        boolean z7 = this.f17853z;
        mm0 mm0Var = this.f17840m;
        if (mm0Var != null && mm0Var.j()) {
            if (!this.A) {
                this.f17840m.A();
                this.f17840m.B();
                this.A = true;
            }
            n1();
            z7 = true;
        }
        r1(z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        mm0 mm0Var;
        synchronized (this) {
            if (!i()) {
                this.f17824d0.d();
            }
            super.onDetachedFromWindow();
            if (this.A && (mm0Var = this.f17840m) != null && mm0Var.j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f17840m.A();
                this.f17840m.B();
                this.A = false;
            }
        }
        r1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) h2.y.c().b(ns.fa)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            g2.t.r();
            j2.k2.s(getContext(), intent);
        } catch (ActivityNotFoundException e8) {
            qg0.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            g2.t.q().u(e8, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (i()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zN1 = n1();
        i2.s sVarL = L();
        if (sVarL == null || !zN1) {
            return;
        }
        sVarL.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym0.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final void onPause() {
        if (i()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e8) {
            qg0.e("Could not pause webview.", e8);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final void onResume() {
        if (i()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e8) {
            qg0.e("Could not resume webview.", e8);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f17840m.j() || this.f17840m.h()) {
            gh ghVar = this.f17819b;
            if (ghVar != null) {
                ghVar.d(motionEvent);
            }
            rt rtVar = this.f17821c;
            if (rtVar != null) {
                rtVar.b(motionEvent);
            }
        } else {
            synchronized (this) {
                kv kvVar = this.B;
                if (kvVar != null) {
                    kvVar.a(motionEvent);
                }
            }
        }
        if (i()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final synchronized kv p0() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final int q() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void q0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.dj0
    public final Activity r() {
        return this.f17817a.a();
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void r0() {
        this.f17824d0.b();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ct s() {
        return this.H;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fm0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof mm0) {
            this.f17840m = (mm0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (i()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e8) {
            qg0.e("Could not stop loading webview.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final g2.a t() {
        return this.f17827f;
    }

    @Override // com.google.android.gms.internal.ads.ln0
    public final void u0(boolean z7, int i8, boolean z8) {
        this.f17840m.Y(z7, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.pn0, com.google.android.gms.internal.ads.dj0
    public final wg0 v() {
        return this.f17823d;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void v0(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ri0 w() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void w0(boolean z7, long j8) {
        HashMap map = new HashMap(2);
        map.put("success", true != z7 ? "0" : "1");
        map.put("duration", Long.toString(j8));
        U("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final dt x() {
        return this.W;
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void x0(String str, JSONObject jSONObject) {
        b(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final synchronized void y(String str, pk0 pk0Var) {
        if (this.f17834i0 == null) {
            this.f17834i0 = new HashMap();
        }
        this.f17834i0.put(str, pk0Var);
    }

    @Override // com.google.android.gms.internal.ads.fm0, com.google.android.gms.internal.ads.dj0
    public final synchronized bn0 z() {
        return this.f17852y;
    }
}
