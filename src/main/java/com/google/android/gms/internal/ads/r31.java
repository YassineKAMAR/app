package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r31 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p31 f13879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13880b;

    public r31(p31 p31Var, w84 w84Var) {
        this.f13879a = p31Var;
        this.f13880b = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = this.f13879a.a(((io0) this.f13880b).a());
        r84.b(contextA);
        return contextA;
    }
}
