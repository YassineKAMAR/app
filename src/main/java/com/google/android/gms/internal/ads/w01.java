package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pv1 f16564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f16565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx2 f16566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut0 f16567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b72 f16568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r91 f16569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ks2 f16570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final vw1 f16571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j31 f16572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f16573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final hw1 f16574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c32 f16575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mx1 f16576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final tx1 f16577n;

    w01(pv1 pv1Var, ts2 ts2Var, bx2 bx2Var, ut0 ut0Var, b72 b72Var, r91 r91Var, ks2 ks2Var, vw1 vw1Var, j31 j31Var, Executor executor, hw1 hw1Var, c32 c32Var, mx1 mx1Var, tx1 tx1Var) {
        this.f16564a = pv1Var;
        this.f16565b = ts2Var;
        this.f16566c = bx2Var;
        this.f16567d = ut0Var;
        this.f16568e = b72Var;
        this.f16569f = r91Var;
        this.f16570g = ks2Var;
        this.f16571h = vw1Var;
        this.f16572i = j31Var;
        this.f16573j = executor;
        this.f16574k = hw1Var;
        this.f16575l = c32Var;
        this.f16576m = mx1Var;
        this.f16577n = tx1Var;
    }

    public final h2.z2 a(Throwable th) {
        return vt2.b(th, this.f16575l);
    }

    public final r91 c() {
        return this.f16569f;
    }

    final /* synthetic */ ks2 d(ks2 ks2Var) {
        this.f16567d.a(ks2Var);
        return ks2Var;
    }

    public final x3.d e(final pu2 pu2Var) {
        fw2 fw2VarA = this.f16566c.b(vw2.GET_CACHE_KEY, this.f16572i.c()).f(new gf3() { // from class: com.google.android.gms.internal.ads.s01
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f14399a.f(pu2Var, (ya0) obj);
            }
        }).a();
        zf3.r(fw2VarA, new u01(this), this.f16573j);
        return fw2VarA;
    }

    final /* synthetic */ x3.d f(pu2 pu2Var, ya0 ya0Var) {
        ya0Var.f17716i = pu2Var;
        return this.f16571h.a(ya0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ x3.d g(x3.d dVar, x3.d dVar2, x3.d dVar3) {
        return this.f16577n.c((ya0) dVar.get(), (JSONObject) dVar2.get(), (bb0) dVar3.get());
    }

    public final x3.d h(ya0 ya0Var) {
        fw2 fw2VarA = this.f16566c.b(vw2.NOTIFY_CACHE_HIT, this.f16571h.g(ya0Var)).a();
        zf3.r(fw2VarA, new v01(this), this.f16573j);
        return fw2VarA;
    }

    public final x3.d i(x3.d dVar) {
        sw2 sw2VarF = this.f16566c.b(vw2.RENDERER, dVar).e(new dw2() { // from class: com.google.android.gms.internal.ads.m01
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                ks2 ks2Var = (ks2) obj;
                this.f11102a.d(ks2Var);
                return ks2Var;
            }
        }).f(this.f16568e);
        if (!((Boolean) h2.y.c().b(ns.f12189s5)).booleanValue()) {
            sw2VarF = sw2VarF.i(((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS);
        }
        return sw2VarF.a();
    }

    public final x3.d j() {
        h2.r4 r4Var = this.f16565b.f15302d;
        if (r4Var.f22275x == null && r4Var.f22270s == null) {
            return k(this.f16572i.c());
        }
        bx2 bx2Var = this.f16566c;
        pv1 pv1Var = this.f16564a;
        return lw2.c(pv1Var.a(), vw2.PRELOADED_LOADER, bx2Var).a();
    }

    public final x3.d k(final x3.d dVar) {
        sw2 sw2VarF;
        ks2 ks2Var = this.f16570g;
        if (ks2Var != null) {
            sw2VarF = lw2.c(zf3.h(ks2Var), vw2.SERVER_TRANSACTION, this.f16566c);
        } else {
            g2.t.e().j();
            if (!((Boolean) h2.y.c().b(ns.za)).booleanValue() || ((Boolean) pu.f13130c.e()).booleanValue()) {
                sw2 sw2VarB = this.f16566c.b(vw2.SERVER_TRANSACTION, dVar);
                final hw1 hw1Var = this.f16574k;
                sw2VarF = sw2VarB.f(new gf3() { // from class: com.google.android.gms.internal.ads.t01
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return hw1Var.a((ya0) obj);
                    }
                });
            } else {
                final mx1 mx1Var = this.f16576m;
                final x3.d dVarN = zf3.n(dVar, new gf3() { // from class: com.google.android.gms.internal.ads.n01
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return mx1Var.a((ya0) obj);
                    }
                }, this.f16573j);
                sw2 sw2VarB2 = this.f16566c.b(vw2.BUILD_URL, dVarN);
                final vw1 vw1Var = this.f16571h;
                final fw2 fw2VarA = sw2VarB2.f(new gf3() { // from class: com.google.android.gms.internal.ads.o01
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return vw1Var.b((JSONObject) obj);
                    }
                }).a();
                sw2VarF = this.f16566c.a(vw2.SERVER_TRANSACTION, dVar, dVarN, fw2VarA).a(new Callable() { // from class: com.google.android.gms.internal.ads.p01
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f12686a.g(dVar, dVarN, fw2VarA);
                    }
                }).f(new gf3() { // from class: com.google.android.gms.internal.ads.q01
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return (x3.d) obj;
                    }
                });
            }
        }
        return sw2VarF.a();
    }

    public final void l(ks2 ks2Var) {
        this.f16570g = ks2Var;
    }
}
