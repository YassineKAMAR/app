package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 extends oc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2.d f16680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2.c f16681b;

    public wc0(r2.d dVar, r2.c cVar) {
        this.f16680a = dVar;
        this.f16681b = cVar;
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void a(h2.z2 z2Var) {
        if (this.f16680a != null) {
            this.f16680a.b(z2Var.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void g(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void q() {
        r2.d dVar = this.f16680a;
        if (dVar != null) {
            dVar.c(this.f16681b);
        }
    }
}
