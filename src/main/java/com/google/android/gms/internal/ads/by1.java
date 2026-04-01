package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class by1 extends ey1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ba0 f6066h;

    by1(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                this.f7540d.j0().t3(this.f6066h, new dy1(this));
            } catch (Throwable th) {
                g2.t.q().u(th, "RemoteAdsServiceSignalClientTask.onConnected");
                this.f7537a.e(th);
            }
        } catch (RemoteException unused) {
            this.f7537a.e(new kw1(1));
        }
    }

    public final synchronized x3.d c(ba0 ba0Var, long j8) {
        if (this.f7538b) {
            return zf3.o(this.f7537a, j8, TimeUnit.MILLISECONDS, this.f7543g);
        }
        this.f7538b = true;
        this.f6066h = ba0Var;
        a();
        x3.d dVarO = zf3.o(this.f7537a, j8, TimeUnit.MILLISECONDS, this.f7543g);
        dVarO.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ay1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5525a.b();
            }
        }, eh0.f7327f);
        return dVarO;
    }

    @Override // com.google.android.gms.internal.ads.ey1, a3.c.a
    public final void v0(int i8) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i8));
        qg0.b(str);
        this.f7537a.e(new kw1(1, str));
    }
}
