package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qd1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd1 f13409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13410b;

    public qd1(fd1 fd1Var, w84 w84Var) {
        this.f13409a = fd1Var;
        this.f13410b = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setF = this.f13409a.f((c31) this.f13410b.k());
        r84.b(setF);
        return setF;
    }
}
