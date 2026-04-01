package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f82 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f7667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f7668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f7669c;

    public f82(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f7667a = w84Var;
        this.f7668b = w84Var2;
        this.f7669c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new e82((Context) this.f7667a.k(), (Executor) this.f7668b.k(), (pm1) this.f7669c.k());
    }
}
