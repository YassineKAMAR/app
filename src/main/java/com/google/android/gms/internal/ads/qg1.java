package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2.p2 f13449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pv f13450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f13451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f13452e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h2.l3 f13454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bundle f13455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private fm0 f13456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private fm0 f13457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private fm0 f13458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private qz2 f13459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x3.d f13460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private jh0 f13461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f13462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f13463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g3.a f13464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f13465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private wv f13466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private wv f13467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f13468u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f13471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f13472y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p.h f13469v = new p.h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p.h f13470w = new p.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f13453f = Collections.emptyList();

    public static qg1 H(l50 l50Var) {
        try {
            pg1 pg1VarL = L(l50Var.q3(), null);
            pv pvVarY4 = l50Var.y4();
            View view = (View) N(l50Var.G5());
            String strW = l50Var.w();
            List listO5 = l50Var.O5();
            String strX = l50Var.x();
            Bundle bundleN = l50Var.n();
            String strV = l50Var.v();
            View view2 = (View) N(l50Var.N5());
            g3.a aVarU = l50Var.u();
            String strZ = l50Var.z();
            String strY = l50Var.y();
            double dM = l50Var.m();
            wv wvVarH5 = l50Var.h5();
            qg1 qg1Var = new qg1();
            qg1Var.f13448a = 2;
            qg1Var.f13449b = pg1VarL;
            qg1Var.f13450c = pvVarY4;
            qg1Var.f13451d = view;
            qg1Var.z("headline", strW);
            qg1Var.f13452e = listO5;
            qg1Var.z("body", strX);
            qg1Var.f13455h = bundleN;
            qg1Var.z("call_to_action", strV);
            qg1Var.f13462o = view2;
            qg1Var.f13464q = aVarU;
            qg1Var.z(ProductResponseJsonKeys.STORE, strZ);
            qg1Var.z(com.amazon.a.a.o.b.f3914x, strY);
            qg1Var.f13465r = dM;
            qg1Var.f13466s = wvVarH5;
            return qg1Var;
        } catch (RemoteException e8) {
            qg0.h("Failed to get native ad from app install ad mapper", e8);
            return null;
        }
    }

    public static qg1 I(m50 m50Var) {
        try {
            pg1 pg1VarL = L(m50Var.q3(), null);
            pv pvVarY4 = m50Var.y4();
            View view = (View) N(m50Var.r());
            String strW = m50Var.w();
            List listO5 = m50Var.O5();
            String strX = m50Var.x();
            Bundle bundleM = m50Var.m();
            String strV = m50Var.v();
            View view2 = (View) N(m50Var.G5());
            g3.a aVarN5 = m50Var.N5();
            String strU = m50Var.u();
            wv wvVarH5 = m50Var.h5();
            qg1 qg1Var = new qg1();
            qg1Var.f13448a = 1;
            qg1Var.f13449b = pg1VarL;
            qg1Var.f13450c = pvVarY4;
            qg1Var.f13451d = view;
            qg1Var.z("headline", strW);
            qg1Var.f13452e = listO5;
            qg1Var.z("body", strX);
            qg1Var.f13455h = bundleM;
            qg1Var.z("call_to_action", strV);
            qg1Var.f13462o = view2;
            qg1Var.f13464q = aVarN5;
            qg1Var.z("advertiser", strU);
            qg1Var.f13467t = wvVarH5;
            return qg1Var;
        } catch (RemoteException e8) {
            qg0.h("Failed to get native ad from content ad mapper", e8);
            return null;
        }
    }

    public static qg1 J(l50 l50Var) {
        try {
            return M(L(l50Var.q3(), null), l50Var.y4(), (View) N(l50Var.G5()), l50Var.w(), l50Var.O5(), l50Var.x(), l50Var.n(), l50Var.v(), (View) N(l50Var.N5()), l50Var.u(), l50Var.z(), l50Var.y(), l50Var.m(), l50Var.h5(), null, 0.0f);
        } catch (RemoteException e8) {
            qg0.h("Failed to get native ad assets from app install ad mapper", e8);
            return null;
        }
    }

    public static qg1 K(m50 m50Var) {
        try {
            return M(L(m50Var.q3(), null), m50Var.y4(), (View) N(m50Var.r()), m50Var.w(), m50Var.O5(), m50Var.x(), m50Var.m(), m50Var.v(), (View) N(m50Var.G5()), m50Var.N5(), null, null, -1.0d, m50Var.h5(), m50Var.u(), 0.0f);
        } catch (RemoteException e8) {
            qg0.h("Failed to get native ad assets from content ad mapper", e8);
            return null;
        }
    }

    private static pg1 L(h2.p2 p2Var, p50 p50Var) {
        if (p2Var == null) {
            return null;
        }
        return new pg1(p2Var, p50Var);
    }

    private static qg1 M(h2.p2 p2Var, pv pvVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, g3.a aVar, String str4, String str5, double d8, wv wvVar, String str6, float f8) {
        qg1 qg1Var = new qg1();
        qg1Var.f13448a = 6;
        qg1Var.f13449b = p2Var;
        qg1Var.f13450c = pvVar;
        qg1Var.f13451d = view;
        qg1Var.z("headline", str);
        qg1Var.f13452e = list;
        qg1Var.z("body", str2);
        qg1Var.f13455h = bundle;
        qg1Var.z("call_to_action", str3);
        qg1Var.f13462o = view2;
        qg1Var.f13464q = aVar;
        qg1Var.z(ProductResponseJsonKeys.STORE, str4);
        qg1Var.z(com.amazon.a.a.o.b.f3914x, str5);
        qg1Var.f13465r = d8;
        qg1Var.f13466s = wvVar;
        qg1Var.z("advertiser", str6);
        qg1Var.r(f8);
        return qg1Var;
    }

    private static Object N(g3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return g3.b.H0(aVar);
    }

    public static qg1 g0(p50 p50Var) {
        try {
            return M(L(p50Var.t(), p50Var), p50Var.s(), (View) N(p50Var.x()), p50Var.C(), p50Var.A(), p50Var.z(), p50Var.r(), p50Var.B(), (View) N(p50Var.v()), p50Var.w(), p50Var.E(), p50Var.G(), p50Var.m(), p50Var.u(), p50Var.y(), p50Var.n());
        } catch (RemoteException e8) {
            qg0.h("Failed to get native ad assets from unified ad mapper", e8);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f13465r;
    }

    public final synchronized void B(int i8) {
        this.f13448a = i8;
    }

    public final synchronized void C(h2.p2 p2Var) {
        this.f13449b = p2Var;
    }

    public final synchronized void D(View view) {
        this.f13462o = view;
    }

    public final synchronized void E(fm0 fm0Var) {
        this.f13456i = fm0Var;
    }

    public final synchronized void F(View view) {
        this.f13463p = view;
    }

    public final synchronized boolean G() {
        return this.f13457j != null;
    }

    public final synchronized float O() {
        return this.f13471x;
    }

    public final synchronized int P() {
        return this.f13448a;
    }

    public final synchronized Bundle Q() {
        if (this.f13455h == null) {
            this.f13455h = new Bundle();
        }
        return this.f13455h;
    }

    public final synchronized View R() {
        return this.f13451d;
    }

    public final synchronized View S() {
        return this.f13462o;
    }

    public final synchronized View T() {
        return this.f13463p;
    }

    public final synchronized p.h U() {
        return this.f13469v;
    }

    public final synchronized p.h V() {
        return this.f13470w;
    }

    public final synchronized h2.p2 W() {
        return this.f13449b;
    }

    public final synchronized h2.l3 X() {
        return this.f13454g;
    }

    public final synchronized pv Y() {
        return this.f13450c;
    }

    public final wv Z() {
        List list = this.f13452e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f13452e.get(0);
            if (obj instanceof IBinder) {
                return vv.O5((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized String a() {
        return this.f13468u;
    }

    public final synchronized wv a0() {
        return this.f13466s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized wv b0() {
        return this.f13467t;
    }

    public final synchronized String c() {
        return this.f13472y;
    }

    public final synchronized jh0 c0() {
        return this.f13461n;
    }

    public final synchronized String d() {
        return f(com.amazon.a.a.o.b.f3914x);
    }

    public final synchronized fm0 d0() {
        return this.f13457j;
    }

    public final synchronized String e() {
        return f(ProductResponseJsonKeys.STORE);
    }

    public final synchronized fm0 e0() {
        return this.f13458k;
    }

    public final synchronized String f(String str) {
        return (String) this.f13470w.get(str);
    }

    public final synchronized fm0 f0() {
        return this.f13456i;
    }

    public final synchronized List g() {
        return this.f13452e;
    }

    public final synchronized List h() {
        return this.f13453f;
    }

    public final synchronized qz2 h0() {
        return this.f13459l;
    }

    public final synchronized void i() {
        fm0 fm0Var = this.f13456i;
        if (fm0Var != null) {
            fm0Var.destroy();
            this.f13456i = null;
        }
        fm0 fm0Var2 = this.f13457j;
        if (fm0Var2 != null) {
            fm0Var2.destroy();
            this.f13457j = null;
        }
        fm0 fm0Var3 = this.f13458k;
        if (fm0Var3 != null) {
            fm0Var3.destroy();
            this.f13458k = null;
        }
        x3.d dVar = this.f13460m;
        if (dVar != null) {
            dVar.cancel(false);
            this.f13460m = null;
        }
        jh0 jh0Var = this.f13461n;
        if (jh0Var != null) {
            jh0Var.cancel(false);
            this.f13461n = null;
        }
        this.f13459l = null;
        this.f13469v.clear();
        this.f13470w.clear();
        this.f13449b = null;
        this.f13450c = null;
        this.f13451d = null;
        this.f13452e = null;
        this.f13455h = null;
        this.f13462o = null;
        this.f13463p = null;
        this.f13464q = null;
        this.f13466s = null;
        this.f13467t = null;
        this.f13468u = null;
    }

    public final synchronized g3.a i0() {
        return this.f13464q;
    }

    public final synchronized void j(pv pvVar) {
        this.f13450c = pvVar;
    }

    public final synchronized x3.d j0() {
        return this.f13460m;
    }

    public final synchronized void k(String str) {
        this.f13468u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(h2.l3 l3Var) {
        this.f13454g = l3Var;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(wv wvVar) {
        this.f13466s = wvVar;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, jv jvVar) {
        if (jvVar == null) {
            this.f13469v.remove(str);
        } else {
            this.f13469v.put(str, jvVar);
        }
    }

    public final synchronized void o(fm0 fm0Var) {
        this.f13457j = fm0Var;
    }

    public final synchronized void p(List list) {
        this.f13452e = list;
    }

    public final synchronized void q(wv wvVar) {
        this.f13467t = wvVar;
    }

    public final synchronized void r(float f8) {
        this.f13471x = f8;
    }

    public final synchronized void s(List list) {
        this.f13453f = list;
    }

    public final synchronized void t(fm0 fm0Var) {
        this.f13458k = fm0Var;
    }

    public final synchronized void u(x3.d dVar) {
        this.f13460m = dVar;
    }

    public final synchronized void v(String str) {
        this.f13472y = str;
    }

    public final synchronized void w(qz2 qz2Var) {
        this.f13459l = qz2Var;
    }

    public final synchronized void x(jh0 jh0Var) {
        this.f13461n = jh0Var;
    }

    public final synchronized void y(double d8) {
        this.f13465r = d8;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.f13470w.remove(str);
        } else {
            this.f13470w.put(str, str2);
        }
    }
}
