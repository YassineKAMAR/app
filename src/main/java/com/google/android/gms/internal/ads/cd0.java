package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends s2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ic0 f6309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f6310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ad0 f6311d = new ad0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z1.m f6312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r2.a f6313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.q f6314g;

    public cd0(Context context, String str) {
        this.f6308a = str;
        this.f6310c = context.getApplicationContext();
        this.f6309b = h2.v.a().n(context, str, new w40());
    }

    @Override // s2.a
    public final z1.w a() {
        h2.m2 m2VarL = null;
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                m2VarL = ic0Var.l();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        return z1.w.g(m2VarL);
    }

    @Override // s2.a
    public final void d(z1.m mVar) {
        this.f6312e = mVar;
        this.f6311d.O5(mVar);
    }

    @Override // s2.a
    public final void e(boolean z7) {
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.x3(z7);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // s2.a
    public final void f(r2.a aVar) {
        this.f6313f = aVar;
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.J0(new h2.d4(aVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // s2.a
    public final void g(z1.q qVar) {
        this.f6314g = qVar;
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.Q3(new h2.e4(qVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // s2.a
    public final void h(r2.e eVar) {
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.Q2(new xc0(eVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // s2.a
    public final void i(Activity activity, z1.r rVar) {
        this.f6311d.P5(rVar);
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.S2(this.f6311d);
                this.f6309b.j0(g3.b.k3(activity));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void j(h2.w2 w2Var, s2.b bVar) {
        try {
            ic0 ic0Var = this.f6309b;
            if (ic0Var != null) {
                ic0Var.U2(h2.v4.f22331a.a(this.f6310c, w2Var), new bd0(bVar, this));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
