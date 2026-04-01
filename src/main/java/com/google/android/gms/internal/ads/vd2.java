package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class vd2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f16117a;

    vd2(lg3 lg3Var) {
        this.f16117a = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f16117a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.ud2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wd2.b();
            }
        });
    }
}
