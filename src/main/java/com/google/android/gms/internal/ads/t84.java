package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15011b;

    /* synthetic */ t84(int i8, int i9, s84 s84Var) {
        this.f15010a = f84.c(i8);
        this.f15011b = f84.c(i9);
    }

    public final t84 a(w84 w84Var) {
        this.f15011b.add(w84Var);
        return this;
    }

    public final t84 b(w84 w84Var) {
        this.f15010a.add(w84Var);
        return this;
    }

    public final u84 c() {
        return new u84(this.f15010a, this.f15011b, null);
    }
}
