package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends ey1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fa0 f16975h;

    wx1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7541e = context;
        this.f7542f = g2.t.v().b();
        this.f7543g = scheduledExecutorService;
    }

    @Override // a3.c.a
    public final synchronized void H0(Bundle bundle) {
        if (this.f7539c) {
            return;
        }
        this.f7539c = true;
        try {
            try {
                this.f7540d.j0().H1(this.f16975h, new dy1(this));
            } catch (Throwable th) {
                g2.t.q().u(th, "RemoteAdsServiceProxyClientTask.onConnected");
                this.f7537a.e(th);
            }
        } catch (RemoteException unused) {
            this.f7537a.e(new kw1(1));
        }
    }

    public final synchronized x3.d c(fa0 fa0Var, long j8) {
        if (this.f7538b) {
            return zf3.o(this.f7537a, j8, TimeUnit.MILLISECONDS, this.f7543g);
        }
        this.f7538b = true;
        this.f16975h = fa0Var;
        a();
        x3.d dVarO = zf3.o(this.f7537a, j8, TimeUnit.MILLISECONDS, this.f7543g);
        dVarO.c(new Runnable() { // from class: com.google.android.gms.internal.ads.vx1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16517a.b();
            }
        }, eh0.f7327f);
        return dVarO;
    }
}
