package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a42 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f5019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f5020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f5021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f5022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f5023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f5024f;

    public a42(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6) {
        this.f5019a = w84Var;
        this.f5020b = w84Var2;
        this.f5021c = w84Var3;
        this.f5022d = w84Var4;
        this.f5023e = w84Var5;
        this.f5024f = w84Var6;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z32 k() {
        return new z32((hy0) this.f5019a.k(), (Context) this.f5020b.k(), (Executor) this.f5021c.k(), (gn1) this.f5022d.k(), ((x31) this.f5023e).a(), (z73) this.f5024f.k());
    }
}
