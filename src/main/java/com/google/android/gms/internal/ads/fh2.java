package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fh2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7762b;

    fh2(String str, String str2) {
        this.f7761a = str;
        this.f7762b = str2;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.h(new gh2(this.f7761a, this.f7762b));
    }
}
