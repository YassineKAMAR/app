package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class mr2 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nr2 f11528a;

    mr2(nr2 nr2Var) {
        this.f11528a = nr2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f11528a) {
            this.f11528a.f12018i = (jm1) obj;
            if (((Boolean) h2.y.c().b(ns.f12142n3)).booleanValue()) {
                ((jm1) obj).j().f11534a = this.f11528a.f12013d;
            }
            this.f11528a.f12018i.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f11528a) {
            this.f11528a.f12018i = null;
        }
    }
}
