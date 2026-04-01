package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17469b;

    public xu1(w84 w84Var, w84 w84Var2) {
        this.f17468a = w84Var;
        this.f17469b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        try {
            return f3.e.a((Context) this.f17468a.k()).f(((su1) this.f17469b).k().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
