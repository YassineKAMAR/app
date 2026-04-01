package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class mm0 extends WebViewClient implements tn0 {
    public static final /* synthetic */ int F = 0;
    private int A;
    private boolean B;
    private final b22 D;
    private View.OnAttachStateChangeListener E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f11384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vn f11385b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h2.a f11388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i2.u f11389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private rn0 f11390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sn0 f11391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ey f11392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private hy f11393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private hc1 f11394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11396m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private i2.f0 f11403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private z70 f11404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g2.b f11405v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected nd0 f11407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11408y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11409z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f11386c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f11387d = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11397n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f11398o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f11399p = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private u70 f11406w = null;
    private final HashSet C = new HashSet(Arrays.asList(((String) h2.y.c().b(ns.A5)).split(com.amazon.a.a.o.b.f.f3942a)));

    public mm0(fm0 fm0Var, vn vnVar, boolean z7, z70 z70Var, u70 u70Var, b22 b22Var) {
        this.f11385b = vnVar;
        this.f11384a = fm0Var;
        this.f11400q = z7;
        this.f11404u = z70Var;
        this.D = b22Var;
    }

    private static WebResourceResponse k() {
        if (((Boolean) h2.y.c().b(ns.I0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        g2.t.r();
        g2.t.r();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        g2.t.r();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        if (r14.length != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if (r0 >= r14.length) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
    
        r1 = r14[r0].trim().split(com.amazon.a.a.o.b.f.f3943b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r1.length <= 1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0171, code lost:
    
        if (r14.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        if (r0.getKey() == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0183, code lost:
    
        if (r0.getValue() == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018f, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0191, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01be, code lost:
    
        return g2.t.s().c(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse l(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm0.l(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Map map, List list, String str) {
        if (j2.v1.m()) {
            j2.v1.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                j2.v1.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qz) it.next()).a(this.f11384a, map);
        }
    }

    private final void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.E;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f11384a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final View view, final nd0 nd0Var, final int i8) {
        if (!nd0Var.r() || i8 <= 0) {
            return;
        }
        nd0Var.b(view);
        if (nd0Var.r()) {
            j2.k2.f23991k.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.gm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8391a.U(view, nd0Var, i8);
                }
            }, 100L);
        }
    }

    private static final boolean q(fm0 fm0Var) {
        if (fm0Var.d() != null) {
            return fm0Var.d().f16886k0;
        }
        return false;
    }

    private static final boolean w(boolean z7, fm0 fm0Var) {
        return (!z7 || fm0Var.I().i() || fm0Var.Z0().equals("interstitial_mb")) ? false : true;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener A() {
        synchronized (this.f11387d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener B() {
        synchronized (this.f11387d) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void C() {
        hc1 hc1Var = this.f11394k;
        if (hc1Var != null) {
            hc1Var.C();
        }
    }

    protected final WebResourceResponse D(String str, Map map) {
        en enVarB;
        try {
            String strC = ve0.c(str, this.f11384a.getContext(), this.B);
            if (!strC.equals(str)) {
                return l(strC, map);
            }
            hn hnVarG = hn.g(Uri.parse(str));
            if (hnVarG != null && (enVarB = g2.t.e().b(hnVarG)) != null && enVarB.u()) {
                return new WebResourceResponse("", "", enVarB.n());
            }
            if (pg0.k() && ((Boolean) eu.f7502b.e()).booleanValue()) {
                return l(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e8) {
            g2.t.q().u(e8, "AdWebViewClient.interceptRequest");
            return k();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void F(sn0 sn0Var) {
        this.f11391h = sn0Var;
    }

    public final void J() {
        if (this.f11390g != null && ((this.f11408y && this.A <= 0) || this.f11409z || this.f11396m)) {
            if (((Boolean) h2.y.c().b(ns.O1)).booleanValue() && this.f11384a.x() != null) {
                xs.a(this.f11384a.x().a(), this.f11384a.s(), "awfllc");
            }
            rn0 rn0Var = this.f11390g;
            boolean z7 = false;
            if (!this.f11409z && !this.f11396m) {
                z7 = true;
            }
            rn0Var.a(z7, this.f11397n, this.f11398o, this.f11399p);
            this.f11390g = null;
        }
        this.f11384a.f();
    }

    public final void K() {
        nd0 nd0Var = this.f11407x;
        if (nd0Var != null) {
            nd0Var.m();
            this.f11407x = null;
        }
        n();
        synchronized (this.f11387d) {
            this.f11386c.clear();
            this.f11388e = null;
            this.f11389f = null;
            this.f11390g = null;
            this.f11391h = null;
            this.f11392i = null;
            this.f11393j = null;
            this.f11395l = false;
            this.f11400q = false;
            this.f11401r = false;
            this.f11403t = null;
            this.f11405v = null;
            this.f11404u = null;
            u70 u70Var = this.f11406w;
            if (u70Var != null) {
                u70Var.h(true);
                this.f11406w = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void N() {
        synchronized (this.f11387d) {
            this.f11395l = false;
            this.f11400q = true;
            eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8827a.R();
                }
            });
        }
    }

    public final void O(boolean z7) {
        this.B = z7;
    }

    final /* synthetic */ void R() {
        this.f11384a.r0();
        i2.s sVarL = this.f11384a.L();
        if (sVarL != null) {
            sVarL.W();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void S(h2.a aVar, ey eyVar, i2.u uVar, hy hyVar, i2.f0 f0Var, boolean z7, sz szVar, g2.b bVar, b80 b80Var, nd0 nd0Var, final q12 q12Var, final jz2 jz2Var, eq1 eq1Var, mx2 mx2Var, k00 k00Var, final hc1 hc1Var, j00 j00Var, c00 c00Var, final gv0 gv0Var) {
        qz qzVar;
        g2.b bVar2 = bVar == null ? new g2.b(this.f11384a.getContext(), nd0Var, null) : bVar;
        this.f11406w = new u70(this.f11384a, b80Var);
        this.f11407x = nd0Var;
        if (((Boolean) h2.y.c().b(ns.Q0)).booleanValue()) {
            e0("/adMetadata", new dy(eyVar));
        }
        if (hyVar != null) {
            e0("/appEvent", new gy(hyVar));
        }
        e0("/backButton", pz.f13208j);
        e0("/refresh", pz.f13209k);
        e0("/canOpenApp", pz.f13200b);
        e0("/canOpenURLs", pz.f13199a);
        e0("/canOpenIntents", pz.f13201c);
        e0("/close", pz.f13202d);
        e0("/customClose", pz.f13203e);
        e0("/instrument", pz.f13212n);
        e0("/delayPageLoaded", pz.f13214p);
        e0("/delayPageClosed", pz.f13215q);
        e0("/getLocationInfo", pz.f13216r);
        e0("/log", pz.f13205g);
        e0("/mraid", new wz(bVar2, this.f11406w, b80Var));
        z70 z70Var = this.f11404u;
        if (z70Var != null) {
            e0("/mraidLoaded", z70Var);
        }
        g2.b bVar3 = bVar2;
        e0("/open", new b00(bVar2, this.f11406w, q12Var, eq1Var, mx2Var, gv0Var));
        e0("/precache", new qk0());
        e0("/touch", pz.f13207i);
        e0("/video", pz.f13210l);
        e0("/videoMeta", pz.f13211m);
        if (q12Var == null || jz2Var == null) {
            e0("/click", new ny(hc1Var, gv0Var));
            qzVar = pz.f13204f;
        } else {
            e0("/click", new qz() { // from class: com.google.android.gms.internal.ads.zs2
                @Override // com.google.android.gms.internal.ads.qz
                public final void a(Object obj, Map map) {
                    fm0 fm0Var = (fm0) obj;
                    pz.c(map, hc1Var);
                    String str = (String) map.get("u");
                    if (str == null) {
                        qg0.g("URL missing from click GMSG.");
                        return;
                    }
                    q12 q12Var2 = q12Var;
                    jz2 jz2Var2 = jz2Var;
                    zf3.r(pz.a(fm0Var, str), new bt2(fm0Var, gv0Var, jz2Var2, q12Var2), eh0.f7322a);
                }
            });
            qzVar = new qz() { // from class: com.google.android.gms.internal.ads.at2
                @Override // com.google.android.gms.internal.ads.qz
                public final void a(Object obj, Map map) {
                    vl0 vl0Var = (vl0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        qg0.g("URL missing from httpTrack GMSG.");
                    } else if (vl0Var.d().f16886k0) {
                        q12Var.h(new s12(g2.t.b().a(), ((cn0) vl0Var).P().f5462b, str, 2));
                    } else {
                        jz2Var.c(str, null);
                    }
                }
            };
        }
        e0("/httpTrack", qzVar);
        if (g2.t.p().z(this.f11384a.getContext())) {
            e0("/logScionEvent", new vz(this.f11384a.getContext()));
        }
        if (szVar != null) {
            e0("/setInterstitialProperties", new rz(szVar));
        }
        if (k00Var != null) {
            if (((Boolean) h2.y.c().b(ns.F8)).booleanValue()) {
                e0("/inspectorNetworkExtras", k00Var);
            }
        }
        if (((Boolean) h2.y.c().b(ns.Y8)).booleanValue() && j00Var != null) {
            e0("/shareSheet", j00Var);
        }
        if (((Boolean) h2.y.c().b(ns.d9)).booleanValue() && c00Var != null) {
            e0("/inspectorOutOfContextTest", c00Var);
        }
        if (((Boolean) h2.y.c().b(ns.xa)).booleanValue()) {
            e0("/bindPlayStoreOverlay", pz.f13219u);
            e0("/presentPlayStoreOverlay", pz.f13220v);
            e0("/expandPlayStoreOverlay", pz.f13221w);
            e0("/collapsePlayStoreOverlay", pz.f13222x);
            e0("/closePlayStoreOverlay", pz.f13223y);
        }
        if (((Boolean) h2.y.c().b(ns.X2)).booleanValue()) {
            e0("/setPAIDPersonalizationEnabled", pz.A);
            e0("/resetPAID", pz.f13224z);
        }
        if (((Boolean) h2.y.c().b(ns.Pa)).booleanValue()) {
            fm0 fm0Var = this.f11384a;
            if (fm0Var.d() != null && fm0Var.d().f16902s0) {
                e0("/writeToLocalStorage", pz.B);
                e0("/clearLocalStorageKeys", pz.C);
            }
        }
        this.f11388e = aVar;
        this.f11389f = uVar;
        this.f11392i = eyVar;
        this.f11393j = hyVar;
        this.f11403t = f0Var;
        this.f11405v = bVar3;
        this.f11394k = hc1Var;
        this.f11395l = z7;
    }

    final /* synthetic */ void U(View view, nd0 nd0Var, int i8) {
        o(view, nd0Var, i8 - 1);
    }

    public final void V(i2.i iVar, boolean z7) {
        fm0 fm0Var = this.f11384a;
        boolean zX0 = fm0Var.X0();
        boolean zW = w(zX0, fm0Var);
        boolean z8 = true;
        if (!zW && z7) {
            z8 = false;
        }
        h2.a aVar = zW ? null : this.f11388e;
        i2.u uVar = zX0 ? null : this.f11389f;
        i2.f0 f0Var = this.f11403t;
        fm0 fm0Var2 = this.f11384a;
        b0(new AdOverlayInfoParcel(iVar, aVar, uVar, f0Var, fm0Var2.v(), fm0Var2, z8 ? null : this.f11394k));
    }

    public final void W(String str, String str2, int i8) {
        b22 b22Var = this.D;
        fm0 fm0Var = this.f11384a;
        b0(new AdOverlayInfoParcel(fm0Var, fm0Var.v(), str, str2, 14, b22Var));
    }

    public final void Y(boolean z7, int i8, boolean z8) {
        fm0 fm0Var = this.f11384a;
        boolean zW = w(fm0Var.X0(), fm0Var);
        boolean z9 = true;
        if (!zW && z8) {
            z9 = false;
        }
        h2.a aVar = zW ? null : this.f11388e;
        i2.u uVar = this.f11389f;
        i2.f0 f0Var = this.f11403t;
        fm0 fm0Var2 = this.f11384a;
        b0(new AdOverlayInfoParcel(aVar, uVar, f0Var, fm0Var2, z7, i8, fm0Var2.v(), z9 ? null : this.f11394k, q(this.f11384a) ? this.D : null));
    }

    @Override // h2.a
    public final void Z() {
        h2.a aVar = this.f11388e;
        if (aVar != null) {
            aVar.Z();
        }
    }

    public final void a(boolean z7) {
        this.f11395l = false;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void a0(boolean z7) {
        synchronized (this.f11387d) {
            this.f11401r = true;
        }
    }

    public final void b(String str, qz qzVar) {
        synchronized (this.f11387d) {
            List list = (List) this.f11386c.get(str);
            if (list == null) {
                return;
            }
            list.remove(qzVar);
        }
    }

    public final void b0(AdOverlayInfoParcel adOverlayInfoParcel) {
        i2.i iVar;
        u70 u70Var = this.f11406w;
        boolean zL = u70Var != null ? u70Var.l() : false;
        g2.t.k();
        i2.t.a(this.f11384a.getContext(), adOverlayInfoParcel, !zL);
        nd0 nd0Var = this.f11407x;
        if (nd0Var != null) {
            String str = adOverlayInfoParcel.f4735l;
            if (str == null && (iVar = adOverlayInfoParcel.f4724a) != null) {
                str = iVar.f22498b;
            }
            nd0Var.d0(str);
        }
    }

    public final void c0(boolean z7, int i8, String str, String str2, boolean z8) {
        fm0 fm0Var = this.f11384a;
        boolean zX0 = fm0Var.X0();
        boolean zW = w(zX0, fm0Var);
        boolean z9 = true;
        if (!zW && z8) {
            z9 = false;
        }
        h2.a aVar = zW ? null : this.f11388e;
        lm0 lm0Var = zX0 ? null : new lm0(this.f11384a, this.f11389f);
        ey eyVar = this.f11392i;
        hy hyVar = this.f11393j;
        i2.f0 f0Var = this.f11403t;
        fm0 fm0Var2 = this.f11384a;
        b0(new AdOverlayInfoParcel(aVar, lm0Var, eyVar, hyVar, f0Var, fm0Var2, z7, i8, str, str2, fm0Var2.v(), z9 ? null : this.f11394k, q(this.f11384a) ? this.D : null));
    }

    public final void d0(boolean z7, int i8, String str, boolean z8, boolean z9) {
        fm0 fm0Var = this.f11384a;
        boolean zX0 = fm0Var.X0();
        boolean zW = w(zX0, fm0Var);
        boolean z10 = true;
        if (!zW && z8) {
            z10 = false;
        }
        h2.a aVar = zW ? null : this.f11388e;
        lm0 lm0Var = zX0 ? null : new lm0(this.f11384a, this.f11389f);
        ey eyVar = this.f11392i;
        hy hyVar = this.f11393j;
        i2.f0 f0Var = this.f11403t;
        fm0 fm0Var2 = this.f11384a;
        b0(new AdOverlayInfoParcel(aVar, lm0Var, eyVar, hyVar, f0Var, fm0Var2, z7, i8, str, fm0Var2.v(), z10 ? null : this.f11394k, q(this.f11384a) ? this.D : null, z9));
    }

    public final void e(String str, e3.n nVar) {
        synchronized (this.f11387d) {
            List<qz> list = (List) this.f11386c.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (qz qzVar : list) {
                if (nVar.apply(qzVar)) {
                    arrayList.add(qzVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void e0(String str, qz qzVar) {
        synchronized (this.f11387d) {
            List copyOnWriteArrayList = (List) this.f11386c.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.f11386c.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(qzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void f0() {
        hc1 hc1Var = this.f11394k;
        if (hc1Var != null) {
            hc1Var.f0();
        }
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f11387d) {
            z7 = this.f11402s;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void i0(boolean z7) {
        synchronized (this.f11387d) {
            this.f11402s = z7;
        }
    }

    public final boolean j() {
        boolean z7;
        synchronized (this.f11387d) {
            z7 = this.f11401r;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void j0(Uri uri) {
        HashMap map = this.f11386c;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            j2.v1.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) h2.y.c().b(ns.I6)).booleanValue() || g2.t.q().f() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.im0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i8 = mm0.F;
                    g2.t.q().f().e(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) h2.y.c().b(ns.f12246z5)).booleanValue() && this.C.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) h2.y.c().b(ns.B5)).intValue()) {
                j2.v1.k("Parsing gmsg query params on BG thread: ".concat(path));
                zf3.r(g2.t.r().C(uri), new km0(this, list, path, uri), eh0.f7326e);
                return;
            }
        }
        g2.t.r();
        m(j2.k2.o(uri), list, path);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        j2.v1.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            j0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f11387d) {
            if (this.f11384a.i()) {
                j2.v1.k("Blank page loaded, 1...");
                this.f11384a.n0();
                return;
            }
            this.f11408y = true;
            sn0 sn0Var = this.f11391h;
            if (sn0Var != null) {
                sn0Var.j();
                this.f11391h = null;
            }
            J();
            if (this.f11384a.L() != null) {
                if (((Boolean) h2.y.c().b(ns.Qa)).booleanValue()) {
                    this.f11384a.L().T5(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        this.f11396m = true;
        this.f11397n = i8;
        this.f11398o = str;
        this.f11399p = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f11384a.N0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final g2.b p() {
        return this.f11405v;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final boolean p0() {
        boolean z7;
        synchronized (this.f11387d) {
            z7 = this.f11400q;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void s() {
        vn vnVar = this.f11385b;
        if (vnVar != null) {
            vnVar.c(10005);
        }
        this.f11409z = true;
        this.f11397n = 10004;
        this.f11398o = "Page loaded delay cancel.";
        J();
        this.f11384a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void s0(int i8, int i9, boolean z7) {
        z70 z70Var = this.f11404u;
        if (z70Var != null) {
            z70Var.h(i8, i9);
        }
        u70 u70Var = this.f11406w;
        if (u70Var != null) {
            u70Var.j(i8, i9, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return D(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        j2.v1.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            j0(uriA);
        } else {
            if (this.f11395l && webView == this.f11384a.X()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    h2.a aVar = this.f11388e;
                    if (aVar != null) {
                        aVar.Z();
                        nd0 nd0Var = this.f11407x;
                        if (nd0Var != null) {
                            nd0Var.d0(str);
                        }
                        this.f11388e = null;
                    }
                    hc1 hc1Var = this.f11394k;
                    if (hc1Var != null) {
                        hc1Var.f0();
                        this.f11394k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f11384a.X().willNotDraw()) {
                qg0.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    gh ghVarQ = this.f11384a.Q();
                    if (ghVarQ != null && ghVarQ.f(uriA)) {
                        Context context = this.f11384a.getContext();
                        fm0 fm0Var = this.f11384a;
                        uriA = ghVarQ.a(uriA, context, (View) fm0Var, fm0Var.r());
                    }
                } catch (hh unused) {
                    qg0.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                g2.b bVar = this.f11405v;
                if (bVar == null || bVar.c()) {
                    V(new i2.i("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null), true);
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void t0(int i8, int i9) {
        u70 u70Var = this.f11406w;
        if (u70Var != null) {
            u70Var.k(i8, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void u() {
        synchronized (this.f11387d) {
        }
        this.A++;
        J();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void x() {
        this.A--;
        J();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void y0(rn0 rn0Var) {
        this.f11390g = rn0Var;
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void z() {
        nd0 nd0Var = this.f11407x;
        if (nd0Var != null) {
            WebView webViewX = this.f11384a.X();
            if (androidx.core.view.e0.v(webViewX)) {
                o(webViewX, nd0Var, 10);
                return;
            }
            n();
            jm0 jm0Var = new jm0(this, nd0Var);
            this.E = jm0Var;
            ((View) this.f11384a).addOnAttachStateChangeListener(jm0Var);
        }
    }
}
