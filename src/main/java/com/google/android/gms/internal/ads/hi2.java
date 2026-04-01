package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8756a;

    hi2(pp2 pp2Var) {
        this.f8756a = pp2Var != null;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.h(this.f8756a ? new ni2() { // from class: com.google.android.gms.internal.ads.gi2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
