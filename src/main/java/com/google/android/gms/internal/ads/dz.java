package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class dz implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ fm0 f7064a;

    dz(fm0 fm0Var) {
        this.f7064a = fm0Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fm0 fm0Var = this.f7064a;
        new j2.d1(fm0Var.getContext(), fm0Var.v().f16723a, (String) obj).b();
    }
}
