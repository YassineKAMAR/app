package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f17946d;

    public yy0(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f17943a = w84Var;
        this.f17944b = w84Var2;
        this.f17945c = w84Var3;
        this.f17946d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new ty0(((y11) this.f17943a).k(), ((xy0) this.f17944b).a(), ((wy0) this.f17945c).a(), (Executor) this.f17946d.k());
    }
}
