package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class hd0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x3.d f8724a;

    hd0(id0 id0Var, x3.d dVar) {
        this.f8724a = dVar;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        id0.f9141m.remove(this.f8724a);
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        id0.f9141m.remove(this.f8724a);
    }
}
