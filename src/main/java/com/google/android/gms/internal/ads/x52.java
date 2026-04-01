package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x52 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17051c;

    public x52(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f17049a = w84Var;
        this.f17050b = w84Var2;
        this.f17051c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new w52((Context) this.f17049a.k(), (ye1) this.f17050b.k(), (Executor) this.f17051c.k());
    }
}
