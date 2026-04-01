package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c52 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gn1 f6171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce1 f6172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f6173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f6174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f6175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sz f6176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6177h = ((Boolean) h2.y.c().b(ns.E8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b22 f6178i;

    public c52(Context context, wg0 wg0Var, ts2 ts2Var, Executor executor, ce1 ce1Var, gn1 gn1Var, sz szVar, b22 b22Var) {
        this.f6170a = context;
        this.f6173d = ts2Var;
        this.f6172c = ce1Var;
        this.f6174e = executor;
        this.f6175f = wg0Var;
        this.f6171b = gn1Var;
        this.f6176g = szVar;
        this.f6178i = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        final kn1 kn1Var = new kn1();
        x3.d dVarN = zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.z42
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f18002a.c(wr2Var, ks2Var, kn1Var, obj);
            }
        }, this.f6174e);
        dVarN.c(new Runnable() { // from class: com.google.android.gms.internal.ads.a52
            @Override // java.lang.Runnable
            public final void run() {
                kn1Var.b();
            }
        }, this.f6174e);
        return dVarN;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var = wr2Var.f16905u;
        return (cs2Var == null || cs2Var.f6465a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ x3.d c(final wr2 wr2Var, ks2 ks2Var, kn1 kn1Var, Object obj) {
        final fm0 fm0VarA = this.f6171b.a(this.f6173d.f15303e, wr2Var, ks2Var.f10323b.f9793b);
        fm0VarA.P0(wr2Var.Y);
        kn1Var.a(this.f6170a, (View) fm0VarA);
        jh0 jh0Var = new jh0();
        final bd1 bd1VarC = this.f6172c.c(new d01(ks2Var, wr2Var, null), new fd1(new b52(this.f6170a, this.f6175f, jh0Var, wr2Var, fm0VarA, this.f6173d, this.f6177h, this.f6176g, this.f6178i), fm0VarA));
        jh0Var.d(bd1VarC);
        bd1VarC.b().w0(new b51() { // from class: com.google.android.gms.internal.ads.x42
            @Override // com.google.android.gms.internal.ads.b51
            public final void z() {
                fm0 fm0Var = fm0VarA;
                if (fm0Var.H() != null) {
                    fm0Var.H().z();
                }
            }
        }, eh0.f7327f);
        bd1VarC.k().i(fm0VarA, true, this.f6177h ? this.f6176g : null);
        bd1VarC.k();
        cs2 cs2Var = wr2Var.f16905u;
        return zf3.m(fn1.j(fm0VarA, cs2Var.f6466b, cs2Var.f6465a), new z73() { // from class: com.google.android.gms.internal.ads.y42
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj2) {
                fm0 fm0Var = fm0VarA;
                if (wr2Var.O) {
                    fm0Var.m0();
                }
                bd1 bd1Var = bd1VarC;
                fm0Var.E0();
                fm0Var.onPause();
                return bd1Var.i();
            }
        }, this.f6174e);
    }
}
