package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i91 implements f71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9107a = ((Integer) h2.y.c().b(ns.f12068f1)).intValue();

    @Override // com.google.android.gms.internal.ads.f71
    public final synchronized void U(ks2 ks2Var) {
        if (((Boolean) h2.y.c().b(ns.f12077g1)).booleanValue()) {
            try {
                this.f9107a = ks2Var.f10323b.f9793b.f5463c;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int a() {
        return this.f9107a;
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
    }
}
