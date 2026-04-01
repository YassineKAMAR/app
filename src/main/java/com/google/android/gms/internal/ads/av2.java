package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class av2 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dv2 f5509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ev2 f5510b;

    av2(ev2 ev2Var, dv2 dv2Var) {
        this.f5510b = ev2Var;
        this.f5509a = dv2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        synchronized (this.f5510b) {
            this.f5510b.f7514e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f5510b) {
            this.f5510b.f7514e = null;
            this.f5510b.f7513d.addFirst(this.f5509a);
            ev2 ev2Var = this.f5510b;
            if (ev2Var.f7515f == 1) {
                ev2Var.h();
            }
        }
    }
}
