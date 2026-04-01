package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class f5 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g5 f20008b;

    f5(g5 g5Var, String str) {
        this.f20008b = g5Var;
        this.f20007a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f20008b.f20028a.t().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.a1 a1VarV0 = com.google.android.gms.internal.measurement.d1.v0(iBinder);
            if (a1VarV0 == null) {
                this.f20008b.f20028a.t().L().a("Install Referrer Service implementation was not found");
            } else {
                this.f20008b.f20028a.t().K().a("Install Referrer Service connected");
                this.f20008b.f20028a.u().D(new h5(this, a1VarV0, this));
            }
        } catch (RuntimeException e8) {
            this.f20008b.f20028a.t().L().b("Exception occurred while calling Install Referrer API", e8);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20008b.f20028a.t().K().a("Install Referrer Service disconnected");
    }
}
