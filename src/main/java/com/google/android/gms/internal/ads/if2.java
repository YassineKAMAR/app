package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class if2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f9174a;

    public if2(lg3 lg3Var) {
        this.f9174a = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f9174a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.hf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new jf2(g2.t.u().b(), g2.t.u().m());
            }
        });
    }
}
