package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class x20 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f17030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m30 f17031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ h20 f17032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ n30 f17033d;

    x20(n30 n30Var, long j8, m30 m30Var, h20 h20Var) {
        this.f17033d = n30Var;
        this.f17030a = j8;
        this.f17031b = m30Var;
        this.f17032c = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        j2.v1.k("onGmsg /jsLoaded. JsLoaded latency is " + (g2.t.b().a() - this.f17030a) + " ms.");
        synchronized (this.f17033d.f11649a) {
            if (this.f17031b.a() != -1 && this.f17031b.a() != 1) {
                this.f17033d.f11657i = 0;
                h20 h20Var = this.f17032c;
                h20Var.D("/log", pz.f13205g);
                h20Var.D("/result", pz.f13213o);
                this.f17031b.d(this.f17032c);
                this.f17033d.f11656h = this.f17031b;
                j2.v1.k("Successfully loaded JS Engine.");
            }
        }
    }
}
