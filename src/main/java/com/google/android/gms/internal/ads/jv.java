package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class jv extends vv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f9814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f9815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f9816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9818e;

    public jv(Drawable drawable, Uri uri, double d8, int i8, int i9) {
        this.f9814a = drawable;
        this.f9815b = uri;
        this.f9816c = d8;
        this.f9817d = i8;
        this.f9818e = i9;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final double k() {
        return this.f9816c;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int l() {
        return this.f9818e;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Uri m() {
        return this.f9815b;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final g3.a n() {
        return g3.b.k3(this.f9814a);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int p() {
        return this.f9817d;
    }
}
