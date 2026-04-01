package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y72 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gn1 f17611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pm1 f17612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f17613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f17614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f17615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sz f17616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f17617h = ((Boolean) h2.y.c().b(ns.E8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b22 f17618i;

    public y72(Context context, wg0 wg0Var, ts2 ts2Var, Executor executor, pm1 pm1Var, gn1 gn1Var, sz szVar, b22 b22Var) {
        this.f17610a = context;
        this.f17613d = ts2Var;
        this.f17612c = pm1Var;
        this.f17614e = executor;
        this.f17615f = wg0Var;
        this.f17611b = gn1Var;
        this.f17616g = szVar;
        this.f17618i = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        final kn1 kn1Var = new kn1();
        x3.d dVarN = zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.r72
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f13965a.c(wr2Var, ks2Var, kn1Var, obj);
            }
        }, this.f17614e);
        dVarN.c(new Runnable() { // from class: com.google.android.gms.internal.ads.s72
            @Override // java.lang.Runnable
            public final void run() {
                kn1Var.b();
            }
        }, this.f17614e);
        return dVarN;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var = wr2Var.f16905u;
        return (cs2Var == null || cs2Var.f6465a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ x3.d c(final wr2 wr2Var, ks2 ks2Var, kn1 kn1Var, Object obj) {
        final fm0 fm0VarA = this.f17611b.a(this.f17613d.f15303e, wr2Var, ks2Var.f10323b.f9793b);
        fm0VarA.P0(wr2Var.Y);
        kn1Var.a(this.f17610a, (View) fm0VarA);
        jh0 jh0Var = new jh0();
        final km1 km1VarB = this.f17612c.b(new d01(ks2Var, wr2Var, null), new lm1(new x72(this.f17610a, this.f17611b, this.f17613d, this.f17615f, wr2Var, jh0Var, fm0VarA, this.f17616g, this.f17617h, this.f17618i), fm0VarA));
        jh0Var.d(km1VarB);
        i00.b(fm0VarA, km1VarB.i());
        km1VarB.b().w0(new b51() { // from class: com.google.android.gms.internal.ads.t72
            @Override // com.google.android.gms.internal.ads.b51
            public final void z() {
                fm0 fm0Var = fm0VarA;
                if (fm0Var.H() != null) {
                    fm0Var.H().z();
                }
            }
        }, eh0.f7327f);
        km1VarB.l().i(fm0VarA, true, this.f17617h ? this.f17616g : null);
        km1VarB.l();
        cs2 cs2Var = wr2Var.f16905u;
        return zf3.m(fn1.j(fm0VarA, cs2Var.f6466b, cs2Var.f6465a), new z73() { // from class: com.google.android.gms.internal.ads.u72
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj2) {
                fm0 fm0Var = fm0VarA;
                if (wr2Var.O) {
                    fm0Var.m0();
                }
                km1 km1Var = km1VarB;
                fm0Var.E0();
                fm0Var.onPause();
                return km1Var.k();
            }
        }, this.f17614e);
    }
}
