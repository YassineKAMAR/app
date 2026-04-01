package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ul1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g2.a f15746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm0 f15747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f15748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eq1 f15749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mx2 f15750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f15751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gh f15752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wg0 f15753i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q12 f15755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final jz2 f15756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b22 f15757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private x3.d f15758n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl1 f15745a = new gl1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f00 f15754j = new f00();

    ul1(rl1 rl1Var) {
        this.f15748d = rl1Var.f14212c;
        this.f15751g = rl1Var.f14216g;
        this.f15752h = rl1Var.f14217h;
        this.f15753i = rl1Var.f14218i;
        this.f15746b = rl1Var.f14210a;
        this.f15747c = rl1Var.f14211b;
        this.f15755k = rl1Var.f14215f;
        this.f15756l = rl1Var.f14219j;
        this.f15749e = rl1Var.f14213d;
        this.f15750f = rl1Var.f14214e;
        this.f15757m = rl1Var.f14220k;
    }

    final /* synthetic */ fm0 a(fm0 fm0Var) {
        fm0Var.f1("/result", this.f15754j);
        tn0 tn0VarH = fm0Var.H();
        g2.b bVar = new g2.b(this.f15748d, null, null);
        q12 q12Var = this.f15755k;
        jz2 jz2Var = this.f15756l;
        eq1 eq1Var = this.f15749e;
        mx2 mx2Var = this.f15750f;
        gl1 gl1Var = this.f15745a;
        tn0VarH.S(null, gl1Var, gl1Var, gl1Var, gl1Var, false, null, bVar, null, null, q12Var, jz2Var, eq1Var, mx2Var, null, null, null, null, null);
        return fm0Var;
    }

    final /* synthetic */ x3.d c(String str, JSONObject jSONObject, fm0 fm0Var) {
        return this.f15754j.b(fm0Var, str, jSONObject);
    }

    public final synchronized x3.d d(final String str, final JSONObject jSONObject) {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return zf3.h(null);
        }
        return zf3.n(dVar, new gf3() { // from class: com.google.android.gms.internal.ads.hl1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f8815a.c(str, jSONObject, (fm0) obj);
            }
        }, this.f15751g);
    }

    public final synchronized void e(wr2 wr2Var, as2 as2Var) {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return;
        }
        zf3.r(dVar, new ol1(this, wr2Var, as2Var), this.f15751g);
    }

    public final synchronized void f() {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return;
        }
        zf3.r(dVar, new jl1(this), this.f15751g);
        this.f15758n = null;
    }

    public final synchronized void g(String str, Map map) {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return;
        }
        zf3.r(dVar, new nl1(this, "sendMessageToNativeJs", map), this.f15751g);
    }

    public final synchronized void h() {
        final String str = (String) h2.y.c().b(ns.A3);
        final Context context = this.f15748d;
        final gh ghVar = this.f15752h;
        final wg0 wg0Var = this.f15753i;
        final g2.a aVar = this.f15746b;
        final b22 b22Var = this.f15757m;
        x3.d dVarM = zf3.m(zf3.k(new ef3() { // from class: com.google.android.gms.internal.ads.pm0
            @Override // com.google.android.gms.internal.ads.ef3
            public final x3.d j() throws qm0 {
                g2.t.B();
                Context context2 = context;
                vn0 vn0VarA = vn0.a();
                gh ghVar2 = ghVar;
                g2.a aVar2 = aVar;
                fm0 fm0VarA = rm0.a(context2, vn0VarA, "", false, false, ghVar2, null, wg0Var, null, null, aVar2, vn.a(), null, null, b22Var);
                final ih0 ih0VarF = ih0.f(fm0VarA);
                fm0VarA.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.nm0
                    @Override // com.google.android.gms.internal.ads.rn0
                    public final void a(boolean z7, int i8, String str2, String str3) {
                        ih0VarF.g();
                    }
                });
                fm0VarA.loadUrl(str);
                return ih0VarF;
            }
        }, eh0.f7326e), new z73() { // from class: com.google.android.gms.internal.ads.il1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                fm0 fm0Var = (fm0) obj;
                this.f9275a.a(fm0Var);
                return fm0Var;
            }
        }, this.f15751g);
        this.f15758n = dVarM;
        hh0.a(dVarM, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, qz qzVar) {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return;
        }
        zf3.r(dVar, new kl1(this, str, qzVar), this.f15751g);
    }

    public final void j(WeakReference weakReference, String str, qz qzVar) {
        i(str, new tl1(this, weakReference, str, qzVar, null));
    }

    public final synchronized void k(String str, qz qzVar) {
        x3.d dVar = this.f15758n;
        if (dVar == null) {
            return;
        }
        zf3.r(dVar, new ml1(this, str, qzVar), this.f15751g);
    }
}
