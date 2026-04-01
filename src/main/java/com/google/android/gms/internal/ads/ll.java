package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ll implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ml f10767a;

    ll(ml mlVar) {
        this.f10767a = mlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10767a.f11365c) {
            ml mlVar = this.f10767a;
            if (mlVar.f11366d && mlVar.f11367e) {
                mlVar.f11366d = false;
                qg0.b("App went background");
                Iterator it = this.f10767a.f11368f.iterator();
                while (it.hasNext()) {
                    try {
                        ((nl) it.next()).a(false);
                    } catch (Exception e8) {
                        qg0.e("", e8);
                    }
                }
            } else {
                qg0.b("App is still foreground");
            }
        }
    }
}
