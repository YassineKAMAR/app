package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class sq0 implements fo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f14786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f14787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h2.w4 f14789d;

    /* synthetic */ sq0(zp0 zp0Var, rq0 rq0Var) {
        this.f14786a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.fo2
    public final /* synthetic */ fo2 a(h2.w4 w4Var) {
        w4Var.getClass();
        this.f14789d = w4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fo2
    public final /* synthetic */ fo2 b(Context context) {
        context.getClass();
        this.f14787b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fo2
    public final /* synthetic */ fo2 c(String str) {
        str.getClass();
        this.f14788c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fo2
    public final go2 p() {
        r84.c(this.f14787b, Context.class);
        r84.c(this.f14788c, String.class);
        r84.c(this.f14789d, h2.w4.class);
        return new uq0(this.f14786a, this.f14787b, this.f14788c, this.f14789d, null);
    }
}
