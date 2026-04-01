package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class iq0 implements nm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f9318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9320c;

    /* synthetic */ iq0(zp0 zp0Var, gq0 gq0Var) {
        this.f9318a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    public final /* synthetic */ nm2 a(String str) {
        str.getClass();
        this.f9320c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    public final /* synthetic */ nm2 b(Context context) {
        context.getClass();
        this.f9319b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    public final om2 l() {
        r84.c(this.f9319b, Context.class);
        r84.c(this.f9320c, String.class);
        return new kq0(this.f9318a, this.f9319b, this.f9320c, null);
    }
}
