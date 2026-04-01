package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class mx0 extends jx0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f11557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f11558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fm0 f11559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final xr2 f11560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final lz0 f11561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bh1 f11562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final jc1 f11563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c84 f11564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f11565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h2.w4 f11566r;

    mx0(mz0 mz0Var, Context context, xr2 xr2Var, View view, fm0 fm0Var, lz0 lz0Var, bh1 bh1Var, jc1 jc1Var, c84 c84Var, Executor executor) {
        super(mz0Var);
        this.f11557i = context;
        this.f11558j = view;
        this.f11559k = fm0Var;
        this.f11560l = xr2Var;
        this.f11561m = lz0Var;
        this.f11562n = bh1Var;
        this.f11563o = jc1Var;
        this.f11564p = c84Var;
        this.f11565q = executor;
    }

    public static /* synthetic */ void o(mx0 mx0Var) {
        bh1 bh1Var = mx0Var.f11562n;
        if (bh1Var.e() == null) {
            return;
        }
        try {
            bh1Var.e().f3((h2.s0) mx0Var.f11564p.k(), g3.b.k3(mx0Var.f11557i));
        } catch (RemoteException e8) {
            qg0.e("RemoteException when notifyAdLoad is called", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void b() {
        this.f11565q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lx0
            @Override // java.lang.Runnable
            public final void run() {
                mx0.o(this.f11081a);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final int h() {
        if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && this.f12292b.f16882i0) {
            if (!((Boolean) h2.y.c().b(ns.E7)).booleanValue()) {
                return 0;
            }
        }
        return this.f12291a.f10323b.f9793b.f5463c;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final View i() {
        return this.f11558j;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final h2.p2 j() {
        try {
            return this.f11561m.j();
        } catch (ys2 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final xr2 k() {
        h2.w4 w4Var = this.f11566r;
        if (w4Var != null) {
            return xs2.b(w4Var);
        }
        wr2 wr2Var = this.f12292b;
        if (wr2Var.f16874e0) {
            for (String str : wr2Var.f16865a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f11558j;
            return new xr2(view.getWidth(), view.getHeight(), false);
        }
        return (xr2) this.f12292b.f16903t.get(0);
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final xr2 l() {
        return this.f11560l;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final void m() {
        this.f11563o.j();
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final void n(ViewGroup viewGroup, h2.w4 w4Var) {
        fm0 fm0Var;
        if (viewGroup == null || (fm0Var = this.f11559k) == null) {
            return;
        }
        fm0Var.H0(vn0.c(w4Var));
        viewGroup.setMinimumHeight(w4Var.f22353c);
        viewGroup.setMinimumWidth(w4Var.f22356f);
        this.f11566r = w4Var;
    }
}
