package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class a9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f19802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f19803b;

    a9(v8 v8Var, lb lbVar) {
        this.f19803b = v8Var;
        this.f19802a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3.i iVar = this.f19803b.f20564d;
        if (iVar == null) {
            this.f19803b.t().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            a3.o.j(this.f19802a);
            iVar.S0(this.f19802a);
        } catch (RemoteException e8) {
            this.f19803b.t().G().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f19803b.g0();
    }
}
