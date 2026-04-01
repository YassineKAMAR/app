package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class oy2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qy2 f12669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey2 f12670b;

    oy2(qy2 qy2Var, ey2 ey2Var) {
        this.f12669a = qy2Var;
        this.f12670b = ey2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        ey2 ey2Var = this.f12670b;
        ey2Var.E0(th);
        ey2Var.C0(false);
        this.f12669a.a(ey2Var);
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void b(Object obj) {
    }
}
