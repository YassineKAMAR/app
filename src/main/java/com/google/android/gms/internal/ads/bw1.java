package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class bw1 extends uv1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6058h = 1;

    bw1(Context context) {
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
                    int i8 = this.f6058h;
                    if (i8 == 2) {
                        this.f15899f.j0().M3(this.f15898e, new tv1(this));
                    } else if (i8 == 3) {
                        this.f15899f.j0().u3(this.f6057g, new tv1(this));
                    } else {
                        this.f15894a.e(new kw1(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                } catch (Throwable th) {
                    g2.t.q().u(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    jh0Var = this.f15894a;
                    kw1Var = new kw1(1);
                    jh0Var.e(kw1Var);
                }
            }
        }
    }

    public final x3.d b(ya0 ya0Var) {
        synchronized (this.f15895b) {
            int i8 = this.f6058h;
            if (i8 != 1 && i8 != 2) {
                return zf3.g(new kw1(2));
            }
            if (this.f15896c) {
                return this.f15894a;
            }
            this.f6058h = 2;
            this.f15896c = true;
            this.f15898e = ya0Var;
            this.f15899f.q();
            this.f15894a.c(new Runnable() { // from class: com.google.android.gms.internal.ads.zv1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18500a.a();
                }
            }, eh0.f7327f);
            return this.f15894a;
        }
    }

    public final x3.d c(String str) {
        synchronized (this.f15895b) {
            int i8 = this.f6058h;
            if (i8 != 1 && i8 != 3) {
                return zf3.g(new kw1(2));
            }
            if (this.f15896c) {
                return this.f15894a;
            }
            this.f6058h = 3;
            this.f15896c = true;
            this.f6057g = str;
            this.f15899f.q();
            this.f15894a.c(new Runnable() { // from class: com.google.android.gms.internal.ads.aw1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5514a.a();
                }
            }, eh0.f7327f);
            return this.f15894a;
        }
    }

    @Override // com.google.android.gms.internal.ads.uv1, a3.c.b
    public final void k0(x2.b bVar) {
        qg0.b("Cannot connect to remote service, fallback to local instance.");
        this.f15894a.e(new kw1(1));
    }
}
