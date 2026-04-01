package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class by2 implements pb1, x41, tb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qy2 f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ey2 f6068b;

    by2(Context context, qy2 qy2Var) {
        this.f6067a = qy2Var;
        this.f6068b = dy2.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.x41
    public final void e(h2.z2 z2Var) {
        if (((Boolean) bu.f6042d.e()).booleanValue()) {
            qy2 qy2Var = this.f6067a;
            ey2 ey2Var = this.f6068b;
            ey2Var.e(z2Var.g().toString());
            ey2Var.C0(false);
            qy2Var.a(ey2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.tb1
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.tb1
    public final void k() {
        if (((Boolean) bu.f6042d.e()).booleanValue()) {
            qy2 qy2Var = this.f6067a;
            ey2 ey2Var = this.f6068b;
            ey2Var.C0(true);
            qy2Var.a(ey2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void u() {
        if (((Boolean) bu.f6042d.e()).booleanValue()) {
            this.f6068b.o();
        }
    }
}
