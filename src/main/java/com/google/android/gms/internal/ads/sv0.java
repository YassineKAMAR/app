package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class sv0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ tv0 f14836b;

    sv0(tv0 tv0Var, String str) {
        this.f14836b = tv0Var;
        this.f14835a = str;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        tv0 tv0Var = this.f14836b;
        tv0Var.f15343h.a(tv0Var.f15342g.d(tv0Var.f15340e, tv0Var.f15341f, false, this.f14835a, null, tv0Var.f15341f.f16871d));
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tv0 tv0Var = this.f14836b;
        String str = (String) obj;
        tv0Var.f15343h.a(tv0Var.f15342g.d(tv0Var.f15340e, tv0Var.f15341f, false, this.f14835a, str, tv0Var.f15341f.f16871d));
    }
}
