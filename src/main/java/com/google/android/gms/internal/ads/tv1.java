package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class tv1 extends ta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uv1 f15353a;

    protected tv1(uv1 uv1Var) {
        this.f15353a = uv1Var;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(j2.d0 d0Var) {
        this.f15353a.f15894a.e(d0Var.g());
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void u0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f15353a.f15894a.d(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
