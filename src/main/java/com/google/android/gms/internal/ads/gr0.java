package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class gr0 implements or1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp0 f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n00 f8467c;

    /* synthetic */ gr0(zp0 zp0Var, fr0 fr0Var) {
        this.f8465a = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.or1
    public final /* synthetic */ or1 b(Context context) {
        context.getClass();
        this.f8466b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.or1
    public final /* synthetic */ or1 c(n00 n00Var) {
        n00Var.getClass();
        this.f8467c = n00Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.or1
    public final pr1 l() {
        r84.c(this.f8466b, Context.class);
        r84.c(this.f8467c, n00.class);
        return new jr0(this.f8465a, this.f8466b, this.f8467c, null);
    }
}
