package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lg1 extends nz0 {
    public static final jb3 G = jb3.E("3010", "3008", "1005", "1009", "2011", "2007");
    private final Context A;
    private final ng1 B;
    private final ya2 C;
    private final Map D;
    private final List E;
    private final vk F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f10669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qg1 f10670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final yg1 f10671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final rh1 f10672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final vg1 f10673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bh1 f10674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c84 f10675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c84 f10676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c84 f10677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c84 f10678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c84 f10679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private oi1 f10680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10681u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10682v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ae0 f10684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final gh f10685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final wg0 f10686z;

    public lg1(mz0 mz0Var, Executor executor, qg1 qg1Var, yg1 yg1Var, rh1 rh1Var, vg1 vg1Var, bh1 bh1Var, c84 c84Var, c84 c84Var2, c84 c84Var3, c84 c84Var4, c84 c84Var5, ae0 ae0Var, gh ghVar, wg0 wg0Var, Context context, ng1 ng1Var, ya2 ya2Var, vk vkVar) {
        super(mz0Var);
        this.f10669i = executor;
        this.f10670j = qg1Var;
        this.f10671k = yg1Var;
        this.f10672l = rh1Var;
        this.f10673m = vg1Var;
        this.f10674n = bh1Var;
        this.f10675o = c84Var;
        this.f10676p = c84Var2;
        this.f10677q = c84Var3;
        this.f10678r = c84Var4;
        this.f10679s = c84Var5;
        this.f10684x = ae0Var;
        this.f10685y = ghVar;
        this.f10686z = wg0Var;
        this.A = context;
        this.B = ng1Var;
        this.C = ya2Var;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = vkVar;
    }

    public static boolean C(View view) {
        if (!((Boolean) h2.y.c().b(ns.M9)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        g2.t.r();
        long jW = j2.k2.W(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jW >= ((Integer) h2.y.c().b(ns.N9)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View E(Map map) {
        if (map == null) {
            return null;
        }
        jb3 jb3Var = G;
        int size = jb3Var.size();
        int i8 = 0;
        while (i8 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) jb3Var.get(i8));
            i8++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType F() {
        if (!((Boolean) h2.y.c().b(ns.L7)).booleanValue()) {
            return null;
        }
        oi1 oi1Var = this.f10680t;
        if (oi1Var == null) {
            qg0.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        g3.a aVarT = oi1Var.t();
        if (aVarT != null) {
            return (ImageView.ScaleType) g3.b.H0(aVarT);
        }
        return rh1.f14121k;
    }

    private final void G(String str, boolean z7) {
        if (!((Boolean) h2.y.c().b(ns.Y4)).booleanValue()) {
            P("Google", true);
            return;
        }
        x3.d dVarJ0 = this.f10670j.j0();
        if (dVarJ0 == null) {
            return;
        }
        zf3.r(dVarJ0, new jg1(this, "Google", true), this.f10669i);
    }

    private final synchronized void I(View view, Map map, Map map2) {
        this.f10672l.d(this.f10680t);
        this.f10671k.b(view, map, map2, F());
        this.f10682v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(View view, qz2 qz2Var) {
        fm0 fm0VarE0 = this.f10670j.e0();
        if (!this.f10673m.d() || qz2Var == null || fm0VarE0 == null || view == null) {
            return;
        }
        g2.t.a().f(qz2Var, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final synchronized void b0(oi1 oi1Var) {
        Iterator<String> itKeys;
        View view;
        if (this.f10681u) {
            return;
        }
        this.f10680t = oi1Var;
        this.f10672l.e(oi1Var);
        this.f10671k.f(oi1Var.n(), oi1Var.x(), oi1Var.v(), oi1Var, oi1Var);
        if (((Boolean) h2.y.c().b(ns.f12186s2)).booleanValue()) {
            this.f10685y.c().a(oi1Var.n());
        }
        if (((Boolean) h2.y.c().b(ns.I1)).booleanValue()) {
            wr2 wr2Var = this.f12292b;
            if (wr2Var.f16890m0 && (itKeys = wr2Var.f16888l0.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference weakReference = (WeakReference) this.f10680t.u().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        uk ukVar = new uk(this.A, view);
                        this.E.add(ukVar);
                        ukVar.c(new ig1(this, next));
                    }
                }
            }
        }
        if (oi1Var.r() != null) {
            oi1Var.r().c(this.f10684x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void c0(oi1 oi1Var) {
        this.f10671k.c(oi1Var.n(), oi1Var.u());
        if (oi1Var.o() != null) {
            oi1Var.o().setClickable(false);
            oi1Var.o().removeAllViews();
        }
        if (oi1Var.r() != null) {
            oi1Var.r().e(this.f10684x);
        }
        this.f10680t = null;
    }

    public static /* synthetic */ void U(lg1 lg1Var) {
        try {
            qg1 qg1Var = lg1Var.f10670j;
            int iP = qg1Var.P();
            if (iP == 1) {
                if (lg1Var.f10674n.b() != null) {
                    lg1Var.G("Google", true);
                    lg1Var.f10674n.b().J5((mw) lg1Var.f10675o.k());
                    return;
                }
                return;
            }
            if (iP == 2) {
                if (lg1Var.f10674n.a() != null) {
                    lg1Var.G("Google", true);
                    lg1Var.f10674n.a().G1((kw) lg1Var.f10676p.k());
                    return;
                }
                return;
            }
            if (iP == 3) {
                if (lg1Var.f10674n.d(qg1Var.a()) != null) {
                    if (lg1Var.f10670j.f0() != null) {
                        lg1Var.P("Google", true);
                    }
                    lg1Var.f10674n.d(lg1Var.f10670j.a()).E3((pw) lg1Var.f10679s.k());
                    return;
                }
                return;
            }
            if (iP == 6) {
                if (lg1Var.f10674n.f() != null) {
                    lg1Var.G("Google", true);
                    lg1Var.f10674n.f().J3((sx) lg1Var.f10677q.k());
                    return;
                }
                return;
            }
            if (iP != 7) {
                qg0.d("Wrong native template id!");
                return;
            }
            bh1 bh1Var = lg1Var.f10674n;
            if (bh1Var.g() != null) {
                bh1Var.g().z3((u10) lg1Var.f10678r.k());
            }
        } catch (RemoteException e8) {
            qg0.e("RemoteException when notifyAdLoad is called", e8);
        }
    }

    public final synchronized boolean A() {
        return this.f10671k.f0();
    }

    public final boolean B() {
        return this.f10673m.d();
    }

    public final synchronized boolean D(Bundle bundle) {
        if (this.f10682v) {
            return true;
        }
        boolean zD = this.f10671k.d(bundle);
        this.f10682v = zD;
        return zD;
    }

    public final synchronized int H() {
        return this.f10671k.j();
    }

    public final ng1 M() {
        return this.B;
    }

    public final qz2 P(String str, boolean z7) {
        String str2;
        s22 s22Var;
        r22 r22Var;
        String str3;
        if (!this.f10673m.d() || TextUtils.isEmpty(str)) {
            return null;
        }
        qg1 qg1Var = this.f10670j;
        fm0 fm0VarE0 = qg1Var.e0();
        fm0 fm0VarF0 = qg1Var.f0();
        if (fm0VarE0 == null && fm0VarF0 == null) {
            str3 = "Omid display and video webview are null. Skipping initialization.";
        } else {
            boolean z8 = false;
            boolean z9 = fm0VarE0 != null;
            boolean z10 = fm0VarF0 != null;
            if (((Boolean) h2.y.c().b(ns.W4)).booleanValue()) {
                this.f10673m.a();
                int iB = this.f10673m.a().b();
                int i8 = iB - 1;
                if (i8 != 0) {
                    if (i8 != 1) {
                        str3 = "Unknown omid media type: " + (iB != 1 ? iB != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.";
                    } else if (fm0VarE0 != null) {
                        z8 = true;
                        z10 = false;
                    } else {
                        str3 = "Omid media type was display but there was no display webview.";
                    }
                } else if (fm0VarF0 != null) {
                    z10 = true;
                } else {
                    str3 = "Omid media type was video but there was no video webview.";
                }
            } else {
                z8 = z9;
            }
            if (z8) {
                str2 = null;
            } else {
                str2 = "javascript";
                fm0VarE0 = fm0VarF0;
            }
            fm0VarE0.X();
            if (g2.t.a().c(this.A)) {
                wg0 wg0Var = this.f10686z;
                String str4 = wg0Var.f16724b + "." + wg0Var.f16725c;
                if (z10) {
                    r22Var = r22.VIDEO;
                    s22Var = s22.DEFINED_BY_JAVASCRIPT;
                } else {
                    qg1 qg1Var2 = this.f10670j;
                    r22 r22Var2 = r22.NATIVE_DISPLAY;
                    s22Var = qg1Var2.P() == 3 ? s22.UNSPECIFIED : s22.ONE_PIXEL;
                    r22Var = r22Var2;
                }
                qz2 qz2VarA = g2.t.a().a(str4, fm0VarE0.X(), "", "javascript", str2, str, s22Var, r22Var, this.f12292b.f16892n0);
                if (qz2VarA != null) {
                    this.f10670j.w(qz2VarA);
                    fm0VarE0.Y0(qz2VarA);
                    if (z10) {
                        g2.t.a().f(qz2VarA, fm0VarF0.T());
                        this.f10683w = true;
                    }
                    if (z7) {
                        g2.t.a().b(qz2VarA);
                        fm0VarE0.U("onSdkLoaded", new p.a());
                    }
                    return qz2VarA;
                }
                str3 = "Failed to create omid session in InternalNativeAd";
            } else {
                str3 = "Failed to initialize omid in InternalNativeAd";
            }
        }
        qg0.g(str3);
        return null;
    }

    public final String Q() {
        return this.f10673m.b();
    }

    public final synchronized JSONObject S(View view, Map map, Map map2) {
        return this.f10671k.k(view, map, map2, F());
    }

    public final synchronized JSONObject T(View view, Map map, Map map2) {
        return this.f10671k.s(view, map, map2, F());
    }

    public final void W(View view) {
        qz2 qz2VarH0 = this.f10670j.h0();
        if (!this.f10673m.d() || qz2VarH0 == null || view == null) {
            return;
        }
        g2.t.a().g(qz2VarH0, view);
    }

    public final synchronized void X() {
        this.f10671k.o();
    }

    final /* synthetic */ void Y() {
        this.f10671k.r();
        this.f10670j.i();
    }

    final /* synthetic */ void Z(View view, boolean z7, int i8) {
        this.f10671k.l(view, this.f10680t.n(), this.f10680t.u(), this.f10680t.x(), z7, F(), i8);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final synchronized void a() {
        this.f10681u = true;
        this.f10669i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fg1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7751a.Y();
            }
        });
        super.a();
    }

    final /* synthetic */ void a0(boolean z7) {
        this.f10671k.l(null, this.f10680t.n(), this.f10680t.u(), this.f10680t.x(), z7, F(), 0);
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void b() {
        this.f10669i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cg1
            @Override // java.lang.Runnable
            public final void run() {
                lg1.U(this.f6334a);
            }
        });
        if (this.f10670j.P() != 7) {
            Executor executor = this.f10669i;
            final yg1 yg1Var = this.f10671k;
            yg1Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dg1
                @Override // java.lang.Runnable
                public final void run() {
                    yg1Var.y();
                }
            });
        }
        super.b();
    }

    public final synchronized void d0(View view, Map map, Map map2, boolean z7) {
        if (this.f10682v) {
            return;
        }
        if (((Boolean) h2.y.c().b(ns.I1)).booleanValue() && this.f12292b.f16890m0) {
            Iterator it = this.D.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.D.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z7) {
            if (((Boolean) h2.y.c().b(ns.I3)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && C(view2)) {
                        I(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View viewE = E(map);
        if (viewE == null) {
            I(view, map, map2);
            return;
        }
        if (((Boolean) h2.y.c().b(ns.J3)).booleanValue()) {
            if (C(viewE)) {
                I(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) h2.y.c().b(ns.K3)).booleanValue()) {
            I(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (viewE.getGlobalVisibleRect(rect, null) && viewE.getHeight() == rect.height() && viewE.getWidth() == rect.width()) {
            I(view, map, map2);
        }
    }

    public final synchronized void h(h2.u1 u1Var) {
        this.f10671k.p(u1Var);
    }

    public final synchronized void i(View view, View view2, Map map, Map map2, boolean z7) {
        this.f10672l.c(this.f10680t);
        this.f10671k.g(view, view2, map, map2, z7, F());
        if (this.f10683w) {
            qg1 qg1Var = this.f10670j;
            if (qg1Var.f0() != null) {
                qg1Var.f0().U("onSdkAdUserInteractionClick", new p.a());
            }
        }
    }

    public final synchronized void j(final View view, final int i8) {
        if (((Boolean) h2.y.c().b(ns.ya)).booleanValue()) {
            oi1 oi1Var = this.f10680t;
            if (oi1Var == null) {
                qg0.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z7 = oi1Var instanceof lh1;
                this.f10669i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.eg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7310a.Z(view, z7, i8);
                    }
                });
            }
        }
    }

    public final synchronized void k(String str) {
        this.f10671k.U(str);
    }

    public final synchronized void l(Bundle bundle) {
        this.f10671k.h(bundle);
    }

    public final synchronized void m() {
        oi1 oi1Var = this.f10680t;
        if (oi1Var == null) {
            qg0.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z7 = oi1Var instanceof lh1;
            this.f10669i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hg1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8743a.a0(z7);
                }
            });
        }
    }

    public final synchronized void n() {
        if (this.f10682v) {
            return;
        }
        this.f10671k.B();
    }

    public final void o(View view) {
        if (!((Boolean) h2.y.c().b(ns.Y4)).booleanValue()) {
            J(view, this.f10670j.h0());
            return;
        }
        jh0 jh0VarC0 = this.f10670j.c0();
        if (jh0VarC0 == null) {
            return;
        }
        zf3.r(jh0VarC0, new kg1(this, view), this.f10669i);
    }

    public final synchronized void p(View view, MotionEvent motionEvent, View view2) {
        this.f10671k.a(view, motionEvent, view2);
    }

    public final synchronized void q(Bundle bundle) {
        this.f10671k.i(bundle);
    }

    public final synchronized void r(View view) {
        this.f10671k.e(view);
    }

    public final synchronized void s() {
        this.f10671k.A();
    }

    public final synchronized void t(h2.r1 r1Var) {
        this.f10671k.n(r1Var);
    }

    public final synchronized void u(h2.f2 f2Var) {
        this.C.a(f2Var);
    }

    public final synchronized void v(px pxVar) {
        this.f10671k.m(pxVar);
    }

    public final synchronized void w(final oi1 oi1Var) {
        if (((Boolean) h2.y.c().b(ns.G1)).booleanValue()) {
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ag1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5261a.b0(oi1Var);
                }
            });
        } else {
            b0(oi1Var);
        }
    }

    public final synchronized void x(final oi1 oi1Var) {
        if (((Boolean) h2.y.c().b(ns.G1)).booleanValue()) {
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bg1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5778a.c0(oi1Var);
                }
            });
        } else {
            c0(oi1Var);
        }
    }

    public final boolean y() {
        return this.f10673m.e();
    }

    public final synchronized boolean z() {
        return this.f10671k.R();
    }
}
