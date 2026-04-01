package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class a01 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vf3 f4939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c01 f4940b;

    a01(c01 c01Var, vf3 vf3Var) {
        this.f4940b = c01Var;
        this.f4939a = vf3Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        this.f4939a.a(th);
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16984a.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        c01.b(this.f4940b, ((vz0) obj).f16535a, this.f4939a);
    }
}
