package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p42 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f12741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f12742d;

    public p42(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f12739a = w84Var;
        this.f12740b = w84Var2;
        this.f12741c = w84Var3;
        this.f12742d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new o42((Context) this.f12739a.k(), (Executor) this.f12740b.k(), (ce1) this.f12741c.k(), (vr2) this.f12742d.k());
    }
}
