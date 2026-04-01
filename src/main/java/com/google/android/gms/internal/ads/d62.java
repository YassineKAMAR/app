package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d62 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ wr2 f6597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e62 f6598b;

    d62(e62 e62Var, wr2 wr2Var) {
        this.f6598b = e62Var;
        this.f6597a = wr2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        synchronized (this.f6598b) {
            this.f6598b.f7147h.b(th, this.f6597a);
            if (this.f6598b.f7147h.e()) {
                e62 e62Var = this.f6598b;
                e62Var.e(e62Var.f7147h.a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void b(Object obj) {
        synchronized (this.f6598b) {
            this.f6598b.f7147h.c(obj, this.f6597a);
            if (this.f6598b.f7147h.e()) {
                e62 e62Var = this.f6598b;
                e62Var.e(e62Var.f7147h.a());
            }
        }
    }
}
