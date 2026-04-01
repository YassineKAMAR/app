package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 extends r2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ic0 f14042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ad0 f14044d = new ad0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2.a f14045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z1.q f14046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.m f14047g;

    public rc0(Context context, String str) {
        this.f14043c = context.getApplicationContext();
        this.f14041a = str;
        this.f14042b = h2.v.a().n(context, str, new w40());
    }

    @Override // r2.c
    public final z1.w a() {
        h2.m2 m2VarL = null;
        try {
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                m2VarL = ic0Var.l();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        return z1.w.g(m2VarL);
    }

    @Override // r2.c
    public final void d(z1.m mVar) {
        this.f14047g = mVar;
        this.f14044d.O5(mVar);
    }

    @Override // r2.c
    public final void e(boolean z7) {
        try {
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                ic0Var.x3(z7);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // r2.c
    public final void f(r2.a aVar) {
        try {
            this.f14045e = aVar;
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                ic0Var.J0(new h2.d4(aVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // r2.c
    public final void g(z1.q qVar) {
        try {
            this.f14046f = qVar;
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                ic0Var.Q3(new h2.e4(qVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // r2.c
    public final void h(r2.e eVar) {
        if (eVar != null) {
            try {
                ic0 ic0Var = this.f14042b;
                if (ic0Var != null) {
                    ic0Var.Q2(new xc0(eVar));
                }
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // r2.c
    public final void i(Activity activity, z1.r rVar) {
        this.f14044d.P5(rVar);
        if (activity == null) {
            qg0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                ic0Var.S2(this.f14044d);
                this.f14042b.j0(g3.b.k3(activity));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void j(h2.w2 w2Var, r2.d dVar) {
        try {
            ic0 ic0Var = this.f14042b;
            if (ic0Var != null) {
                ic0Var.x2(h2.v4.f22331a.a(this.f14043c, w2Var), new wc0(dVar, this));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
