package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends pa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ey1 f7063a;

    protected dy1(ey1 ey1Var) {
        this.f7063a = ey1Var;
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void r0(j2.d0 d0Var) {
        this.f7063a.f7537a.e(d0Var.g());
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void u0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7063a.f7537a.d(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
