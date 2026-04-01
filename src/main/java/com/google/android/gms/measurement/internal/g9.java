package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class g9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f20039b;

    g9(v8 v8Var, lb lbVar) {
        this.f20039b = v8Var;
        this.f20038a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        p3.i iVar = this.f20039b.f20564d;
        if (iVar == null) {
            this.f20039b.t().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            a3.o.j(this.f20038a);
            iVar.N2(this.f20038a);
            this.f20039b.n().J();
            this.f20039b.T(iVar, null, this.f20038a);
            this.f20039b.g0();
        } catch (RemoteException e8) {
            this.f20039b.t().G().b("Failed to send app launch to the service", e8);
        }
    }
}
