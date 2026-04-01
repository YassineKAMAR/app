package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15600a;

    ub2(Context context) {
        this.f15600a = context;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if (((Boolean) h2.y.c().b(ns.G2)).booleanValue()) {
            return zf3.h(new vb2(androidx.core.content.a.a(this.f15600a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zf3.h(null);
    }
}
