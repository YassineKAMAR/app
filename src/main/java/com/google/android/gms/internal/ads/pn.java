package com.google.android.gms.internal.ads;

import a3.c;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class pn implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f12948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jh0 f12949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ rn f12950c;

    pn(rn rnVar, hn hnVar, jh0 jh0Var) {
        this.f12950c = rnVar;
        this.f12948a = hnVar;
        this.f12949b = jh0Var;
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        synchronized (this.f12950c.f14231d) {
            rn rnVar = this.f12950c;
            if (rnVar.f14229b) {
                return;
            }
            rnVar.f14229b = true;
            final gn gnVar = this.f12950c.f14228a;
            if (gnVar == null) {
                return;
            }
            lg3 lg3Var = eh0.f7322a;
            final hn hnVar = this.f12948a;
            final jh0 jh0Var = this.f12949b;
            final x3.d dVarD = lg3Var.d(new Runnable() { // from class: com.google.android.gms.internal.ads.mn
                @Override // java.lang.Runnable
                public final void run() {
                    pn pnVar = this.f11416a;
                    gn gnVar2 = gnVar;
                    jh0 jh0Var2 = jh0Var;
                    try {
                        jn jnVarK0 = gnVar2.k0();
                        boolean zJ0 = gnVar2.j0();
                        hn hnVar2 = hnVar;
                        en enVarH5 = zJ0 ? jnVarK0.h5(hnVar2) : jnVarK0.y4(hnVar2);
                        if (!enVarH5.u()) {
                            jh0Var2.e(new RuntimeException("No entry contents."));
                            rn.e(pnVar.f12950c);
                            return;
                        }
                        on onVar = new on(pnVar, enVarH5.n(), 1);
                        int i8 = onVar.read();
                        if (i8 == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        onVar.unread(i8);
                        jh0Var2.d(tn.b(onVar, enVarH5.p(), enVarH5.w(), enVarH5.g(), enVarH5.v()));
                    } catch (RemoteException | IOException e8) {
                        qg0.e("Unable to obtain a cache service instance.", e8);
                        jh0Var2.e(e8);
                        rn.e(pnVar.f12950c);
                    }
                }
            });
            final jh0 jh0Var2 = this.f12949b;
            jh0Var2.c(new Runnable() { // from class: com.google.android.gms.internal.ads.nn
                @Override // java.lang.Runnable
                public final void run() {
                    if (jh0Var2.isCancelled()) {
                        dVarD.cancel(true);
                    }
                }
            }, eh0.f7327f);
        }
    }

    @Override // a3.c.a
    public final void v0(int i8) {
    }
}
