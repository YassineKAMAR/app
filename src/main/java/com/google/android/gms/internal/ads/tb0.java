package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends jk implements vb0 {
    tb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void F(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void g2(ob0 ob0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, ob0Var);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void n() {
        H0(4, k0());
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void o() {
        H0(6, k0());
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void r() {
        H0(1, k0());
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void s() {
        H0(8, k0());
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void t() {
        H0(2, k0());
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final void u() {
        H0(3, k0());
    }
}
