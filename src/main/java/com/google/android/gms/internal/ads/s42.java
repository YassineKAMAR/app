package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class s42 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t42 f14519a;

    s42(t42 t42Var) {
        this.f14519a = t42Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        h2.z2 z2VarA = this.f14519a.f14959a.d().a(th);
        this.f14519a.f14962d.A(z2VarA);
        pt2.b(z2VarA.f22383a, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* synthetic */ void b(Object obj) {
        ((jx0) obj).b();
    }
}
