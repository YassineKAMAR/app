package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class vf2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ft1 f16149b;

    vf2(lg3 lg3Var, ft1 ft1Var) {
        this.f16148a = lg3Var;
        this.f16149b = ft1Var;
    }

    final /* synthetic */ wf2 a() {
        ft1 ft1Var = this.f16149b;
        String strC = ft1Var.c();
        boolean zQ = ft1Var.q();
        boolean zL = g2.t.u().l();
        ft1 ft1Var2 = this.f16149b;
        return new wf2(strC, zQ, zL, ft1Var2.o(), ft1Var2.r());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f16148a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.uf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15644a.a();
            }
        });
    }
}
