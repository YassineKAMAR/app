package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j32 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xw0 f9467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gn1 f9469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f9470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f9471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f9472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sz f9473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9474h = ((Boolean) h2.y.c().b(ns.E8)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b22 f9475i;

    public j32(xw0 xw0Var, Context context, Executor executor, gn1 gn1Var, ts2 ts2Var, wg0 wg0Var, sz szVar, b22 b22Var) {
        this.f9468b = context;
        this.f9467a = xw0Var;
        this.f9471e = executor;
        this.f9469c = gn1Var;
        this.f9470d = ts2Var;
        this.f9472f = wg0Var;
        this.f9473g = szVar;
        this.f9475i = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        final kn1 kn1Var = new kn1();
        x3.d dVarN = zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.f32
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f7613a.c(wr2Var, ks2Var, kn1Var, obj);
            }
        }, this.f9471e);
        dVarN.c(new Runnable() { // from class: com.google.android.gms.internal.ads.g32
            @Override // java.lang.Runnable
            public final void run() {
                kn1Var.b();
            }
        }, this.f9471e);
        return dVarN;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var = wr2Var.f16905u;
        return (cs2Var == null || cs2Var.f6465a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ x3.d c(final wr2 wr2Var, ks2 ks2Var, kn1 kn1Var, Object obj) {
        final fm0 fm0VarA = this.f9469c.a(this.f9470d.f15303e, wr2Var, ks2Var.f10323b.f9793b);
        fm0VarA.P0(wr2Var.Y);
        kn1Var.a(this.f9468b, (View) fm0VarA);
        jh0 jh0Var = new jh0();
        final uw0 uw0VarA = this.f9467a.a(new d01(ks2Var, wr2Var, null), new fd1(new l32(this.f9472f, jh0Var, wr2Var, fm0VarA, this.f9470d, this.f9474h, this.f9473g, this.f9475i), fm0VarA), new vw0(wr2Var.f16870c0));
        uw0VarA.j().i(fm0VarA, false, this.f9474h ? this.f9473g : null);
        jh0Var.d(uw0VarA);
        uw0VarA.b().w0(new b51() { // from class: com.google.android.gms.internal.ads.h32
            @Override // com.google.android.gms.internal.ads.b51
            public final void z() {
                fm0 fm0Var = fm0VarA;
                if (fm0Var.H() != null) {
                    fm0Var.H().z();
                }
            }
        }, eh0.f7327f);
        uw0VarA.j();
        cs2 cs2Var = wr2Var.f16905u;
        return zf3.m(fn1.j(fm0VarA, cs2Var.f6466b, cs2Var.f6465a), new z73() { // from class: com.google.android.gms.internal.ads.i32
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj2) {
                fm0 fm0Var = fm0VarA;
                if (wr2Var.O) {
                    fm0Var.m0();
                }
                uw0 uw0Var = uw0VarA;
                fm0Var.E0();
                fm0Var.onPause();
                return uw0Var.h();
            }
        }, this.f9471e);
    }
}
