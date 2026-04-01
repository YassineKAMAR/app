package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vd1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd1 f16115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16116b;

    public vd1(fd1 fd1Var, w84 w84Var) {
        this.f16115a = fd1Var;
        this.f16116b = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return this.f16115a.d((Executor) this.f16116b.k());
    }
}
