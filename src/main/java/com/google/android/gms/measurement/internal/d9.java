package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class d9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f19912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f19913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f19914c;

    d9(v8 v8Var, AtomicReference atomicReference, lb lbVar) {
        this.f19914c = v8Var;
        this.f19912a = atomicReference;
        this.f19913b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f19912a) {
            try {
                try {
                } finally {
                    this.f19912a.notify();
                }
            } catch (RemoteException e8) {
                this.f19914c.t().G().b("Failed to get app instance id", e8);
                atomicReference = this.f19912a;
            }
            if (!this.f19914c.e().J().y()) {
                this.f19914c.t().M().a("Analytics storage consent denied; will not get app instance id");
                this.f19914c.o().R(null);
                this.f19914c.e().f20701g.b(null);
                this.f19912a.set(null);
                return;
            }
            p3.i iVar = this.f19914c.f20564d;
            if (iVar == null) {
                this.f19914c.t().G().a("Failed to get app instance id");
                return;
            }
            a3.o.j(this.f19913b);
            this.f19912a.set(iVar.Y1(this.f19913b));
            String str = (String) this.f19912a.get();
            if (str != null) {
                this.f19914c.o().R(str);
                this.f19914c.e().f20701g.b(str);
            }
            this.f19914c.g0();
            atomicReference = this.f19912a;
            atomicReference.notify();
        }
    }
}
