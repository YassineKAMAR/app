package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class m9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f20268b;

    m9(v8 v8Var, lb lbVar) {
        this.f20268b = v8Var;
        this.f20267a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3.i iVar = this.f20268b.f20564d;
        if (iVar == null) {
            this.f20268b.t().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            a3.o.j(this.f20267a);
            iVar.u1(this.f20267a);
            this.f20268b.g0();
        } catch (RemoteException e8) {
            this.f20268b.t().G().b("Failed to send consent settings to the service", e8);
        }
    }
}
