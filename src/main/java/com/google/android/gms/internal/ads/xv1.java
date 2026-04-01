package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends uv1 {
    xv1(Context context) {
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
                    this.f15899f.j0().m5(this.f15898e, new tv1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                } catch (Throwable th) {
                    g2.t.q().u(th, "RemoteSignalsClientTask.onConnected");
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                }
            }
        }
    }

    public final x3.d b(ya0 ya0Var) {
        synchronized (this.f15895b) {
            if (this.f15896c) {
                return this.f15894a;
            }
            this.f15896c = true;
            this.f15898e = ya0Var;
            this.f15899f.q();
            this.f15894a.c(new Runnable() { // from class: com.google.android.gms.internal.ads.wv1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16955a.a();
                }
            }, eh0.f7327f);
            return this.f15894a;
        }
    }
}
