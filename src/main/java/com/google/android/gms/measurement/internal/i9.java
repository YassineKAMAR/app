package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class i9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f20124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f20125c;

    i9(v8 v8Var, lb lbVar, Bundle bundle) {
        this.f20125c = v8Var;
        this.f20123a = lbVar;
        this.f20124b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3.i iVar = this.f20125c.f20564d;
        if (iVar == null) {
            this.f20125c.t().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            a3.o.j(this.f20123a);
            iVar.v1(this.f20124b, this.f20123a);
        } catch (RemoteException e8) {
            this.f20125c.t().G().b("Failed to send default event parameters to service", e8);
        }
    }
}
