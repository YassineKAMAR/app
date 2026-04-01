package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends jk implements lc0 {
    jc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void I1(fc0 fc0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, fc0Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void S(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(4, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void m() {
        H0(7, k0());
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void n() {
        H0(6, k0());
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void q() {
        H0(2, k0());
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void t() {
        H0(1, k0());
    }

    @Override // com.google.android.gms.internal.ads.lc0
    public final void w3(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(5, parcelK0);
    }
}
