package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vs0 extends h2.m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f16451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xn1 f16452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z22 f16453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q92 f16454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final js1 f16455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final se0 f16456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final co1 f16457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ft1 f16458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dv f16459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ty2 f16460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ot2 f16461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final os f16462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16463n = false;

    vs0(Context context, wg0 wg0Var, xn1 xn1Var, z22 z22Var, q92 q92Var, js1 js1Var, se0 se0Var, co1 co1Var, ft1 ft1Var, dv dvVar, ty2 ty2Var, ot2 ot2Var, os osVar) {
        this.f16450a = context;
        this.f16451b = wg0Var;
        this.f16452c = xn1Var;
        this.f16453d = z22Var;
        this.f16454e = q92Var;
        this.f16455f = js1Var;
        this.f16456g = se0Var;
        this.f16457h = co1Var;
        this.f16458i = ft1Var;
        this.f16459j = dvVar;
        this.f16460k = ty2Var;
        this.f16461l = ot2Var;
        this.f16462m = osVar;
    }

    @Override // h2.n1
    public final synchronized boolean A() {
        return g2.t.t().e();
    }

    @Override // h2.n1
    public final void C1(m10 m10Var) {
        this.f16455f.s(m10Var);
    }

    @Override // h2.n1
    public final void G3(z40 z40Var) {
        this.f16461l.f(z40Var);
    }

    @Override // h2.n1
    public final synchronized void H4(String str) {
        ns.a(this.f16450a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) h2.y.c().b(ns.N3)).booleanValue()) {
                g2.t.c().a(this.f16450a, this.f16451b, str, null, this.f16460k);
            }
        }
    }

    @Override // h2.n1
    public final synchronized void I5(boolean z7) {
        g2.t.t().c(z7);
    }

    final /* synthetic */ void J() {
        this.f16459j.a(new u90());
    }

    @Override // h2.n1
    public final void K4(g3.a aVar, String str) {
        if (aVar == null) {
            qg0.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) g3.b.H0(aVar);
        if (context == null) {
            qg0.d("Context is null. Failed to open debug menu.");
            return;
        }
        j2.v vVar = new j2.v(context);
        vVar.n(str);
        vVar.o(this.f16451b.f16723a);
        vVar.r();
    }

    @Override // h2.n1
    public final void M0(String str) {
        if (((Boolean) h2.y.c().b(ns.f9)).booleanValue()) {
            g2.t.q().w(str);
        }
    }

    final void O5(Runnable runnable) {
        a3.o.e("Adapters must be initialized on the main thread.");
        Map mapE = g2.t.q().h().o().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                qg0.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f16452c.d()) {
            HashMap map = new HashMap();
            Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (t40 t40Var : ((u40) it.next()).f15473a) {
                    String str = t40Var.f14944k;
                    for (String str2 : t40Var.f14936c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    a32 a32VarA = this.f16453d.a(str3, jSONObject);
                    if (a32VarA != null) {
                        qt2 qt2Var = (qt2) a32VarA.f5001b;
                        if (!qt2Var.c() && qt2Var.b()) {
                            qt2Var.o(this.f16450a, (w42) a32VarA.f5002c, (List) entry.getValue());
                            qg0.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (ys2 e8) {
                    qg0.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e8);
                }
            }
        }
    }

    @Override // h2.n1
    public final void Y2(String str, g3.a aVar) {
        String strQ;
        Runnable runnable;
        ns.a(this.f16450a);
        if (((Boolean) h2.y.c().b(ns.T3)).booleanValue()) {
            g2.t.r();
            strQ = j2.k2.Q(this.f16450a);
        } else {
            strQ = "";
        }
        boolean z7 = true;
        String str2 = true == TextUtils.isEmpty(strQ) ? str : strQ;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.N3)).booleanValue();
        fs fsVar = ns.P0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) h2.y.c().b(fsVar)).booleanValue();
        if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) g3.b.H0(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.ts0
                @Override // java.lang.Runnable
                public final void run() {
                    lg3 lg3Var = eh0.f7326e;
                    final vs0 vs0Var = this.f15283a;
                    final Runnable runnable3 = runnable2;
                    lg3Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.us0
                        @Override // java.lang.Runnable
                        public final void run() {
                            vs0Var.O5(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z7 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z7) {
            g2.t.c().a(this.f16450a, this.f16451b, str2, runnable3, this.f16460k);
        }
    }

    @Override // h2.n1
    public final void d0(String str) {
        this.f16454e.g(str);
    }

    @Override // h2.n1
    public final void h3(h2.z1 z1Var) {
        this.f16458i.h(z1Var, et1.API);
    }

    final void k() {
        if (g2.t.q().h().P()) {
            String strU = g2.t.q().h().u();
            if (g2.t.u().j(this.f16450a, strU, this.f16451b.f16723a)) {
                return;
            }
            g2.t.q().h().f(false);
            g2.t.q().h().a("");
        }
    }

    @Override // h2.n1
    public final synchronized float m() {
        return g2.t.t().a();
    }

    @Override // h2.n1
    public final void m1(h2.f4 f4Var) {
        this.f16456g.v(this.f16450a, f4Var);
    }

    @Override // h2.n1
    public final String n() {
        return this.f16451b.f16723a;
    }

    @Override // h2.n1
    public final void n0(boolean z7) throws RemoteException {
        try {
            j53.j(this.f16450a).o(z7);
        } catch (IOException e8) {
            throw new RemoteException(e8.getMessage());
        }
    }

    final /* synthetic */ void p() {
        yt2.b(this.f16450a, true);
    }

    @Override // h2.n1
    public final synchronized void p3(float f8) {
        g2.t.t().d(f8);
    }

    @Override // h2.n1
    public final List q() {
        return this.f16455f.g();
    }

    @Override // h2.n1
    public final void r() {
        this.f16455f.l();
    }

    @Override // h2.n1
    public final synchronized void s() {
        if (this.f16463n) {
            qg0.g("Mobile ads is initialized already.");
            return;
        }
        ns.a(this.f16450a);
        this.f16462m.a();
        g2.t.q().s(this.f16450a, this.f16451b);
        g2.t.e().i(this.f16450a);
        this.f16463n = true;
        this.f16455f.r();
        this.f16454e.e();
        if (((Boolean) h2.y.c().b(ns.P3)).booleanValue()) {
            this.f16457h.c();
        }
        this.f16458i.g();
        if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
            eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qs0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13745a.k();
                }
            });
        }
        if (((Boolean) h2.y.c().b(ns.Z9)).booleanValue()) {
            eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ss0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14809a.J();
                }
            });
        }
        if (((Boolean) h2.y.c().b(ns.D2)).booleanValue()) {
            eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rs0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14295a.p();
                }
            });
        }
    }
}
