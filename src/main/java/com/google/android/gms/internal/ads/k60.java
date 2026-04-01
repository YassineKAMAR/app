package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k60 extends jk implements m60 {
    k60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void a(h2.z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(3, parcelK0);
    }
}
