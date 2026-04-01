package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f42 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f7621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f7622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f7623c;

    public f42(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f7621a = w84Var;
        this.f7622b = w84Var2;
        this.f7623c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new d42((Context) this.f7621a.k(), (hy0) this.f7622b.k(), (Executor) this.f7623c.k());
    }
}
