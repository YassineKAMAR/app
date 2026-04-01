package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ny2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qy2 f12288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey2 f12289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f12290c;

    ny2(qy2 qy2Var, ey2 ey2Var, boolean z7) {
        this.f12288a = qy2Var;
        this.f12289b = ey2Var;
        this.f12290c = z7;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        ey2 ey2Var = this.f12289b;
        if (ey2Var.t()) {
            qy2 qy2Var = this.f12288a;
            ey2Var.E0(th);
            ey2Var.C0(false);
            qy2Var.a(ey2Var);
            if (this.f12290c) {
                this.f12288a.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void b(Object obj) {
        ey2 ey2Var = this.f12289b;
        ey2Var.C0(true);
        this.f12288a.a(ey2Var);
        if (this.f12290c) {
            this.f12288a.g();
        }
    }
}
