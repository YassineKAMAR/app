package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class rr0 implements zp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f14285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f14286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h2.w4 f14288d;

    /* synthetic */ rr0(zp0 zp0Var, qr0 qr0Var) {
        this.f14285a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.zp2
    public final /* synthetic */ zp2 a(h2.w4 w4Var) {
        w4Var.getClass();
        this.f14288d = w4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zp2
    public final /* synthetic */ zp2 b(Context context) {
        context.getClass();
        this.f14286b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zp2
    public final /* synthetic */ zp2 c(String str) {
        str.getClass();
        this.f14287c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zp2
    public final aq2 p() {
        r84.c(this.f14286b, Context.class);
        r84.c(this.f14287c, String.class);
        r84.c(this.f14288d, h2.w4.class);
        return new tr0(this.f14285a, this.f14286b, this.f14287c, this.f14288d, null);
    }
}
