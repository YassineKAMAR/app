package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class b30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m30 f5591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h20 f5592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f5593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f5594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ n30 f5595e;

    b30(n30 n30Var, m30 m30Var, h20 h20Var, ArrayList arrayList, long j8) {
        this.f5595e = n30Var;
        this.f5591a = m30Var;
        this.f5592b = h20Var;
        this.f5593c = arrayList;
        this.f5594d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.f5595e.f11649a) {
            if (this.f5591a.a() != -1 && this.f5591a.a() != 1) {
                this.f5591a.c();
                lg3 lg3Var = eh0.f7326e;
                final h20 h20Var = this.f5592b;
                lg3Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.z20
                    @Override // java.lang.Runnable
                    public final void run() {
                        h20Var.l();
                    }
                });
                String strValueOf = String.valueOf(h2.y.c().b(ns.f12048d));
                int iA = this.f5591a.a();
                int i8 = this.f5595e.f11657i;
                if (this.f5593c.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f5593c.get(0));
                }
                j2.v1.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i8 + str + " ms. Total latency(fullLoadTimeout) is " + (g2.t.b().a() - this.f5594d) + " ms at timeout. Rejecting.");
            }
        }
    }
}
