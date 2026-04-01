package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class j9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f20157b;

    j9(v8 v8Var, lb lbVar) {
        this.f20157b = v8Var;
        this.f20156a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3.i iVar = this.f20157b.f20564d;
        if (iVar == null) {
            this.f20157b.t().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            a3.o.j(this.f20156a);
            iVar.w1(this.f20156a);
            this.f20157b.g0();
        } catch (RemoteException e8) {
            this.f20157b.t().G().b("Failed to send measurementEnabled to the service", e8);
        }
    }
}
