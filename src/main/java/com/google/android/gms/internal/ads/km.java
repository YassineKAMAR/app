package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class km extends b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final om f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lm f10158c = new lm();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    z1.m f10159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z1.q f10160e;

    public km(om omVar, String str) {
        this.f10156a = omVar;
        this.f10157b = str;
    }

    @Override // b2.a
    public final z1.w a() {
        h2.m2 m2VarN;
        try {
            m2VarN = this.f10156a.n();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            m2VarN = null;
        }
        return z1.w.g(m2VarN);
    }

    @Override // b2.a
    public final void d(z1.m mVar) {
        this.f10159d = mVar;
        this.f10158c.O5(mVar);
    }

    @Override // b2.a
    public final void e(boolean z7) {
        try {
            this.f10156a.w5(z7);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // b2.a
    public final void f(z1.q qVar) {
        this.f10160e = qVar;
        try {
            this.f10156a.w2(new h2.e4(qVar));
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // b2.a
    public final void g(Activity activity) {
        try {
            this.f10156a.Z2(g3.b.k3(activity), this.f10158c);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
