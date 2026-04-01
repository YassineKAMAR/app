package com.google.android.gms.internal.ads;

import a3.c;

/* JADX INFO: loaded from: classes.dex */
final class qn implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jh0 f13571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rn f13572b;

    qn(rn rnVar, jh0 jh0Var) {
        this.f13572b = rnVar;
        this.f13571a = jh0Var;
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        synchronized (this.f13572b.f14231d) {
            this.f13571a.e(new RuntimeException("Connection failed."));
        }
    }
}
