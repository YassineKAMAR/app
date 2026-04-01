package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cj1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vi1 f6373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f6375c;

    public cj1(vi1 vi1Var, w84 w84Var, w84 w84Var2) {
        this.f6373a = vi1Var;
        this.f6374b = w84Var;
        this.f6375c = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new yb1(((fm1) this.f6374b).k(), (Executor) this.f6375c.k());
    }
}
