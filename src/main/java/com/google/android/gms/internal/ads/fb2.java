package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fb2 implements kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb2 f7710a;

    fb2(gb2 gb2Var) {
        this.f7710a = gb2Var;
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f7710a) {
            this.f7710a.f8284c = ((nz0) obj).c();
            ((nz0) obj).b();
        }
    }

    @Override // com.google.android.gms.internal.ads.kb2
    public final void j() {
        synchronized (this.f7710a) {
        }
    }
}
