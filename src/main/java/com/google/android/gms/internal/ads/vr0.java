package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class vr0 implements pr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f16425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f16426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16427c;

    /* synthetic */ vr0(zp0 zp0Var, ur0 ur0Var) {
        this.f16425a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    public final /* synthetic */ pr2 a(String str) {
        this.f16427c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    public final /* synthetic */ pr2 b(Context context) {
        context.getClass();
        this.f16426b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    public final qr2 l() {
        r84.c(this.f16426b, Context.class);
        return new xr0(this.f16425a, this.f16426b, this.f16427c, null);
    }
}
