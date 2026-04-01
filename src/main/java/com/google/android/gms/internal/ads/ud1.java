package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15626a;

    public ud1(w84 w84Var) {
        this.f15626a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setSingleton = Collections.singleton(new yb1((ne1) this.f15626a.k(), eh0.f7327f));
        r84.b(setSingleton);
        return setSingleton;
    }
}
