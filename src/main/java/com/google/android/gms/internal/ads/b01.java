package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class b01 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vf3 f5545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c01 f5546b;

    b01(c01 c01Var, vf3 vf3Var) {
        this.f5546b = c01Var;
        this.f5545a = vf3Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16984a.d();
            }
        });
        this.f5545a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16984a.d();
            }
        });
        this.f5545a.b((nz0) obj);
    }
}
