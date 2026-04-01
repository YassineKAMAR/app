package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j72 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9512c;

    public j72(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f9510a = w84Var;
        this.f9511b = w84Var2;
        this.f9512c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new i72((Context) this.f9510a.k(), (Executor) this.f9511b.k(), (pm1) this.f9512c.k());
    }
}
