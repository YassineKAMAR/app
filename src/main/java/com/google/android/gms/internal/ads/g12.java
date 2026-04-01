package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class g12 extends d22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f8156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i2.s f8157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8159d;

    g12() {
    }

    @Override // com.google.android.gms.internal.ads.d22
    public final d22 a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f8156a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d22
    public final d22 b(i2.s sVar) {
        this.f8157b = sVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d22
    public final d22 c(String str) {
        this.f8158c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d22
    public final d22 d(String str) {
        this.f8159d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d22
    public final e22 e() {
        Activity activity = this.f8156a;
        if (activity != null) {
            return new i12(activity, this.f8157b, this.f8158c, this.f8159d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
