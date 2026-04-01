package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 extends oc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2.b f5752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cd0 f5753b;

    public bd0(s2.b bVar, cd0 cd0Var) {
        this.f5752a = bVar;
        this.f5753b = cd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void a(h2.z2 z2Var) {
        s2.b bVar = this.f5752a;
        if (bVar != null) {
            bVar.b(z2Var.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void g(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void q() {
        cd0 cd0Var;
        s2.b bVar = this.f5752a;
        if (bVar == null || (cd0Var = this.f5753b) == null) {
            return;
        }
        bVar.c(cd0Var);
    }
}
