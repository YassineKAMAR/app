package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class il2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final lg3 f9276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f9277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final xr f9278c;

    public il2(xr xrVar, lg3 lg3Var, List list) {
        this.f9278c = xrVar;
        this.f9276a = lg3Var;
        this.f9277b = list;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f9276a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.hl2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new jl2(this.f8818a.f9277b);
            }
        });
    }
}
