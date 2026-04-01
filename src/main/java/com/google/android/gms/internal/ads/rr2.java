package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class rr2 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ tr2 f14289a;

    rr2(tr2 tr2Var) {
        this.f14289a = tr2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f14289a) {
            this.f14289a.f15254d = (jm1) obj;
            if (((Boolean) h2.y.c().b(ns.f12142n3)).booleanValue()) {
                ((jm1) obj).j().f11534a = this.f14289a.f15253c;
            }
            this.f14289a.f15254d.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f14289a) {
            this.f14289a.f15254d = null;
        }
    }
}
