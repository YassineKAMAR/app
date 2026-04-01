package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kd1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd1 f10035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10036b;

    public kd1(fd1 fd1Var, w84 w84Var) {
        this.f10035a = fd1Var;
        this.f10036b = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setSingleton = Collections.singleton(new yb1((c31) this.f10036b.k(), eh0.f7327f));
        r84.b(setSingleton);
        return setSingleton;
    }
}
