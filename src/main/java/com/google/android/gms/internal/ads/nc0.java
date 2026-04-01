package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends jk implements pc0 {
    nc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void a(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(3, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void g(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void q() {
        H0(1, k0());
    }
}
