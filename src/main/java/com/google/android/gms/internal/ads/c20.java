package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class c20 extends a2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.v4 f6109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h2.s0 f6110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w40 f6112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a2.e f6113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.m f6114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z1.q f6115h;

    public c20(Context context, String str) {
        w40 w40Var = new w40();
        this.f6112e = w40Var;
        this.f6108a = context;
        this.f6111d = str;
        this.f6109b = h2.v4.f22331a;
        this.f6110c = h2.v.a().e(context, new h2.w4(), str, w40Var);
    }

    @Override // k2.a
    public final z1.w a() {
        h2.m2 m2VarS = null;
        try {
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                m2VarS = s0Var.s();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        return z1.w.g(m2VarS);
    }

    @Override // k2.a
    public final void c(z1.m mVar) {
        try {
            this.f6114g = mVar;
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.r4(new h2.z(mVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // k2.a
    public final void d(boolean z7) {
        try {
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.I4(z7);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // k2.a
    public final void e(z1.q qVar) {
        try {
            this.f6115h = qVar;
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.m4(new h2.e4(qVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // k2.a
    public final void f(Activity activity) {
        if (activity == null) {
            qg0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.s4(g3.b.k3(activity));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // a2.c
    public final void h(a2.e eVar) {
        try {
            this.f6113f = eVar;
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.I2(eVar != null ? new il(eVar) : null);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void i(h2.w2 w2Var, z1.e eVar) {
        try {
            h2.s0 s0Var = this.f6110c;
            if (s0Var != null) {
                s0Var.T3(this.f6109b.a(this.f6108a, w2Var), new h2.n4(eVar, this));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            eVar.b(new z1.n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
