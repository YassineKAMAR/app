package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class z8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f20754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f20755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f20756d;

    z8(v8 v8Var, AtomicReference atomicReference, lb lbVar, Bundle bundle) {
        this.f20756d = v8Var;
        this.f20753a = atomicReference;
        this.f20754b = lbVar;
        this.f20755c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3.i iVar;
        synchronized (this.f20753a) {
            try {
                try {
                    iVar = this.f20756d.f20564d;
                } finally {
                    this.f20753a.notify();
                }
            } catch (RemoteException e8) {
                this.f20756d.t().G().b("Failed to get trigger URIs; remote exception", e8);
                atomicReference = this.f20753a;
            }
            if (iVar == null) {
                this.f20756d.t().G().a("Failed to get trigger URIs; not connected to service");
                return;
            }
            a3.o.j(this.f20754b);
            this.f20753a.set(iVar.T4(this.f20754b, this.f20755c));
            this.f20756d.g0();
            atomicReference = this.f20753a;
            atomicReference.notify();
        }
    }
}
