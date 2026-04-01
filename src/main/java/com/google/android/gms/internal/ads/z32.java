package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z32 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hy0 f17988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gn1 f17990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f17991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f17992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z73 f17993f;

    public z32(hy0 hy0Var, Context context, Executor executor, gn1 gn1Var, ts2 ts2Var, z73 z73Var) {
        this.f17989b = context;
        this.f17988a = hy0Var;
        this.f17992e = executor;
        this.f17990c = gn1Var;
        this.f17991d = ts2Var;
        this.f17993f = z73Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        return zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.y32
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f17578a.c(ks2Var, wr2Var, obj);
            }
        }, this.f17992e);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        cs2 cs2Var = wr2Var.f16905u;
        return (cs2Var == null || cs2Var.f6465a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ x3.d c(ks2 ks2Var, wr2 wr2Var, Object obj) {
        View jn1Var;
        h2.w4 w4VarA = xs2.a(this.f17989b, wr2Var.f16908w);
        final fm0 fm0VarA = this.f17990c.a(w4VarA, wr2Var, ks2Var.f10323b.f9793b);
        fm0VarA.P0(wr2Var.Y);
        if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) {
            jn1Var = zy0.a(this.f17989b, (View) fm0VarA, wr2Var);
        } else {
            jn1Var = new jn1(this.f17989b, (View) fm0VarA, (j2.v) this.f17993f.apply(wr2Var));
        }
        final kx0 kx0VarA = this.f17988a.a(new d01(ks2Var, wr2Var, null), new rx0(jn1Var, fm0VarA, new lz0() { // from class: com.google.android.gms.internal.ads.t32
            @Override // com.google.android.gms.internal.ads.lz0
            public final h2.p2 j() {
                return fm0VarA.z();
            }
        }, xs2.b(w4VarA)));
        kx0VarA.j().i(fm0VarA, false, null);
        z41 z41VarB = kx0VarA.b();
        b51 b51Var = new b51() { // from class: com.google.android.gms.internal.ads.u32
            @Override // com.google.android.gms.internal.ads.b51
            public final void z() {
                fm0 fm0Var = fm0VarA;
                if (fm0Var.H() != null) {
                    fm0Var.H().z();
                }
            }
        };
        lg3 lg3Var = eh0.f7327f;
        z41VarB.w0(b51Var, lg3Var);
        kx0VarA.j();
        cs2 cs2Var = wr2Var.f16905u;
        x3.d dVarJ = fn1.j(fm0VarA, cs2Var.f6466b, cs2Var.f6465a);
        if (wr2Var.O) {
            dVarJ.c(new Runnable() { // from class: com.google.android.gms.internal.ads.v32
                @Override // java.lang.Runnable
                public final void run() {
                    fm0VarA.m0();
                }
            }, this.f17992e);
        }
        dVarJ.c(new Runnable() { // from class: com.google.android.gms.internal.ads.w32
            @Override // java.lang.Runnable
            public final void run() {
                this.f16610a.d(fm0VarA);
            }
        }, this.f17992e);
        return zf3.m(dVarJ, new z73() { // from class: com.google.android.gms.internal.ads.x32
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj2) {
                return kx0VarA.h();
            }
        }, lg3Var);
    }

    final /* synthetic */ void d(fm0 fm0Var) {
        fm0Var.E0();
        bn0 bn0VarZ = fm0Var.z();
        h2.k4 k4Var = this.f17991d.f15299a;
        if (k4Var == null || bn0VarZ == null) {
            return;
        }
        bn0VarZ.S5(k4Var);
    }
}
