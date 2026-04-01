package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class by0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rx0 f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6065b;

    public by0(rx0 rx0Var, w84 w84Var) {
        this.f6064a = rx0Var;
        this.f6065b = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setSingleton = Collections.singleton(new yb1((cz0) this.f6065b.k(), eh0.f7327f));
        r84.b(setSingleton);
        return setSingleton;
    }
}
