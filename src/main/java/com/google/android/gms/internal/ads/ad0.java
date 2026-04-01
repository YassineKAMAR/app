package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends kc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z1.m f5205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z1.r f5206b;

    @Override // com.google.android.gms.internal.ads.lc0
    public final void I1(fc0 fc0Var) {
        z1.r rVar = this.f5206b;
        if (rVar != null) {
            rVar.a(new sc0(fc0Var));
        }
    }

    public final void O5(z1.m mVar) {
        this.f5205a = mVar;
    }

    public final void P5(z1.r rVar) {
        this.f5206b = rVar;
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void S(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void m() {
        z1.m mVar = this.f5205a;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void n() {
        z1.m mVar = this.f5205a;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void q() {
        z1.m mVar = this.f5205a;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void t() {
        z1.m mVar = this.f5205a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void w3(h2.z2 z2Var) {
        z1.m mVar = this.f5205a;
        if (mVar != null) {
            mVar.c(z2Var.g());
        }
    }
}
