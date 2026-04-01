package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends uv1 {
    public sv1(Context context) {
        this.f15899f = new x90(context, g2.t.v().b(), this, this);
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        jh0 jh0Var;
        kw1 kw1Var;
        synchronized (this.f15895b) {
            if (!this.f15897d) {
                this.f15897d = true;
                try {
                    this.f15899f.j0().N4(this.f15898e, new tv1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                } catch (Throwable th) {
                    g2.t.q().u(th, "RemoteAdRequestClientTask.onConnected");
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uv1, a3.c.b
    public final void k0(x2.b bVar) {
        qg0.b("Cannot connect to remote service, fallback to local instance.");
        this.f15894a.e(new kw1(1));
    }
}
