package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class xg2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17217c;

    public xg2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f17215a = w84Var;
        this.f17216b = w84Var2;
        this.f17217c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new wg2(((su1) this.f17215a).k(), (PackageInfo) this.f17216b.k(), ((io0) this.f17217c).a());
    }
}
