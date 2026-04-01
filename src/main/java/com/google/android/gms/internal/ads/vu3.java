package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vu3 implements on3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final on3 f16480b;

    public vu3(Context context) {
        xw3 xw3Var = new xw3();
        this.f16479a = context.getApplicationContext();
        this.f16480b = xw3Var;
    }

    @Override // com.google.android.gms.internal.ads.on3
    public final /* bridge */ /* synthetic */ po3 j() {
        return new wv3(this.f16479a, ((xw3) this.f16480b).j());
    }
}
