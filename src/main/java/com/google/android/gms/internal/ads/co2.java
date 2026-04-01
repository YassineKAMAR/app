package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class co2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kb2 f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy2 f6417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey2 f6418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ hy0 f6419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ do2 f6420e;

    co2(do2 do2Var, kb2 kb2Var, qy2 qy2Var, ey2 ey2Var, hy0 hy0Var) {
        this.f6420e = do2Var;
        this.f6416a = kb2Var;
        this.f6417b = qy2Var;
        this.f6418c = ey2Var;
        this.f6419d = hy0Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qy2 qy2Var;
        final h2.z2 z2VarA = this.f6419d.d().a(th);
        synchronized (this.f6420e) {
            this.f6420e.f6843l = null;
            this.f6419d.e().A(z2VarA);
            if (((Boolean) h2.y.c().b(ns.U7)).booleanValue()) {
                this.f6420e.f6833b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ao2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5362a.f6420e.f6835d.A(z2VarA);
                    }
                });
            }
            do2 do2Var = this.f6420e;
            do2Var.f6839h.A0(do2Var.f6841j.a());
            pt2.b(z2VarA.f22383a, th, "BannerAdLoader.onFailure");
            this.f6416a.j();
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f6417b) == null) {
                ty2 ty2Var = this.f6420e.f6840i;
                ey2 ey2Var = this.f6418c;
                ey2Var.w(z2VarA);
                ey2Var.E0(th);
                ey2Var.C0(false);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.c(z2VarA);
                ey2 ey2Var2 = this.f6418c;
                ey2Var2.E0(th);
                ey2Var2.C0(false);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        qy2 qy2Var;
        jx0 jx0Var = (jx0) obj;
        synchronized (this.f6420e) {
            this.f6420e.f6843l = null;
            this.f6420e.f6837f.removeAllViews();
            if (jx0Var.i() != null) {
                ViewParent parent = jx0Var.i().getParent();
                if (parent instanceof ViewGroup) {
                    qg0.g("Banner view provided from " + (jx0Var.c() != null ? jx0Var.c().q() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(jx0Var.i());
                }
            }
            fs fsVar = ns.U7;
            if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                q81 q81VarE = jx0Var.e();
                q81VarE.a(this.f6420e.f6835d);
                q81VarE.c(this.f6420e.f6836e);
            }
            this.f6420e.f6837f.addView(jx0Var.i());
            this.f6416a.b(jx0Var);
            if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                do2 do2Var = this.f6420e;
                Executor executor = do2Var.f6833b;
                final va2 va2Var = do2Var.f6835d;
                va2Var.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bo2
                    @Override // java.lang.Runnable
                    public final void run() {
                        va2Var.B();
                    }
                });
            }
            this.f6420e.f6839h.A0(jx0Var.h());
            if (!((Boolean) bu.f6041c.e()).booleanValue() || (qy2Var = this.f6417b) == null) {
                ty2 ty2Var = this.f6420e.f6840i;
                ey2 ey2Var = this.f6418c;
                ey2Var.D0(jx0Var.g().f10323b);
                ey2Var.h(jx0Var.c().q());
                ey2Var.C0(true);
                ty2Var.b(ey2Var.u());
            } else {
                qy2Var.f(jx0Var.g().f10323b);
                qy2Var.e(jx0Var.c().q());
                ey2 ey2Var2 = this.f6418c;
                ey2Var2.C0(true);
                qy2Var.a(ey2Var2);
                qy2Var.g();
            }
        }
    }
}
