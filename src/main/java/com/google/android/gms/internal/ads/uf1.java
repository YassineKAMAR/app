package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class uf1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15643b;

    public uf1(w84 w84Var, w84 w84Var2) {
        this.f15642a = w84Var;
        this.f15643b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new ac1((Context) this.f15642a.k(), new HashSet(), ((e01) this.f15643b).a());
    }
}
