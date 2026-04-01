package com.google.android.gms.measurement.internal;

import a3.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class s9 implements ServiceConnection, c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f20487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile o4 f20488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ v8 f20489c;

    protected s9(v8 v8Var) {
        this.f20489c = v8Var;
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        a3.o.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                a3.o.j(this.f20488b);
                this.f20489c.u().D(new t9(this, this.f20488b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f20488b = null;
                this.f20487a = false;
            }
        }
    }

    public final void a() {
        this.f20489c.i();
        Context contextJ = this.f20489c.j();
        synchronized (this) {
            if (this.f20487a) {
                this.f20489c.t().K().a("Connection attempt already in progress");
                return;
            }
            if (this.f20488b != null && (this.f20488b.d() || this.f20488b.g())) {
                this.f20489c.t().K().a("Already awaiting connection attempt");
                return;
            }
            this.f20488b = new o4(contextJ, Looper.getMainLooper(), this, this);
            this.f20489c.t().K().a("Connecting to remote service");
            this.f20487a = true;
            a3.o.j(this.f20488b);
            this.f20488b.q();
        }
    }

    public final void b(Intent intent) {
        this.f20489c.i();
        Context contextJ = this.f20489c.j();
        d3.b bVarB = d3.b.b();
        synchronized (this) {
            if (this.f20487a) {
                this.f20489c.t().K().a("Connection attempt already in progress");
                return;
            }
            this.f20489c.t().K().a("Using local app measurement service");
            this.f20487a = true;
            bVarB.a(contextJ, intent, this.f20489c.f20563c, 129);
        }
    }

    public final void d() {
        if (this.f20488b != null && (this.f20488b.g() || this.f20488b.d())) {
            this.f20488b.f();
        }
        this.f20488b = null;
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        a3.o.e("MeasurementServiceConnection.onConnectionFailed");
        n4 n4VarE = this.f20489c.f20556a.E();
        if (n4VarE != null) {
            n4VarE.L().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f20487a = false;
            this.f20488b = null;
        }
        this.f20489c.u().D(new v9(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a3.o.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f20487a = false;
                this.f20489c.t().G().a("Service connected with null binder");
                return;
            }
            p3.i j4Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    j4Var = iInterfaceQueryLocalInterface instanceof p3.i ? (p3.i) iInterfaceQueryLocalInterface : new j4(iBinder);
                    this.f20489c.t().K().a("Bound to IMeasurementService interface");
                } else {
                    this.f20489c.t().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f20489c.t().G().a("Service connect failed to get IMeasurementService");
            }
            if (j4Var == null) {
                this.f20487a = false;
                try {
                    d3.b.b().c(this.f20489c.j(), this.f20489c.f20563c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f20489c.u().D(new r9(this, j4Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a3.o.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f20489c.t().F().a("Service disconnected");
        this.f20489c.u().D(new u9(this, componentName));
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        a3.o.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f20489c.t().F().a("Service connection suspended");
        this.f20489c.u().D(new w9(this));
    }
}
