package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ct2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dt2 f6476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6477b;

    ct2(dt2 dt2Var, int i8) {
        this.f6476a = dt2Var;
        this.f6477b = i8;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i8 = this.f6477b;
        this.f6476a.b((String) obj, i8);
    }
}
