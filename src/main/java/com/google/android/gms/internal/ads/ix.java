package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ix extends jk implements kx {
    ix(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.kx
    public final void J3(sx sxVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, sxVar);
        H0(1, parcelK0);
    }
}
