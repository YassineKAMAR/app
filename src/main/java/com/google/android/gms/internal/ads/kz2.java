package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class kz2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f10390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10393d;

    public kz2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f10390a = w84Var;
        this.f10391b = w84Var2;
        this.f10392c = w84Var3;
        this.f10393d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f10390a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new jz2(contextA, lg3Var, (vg0) this.f10392c.k(), (ty2) this.f10393d.k());
    }
}
