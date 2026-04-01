package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes.dex */
public final class su1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14834a;

    public su1(w84 w84Var) {
        this.f14834a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo k() {
        ApplicationInfo applicationInfo = ((Context) this.f14834a.k()).getApplicationInfo();
        r84.b(applicationInfo);
        return applicationInfo;
    }
}
