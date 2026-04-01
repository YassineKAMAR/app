package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class j73 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k73 f9513a;

    /* synthetic */ j73(k73 k73Var, i73 i73Var) {
        this.f9513a = k73Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9513a.f9967b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f9513a.c().post(new g73(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9513a.f9967b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f9513a.c().post(new h73(this));
    }
}
