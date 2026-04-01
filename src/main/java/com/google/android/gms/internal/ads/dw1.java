package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class dw1 implements f71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final se0 f7034b;

    dw1(Context context, se0 se0Var) {
        this.f7033a = context;
        this.f7034b = se0Var;
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(ks2 ks2Var) {
        if (TextUtils.isEmpty(ks2Var.f10323b.f9793b.f5464d)) {
            return;
        }
        this.f7034b.u(this.f7033a, ks2Var.f10322a.f8947a.f15302d);
        this.f7034b.q(this.f7033a, ks2Var.f10323b.f9793b.f5464d);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
    }
}
